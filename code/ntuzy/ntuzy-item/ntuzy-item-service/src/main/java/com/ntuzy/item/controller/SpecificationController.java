package com.ntuzy.item.controller;

import com.ntuzy.item.pojo.SpecGroup;
import com.ntuzy.item.pojo.SpecParam;
import com.ntuzy.item.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/28 14:14
 */
@Controller
@RequestMapping("spec")
public class SpecificationController {

    @Autowired
    private SpecificationService specificationService;

    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> queryGroupsByCid(@PathVariable("cid") Long cid) {
        List<SpecGroup> groups = this.specificationService.queryGroupsByCid(cid);
        if (CollectionUtils.isEmpty(groups)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(groups);
    }

    //http://api.ntuzy.com/api/item/spec/params?gid=2
    @GetMapping("params")
    public ResponseEntity<List<SpecParam>> queryParams(@RequestParam("gid") Long gid) {
        List<SpecParam> params = this.specificationService.queryParams(gid);
        if (CollectionUtils.isEmpty(params)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(params);
    }

//    @GetMapping("params/{gid}")
//    public ResponseEntity<List<SpecParam>> queryGroupsByCid2(@PathVariable("gid") Long gid) {
//        List<SpecParam> params = this.specificationService.queryParams(gid);
//        if (CollectionUtils.isEmpty(params)) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(params);
//    }


}
