import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test412FizzBuzz {
	public List<String> fizzBuzz1(int n) {
        List<String> li = new LinkedList<String>();
        int i = 1;
        while(i<n+1){
        	li.add(String.valueOf(i));
        	i++;
        }
        int t = 2;
        while(t<n){
        	li.set(t,"fizz");
        	t +=3;
        }
        int m = 4;
        while(m<n){
        	li.set(m,"buzz");
        	m +=5;
        }
        int tm = 14;
        while(tm<n){
        	li.set(tm,"fizzbuzz");
        	tm +=15;
        }
        for (int j = 0; j < li.size(); j++) {
            System.out.println(li.get(j));
        }
        return li;
    }
	
	public List<String> fizzBuzz2(int n) {
	List<String> ret = new ArrayList<String>(n);
    for(int i=1,fizz=0,buzz=0;i<=n ;i++){
        fizz++;
        buzz++;
        if(fizz==3 && buzz==5){
            ret.add("FizzBuzz");
            fizz=0;
            buzz=0;
        }else if(fizz==3){
            ret.add("Fizz");
            fizz=0;
        }else if(buzz==5){
            ret.add("Buzz");
            buzz=0;
        }else{
            ret.add(String.valueOf(i));
        }
    } 
    return ret;
	}
}
