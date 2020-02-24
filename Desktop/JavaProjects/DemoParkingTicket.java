//Juan Delgado
//CSC 121
//This is a demo file to show the program

public class DemoParkingTicket {

    public static void main(String[] args) {

      ParkedCar car1 = new ParkedCar("BMW", "2014", "Yellow", "141D12345", 30);
      ParkingMeter meter1 = new ParkingMeter(50);
      PoliceOfficer Murphy = new PoliceOfficer("Guard Murphy", "10");
      ParkingTicket ticket1 = Murphy.search(car1, meter1);

      if (ticket1 != null) {
           System.out.println(ticket1.toString());
      } else {
           System.out.println("No ticket issued!");
      }


// A second car checked to see if it passes or not, it's over
      ParkedCar car2 = new ParkedCar("VW", "2001", "Green", "01D321", 225);
      ParkingMeter meter2 = new ParkingMeter(200);
      ParkingTicket ticket2 = Murphy.search(car2, meter2);

      if (ticket2 != null) {
           System.out.println(ticket2.toString());
      } else {
          System.out.println("No ticket issued!");
      }
   }
}
