package codingbat;

public class countXX {
	int countXX(String str) {
		  int len = str.length();
		  int count = 0;
		  
		  for (int i=0; i<len-2; i++) {
		    if (str.substring(i,i+2)).equals("xx") {
		      count ++;
		    }
		  } return count;
		}
}
