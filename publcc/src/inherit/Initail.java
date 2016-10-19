package inherit;

import kotlin.Suppress;

/**
 * Created by bankeys-01 on 2016/10/17.
 */
public class Initail {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog();

        //重写方法前：equals同等于 用（==） 来 比较两个对象，所指向的内存地址是否一样

        //重写方法后：equals比较两个对象是否相等
        if (dog.equals(dog2))
            System.out.println("相等");
        else
            System.out.println("不等");
        dog.age = 3;
        dog.name = "球球";
        System.out.println("my dog is " + dog.name + " ags is " + dog.age);
        dog.eat();
        dog.show();

        //重写toString 输出dog对象

        System.out.println(dog);

    }

}

