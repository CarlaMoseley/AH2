import java.util.*; 
public class Solution{

    static class PrimeNumber{
        public boolean isPrime(int n){
        if (n==1||n==0){   
            return false;
        }
        int x = n/n; 
        int z = n/1;            
        if (x== 1|| z==n){
           return true;
        }
        else return false; 
        }
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in); 
       System.out.println("Please enter the prime number");
       int i = scan.nextInt();
       PrimeNumber obj = new PrimeNumber(); 
       obj.isPrime(i);
       System.out.println(obj.isPrime(i));
    }
    }
}