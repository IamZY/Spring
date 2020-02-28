package com.ntuzy.item.mapper;

import com.ntuzy.item.pojo.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/26 10:22
 */
@Repository
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {
}
