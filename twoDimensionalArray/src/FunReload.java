/**
 * Created by bankeys-01 on 2016/10/12.
 *
 * 方法的重载
 */

public class FunReload {
    public static void main(String[] args) {
        FunReload print = new FunReload();

        //获取其他类的方法
        StuAgeMax get=new StuAgeMax();
        System.out.println(get.getMaxAge());
    }




    public void print(){
        System.out.println("啥子事情也没发生。。");
    }

    public int print(int i){
        return i;
    }
}
