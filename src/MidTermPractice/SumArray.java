package MidTermPractice;

public class SumArray {
    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 7, 3, 2};
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }
}
