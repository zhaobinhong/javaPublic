package abstractclass;

/**
 * Created by bankeys-01 on 2016/10/19.
 */
public class cellPhone extends Telphone {
    @Override
    public void call() {
        System.out.println("以前通过键盘来打电话的");
    }

    @Override
    public void message() {
        System.out.println("以前通过键盘来发短信的");
    }
}
