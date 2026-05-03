class Test {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            for (int j = 0; j < stars; j++) {
                if (i > n) {
                    stars = 2 * n - i;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

