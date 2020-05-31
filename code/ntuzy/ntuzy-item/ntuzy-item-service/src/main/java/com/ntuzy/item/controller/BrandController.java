package com.ntuzy.item.controller;

import com.ntuzy.common.pojo.PageResult;
import com.ntuzy.item.pojo.Brand;
import com.ntuzy.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/26 13:58
 */
@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    // key=&page=1&rows=5&sortBy=id&desc=false
    @RequestMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandsByPage(
            @RequestParam(value = "key",required = false)String key,
            @RequestParam(value = "page",defaultValue = "1")Integer page,
            @RequestParam(value = "rows",defaultValue = "5")Integer rows,
            @RequestParam(value = "sortBy",required = false)String sortBy,
            @RequestParam(value = "desc",required = false)boolean desc
    ) {

        PageResult<Brand> result = this.brandService.queryBrandsByPage(key,page,rows,sortBy,desc);

        if (result == null || CollectionUtils.isEmpty(result.getItems())) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(result);
    }


//    @PostMapping()
//    public ResponseEntity<Void> saveBand(Brand brand, @RequestParam("cids")List<Long> cids) {
//        this.brandService.saveBand(brand,cids);
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }

    @GetMapping("cid/{cid}")
    public ResponseEntity<List<Brand>> queryBrandsByCid(@PathVariable("cid")Long cid){
        List<Brand> brands = this.brandService.queryBrandsByCid(cid);
        if (CollectionUtils.isEmpty(brands)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(brands);
    }

}
