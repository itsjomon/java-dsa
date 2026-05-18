package patterns.part2;

public class Patterns {

    public static void hollowRectangle(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if ( i == 1 || i == totRows || j == 1 || j == totCols ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void halfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }
    

    public static void invertedHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void invertedNumberHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void floydsTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void binaryHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        System.out.println();
    }


    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        System.out.println();
    }
    

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i-1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void centeredStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                if ( j < i) {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void centeredNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
                if (j < i - 1) {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void centeredRepeatedNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
        System.out.println();
    }


    public static void xShape(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        hollowRectangle(4, 5);
        halfPyramid(5);
        invertedHalfPyramid(5);
        invertedNumberHalfPyramid(5);
        floydsTriangle(4);
        binaryHalfPyramid(5);
        butterfly(4);
        solidRhombus(5);
        hollowRhombus(5);
        diamond(4);
        numberPyramid(5);
        centeredStarPyramid(4);
        centeredNumberPyramid(4);
        centeredRepeatedNumberPyramid(4);
        xShape(5);
    }
}


/*
Print the following patterns:

* * * * * 
*       * 
*       * 
* * * * * 

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

1 
2 3 
4 5 6 
7 8 9 10 

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 

        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

        * * * * * 
      *       * 
    *       * 
  *       * 
* * * * * 

      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

      *
    *   *
  *   *   *
*   *   *   *

      1
    2   3
  3   4   5
4   5   6   7

      1
    2   2
  3   3   3
4   4   4   4 

*       *
  *   *
    *
  *   *
*       *
 */