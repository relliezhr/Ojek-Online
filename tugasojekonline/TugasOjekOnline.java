package tugasojekonline;

import java.util.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

public class TugasOjekOnline {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Hashtable();

//        double harga[][] = {{0.0, 5.7, 3.2, 7.4}, {5.7, 0.0, 5.0, 3.9}, {3.2, 5.0, 0.0, 5.5}, {7.4, 3.9, 5.5, 0.0}};
//        dict.put("Sawojajar", 0);
//        dict.put("Ijen", 1);
//        dict.put("Sulfat", 2);
//        dict.put("Suhat", 3);
//        String loop = "";
//        while (true) {
//            loop = "Y";
//            while (loop == "Y") {
//                System.out.print("Masukkan Nama: ");
//                String nama = sc.nextLine();
//                System.out.print("1- Sawojajar\n2- Ijen\n3- Sulfat\n4- Suhat\nMasukkan Asal: ");
//                String asal = sc.nextLine().toLowerCase();
//                System.out.print("1- Sawojajar\n2- Ijen\n3- Sulfat\n4- Suhat\nMasukkan Tujuan: ");
//                String tujuan = sc.nextLine().toLowerCase();
//                int lokasiAnda = (int) dict.get(asal);
//                int tujuanAnda = (int) dict.get(tujuan);
//                double jumlah = total(harga[lokasiAnda][tujuanAnda]);
//
//                System.out.println("Nama: " + nama + "\nLokasi Anda: " + asal + "\nTujuan Anda: " + tujuan + "\nTotal Harga: Rp, " + jumlah + "\nMasih Mengisi (Y/T): ");
//                loop = sc.nextLine();
//            }
//            if (loop == "T") {
//                System.exit(0);
//            }
//        }
//    }
        double harga[][] = {{0.0, 5.7, 3.2, 7.4}, {5.7, 0.0, 5.0, 3.9}, {3.2, 5.0, 0.0, 5.5}, {7.4, 3.9, 5.5, 0.0}};
        dict.put("Sawojajar", 0);
        dict.put("Ijen", 1);
        dict.put("Sulfat", 2);
        dict.put("Suhat", 3);

        while (true) {
            int n = YES_OPTION;
            while (n == YES_OPTION) {
                String nama = JOptionPane.showInputDialog("Masukkan Nama Anda: ");
                String asal = JOptionPane.showInputDialog("Masukkan Lokasi Anda: ");
                String tujuan = JOptionPane.showInputDialog("Masukkan Tujuan Anda: ");
                int lokasiAnda = (int) dict.get(asal);
                int tujuanAnda = (int) dict.get(tujuan);
                double jumlah = total(harga[lokasiAnda][tujuanAnda]);
                ArrayList<String> data = new ArrayList<String>();
                data.add(nama);
                data.add(asal);
                data.add(tujuan);

                n = JOptionPane.showConfirmDialog(null, "Nama: " + data.get(0) + "\nLokasi Anda: " + data.get(1) + "\nTujuan Anda: " + data.get(2) + "\nTotal Harga: Rp, " + jumlah, "Please Select", JOptionPane.YES_NO_OPTION);
            }
            if (n == NO_OPTION) {
                System.exit(0);
            }
        }
    }

    static double total(double a) {
        if (a < 4.0) {
            a = (a * 2000) + 10000;
        } else if (a >= 4.0) {
            a = (a * 2400) + 15000;
        }
        return a;
    }

}
