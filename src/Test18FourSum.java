import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test18FourSum {
	/*
	 * 可以通过所有的testcase
	 * 但是leetcode会报时间超时问题
	 */
	List<List<Integer>> li = new ArrayList<List<Integer>>();
    public List<List<Integer>> fourSum1(int[] nums, int target) {
        if(nums.length < 4 || nums == null) return li;
        Arrays.sort(nums);
        for(int i = 0 ;i<nums.length-3;i++){
            if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target)break; 
            if(nums[i]+nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3]<target)continue;
            if(i > 0 && nums[i] == nums[i-1] ) continue;
            for(int j = i+1;j < nums.length-2;j++){
                if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)break; //second candidate too large
                if(nums[i]+nums[j]+nums[nums.length-1]+nums[nums.length-2]<target)continue; //second candidate too small
                if(j > i+1 && nums[j] == nums[j-1] ) continue;
                int low = j+1;
                int high = nums.length-1;
                find(nums,low,high,nums[i],nums[j],target);
            }
        }
        return li;
    }
    public void find(int nums[],int low,int high,int level1,int level2,int target){
		while(low < high){
			if(nums[low] + nums[high] + level2 + level1  == target){
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(level1);
				ans.add(level2);
				ans.add(nums[low]);
				ans.add(nums[high]);
				li.add(ans);
				while(low < high && nums[low] == nums[low+1]) low++ ;
				while(low < high && nums[high] == nums[high-1]) high--;
				low++;
				high--;
			}else if(nums[low] + nums[high] + level2 + level1 < target){
				low++;
			}else{
				high--;
			}
		}
	}
    /*
     * 和上面逻辑是一样的，不过循环在循环体内部没有用单独的方法
     */
	public List<List<Integer>> fourSum(int[] num, int target) {
	    ArrayList<List<Integer>> ans = new ArrayList<>();
	    if(num.length<4)return ans;
	    Arrays.sort(num);
	    for(int i=0; i<num.length-3; i++){
	        if(num[i]+num[i+1]+num[i+2]+num[i+3]>target)break; //first candidate too large, search finished
	        if(num[i]+num[num.length-1]+num[num.length-2]+num[num.length-3]<target)continue; //first candidate too small
	        if(i>0&&num[i]==num[i-1])continue; //prevents duplicate result in ans list
	        for(int j=i+1; j<num.length-2; j++){
	            if(num[i]+num[j]+num[j+1]+num[j+2]>target)break; //second candidate too large
	            if(num[i]+num[j]+num[num.length-1]+num[num.length-2]<target)continue; //second candidate too small
	            if(j>i+1&&num[j]==num[j-1])continue; //prevents duplicate results in ans list
	            int low=j+1, high=num.length-1;
	            while(low<high){
	                int sum=num[i]+num[j]+num[low]+num[high];
	                if(sum==target){
	                    ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
	                    while(low<high&&num[low]==num[low+1])low++; //skipping over duplicate on low
	                    while(low<high&&num[high]==num[high-1])high--; //skipping over duplicate on high
	                    low++; 
	                    high--;
	                }
	                //move window
	                else if(sum<target)low++; 
	                else high--;
	            }
	        }
	    }
	    return ans;
	}
}
