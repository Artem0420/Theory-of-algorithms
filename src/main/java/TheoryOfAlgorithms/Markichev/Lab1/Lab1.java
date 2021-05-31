/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab1;

/**
 *
 * @author Ruslan
 */
public class Lab1 {
    private int number;
    
    public Lab1(){
        number = 240;
    }
    
    public Lab1(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number = " + number;
    }
    
    public String Plus(int value)
    {
        number += value;
        return Integer.toString(number);
    }
    
    public String Minus(int value)
    {
        number -= value;
        return Integer.toString(number);
    }
    
    public String Multiply(int value)
    {
        number *= value;
        return Integer.toString(number);
    }
    
    public String Divide(int value)
    {
        if(value == 0)
            return "Division by zero!";
        number /= value;
        return Integer.toString(number);
    }
}
