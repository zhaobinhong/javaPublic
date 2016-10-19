package com.demo;

/**
 * Created by bankeys-01 on 2016/10/19.
 */
public class Test {
    public static void main(String[] args){
        //两个类必须有继承关系才能使用多态
        /*
        Person z=new Chinese();
        Person m=new American();
        */

        APerson z=new Chinese();
        APerson m=new American();
        z.say();
        m.say();
    }
}
