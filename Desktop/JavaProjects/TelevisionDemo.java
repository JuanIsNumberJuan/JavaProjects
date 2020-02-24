//Juan Delgado
//CSC 121-80

import java.util.Scanner;  // Needed for the Scanner class

/**
   This class demonstrates the Television class.
*/

public class TelevisionDemo
{
  public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice

      // Declare and instantiate a television object
      Television bigScreen = new Television("Toshiba", 55);

      // Turn the power on
      bigScreen.power();

      // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreenSize() +
                         " inch " +
                         bigScreen.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());

      System.out.println();   // For a blank line

      System.out.println(bigScreen);
      System.out.println();
      // HERE IS WHERE YOU DO TASK #5

      Television portable = new Television("Sharp", 19);

      portable.power();
      portable.power();

      int channel;

      if(portable.power()==true){
        System.out.println("A "+ portable.getScreenSize() +
        " inch " +
        portable.getManufacturer() +
        " has been turned on.");
      }
      else{
        System.out.println("A "+ portable.getScreenSize() +
        " inch " +
        portable.getManufacturer() +
        " has been turned off.");
      }

      System.out.print("What channel do you want? ");
      channel = keyboard.nextInt();
      // Change the channel on the television
      portable.setChannel(channel);

      // Decrease the volume of the television
      portable.decreaseVolume();
      portable.decreaseVolume();
      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         portable.getChannel() +
                         " Volume: " +
                         portable.getVolume());

      System.out.println();
      System.out.println(portable);





   }
}
