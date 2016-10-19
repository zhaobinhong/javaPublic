package polymorphic;

/**
 * Created by bankeys-01 on 2016/10/19.
 */

public class Initail {

    public static void main(String[] args) {

        //引用多态：
        // 对象的引用可以指向本类也可以指向子类这就是多态；
        Animal obj = new Animal();
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        //方法多态
        obj.eat();
        obj1.eat();
        obj2.eat();
        /*
            若父类没有子类方法则不能通过多态的方法来调用子类的方法
        */
        // obj1.dogDoor();//错误


        /* 多态类型转换： */
        Dog dog = new Dog();
        Animal animal=dog;//自动类型提升，向上类型转换


        Dog dog1=(Dog)animal;//强制类型转换（向下类型转换）

        if (animal instanceof Cat){
            Cat cat=(Cat)animal;//animal 指向不是Cat对象
        }else {
            System.out.println("无法进行类型转换");
        }


    }
}
