package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public  void  testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public  void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before 测试用例");
    }
    @AfterMethod
    public  void  afterMethod(){
        System.out.println("after 测试用例");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before 类");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after 类");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before 测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after 测试套件");
    }
}
