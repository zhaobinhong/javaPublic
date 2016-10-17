package inherit;

import kotlin.Suppress;

/**
 * Created by bankeys-01 on 2016/10/17.
 */
public class Initail {


    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 3;
        dog.name = "球球";
        System.out.println("my dog is " + dog.name + " ags is " + dog.age);
        dog.eat();
        dog.show();
    }

}

