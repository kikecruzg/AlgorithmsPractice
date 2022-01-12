package ejercicios;

public class LongestCommonPrefix {
	/**
	 * 
	 * @author Enrique
	 *
	 */
	
	class Solution {
	    public String longestCommonPrefix(String[] strs) {
	    	char firstLetter = strs[0].charAt(0);
	        for(int i = 0; i < strs.length; i++){
	            System.out.println("Current word: " + strs[i]);
	            
	            if(firstLetter == strs[i].charAt(0)) {
	            	System.out.println("Si es");
	            }
	            
	            
	            char[] wordChar = strs[i].toCharArray();
	            for(int j = 0; j < wordChar.length; j++) {
	            	
	            	System.out.println("Char at " + j + ": " + wordChar[j]);

	            }
	            
	        }
	        return "";
	    }
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix instance = new LongestCommonPrefix();
		Solution sol =  instance.new Solution();
		
		String[] strs = {"flower", "flow", "flight"};
		
		System.out.println("The longest common prefix is: " + sol.longestCommonPrefix(strs));
	}

}
