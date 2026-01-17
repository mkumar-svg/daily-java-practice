package daily_java_practice.arrays.meduim;

import java.util.ArrayList;

public class LeadersInArrayBruteForce {
	public static ArrayList<Integer> findLeaders(int[] nums) {

        ArrayList<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                leaders.add(nums[i]);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 5, 3, 1, 2};

        ArrayList<Integer> result = findLeaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : result) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}
