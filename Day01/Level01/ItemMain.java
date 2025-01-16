public class ItemMain{	
		
	public static void main(String[]args){
		Item obj = new Item();
		obj.displayDetails("#67vi56", "john",1000);
        obj.displaytotalprice(obj.itemprice, 50);
	}
}


class Item {
	public String itemCode;
	public  String itemName;
	public  int itemprice;
	public  void displayDetails(String itemCode ,  String itemName,int itemprice){
		this.itemCode=itemCode;
		this.itemprice=itemprice;
		this.itemName=itemName;
		System.out.println("Name :"+ itemCode);
		System.out.println("id :"+ itemName);
		System.out.println("salary :"+ itemprice);
	}


    public  void displaytotalprice(int itemprice, int quantity){

    

        System.out.println("Total price :"+ this.itemprice*quantity);
} 
    
}
