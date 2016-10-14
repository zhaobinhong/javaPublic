/**
 * Created by bankeys-01 on 2016/10/11.
 */

import java.util.Scanner;


public class OneFirst {
    public static void main(String[] args) {
//        String dog = "If you are a puppy, I would like to be your fleas and you together.";
//        System.out.println(dog);

        //强类型数据转换
        double height = 176.8;
        int height2 = (int) height;
        System.out.println(height);
        System.out.println(height2);

//常量：程序运行过程中不允许更改
        final String USER_NAME = "jon";
        final int USER_AGE = 12;
        System.out.println("userName = " + USER_NAME + ", userAge = " + USER_AGE);
        System.out.println(true && (2 < 5));

        for (int i = 0; i < 10; i++) {
            if (i % 3 != 0) {
                System.out.println(i);

                //break;  //结束循环
                //continue;  //结束本次循环，直接进入下局循环
            }
        }


        System.out.println("打印直角三角形");

        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

//输出数字位数


        int num = 999;
        int count = 0;
        if (num >= 0 && num <= 999999999) {
            while (num != 0) {
                count++;
                num /= 10;// ==> (int)(num/10)
            }
            System.out.println("它是个" + count + "位的数！");
        } else {
            System.out.println("输入有误！");
        }

//打印分数

        Scanner input = new Scanner(System.in);//创建Scanner对象
        System.out.print("请输入考试成绩：");

        /*
        *   print 输出信息后不会换行
        *   println 输出信息后会换行
        */


        int score = input.nextInt(); //获取用户输入的成绩并保存在变量中

        int scoreCount = 0;

        System.out.println("加分前成绩" + score);
        /*
        for (int t=score;t<60;t++){
            scoreCount++;
            score++;
        }
        */
        while (score < 60) {
            scoreCount++;
            score++;
        }

        System.out.println("加分后成绩" + score);
        System.out.println("加分次数" + scoreCount);




        /*
        *
        *   接收三个班级四个学生的成绩信息
        *   计算每个学员的平均成绩
        *
        */

        int classNum = 3;
        int stuNum = 4;
        double sum = 0;
        double avg = 0;
        Scanner input2 = new Scanner(System.in);
        for (int o = 1; o <= classNum; o++) {
            sum = 0;
            System.out.println("****请输入第" + o + "个班级的成绩****");
            for (int p = 1; p <= stuNum; p++) {
                System.out.print("请输入第" + p + "个学员的成绩：");
                int scoreNum = input2.nextInt();
                sum = sum + scoreNum;

            }
            avg = sum / stuNum;
            System.out.println("第" + o + "个班级的平均分为：" + avg);

        }


    }


}
