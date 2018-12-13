package com.java.main;

import com.java.packageName.*;

public class MainClass {
    
    public static void main(String[] args) {

        // 클래스를 폴더 형식으로 관리하는 패키지.

        PackageName firstPackage = new PackageName("1번째");
        PackageName secondPackage = new PackageName("2번째");

        firstPackage.plusNumber(23);

        secondPackage.plusNumber(54);

        // static으로 총 합인 데이터를 공유하는 것을 확인할 수 있다.
        firstPackage.getPackageInfo();
    
    }

}
