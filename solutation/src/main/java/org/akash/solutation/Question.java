package main.java.org.akash.solutation;

import java.util.HashMap;
import java.util.Stack;

public class Question {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{0,0};
    }
    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            int diff=target-nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' ||c=='{' ||c=='[' ){
                stack.push(c);

            }
            else {
                if (stack.isEmpty()) return false;
                char top=stack.pop();
                if (c==')' && top!='(' ||c=='}'&& top!='{' ||c==']'&& top!='[' ){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
