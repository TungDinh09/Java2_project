package java2_project;

import View.HomePage;
import View.Register;
import View.Sign_in;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        Register register = new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        Sign_in signIn = new Sign_in();
        signIn.setVisible(true);
        signIn.setLocationRelativeTo(null);
        JDBCDriver jDBCDriver = new JDBCDriver();

    }
}
