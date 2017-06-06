import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		Test189RotateArray btbs = new Test189RotateArray();
		int[] prices = {1,3,1,5,4,3,2,7};
		List<Integer> re = new ArrayList<Integer>();
		btbs.rotate(prices, 4);
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