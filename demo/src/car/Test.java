package car;

/**
 * Created by bankeys-01 on 2016/10/19.
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cars[] car = {
                new PassengerCar("奥迪A6L", 500, 4),
                new PassengerCar("马自达6", 400, 4),
                new CarryCargo("松花江", 400, 4),
                new CarryCargo("依维柯", 800, 20),
                new CargoAndPassenger("皮卡雪6", 500, 4, 2),
                new CargoAndPassenger("TSL-6", 800, 3, 3)
        };

        System.out.println("你是否要租车：1是 0否");
        int p = input.nextInt();
        if (p == 1) {
            System.out.println("你可租车的类型和租金");
            System.out.println("序号" + "\t" + "汽车名称" + "\t" + " 租金" + "\t\t" + "容量");
            for (int i = 0; i < car.length; i++) {
                car[i].msg(i + 1);
            }
            System.out.println("请输入你要租车的数量");
            int carCount = input.nextInt();
            if (carCount <= 0) {
                System.out.println("输入数量不能小于0");

            }
            int[] carArray = new int[carCount];
            //记录选择的车
            for (int i = 0; i < carCount; i++) {
                System.out.println("请输入你要租用的车辆序列号");
                int carNum = input.nextInt();
                if (carNum > 0 && carNum <= (car.length + 1)) {
                    carArray[i] = carNum;
                } else {
                    System.out.println("没有该车,请重新输入");
                    System.out.println("请输入" + 1 + "至" + car.length + "之间的数");
                    carArray[i] = input.nextInt();
                }

            }

            //租用天数
            System.out.println("请输入要租用的天数");
            int day = input.nextInt();
            System.out.println("你的账单:");
            System.out.println("选择载车的有:");
            int r = 0;
            int h = 0;
            int sum = 0;
            for (int i = 0; i < carArray.length; i++) {
                String type = car[carArray[i] - 1].getType();//获取车类型
                if ("passenger".equals(type)) {
                    System.out.println(car[carArray[i] - 1].getName());
                    r += car[carArray[i] - 1].getPeopleTotal();
                } else if ("truck".equals(type)) {
                    System.out.println(car[carArray[i] - 1].getName());
                    h += car[carArray[i] - 1].getCargo();
                } else {
                    System.out.println(car[carArray[i] - 1].getName());
                    r += car[carArray[i] - 1].getPeopleTotal();
                    h += car[carArray[i] - 1].getCargo();

                }
                sum += car[carArray[i] - 1].getPrice() * day;
            }
            System.out.println("总载货量：" + h + "kg");
            System.out.println("总载人：" + r + "个");
            System.out.println("租车总价格：" + sum + "元");

        } else {
            System.out.println("欢迎再次租车!");
        }
    }
}
