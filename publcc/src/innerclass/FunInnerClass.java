package innerclass;

/**
 * Created by bankeys-01 on 2016/10/17.
 */
public class FunInnerClass {
    private String name = "jon";
    private static int score = 84;

    public void show() {
        class MInner {
            //定义方法内部类

            int score = 88;

            public int getScore() {
                return score + 10;
            }
        }

        MInner funClass = new MInner();
        int i = funClass.getScore();

        System.out.println("姓名：" + name + "\n加分后成绩：" + i);
    }

    public static void main(String[] args) {
        FunInnerClass show = new FunInnerClass();
        show.show();
    }

}
