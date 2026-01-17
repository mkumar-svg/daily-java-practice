package daily_java_practice.arrays.meduim;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArrayOptimal {
	public static ArrayList<Integer> findLeaders(int[] nums) {

        ArrayList<Integer> leaders = new ArrayList<>();

        if (nums.length == 0) {
            return leaders;
        }

        int maxFromRight = nums[nums.length - 1];
        leaders.add(maxFromRight);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }

        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {

        int[] nums = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> result = findLeaders(nums);

        System.out.print("Leaders in the array are: ");
        for (int leader : result) {
            System.out.print(leader + " ");
        }
        System.out.println();
    }
}
