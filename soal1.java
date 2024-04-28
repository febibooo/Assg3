import java.util.Scanner;

public class soal1 {
    public static String ganjilGenap(int angka){
        if (angka%2==0){
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input :");
        int angka = scanner.nextInt();
        scanner.close();

        String hasil = ganjilGenap(angka);
        System.out.println(hasil);
    }
}