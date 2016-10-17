package innerclass;

/**
 * Created by bankeys-01 on 2016/10/17.
 */
public class Static {
    //外部类的静态变量 score
    private static int score = 84;

    public static class SInner {
        int score = 91;

        public void show() {
            System.out.println("访问外部变量score:" + Static.score);
            System.out.println("访问内部变量score:" + score);
        }
    }

    //测试静态内部类
    public static void main(String[] args) {
        SInner innerStaticClass = new SInner();
        innerStaticClass.show();
    }
}
