package codingBat;

public class CodingBat {
    public static void main(String[] args) {


    }

    public int sum13 (int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                continue;
            }
            else if (nums == null) {
                return 0;
            }

            sum = sum + nums[i];

        }return sum;
    }

}
