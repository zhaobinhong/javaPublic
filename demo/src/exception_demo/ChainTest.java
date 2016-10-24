package exception_demo;

/**
 * Created by bankeys-01 on 2016/10/24.
 */
public class ChainTest {
    public static void main(String[] args) {

        ChainTest ct = new ChainTest();
        try {
            ct.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws DrunkException {
        throw new DrunkException("喝车别开酒");
    }

    public void test2() {
        try {
            test1();
        } catch (DrunkException e) {
            RuntimeException newExe = new RuntimeException("司机一滴酒，亲人两行泪");
            newExe.initCause(e);
            throw newExe;
        }

    }
}
