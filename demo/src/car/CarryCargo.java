package car;

/**
 * Created by bankeys-01 on 2016/10/21.
 * 载货类
 */
public class CarryCargo extends Cars {


    public CarryCargo(String name, int price, int cargo) {
        this.setName(name);
        this.setPrice(price);
        this.setCargo(cargo);
        this.setType("truck");
    }

    /* 打印信息 */

    @Override
    public void msg(int i) {
        String m = i + "\t" + this.getName() + "\t" + this.getPrice() + "元/天" + "\t\t" + "载货" + getCargo() + "kg";
        System.out.println(m);
    }
}



