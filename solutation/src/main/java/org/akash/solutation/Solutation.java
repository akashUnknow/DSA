package main.java.org.akash.solutation;

import main.java.org.akash.solutation.Link.ListNode;
import main.java.org.akash.solutation.marker.model.Admin;
import main.java.org.akash.solutation.marker.model.Employee;
import main.java.org.akash.solutation.marker.model.User;
import main.java.org.akash.solutation.marker.service.Processor;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;

public class Solutation {
    static Logger logger = Logger.getLogger(Solutation.class.getName());


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
        logger.info(("leetcode"));
        User user=new User("Akash");
        Employee employee=new Employee(101);
        Admin admin=new Admin("Super_Admin");
        Processor.process(user);
        Processor.process(employee);
        Processor.process(admin);


    }

}
