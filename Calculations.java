/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author dell
 */
public class Calculations 
{
    float cal(float x,float y,String s)
    {
        System.out.println(x);
        System.out.println(y);
        switch(s)
        {
            case "+":
                return (x+y);
            case "-":
                return (x-y);
            case "*":
                return (x*y);
            case "/":
                if(y==0)
                {
                    return 0;
                }
                else
                {
               return (x/y);
                }
             default:
                 return 0; 
        }
    } 
}
