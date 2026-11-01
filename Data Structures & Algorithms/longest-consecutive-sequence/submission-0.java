class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Saare numbers ko HashSet mein daal do
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Har number par check lagao ki kya yeh sequence ka START hai
        for (int num : numSet) {
            // Agar (num - 1) set mein nahi hai, iska matlab yeh sequence ka pehla number hai!
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Jab tak agla number milta jaye, streak badhate raho
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Check karo ki kya yeh sabse lambi streak hai?
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}