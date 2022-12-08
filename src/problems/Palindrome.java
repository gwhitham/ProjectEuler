/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author gerai
 */
public class Palindrome {
    
    public boolean isPal(String str){
        int length = str.length();
        for(int i = 0; i<=length/2; i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
    
}
