package com.ntuzy.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author IamZY
 * @create 2020/2/20 16:23
 */
// 名字默认类型首字母小写
@Repository
public class BookDao {

    private int label = 1;

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

}
