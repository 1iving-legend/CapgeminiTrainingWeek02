package main.assisted_problems.employee;

public class main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mike", 1000, 1);
        emp1.displayDetails();
        Manager manager = new Manager("tarun",500000,25,"IT");
        manager.displayDetails();
        Devloper devloper = new Devloper("riya",250000,56,"it","java");
        devloper.displayDetails();
        Intern intern = new Intern("bhavya",5000,78,"open");
        intern.displayDetails();
    }
}
