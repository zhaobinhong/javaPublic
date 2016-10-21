package car;

/**
 * Created by bankeys-01 on 2016/10/21.
 * 载人类
 */
public class PassengerCar extends Cars {
    public PassengerCar(String name, int price, int peopleTotal) {
        this.setName(name);
        this.setPrice(price);
        this.setPeopleTotal(peopleTotal);
        this.setType("passenger");
    }

    public void msg(int i) {
        String m = i + "\t" + this.getName() + "\t" + this.getPrice() + "元/天" + "\t\t" + "载人" + this.getPeopleTotal() + "个";
        System.out.println(m);
    }
}
