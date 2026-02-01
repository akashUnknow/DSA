package main.java.org.akash.solutation;
import main.java.org.akash.solutation.dsaDesignPatterns.twoPointers.Question;

import java.util.Arrays;
import java.util.List;

public class Solutation {
    public static void main(String[] args) {
        int[] arr=new int[]{-1,0,1,2,-1,-4};//1 1 2 2 3 4
        System.out.println( );
//        int[] res=productExceptSelf(arr);
//        Arrays.stream(res).forEach(System.out::println);

        Question question=new Question();
//        System.out.println(question.maxArea(arr));
//
//        int[] res=question.removeDuplicates(arr);
//        Arrays.stream(res).forEach(System.out::println);
        List<List<Integer>> res=question.threeSum(arr);
        System.out.println(res);
    }


}