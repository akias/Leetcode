
public class Test26RemoveDuplicatesFromSorterArray {
	public int removeDuplicates(int[] nums) {
	int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    for(int j:nums){
    	System.out.println(j);
    }
    return i;
	}
}
