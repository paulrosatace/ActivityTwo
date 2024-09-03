/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

/**
 *
 * @author ADMIN
 */
public class ActivityTwoClassFour extends ActivityTwoClassThree{
    
    public ActivityTwoClassFour(int Size) {
        super(Size);
    }
    public double peek(){
        if (!isEmpty()){
            return StackArray[top];
        }else {
            System.out.println("Stack is empty. Thus, cannot peek element.");
            return -1;
        }    
    }        

}
