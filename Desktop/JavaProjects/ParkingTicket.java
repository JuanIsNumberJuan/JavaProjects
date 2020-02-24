//Juan Delgado
//CSC 121


public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;
    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
        this.car = car;
        setCar(this.car);
        this.officer = officer;
        this.minutes = minutes;
        setMinutes(this.minutes);
        calculateFine();
    }
    private void calculateFine() {
        double hours = minutes / 60.0;
        int hoursAsInt = (int) hours;
        if ((hours - hoursAsInt) > 0) {
            hoursAsInt++;
        }
        // Assign the base fine.
        fine = BASE_FINE;
        // Add the additional hourly fines.
        fine += (hoursAsInt * HOURLY_FINE);
    }
    public void setMinutes(int m){
      minutes = m;
    }
    public int getMinutes(){
      return minutes;
    }
    public ParkedCar getCar(){
      return car;
    }
    public void setCar(ParkedCar c ){
      car = c;
    }

    public String toString() {
        String TicketString = "Fine : " + this.fine
                + "\nMinutes: " + minutes
                + "\n" + car.toString()
                + "\n" + officer.toString();
       return TicketString;
   }
}
