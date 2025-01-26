import java.util.*;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            //1. RANDOMIZED COMPUTER MOVE

            String[] availableMoves = {"Rock", "Paper", "Scissors"};

            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];

            System.out.println("Computer has chosen it's move.");
            System.out.println();
            System.out.println("Now it's your turn to choose. Good Luck!");
            System.out.println();

            //2. PLAYER MOVE

            String userMove;

            while (true)
            {
                System.out.println("Please choose a move from available moves : 'Rock', 'Paper' or 'Scissors' ");
                System.out.println("Enter the move you choose : ");

                userMove = sc.nextLine();

                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors"))
                {
                    System.out.println();
                    break;
                }

                System.out.println();
                System.out.println("Invalid Move!!");
                System.out.println("Please enter the move from the available moves only!");
                System.out.println();
            }

            //3. COMPARING THE MOVES & DECIDING THE WINNER

            System.out.println("Computer chose : " + computerMove);

            if (computerMove.equals(userMove))
            {
                System.out.println("It's a Tie !");
            }
            else if(userMove.equals("Rock")) {

                if(computerMove.equals("Paper")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
                else if(computerMove.equals("Scissors")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                }
            }

            else if(userMove.equals("Paper")) {

                if(computerMove.equals("Rock")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                }
                else if(computerMove.equals("Scissors")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            }

            else if(userMove.equals("Scissors")) {

                if(computerMove.equals("Paper")) {
                    System.out.println("You won!");
                    System.out.println("Congratulations!");
                }
                else if(computerMove.equals("Rock")) {
                    System.out.println("Computer won!");
                    System.out.println("Better luck next time!");
                }
            }

            System.out.println();
            String playAgain;
            System.out.println("Do you want to play again? ");

            while(true) {

                System.out.println("Type 'yes' or 'no' ");
                playAgain = sc.nextLine();

                if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
                    System.out.println();
                    System.out.println("*****************************************************************************");
                    System.out.println();
                    break;
                }
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println();
            }

            if(playAgain.equals("no") || playAgain.equals("No")) {
                break;
            }
        }
    }
}
