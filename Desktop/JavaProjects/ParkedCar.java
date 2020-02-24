//Juan Delgado
//CSC 121

public class ParkedCar{
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(String Make, String Model, String Colour, String Plate, int minutes){
      setMake(Make);
      setModel(Model);
      setColor(Colour);
      setReg(Plate);
      setNumberMinutesParked(minutes);
    }

    public void setMinutesParked(int m){
      minutesParked = m;
    }
    public int getMinutesParked()
    {
      return minutesParked;
    }

    public void setMake(String Make){
      make = new String(Make);
    }
    public void setModel(String Model){
      model = new String(Model);
    }
    public void setColor(String Colour){
      color = new String(Colour);
    }
    public void setReg(String Reg){
      licenseNumber = new String(Reg);
    }
    public void setNumberMinutesParked(int NoMinsPkd){
      minutesParked = NoMinsPkd;
    }


    public String getMake(){
      return make;
    }
    public String getModel(){
      return model;
    }
    public String getColor(){
      return color;
    }
    public String getReg(){
      return licenseNumber;
    }
    public int getNumberMinutesParked(){
      return minutesParked;
    }

    public String toString() {
       String PkdCar = "Make: " + make + "\nModel: " + model + "\nColor: " + color
                + "\nLicense Plate: " + licenseNumber;
       return PkdCar;
    }
}
