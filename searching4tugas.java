public class searching4tugas {
    public static void main(String[] args) {
       
        String[] nim = {"111", "222", "333", "444", "555"};
        String[] nama = {"Joey", "Ozan", "Deva", "Juned", "Vito"};
        
        
        String carinama = "Deva"; 
        
        int posisi = -1;
        int langkah = 0;
        boolean ditemukan = false;

        for (int i = 0; i < nama.length; i++) {
            langkah++; 
            if (nama[i].equalsIgnoreCase(carinama)) { 
                posisi = i;
                ditemukan = true; 
                break;
            }
        }

      
        System.out.println("Hasil Pencarian Mahasiswa");

        System.out.println("Status: " + (ditemukan ? "Data Ditemukan" : "Data Tidak Ditemukan"));
        
        if (ditemukan) {
            System.out.println("Nama: " + nama[posisi]);
            System.out.println("NIM : " + nim[posisi]);
            System.out.println("Ditemukan pada indeks ke-" + posisi);
        }
        System.out.println("Jumlah perbandingan: " + langkah + " langkah.");
    }
}