public class Problem6 {

    public static void main(String[] args) {

	int sumSquare = 0;
	int squareSum = 0;

	for(int i = 1; i <= 100; i += 1) {
	    sumSquare += (i * i);
	    squareSum += i;
	}

	squareSum = squareSum * squareSum;
	
	System.out.println(sumSquare);
	System.out.println(squareSum);
	System.out.println(sumSquare - squareSum);

    }

}
