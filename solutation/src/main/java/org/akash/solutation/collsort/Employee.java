package main.java.org.akash.solutation.collsort;
public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private double salary;
    private int age;

    public Employee(String name, int id, double salary , int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }
    public int compare(Employee e1,Employee e2){
        int flage=e1.getName().compareTo(e2.getName());
        if (flage == 0) {
            flage=e1.getAge()-e2.getAge();
        }
        return flage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}