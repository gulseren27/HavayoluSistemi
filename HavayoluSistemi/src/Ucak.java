import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ucak {

    private String tip;
    private int kapasite;
    private int uretimYili;

    Yonetici y = new Yonetici();

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }


    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Gülseren\\Desktop\\IDP\\src\\Ucaklar.txt"))) {

            String line = null;

            List<Ucak> ucaklar = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {

                for (Ucak ucak : ucaklar) {
                    System.out.println(ucak);

                }


            }
        }
    }
    public  List<Ucus> getirUcuslar(List<Ucus> Ucus) {
        System.out.println("Ucuslar getirildi.");
        return Ucus;
    }




}




