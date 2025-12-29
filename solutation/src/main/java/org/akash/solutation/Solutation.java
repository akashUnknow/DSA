package main.java.org.akash.solutation;

import java.util.HashMap;

public class Solutation {

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
        int[] res=null;
        System.out.println(question.twoSum(new int[]{2,7,11,15},9));
        res=question.twoSum(new int[]{3,2,4},6);
        for (int a:res){
            System.out.println(a);
        }

    }


}
