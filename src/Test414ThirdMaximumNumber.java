
public class Test414ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		/*
		 * Integer类是int的包装类
		 * ①无论如何，Integer与new Integer不会相等。
		 * 不会经历拆箱过程，i3的引用指向堆，而i4指向专门存放他的内存（常量池），
		 * 他们的内存地址不一样，所以为false
		 * ②两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
		 * java在编译Integer i2 = 128的时候,被翻译成-> Integer i2 = Integer.valueOf(128);而valueOf()函数会对-128到127之间的数进行缓存
		 * ③两个都是new出来的,都为false
		 * ④int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
		 * 关于Integer和int的区别http://www.cnblogs.com/liuling/archive/2013/05/05/intAndInteger.html
		 */
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer i:nums){
            if(i.equals(max1)||i.equals(max2)||i.equals(max3)){
                continue;
            }
            if(max1 == null||i > max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(max2 == null||i > max2){
                max3 = max2;
                max2 = i;
            }else if(max3 == null||i >max3){
                max3 = i;
            }
        }
        return max3 == null ? max1 : max3; 
    }
}
