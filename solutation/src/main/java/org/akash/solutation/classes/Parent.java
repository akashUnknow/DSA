package main.java.org.akash.solutation.classes;

class Parent {
    public void printDkParent(){
        System.out.println("parent dk");
    }
    public void printPkParent(){
        System.out.println("parent pk");
    }
}

class Child extends Parent {
    public void printDkChild(){
        System.out.println("Child dk");
    }
    public void printPkChild(){
        System.out.println("Child pk");
    }
}
class Temp{
    public static void main(String[] args) {
        Child p1=new Child();
        

    }
}