import java.util.*;
public class Banky{
   static Scanner sc=new Scanner(System.in);
    HashMap<Integer, Integer> Acc_Details = new HashMap<>();
    HashMap<Integer, Double> Acc_Balance = new HashMap<>();

    public void createAccount(){
        System.out.println("Enter your Name: ");
        String Name=sc.next();

        Random rand=new Random();
        int Account_no=rand.nextInt(361000100,361000999);

        System.out.println("Enter your Pin code: ");
        int pin=sc.nextInt();

        System.out.println("Deposit some amount: ");
        double balance =sc.nextDouble();
        if(Acc_Details.containsValue(pin)) {
            System.out.println("Create an Unique Pin !!");
            return;
        }
        Acc_Details.put(Account_no, pin);
        Acc_Balance.put(Account_no, balance);
        System.out.println("ACCOUNT CREATED SUCCESSFULLY !!!!");
        System.out.printf("\n YOUR ACCOUNT INFORMATION IS SHOWN BELOW \n Name : "+Name+"\n Account.no: "+Account_no+"\n Balance : "+balance);
        System.out.println(" ");
    }
    public void withdraw(){
        System.out.println("Enter your Account Number: ");
        int Account_no=sc.nextInt();
        if(Acc_Balance.containsKey(Account_no) && Acc_Details.containsKey(Account_no)){
            System.out.println("Enter your PIN: ");
            int pin=sc.nextInt();
            if(Acc_Details.get(Account_no)==pin){
                System.out.println("Enter the amount to be debited");
                double bal=sc.nextDouble();
                if(Acc_Balance.get(Account_no)>=bal){
                   double newBal=Acc_Balance.get(Account_no)-bal;
                    Acc_Balance.replace(Account_no,newBal);
                    System.out.println("DEBITED RS."+bal+" SUCESSFULLY !!");
                    System.out.println(" ");
                }
                else{
                    System.out.println("INSUFFICIENT BALANCE !!");
                    System.out.println(" ");
                }
            }
            else{
                System.out.println("INVALID PIN!!!");
                System.out.println(" ");
            }
        }
        else{
            System.out.println("ACCOUNT NOT FOUND !!!");
            System.out.println(" ");
        }
    }

    public void deposit(){
        System.out.println("Enter your Account Number: ");
        int Account_no=sc.nextInt();
        if(Acc_Details.containsKey(Account_no)){
            System.out.println("Enter your PIN ");
            int pin=sc.nextInt();
            if(Acc_Details.get(Account_no)==pin){
                System.out.println("Enter the amount You want to deposit");
                double bal=sc.nextDouble();
                if(bal<0.00) {
                    System.out.println("Wrong format !!!");
                    System.out.println(" ");
                    return;
                }
                if(Acc_Balance.containsKey(Account_no)){
                   double newBal=Acc_Balance.get(Account_no)+bal;
                    Acc_Balance.replace(Account_no,newBal);
                    System.out.println("DEPOSITED RS."+bal+"SUCESSFULLY !!");
                    System.out.println(" ");
                }
                
            }
            else{
                System.out.println("Check your PIN !!!");
                System.out.println(" ");
            }
            
        }
        else{
            System.out.println("ACCOUNT NOT FOUND !!!");
            System.out.println(" ");
        }
    }
    public void transfer(){
        System.out.println("Enter the Sender's Account Number: ");
        int sac=sc.nextInt();
        System.out.println("Enter the Receiver's Account Number: ");
        int rac=sc.nextInt();
        if(Acc_Details.containsKey(sac) && Acc_Balance.containsKey(rac)){
            System.out.println("Enter your PIN: ");
            int pin =sc.nextInt();
            if(Acc_Details.get(sac)==pin){
                System.out.println("Enter the Amount to be transferred- ");
                double bal=sc.nextDouble();
                if(Acc_Balance.get(sac)>=bal){
                    double newBal=Acc_Balance.get(sac)-bal;
                    Acc_Balance.replace(sac, newBal);
                    double newBalr=Acc_Balance.get(rac)+bal;
                    Acc_Balance.replace(rac, newBalr);
                    System.out.println("TRANSFERRED RS."+bal+"SUCESSFULLY");
                }
                else{
                    System.out.println("INSUFFICIENT AMOUNT ");
                    System.out.println(" ");
                }
            }
            else{
                System.out.println("WRONG PIN !!");
                System.out.println(" ");
            }
        }
        else{
            System.out.println("ACCOUNT NOT FOUND !!");
        }
    }

    public void display(){
        System.out.println("Enter Your Account Number- ");
        int Account_no=sc.nextInt();
        if(Acc_Details.containsKey(Account_no)){
            System.out.println("Enter 4-Digit Transaction Pin- ");
            int pin=sc.nextInt();
            if (Acc_Details.get(Account_no)==pin) {
                System.out.println("CURRENT MONEY = "+Acc_Balance.get(Account_no)+". ");
                System.out.println(" ");
            }
            else{
                System.out.println("WRONG PIN!!");
                System.out.println(" ");
            }
        }
        else{
            System.out.println("ACCOUNT NOT FOUND!!!");
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Banky obj=new Banky();
        while(true){
            System.out.println("--------------WELCOME-------------------");
            System.out.println("SELECT 1 TO CREATE AN ACCOUNT");
            System.out.println("SELECT 2 TO DEPOSIT");
            System.out.println("SELECT 3 TO WITHDRAW");
            System.out.println("SELECT 4 TO TRANSFER MONEY TO ANOTHER ACCOUNT");
            System.out.println("SELECT 5 TO BALANCE");
            System.out.println("SELECT 6 TO EXIT");
            System.out.println(" ");
            System.out.println("Enter your Choice : ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    obj.createAccount();
                    break;
                case 2:
                    obj.deposit();
                    break;
                case 3:
                    obj.withdraw();
                    break;
                case 4:
                    obj.transfer();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please Enter a Valid Choice !!");
            }
        }
        
    }
}
