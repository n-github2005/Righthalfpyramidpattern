public class Righthalfpyramidpattern{
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        pattern1();
        System.out.println("\nPattern 2:");
        
    }
    // Pattern 1
    static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
