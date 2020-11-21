
import java.util.Scanner;
public class Akatsuki {

    protected String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void anggota(){
        System.out.println("Anggota - Anggota akatsuki");
        String[] crew = {"zetsu", "deidara", "kakuzu", "hidan", "sasori", "konan", "kisame",
                "nagato dan pain", "itachi", "obito"};
        for(int i = 0; i < crew.length ;i++){
            System.out.println((i+1) +" "+crew[i]);
        }

    }
}
