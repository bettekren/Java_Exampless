import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //Doğru kullanıcı ismi ve şifre
            String myUsName = "betul_ekren";
            String myPassword = "291312bE.";

            System.out.print("Enter your username = ");
            String username = input.next();
            System.out.print("Enter your password = ");
            String password = input.next();

            if(username.equals(myUsName)){
                if(password.equals(myPassword)) {
                    System.out.println("Logged in");
                }
                else {
                    String wrongPassword=password;
                    System.out.println("Your password is wrong");
                    System.out.println("Dou you want to reset your password? 1-Yes 2-No");
                    int number = input.nextInt();
                    if(number == 1){
                        System.out.println("Your new password shouldn't same with before password and shouldn't wrong.");
                        System.out.print("Enter a new password = ");
                        String newPassword = input.next();
                        do {
                            System.out.println("Invalid password");
                            System.out.print("Enter a new password = ");
                            newPassword = input.next();


                        }
                        while((myPassword.equals(newPassword)) || (newPassword.equals(wrongPassword)));

                        System.out.println("Password created");
                    }
                    else{
                        System.out.println("Please try again...");
                    }
                }
            }
            else{
                System.out.println("Your username is wrong.Please try again...");
            }

        }

    }
