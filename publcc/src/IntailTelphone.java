/**
 * Created by bankeys-01 on 2016/10/13.
 */

import java.util.Arrays;

//引入其他包
import music.Music;


public class IntailTelphone {
    public static void main(String[] args) {
        Telphone phone = new Telphone();
        Telphone phnoe2 = new Telphone();
        phone.phone();
//        phone.screen=5.5f;
//        phone.cpu=2.0f;
//        phone.mem=128.0f;

        phone.setScreen(5.5f, 1.1f, 4.4f);
        float[] arr = phone.getScreen();
        System.out.println(Arrays.toString(arr));
        phone.phone();

        Music muc = new Music();
        muc.sing();

        if (phone.equals(phnoe2))
            System.out.println("相等");
        else
            System.out.println("不相等");
    }
}
