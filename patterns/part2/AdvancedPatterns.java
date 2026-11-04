package patterns.part2;

public class AdvancedPatterns {
    /*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 
     */
    public static void invertedNumberHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
    1 1 1 1 1 
    2 2 2 2 
    3 3 3 
    4 4 
    5 
     */
    public static void invertedRepeatedNumberHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
    * * * * * 
      * * * * 
        * * * 
          * * 
            * 
     */
    public static void invertedMirroredHalfPyramid(int n) {
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



    /*
    1 
    2 3 
    4 5 6 
    7 8 9 10 
     */
    public static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
    1 
    0 1 
    1 0 1 
    0 1 0 1 
    1 0 1 0 1 
     */
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



    /*
          *
        *   *
      *   *   *
    *   *   *   *
     */
    public static void starPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                if (j < i) {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
          1
        2   3
      3   4   5
    4   5   6   7
     */
    public static void consecutiveNumberPyramid(int n) {
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



    /*
          1
        2   2
      3   3   3
    4   4   4   4
     */
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



    /*
            1 
          1 2 1 
        1 2 3 2 1 
      1 2 3 4 3 2 1 
    1 2 3 4 5 4 3 2 1 
     */
    public static void ascendingPalindromicPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
            1 
          2 1 2 
        3 2 1 2 3 
      4 3 2 1 2 3 4 
    5 4 3 2 1 2 3 4 5 
     */
    public static void descendingPalindromicPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
            1   
          1   1   
        1   2   1   
      1   3   3   1   
    1   4   6   4   1   
     */
    public static void pascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            long val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + "   ");
                val = val * (i - j) / (j + 1);
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
            * * * * * 
          * * * * * 
        * * * * * 
      * * * * * 
    * * * * * 
     */
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



    /*
            * * * * * 
          *       * 
        *       * 
      *       * 
    * * * * * 
     */
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



    /*
    *       * 
      *   *   
        *     
      *   *   
    *       * 
     */
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

        System.out.println();
    }



    /*
          * 
        * * * 
      * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
     */
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



    /*
          * 
        *   * 
      *       * 
    *           * 
      *       * 
        *   * 
          * 
     */
    public static void hollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }



    /*
    *             * 
    * *         * * 
    * * *     * * * 
    * * * * * * * * 
    * * * * * * * * 
    * * *     * * * 
    * *         * * 
    *             * 
     */
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



    /*
    *             * 
    * *         * * 
    *   *     *   * 
    *     * *     * 
    *     * *     * 
    *   *     *   * 
    * *         * * 
    *             * 
     */
    public static void hollowButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }



    public static void main(String[] args) {
        invertedNumberHalfPyramid(5);
        invertedRepeatedNumberHalfPyramid(5);
        invertedMirroredHalfPyramid(5);
        floydsTriangle(4);
        binaryHalfPyramid(5);
        starPyramid(4);
        consecutiveNumberPyramid(4);
        centeredRepeatedNumberPyramid(4);
        ascendingPalindromicPyramid(5);
        descendingPalindromicPyramid(5);
        pascalsTriangle(5);
        solidRhombus(5);
        hollowRhombus(5);
        xShape(5);
        diamond(4);
        hollowDiamond(4);
        butterfly(4);
        hollowButterfly(4);
    }
}
