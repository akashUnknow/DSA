package main.java.org.akash.solutation.innerclass;

public  class OuterClass {
    static int outer_X=10;
    int outer_Y=20;
    private int outer_Z=30;
    public class Inner{
        public void print(){
            System.out.println("outer_X-> "+outer_X);
            System.out.println("outer_Y-> "+outer_Y);
            System.out.println("outer_Z-> "+outer_Z);
        }
    }
}
