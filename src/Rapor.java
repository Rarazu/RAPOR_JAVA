
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class Rapor {
   public static void cetakNama(String nama){
       System.out.println("Nama :"+nama);
   }
    public static void cetakKelas(String kelas){
       System.out.println("Kelas :"+kelas);
   }
     public static void cetakAbsen(String absen){
       System.out.println("Nomor Absen :"+absen);
   }
    public static void main(String[] args) {
      cetakNama("Rara Zahra Urava");
      cetakKelas("X RPL 4");
      cetakAbsen("38");
      
      Scanner input = new Scanner(System.in);
      char grade ;
      double tugas, kuis, pts, pas, akhir;
      
     System.out.println("==== Kriteria Rapor ====");
     String [] kriteria = {"","Tugas Harian","Ulangan Harian","PTS","PAS"};
     for (int i=1; i< kriteria.length; i++){
         System.out.println(i +"="+ kriteria[i]);
     }
        System.out.println("==== Menghitung Nilai Rapor ====");
        System.out.print("Nilai Tugas :");
        tugas = input.nextInt();
        System.out.print("Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Nilai PTS : ");
        pts = input.nextInt();
        System.out.print("Nilai PAS : ");
        pas = input.nextInt();
        akhir = ((tugas + kuis + pts + pas)/4);
        
        if (akhir >= 85 && akhir <=100){
            grade = 'A';
        }
        else if (akhir > 75 && akhir < 85){
            grade = 'B';
        }
        else if (akhir > 65 && akhir < 75){
            grade = 'C';
        }
        else if (akhir > 50 && akhir < 65){
            grade = 'D';
        }
        else{
            grade = 'E';
        }
        
        switch(grade){
            case 'A':
                System.out.println("Anda memiliki nilai akhir "+akhir+ " = ("+grade+")"+""
                + "\n dan dinyatakan Lulus");
                break;
            case 'B':
                System.out.println("Anda memiliki nilai akhir "+akhir+ " = ("+grade+")"+""
                + "\n dan dinyatakan Lulus");
                break;
            case 'C':
                System.out.println("Anda memiliki nilai akhir "+akhir+ " = ("+grade+")"+""
                + "\n dan dinyatakan Lulus");
                break;
            default:
                System.out.println("Anda memiliki nilai akhir "+akhir+ " = ("+grade+")"+""
                + "\n dan dinyatakan Tidak Lulus");
                break;
        }
    }
    
}
