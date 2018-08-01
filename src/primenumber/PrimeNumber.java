
package primenumber;

import java.util.Scanner;


public class PrimeNumber {
    
    public static int findFactor(int a){
        
        int sum = 0;
        
        
        
        if(a > 2000000){
            sum = -1;
        }
        else {
        for(int i=1;i<=a;i++){
            int count=0;
            
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    count++;
                }
            }
            
            if(count == 2){
                sum += i;
            }
            
            
            
        }
        
        
        }
        
        
        
        
        
        return sum;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = findFactor(n);
        System.out.println("Sum of primes"+result);
        
       
        
        
    }
    
}
