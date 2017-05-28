import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test15ThreeSum {
	List<List<Integer>> li = new ArrayList<List<Integer>>();
	public List<List<Integer>> threeSum(int[] nums){	
		if(nums.length < 3 || nums == null) return li;
		Arrays.sort(nums);
		for(int i = 0;i < nums.length - 2;i++){
			int low = i + 1;
			int high = nums.length -1;
			if(i > 0 && nums[i] == nums[i-1] ) continue;
			find(nums,low,high,nums[i]);
		}
		return li;
	}
	
	public void find(int nums[],int low,int high,int target){
		while(low < high){
			if(nums[low] + nums[high] + target == 0){
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(target);
				ans.add(nums[low]);
				ans.add(nums[high]);
				li.add(ans);
				while(low < high && nums[low] == nums[low+1]) low++ ;
				while(low < high && nums[high] == nums[high-1]) high--;
				low++;
				high--;
			}else if(nums[low] + nums[high] + target< 0){
				low++;
			}else{
				high--;
			}
		}
	}
}
