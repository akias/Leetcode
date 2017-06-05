import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		Test229MajorityElement btbs = new Test229MajorityElement();
		int[] prices = {1,1,1};
		List<Integer> re = new ArrayList<Integer>();
		re = btbs.majorityElement2(prices);
		System.out.println(re);
		//シングルクォーテーションとダブルクォーテーション　matchesできます
		//String tmpString = "wode\\nidetade";  
		//System.out.println(tmpString);
		//String tmpString1 = tmpString;
		//System.out.println(tmpString.matches(".*[\'\\\\]+.*"));
		//System.out.println(tmpString1.replaceAll("\\\\", "\\\\\\\\"));
		
        //System.out.println(tmpString.matches(".*[\'\\\\]+.*"));
        
        //シングルバックスラッシュはmatchesできません、タブルバックスラッシュはmatchesできます
        //String tmpString2 = "wode\nidetade";  
        //System.out.println(tmpString2.matches(".*[\'\\\\]+.*"));
        
        //String tmpString3 = "wode\\nided";
        //System.out.println(tmpString3);
        //System.out.println(tmpString3.replaceAll("\\\\", "\\\\\\\\"));
}
}