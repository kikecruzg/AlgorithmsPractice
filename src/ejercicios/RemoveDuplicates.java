package ejercicios;

public class RemoveDuplicates {
	
	
	public int removeDuplicates(int[] nums) {
		int k = 0;
		
		if(nums.length > 0) { k++;}
		
		for(int i = 0; i < nums.length; i++) {
			try {
				int num = nums[i];
				if(num == nums[i+1]) {
					System.out.println("Is equal");
				}else {
					k++;
					System.out.println("Is Different, k: " + k);
					nums[k-1] = nums[i+1];
				}
			}catch(ArrayIndexOutOfBoundsException e) {}
		}
		return k;
	}
}
