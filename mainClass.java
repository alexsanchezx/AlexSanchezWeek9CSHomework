

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class mainClass {
    public static void main(String[] args) {
        Random random = new Random();
        String input,message;
        Scanner tKeyboard = new Scanner(System.in);
        int guessesLeft=3;
        guessanumber game = new guessanumber();
        game.guessRight=false;
        do
        {
            input = JOptionPane.showInputDialog("Im thinking of a number between 1-10, you have " +guessesLeft+ " chances to guess it, What number am I thinking of?");
            game.guess =Integer.parseInt(input);
            game.GetANumber();
            {
                if (game.guessRight == true)
                {
                    message = String.format("You guessed it Right! Good Job\n");
                    JOptionPane.showMessageDialog(null, message);
                    break;
                }
                
                if(game.guess>game.rng && guessesLeft>0)
                {
                    message = String.format("You guessed too high!\n");
                    
                }
                else if(game.guess<game.rng && guessesLeft>0)
                {
                    message = String.format("You guessed too low!\n");
                }
                else
                {
                    message = String.format("Your out of guesses.. Game Over!");
                    
                }
            }
            
            JOptionPane.showMessageDialog(null, message);
            guessesLeft--;
            
        }while(game.guessRight=false||guessesLeft>0);
        
    }
}