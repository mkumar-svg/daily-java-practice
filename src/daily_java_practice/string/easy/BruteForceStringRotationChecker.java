package daily_java_practice.string.easy;

public class BruteForceStringRotationChecker {
	public static boolean isRotation(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		
		for(int i = 0; i  < s.length(); i++) {
			String rotate = s.substring(i) + s.substring(0, i);
			if(rotate.equals(goal)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";

        System.out.println(isRotation(s, goal));
    }
}
