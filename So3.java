import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class So3
{
	public static void main(String args[] ) throws Exception 
    {
	 Scanner s = new Scanner(System.in);
    Book[] books = new Book[4];     
        
        for(int i=0;i<books.length;i++)
        {
            int id = s.nextInt();
            s.nextLine();
            String title = s.nextLine();
            String author = s.nextLine();
            double price = s.nextDouble();
            s.nextLine();
            
            
            books[i]= new Book(id,title,author,price);
        }
      double  min = s.nextDouble();
      double max = s.nextDouble();
    
        Book[] newbooks = booksWithPriceRange(books,min,max);
        
       for(int i=0;i<4;i++)
       {
            //System.out.println(b.getid());
       
             System.out.println(newbooks[i].getId());
        }
	}
    
    
    
    //implement business methods here
    public static Book booksWithPriceRange(Book newbooks[],double min,double max)
    
    {
        
		Book[] res=new Book[4];
		res=null;
       for(int i=0;i<4;i++) {
           if(newbooks[i].getPrice()>min && newbooks[i].getPrice()<max)
           {
               res[i]=newbooks[i];
                         	               
           }
           break;    
       }
	       return res;
		
    }

}

class Book {
	 private int id;
	    private String title;
	    private String author;
	    private double price;
		public Book(int id, String title, String author, double price) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
}
