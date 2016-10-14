import java.util.Arrays;

/**
 * Created by bankeys-01 on 2016/10/12.
 */
public class PrintArr {
    public static void main(String[] args) {
        PrintArr show=new PrintArr();
        int[] nums = show.getArr(10);
        System.out.println(Arrays.toString(nums));

    }

    public int[] getArr(int length){
        int[] nums=new int[length];
        for (int i=0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*100);
            System.out.println(nums[i]);
        }
        return nums;
    }
}
