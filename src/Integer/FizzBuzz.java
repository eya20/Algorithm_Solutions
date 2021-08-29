package Integer;

public class FizzBuzz {

	
	  public String[] fizzBuzz(int n) {
			String[] res = new String[n];
			
			for(int i=1 ; i<=n; i++) {
				
				if((i%3 == 0) && (i%5 !=0) ) {
					res[i-1] = "Fizz";
					//System.out.println("fizz");
				}else if ( (i%5 == 0 ) && (i%3 !=0)) {
					
					res[i-1] = "Buzz";
					
				}else if ((i%3 ==0) && (i%5 == 0 )) {
					res[i-1] = "FizzBuzz";
					
				}else {
					res[i-1] = String.valueOf(i); 
				}
			}
			
			
			return res;
			  
		  }
}
