import java.util.Scanner;
public class Eb
{
  public static void main(String args[])
  {
     Scanner j=new Scanner(System.in);
     System.out.print("Enter Consumer number:");
     int consumerno=j.nextInt();
     j.nextLine();
     System.out.print("Enter Consumer Name:");
     String name=j.nextLine();
     System.out.print("Enter previous month reading:");
     int prev=j.nextInt();
     System.out.print("Enter Current month reading:");
     int curr=j.nextInt();
     j.nextLine();
     System.out.print("Enter the type of EB connection (domestic/commercial):");
     String connection=j.nextLine();
     int unit=curr-prev;
     double amount=0;
     if(connection.equalsIgnoreCase("domestic"))
     {
        if(unit>=1 && unit<=100)
        {
           amount=unit*1;
        }
        else if(unit>=101 && unit<=200)
        {
           amount=unit*2.5;
        }
        else if(unit>=201 && unit<=500)
        {
           amount=unit*4;
        }
        else if(unit>500)
        {
           amount= unit*6;
        }
        else
        {
           System.out.println("Invalid");
           return;
        }
      }
      else if(connection.equalsIgnoreCase("commercial"))
      {
        if(unit>=1 && unit<=100)
        {
           amount=unit*2;
        }
        else if(unit>=101 && unit<+200)
        {
           amount=unit*4.5;
        }
        else if(unit>=201 && unit<=500)
        {
           amount=unit*6;
        }
        else if(unit>500)
        {
           amount=unit*7;
        }
        else
        {
           System.out.println("Invalid unit");
           return;
        }
      }
      else
      {
           System.out.println("Invalid Connection tyPe");
           return;
      }
      System.out.println("\n Electricity Bill");
      System.out.println("Consumer Number:" +consumerno);
      System.out.println("Consumer Name:" +name);
      System.out.println("Connection type:" +connection);
      System.out.println("Units Consumed:" +unit);
      System.out.println("Bill Amount: Rs." +amount);
    }
}
      
      
      
      
        
