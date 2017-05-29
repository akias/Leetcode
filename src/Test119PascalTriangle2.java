import java.util.ArrayList;
import java.util.List;

public class Test119PascalTriangle2 {
	/*
	 * 这个方法不可行!!
	 */
	//这个方法不能用li.set(j,1);因为set必须是list里面有数字，然后去覆盖，而不能新建一个，不然会下标溢出边界
	//而如果把li.set(j,1);改成li.add(1);list里面的add方法不是覆盖，而是把这个位置置入新的数，然后依次往后移动
	//解决办法：如方法2和方法3，每加一层的时候便会给list增加一个数，所以在i执行+1的时候，执行li.add(1);
	//这样做还有一个好处是，执行j循环的时候不需要给首位的数赋值，只需要从j等于1到j等于i改变赋值即可
	public List<Integer> getRow1(int rowIndex) {
        List<Integer> li = new ArrayList<Integer>();
        if(rowIndex < 0){
            return li;
        }
        for(int i = 0;i<= rowIndex;i++){
            for(int j = 0;j< i+1;j++){
                if(j==0||j==i){
                    li.set(j,1);
                    System.out.println("j:" + j +"  i:" +i);
                    System.out.println(li.size());
                }else{
                    li.set(j,li.get(j-1)+li.get(j));
                }
            }
        }
        return li;
    }
	/*
	 * 这个方法不可行!!
	 */
	//这里我采用正向重置li.set(j,li.get(j-1)+li.get(j));
	//但是会有个问题，就是当rowIndex等于3的时候，要求输出1334（前一行是121）
	//但是因为list[1] = list[0] + list[1] = 1 + 2 = 3
	//在这里list[2]本意是想这样算而list[2] = list[1] + list[2] = 2 + 1 = 3
	//但是由于list[1] 已经被改成了3 所以最后会得到 4
	//所以最好的解决办法是反向做就不会影响前面的值了
	public List<Integer> getRow2(int rowIndex) {
        List<Integer> li = new ArrayList<Integer>();
        if(rowIndex < 0){
            return li;
        }
        for(int i = 0;i<= rowIndex;i++){
        	li.add(1);
            for(int j = 1;j< i;j++){
                li.set(j,li.get(j-1)+li.get(j));
            }
        }
        return li;
    }
	
	public List<Integer> getRow3(int rowIndex) {
        List<Integer> li = new ArrayList<Integer>();
        if(rowIndex < 0){
            return li;
        }
        for(int i = 0;i<= rowIndex;i++){
        	li.add(1);
            for(int j =i-1;j > 0;j--){
                li.set(j,li.get(j-1)+li.get(j));
            }
        }
        return li;
    }
}
