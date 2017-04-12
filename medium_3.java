public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<Character,Integer>();
        int max = 0;
        char ch;
        for(int i=0,last=-1;i<s.length();i++){
        	ch=s.charAt(i);
        	if(map.containsKey(ch)){
        		last=map.get(ch);
        	}
        	map.put(ch,i);
        	max = Math.max(max,i-last);
        }
        return max;
    }
    public static void main(String[] args) {
    	String s = "abba";
    	System.output.println(lengthOfLongestSubstring(s));
    }

}