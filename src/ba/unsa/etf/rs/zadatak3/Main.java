package ba.unsa.etf.rs.zadatak3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite recenicu: ");
        String recenica = scanner.nextLine();
        String najduza_recenica = "";
        String[] split = recenica.split(" ");
        for (int i = 0; i < split.length; i++) {
            String rijec = split[i];
            if (rijec.length() <= najduza_recenica.length()) {
                continue;
            }
            najduza_recenica = rijec;

        }
        String recenica2 = "";
        String[] s = recenica.split(" ");
        int i = 0, sLength = s.length;
        while (true) {
            if (i >= sLength) break;
            String rijec2 = s[i];
            if (rijec2.equals(najduza_recenica)) {
                rijec2 = rijec2.toUpperCase();
            }
            recenica2 += rijec2 + " ";
            i++;
        }
        System.out.println(recenica2);
       }

}
