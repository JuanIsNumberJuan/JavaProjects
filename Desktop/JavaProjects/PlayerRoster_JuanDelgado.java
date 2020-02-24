//CSC 121
import java.util.Scanner;


public class PlayerRoster_JuanDelgado {
  public static void main(String[] args) {
    /* Type your code here. */

    Scanner userInput = new Scanner(System.in);

    for(int x = 1; x<=5;x++){
      System.out.println("Enter player " +x+"'s jersey number: ");
      jerseyNum[x-1] = userInput.nextInt();
      if(jerseyNum[x-1]>=100 || jerseyNum[x-1]<0){
        System.out.println("Jersey Number has to be between 0 and 99");
        return;
      }

      System.out.println("Enter player "+x+"'s rating: ");
      rating[x-1] = userInput.nextInt();
      if(rating[x-1]>=10 || rating[x-1]<=0){
        System.out.println("Rating has to be between 1 and 9");
        return;
      }
    }
    System.out.println();
    for(int y = 1; y<=5; y++){
      System.out.println("Player "+y+" -- Jersey number: "+jerseyNum[y-1]+", Rating "+rating[y-1]);
    }

    System.out.println("\nMENU \nu - Update player rating \na - Output players above a rating \nr - Replace player \no - Output roster \nq - Quit");
    char choice = userInput.next().charAt(0);
    Menu(choice);


  }

  static int [] jerseyNum = new int[5];
  static int [] rating = new int[5];





  public static char Menu(char a){
    Scanner user = new Scanner(System.in);

    if('u' == a || 'U' == a){
      System.out.println("Enter a jersey number: ");
      int jerNum = user.nextInt();
      for(int x = 1; x <=5; x++){
        if(jerseyNum[x-1] == jerNum){
          System.out.println("Enter new rating for player: ");
          int jerRate = user.nextInt();
          if(jerRate>=10 || jerRate<=0){
            System.out.println("Rating has to be between 1 and 9");
            return a;
          }
          else{
            rating[x-1] = jerRate;
          }
        }
      }
    }

    else if('o' == a || 'O' == a){
      System.out.println("ROSTER: ");
      for(int y = 1; y<=5; y++){
        System.out.println("Player "+y+" -- Jersey number: "+jerseyNum[y-1]+", Rating "+rating[y-1]);
      }
    }

    else if('a' == a || 'A' == a){
      System.out.println("Enter a rating: ");
      int userNum = user.nextInt();
      for(int x=1; x<=5;x++){
        if(rating[x-1]> userNum){
          System.out.println("Player "+x+" -- Jersey number: "+jerseyNum[x-1]+", Rating "+rating[x-1]);
        }
      }
    }

    else if('r' == a || 'R'== a){
      System.out.println("Enter a jersey number: ");
      int replaceJersey = user.nextInt();
      for(int x = 1; x <=5; x++){
        if(replaceJersey == jerseyNum[x-1]){
          System.out.println("Enter a new jersey number: ");
          int newJersey = user.nextInt();
          if(newJersey>=100 || newJersey<0){
            System.out.println("Jersey Number has to be between 0 and 99");
            return a;
          }
          else{
            jerseyNum[x-1] = newJersey;
          }
          System.out.println("\nEnter a rating for the new player: ");
          int newRating = user.nextInt();
          if(newRating>=10 || newRating<=0){
            System.out.println("Rating has to be between 1 and 9");
            return a;
          }
          else{
            rating[x-1]=newRating;
          }
        }
      }
    }

    else if('q' == a || 'Q'==a){
      return a;
    }

    System.out.println("\nMENU \nu - Update player rating \na - Output players above a rating \nr - Replace player \no - Output roster \nq - Quit");
    char choice = user.next().charAt(0);
    System.out.println("");

    Menu(choice);
    return a;
  }

}
