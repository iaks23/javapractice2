
package multiplenumber;

import java.util.Scanner;


public class MultipleNumber {
    
    public static int findFactors(int a){
        
        int sum = 0;
        
        if(a>899){
            sum = -1;
        }
        else {
            for(int i=1;i<a;i++){
                if(i%3==0){
                    sum += i;
                }
                else if(i%5==0){
                    sum += i;
                }
            }
        }
        
        
        return sum;
    }

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = findFactors(n);
        System.out.println("Sum of multiples of 3 & 5 is  "+result);
       
    }
    
}
