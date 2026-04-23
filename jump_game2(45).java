class jump_game2 {

    public int jump(int[] nums) {
        int res = 0;
        int l = 0, r = 0;

        while (r < nums.length - 1) {
            int farthest = 0;

            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }

            l = r + 1;
            r = farthest;
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        jump_game2 sol = new jump_game2();

        int[] nums = { 2, 3, 1, 1, 4 }; // Example input
        int result = sol.jump(nums);

        System.out.println("Minimum jumps needed: " + result);
    }
}