# Leetcode
Leetcode test 11 Container With Most Water
![](https://github.com/akias/Leetcode/raw/master/test11.JPG)  
* 所以我们需要找的是ai，aj中的最小值作为高，然后找(i-j)的最大值作为长  然后得到最大的容积。

所以我们这样做
* 用两个point来记录现在所在的x坐标（即i值）
* 然后求出Min(a[i]-a[j])
* 再用这个乘以长(i-j)
* 最后在计算一次当前的结果和之前记录的结果谁大
* 最后如果下一个a[i]值比a[i]大，就移动第一个坐标。否则移动第二个坐标

由于每次都会找到最大的面积，所以最后的答案才会是最大面积。

动态规划 简介
