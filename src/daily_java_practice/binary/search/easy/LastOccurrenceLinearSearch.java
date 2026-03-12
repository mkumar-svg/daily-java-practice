package daily_java_practice.binary.search.easy;

import java.util.Arrays;
import java.util.List;

public class LastOccurrenceLinearSearch {
	public static int findLastOccurrence(int n, int key, List<Integer> list) {

        for (int i = n - 1; i >= 0; i--) {
            if (list.get(i) == key) {
                return i; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {

        int n = 7;
        int key = 13;

        List<Integer> list = Arrays.asList(3, 4, 13, 13, 13, 20, 40);

        int ans = findLastOccurrence(n, key, list);

        System.out.println(ans);
    }
}
