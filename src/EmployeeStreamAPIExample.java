import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamAPIExample {
    public static void main(String[] args) {

    List<Employee> employees = Arrays.asList(

            new Employee(101,"Rahul","IT",85000.0,30,"Male","Mumbai"),
            new Employee(102,"Priya","HR",60000.0,28,"Female","Pune"),
            new Employee(103,"Amit","IT",95000.0,35,"Male","Mumbai"),
            new Employee(104,"Sneha","Finance",75000.0,32,"Female","Delhi"),
            new Employee(105,"Vijay","Finance",82000.0,40,"Male","Bangalore"),
            new Employee(106,"Pooja","HR",65000.0,26,"Female","Pune"),
            new Employee(107,"Karan","IT",70000.0,29,"Male","Mumbai"),
            new Employee(108,"Neha","Admin",50000.0,27,"Female","Chennai"),
            new Employee(109,"Rohit","IT",120000.0,38,"Male","Hyderabad"),
            new Employee(110,"Anjali","Finance",90000.0,31,"Female","Delhi")
    );

    System.out.println("Group By Department");
    System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

    System.out.println("Group By Gender");
    System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender)));

    Set<String> name=employees.stream().map(Employee::getName).collect(Collectors.toSet());
    System.out.println(name);

    System.out.println("Count By department");
    System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));

    System.out.println("Highest salary Employee");
    System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)));

    System.out.println("Lowest Salary Employee");
    System.out.println(employees.stream().min(Comparator.comparing(Employee::getSalary)));

    System.out.println("Second Highest salary");
    System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst());

    System.out.println("Second Lowest Salary");
    System.out.println(employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst());

    System.out.println(employees.stream().filter(e->e.getSalary()>50000).collect(Collectors.toSet()));



}
    static class Employee {

        private Integer id;
        private String name;
        private String department;
        private Double salary;
        private Integer age;
        private String gender;
        private String city;

        public Employee(Integer id, String name, String department,
                        Double salary, Integer age,
                        String gender, String city) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
            this.gender = gender;
            this.city = city;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public Double getSalary() {
            return salary;
        }

        public Integer getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }
}
