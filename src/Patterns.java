public class Patterns {
    public static void main(String[] args) {

        Algorithms algorithms = new Algorithms();
        int n = 6;

        algorithms.numberPattern(n);
    }
}

class Algorithms {

    void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void rightAngle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void upsideDownRightAngle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void upsideDownPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    void diamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void halfDiamond(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void rightAngleBinary(int n) {
        for (int i = 0; i < n; i++) {
            int start;

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();
        }
    }

    void vShapeNumbers(int n) {

        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            spaces -= 2;
        }
    }

    void numberRightAngle(int n) {

        int start = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i;  j++) {
                System.out.print(start + " ");
                start += 1;
            }
            System.out.println();
        }
    }

    void alphaRightAngle(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void upsideDownAlphaRightAngle(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + n - i - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void rowAlpaRightAngle(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= ch + i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void alphaHillPattern(int n) {

        for (int i = 0; i < n; i++) {

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("-");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);

                if (j < breakpoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }
            System.out.println();
        }
    }

    void alphaTrianglePattern(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void symmetricVoidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            /*
             ********** [5, 0, 5]
             ****  **** [4, 1, 4]
             ***    *** [3, 4, 3]
             **      ** [2, 6 ,2]
             *        * [1, 8, 1]
             *        * [1, 8, 1] i = 1, n = 5, (2 * n - 2 * i)
             **      ** [2, 6 ,2]
             ***    *** [3, 4, 3]
             ****  **** [4, 1, 4]
             ********** [5, 0, 5]
             */
        }
    }

    void symmetricButterflyPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - (2 * i + 2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    /*
     *        * [1, 8, 1] 0
     **      ** [2, 6, 2] 1
     ***    *** [3, 4, 3] 2
     ****  **** [4, 2, 4] 3
     ********** [5, 0, 5] 4
     ****  **** [4, 2, 4]
     ***    *** [3, 4, 3]
     **      ** [2, 6, 2]
     *        * [1, 8, 1]
     */
    }

    void hollowRectanglePattern(int n) {

        // my approach
//        for (int i = 0; i < n; i++) {
//            int spaces = n - 2;
//            if (i == 0 || i == n - 1) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            if (i < spaces) {
//                System.out.print("*");
//                for (int j = 0; j < spaces; j++) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//                System.out.println();
//            }
//        }

        // striver's sheet approach
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
        n = 4 |
        **** [2, 0, 2]
        *  * [1, 2, 1]
        *  * [1, 2, 1]
        **** [2, 0, 2]

        n = 5
        ***** [2, 0, 3]
        *   * [1, 3, 1]
        *   * [1, 3, 1]
        *   * [1, 3, 1]
        ***** [2, 0, 3]
         */
    }

    void numberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int minDistance  = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(n - minDistance + "  ");
            }
            System.out.println();
        }
    }
}
