import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RiwayatInputJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> riwayatInput = new ArrayList<>();
        List<String> riwayatInput2 = new ArrayList<>();


        while (true) {
            System.out.print("Masukkan Nama Anda: ");
            String input = scanner.nextLine();

            System.out.print("Masukkan Kelas Anda: ");
            String input2 = scanner.nextLine();

            // Simpan input ke dalam riwayat
            riwayatInput.add(input);
            riwayatInput2.add(input2);

            // Tampilkan input terakhir
            System.out.println("Input terakhir: " + input);

            // Tampilkan riwayat input
            tampilkanRiwayat(riwayatInput);
        }
    }

    private static void tampilkanRiwayat(List<String> riwayatInput) {
        System.out.println("Biodata:");

        // Tampilkan input sebelumnya dengan nomor urut
        for (int i = 0; i < riwayatInput.size(); i++) {
            System.out.println((i + 1) + ": " + riwayatInput.get(i));
        }
    }
}
