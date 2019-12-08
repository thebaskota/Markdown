import java.util.Scanner;

public class BankAccount
{
 // here we will have the data types
 static Scanner input = new Scanner(System.in);
 static String bank_name = "Rajesh Dai ko Bank";
 static String bank_address = "Rajesh dai ko Ghar";
 long ac_num;
 String cus_name;
 String cus_address;
 String cus_phone;
 boolean status; 
 
 //Constructors go here
 BankAccount(){
    this.cus_name = "";
    this.cus_address = "";
    this.cus_phone = "";
    this.status = true;
    
    }
 //default constructor
 
 //here we will write the methods
 static void welcomeToAll()
 {
     System.out.println("Welcome to "+bank_name);
     System.out.println("Sathi ko lagi yo haat salaam, Dushman ko lagi you haat falaam");
     
    }//welcometoallend
 static void switchCase()
 {
     System.out.println("1. for opening account \n 2.for checking balance \n 3. for ..... \n");
     
    }//switchcaseend
 void account()
 {  
        this.cus_name = input.nextLine();
        this.cus_address = input.nextLine();
        this.cus_phone = input.nextLine();
     
    }
    public static void main(String[] args)
    {
       //this is the main function.
       boolean flag = true;
       while(flag )
       {
         welcomeToAll();
         System.out.println("Please state your business ");
         switchCase();
         BankAccount cust = new BankAccount();
         int switch_case = input.nextInt();
         input.nextLine();
         
         switch(switch_case)
         {
            case 1://opening an account
            //statements here
            System.out.println("Enter your name, Address and phone number");
            cust.account();
            System.out.println("welcome to the bank " + cust.cus_name);
            System.out.println("Just to check: \n address : " +cust.cus_address +" \n phone number: "+cust.cus_phone);
            break;
            
            case 2://checking the balance
            
            
            break;
            
            case 3://Deposit an amount
            //statements here
            break;
            
            case 4://withdraw an amount
            //statements here
            break;
            
            case 5://Apply for credit card
            //statements here
            break;
            
            case 6://POS
            //statements here
            break;
            
            case 7://pay bills
            //statements here
            break;
            
            case 8://Loan
            //statements here
            break;
            
            case 0:
            flag = false;//endng the loop
            System.out.println("thank you for visiting");
            break;
            
            default:
            System.out.println("please enter the valid option");
            break;
         }//switchkobracketend
        }//whilekobracketend
    }//mainkobracketend
}//classkobracketend 
