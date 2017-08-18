package cashier;

import java.io.*;

public class Cashier {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)throws Exception  
    {
       int i=0,j=0,k=0,amt;
       String str;
       System.out.println("Enter the ammount: ");
       BufferedReader buf;
       InputStreamReader isr;
       isr = new InputStreamReader(System.in);
       buf = new BufferedReader(isr);
       str = buf.readLine();
       amt = Integer.parseInt(str);
       while(amt>=100)
       {
           amt=amt-100;
           i+=1;
       }
       while(amt>=50)
       {
           amt=amt-50;
           j+=1;
       }
       while(amt>=10)
       {
           amt=amt-10;
           k+=1;
       }
       System.out.println("Number of Notes of 100 = "+i);
       System.out.println("Number of Notes of 50 = "+j);
       System.out.println("Number of Notes of 10 = "+k);
    }
    
}
