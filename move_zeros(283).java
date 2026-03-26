import java.util.Arrays;

public class move_zeros {
    public void movezeros(int[] nums) {
        int insertPosision = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosision] = nums[i];
                insertPosision++;

            }

        }
        while (insertPosision < nums.length) {
            nums[insertPosision++] = 0;
        }
    }

    public static void main(String[] args) {
        move_zeros mz = new move_zeros();
        int[] nums = { 2, 0, 8, 4, 0, 13, 89, 0 };
        mz.movezeros(nums);
        System.out.println(Arrays.toString(nums));
    }

}
