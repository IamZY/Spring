package com.ntuzy.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ntuzy.common.pojo.PageResult;
import com.ntuzy.item.mapper.BrandMapper;
import com.ntuzy.item.pojo.Brand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/26 13:57
 */
@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    public PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, boolean desc) {
        // 初始化example对象
        Example example = new Example(Brand.class);
        Example.Criteria criteria = example.createCriteria();

        // 根据name模糊查询 或者根据首字母查询
        if (StringUtils.isNotBlank(key)) {
            criteria.andLike("name", "%" + key + "%").orEqualTo("letter", key);
        }
        // 添加分页条件
        PageHelper.startPage(page,rows);
        // 条件排序条件
        if (StringUtils.isNotBlank(sortBy)) {
            example.setOrderByClause(sortBy + " " + (desc ? "desc" : "asc"));
        }
        List<Brand> brands = this.brandMapper.selectByExample(example);

        PageInfo<Brand> pageInfo = new PageInfo<Brand>(brands);
        return new PageResult<Brand>(pageInfo.getTotal(),pageInfo.getList());
    }

    @Transactional
    public void saveBand(Brand brand, List<Long> cids) {

        boolean flag = this.brandMapper.insertSelective(brand) == 1;

        if (flag) {
            cids.forEach(cid->{
                this.brandMapper.insertCategoryAndBrand(cid,brand.getId());
            });
        } else {

        }


    }
}
