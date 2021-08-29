package Integer;

public class Power {
	
	public float power(float x,int n) {
		float s = 1;
		
		if(n == 0 ) {
			 s = 1;
		}else if (n > 0) {
			
			for(int i=1; i<=n;i++) {
				s *= x ;
			}
			
		}else {
			//s = 1/x;
			for(int i=n; i<0;i++) {
				s *= (1/x);
			}
		}
		
		return s;
		
	}

}
