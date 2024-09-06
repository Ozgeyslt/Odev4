// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Department department=new Department();
        department.personelEkle(new Personel("Ayse", "Yilmaz", 25, "IT", 30000));
        department.personelEkle(new Personel("Merve", "Sahin", 25, "IT", 30000));
        department.personelEkle(new Personel("Selim", "Kaya", 25, "IT", 30000));

        department.personelListesi();
    }
}