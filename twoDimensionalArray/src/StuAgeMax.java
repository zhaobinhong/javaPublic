/*
 *  Created by bankeys-01 on 2016/10/12.
 *
 *  功能：输出学生年龄最大值
 *
 */
public class StuAgeMax {
    public static void main(String[] args) {
        StuAgeMax max = new StuAgeMax();
        int maxAge = max.getMaxAge();
        System.out.println("最大年龄为" + maxAge);
    }

    public int getMaxAge() {
        int[] ages = {18, 23, 21, 19, 25, 29, 17};
        int maxAge = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (maxAge < ages[i]) {
                maxAge = ages[i];
            }
        }
        return maxAge;

    }
}
