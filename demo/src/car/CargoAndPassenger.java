package car;

/**
 * Created by bankeys-01 on 2016/10/19.
 * 载人、又载货  类
 */
public class CargoAndPassenger extends Cars {

    public CargoAndPassenger(String name, int price, int cargo, int peopleTotal) {
        this.setName(name);
        this.setPrice(price);
        this.setPeopleTotal(peopleTotal);
        this.setCargo(cargo);
        this.setType("Pickup");
    }
    /* 打印消息 */

    @Override
    public void msg(int i) {
        String m = i + "\t" + getName() + "\t" + getPrice() + "元/天" + "\t \t载人" + getPeopleTotal() + "个 \t\t 载货" + getCargo() + "kg";
        System.out.println(m);
    }
}
