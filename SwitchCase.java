package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static String checkPhoneNumber(String userName, String userPhoneCode) {
        String operatorName;
        switch (userPhoneCode) {
            case "093":
                operatorName = "VivaCell";
                break;
            case "055":
                operatorName = "Ucom";
                break;
            case "099":
                operatorName = "Beeline";
                break;
            case "096":
                operatorName = "Beeline";
                break;
            case "043":
                operatorName = "Beeline";
                break;
            case "094":
                operatorName = "VivaCell";
                break;
            case "077":
                operatorName = "VivaCell";
                break;
            case "044":
                operatorName = "Beeline";
                break;
            case "066":
                operatorName = "Beeline";
                break;
            default:
                operatorName = "unknown";
                break;
        }
        return  ("Dear " + userName + " your mobile operator is " + operatorName);
    }

    public static String getUsername () {
        System.out.println("insert your Name");
        Scanner scanner1 = new Scanner(System.in);
        String username1 = scanner1.nextLine();
        return username1;
    }
    public static String phoneNumber () {

        System.out.println("insert your phone number like 055123456");
        Scanner scanner2 = new Scanner(System.in);
        String userPhoneNumber1 = scanner2.nextLine();
        return userPhoneNumber1;
    }

}

