class BookMain{	
		
	public static void main(String[]args){
		Book obj = new Book();
		obj.displayDetails("john banega don", "john",1000);
	}
}


class Book {
	public String name;
	public  String author;
	public  int price;
	public  void displayDetails(String name ,  String author,int price){
		this.name=name;
		this.author=author;
		this.price=price;
		System.out.println("Name :"+ name);
		System.out.println("id :"+ author);
		System.out.println("salary :"+ price);
	}
}