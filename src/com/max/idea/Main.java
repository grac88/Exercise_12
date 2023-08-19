package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: \"I like Java!!!\"");
        String str = scan.nextLine();
        if (str.equals("I like Java!!!")) {
            boolean cont = str.contains("Java");
            System.out.println("Строка содержит: \"Java\" - " + cont);
            boolean start = str.startsWith("I like");
            System.out.println("Строка начинается с: \"I like\" - " + start);
            boolean ends = str.endsWith("!!!");
            System.out.println("Строка заканчивается: \"!!!\" - " + ends);
            if (cont == true && start == true && ends == true) {
                String result = str.toUpperCase();
                System.out.println(result);
            }
            String repl = str.replace("a", "o");
            String result = repl.substring(7, 11);
            System.out.println(result);
        } else
            System.out.println("Ваша строка не равна: \"I like Java!!!\"");
    }
}
