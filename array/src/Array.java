/**
 * Created by bankeys-01 on 2016/10/11.
 */
public class Array {
    public static void main(String[] args) {
        int[] scores = {
                78, 98, 24, 55, 100, 32, 79, 99
        };

        int max = scores[0];//假定最大值为数组中第一个数
        int min = scores[0];//假设最小值为数组中第一个数
        double sum = 0;//累加值
        double avg = 0;//平均值
        int y=0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            y=scores.length;
            sum=sum+scores[i];
        }
        avg=sum/y;

        System.out.println("数组中最大的是"+max);
        System.out.println("数组中最小的是"+min);
        System.out.println("数组中平均值是"+avg);
        System.out.println("数组中总值是"+sum);
        System.out.println("数组中有"+y+"个数");


        System.out.println("输出数组中第二个成绩为：" + scores[1]);
    }
}
