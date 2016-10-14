/**
 * Created by bankeys-01 on 2016/10/13.
 */


public class Telphone {

    //封装就是隐藏属性 通过方法来得到属性；

    //属性
    private float screen;
    private float cpu;
    private float mem;
    int var = 40;

    public void sendMessage(){
        System.out.println("\n this sendMessage \n");
    }

    public void setScreen(float s, float c, float m) {
        screen = s;
        cpu = c;
        mem = m;
    }

    public float[] getScreen() {
        float[] arr = {screen, cpu, mem};
        this.sendMessage();
        return arr;
    }



    //方法
    void phone() {
        int var = 30;
        System.out.println("var :" + var);
        System.out.println("screen:" + screen + " cpu:" + cpu + " mem:" + mem + " 打电话");
    }

    //内部类 Inner ，类Inner在类Telphone的内部

    public class Inner{
        //内部类的方法
        public void show(){
            System.out.println("这是一个成员内部类");
        }
    }

    public static void main(String[] args){

        //创建外部类对象
        Telphone Inner=new Telphone();
        //创建内部类对象
        Inner i=Inner.new Inner();
        //调用内部类方法
        i.show();
    }
}
