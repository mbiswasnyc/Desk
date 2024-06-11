package MidTermPractice;

public class ArrayHighestValue {
    public static void main(String[] args) {
        int[] nums = {2, 45, 6, 76, 3, 21};
        int highestValue = nums[0];
        int indexNumber = 0;
        for(int i = 0; i< nums.length; i++){
            if(highestValue<nums[i]){
                highestValue = nums[i];
                indexNumber = i;
            }
        }
        System.out.println(indexNumber);
        System.out.println(highestValue);
    }
}
