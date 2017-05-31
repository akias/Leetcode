
public class Test121BestTimetoBuyandSellStock {
	//此方法不可行。有三个问题
	//因为最开始没做给max做比较
	//之后把max的赋值移出循环后会导致2，4，1这样的数答案是3，但实际上只能是2
	public int maxProfit(int[] prices) {
		if(prices.length == 0){
            return 0;
        }
        int buy = prices[0];
        int difference = 0;
        int sell = 0;
        for(int i  = 1;i < prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
                System.out.println("buy" + buy);
            }else if(prices[i] > sell ){
            	sell = prices[i];
            	System.out.println("sell" +sell);
                System.out.println("different" + difference);
            }
            if(sell == 0){
            	difference = 0;
            }else{
            difference = sell - buy;
            }
        }
        return difference;
    }

	public int maxProfit2(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int max = 0;
		int sofarMin = prices[0];//把第一个数当作买入价
		for (int i = 0; i < prices.length; ++i) {
			//如果找到了更贵的价格，那么可以作为卖出价记录给最高利润
			if (prices[i] > sofarMin) {
				//max等于 现在的最高利润和之前的最高利润对比。
				//对于的必要性：7, 1, 5, 3, 6, 4。
				//这里最高利润是6-1，如果不加比较的话，4也会比买入价大也会进入这个if
				//所以必须添加一个比较，才能保证max一直是最大的
				max = Math.max(max, prices[i] - sofarMin);
			} else {
				//如果这个数字比买入价小，那么把该数字置入买入价
				sofarMin = prices[i];
			}
		}
		return max;
	}
}