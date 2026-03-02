import java.util.Scanner;
public class guessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int real_num = 5;

        System.out.println("welcome to the guessing program :)");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        while(num != real_num){

            if (num > real_num){
                System.out.println("too high , try again");
                num = sc.nextInt();

            } if (num < real_num){
                System.out.println("too low , try again");
                num = sc.nextInt();

            } if  (num == real_num){
                System.out.println("You guessed correctly!");
            }

        }
    }
}
