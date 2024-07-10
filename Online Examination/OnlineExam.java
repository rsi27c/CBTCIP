import java.util.HashMap;
import java.util.Scanner;

public class OnlineExam {
	HashMap<String, String> details = new HashMap<String, String>();
    Scanner in = new Scanner(System.in);

    public void login() {
        System.out.println("\n********** Welcome to Online Exam Portal **********\n");
        System.out.println("1.Create a new accouunt \n 2.Already have a account");
        System.out.println("\n Enter your choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
            	signUp();
                break;
            case 2:
                config();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
                login();
        }
    }

    public void config() {
        
        System.out.println("Enter your Username: ");
        String temp=in.next();
        String userName = in.nextLine();
        System.out.println("Enter a Password: ");
        String password = in.nextLine();

        if (details.containsKey(userName) && details.get(userName).hashCode() == password.hashCode()) {
            System.out.println("Logged in Successfully!");
            main();
        } else {
            System.out.println("Invalid Username or Password !! Please SignUp or check your password!!");
            login();
        }
    }

    public void signUp() {
        System.out.println("Enter your Username: ");
        String temp=in.next();
        String userName = in.nextLine();
        if (details.containsKey(userName)) {
            System.out.println("User Already Exists ! Please try Logging in.");
            login();
        } else {
            System.out.println("Enter Password: ");
            String password = in.nextLine();
            details.put(userName, password);
            System.out.println("Sign Up Successful! Please Login to continue:)");
            login();
        }
    }

    public void main() {
        System.out.println("\n1.Forgot Password\n2.Start test\n3.Logout");
        System.out.println("\n Enter your choice: ");
        int check = in.nextInt();
        switch (check) {
            case 1:
                update();
                main();
                break;
            case 2:
                Exam();
                main();
                break;
            case 3:
                System.out.println("**********Successfully logged out***********");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }

    public void update() {
        System.out.println("\n----- Update your Password -----");
        System.out.println("Enter your Username: ");
        String id = in.next();

        if (details.containsKey(id)) {
            System.out.println("Enter New Password: ");
            String newpd = in.nextLine();
            details.replace(id, newpd);
            System.out.println("Profile Updated Successfully!");
        } else {
            System.out.println("User does not exist...");
            System.out.println("Profile Update Failed!");
        }
    }

    public void Exam() {
        long start = System.currentTimeMillis();
        long terminate = start + 60 * 1000;
        int score = 0;
        int c = 0, w = 0;
        char ans;
        System.out.println("\n\n***** Test Started *****");
        System.out.println("You have 1 Minute to answer each question. Select the options wisely... ");
        System.out.println("Each question gives +2 marks for a correct answer and -1 mark for a wrong answer.");
        System.out.println("All the very best!!");

        while (System.currentTimeMillis() < terminate) {
            System.out.println("\nQ1.how Number of primitive data types in Java are?");
            
            System.out.println("a.6\nb.7\nc.8\nd.9");
            System.out.println("Answer:");
            ans = in.next().charAt(0);
            if (ans == 'c') {
                c += 1;
            } else
                w -= 1;

            System.out.println("\nQ2 When an array is passed to a method, what does the method receive?");
            System.out.println("a.Referance of an array\nb.A copy of the Array\nc.Length of the array\nd.copy of the first element");
            System.out.println("Answer:");
            ans = in.next().charAt(0);
            if (ans == 'a') {
                c += 1;
            } else
                w -= 1;

            System.out.println("\nQ3.When is the object created with new keyword?");
            System.out.println("a.At runTime \n b.At compile time \n c.Depends on the code \n d.None");
            System.out.println("Answer:");
            ans = in.next().charAt(0);
            if (ans == 'a') {
                c += 1;
            } else
                w -= 1;

            System.out.println("\nQ4.What is the return type of the hashCode() method in the Object class?");
            System.out.println("a.Object.\nb.int.\nc.long.\nd.void.");
            System.out.println("Answer:");
            ans = in.next().charAt(0);
            if (ans == 'b') {
                c += 1;
            } else
                w -= 1;

            System.out.println("\nQ5.Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.");
            System.out.println(
                    "a.final.\nb.static.\nc.volatile.\nd.abstract.");
            System.out.println("Answer:");
            ans = in.next().charAt(0);
            if (ans == 'b') {
                c += 1;
            } else
                w -= 1;
            break;
        }

        System.out.println("\n*********Submitted Test Successfully:)*************");
        score = ((c * 2) + w);
        System.out.println("Total NUmber of Questions(5)");
        System.out.println(" Your Number of correct answers: " + c);
        System.out.println("Congratulations!! Your Test score is " + score + " Out of 10.\n");
    }

    public static void main(String args[]) {
    	OnlineExam exam = new OnlineExam();
        exam.login();
    }
}
