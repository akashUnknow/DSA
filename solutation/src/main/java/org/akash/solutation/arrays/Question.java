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

//
//    Input:  [0, 1, 0, 3, 12]
//    Output: [1, 3, 12, 0, 0]
    public void moveZeros(int[] arr){
        int index=0;
        for (int n:arr){
            if (n!=0){
                arr[index++]=n;
            }
        }
        while (index<arr.length){
            arr[index++]=0;
        }
        for (int n:arr) System.out.println(n);
    }
//    Input:  [8,7,2,5,3,1], sum=10
//    Output: (8,2)

    public void findPair(int[] arr, int target){
        Set<Integer> set=new HashSet<>();
        for (int n:arr){
            int diff=target-n;
            if(set.contains(diff)){
                System.out.println(diff+" "+ n);
                return;
            }
            set.add(n);
        }
    }
}
