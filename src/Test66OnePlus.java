
public class Test66OnePlus {
	public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1;i >= 0;i--){
                digits[i] += 1;
                if(digits[i] < 10){
                    return digits;
                }else{
                    digits[i] = 0; 
                }
            }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for(int k = 1;k <= digits.length ;k++){
            newDigits[k] = 0;
        }
        return newDigits;
    }
}
