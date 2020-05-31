package com.ntuzy.spring5;

/**
 * @Author IamZY
 * @create 2020/5/31 10:16
 */
public class Book {
    private String bname;


    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                '}';
    }
}
