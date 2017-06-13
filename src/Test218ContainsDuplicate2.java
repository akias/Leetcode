import java.util.HashSet;
import java.util.Set;

public class Test218ContainsDuplicate2 {
	/*
	 * 这里hastSet不可以存储相同的元素，所以先存储k个值
	 * 每当i增大1 就移除一个值，这样可以保持set里只有k个值
	 * 然后去比较这k个值里面是否有需要的满足条件的元素
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
                if(i > k){
                   set.remove(nums[i-k-1]) ;
                }
                if(!set.add(nums[i])){
                    return true;
                }
        }
        return false;
    }
}
