/*guess number*/
import java.util.Scanner;

/* Input loop and Output */
class Kazuate{
  public static void main(String[] args){
    Judge jd = new Judge();

    int answer = 10;
    int set = 0
    int count = 0;

    /* main loop */
    /* Input number */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter double-digit number : ");
    int test = scanner.nextInt();    
    /* Judge number */
    jd.setNumber(answer,test);
    set = jd.JudgeNumber();

    /* Finish game */

    

  }
}

/* Judge number */
class Judge{
    int answer;
    int test;

    void setNumber(int x, int y){
        answer = x;
        test = y;
    }
    int JudgeNumber(){
        /* Whether test number is greater than answer number*/
        if(test == answer){
            System.out.println("Your test number is correct!");
            return 0;

        }else if (test > answer){
            System.out.println("Your test number is higher than answer.");
            if((test - answer) > 20){
                System.out.println("Your test number is more than 20 different from the answer.");
            }
        }else{
            System.out.println("Your test number is lower than answer.");
            if((answer - test) > 20){
                System.out.println("Your test number is more than 20 different from the answer.");
            }
        }
        return 1;
    }
}

/* */
