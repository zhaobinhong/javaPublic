package abstractclass;

/**
 * Created by bankeys-01 on 2016/10/19.
 */
public class Initail {
    public static void main(String[] args) {
        Telphone oldTel = new cellPhone();
        Telphone newTel = new SmartPhone();
        oldTel.call();
        oldTel.message();
        newTel.call();
        newTel.message();

        //通过接口引用使用
        IPlayGame ip1=new SmartPhone();
        IPlayGame ip2=new Psp();
        ip1.playGame();
        ip2.playGame();

        //另一种使用方法：匿名内部类
        IPlayGame ip3=new IPlayGame() {
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口");
            }
        };
        ip3.playGame();

        new IPlayGame(){
            @Override
            public void playGame() {
                System.out.println("使用匿名内部类的方式实现接口2");
            }
        }.playGame();

    }
}
