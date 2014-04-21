

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class guessanumber {
    int rng,guess;
    String input;
    Random random = new Random();
    public boolean guessRight;
    
    public void GetANumber()
    {                       
        rng = random.nextInt(9)+1;
        return;       
    }
    
    public boolean guessRight()
    {
        if(guess == rng)
        {
            return true;
        }
        return false;      
    }
}



