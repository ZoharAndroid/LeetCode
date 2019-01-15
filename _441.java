//441. 排列硬币
public class _441 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.arrangeCoins(3));
	}
	
	static class Solution {
	    public int arrangeCoins(int n) {
	    	if (n <= 0) {
				return 0;
			}
	    	if (n == 1) {
				return 1;
			}
	        long sum = 0;
	        int count = 0;
	        while(sum <= n) {
	        	count ++;
	        	sum += count;
	        }
	        
	        
				return count - 1;
			
	    }
	}

}
