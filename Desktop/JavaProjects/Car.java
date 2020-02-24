public class Car{
  private int engineSize, numTires, miles;
  public Car(){}
  public Car(int engine, int tires, int miles){
    setEngineSize(engine);
    setNumTires(tires);
    setMiles(miles);
  }
  public void setEngineSize(int engine){
    engineSize = engine;
  }
  public void setNumTires(int tires){
    numTires = tires;
  }
  public void setMiles(int Miles){
    miles = Miles;
  }

  public int getEngineSize(){
    return engineSize;
  }
  public int getNumTires(){
    return numTires;
  }
  public int getMiles(){
    return miles;
  }
  /*public int getOdo(Odometer a){
    return a.getMileage();
  }
  public int getfuel(FuelGuage a){
    return a.getFuel();
  }
  public int getGallon(FuelGuage a){
    return a.getGallon();
  }
*/


}
