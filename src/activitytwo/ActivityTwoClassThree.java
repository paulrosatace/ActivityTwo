/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytwo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
public class ActivityTwoClassThree extends ActivityTwoClassTwo {
    public ActivityTwoClassThree(int Size) {
        super(Size);
    }
    
    public void removeDuplicates(){
        Set <Double> qwe = new HashSet<>();
            int newTop = -1;
            boolean duplicate = false;
        
        System.out.println("Elements: ");
            for (int x = top; x >= 0; x--) {
                System.out.println(StackArray[x]);
            }
        
        for (int i = 0; i <= top; i++){
            if (qwe.contains(StackArray[i])){
                System.out.println("Duplicate elements detected: " + StackArray[i]);
            }else {
                qwe.add(StackArray[i]);
                StackArray[++newTop] = StackArray[i];
            }
        }
        
            top = newTop;
            if (duplicate == false){
                System.out.println("Duplicate elements successfully removed!");
            }
    }
}     

