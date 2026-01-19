package main.java.org.akash.solutation.arrays;

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
}
