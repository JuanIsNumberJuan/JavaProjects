//Juan Delgado
//CSC 121
import java.util.Scanner;


public class MonthDays{
  int x;
  int y;
  public MonthDays(int month, int year){
    x = month;
    y = year;
    getNumberOfDays(x,y);
  }
//ik i could have made this short but when I noticed time was ticking
  public int getNumberOfDays(int a, int b){
    int days;
    if(a == 1)
    {
      days = 31;
    }
    else if(a == 2)
    {
      if(b%100==0 && b%400==0){
        days = 29;
      }
      else if(b%100!=0 && b%4==0){
        days = 29;
      }
      else{
        days = 28;
      }
    }
    else if(a == 3){
      days = 31;
    }
    else if(a == 4){
      days = 30;
    }
    else if(a == 5){
      days = 31;
    }
    else if(a == 6){
      days = 30;
    }
    else if(a == 7){
      days = 31;
    }
    else if(a == 8){
      days = 31;
    }
    else if(a == 9){
      days = 30;
    }
    else if(a == 10){
      days = 31;
    }
    else if(a == 11){
      days = 30;
    }
    else if(a == 12){
      days = 31;
    }
    else{
      System.out.println("Not a correct Month");
      days = 0;
      return days;
    }

    System.out.println(days);

    return days;

  }


}
