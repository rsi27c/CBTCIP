import java.util.Random;
import java.util.Scanner;

 class imp{

    int Guess;

    public imp(int Guess)
    {
        this.Guess=Guess;
    }

} 

public class guess {
    public static void main(String a[])
    {
         int Guesses=0,mode,points=0;
        Scanner in = new Scanner(System.in);

        Random numb = new Random();

        System.out.printf("Select a difficulty \n 1. Easy \n 2. Normal \n 3.Hard \n");

        mode=in.nextInt();

    switch (mode) {
    case 1:
       {     
        int toguess=numb.nextInt(1,10);

        System.out.println("You've choosed easy mode,Enter your guess between 1-10");

      while(Guesses <= 5)
      {
        imp obj = new imp(in.nextInt());

    if(Guesses == 5)
    {
    System.out.println("Better luck next time");
    break;
   }

        if(obj.Guess == toguess)
       {
        Guesses++;
        
            if(Guesses==1 && obj.Guess == toguess)
            {
                points+=10;

                    System.out.println("******************************************");
                    System.out.println("You found the Number in First try "+toguess);
                    System.out.println("Your Guesses count = "+Guesses);
                    System.out.println("Your Final Score : "+points);
                    System.out.println("******************************************");
                    break;
                }
        
            else if(Guesses==2 && obj.Guess == toguess)
            {
                points+=7;

                    System.out.println("******************************************");
                    System.out.println("You found the Number "+toguess);
                    System.out.println("Your Guesses count = "+Guesses);
                    System.out.println("Your Final Score : "+points);
                    System.out.println("******************************************");
                    break;
                }

                else if(Guesses==3 && obj.Guess == toguess)
                {
                    points+=5;
    
                        System.out.println("******************************************");
                        System.out.println("You found the Number "+toguess);
                        System.out.println("Your Guesses count = "+Guesses);
                        System.out.println("Your Final Score : "+points);
                        System.out.println("******************************************");
                        break;
                    }

                    else if(Guesses==4 && obj.Guess == toguess)
                    {
                        points+=3;
        
                            System.out.println("******************************************");
                            System.out.println("You found the Number "+toguess);
                            System.out.println("Your Guesses count = "+Guesses);
                            System.out.println("Your Final Score : "+points);
                            System.out.println("******************************************");
                            break;
                        }

                        else if(Guesses==5 && obj.Guess == toguess)
                        {
                            points+=1;
            
                                System.out.println("******************************************");
                                System.out.println("You found the Number "+toguess);
                                System.out.println("Your Guesses count = "+Guesses);
                                System.out.println("Your Final Score : "+points);
                                System.out.println("******************************************");
                                break;
                            }
       }

       else if(obj.Guess < toguess)
       {
        System.out.println("Try again little higher!!");
        Guesses++;
        continue;
       }

       else if(obj.Guess > toguess)
       {
        System.out.println("Try again little lower!!");
        Guesses++;
        continue;
       }

       else{
        System.out.println("Enter a valid number between 1-100");
       }
       
      }

            break;
    
    }
    case 2:
{
    int toguessN=numb.nextInt(1,50);

    System.out.println("You've choosed Normal mode,Enter your guess between 1-50");

  while(Guesses <= 5)
  {
    imp obj = new imp(in.nextInt());

    if(Guesses == 5)
    {
    System.out.println("Better luck next time");
    break;
   }

   if(obj.Guess == toguessN)
   {
    Guesses++;
    
        if(Guesses==1 && obj.Guess == toguessN)
        {
            points+=10;

                System.out.println("******************************************");
                System.out.println("You found the Number in First try "+toguessN);
                System.out.println("Your Guesses count = "+Guesses);
                System.out.println("Your Final Score : "+points);
                System.out.println("******************************************");
                break;
            }
    
        else if(Guesses==2 && obj.Guess == toguessN)
        {
            points+=7;

                System.out.println("******************************************");
                System.out.println("You found the Number "+toguessN);
                System.out.println("Your Guesses count = "+Guesses);
                System.out.println("Your Final Score : "+points);
                System.out.println("******************************************");
                break;
            }

            else if(Guesses==3 && obj.Guess == toguessN)
            {
                points+=5;

                    System.out.println("******************************************");
                    System.out.println("You found the Number "+toguessN);
                    System.out.println("Your Guesses count = "+Guesses);
                    System.out.println("Your Final Score : "+points);
                    System.out.println("******************************************");
                    break;
                }

                else if(Guesses==4 && obj.Guess == toguessN)
                {
                    points+=3;
    
                        System.out.println("******************************************");
                        System.out.println("You found the Number "+toguessN);
                        System.out.println("Your Guesses count = "+Guesses);
                        System.out.println("Your Final Score : "+points);
                        System.out.println("******************************************");
                        break;
                    }

                    else if(Guesses==5 && obj.Guess == toguessN)
                    {
                        points+=1;
        
                            System.out.println("******************************************");
                            System.out.println("You found the Number "+toguessN);
                            System.out.println("Your Guesses count = "+Guesses);
                            System.out.println("Your Final Score : "+points);
                            System.out.println("******************************************");
                            break;
                        }
   }

   else if(obj.Guess < toguessN)
   {
    System.out.println("Try again little higher!!");
    Guesses++;
    continue;
   }

   else if(obj.Guess > toguessN)
   {
    System.out.println("Try again little lower!!");
    Guesses++;
    continue;
   }

   else{
    System.out.println("Enter a valid number between 1-50");
   }
   
  }

        break;
}
    case 3:
{
    int toguessH=numb.nextInt(1,100);

    System.out.println("You've choosed Hard mode,Enter your guess between 1-100");

  while(Guesses <= 5)
  {
    imp obj = new imp(in.nextInt());

    if(Guesses == 5)
    {
    System.out.println("Better luck next time");
    break;
   }

   if(obj.Guess == toguessH)
   {
    Guesses++;
    
        if(Guesses==1 && obj.Guess == toguessH)
        {
            points+=10;

                System.out.println("******************************************");
                System.out.println("You found the Number in First try "+toguessH);
                System.out.println("Your Guesses count = "+Guesses);
                System.out.println("Your Final Score : "+points);
                System.out.println("******************************************");
                break;
            }
    
        else if(Guesses==2 && obj.Guess == toguessH)
        {
            points+=7;

                System.out.println("******************************************");
                System.out.println("You found the Number "+toguessH);
                System.out.println("Your Guesses count = "+Guesses);
                System.out.println("Your Final Score : "+points);
                System.out.println("******************************************");
                break;
            }

            else if(Guesses==3 && obj.Guess == toguessH)
            {
                points+=5;

                    System.out.println("******************************************");
                    System.out.println("You found the Number "+toguessH);
                    System.out.println("Your Guesses count = "+Guesses);
                    System.out.println("Your Final Score : "+points);
                    System.out.println("******************************************");
                    break;
                }

                else if(Guesses==4 && obj.Guess == toguessH)
                {
                    points+=3;
    
                        System.out.println("******************************************");
                        System.out.println("You found the Number "+toguessH);
                        System.out.println("Your Guesses count = "+Guesses);
                        System.out.println("Your Final Score : "+points);
                        System.out.println("******************************************");
                        break;
                    }

                    else if(Guesses==5 && obj.Guess == toguessH)
                    {
                        points+=1;
        
                            System.out.println("******************************************");
                            System.out.println("You found the Number "+toguessH);
                            System.out.println("Your Guesses count = "+Guesses);
                            System.out.println("Your Final Score : "+points);
                            System.out.println("******************************************");
                            break;
                        }
   }

   else if(obj.Guess < toguessH)
   {
    System.out.println("Try again little higher!!");
    Guesses++;
    continue;
   }

   else if(obj.Guess > toguessH)
   {
    System.out.println("Try again little lower!!");
    Guesses++;
    continue;
   }

   else{
    System.out.println("Enter a valid number between 1-100");
   }
   
  }

        break;

}
    default:
        {
            System.out.println("Enter a valid input");
            break;
        }
    }

    }
}
