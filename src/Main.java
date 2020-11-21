import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Character akatsuki = new Character();
        akatsuki.anggota();
        System.out.print("Pilih salah satu anggota akatsuki : ");
        akatsuki.setNama(scan.next().toLowerCase());
        System.out.println("\n-----DESKRIPSI "+akatsuki.getNama().toUpperCase()+"-----");
        akatsuki.pilihChar(akatsuki.getNama());
    }
}
