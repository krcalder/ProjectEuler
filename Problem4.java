public class Problem4 {

    public static boolean isFactorable(int n) {

	
	for(int i = 2; i <= (int)Math.sqrt(n); i++) {
	    if(n % i == 0) {
		String s = Integer.toString(i);
		String r = Integer.toString(n/i);
		if(s.length() == 3 && r.length() == 3) {
		    System.out.println(i);
		    return true;
		}
	    }
	}
	return false;

    }

    public static boolean isPalandrome(int n) {

	String s = Integer.toString(n);
	String s1 = "";

	for(int i = s.length() - 1; i >= 0; i--) {
	    s1 += s.charAt(i);
	}

	if(s.equals(s1)) { return true; }

	return false;

    }
    
    public static void main(String[] args) {
		
	for(int i = 10000; i <= 998001; i++) {
	    if(isPalandrome(i) && isFactorable(i)) {
		System.out.println(i);
	    }
	}

    }

}
