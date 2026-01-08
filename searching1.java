public class searching1 {
    public static void main(String[] args) {

        int[] data = {12, 45, 7, 30, 22, 18}; 
        int cari = 30;
        int posisi = -1;
        int langkah = 0; 

     
        for (int i = 0; i < data.length; i++) {
            langkah++;
            if (data[i] == cari) {
                posisi = i;
                break;
            }
        }

      
        if (posisi != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("Jumlah langkah pencarian: " + langkah);
    }
}