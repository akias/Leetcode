
public class Test268MissingNumber {
	/*
	 * 因为这个数列一定是从0开始等差为1的数列，所以我们求出本来应该的等差数列之和
	 * 然后用和减去应该有的等差数列和即可
	 * 由于这里的等差为1 所以项数本来就应该是nums的长度+1，首项应该为0
	 * 所以首项加末项就是nums的长度
	 */
	public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i :nums){
            sum += i;
        }
        return nums.length*(nums.length+1)/2-sum;
    }
}
