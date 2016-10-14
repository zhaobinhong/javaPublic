/**
 * Created by bankeys-01 on 2016/10/14.
 */
public class Static {
    //声明变量
    String name;
    String sex;
    //声明静态变量
    static int age;

    //构造方法
    public Static() {
        System.out.println("## 通过构造方法初始化变量 name ##");
        name = "小明";

    }

    //初始化模块

    {
        System.out.println("## 通过初始化块 初始化变量sex ##");
        sex = "boy";
    }


    //静态初始化块
    {
        System.out.println("## 通过静态初始化块 初始化变量 age ##");
        age = 14;
    }


    //定义静态变量
    static int scores = 100;

    //定义静态方法
    public static int sou(int e) {
        return e;
    }

    public void parent(){
        System.out.println("姓名："+name+"，性别："+sex+"，年龄："+age);
    }

    public static void main(String[] args) {

        int num = sou(scores);
        System.out.println(num);
        Static par=new Static();
        par.parent();
    }
}
