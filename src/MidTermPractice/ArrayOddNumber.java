package MidTermPractice;

public class ArrayOddNumber {
    public static void main(String[] args) {
        int[] nums = {2, 45, 61, 76, 3, 21};
        for (int i=0; i<nums.length; i++){
            if(nums[i]%2==1){
                System.out.println(nums[i]);
            }
        }
    }
}
