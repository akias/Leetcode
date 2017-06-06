import java.util.Arrays;

public class Test189RotateArray {
	/*
	 * 这个方法在leetcode测试中最后一个超级长的数组因为时间超限没有通过
	 */
	public void rotate(int[] nums, int k) {
        int temp = 0;
        int n = nums.length;
        for(int step = 0;step < k;step++){
            temp = nums[n-1];
            
            for(int j = n-1;j >0; j--){
                
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
        
        for(int a:nums){
        	System.out.print(a);
        }
    }
	
	/*
	 * public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)
	src:源数组；	srcPos:源数组要复制的起始位置；
	dest:目的数组；	destPos:目的数组放置的起始位置；	length:复制的长度。
	注意：src and dest都必须是同类型或者可以进行转换类型的数组．
	有趣的是这个函数可以实现自己到自己复制，比如：
	int[] fun ={0,1,2,3,4,5,6}; 
	System.arraycopy(fun,0,fun,3,3);
	则结果为：{0,1,2,0,1,2,6};
	 */
	
	public void rotate2(int[] nums, int k) {
        int n = nums.length;
        //把K放在n以内的范围
        k = k%n;
        int[] temp = Arrays.copyOfRange(nums, 0, n-k);
        System.arraycopy(nums, n-k, nums, 0, k);
        System.arraycopy(temp, 0, nums, k, n-k);
    }
}
