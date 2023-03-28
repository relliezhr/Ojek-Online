package tugasojekonline;

import java.util.*;

public class materi {

    static Scanner sc = new Scanner(System.in);
    static ArrayList jmlnilai = new ArrayList();

    public static void main(String[] args) {
        materi a = new materi();
        System.out.print("Input Kelas (X, XI, XII): ");
        String kelas = sc.next();
        if (kelas.equalsIgnoreCase("X")) {
            for (int i = 0; i < 3; i++) {
                a.n();
            }
        } else if (kelas.equalsIgnoreCase("XI")) {
            for (int i = 0; i < 4; i++) {
                a.n();
            }
        } else if (kelas.equalsIgnoreCase("XII")) {
            for (int i = 0; i < 5; i++) {
                a.n();
            }
        }

        System.out.println("Total semua nilai " + jmlnilai);
        
    }


    public void n() {
        System.out.print("Input Nilai: ");
        double nilai = sc.nextInt();
        jmlnilai.add(nilai);
        if (nilai >= 75) {
            System.out.println("Kamu lolos tanpa remidi");
        } else if (nilai < 75) {
            System.out.println("Kamu remidi");
        }
        
        
        
        
        
        
        
    }

}
