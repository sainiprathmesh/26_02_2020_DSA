package execution;

public class Helper {
    static void strToBinary(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int val = s.charAt(i);
            StringBuilder bin = new StringBuilder();
            while (val > 0) {
                if (val % 2 == 1) {
                    bin.append('1');
                } else
                    bin.append('0');
                val /= 2;
            }
            bin = new StringBuilder(reverse(bin.toString()));
            System.out.print("0" + bin + " ");
        }
    }

    static String reverse(String input) {
        char[] a = input.toCharArray();
        int l, r = 0;
        r = a.length - 1;

        for (l = 0; l < r; l++, r--) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }
}
