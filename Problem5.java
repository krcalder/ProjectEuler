public class Problem5 {

public static void main(String[] args) {

    int count = 0;

    boolean found = false;
    
    while(!found) {

	count += 1;
	
	for(int i = 1; i <= 20; i += 1) {
	    if(count % i != 0) {
		break;
	    }
	    if(i == 20) {
		System.out.println(count);
		found = true;
	    }
	}

    }

}

}
