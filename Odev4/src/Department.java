import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Personel> personelList;

    public Department(){
        this.personelList=new ArrayList<>();
    }

    public void personelEkle(Personel personel){
        personelList.add(personel);
    }

    public void personelListesi() {
        for (Personel personel : personelList) {
            System.out.println("Isim: " + personel.isim +
                    ", SoyIsim: " + personel.soyIsim +
                    ", Yas: " + personel.yas +
                    ", Departman: " + personel.departman +
                    ", Maas: " + personel.maas);
        }
    }
}
