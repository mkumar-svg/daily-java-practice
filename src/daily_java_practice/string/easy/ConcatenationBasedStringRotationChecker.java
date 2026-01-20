package daily_java_practice.string.easy;

public class ConcatenationBasedStringRotationChecker {
	public static boolean isRotation(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(isRotation("rotation", "tionrota"));
    }
}
