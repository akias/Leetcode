import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
	Test119PascalTriangle2 pt = new Test119PascalTriangle2();
	List<Integer> li = new ArrayList<Integer>();
	li = pt.getRow3(3);
	for(int i = 0;i<li.size();i++){
		System.out.println(li.get(i));
	}
	}
}
