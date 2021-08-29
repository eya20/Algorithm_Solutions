package Integer;

public class PrimeNumber {
	
	public boolean primeNumber(int n) {
		
		boolean verif = true;
		
		if (n == 1 ) {
			verif = true; 
		}else if(n > 0) {
			for(int i=2 ; i< n/2;i++) {
				if(n%i == 0) {
					verif = false;
				}
			}
		}else {
			verif = false;
		}
		return verif;
	}

}
