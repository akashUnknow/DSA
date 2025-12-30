package main.java.org.akash.solutation;

import main.java.org.akash.solutation.Link.ListNode;

import java.util.HashMap;
import java.util.Stack;
import java.util.logging.Logger;

public class Solutation {
    static Logger logger = Logger.getLogger(Solutation.class.getName());


    public static void main(String[] args) {

//        List<Employee> employees = new ArrayList<>(List.of(
//                new Employee("Alice", 3, 70000, 30),
//                new Employee("Bob", 1, 50000, 25),
//                new Employee("Charlie", 2, 60000, 28)
//        ));
//
//        Collections.sort(employees, new NameAgeComparator());
//        System.out.println(employees);
        Question question=new Question();
        logger.info(String.valueOf(isAnagram("anagram","nagaram")));


    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int i : count) if (i != 0) return false;
        return true;
    }


}
