import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        //type casting
        // int x = (int)'a';
        // System.out.println(x);

        System.out.print("\nEnter your name: ");
        String username = input.next();

        System.out.println(String.format("\nHello %s", username));

        System.out.print("Would you like to continue? Y or N ");
        
        char playAlong = input.next().charAt(0);
        
        while (playAlong == 'Y' || playAlong == 'y') {
            System.out.println("Let's begin!");

            System.out.print("What is the name of your favorite pet?: ");
            String petName = input.next();
            System.out.print("What is your lucky number?: ");
            int luckynum = input.nextInt();
            System.out.print("What is favorite quarterback jersey number?");
            int qB = input.nextInt();
            System.out.print("What is two-digit model year of their car?" );
            int carModel = input.nextInt();
            System.out.print("What is the first name of the their favorite actor or actress?" );
            String favAct = input.next();
            System.out.print("Enter a random number between 1 and 50: ");
            int randomNum = input.nextInt();

            int random = (int)((Math.random()*5)+1);
            int magicBall = random * luckynum;

                while ( magicBall > 75){
                    magicBall = magicBall - 75;
                }
                    
            int numOne = (int)petName.charAt(2);
            int numTwo = carModel + luckynum;
            int numThree = randomNum - random;
            int numFour = (int)favAct.charAt(0);
            int numFive = qB + random;
                
                while( numOne > 65){
                    numOne = numOne - 65;
                } 

                while( numTwo > 65){
                    numTwo = numTwo - 65;
                } 
           
                while( numThree > 65){
                    numThree = numThree - 65;
                } 
            
                while( numFour > 65){
                    numFour = numFour - 65;
                } 
            
                while( numFive > 65){
                    numFive = numFive - 65;
                } 
            
            System.out.printf("Lottery Numbers: %d, %d, %d, %d, %d Magic Ball: %d", numOne, numTwo, numThree, numFour, numFive, magicBall);

            System.out.println("\nWould you like to play again? Y OR N ");
            playAlong = input.next().charAt(0);
        }

        System.out.println("\nHave a nice day!");
    input.close();
    }
}