package Secao17GenericsSetMap.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Lucas");
        cookies.put("email", "lucas@gmail.com");
        cookies.put("phone", "987654321");

        cookies.remove("email");
        cookies.put("phone", "912345678");

        System.out.println("Contains phone key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("All COOKIES: ");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
