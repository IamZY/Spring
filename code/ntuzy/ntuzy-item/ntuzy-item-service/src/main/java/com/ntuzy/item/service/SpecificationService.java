package com.ntuzy.item.service;

import com.ntuzy.item.mapper.SpecGroupMapper;
import com.ntuzy.item.mapper.SpecParamMapper;
import com.ntuzy.item.pojo.SpecGroup;
import com.ntuzy.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/28 14:13
 */
@Service
public class SpecificationService {

    @Autowired
    private SpecGroupMapper specGroupMapper;

    @Autowired
    private SpecParamMapper specParamMapper;


    public List<SpecGroup> queryGroupsByCid(Long cid) {
        SpecGroup specGroup = new SpecGroup();
        specGroup.setCid(cid);
        return this.specGroupMapper.select(specGroup);
    }

    public List<SpecParam> queryParams(Long gid) {
        SpecParam specParam = new SpecParam();
        specParam.setGroupId(gid);
        return this.specParamMapper.select(specParam);
    }
}
