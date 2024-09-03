/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activitytwo;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class ActivityTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner nvm = new Scanner (System.in);
        
        int stackSize;
        boolean condition = false;
        
        System.out.print("Set the size of the Stack: ");
        stackSize = nvm.nextInt();

        ActivityTwoClassFive Stack = new ActivityTwoClassFive(stackSize);
        System.out.println("Current size of the Stack: " + stackSize);
        
        while(!condition){
            
            System.out.println("");
            System.out.println("................................");
            System.out.println("PICK A NUMBER TO COMMAND");
            System.out.println("");
            System.out.println("[0] Exit");
            System.out.println("[1] Push an element input");
            System.out.println("[2] Pop an element input");
            System.out.println("[3] Peek at top stack input");
            System.out.println("[4] Peek at bottom stack input");
            System.out.println("[5] Loop through stack input");
            System.out.println("[6] Remove all the duplicate inputs");
            System.out.println("[7] Count all the elements");
            System.out.println("[8] Add stack to another stack");
            System.out.println("[9] Peek other stack");
            System.out.println("");
            System.out.print("Input: ");
            int choice = nvm.nextInt();
            System.out.println("................................");
            System.out.println("");

            
            switch (choice){
                case 0:
                    System.out.println("Well done!");
                    condition = true;
                    break;
                case 1:
                    System.out.println("Push data to stack: ");
                    double push = nvm.nextDouble();
                    Stack.push(push);
                    break;
                case 2:
                    System.out.println("Pop this element: " + Stack.pop());
                    break;
                case 3:
                    System.out.println("Peek at the top: " + Stack.peek());
                    break;
                case 4:
                    System.out.println("Peek at the bottom: " + "" + Stack.bottomElement());
                    break;
                case 5:
                    Stack.loopStack();
                    break;    
                case 6:
                    Stack.removeDuplicates();
                    break;
                case 7:
                    Stack.countElements();
                    break;
                case 8:
                    Stack.stackStack();
                    break;    
                case 9:
                    Stack.loopNewStack();
                    break;        
                default:
                    System.out.println("ERROR!");
                    condition = false;
                    break;
            }        
        
        } 
    }        
}            
       
