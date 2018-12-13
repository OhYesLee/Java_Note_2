package com.java.packageName;

public class PackageName {

    // 데이터를 외부로부터 보호
    private String name;
    static int amount = 0;

    public PackageName(String name) {
        this.name = name;
    }

    public void plusNumber(int num) {

        amount += num;
        System.out.println("추가된 숫자 : "+ num);

    }

    public void getPackageInfo() {

        System.out.println("Package name : " + this.name);
        System.out.println("amount : " + amount);

    }

}