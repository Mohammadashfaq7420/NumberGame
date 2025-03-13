import java.util.*;
import java.lang.Math;
class Numbergame
{
    public static void main(String args[])
    {
        int random=(int)(Math.random()*100)+1;
        int chances=8;
        int score=0;
        boolean gameagain=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello User Wellcome to the Game ");
        System.out.println("You have "+chances+" chances in the Game");
        while (gameagain)
        {
            boolean guess=false;
            for(int i=1;i<=chances;i++)
            {
                System.out.println("Enter your "+i+" chance:");
                int userguess=sc.nextInt();
                if(random==userguess)
                {
                    score+=1;
                    guess=true;
                    System.out.println("Your guess was correct ");
                    System.out.println("You won the Game ");
                    break;
                }
                else if(random>userguess)
                {
                    System.out.println("Your guess is too Low ");
                }
                else
                {
                    System.out.println("Your guess is too High");
                }
            }
            if(guess==false)
            {
                System.out.println("you have finished your chances");
                System.out.println("The Actual Answer is "+random);
            }
            System.out.println("If you want to play press (Yes/No)");
            String s=sc.next();
            gameagain=s.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing ");
        System.out.println("your score is "+score);
    }
}