/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class ScannerFactory {

    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt(String title, String error) {
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
            System.err.println(error);
        }
        return Integer.parseInt(input);
    }

    public String getYN(String title, String error) {
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches("^[YyNn]")) {
                break;
            }
            System.err.println(error);
        }
        return input;
    }

    public String getString(String title) {
        String pattern = "[a-zA-Z0-9\\s]+";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(pattern)) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return input;
    }

    public String getFolder(String title) {
        String input;
        String pattern = "([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)+\\\\?";
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(pattern)) {
                break;
            }
        }
        return input;
    }

}
