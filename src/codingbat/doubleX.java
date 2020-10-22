package codingbat;

public class doubleX {
boolean doubleX(String str) {
		  int len = str.length();
		  
		  for (int i=0; i<len-1; i++) {
		    return str.substring(i,i+2).equals("xx");
		  }
		}

}
