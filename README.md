# Leetcode
## Leetcode test 11 Container With Most Water
这里题目的分析图如下：
![](https://github.com/akias/Leetcode/raw/master/test11.JPG)
* 所以我们需要找的是ai，aj中的最小值作为高，然后找(i-j)的最大值作为长  然后得到最大的容积。

所以我们这样做
* 用两个point来记录现在所在的x坐标（即i值）
* 然后求出Min(a[i]-a[j])
* 再用这个乘以长(i-j)
* 最后在计算一次当前的结果和之前记录的结果谁大
* 最后如果下一个a[i]值比a[i]大，就移动第一个坐标。否则移动第二个坐标

由于每次都会找到最大的面积，所以最后的答案才会是最大面积。

由于本算法用了动态规划的思想，所以对动态规划做一个简单的总结。
### 动态规划 简介

动态规划算法通常基于一个递推公式及一个或多个初始状态。当前子问题的解将由上一次子问题的解推出。使用动态规划来解题只需要多项式时间复杂度。它比回溯法，暴力法更省时。

这里有一个写的很好的动态规划的解析
http://www.360doc.com/content/17/0616/10/44379516_663575051.shtml


## Leetcode twoSum ThreeSum FourSum...KSum
