/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 * 
 * 示例 1: 输入: a = 1, b = 2 输出: 3
 * 
 * 示例 2: 输入: a = -2, b = 3 输出: 1
 * 
 * @author zohar
 *
 */
public class _371 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.getSum(100, 2));
	}

	/**
	 * 用异或算不带进位的和，用与并左移1位来算进位，然后把两者加起来即可
	 * 
	 * @author zohar
	 *
	 */
	static class Solution {
		public int getSum(int a, int b) {
			if (b == 0) {
				return a;
			}
			
			int sum = a ^ b;
			int carry = (a & b) << 1;
			return getSum(sum, carry);
		}
	}
}
