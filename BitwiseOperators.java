public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 6, b = 3; // 6 = 110, 3 = 011

        System.out.println("Bitwise Operators:");
        System.out.println("a & b = " + (a & b));   // AND
        System.out.println("a | b = " + (a | b));   // OR
        System.out.println("a ^ b = " + (a ^ b));   // XOR
        System.out.println("~a = " + (~a));         // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift
    }
}
