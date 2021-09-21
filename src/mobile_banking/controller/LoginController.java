package mobile_banking.controller;

public class LoginController {
    //check username and password that have been entered
    public boolean validateLogin(String un, String pw){
        if(un.equalsIgnoreCase("Dean") && pw.equals("Pass")){
            return true;
        }
        return false;

    }
}
