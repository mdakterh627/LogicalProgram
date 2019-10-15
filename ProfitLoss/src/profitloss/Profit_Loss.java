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
        System.out.println("Enter the Apple price: ");
        float sell1 = sc.nextFloat();
        System.out.println("Enter the Mango price: ");
        float sell2 = sc.nextFloat();
        
        System.out.println("Total Apple profit: "+ (sell1*10)*7.5/100);
        System.out.println("Total Mango profit: "+ (sell2*5)*10/100);
        
   
    }
    
}
