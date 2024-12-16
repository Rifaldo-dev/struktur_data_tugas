// Kelas utama
public class TugasPraktik {

    // Deklarasi variabel
    public int nilai; // Tipe data integer bernama 'nilai'
    public String kata = "struktur"; // Tipe data string bernama 'kata'

    // Deklarasi array satu dimensi
    public int[] arraySatu = {12, 10, 40};

    // Deklarasi array dua dimensi
    public int[][] arrayDua = {
        {12, 10, 40},
        {13, 11, 41},
        {14, 12, 42}
    };

    // LinkedList dengan elemen 10, 20, 30, 40, 50
    public java.util.LinkedList<Integer> linkedList;

    // Konstruktor untuk inisialisasi linked list
    public TugasPraktik() {
        linkedList = new java.util.LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
    }

    // Metode untuk menampilkan semua data
    public void displayData() {
        System.out.println("Nilai: " + nilai);
        System.out.println("Kata: " + kata);
        System.out.print("Array Satu: ");
        for (int num : arraySatu) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array Dua:");
        for (int[] row : arrayDua) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.print("Linked List: ");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        TugasPraktik tp = new TugasPraktik();
        tp.displayData();
    }
}
