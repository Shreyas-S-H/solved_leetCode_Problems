class distribute_candies_to_people {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;

        while (candies > 0) {
            int give = Math.min(candies, index + 1);
            result[index % num_people] += give;
            candies -= give;
            index++;
        }

        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        distribute_candies_to_people obj = new distribute_candies_to_people();

        int candies = 7;
        int num_people = 3;

        int[] result = obj.distributeCandies(candies, num_people);

        // Print output
        System.out.println("Distribution of candies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Person " + (i + 1) + ": " + result[i]);
        }
    }
}