import java.util.Scanner;

public class soal2 {
    public static boolean palindrom(String kata){
        int panjang = kata.length();
        for (int i = 0; i < panjang/2; i++) {
            if (kata.charAt(i)!=kata.charAt(panjang-1-i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input :");
        String kata = scanner.nextLine();
        scanner.close();

        boolean hasil = palindrom(kata);
        System.out.println(hasil);
    }
}