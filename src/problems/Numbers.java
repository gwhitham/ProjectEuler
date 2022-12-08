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
public class Numbers {
    
 public double sumPrime(int num){
     double count = 0;
     for(int i = 2; i<num; i++ ){
         if(isPrime(i)){
             count = count+i;
         }
     }
     return count;
 }
 
 public int fib(int num){
     int seq = 1;
     int prev = 1;
     int total = 0;
     int temp =0;
     while(seq<num){
         temp=seq;
         seq = seq+prev;
         prev=temp;
         System.out.println(seq);
         if(seq%2==0){
             total=total+seq;
         }
     }
     return total;
 }
 
 public int getTarget(int target){
     int [] arr = {1,2,5,10,20,50,100,200};
     int count = 0;
     for(int i = 0;i<arr.length-1;i++){
          if(target%arr[i]==0){
         count++;
         for(int j=0; j<target/arr[i+1];j++){
             
         }
     }
    
     }
     
     
     return count;
 }
 
 public void pythTrip(){
     double target = 1000;
     
     int a = 1;
     int b = 1;
     for(int i=1; i<800;i++){
         for(int j=1;j<800;j++){
             double num = (i*i)+(j*j);
             double check = Math.sqrt(num);
             if(check+i+j==target){
                 double result = check+i+j;
                 System.out.println(i+","+j+","+check);
             }
                     }
     }
     
     
 }
 
 
 
 
 public int countDays(int ys, int ye){
     int count = 0;
     int firstday = 2;
     for(int i=ys; i<=ye; i++){
         int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
         if(leapYear(i)){
             month[1]= 29;
         }
         for(int j:month){
             firstday = firstday+j;
             if(firstday%7==0){
                 count++;
             }
         }
         
     }
     return count;
 }
 
 public boolean leapYear(int year){
     if(year%4==0){
         if(year%100==0){
             if(year%400==0){
                 return true;
             }
             return false;
         }
         return true;
     }
     return false;
 }
 
 public BigInteger factorial(BigInteger num){
     
     BigInteger c = new BigInteger("1");
     if(num.equals(c)){
         return c;
     }
     else{
         return num.multiply(factorial(num.subtract(c)));
     }
 }
 
 public int numbersLetters(){
     int [] digits = {3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
     int [] decFromTwent = {6,6,5,5,5,7,6,6};
     int [] hundAndThous = {7,7};
     int count = 0;
     
     //1-19
     for(int i:digits){
         count = count+i;         
     }
     //20-99
     for(int i:decFromTwent){
         count = count+i;//20-90
         for(int j=0;j<9;j++){
             count = count+i+digits[j];//21-99
         }
     }
     
         for(int j=0;j<9;j++){
             count = count+7+digits[j];//100-900
             for(int i:digits){
                count = count+10+i+digits[j];   //101-919      
                }
             for(int i:decFromTwent){
                count = count+i+10+digits[j];//120-990
                    for(int k=0;k<9;k++){
                        count = count+i+digits[k]+10+digits[j];//121-999
                    }
     }
         }
                 
     
     
     
     
     
     return count+11;
 }
 
 
 public Double addDigits(String str){
     //String str = String.valueOf(num);
     int lengthS = str.length();
     
     double total = 0;
     
     for(int i =0; i<(lengthS); i++){
         total = total+(Double.parseDouble(str.substring(i, i+1)));
     }
     return total;
 }

 public int addDigitsInt(String str){
     //String str = String.valueOf(num);
     int lengthS = str.length();
     
     int total = 0;
     
     for(int i =0; i<(lengthS); i++){
         total = total+(Integer.parseInt(str.substring(i, i+1)));
     }
     return total;
 }
 
public int findAllAmicables(int num){
    int totalAm =0;
    for(int i=1; i<=num;i++){
        int a =findOneAmicable(i);
        int b = findOneAmicable(a);
        if(i==b&&a!=b){
            totalAm  = totalAm+i;
        }
    }
    return totalAm;
}
 
 public int findOneAmicable(int n){
     int [] list = getDivisros(n);
     int count=0;
     for(int item:list){
         count = count+item;
     }
     return count;
 }
   
public int [] getDivisros(int num){
    int [] list = new int[num];
    int count=0;
    for(int i =1; i<num/2+1; i++){
        if(num%i==0){
            list[count] = i;
            count++;
        }
    }
    
    return list;
}
 
 public boolean isPrime (int num){
     int count = 0;
     for(int i=num/2; i>0; i--){
         if(num%i==0){
             count++;
         }
     }
     if(count==1){
         return true;
     }
     return false;
 }
 
 public int squareofints(int num){
     int total = 0;
     for(int i =1; i<=num;i++){
         int number = i*i;
         total = total+number;
         
     }
     return total;
 }
    
 public int squareofaddedints(int num){
     int total = 0;
     for(int i =1; i<=num;i++){
     total = total+i;
    }
     return total*total;
 }
 
 public BigInteger sumPower(int num){
     BigInteger total = new BigInteger("0");
     
     for(double i =0; i<=num; i++){
         BigInteger val = new BigInteger("0");
         
         String test = String.valueOf(Math.pow(i, i));
         BigInteger a = new BigInteger(test);
         total.add(a) ;
     }
     return total;
 }
 
 public double greatestProduct(int num){
     String val = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
     double max = 0;
     double number = 0;
     for(int i =0; i<=val.length()-(num+1);i++){
         number = Integer.parseInt(String.valueOf(val.charAt(i)));
         for(int j =1; j<=num;j++){
             number = number*Integer.parseInt(String.valueOf(val.charAt(i+j)));
         }
         if(number>max){
             max=number;
         }
     }
     return max;
   
 }
 
}
