package main.java.org.akash.solutation;

import main.java.org.akash.solutation.Link.ListNode;
import main.java.org.akash.solutation.arrays.Question;
import main.java.org.akash.solutation.collsort.Employee;
import main.java.org.akash.solutation.custom.MyArrayList;
import main.java.org.akash.solutation.innerclass.OuterClass;
import main.java.org.akash.solutation.marker.model.Admin;
import main.java.org.akash.solutation.marker.model.User;
import main.java.org.akash.solutation.marker.service.Processor;
import org.akash.solutation.jdbc.JdbcDemo;

import java.util.*;
import java.util.logging.Logger;

public class Solutation {
    static Logger logger = Logger.getLogger(Solutation.class.getName());


    public static void main(String[] args) {

//        List<Employee> employees = new ArrayList<>(List.of(
//                new Employee("Alice", 3, 70000, 30),
//                new Employee("Bob", 1, 50000, 25),
//                new Employee("Charlie", 2, 60000, 28),
//                new Employee("Charlie", 2, 60000, 29),
//                new Employee("Charlie", 2, 60000, 26)
//        ));
//
//        Collections.sort(employees, new NameAgeComparator());
//        System.out.println(employees);
//        Question question=new Question();
////        question.firstUniqChar("leetcode");
//        System.out.println(firstUniqChar("leetcode"));
//        logger.info(("leetcode"));
//        User user=new User("Akash");
//        Employee employee=new Employee(101);
//        Admin admin=new Admin("Super_Admin");
//        Processor.process(user);
//        Processor.process(employee);
//        Processor.process(admin);
//        employees.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
//        employees.forEach(System.out::println);
//        OuterClass outerClass=new OuterClass();
//        OuterClass.Inner inner=outerClass.new Inner();
//        inner.print();
//        MyArrayList<String> list = new MyArrayList<>();
//        list.add("apple");
//        System.out.println(list.get(0));
//        JdbcDemo jdbcDemo=new JdbcDemo();
//        jdbcDemo.demoMethod();
        int[] arr=new int[]{1, 2, 4, 5};
        Question arrayQuestion=new Question();
//        System.out.println(arrayQuestion.secondLargest(arr));
//        arrayQuestion.findDuplicates(arr);
        System.out.println(arrayQuestion.missingNumber(arr,arr.length+1));
    }
}
