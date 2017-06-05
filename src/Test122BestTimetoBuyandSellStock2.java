
public class Test122BestTimetoBuyandSellStock2 {
	//此方法不可行，1，2，3的形式无法得到正确答案。
	public int maxProfit(int[] prices) {
		int max = 0;
		int sum = 0;
		int buy = prices[0];
		if(prices.length <= 1){
			return sum;
		}
		if(prices.length == 2){
			if(prices[1] - prices[0] >= 0){
			    sum = prices[1] - prices[0];
			}else{
			return sum;
			}
		}
		for(int i = 1;i<prices.length-1;i++){
			System.out.println("第" +i +"次循环");
			if(prices[i] < buy){
				buy = prices[i];
				System.out.println("buy  "+ buy);
			}else if(prices[i] >= buy && prices[i] > prices[i+1]){
				max = prices[i] - buy;
				sum = sum + max;
				max = 0;
				buy = prices[i+1];
				System.out.println("sum  " + sum);
				System.out.println("buy  " + buy);
				System.out.println("max  " + max);			
			
			}
			
			System.out.println("####################");
			if(i == prices.length-2 && buy !=prices[i+1]){
				max = Math.max(max, prices[i] - buy);
				sum +=max;
			}
		}

		return sum;
	}
	//想的太复杂了
	 public int maxProfit2(int[] prices) {
	       int total = 0;
	    for (int i=0; i< prices.length-1; i++) {
	        if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
	    }
	    
	    return total;
	    }	
}
