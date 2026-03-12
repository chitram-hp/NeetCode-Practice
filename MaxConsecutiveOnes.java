/*
Max Consecutive Ones

You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]

Output: 3

Example 2:

Input: nums = [1,0,1,1,0,1]

Output: 2
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int max=0;
        for(int n:nums){
            if(n!=1)c=0; 
            else c++;
            max=Math.max(max,c);
        }
        return max;
    }
}