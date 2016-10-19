package abstractclass;

/**
 * Created by bankeys-01 on 2016/10/19.
 */
public class SmartPhone extends Telphone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("现代通过语音来打电话");

    }

    @Override
    public void message() {
        System.out.println("现代通过语音来打电话");
    }

    @Override
    public void playGame() {
        System.out.println("现代手机具有玩游戏功能");
    }
}
