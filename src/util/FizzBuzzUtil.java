/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Labs-DECC
 */
public class FizzBuzzUtil {
    /*
    * Method to evaluate a number in FizzBuzz game
    * @Params:
    * number: Integer - Number to be evaluated
    * @Return:
    * String : Return a message with the evaluation
    * @autor Jonathan Alejandro Zambrano
    */
    public static String evaluateFizzBuzz(Integer number){  //con mayuscula es un dato de una clase RapedClass
        try{
            boolean isFizz = number%3==0;
            boolean isBuzz = number%5==0;
            //Integer result = number%3;
            String message=""; 
            if(isFizz){
                message = "Fizz";
            }
            if(isBuzz){
                message += "Buzz";
            }
            if(!(isBuzz||isFizz)){ //(!isBuzz&&!isFizz)
                message = number.toString();
            }
            return message;
        }
        catch(ClassCastException e ){
            throw e;
        }
        
    }        
    
    
}
