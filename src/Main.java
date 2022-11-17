public class Main {
    public static void main(String[] args) {
        String s5 = "x3z ? xYz ! R1 && __";
        String s6 = s5.replaceAll("[a-z0-9]","*");
        System.out.println(s6);
    }
}