package inherit;


/**
 * Created by bankeys-01 on 2016/10/17.
 */
public class Dog extends Animal {
    //重写：如果子类继承父类的方法不满意，可以重写父类的方法，当调用的时候优先调用子类方法

    public void eat() {
        System.out.println("dog 吃东西");
    }


    public void show() {
        super.eat();

    }

    //重写toString
    @Override
    public String toString() {
        return "Dog [age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        //比较对象的类型
        if (getClass() != obj.getClass())
            return false;

        Dog other = (Dog) obj;
        if (age != other.age)
            return false;
        return true;

    }
}
