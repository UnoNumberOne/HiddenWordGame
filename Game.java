import java.util.Scanner;
public class Game
{
    private String hidden;
    private String guess;
    private String hint;

    public static void main(String[] args)
    {
        Game game = new Game();
        game.run();
    }
    public void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter a word that someone will guess");
        hidden = kb.nextLine();

        int hiddenLength = hidden.length();

        //write loops here
        while(!hidden.equals(guess))
        {
            hint = "";
            System.out.println("Enter a " + hiddenLength + " letter word");
            guess = kb.nextLine();

            for(int i = 0; i < hidden.length(); i++)
            {
                if(hidden.substring(i, i+1).equals(guess.substring(i, i+1)))
                {
                     hint += guess.substring(i, i+1);
                }
                else if(hidden.indexOf(guess.substring(i, i+1))!= -1)
                {
                     hint += "+";
                }
                else
                {
                    hint += "*";
                }
            }
            System.out.println(hint);
        }
        System.out.println("You Guessed the correct word");
    }
}
