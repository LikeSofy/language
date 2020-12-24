package com.company;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("1 — english \n2 — белорусская \nлюбой — русский ");
        String sel;
        sel = scanner.next();
        String country = "";
        String language = "";
        switch (sel) {
            case "1":
                country = "US";
                language = "EN";
                break;
            case "2":
                country = "BY";
                language = "BE";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        String currentStr = new String(rb.getString("str1").getBytes(StandardCharsets.UTF_16LE), "Windows-1251");
        System.out.println(currentStr);
        String name = scanner.next();
        currentStr = new String(rb.getString("str2").getBytes(StandardCharsets.UTF_16LE), "Windows-1251");
        System.out.println(currentStr);
        int age = scanner.nextInt();
        currentStr = new String(rb.getString("str3").getBytes(StandardCharsets.UTF_16LE), "Windows-1251");


        System.out.print(currentStr + name + "; " + age);
    }
}
