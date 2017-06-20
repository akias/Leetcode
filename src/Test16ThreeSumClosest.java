import java.util.Arrays;

public class Test16ThreeSumClosest {
	/**
	 * 这里解决办法类似3Sum，先给数据排序
	 * 然后用头指针和尾指针作为两个标记指针
	 * 然后i迭代到倒数第二个数，这样就可以得到所有到要到值
	 * 每得到一个值，检测是否比目前到目标值更适合
	 * 如果适合则把现在得到的值置入目标值
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length-1];
		for(int i = 0;i < nums.length-2;i++){
		    int low = i + 1;
		    int high = nums.length-1;
			while(low < high){
			    int sum = nums[low] + nums[high] + nums[i];
			    if(sum > target){
			    	high--;
		    	}else{
		    		low ++;
		    	}
		    	if(Math.abs(sum - target) < Math.abs(result - target)){
		      		result = sum;
		    	}
		    }
        }
    return result;
    }
}
