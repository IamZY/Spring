package com.ntuzy.item.bo;

import com.ntuzy.item.pojo.Spu;

/**
 * @Author IamZY
 * @create 2020/2/28 15:33
 */
public class SpuBo extends Spu {

    private String cname;
    private String bname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
