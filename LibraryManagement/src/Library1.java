import java.util.Scanner;
public class Library1 {

	public static void main(String[] args) {
		
		char Next;
		
		
		System.out.println("								     Cloud5 Central Library");
		System.out.println("								     **********************");
		System.out.println("								          Login Portal");
		System.out.println("								          xxxxxxxxxxxx\n\n");
		
		
		String username="Admin";
		System.out.println("Enter username here: ");
		System.out.println("-------------------");
		Scanner admin = new Scanner(System.in);
		
		String uname = admin.nextLine();
		
		int password = 12345;
		System.out.println("Enter password here: ");
		System.out.println("-------------------");
		int pass = admin.nextInt();
		
		if( pass== password && uname.equals(username)) {
			
			
		
		
		
		
		 System.out.println("								Welcome To Cloud5 Central Library");
		 System.out.println( "  					**************************************************************************************");
		
		 System.out.println("\n\n\nEnter 1 to search book:");
		 System.out.println("Enter 2 to add book:");
		 System.out.println("Enter 3 to issue book:");
		 System.out.println("Enter 4 to return book:");
		
		 System.out.println("Enter 0 to complete and end");
		 Scanner input = new Scanner(System.in);
		
		 do {
		 System.out.println("Enter your option to procced: ");
		
		
		 int opt = input.nextInt();
		
		 switch(opt)
		 {
		  
		 case 1:
			
			library one = new library();
			
			one.search();
			break;
			
		 case 2:
			library two = new library();
			two.addbook();
			break;
			
		 case 3:
			library three = new library();
			three.issue();
			break;
			
		 case 4:
			
			library four = new library();
			four.returnbook();
			break;
			
		 case 0:
			
			library zero = new library();
			
			zero.exit();
			break;
			default:
				
				System.out.println("Please select from 1-4 and 0 to END");
			
			
		 }
		
		 System.out.println("\nPress Y to choose next and  N to end");
		
		 Next= input.next().charAt(0);
		
		
		 }
		 while(Next=='y' || Next=='Y');
		
		 if(Next=='N'|| Next == 'n')
		 {
			library nxt= new library();
			
			nxt.exit();
			
			
		 }
			
		
		}
		
		else
		{
			System.out.println("Wrong password or username ,try again");
		}
		
  }
	
	
}




class library
{
	
	static int sl,num;
	static String Name,date1,date2;
	void search()
	{
		String[] Book = {"Biology1","Biology2","Python","OOP","Basic C++","Linear Algebra","Circuit1"};
		//System.out.println(Book.length);
		boolean present= false;
		
		
		

		String Bookname;
		System.out.println("Enter book name to search: ");
		
		Scanner input = new Scanner(System.in);
		
	     Bookname= input.nextLine();	
		
		//System.out.println(Bookname);
		for(int i=0;i<Book.length;i++)
		{	
		
		 if(Book[i].equals(Bookname))
		 {
		    present = true;
		
			
			break;
			
			 
		 }
		 		 
		}
		
		if(present==true)
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
			
		}
		
			
		
	}
	
	
	
	void addbook()
	{
		System.out.println("Enter book name here: ");
		Scanner input1 = new Scanner(System.in);
		
		 Name = input1.nextLine();
		 
		 System.out.println("Enter book serial number here: ");
		 sl = input1.nextInt();
		 
		System.out.println("Added book name:" + Name +"\nBook serial number:" + sl);
		
	}
	
	void issue()
	{
		Scanner input2 = new Scanner(System.in);
		System.out.println("Book name: ");
		
	     Name = input2.nextLine();
	    
	    System.out.println("Serial Number:");
	    
	     sl= input2.nextInt();
	     input2.nextLine();
	     System.out.println("Issue Date: ");
	     date1 = input2.nextLine();
	    
	     
	     //System.out.println("Number of books: ");
	     
	      //num = input2.nextInt();
	     
	      
	     System.out.println("Book return date: ");
	     date2 = input2.nextLine();
	     
	     System.out.println("Number of books: ");
	     
	      num = input2.nextInt();
	  
	     
	     
	     
	     
	    
 
	}
	
	int getid()
	{
		return sl;
	}
	void returnbook()
	{
		System.out.println("Enter Student name and book serial number:");
		
		Scanner input3 = new Scanner(System.in);
		String  name = input3.nextLine();
		
		int booksl = input3.nextInt();
		
		if(sl==booksl)
		{
			System.out.println("This book details: ");
			System.out.println("Book Name: "+Name);
			System.out.println("Book serial number:  " + sl);
			System.out.println("Issued date: "+ date1);
			System.out.println("Number of books issued: " +num);
			System.out.println("Book return date: "+ date2);
				
		}
		else
		{
			System.out.println("Invalid Book serial number!");
			
		}
		
	}
	
	void exit()
	{
		System.out.println("Operation Closed");
		System.exit(0);
	}
	
	
   

 }

























