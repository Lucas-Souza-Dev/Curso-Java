package Secao8POO.MembrosEstaticos.util;

public class Calculator {
    public static final double PI = 3.14159;
    // quando temos final significa que é uma constante.

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
