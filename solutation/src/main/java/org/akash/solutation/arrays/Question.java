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
//    Input:  [1,3,5], [2,4,6]
//    Output: [1,2,3,4,5,6]

    public int[] merge(int[] a,int[] b){
        int i=0,j=0,k=0;
        int[] result=new int[a.length+b.length];
        while (i<a.length && j<b.length){
            result[k++] = a[i] <b[j] ? a[i++]:b[j++];
        }
        while (i<a.length) result[k++]=a[i++];
        while (j<b.length) result[k++]=b[j++];
        return result;
    }
//    Input:  [16,17,4,3,5,2]
//    Output: 17,5,2

    public void findLeaders(int[] arr){
        int maxFromRight=arr[arr.length-1];
        System.out.println(maxFromRight+ " ");
        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i]>maxFromRight){
                maxFromRight=arr[i];
                System.out.println(maxFromRight+ " ");
            }
        }
    }
    public static void subArraySum(int[] arr, int sum) {
        int start=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
            while (count>sum){
                count-=arr[start++];
            }
            if (count==sum){
                System.out.println("Found between " + (start+1) + " and " + (i+1));
                return;
            }
        }

    }


    public static Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : a) set1.add(num);
        for (int num : b) {
            if (set1.contains(num)) result.add(num);
        }
        return result;
    }

    public static int majorityElement(int[] nums) {
        int count=0,repet=0;
        for (int num:nums){
            if (count==0) repet=num;
            count+=(num==repet)?1:-1;
        }
        return repet;
    }
}
