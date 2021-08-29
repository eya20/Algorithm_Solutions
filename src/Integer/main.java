package Integer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		PolindromeInteger pi = new PolindromeInteger();
		
		//testing fizzbuzz program
		String [] result = fb.fizzBuzz(15);
		for (int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		// testing polindome program
		System.out.println(pi.Polindrome(-1221));

	}

}
