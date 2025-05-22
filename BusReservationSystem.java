import java.util.*;

public class BusReservationSystem {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Sample Buses
        buses.add(new Bus(101, true, 2));
        buses.add(new Bus(102, false, 3));

        int choice = 1;
        while (choice != 0) {
            System.out.println("\n--- Bus Reservation System ---");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Bookings");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Bus b : buses) {
                        b.displayBusInfo();
                    }
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter Bus No: ");
                    int busNo = sc.nextInt();
                    System.out.print("Enter travel date (dd-MM-yyyy): ");
                    String dateStr = sc.next();
                    try {
                        Date date = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dateStr);
                        Booking booking = new Booking(name, busNo, date);
                        if (booking.isAvailable(bookings, buses)) {
                            bookings.add(booking);
                            booking.printTicket();
                        } else {
                            System.out.println("Sorry, Bus is full. Try another date or bus.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid date format.");
                    }
                    break;
                case 3:
                    for (Booking b : bookings) {
                        System.out.println("Name: " + b.passengerName + ", Bus No: " + b.busNo + ", Date: " + b.date);
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
