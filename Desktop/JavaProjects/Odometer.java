public class Odometer{
  private int mileage;
  public Odometer(){}
  public Odometer(int Mileage){
    setMileage(Mileage);
  }
  public void setMileage(int Mileage){
    if(Mileage<=999999 && Mileage>=0){
      mileage = Mileage;
    }
    else{
      mileage = 0;
    }
  }
  public int getMileage(){
    return mileage;
  }
}
