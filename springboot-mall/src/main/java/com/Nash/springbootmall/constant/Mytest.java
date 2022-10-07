package com.Nash.springbootmall.constant;

public class Mytest {
    public static void main(String[] args) {
        ProductCategory category=ProductCategory.FOOD;
        String s=category.name();
        System.out.println(s);
        String s2="CAR";
        ProductCategory category2=ProductCategory.valueOf(s2);//查詢有沒有CAR的固定值
        System.out.println(s2);
    }

}
