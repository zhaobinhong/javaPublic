/**
 * Created by bankeys-01 on 2016/10/12.
 */
public class Dimensional {


    public static void main(String[] args) {
        String[][] names = {
                {
                        "tom",
                        "jack",
                        "mike"
                },
                {
                        "zhangsan",
                        "lisi",
                        "wangwu"
                }
        };

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
            System.out.println();
        }

/*
*   调用其他方法
*/

        System.out.println("*** 调用print方法 ***");

        Dimensional test = new Dimensional();
        Dimensional string = new Dimensional();
        test.print(11);
        System.out.println(string.printString());
    }


    //定义一个方法
    public void print(int a) {
        System.out.println(a);
    }

    public String printString() {
        String str = "printString Function";
        return str;
    }
}
