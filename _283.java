/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

说明:
    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。
    
 * @author zohar
 */
public class _283 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[] {0,1,0,3,12};
		s.moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	static class Solution {
	    public void moveZeroes(int[] nums) {
	    	int i = 0;
	    	int j = 0;
	        for (; i < nums.length; i++) {
				if (nums[i] != 0) {
					//把为0的地方覆盖掉
					nums[j++] = nums[i];
				}
			}
	        
	        for (; j < nums.length; j++) {
				nums[j] = 0;
			}
	    }
	}
}