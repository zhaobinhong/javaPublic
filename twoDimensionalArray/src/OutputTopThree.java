/**
 * Created by bankeys-01 on 2016/10/12.
 */

import java.util.Arrays;

public class OutputTopThree {

    public static void main(String[] args){
        int[] scores={
                89,-23,64,91,119,52,73
        };
        OutputTopThree topThree=new OutputTopThree();
        int[] y=topThree.topThree(scores);
        System.out.println(Arrays.toString(y));


    }
    public int[] topThree(int[] a){

        Arrays.sort(a);
        int num=0;
        for (int i=a.length-1;i>=0;i--){
            if (a[i]<0||a[i]>100){
                continue;
            }
            num++;
            if(num>3){
                break;
            }
            System.out.println(a[i]);

        }
        return a;
    }
}
