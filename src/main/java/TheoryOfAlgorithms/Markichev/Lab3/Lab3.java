/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab3;

import java.util.Arrays;
import java.util.Random;

public class Lab3 
{
    private int[] array;
    
    public Lab3(int length)
    {
        if(length < 0)
            length = 20;
        array = new int[length];
    }
    
    public int GetArrayLength()
    {
        return array.length;
    }
    
    public void InitArray()
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) Math.pow(i + 1, 2);
        }
    }
    
    public String GetNumber(int k)
    {
        String buff = "";
        for (int i = 0; i < array.length; i++)
            buff += Integer.toString(array[i]);
        
        if(k < 1 || k > buff.length())
            return "Out of range!";
        
        return Character.toString(buff.charAt(k - 1));
    }
    
    public String DisplayArray()
    {
        return Arrays.toString(array);
    }
}
