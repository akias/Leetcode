import java.util.HashSet;
import java.util.Set;

public class Test217ContainsDuplicate {
	//暴力解法 如果数组太长会导致时间超时
	public boolean containsDuplicate1(int[] nums) {
        for(int i =0; i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
	/*
	 * 可以用HashSet来做
	 * add()如果此 set 中尚未包含指定元素，则添加指定元素。
	 * 如果此Set没有包含满足(e==null ? e2==null : e.equals(e2)) 的e2时，
	 * 则将e2添加到Set中，否则不添加且返回false。由于底层使用HashMap的put方法将key = e，
	 * value=PRESENT构建成key-value键值对，当此e存在于HashMap的key中，
	 * 则value将会覆盖原有value，但是key保持不变，
	 * 所以如果将一个已经存在的e元素添加中HashSet中，
	 * 新添加的元素是不会保存到HashMap中，所以这就满足了HashSet中元素不会重复的特性。
	 */
	public boolean containsDuplicate2(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int i:nums){
			if(!set.add(i)){
				return true;
			}
		}
		return false;
	}
}
