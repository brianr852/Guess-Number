/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random random = new Random();
    int secretNumber;
    int number;
    Scanner scan = new Scanner( System.in );
    
    do 
    {
      System.out.print( "Guess a number between 1 and 10 > ");
      number = scan.nextInt();
    }
    while (number < 1 || number >= 10);
    secretNumber = Math.abs(random.nextInt()) % 10;
    
    
    for (int i = 1; i <= 5; i++ )
    {
      if ( number > secretNumber)
      { 
        System.out.println( number + " is higher than the secret number ");
        System.out.println("Guess again! ");
        System.out.println( "Guess a number between 1 and 10 > ");
        number = scan.nextInt();
      }
      
      else if ( number < secretNumber)
      {
        System.out.println( number + " is lower than secret number" );
        System.out.println("Guess again! ");
        System.out.println( "Guess a number between 1 and 10 > ");
        number = scan.nextInt();
      } 
      else
      {
        System.out.println( " You guessed correctly"  );
      }  
   
    }
    }
    
}
