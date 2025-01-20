
class Company extends Employee {
    public static String companyName="Capgemini";

    public Company(String name, String designation, int id) {
        super(name, designation, id);
    }
    public static void display() {
        System.out.println(companyName);
        System.out.println(totalEmployees);
    }

    public static void main(String[] args) {
           Company company = new Company("Capgemini", "Analyst", 1);
           Company company2 = new Company("Capgemini", "Analyst", 2);
           if(company instanceof Employee) {
               Company.display();
           }
    }
}

class Employee {
   private String name;
   private final int id;
   private String designation;
    public static int totalEmployees=0;

    Employee() {
        id = 0;
    }

    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
}


