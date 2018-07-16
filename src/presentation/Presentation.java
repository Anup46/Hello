package presentation;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import static presentation.Smith.br;

public class Presentation {
    
private static int MAX_ITERATIONS = 30;
private static String isLychrel(long number)
{
for (int i = 0; i < MAX_ITERATIONS; i++)
{
number = number + reverse(number);
if (isPalindrome(number))
return  " not a lychrel number\n";
}
return " a lycheral number\n";
}
private static boolean isPalindrome(final long number)
{
return number == reverse(number);
}
private static long reverse(long number)
{
long reverse = 0;
while (number > 0)
{
long remainder = number % 10;
reverse = (reverse * 10) + remainder;
number = number / 10;
}
return reverse;
}

public static void main(String[] args) throws IOException
{
    System.out.print("Check for Lychrel number 'press 1' : \n");
    System.out.print("Check for Smith number 'press 2' : \n");
    System.out.print("Check for Cyclic number 'press 3' : \n");
    int h=Integer.parseInt(br.readLine());
    if( h==1){
    
    System.out.print("Enter a Number : ");
    int number =Integer.parseInt(br.readLine());
    System.out.println(number + " is " + isLychrel(number));}

    else if(h== 2){
    Smith ob=new Smith();
    System.out.print("Enter a Number : ");
    int n=Integer.parseInt(br.readLine());
    int a=ob.sumDig(n);// finding sum of digit
    int b=ob.sumPrimeFact(n); //finding sum of prime factors
     
    System.out.println("Sum of Digit = "+a);
    System.out.println("Sum of Prime Factor = "+b);
     
    if(a==b)
    System.out.print("It is a Smith Number\n");
    else
    System.out.print("It is Not a Smith Number\n");}
    
    
    else if(h==3){
            Scanner sc = new Scanner( System.in ); 
            System.out.print("Input a number: "); 
            String strnum = sc.nextLine().trim();
            BigInteger s = new BigInteger(strnum);
            int len = strnum.length()+1;
            String str = String.valueOf(len);
            BigInteger n1 = new BigInteger(str);
            StringBuilder buf = new StringBuilder();
            for(int i = 0 ; i < (len-1); i++) {
                buf.append('9');
            }
            BigInteger total = new BigInteger(buf.toString());
            if(s.multiply(n1).equals(total)) {
                System.out.println("It is a cyclic number.\n");
            }
            else {
                System.out.println("Not a cyclic number.\n");
            }    
    } 
    else
    {
        System.out.println("You entered a wrong number!!\nPlease try again with correct number.\n");
    }
}
}
