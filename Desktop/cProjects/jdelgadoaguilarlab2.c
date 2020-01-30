/*
Juan Delgado
CSC-121
1/28/20
Lab #2
*/

#include<stdio.h>
#include<stdlib.h>

int main(void)
{
  guess();
  return EXIT_SUCCESS;
}

int guess(void){
    int magicNum = 6, userNum, first, second, third, userGuess;
    printf("Enter a number bewteen 1 and 10 inclusive.\n");
    scanf("%d", &userNum);
    if (userNum>0 && userNum<=10){
      first = userNum + magicNum;
      second = userNum * magicNum;
      third = userNum - magicNum;

      printf("%d + magic number = %d\n",userNum, first);
      printf("%d * magic number = %d\n", userNum, second);
      printf("%d - magic number = %d\n", userNum, third);

      printf("What is your guess? \n");
      scanf("%d", &userGuess);

      if (userGuess == magicNum) {
        printf("You are correct! You win\n");
      }
      else{
        printf("Sorry thats not it try again\n");
        guess();
      }
    }
    else{
      guess();
    }
}
