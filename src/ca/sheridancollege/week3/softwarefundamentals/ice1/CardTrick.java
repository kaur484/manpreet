/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by MANPREET KAUR MANPREET KAUR
STUDENT NUMBER: 991342529
 */
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args){
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            int v = (int) (Math.random() * 13 + 1);
            magicHand[i].setValue(v);
            int s = (int)(Math.random()*3);
            magicHand[i].setSuit(Card.SUITS[s]);
           
            System.out.println(magicHand[i].getSuit()+"  "+ magicHand[i].getValue());
        }
        Scanner obj = new Scanner (System.in);//scanner object
        Card eight = new Card();//object for the eight class
       
        System.out.println("Enter the value for card (1-13):");
        int userChoice = obj.nextInt();
        
        
        System.out.println("Enter the suit: 0 for Hearts, 1 for Diamonds, 2 for Spades and 3 for  Clubs");
        int userSuits = obj.nextInt();
        boolean flag =false;
        
        switch(userSuits){
            case 0: 
               eight.setSuit(Card.SUITS[0]);
            break;
            case 1: 
               eight.setSuit(Card.SUITS[1]);
            break;
            case 2: 
               eight.setSuit(Card.SUITS[2]);
            break;
            case 3: 
               eight.setSuit(Card.SUITS[3]);
            break;         
        }
        eight.setValue(userChoice);
         //comparing the values if present in array
         
         for(int i =0; i <magicHand.length; i++){
             if(eight.getValue()== magicHand[i].getValue()  && eight.getSuit()== magicHand[i].getSuit()){                
                 System.out.println("CARD FOUND");
                 
               flag = true;
         }
         
    }
         if(flag = false){
                 
             System.out.println("CARD NOT FOUND");       
             }     
    
}
}