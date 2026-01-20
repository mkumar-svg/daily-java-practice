package daily_java_practice.string.easy;

public class IsomorphicStringChecker {
	public static boolean areIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] lastSeenS = new int[256];
		int[] lastSeenT = new int[256];
		
		for(int i = 0; i < s.length(); i++) {
			if(lastSeenS[s.charAt(i)] != lastSeenT[t.charAt(i)]) {
				return false;
			}
			
			lastSeenS[s.charAt(i)] = i + 1;
            lastSeenT[t.charAt(i)] = i + 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        if (areIsomorphic(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
