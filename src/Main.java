//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2 , 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        String s = "potato apple lemon";
        String[] vec = s.split(" ");
        for (int k = 0; k < vec.length; k++) {
            System.out.println(vec[k]);
        }

        System.out.println(original);
        System.out.println("toLoweCase() = " + s01);
        System.out.println("toUpperCase() = " + s02);
        System.out.println("trin() = " + s03);
        System.out.println("substring(2) = " + s04);
        System.out.println("substring(2,9) = " + s05);
        System.out.println("replace(\"a\",\"x\") = " + s06);
        System.out.println("replace(\"abc\", \"xy\") = " + s07);
    }
}