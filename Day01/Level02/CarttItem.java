public static class CarttItem {

    private String itemName;
    private int price;
    private int quantity;
    CarttItem next = null;

    public CarttItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

   
    public CarttItem() {}

    
    public CarttItem addItem(CarttItem head, CarttItem obj) {
        if (head == null) {
            return obj; 
        }
        CarttItem current = head;
        while (current.next != null) {
            current = current.next; 
        }
        current.next = obj; 
        return head;
    }


    public CarttItem deleteItem(CarttItem head, String itemName) {
        if (head == null) {
            System.out.println("The cart is empty! Nothing to delete.");
            return null;
        }

       
        if (head.itemName.equalsIgnoreCase(itemName)) {
            System.out.println("Item " + itemName + " removed from the cart.");
            return head.next;
        }

        CarttItem current = head;
        CarttItem previous = null;

        
        while (current != null && !current.itemName.equalsIgnoreCase(itemName)) {
            previous = current;
            current = current.next;
        }

       
        if (current == null) {
            System.out.println("Item " + itemName + " not found in the cart.");
            return head;
        }

        
        previous.next = current.next;
        System.out.println("Item " + itemName + " removed from the cart.");
        return head;
    }

    
    public void displayCart(CarttItem head) {
        if (head == null) {
            System.out.println("The cart is empty!");
            return;
        }
        CarttItem current = head;
        System.out.println("Items in your cart:");
        while (current != null) {
            System.out.println("Item Name: " + current.itemName + ", Price: " + current.price + ", Quantity: " + current.quantity);
            current = current.next;
        }
    }

    
    public int calculateTotal(CarttItem head) {
        int total = 0;
        CarttItem current = head;
        while (current != null) {
            total += current.price * current.quantity; 
            current = current.next;
        }
        return total;
    }

    
    public static void main(String[] args) {
        CarttItem cart = null;

        // Creating some items
        CarttItem item1 = new CarttItem("Apple", 50, 2);
        CarttItem item2 = new CarttItem("Banana", 10, 6);
        CarttItem item3 = new CarttItem("Milk", 40, 1);

        
        cart = item1.addItem(cart, item1);
        cart = item1.addItem(cart, item2);
        cart = item1.addItem(cart, item3);

    
        item1.displayCart(cart);

        
        cart = item1.deleteItem(cart, "Banana");

       
        item1.displayCart(cart);

      
        int totalPrice = item1.calculateTotal(cart);
        System.out.println("Total Price: " + totalPrice);
    }
}
