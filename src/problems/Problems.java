/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.math.BigInteger;

/**
 *
 * @author gerai
 */
public class Problems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numbers n = new Numbers();
        System.out.println(n.numbersLetters());
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(1000);
        BigInteger c = a.pow(1000);
       double pnum = n.greatestProduct(12);
       //n.fib(100);
        System.out.println(n.findAllAmicables(100000));
        //System.out.printf("dexp: %.0f\n", n.greatestProduct(12));
        
    }
    
    public static void multiply(){
        Palindrome p = new Palindrome();
        System.out.print(p.isPal("13531"));
        int max =0;
        for(int i=100;i<1000; i++){
            for(int j=100; j<1000; j++){
                int sum = i*j;
                if(p.isPal(String.valueOf(sum))){
                    if (sum>max){
                        max=sum;
                    }
                }
            }
        }
        System.out.print(max);
    }
    
}
