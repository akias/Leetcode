
public class Test11ContainerWithMostWater {
	/**
	 * the general idea to find some max is to go through all 
	 * cases where max value can possibly occur and keep 
	 * updating the max value. The efficiency of the scan
	 * depends on the size of cases you plan to scan.
	 * To increase efficiency, 
	 * all we need to do is to find a smart way of scan to cut off the 
	 * useless cases and meanwhile 100% guarantee the max value can be 
	 * reached through the rest of cases.
	 * In this problem, the smart scan way
	 * is to set two pointers initialized at both ends of the array.
	 * Every time move the smaller value pointer to inner array. 
	 * Then after the two pointers meet, 
	 * all possible max cases have been scanned and the max situation 
	 * is 100% reached somewhere in the scan. Following is a brief prove of this.
	 * @author saika
	 *
	 */
	public class Solution {
	    public int maxArea(int[] height) {
	        int left = 0;
	        int right = height.length-1;
	        int result = 0;
	        while(left < right){
	            result = Math.max(result,Math.min(height[left],height[right])*(right-left));
	            if(height[left]<height[right]){
	                left ++;
	            }else{
	                right --;
	            }
	        }
	        return result;
	    }
	}
}
