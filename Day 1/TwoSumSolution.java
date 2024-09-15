public class TwoSumSolution {

    public int[] twoSum() {
        int[] nums = {1, 2, 3, 4, 5, 6}; 
        int target = 7;
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if the sum of two numbers is equal to the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two numbers
                    return new int[] {i, j};
                }
            }
        }
        // Return null if no solution is found
        return null;
    }
    
    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        int[] result = solution.twoSum();
        
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
