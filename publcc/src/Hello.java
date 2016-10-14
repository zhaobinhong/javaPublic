/**
 * Created by hp on 2016/10/10.
 */

import java.util.Arrays;


public class Hello {
    public static void main(String[] args) {

        System.out.println("miao");
        String[] arr = {"sports", "game", "movie"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        *   forEach 遍历数组
        */
System.out.println("\n*** 使用forEach遍历数组 ***\n");

        int[] scores = {89, 72, 64, 88, 97};
        Arrays.sort(scores);
        for (int score :
                scores) {
            System.out.println(score);
        }


    }
}
