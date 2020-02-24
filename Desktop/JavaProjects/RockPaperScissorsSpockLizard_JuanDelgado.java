import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsSpockLizard_JuanDelgado{
  public static void main(String[] args){
    UInput(); //calls UInput method
  }

  public static void UInput(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Rock, Paper, Scissors, Spock, Lizard, Exit >>>");
    String choice = userInput.nextLine();   //used scanner

    Random random = new Random();   //used random
    int randomInt = random.nextInt(5); //uses numbers from 0-4

    if("exit".equals(choice.toLowerCase())){
      return;
    }
    if("scissors".equals(choice.toLowerCase()) || "rock".equals(choice.toLowerCase()) || "paper".equals(choice.toLowerCase())
      || "spock".equals(choice.toLowerCase()) || "lizard".equals(choice.toLowerCase()))
      //one whole statement so that it is visible without scrolling right
      //if any of the given options have been inputed then it will run the code
      {
        if(randomInt == 0){ //calls method
          System.out.println(rock(choice));
          UInput();
        }
        if(randomInt == 1){ //calls method
          System.out.println(paper(choice));
          UInput();
        }
        if(randomInt == 2){ //calls method
          System.out.println(scissors(choice));
          UInput();
        }
        if(randomInt == 3){ //calls method
          System.out.println(lizard(choice));
          UInput();
        }
        if(randomInt == 4){ //calls method
          System.out.println(spock(choice));
          UInput();
        }
      }
      else{ //if none of the userinputs have been chosen then it print invalid input
        System.out.println("Invalid Input");
        UInput();
      }
  }

  static String [] [] outcomes = {
    {"Tie game.", "Paper covers rock. Computer wins.", "Rock crushes scissors. Player wins.",
    "Rock crushes lizard. Player wins.", "Spock vaporizes rock. Computer wins."},

    {"Paper covers rock. Player wins.", "Tie game.", "Scissors cuts paper. Computer wins.",
    "Lizard eats paper. Computer wins.", "Paper disproves Spock. Player wins." },

    {"Rock crushes scissors. Computer wins.", "Scissors cuts paper. Player wins.", "Tie game.",
     "Scissors decapitates lizard. Player wins.", "Spock smashes scissors. Computer wins."},

     {"Rock crushes lizard. Computer wins.", "Lizard eats paper. Player wins.",
     "Scissors decapitates lizard. Computer wins.", "Tie game.", "Lizard poisons Spock. Player wins." },

     {"Spock vaporizes rock. Player wins.", "Paper disproves Spock. Computer wins.",
     "Spock smashes scissors. Player wins.", "Lizard poisons Spock.   Computer wins.", "Tie game." }
  };

  public static String rock(String a){  //it compares rock to user input
    String outcome = "";
    if("rock".equals(a.toLowerCase())){
        outcome = outcomes[0][0];
    }
    if("paper".equals(a.toLowerCase())){
      outcome = outcomes[1][0];
    }
    if("spock".equals(a.toLowerCase())){
      outcome = outcomes[2][0];
    }
    if("scissors".equals(a.toLowerCase())){
      outcome = outcomes[3][0];
    }
    if("lizard".equals(a.toLowerCase())){
      outcome = outcomes[4][0];
    }
    return outcome;
  }

  public static String paper(String b){ //it compares paper to user input
    String outcome = "";
    if("rock".equals(b.toLowerCase())){
      outcome = outcomes[0][1];
    }
    if("spock".equals(b.toLowerCase())){
      outcome = outcomes[4][1];
    }
    if("paper".equals(b.toLowerCase())){
      outcome = outcomes[1][1];
    }
    if("scissors".equals(b.toLowerCase())){
      outcome = outcomes[2][1];
    }
    if("lizard".equals(b.toLowerCase())){
      outcome = outcomes[3][1];
    }
    return outcome;
  }

  public static String scissors(String c){  //it compares scissors to user input
    String outcome = "";
    if("rock".equals(c.toLowerCase())){
      outcome = outcomes[0][2];
    }
    if("spock".equals(c.toLowerCase())){
      outcome = outcomes[4][2];
    }
    if("paper".equals(c.toLowerCase())){
      outcome = outcomes[1][2];
    }
    if("lizard".equals(c.toLowerCase())){
      outcome = outcomes[3][2];
    }
    if("scissors".equals(c.toLowerCase())){
      outcome = outcomes[2][2];
    }
    return outcome;
  }

  public static String lizard(String d){  //it compares lizard to user input
    String outcome = "";
    if("paper".equals(d.toLowerCase())){
      outcome = outcomes[1][3];
    }
    if("spock".equals(d.toLowerCase())){
      outcome = outcomes[4][3];
    }
    if("rock".equals(d.toLowerCase())){
      outcome = outcomes[0][3];
    }
    if("scissors".equals(d.toLowerCase())){
      outcome = outcomes[22][3];
    }
    if("lizard".equals(d.toLowerCase())){
      outcome = outcomes[3][3];
    }
    return outcome;
  }

  public static String spock(String e){ //it compares spock to user input
    String outcome = "";
    if("lizard".equals(e.toLowerCase())){
      outcome = outcomes[3][4];
    }
    if("paper".equals(e.toLowerCase())){
      outcome = outcomes[1][4];
    }
    if("scissors".equals(e.toLowerCase())){
      outcome = outcomes[2][4];
    }
    if("rock".equals(e.toLowerCase())){
      outcome = outcomes[0][4];
    }
    if("spock".equals(e.toLowerCase())){
      outcome = outcomes[4][4];
    }
    return outcome;
  }
}
