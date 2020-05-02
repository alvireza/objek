public class dog {
    String nama;
    String jenis;
    String warna;
    int umur;
    int berat;

    void perkenalan() {
        System.out.println("nama   :" + nama);
        System.out.println("jenis  :" + jenis);
        System.out.println("warna  :" + warna);
        System.out.println("umur   :" + umur + "tahun");
        System.out.println("berat  :" + berat + "kg");
    }

    void eat() {
        System.out.println("anjing mencoba mencari makan ");
    }

    void chaseCat() {
        System.out.println("anjing mengejar kucing dan menindihinya dg berat " + berat + "kg");
    }

    void counter() {
        System.out.println("kucing mencakar dan bersembunyi");
    }
}


