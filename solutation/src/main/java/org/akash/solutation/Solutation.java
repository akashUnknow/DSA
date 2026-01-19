package main.java.org.akash.solutation;

import main.java.org.akash.solutation.Link.ListNode;
import main.java.org.akash.solutation.collsort.Employee;
import main.java.org.akash.solutation.custom.MyArrayList;
import main.java.org.akash.solutation.innerclass.OuterClass;
import main.java.org.akash.solutation.marker.model.Admin;
import main.java.org.akash.solutation.marker.model.User;
import main.java.org.akash.solutation.marker.service.Processor;
import main.java.org.akash.solutation.strings.Question;
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
//        int[] arr=new int[]{16,17,4,3,5,2};
//        int[] arr2=new int[]{2,4,6};
//        Question arrayQuestion=new Question();
//        System.out.println(arrayQuestion.secondLargest(arr));
//        arrayQuestion.findDuplicates(arr);
//        System.out.println(arrayQuestion.missingNumber(arr,arr.length+1));
//        arrayQuestion.moveZeros(arr);
//        arrayQuestion.findPair(arr,10);
//       int [] res= arrayQuestion.merge(arr,arr2);
//       for (int re:res) System.out.println(re);
//        arrayQuestion.findLeaders(arr);
        Question question=new Question();
//        System.out.println(question.reverseString("hello"));
//        System.out.println(question.isPalindrome("madam"));
//        question.countCharacters("java");
//        System.out.println(question.isAnagram("listen","sileqnt"));
//        System.out.println(question.reverseWords("Java is fun"));
//        System.out.println(question.removeDuplicates("programming"));
//        System.out.println(question.longestWord("Java is object oriented"));
//        System.out.println(question.isOnlyDigits("123456"));
        question.printSubstrings("abc");
    }
}
