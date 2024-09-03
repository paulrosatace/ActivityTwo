/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author ADMIN
 */
public class ActivityTwoClassFive extends ActivityTwoClassFour{
    
    public ActivityTwoClassFive(int Size){
        super(Size);
    }
    
    public void stackStack(){
        
        if (isEmpty()){
                System.out.println("Stack is Empty.");
        }
         
        for (int i = 0; i <= top; i++){
                if (!isFull()){
                    System.out.println("Added to new Stack: " + StackArray[i]);
                    newStack.push(StackArray[i]);
                }else {
                    System.out.println("Your Stack is Full!");
                }           
        } 
    }
}
    
   