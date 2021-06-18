/*guess number*/
import java.util.Scanner;
import java.util.Random;

/* Input loop and Output */
class Kazuate{
  public static void main(String[] args){
    Random rand = new Random();
    Judge jd = new Judge();
    Scanner scanner = new Scanner(System.in);

    int answer = rand.nextInt(90)+10;
    //System.out.println(answer);
    int set = 0;
    /* main loop */
    System.out.println("ゲームを始めます : ");
    for(int count = 0; count < 5; count++){
        /* Input number */
        System.out.print("二桁の正の整数を入力してください : ");
        int test = scanner.nextInt();
        int digit = String.valueOf(test).length();

        while(digit!=2 || test <= 0){
            System.out.print("二桁の正の整数を入力してください : ");
            test = scanner.nextInt();
            digit = String.valueOf(test).length();        
        }
        /* Judge number */
        jd.setNumber(answer,test);
        set = jd.JudgeNumber();
        if(set==0){
            break;
        }
    }

    /* Finish game */
    String s = "正解は" + answer + "でした!";
    System.out.print(s);
    
  }
}

/* Judge number class*/
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
            System.out.println("正解です!");
            return 0;
        }else if (test > answer){
            if((test - answer) > 20){
                System.out.println("入力された数字は答えより20以上大きいです");
            }else{
                System.out.println("入力された数字は答えより大きいです");
            }
        }else{
            if((answer - test) > 20){
                System.out.println("入力された数字は答えより20以上小さいです");
            }else{
                System.out.println("入力された数字は答えより小さいです");
            }
        }
        return 1;
    }
}
