
public class Test {
	public static void main(String args[]){
	FirstMissingPositive fmp = new FirstMissingPositive();
	int[] nums = {1,2,0,-4,5,6,3,88};
	int i = fmp.firstMissingPositive(nums);
	System.out.print(i);
	}
}
