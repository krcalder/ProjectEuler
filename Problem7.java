import java.util.ArrayList;

public class Problem7 {

    public static boolean IsPrime(int num) {

	for(int i = 2; i <= Math.sqrt(num); i += 1) {
	    if(num % i == 0) {
		return false;
	    }
	}

	return true;

    }
    
    public static void main(String[] args) {

	ArrayList<Integer> l = new ArrayList<>();

	int count = 2;
	
	while(l.size() < 10001) {

	    if(IsPrime(count)) {
		l.add(count);
	    }

	    count += 1;
	    
	}

	System.out.println(l.get(l.size() - 1));

    }

}
