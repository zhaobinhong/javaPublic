package exception_demo;

/**
 * Created by bankeys-01 on 2016/10/24.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        TryCatchTest test = new TryCatchTest();
        int c = test.test();
        System.out.println(c);


    }

    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环异常");
            return -1;
        }finally{
            System.out.println("finally");
        }
    }

    public int test2(){
        return 0;
    }

}
