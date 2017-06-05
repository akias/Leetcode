
import java.util.HashMap;
import java.util.Iterator;

public class Test169MajorityElement {
	public int majorityElement(int[] nums) {
       int result = 0;
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i = 0;i<nums.length;i++){
    	   if(hm.containsKey(nums[i])){
    		   hm.put(nums[i], hm.get(nums[i])+1);
    	   }else{
    		   hm.put(nums[i], 1);
    	   }
       }
       Iterator<Integer> iterator = hm.keySet().iterator();
       int maxV = -1;
       while(iterator.hasNext()){
    	   int key = iterator.next();
    	   int value =hm.get(key);
    	   if(value > maxV){
    		   maxV = value;
    		   result = key;
    	   }
       }
       return result;
    }
	
	//超半数算法
	public int majorityElement2(int[] nums) {
        int ans = 0;
        int vote = 0;
        for(int n:nums){
            if(vote == 0){
                ans = n;
                vote = 1;
            }else{
                if(ans == n){
                    vote++;
                }else{
                    vote--;
                }
            }
        }
        return ans;
    }
}
