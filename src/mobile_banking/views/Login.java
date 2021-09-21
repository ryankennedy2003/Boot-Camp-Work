package mobile_banking.views;

import mobile_banking.controller.LoginController;

import java.util.Scanner;

public class Login {
    //Ask user to input username
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Login login = new Login();
        while(true){
            login.getUserDetails();
        }

    }

    public void getUserDetails() {
        System.out.println("Please input username: ");
        String username = scn.nextLine();
        System.out.println("Please input password: ");
        String password = scn.nextLine();
        LoginController lc = new LoginController();
        if(lc.validateLogin(username, password)){
            System.out.println("Welcome back " + username);
        }
        else {
            System.out.println("Invalid details, please try again");
        }


    }
    //Ask user to input password

}
