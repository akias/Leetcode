
public class MoveZeroes {
	/*
	 * Given an array nums, 
	 * write a function to move all 0's 
	 * to the end of it while maintaining 
	 * the relative order of the non-zero elements.
	 * For example,
	 * given nums = [0, 1, 0, 3, 12],
	 * after calling your function,
	 * nums should be [1, 3, 12, 0, 0].
	 */
	
	//this is a method with O(n^2)
	public void moveZeroes1(int[] nums) {
        for(int i = nums.length-2;i>=0;i--){
        	if(nums[i] == 0){
        		for(int j=i;j<nums.length-1;j++){
        			nums[j]=nums[j+1];
        		}
        		nums[nums.length-1]=0;
        	}
        }
    }
	//this is a method with O(n)
	//先找到每一个不是0的元素，把不是0的元素都前移。例如cur=0，如果a[0]不等于0
	//那么把a[0]=a[0]，且游标cur+1；现在计数到1，所以如果下一个不为0的元素出现，插入a[1]的位置。
	//最后游标数到几证明有几个为0的数，所以最后在数组末尾插入这么多个0就可以了
	public void moveZeroes2(int[] nums) {
	       int cur = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != 0) {
	                nums[cur] = nums[i];
	                cur++;
	            }
	        }

	        //后面的元素全部补0
	        for (int i = cur; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	    }
}
