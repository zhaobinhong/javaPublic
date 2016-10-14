/**
 * Created by bankeys-01 on 2016/10/12.
 */

import java.util.Arrays;
import java.util.Scanner;

public class AllAges {
    public static void main(String[] args) {
        System.out.println("** 请输入分数 **");
        Scanner input = new Scanner(System.in);
        int[] q = new int[5];

        for (int i = 0; i < q.length; i++) {
            q[i] = input.nextInt();
        }
        AllAges getAges = new AllAges();


        int[] nums=getAges.sor(q);
        System.out.println(Arrays.toString(nums));
        /*for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }*/
    }

    public int[] sor(int[] arr) {
        Arrays.sort(arr);

        return arr;
    }


}
