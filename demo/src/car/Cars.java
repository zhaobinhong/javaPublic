package car;

/**
 * Created by bankeys-01 on 2016/10/19.
 */
public abstract class Cars {
    private String name;//汽车名
    private int price;//价钱
    private int peopleTotal;//载人量
    private int cargo;//载货量

    private String type;

    public void msg(int i) {

    }

    public String[] getTypes() {
        String[] types = {"passenger", "truck", "Pickup"};
        return types;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    /* 获取汽车名 */

    public String getName() {
        return this.name;
    }

    /* 设置汽车名 */

    public void setName(String name) {
        this.name = name;
    }

    /* 获取价钱 */

    public int getPrice() {
        return this.price;
    }

    /* 设置价钱 */

    public void setPrice(int price) {
        this.price = price;
    }

    /* 获取载人量 */

    public int getPeopleTotal() {
        return this.peopleTotal;
    }

    /* 设置载人量 */

    public void setPeopleTotal(int peopleTotal) {
        this.peopleTotal = peopleTotal;
    }

    /* 获取载货量 */

    public int getCargo() {
        return this.cargo;
    }
    /* 设置载货量 */

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
