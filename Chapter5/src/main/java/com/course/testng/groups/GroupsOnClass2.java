package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class GroupsOnClass2 {
    public void student1(){
        System.out.println("GroupsOnClass2中的student1");
    }

    public void student2(){
        System.out.println("GroupsOnClass2中的student2");
    }
}
