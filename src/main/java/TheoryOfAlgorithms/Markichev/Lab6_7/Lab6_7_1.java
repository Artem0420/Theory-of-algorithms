/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab6_7;

public class Lab6_7_1 {
    private String _digits;
    private int _digitsNumber;
    
    public Lab6_7_1(int number)
    {
        _digits = Integer.toString(number);
        _digitsNumber = _digits.length();
    }
    
    public int MultiplyNumbers(int i, int res)
    {
        if(i == _digitsNumber)
            return res;
        int currentDigit = Integer.parseInt(String.valueOf(_digits.charAt(i)));
        res *= currentDigit;
        res = MultiplyNumbers(i + 1, res);
        return res;
    }
}
