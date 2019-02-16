/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoho;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class pat
{
    String s;
    int i,j,n,k=0;
    //char a[] = new char[20];
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the odd String");
        s=in.next();
        char a[] = new char[20];
        char b[] = new char[20];
        n=s.length();
        a=s.toCharArray();
        int d=(n/2);
        System.out.println(d);
        for(i=d;i<n;i++)
        {
            b[k]=a[i];
            k++;
            //System.out.println(k);
        }
        for(i=0;i<d;i++)
        {
          b[k]=a[i];
          k++;
          //System.out.println(k);
        }
        for(i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
        System.out.println("Answer");
        for(i=0;i<n;i++)
        {
            for(j=0;j<i+1;j++)
            {
                System.out.print(b[j]);
            }
            System.out.print("$");
            System.out.print("\t");
        }
        
    }
}
public class pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    pat p = new pat();
    p.fun();
    
    }
    
    
}
