package problems.twosum;

/*
    2개의 합 구하기
    이중 for문 이용
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }

        return answer;
    }
}