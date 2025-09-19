public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (b > 0): " + ((a > b) && (b > 0)));
        System.out.println("(a > b) || (b < 0): " + ((a > b) || (b < 0)));
        System.out.println("!(a > b): " + !(a > b));

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = " + c);
        c += b; // c = c + b
        System.out.println("c += b: " + c);
        c -= b; // c = c - b
        System.out.println("c -= b: " + c);
        c *= b; // c = c * b
        System.out.println("c *= b: " + c);
        c /= b; // c = c / b
        System.out.println("c /= b: " + c);
        c %= b; // c = c % b
        System.out.println("c %= b: " + c);

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 7;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d++ = " + (d++)); // post-increment
        System.out.println("After d++ , d = " + d);
        System.out.println("--d = " + (--d)); // pre-decrement
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("After d-- , d = " + d);
        System.out.println("Unary minus: -d = " + (-d));

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int x = 6, y = 3;  // 6 = 110, 3 = 011
        System.out.println("x & y = " + (x & y));  // AND
        System.out.println("x | y = " + (x | y));  // OR
        System.out.println("x ^ y = " + (x ^ y));  // XOR
        System.out.println("~x = " + (~x));        // NOT
        System.out.println("x << 1 = " + (x << 1)); // left shift
        System.out.println("x >> 1 = " + (x >> 1)); // right shift

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}
