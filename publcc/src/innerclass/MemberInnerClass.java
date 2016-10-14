package innerclass;

/**
 * Created by bankeys-01 on 2016/10/14.
 */
public class MemberInnerClass {

    //外部私有属性
    private String names="zifuchuan";
    //外部成员属性
    int age=20;

    //内部inner类
    public class Inner{

        String name ="user";
        //内部类的方法
        public void show(){
            System.out.println("外部类中的name："+names);
            System.out.println("内部类中的name："+name);
            System.out.println("外部类中的name："+age);
        }
    }

    public static void main(String[] args){
        MemberInnerClass menber=new MemberInnerClass();
        Inner in=menber.new Inner();
        in.show();
    }

}
