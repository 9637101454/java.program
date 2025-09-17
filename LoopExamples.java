public class LoopExamples {
    public static void main(String[] args) {
        
        // 1. For Loop - Print numbers 1 to 5
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. While Loop - Print numbers 1 to 5
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. Do-While Loop - Print numbers 1 to 5
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
