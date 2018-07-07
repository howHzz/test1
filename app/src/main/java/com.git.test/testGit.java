package com.git.test;

import org.junit.Test;

public class testGit {

    private void sayHello(){

        System.out.print("hello world");


        System.out.print("你镇好");

        System.out.print("congratulation");

        System.out.print("what is your name");
    }

    @Test
    public void test(){
        sayHello();
    }
}
