package daily_java_practice.binary.search.easy;

import java.util.Arrays;
import java.util.List;

public class LastOccurrenceBinarySearch {
	public static int findLastOccurrence(List<Integer> list, int key) {
        int start = 0;
        int end = list.size() - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (list.get(mid) == key) {
                result = mid;       
                start = mid + 1;    
            } 
            else if (key < list.get(mid)) {
                end = mid - 1;      
            } 
            else {
                start = mid + 1;    
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int key = 13;
        List<Integer> numbers = Arrays.asList(3, 4, 13, 13, 13, 20, 40);

        int index = findLastOccurrence(numbers, key);

        System.out.println(index);
    }
}
