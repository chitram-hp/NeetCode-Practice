/*
Valid Anagram
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false

*/

/*class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int[200];
        int freq2[] = new int[200];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(char c:t.toCharArray()){
            freq2[c]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=freq2[i] ) return false;
        }
    return true;
    }
}
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int freq[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f : freq){
            if(f != 0) return false;
        }

        return true;
    }
}
