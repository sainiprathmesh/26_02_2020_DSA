package execution;

import java.util.Scanner;

public class Main extends Helper {
    private static Integer Integers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        char c;
        StringBuilder str = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            int r = c;
            str.append(Integer.toBinaryString(r));
        }
        String[] huff = {"1010", "100000", "00000", "10110", "010", "110011", "100010", "0001", "0110", "1100001011", "11000011", "10111", "110010"
                , "0111", "1001", "100001", "1100001001", "0010", "0011", "1101", "00001", "1100000", "110001", "1100001000", "100011", "1100001010", "111"};
        for (int i = 0; i < s.length(); i++) {
            int h = s.charAt(i) - 97;
            sb1.append(huff[h]);
            sb1.append("-");
        }
        sc.close();
        System.out.println(sb1 + "\b");
    }
}
