package com.company;


import java.lang.*;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Boolean quit = false;
        String imput = " ";
        String output = " ";

        //String qualifier = "Why are you saying that ?  ";

        String[] qualifier = {"Why do you say that ?", "You seem to think that ", "So, you are concerned that  "};

        String[] hedges = {"Please tell me more", "Many of my patients tell me the same thing","It is getting late", "maybe we had better quit" };

        String[] answers = new String[10];

        System.out.println(" Hello, my Name is Eliza, Can I have your firstname, please ?  ");

        while (quit == false )
        {

            String userAnswer = sc.next();

            if (sc.next() != null)
            {
                System.out.println(" Thanks, How can I help you today   ?");
            }
            else System.out.println(" Hello, how can I help you");

            /*

            String[] a = userAnswer.split(" ");

            for (int i = 0; i < a.length; i++)
            {


                if (a[i].equalsIgnoreCase("sick")
                        || a[i].equalsIgnoreCase("down")
                        || a[i].equalsIgnoreCase("bad")
                        || a[i].equalsIgnoreCase("not")
                        ) {
                    System.out.println(" I am sorry to hear that!, please tell me more  ");
                }
                */

                //output += a[i] + " ";
            }
            System.out.println( " Do you want to leave? (Q to quit)");
            String  quitInput = sc.next();

            if (quitInput.equalsIgnoreCase("q"))
            {
                quit = true;
            }

        }
    }

                /*
                else {
                    throw new IllegalArgumentException("String " + string + " does not contain -");
                }
                if (userAnswer.equalsIgnoreCase(answers[i])) {
                    System.out.println(" Have you already called us recently ?");
                    break;
                }

            }



            //  here goes a switch
            //  if the user enters  words like "Problem", "sick", "disease" "down
            //  or another word in a negative context Eliza will parse the response
            //  hopefully wil 'detect' the negative word and respond with
            //  "I am sorry to hear that" then logic continues with next question

        } while (quit == !true);
    }
}


//  if(input = "BYE")
//    response "it was nice talking to you "
//System.out.println("Please press 'Q' to quit ");

            /*
            package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner  sc = new  Scanner(System.in);

        boolean quit = false;

        String[] movies = new String [50];

        do
        {
            System.out.println(" Enter a movie name  ");

              String userMovie = sc.next();

              for (int i=0; i < movies.length; i++)
              {
                  if (userMovie.equalsIgnoreCase(movies[i]))
                  {
                      System.out.println("Movie already exists");
                      break;
                  }
                  else if (movies[i] == null){
                  movies[i] =userMovie;  //assigning user input to the array
                  break;
                  }
                  else
                  {
                      continue;
                  }
              }
            System.out.println("Do you want to quit ? (Q to quit)");
              String quitInput = sc.next();
            if (quitInput.equalsIgnoreCase ("q"))
            {
                 quit= true;
            }
        }
        while  (quit ==false);
        System.out.println(" Current movie list ");
        for (int i=0; i< movies.length; i++)
        {
            if( movies[i] != null) {
            System.out.println(movies[i]);
        }

            sc.close();
        }

    }

    }

             */