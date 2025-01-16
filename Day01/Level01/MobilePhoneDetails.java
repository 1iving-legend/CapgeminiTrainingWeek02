
public class MobilePhoneDetails {
    public static void main(String[] args){
        MobilePhone phone1 = new MobilePhone("POCO", "POCOX3", 17500);
        phone1.displayDetails();
    }
}





class MobilePhone{
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("price: "+ price);
    }
}

