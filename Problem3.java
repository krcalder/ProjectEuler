import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem3 {

    public static boolean isPrime(int num) {

	double square = Math.sqrt(num);

	/* Checks if the number has a square root */
       	//if(square == Math.floor(square)) { return false; }
	
	for(int i = 2; i < (int)(Math.ceil(square)); i++) {
	    if(num % i == 0) { return false; }
	}

	return true;
	
    }
    
    public static void main(String[] args) {

	ArrayList<Integer> l = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	int num = input.nextInt();

	try {
	    for(int i = 2; i < (int)Math.sqrt(num); i++) {
		if(num % i == 0 && isPrime(i)) {
		    l.add(i);
		}
	    }
	    int max = Collections.max(l);
	}
	catch (Exception e) {
	    System.out.println("There are no prime factors.");
	}

	System.out.println(Collections.max(l));
	
    }
    
}
