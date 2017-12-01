import java.util.Scanner;

public class IncomeTax
{
    public static void main(String[] args)    
    {   
        double personalAllowance, basicLimit, basicRate,higherLimit,higherRate,additionalRate, netIncome, tax, basicTax, higherTax, additionalTax ;
        personalAllowance = 11000;
        basicLimit = 43000;
        basicRate = 0.2;
        higherLimit = 150000;
        higherRate = 0.4;
        additionalRate = 0.45;
        Scanner keyboard = new Scanner(System.in);       
        tax = 10;
        System.out.println("Enter net income.\n" + "Do not include a pound sign or any commas.");
       
        
        netIncome = keyboard.nextDouble();
        
        if (netIncome <= 11000)
        {    
            tax = 0;
        }    
        else if (netIncome > personalAllowance && netIncome <= basicLimit) 
        {   // tax = 20% of money above £11000 
            tax = (netIncome - personalAllowance)*basicRate;
            
        }    
        else if (netIncome > basicLimit && netIncome <= higherLimit)
        {
            basicTax = (basicLimit - personalAllowance)*basicRate;
            higherTax = (netIncome - basicLimit)*higherRate;
            tax = basicTax + higherTax;
        }    
        else if (netIncome > higherLimit)
        {   
            basicTax = (basicLimit-personalAllowance)*basicRate;
            higherTax = (higherLimit - basicLimit)*higherRate;
            additionalTax = (netIncome - higherLimit)*additionalRate;
            tax = basicTax + higherTax + additionalTax;
        }
        
        System.out.printf(" Tax due = £%.2f " , tax);    
        
        
    }    
}   