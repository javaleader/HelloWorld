package com.test;

import java.util.Random;

/**
 * Created by david on 16/10/9.
 */
public class TestTwo {

    public void three(){
        int iRandomNum=new Random().nextInt(100)+1;
        System.out.println("随机数:"+iRandomNum);
    }
    public static void main(String[] args) {
        TestTwo two=new TestTwo();
        two.three();
    }
}
