package Integer;

public class PolindromeInteger {
	
	
	 public String Polindrome(int n) {

		  String res ;
		  char ch[]=Integer.toString(n).toCharArray();
		   int j= ch.length-1;
		   boolean verif = true;
		  for(int i =0;i< ch.length-1;i++) {
			  if(ch[i] != ch[j]) {
				  verif = false;
			  }
			  j--;
		  }
		   
		  if (verif == true) {
			  res = "This number is polindome";
		  }else {
			  res = "This number is not polindrome";
		  }
		  
		  return res;
		  
	 }

}
