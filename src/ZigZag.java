
public class ZigZag {
	    public String convert(String s, int numRows) {
	    	int len = s.length();  
	        if (len == 0 || numRows < 2) return s;  
	          
	        String ret = "";  
	        int lag = 2*numRows - 2; //循环周期  
	        for (int i = 0; i < numRows; i++) {  
	            for (int j = i; j < len; j += lag) {  
	                ret += s.charAt(j);  
	                  
	                //非首行和末行时还要加一个  
	                if (i > 0 && i < numRows-1) {  
	                    int t = j + lag - 2*i;  
	                    if (t < len) {  
	                        ret += s.charAt(t);  
	                    }  
	                }  
	            }  
	        }  
	        return ret;
	}
}
