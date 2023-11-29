import java.util.Scanner;
public class Toserba{
    public static void main(String[] args){
        System.out.println("TOKO SERBA ADA\n***************");
        String kodeBarang[]={"a001","a002","a003"};
        String namaBarang[]={"Buku","Pensil","Pulpen"};
        int hargaBarang[]={3000,4000,5000};
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan Item Barang: ");
        int jumlahBarang=input.nextInt();
        String kodeTransaksi[]=new String[jumlahBarang];
        int jumlahBeli[]=new int[jumlahBarang];
        for(int i=0;i<jumlahBarang;i++){
            System.out.println("Data ke "+(i + 1));
            System.out.print("Masukkan Kode        : ");
            kodeTransaksi[i]=input.next();
            System.out.print("Masukkan Jumlah Beli : ");
            jumlahBeli[i]=input.nextInt();
        }
        System.out.println("\n\nTOKO SERBA ADA\n***************");
        System.out.println("Kode      Nama Barang        Harga    Jumlah    Jumlah Bayar");
        System.out.println("============================================================");
        int totalBayar=0;
        for(int i=0;i<jumlahBarang;i++){
            int index=-1;
            for(int j=0;j<kodeBarang.length;j++){
                if(kodeBarang[j].equals(kodeTransaksi[i])){
                    index=j;
                    break;
                }
            }
            if(index!=-1){
                int harga=hargaBarang[index];
                int totalHarga=harga*jumlahBeli[i];
                totalBayar+=totalHarga;
                System.out.printf("%-10s%-20s%-10s%-10s%-15s\n", kodeTransaksi[i], namaBarang[index], harga, jumlahBeli[i], totalHarga);
            }else{
                System.out.println("Kode barang tidak valid.");
            }
        }
        System.out.println("============================================================");
        System.out.println("Total Bayar:                               "+totalBayar);
        System.out.println("============================================================");
    }
}