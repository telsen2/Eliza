package com.company;


import java.util.Scanner;
import java.util.Random;


public class Main {

    static final int length = 2;
    static final int array_size = 5;

    public static void main(String[] args) {

        Random choice = new Random();
        int index = choice.nextInt(length);
        Scanner sc = new Scanner(System.in);

        Boolean quit = false;
        String input = " ";
        String output = " ";

        String[] sampleQualifierArr = new String[array_size];
        sampleQualifierArr[0] = "Why do you say that ";
        sampleQualifierArr[1] = "You seem to think that";
        sampleQualifierArr[2] = "So, you are concerned that";

        String[] sampleHedgesArr = new String[array_size];
        sampleHedgesArr[0] = "Please tell me more why";
        sampleHedgesArr[1] = "Many of my clients tell me the same thing";
        sampleHedgesArr[2] = "You seem to be tired, we can continue later";

        String sentence;
        sentence = "";


        System.out.println("My name is Eliza, how can I help you ");

        do {
            //    System.out.println(input);
            System.out.print("Enter response: ");
            input = sc.nextLine();

            String[] a = input.split(" ");
            for (int i = 0; i < a.length; i++) {

                if (a[i].equalsIgnoreCase("me")) {
                    a[i] = "you";
                }
                if (a[i].equalsIgnoreCase("my")) {
                    a[i] = "your";
                }
                if (a[i].equalsIgnoreCase("i")) {
                    a[i] = "you";
                }
                if (a[i].equalsIgnoreCase("am")) {
                    a[i] = "are";
                }
                output = output + a[i] + " ";

            }

            System.out.println(sampleQualifierArr[index] + output + "?");

            System.out.println(sampleHedgesArr[index] + output + "?");

            System.out.println("To quit press q or continue press any key: ");
            String quitInput = sc.next();

            if (quitInput.equalsIgnoreCase("q")) {
                quit = true;
            }
            else {
                output = " ";
            }

        } while (quit == false);


        //       System.out.println(output);

//        System.out.println("My name is Eliza, how can I help you ");
//        input = "So " + sc.nextLine() +  "?";

//        sentence = sc.nextLine();

        // System.out.println(selection);
//        System.out.println(sampleQualifierArr[index] + sentence);


    }
}


//        int selection  = choice.nextInt(3);
//
//        int min = 7;
//        int max = 12;
//
//
//        for (int =0; i < 10; i++)
//        {
//            int answer = Random.nextInt(max +1 - min) + min;
//            System.out.println(answer);
//
//        }
//        switch (selection)
//        {
//            case 1:
//                    System.out.println (sampleQualifierArr[index] + sentence);
//                    break;
//            case 2:
//                    System.out.println (sampleHedgesArr[index]);
//                    break;
//        }


////class hedges {
////            for(  int i = 0; i< sampleHedgesArr.length;i++)
////            {
////                String hedge = sampleHedgesArr[i];
////                System.out.println(hedge[] );
////            }
////}
//
//            while (quit == false) {
//
//                String userAnswer = sc.next();
//
//                if (sc.next() != null) {
//                    System.out.println(" Thanks, How can I help you today   ?");
//                } else System.out.println(" Hello, how can I help you");

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
//            }
//            System.out.println(" Do you want to leave? (Q to quit)");
//            String quitInput = sc.next();
//
//            if (quitInput.equalsIgnoreCase("q")) {
//                quit = true;
//            }
//
//        }
//    }

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