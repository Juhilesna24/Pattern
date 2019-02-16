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
class next
{
    int a[]=new int[20];
    int b[] = new int[20];
    int i,j,temp,n,c=0;
    void fun()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        n = in.nextInt();
        System.out.println("Enter array");
        for(i=1;i<=n;i++)
        {
            a[i]=in.nextInt();
            b[i]=a[i];
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(b[i]<b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(a[i]<b[j])
                {
                    System.out.print(b[j]+"\t");
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print("_\t");
            }
            c=0;
        }
    }
}
public class greater {
    public static void main(String args[])
    {
        next n = new next();
        n.fun();
    }
    
}
