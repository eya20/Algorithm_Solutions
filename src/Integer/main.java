package Integer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
		PolindromeInteger pi = new PolindromeInteger();
		Power p = new Power();
		PrimeNumber pn = new PrimeNumber();
		
		//testing fizzbuzz program
		/*String [] result = fb.fizzBuzz(15);
		for (int i =0; i<result.length;i++) {
			System.out.println(result[i]);
		}*/
		
		// testing polindome program
		/*System.out.println(pi.Polindrome(-1221));*/
		
		//testing power porgram
		System.out.println(p.power(2, -2));
		
		//testing prime number 
		System.out.println(pn.primeNumber(17));

	}

}
