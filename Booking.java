import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(String name, int busNo, Date date) {
        this.passengerName = name;
        this.busNo = busNo;
        this.date = date;
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }

        return booked < capacity;
    }

    public void printTicket() {
        System.out.println("Ticket Confirmed for " + passengerName + " on Bus No: " + busNo + " on " + date);
    }
}
