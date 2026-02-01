package main.java.org.akash.solutation.collsort;
public class Employee {
    private String name;
    private int id;
    private double salary;
    private String dept;

    public Employee( int id,String name, double salary , String dept) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept=dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }
}