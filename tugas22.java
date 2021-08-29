import java.util.*;

public class tugas22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String finaltext = "";

        System.out.print("Masukkan text : ");
        String plaintext = sc.nextLine();

        for (int i = plaintext.length() - 1; i >= 0; i--) {
            finaltext = finaltext + plaintext.charAt(i);
        }

        System.out.println("Hasil: " + finaltext);

    }
}