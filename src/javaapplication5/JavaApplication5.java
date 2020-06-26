/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Moosa Raza
 */

import java.util.Scanner;

class Book{
    String title;
    public void setTitle(String s){
        title = s;
    }
    public String getTitle(){
        return title;
    }
}

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Book obj = new Book();
        System.out.print("Enter the title name of your book: ");
        String input = sc.nextLine();
        obj.setTitle(input);
        System.out.println("The title is: " + obj.getTitle());
    }
}
