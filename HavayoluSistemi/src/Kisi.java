import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kisi {

    private String kisiTC;
    private String adSoyad;
    private String kategori;
    private String dogumTarihi;


    public String getKisiTC() {
        return kisiTC;
    }

    public void setKisiTC(String kisiTC) {
        this.kisiTC = kisiTC;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }


//    public static void main(String[] args) throws IOException {
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Gülseren\\Desktop\\Files\\Files\\Kisiler.txt"))) {
//
//            String line = null;
//            String specialCharacter = " ; ";
//
//            List<Kisi> kisiler = new ArrayList<>();
//
//            while ((line = bufferedReader.readLine()) != null) {
//
//                System.out.println(line);
//
//
//                String[] values = line.split(specialCharacter);
//
//
//                Kisi kisi = new Kisi();
//
//                kisi.setKisiTC(values[0]);
//                kisi.setAdSoyad(values[1]);
//                kisi.setDogumTarihi(values[2]);
//                kisi.setKategori(values[3]);
//
//                kisiler.add(kisi);
//
//                for(Kisi list : kisiler){
//                    System.out.println(kisi.getKisiTC()+kisi.getAdSoyad()+kisi.getDogumTarihi()+kisi.getKategori());
//
//
//
//                }
//
//
//            }
//        }
//    }
}
