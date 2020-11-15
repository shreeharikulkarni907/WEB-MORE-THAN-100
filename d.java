import java.util.*;
import java.io.*;
import java.lang.*;
class extra6
{
    public String bookid;
    public String booktitle;
    public int no_of_pages;
    public int year_of_pub;
    public String author;
    public String publisher;
    public double price;
    public int n;
    /*public extra6(String id,String title,String au,String pub,int count)
    {
        bookid=id;
        booktitle=title;   
        author=au;
        publisher=pub;
        n=count;

    }
    */
    /*public extra6()
    {
        no_of_pages=new int[3];
        price=new double[3];
        year_of_pub=new int[3];
    }
    */
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the book");
        price=sc.nextDouble();
        System.out.println("Enter the no of pages of book ");
        no_of_pages=sc.nextInt();
        System.out.println("Enter the year of publication ");
        year_of_pub=sc.nextInt();
        System.out.println("Enter the Author Of The Book");
        author=sc.next();
        System.out.println("Enter the Name Of The Book");
        booktitle=sc.next();
        System.out.println("Enter the Book Id");
        bookid=sc.next();
        System.out.println("Enter the Publisher Of The Book");
        publisher=sc.next();
        
    }
    /*public static double most_exp()
    {
        double max=0;
        for(int i=0;i<n;i++)
        {
            if(price[i]>max)
            {
                max=price[i];
            }

        }
        return max;
    }
    public static int pub_in_2020()
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(year_of_pub[i]==2020)
            count++;
        }
        return count;
    }
    public static int least()
    {
        int min=no_of_pages[0];
        for(int i=0;i<n;i++)
        {
            if(no_of_pages[i]<min)
            {
                min=no_of_pages[i];
            }
        }
        return min;
    }
    */
    public void display()
    {
        System.out.println("Book Name is " + booktitle);
        System.out.println("BookiD is " + bookid);
        System.out.println("Author of book is " + author);
        System.out.println("Publisher of book is " + publisher);
    }

}

class test
{
    public static void main(String args[])
    {
        System.out.println("Read The Deatils Of The Book 1");
        extra6 ob1=new extra6();
        ob1.read();
        System.out.println("Read The Deatils Of The Book 2");
        extra6 ob2=new extra6();
        ob2.read();
        System.out.println("Read The Deatils Of The Book 3");
        extra6 ob3=new extra6();
        ob3.read();
        maximun(ob1,ob2,ob3);
        noofcount(ob1,ob2,ob3);
        least_pages(ob1,ob2,ob3);
    }
    public static void maximun(extra6 ob1,extra6 ob2,extra6 ob3)
    {
        System.out.println("Displaying The Deatils Of the Costliest Book");
        if(ob1.price>ob2.price&&ob1.price>ob3.price)
        {
            ob1.display();
        }
        else if(ob2.price>ob1.price&&ob2.price>ob3.price)
        {
            ob2.display();
        }
        else
        {
            ob3.display();
        }
    }
    public static void noofcount(extra6 ob1,extra6 ob2,extra6 ob3)
    {
        int c=0;
        if(ob1.year_of_pub==2020)
        {
            c++;
        }
        if(ob2.year_of_pub==2020)
        {
            c++;
        }
        if(ob3.year_of_pub==2020)
        {
            c++;
        }
        System.out.println("Number of books Published in 2020 is " + c);
    }
    public static void least_pages(extra6 ob1,extra6 ob2,extra6 ob3)
    {
        System.out.println("Displaying the details of the book with least Number of pages ");
        if(ob1.no_of_pages<ob2.no_of_pages&&ob1.no_of_pages<ob3.no_of_pages)
        {
            ob1.display();
        }
        else if(ob2.no_of_pages<ob1.no_of_pages&&ob2.no_of_pages<ob3.no_of_pages)
        {
            ob2.display();
        }
        else
        {
            ob3.display();
        }
    }
}