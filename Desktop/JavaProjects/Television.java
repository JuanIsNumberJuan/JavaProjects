//Juan Delgado
//CSC 121-80


public class Television{
    //variables
    private String MANUFACTURER;
    private int SCREEN_SIZE;

    private boolean powerOn;
    private int channel;
    private int volume;
    final private static int MAXVOL = 200;
    final private static int MAXCHANNEL = 500;

    //method that is used
    public Television(String brand, int size){
      MANUFACTURER = brand;
      SCREEN_SIZE = size;
      powerOn = false;
      channel = 2;
      volume = 20;
    }
    //decreases volume
    public void decreaseVolume(){
      if(volume > 0){
        getDecreaseVolume();
      }
    }

    //increases volume
    public void increaseVolume(){
      if(volume < MAXVOL){
        getIncreaseVolume();
      }
    }


    //get methods
    public int getVolume(){
      return volume;
    }

    public int getChannel(){
      return channel;
    }

    public String getManufacturer(){
      return MANUFACTURER;
    }

    public int getScreenSize(){
      return SCREEN_SIZE;
    }

    public boolean power(){
       powerOn = !powerOn;
       return powerOn;
    }

    public int getDecreaseVolume(){
      return volume--;
    }

    public int getIncreaseVolume(){
      return volume++;
    }

    //turns power into a string
    public String getPower(){
      if(powerOn){
        return "On";
      }
      return "Off";
    }


    //set methods
    public void setVolume(int vol){
      volume = vol;
    }

    public void setChannel(int chan){
      if(chan>0 && chan<MAXCHANNEL){
        channel = chan;
      }
      else{
        channel = channel;
      }
    }

    public void setScreenSize(int Size){
      SCREEN_SIZE = Size;
    }

    public void setManufacturer(String Man){
      MANUFACTURER = new String(Man);
    }

    //method to see all the variables for one tv
    public String toString(){
      return (" " + getManufacturer() + ", " + getScreenSize() +", "
      + getPower()+ ", "+ getVolume()+ ", "+getChannel());
    }





}
