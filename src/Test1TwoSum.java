
public class Test1TwoSum {
	public class Solution {
	    public int[] twoSum1(int[] nums, int target) {
	        int [] ret = {0,0};
	        for(int i = 0;i<nums.length;i++){
	                for(int j = i+1;j<nums.length;j++){
	                    int sum = 0;
	                    sum = nums[i]+nums[j];
	                    if(sum == target){
	                        ret[0] = i;
	                        ret[1] = j;
	                        return ret;
	                    }
	                }
	            }
	            return ret;
	     }
	}
//跟上一个方法类似，但是要注意可以直接返回这种形式。	
	 public int[] twoSum2(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums.length; j++) {
	                if(nums[i] + nums[j] == target &&
	                        i != j) {
	                    return new int[] {i, j};
	                }
	            }
	        }
	        return new int[] {};
	    }
}
