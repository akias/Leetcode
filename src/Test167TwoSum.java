
public class Test167TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[low]+numbers[high] != target){
                if(numbers[low] + numbers[high] > target){
                    high--;
                }else{
                    low ++;
                }
            }else{
                return new int[] {low+1,high+1};
            }
        }
        return new int[] {};
    }
}
