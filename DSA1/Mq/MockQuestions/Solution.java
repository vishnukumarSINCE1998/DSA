package MockQuestions;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]){
        int nums[]={2,7,11,15};

        int target=9;

        System.out.println();
    }
        }
