package com.company;

public class Main {

    public static void main(String[] args) {
        fullNumberCheck();
    }
    public static void fullNumberCheck() {
        String username = SwitchCase.getUsername();
        if (username.equalsIgnoreCase("EXIT") ) {
            System.out.println("process is finish");
            return;
        }
        String phoneNumber = SwitchCase.phoneNumber();
        if (phoneNumber.length() == 9) {
            String userPhoneCode = phoneNumber.substring(0, 3);
            System.out.println(SwitchCase.checkPhoneNumber(username, userPhoneCode));
        } else System.out.println(username + " please insert valid phone number or press 'EXIT' to cancel proccess");
        fullNumberCheck();
    }
}



