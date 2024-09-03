/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author ADMIN
 */
public class ActivityTwoClassTwo extends ActivityTwoClassOne {
    
    public ActivityTwoClassTwo(int Size) {
        super(Size);
    }
    
    public void countElements(){
        
        System.out.println("Elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(StackArray[i]);
            }
            
        if (!isEmpty()) {
            int count = top + 1;
            System.out.println("The number of elements in the Stack: " + count);
        }else {
            System.out.println("Stack is Empty.");
        }
    }
}

    
    
    
    


