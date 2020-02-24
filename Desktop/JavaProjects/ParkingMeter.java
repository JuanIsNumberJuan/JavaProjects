//Juan Delgado
//CSC 121

public class ParkingMeter{
   private int minutesPurchased;
    public ParkingMeter(){
      return;
    }
    public ParkingMeter(int p){
      setMinutesPurchased(p);
    }
    public int getMinutesPurchased(){
      return minutesPurchased;
    }
    public void setMinutesPurchased(int p){
      minutesPurchased = p;
    }
    public String toString()   {
        String MeterString = "Minutes Purchased: " + minutesPurchased;
        return MeterString;
   }
}
