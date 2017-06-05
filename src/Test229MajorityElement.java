import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test229MajorityElement {
	public List<Integer> majorityElement(int[] nums) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	       for(int i = 0;i<nums.length;i++){
	    	   if(hm.containsKey(nums[i])){
	    		   hm.put(nums[i], hm.get(nums[i])+1);
	    	   }else{
	    		   hm.put(nums[i], 1);
	    	   }
	       }
	    List<Integer> result = new ArrayList<Integer>();
	    Iterator<Integer> it = hm.keySet().iterator();
	    while(it.hasNext()){
	    	int key = it.next();
	    	int value = hm.get(key);
	    	if(value > nums.length/3){
	    		result.add(key);
	    	}
	    }
        /*
         * 另一种遍历方法 
	    for(int n : hm.keySet()){
            if(hm.get(n) > nums.length / 3){
                hm.add(n);
                continue;
            }
        }
        */
        return result;
    }
	
	public List<Integer> majorityElement2(int[] nums){
		int ans1 = 0;
		int ans2 = 0;
		int vote1 = 0;
		int vote2 = 0;
		for(int i:nums){
			//如果是第一个候选
			if(ans1 == i){ 
				vote1++;
				//continue;
			}
			//如果是第二个候选
			else if(ans2 == i){
				vote2++;
				//continue;
			//如果两个候选都不是且
			}else if(vote1 == 0){
				ans1 = i;
				vote1++;
				//continue;
			}else if(vote2 == 0){
				ans2 = i;
				vote2 ++;
				//continue;
			}else{
				vote1 --;
				vote2 --;
			}
		}
		vote1 = 0;
		vote2 = 0;
		List<Integer> result = new ArrayList<Integer>();
		for(int i:nums){
			if(i == ans1){
				vote1 ++;
			}
			else if(i == ans2){
				vote2 ++;
			}
		}
		
		if(vote1 > nums.length/3) result.add(ans1);
		if(vote2 > nums.length/3) result.add(ans2);
		return result;
		}
}

