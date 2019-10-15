/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profitloss;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Profit_Loss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        float cost = sc.nextFloat();
        System.out.println("Enter the sell price: ");
        float sell = sc.nextFloat();
        
        float PriceDifference = sell-cost;
        if (cost<sell){
            System.out.println("Your Profit of: "+ PriceDifference);
        }else if(cost==sell){
            System.out.println("No profit or loss");
        }else{
        System.out.println("Your loss of: "+ PriceDifference);
        
    
    }
    }
    
}
