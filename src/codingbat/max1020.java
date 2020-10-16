package codingbat;

public class max1020 {
	public int max1020(int a, int b) {
		  int max;
		  int min;
		  
		  if (a>b) {
		    a = max;
		    b = min;
		  } else {
		    b = max;
		    a = min;
		  }
		  
		  if(max>=10 && max<=20) {
		    return max;
		  } else if (min>=10 && min<=20) {
		    return min;
		  } else {
		    return 0;
		  }
		}

}
