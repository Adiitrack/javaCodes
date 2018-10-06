import java.util.Scanner;
public class NmuberGess{
    public static void main(String[] args){
        int randomNumber =(int)(Math.random() * 100) + 1;
        boolean found=false ;

        System.out.println("i have to choosen a random number between 1 and 100");
        System.out.println("try to guess it");
        Scanner scanner=new Scanner(System.in);
        for(int i=10;i>0;i--){
            System.out.println("you have" + i+  "guess left , choose wisely" );
            int guess = scanner.nextInt();

            if(guess<randomNumber){
                System.out.println("it is greater than"+guess+".");
            }
            if(guess>randomNumber){
                System.out.println("it is lesser than"+guess+".");
            }
            if(guess==randomNumber){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Congrats u win");
        }
        else{
            System.out.println("you loose");
            System.out.println("the number is"+ randomNumber+".");
        }

    }
}
