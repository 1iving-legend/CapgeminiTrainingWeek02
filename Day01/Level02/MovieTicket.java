
public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

   
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; 
        this.price = 0.0;     
    }

   
    public void bookTicket(int seatNumber, double price) {
        if (this.seatNumber != -1) {
            System.out.println("Ticket is already booked for seat number " + this.seatNumber + ".");
        } else {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket successfully booked!");
        }
    }

    
    public void displayTicketDetails() {
        if (seatNumber == -1) {
            System.out.println("No ticket has been booked yet.");
        } else {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: Rs" + price);
        }
    }

    
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception");

        
        ticket.displayTicketDetails();
        ticket.bookTicket(12, 350);
        ticket.displayTicketDetails();
        ticket.bookTicket(14, 500);
    }
}
