
public class Test88MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = n + m -1;
        //这里的循环条件是到某一个数组被排完序，所以是用且
        //如果这里用或，就会出现数组超出范围的情况。
        //例如当i=0（nums1[i] = 5)，而j>0(nums2[j] = 3)的时候，循环继续
        //此时把nums1[0]的值付给nums1[k]，i--，下一个循环继续，到if条件判断的时候就超出范围了
        while(i >=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        //这里如果nums1数字排完序之后，只需要把nums2的数值放进nums1剩下的位置就好了
        //如果是nums2排完序，这里是不需要重新排序nums1的，因为本身就已经排好序了
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
