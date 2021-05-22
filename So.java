import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class So{
     public static void main(String[] args) {
        
        Cake[] cakes=new Cake[5];
        
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<cakes.length;i++)
        {
            int cakeId = sc.nextInt();sc.nextLine();
            String cakeName = sc.nextLine();
            int pound = sc.nextInt();
            double pricePerPound = sc.nextDouble();
            boolean b=sc.nextBoolean();
            cakes[i] = new Cake(cakeId,cakeName,pound,pricePerPound,b);
            
        }
        
        
        
        System.out.println(generateBill(cakes));
        
        Cake[] newArray=getegglessCake(cakes);
        for(Cake ck:newArray)
            if(ck!=null)
            {
            System.out.println(ck.getcakeId()+" "+ck.getcakeName());
            }
     }
    
    //implement business methods here
    public static double generateBill(Cake[] c)
    {
        double res=0;
        for(int i=0;i<c.length;i++)
        {
        res=res+(c[i].getpricePerPound())*(c[i].getpound());
        if(c[i].getb())
        {
			res=(res+50);
            
        }
        else
        {
           res=res+0; 
        }
        }
        return res*1.02;
    }
    
    public static Cake[] getegglessCake(Cake[] c)
    {
        Cake[] x=new Cake[5];
        for(int i=0;i<c.length;i++)
        {
           if(c[i].getb())
           {
              x[i]=c[i]; 
           }  
        }
        return x;
    }
}

class Cake
{
    //implement class 
    private int cakeId;
    private String cakeName;
    private int pound;
    private double pricePerPound;
    private boolean b;
    public Cake(int cakeId,String cakeName, int pound,double pricePerPound,boolean b)
    {
        super();
        this.cakeId=cakeId;
        this.cakeName=cakeName;
        this.pound=pound;
        this.pricePerPound=pricePerPound;
        this.b=b;
        
    }
    public int getcakeId()
    {
        return cakeId;
    } 
     public String getcakeName()
    {
        return cakeName;
    } 
     public int getpound()
    {
        return pound;
    } 
     public double getpricePerPound()
    {
        return pricePerPound;
    } 
     public boolean getb()
    {
        return b;
    } 
    
}