public class FuelGauge{
  private int fuel, gallon;
  FuelGauge(){
    setFuel(0);
    setGallon(15);
  }
  FuelGauge(int Fuel, int Gallon){
    setFuel(Fuel);
    setGallon(Gallon);
  }

  public void setFuel(int Fuel){
    fuel = Fuel;
  }
  public void setGallon(int Gallon){
    if(Gallon<=15 && Gallon>0){
      gallon = Gallon;
    }
  }
  public int getFuel(){
    return fuel;
  }
  public int getGallon(){
    return gallon;
  }
  public void incrementFuel(){
    fuel++;
  }
  public void decrementFuel(){
    fuel--;
  }

}
