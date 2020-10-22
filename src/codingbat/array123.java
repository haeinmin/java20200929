package codingbat;

import java.util.Arrays;

public class array123 {
	public boolean array123(int[] nums) {
		  
		  int len = nums.length;
		  boolean a = false;
		  
		  for(int i=0;i<len-3;i++) {
		    if (Arrays.copyOfRange(nums, i, i+2)={1,2,3}) {
		      a = true;
		    }
		  } return a;
		}
}
