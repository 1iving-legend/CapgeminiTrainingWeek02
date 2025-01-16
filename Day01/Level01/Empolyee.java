class Main{	
		
	public static void main(String[]args){
		Empolyee obj = new Empolyee();
		obj.displayDetails("john",10,100000);
	}
}


class Empolyee {
	public String name;
	public  int id;
	public  int salary;
	public  void displayDetails(String name , int id ,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		System.out.println("Name :"+ name);
		System.out.println("id :"+ id);
		System.out.println("salary :"+ salary);
	}
}