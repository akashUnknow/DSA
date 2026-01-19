package main.java.org.akash.solutation.arrays;

import java.util.HashSet;
import java.util.Set;

public class Question {
//    10, 5, 20, 8---->10
    public int secondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int n:arr){
            if (n>largest){
                second=largest;
                largest=n;
            } else if (n>second && n!=largest) {
                second=n;

            }
        }
        return second;
    }
//    1, 2, 3, 2, 4, 1---->[1, 2]
    public void findDuplicates(int[] arr){
        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for (int n:arr){
            if(!seen.add(n)){
                duplicates.add(n);
            }
        }
        System.out.println(duplicates);
    }

    public int missingNumber(int[] arr, int n){
        int exceptedOutput=n*(n+1)/2;
        int result=0;
        for (int num:arr){
            result+=num;
        }
        return exceptedOutput-result;
    }
}
