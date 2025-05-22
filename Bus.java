public class Bus {
    int busNo;
    boolean ac;
    int capacity;

    Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        this.capacity = cap;
    }

    public void displayBusInfo() {
        System.out.println("Bus No: " + busNo + ", AC: " + (ac ? "Yes" : "No") + ", Capacity: " + capacity);
    }
}
