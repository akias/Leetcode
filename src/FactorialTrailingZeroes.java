
public class FactorialTrailingZeroes {
	/*
	 * Given an integer n, return the number of trailing zeroes in n!.
	 */
	//method 1
		public int trailingZeroes1(int n) {
	        int res = 0;
	        while(n >=1){
	        	res += n/5;
	        	n /= 5;
	        }
	        return res;
	    }
	//method 2
		public int trailingZeroes2(int n){
			return n == 0?0:n/5+trailingZeroes2(n/5);
		}
}
