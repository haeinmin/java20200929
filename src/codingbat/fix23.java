package codingbat;

public class fix23 {
		
		public int[] fix23(int[] nums) {
			  
			  int[] fix23 = new int[3];
			  
			  if(nums[0]==2 && nums[1]==3) {
			    return fix23 = {2, 0, nums[2]};
			  } else if(nums[1]==2 && nums[2]==3) {
			    return fix23 = {nums[0], 2, 0};
			  } else {
			    return nums;
			  }
			}

	}

