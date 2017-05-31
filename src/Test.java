
public class Test {
	public static void main(String args[]){
		Test122BestTimetoBuyandSellStock2 btbs = new Test122BestTimetoBuyandSellStock2();
		int[] prices = {1,2,4};
		System.out.println(btbs.maxProfit(prices));
		
		//シングルクォーテーションとダブルクォーテーション　matchesできます
		String tmpString = "wode\\nidetade";  
		System.out.println(tmpString);
		System.out.println(tmpString.matches(".*[\'\\\\]+.*"));
		System.out.println(tmpString.replaceAll("\\\\", "\\\\\\\\"));
        System.out.println(tmpString.matches(".*[\'\\\\]+.*"));
        
        //シングルバックスラッシュはmatchesできません、タブルバックスラッシュはmatchesできます
        String tmpString2 = "wode\nidetade";  
        System.out.println(tmpString2.matches(".*[\'\\\\]+.*"));
        
        String tmpString3 = "wode\\nided";
        System.out.println(tmpString3);
        System.out.println(tmpString3.replaceAll("\\\\", "\\\\\\\\"));
}
}