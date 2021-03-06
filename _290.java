import java.util.HashMap;
import java.util.Map;

/**
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。 这里的遵循指完全匹配，例如， pattern
 * 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * 
 * 示例1: 输入: pattern = "abba", str = "dog cat cat dog" 输出: true
 * 
 * 示例 2: 输入:pattern = "abba", str = "dog cat cat fish" 输出: false
 * 
 * 示例 3: 输入: pattern = "aaaa", str = "dog cat cat dog" 输出: false
 * 
 * 示例 4: 输入: pattern = "abba", str = "dog dog dog dog" 输出: false
 * 
 * 说明: 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
 * 
 * @author zohar
 *
 */
public class _290 {

	public static void main(String[] args) {

	}

	static class Solution {
		/**
		 * 用key-value来解决
		 * 
		 * @param pattern
		 * @param str
		 * @return
		 */
		public boolean wordPattern(String pattern, String str) {
			Map<Character, String> map = new HashMap<>();
			String[] strs = str.split(" ");
			int patLen = pattern.length();
			char[] chars = new char[patLen];
			for (int i = 0; i < patLen; i++) {
				chars[i] = pattern.charAt(i);
			}

			if (patLen != strs.length) {
				return false;
			}

			for (int i = 0; i < chars.length; i++) {
				if (!map.containsKey(chars[i])) {
					if (map.containsValue(strs[i])) {
						return false;
					} else {
						map.put(chars[i], strs[i]);
					}
				} else {
					String temp = map.get(chars[i]);
					if (!temp.equals(strs[i])) {
						return false;
					}
				}
			}
			return true;
		}
	}
}
