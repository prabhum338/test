import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class So2 {
    public static void main(String args[] ) throws Exception 
    {
    Book[] books = new Book[4];
        double minPrice = 0;
        double maxPrice = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            
            books[i]= new Book(id,title,author,price);
        }
        minPrice = sc.nextDouble();
        maxPrice = sc.nextDouble();sc.nextLine();
        
        Book z = booksWithPriceRange(minPrice,maxPrice,books);
        
        for(Book b:z)
	   {
		   if(b!=null)
		   {
	
             System.out.println(b.getid());
		   }	 
        }
    }

    
    //implement business methods here
    public static Book booksWithPriceRange(double minPrice,double maxPrice,Book bo[])
    
    {
        Book x=new Book[bo.length];
		int y=0;
       for(int i=0;i<bo.length;i++) 
       {
           if(bo[i].getprice()>minPrice && bo[i].getprice()<maxPrice)
           {
               x[y]=bo[i];
			   y++;
 
           }
           
       }
       return x;
    }

}
class Book
{
    //implement class here
    private int id;
    private String title;
    private String author;
    private double price;
    
    public Book(int id,String title,String author,double price)
    {
        super();
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        
    }   
    public int getid()
    {
        return id;
    } 
	
	public void setid(int id)
	{
		this.id=id;
	}
    public String gettitle()
    {
        return title;
    } 
	
	public void settitle(String title)
	{
		this.title=title;
	}
    public String getauthor()
    {
        return author;
    } 
	
	public void setauthor(String author)
	{
		this.author=author;
	}
    public double getprice()
    {
        return price;
    } 
	
	public void setprice(double price)
	{
		this.price=price;
	}
}