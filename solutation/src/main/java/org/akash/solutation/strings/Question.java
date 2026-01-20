package main.java.org.akash.solutation.strings;

import java.util.*;

public class Question {
    public String reverseString(String s){
        char[] chars=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while (left<right){
            char temp=chars[left];
            chars[left++]=chars[right];
            chars[right--]=temp;
        }
        return new String(chars);
    }
    public boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while (left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;

            }
        }
        return true;
    }
    public void countCharacters(String st){
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:st.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
    public char firstNonRepeatedChar(String s){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
    public boolean isAnagram(String s1,String s2){
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
    public String reverseWords(String st){
        String[] words=st.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public String removeDuplicates(String s){
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for (char c:s.toCharArray()){
            if (set.add(c)){
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }
    public String longestWord(String s){
        String[] words=s.split(" ");
        String longest="";
        for (String st:words){
            if(st.length()>longest.length()){
                longest=st;
            }
        }
        return longest;
    }
    public boolean isOnlyDigits(String s){
        for (char c:s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public void  printSubstrings(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i=1;i<=str.length();i++){
            if(i == str.length() || str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i - 1)).append(count);
                count=1;
            }else {
                count++;
            }
        }
        return sb.toString();
    }

    public static int countWords(String str) {
        return str.trim().split("\\s+").length;
    }
    public static void duplicateChars(String str) {
        Map<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        map.forEach((k,v)->{
            if (v>1) System.out.println(k+" ");
        });
    }
}
