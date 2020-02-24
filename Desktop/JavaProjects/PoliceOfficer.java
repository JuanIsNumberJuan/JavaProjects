//Juan Delgado
//CSC 121

public class PoliceOfficer {
    private String name;
    private String badgeNumber;
    public PoliceOfficer (String Name, String Badge){
      setName(Name);
      setBadgeNumber(Badge);
    }
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {
        ParkingTicket ticket = null;
        // Calculate the total number of minutes parked over minutes purchased
        int illegalMinutes = car.getMinutesParked()  - meter.getMinutesPurchased();
        // if illegalMinutes, give ticket
        if (illegalMinutes > 0) {    // Yes, it is illegally parked.
            ticket = new ParkingTicket(car, this, illegalMinutes);
        }
        return ticket;
    }
   public void setName(String n){
     name = new String(n);
   }
   public String getName(){
     return name;
   }
   public void setBadgeNumber(String n){
     badgeNumber = n;
   }
   public String getBadgeNumber(){
     return badgeNumber;
   }
   public String toString() {
        String GardaString = "Police : " + this.name
                        + "\nBadge: " + badgeNumber ;
                       // + "\nTicket: " + Ticket;
        return GardaString;
    }
    public ParkingTicket search(ParkedCar car, ParkingMeter meter) {
      PoliceOfficer Garda = new PoliceOfficer(this.name,this.badgeNumber);
      int time = car.getNumberMinutesParked() - meter.getMinutesPurchased();
      if(time <0)
         return null;
      return new ParkingTicket(car, Garda, time);
   }
}
