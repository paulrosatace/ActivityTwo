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
public class ActivityTwoClassOne {
    
    double [] StackArray;
    int maxSize;
    int top;
   
    Stack<Double> newStack = new Stack<> ();
    
    public ActivityTwoClassOne (int Size){
        maxSize = Size;
        StackArray = new double[maxSize]; 
        top = -1;
    }
    
    public void push(double numberValue){
        if (!isFull()){
            StackArray[++top]=numberValue;   
        }else {
            System.out.println("Stack is full!");
        }
    }        
    
    public double pop(){
            if (!isEmpty()){
                return StackArray[top--];
            }else{
                System.out.println("Stack is empty.");
                return -1;
            }
    }
         
    public double peek(){
            if (!isEmpty()){
                return StackArray[top];
            }else{
                System.out.println("Empty");
                return -1;
            }
    }
           
    public void loopNewStack(){
        if (isEmpty()){
            System.out.println("Stack is Empty.");
        }else {
            System.out.println("New Stack Elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(newStack.get(i));
            }
        }    
    }       
    
    public void loopStack(){
        if (isEmpty()){
            System.out.println("Stack is Empty.");
        }else {
            System.out.println("These are the pushed elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(StackArray[i]);
            }
        }    
    }       
    
    public double bottomElement(){
        if(!isEmpty()){
            return StackArray[0];
        }else {
            System.out.println("Stack is empty. Thus, cannot peek element.");
            return StackArray[0];
        }
    }        
    
    public boolean isEmpty(){
            return (top == -1);
    }
            
    public boolean isFull(){
            return (top == maxSize -1);
    }
}            

    
    

