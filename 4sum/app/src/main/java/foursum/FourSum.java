package foursum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FourSum {

    public static int[] fourSum_Quartic(int[] x) {
        int n = x.length;
        for (int i = 0; i < n; ++i) {
            int a = x[i];
            for (int j = i + 1; j < n; ++j) {
                int b = x[j];
                for (int k = j + 1; k < n; ++k) {
                    int c = x[k];
                    for (int l = k + 1; l < n; ++l) {
                        int d = x[l];
                        if (a + b + c + d == 0) {
                            return new int[] { a, b, c, d };
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int[] fourSum_Cubic(int[] x) {
        int n = x.length;
        int[] y = x.clone();
        Arrays.sort(y);

        for (int i = 0; i < n; ++i) {
            int a = y[i];
            for (int j = i + 1; j < n; ++j) {
                int b = y[j];
                int lp = j + 1;
                int rp = n - 1;
                while (lp < rp) {
                    int c = y[lp];
                    int d = y[rp];
                    if (a + b + c + d == 0) {
                        return new int[] { a, b, c, d };
                    } else {
                        --rp;
                    }
                }
            }
        }
        return null;
    }

    public static int[] fourSum_HashMap(int[] x) {
        int n = x.length;
        var H = new HashMap<Integer, int[]>();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                var tuple = new int[] { i, j };
                H.put(x[i] + x[j], tuple);
            }
        }

        for (int i = 0; i < n; ++i) {
            int a = x[i];
            for (int j = i + 1; j < n; ++j) {
                int b = x[j];
                int[] kl = H.get(-a - b);
                if ((kl[0] != 0 && kl[1] != 0) && j < kl[0]) {
                    int c = x[kl[0]];
                    int d = x[kl[1]];
                    return new int[] { a, b, c, d }; 
                } 
            }
        }
        return null;
    }

        public static int[] readInput() {
        Scanner s = new Scanner(System.in);
        int[] x = null;
        try {
            int n = s.nextInt();
            x = new int[n];
            for (int i = 0; i < n; ++i) {
                x[i] = s.nextInt();
            } 
        } finally {
            s.close();
        } 
        return x;
    }

    public static void main(String[] args) {
        int[] x = readInput();
        int[] y = null;

        if ("quartic".equals(args[0])) {
            y = fourSum_Quartic(x);
        }

        else if ("cubic".equals(args[0])) {
            y = fourSum_Cubic(x);
        }

        else if ("hashmap".equals(args[0])) {
            y = fourSum_HashMap(x);
        }

        if (y == null) {
            System.out.println("null");
        } else {
            System.out.println(String.format("%d %d %d %d", y[0], y[1], y[2], y[3]));
        }
    }
}
