/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warna;

import java.util.Scanner;
/**
 *
 * @author Nur Sasongko
 */
public class WarnaKepribadian {
    Scanner scan = new Scanner(System.in);
    
    public String nama;
    public String warna;
    
     public void setData(){
        System.out.println(Konstanta.CRED + "YUK" + Konstanta.CGREEN + " CEK" + Konstanta.CYELLOW + " KEPRIBADIAN" + Konstanta.CCYAN + " DARI" + Konstanta.CPURPLE + " WARNA" + Konstanta.CBLUE + " FAVORITMU"); 
        System.out.println();
        System.out.println(Konstanta.CWHITE + Konstanta.BGRED + "        MERAH        ");
        System.out.println(Konstanta.CWHITE + Konstanta.BGGREEN + "        HIJAU        ");
        System.out.println(Konstanta.CWHITE + Konstanta.BGYELLOW + "        KUNING       ");
        System.out.println(Konstanta.CWHITE + Konstanta.BGBLUE + "        BIRU         ");
        System.out.println(Konstanta.CWHITE + Konstanta.BGPURPLE + "        UNGU         ");
        
        System.out.println(Konstanta.CRESET);
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = scan.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");      
        nama = scan.next();
    }
     
    public void getMerah(){
        String[] arrMerah = {"Periang", "Pemberani","Berani mengambil resiko dalam setiap langkah","Menyukai tantangan","Kurang sabar","Dapat menahan marah namun jika sudah tahap puncak toleransi kemarahannya akan sulit dikontrol","Memiliki energi dan cinta"};
        int arrLen = arrMerah.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",Konstanta.CRED,warna,Konstanta.CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrMerah[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrMerah[i]);
            }    
        }
    }
    
    public void getHijau(){
        String[] arrHijau = {"Romantis", "Menyukai hal yang berbau alami dan keindahan", "Teguh pada prinsip","Menginginkan kesempurnaan","Mudah cemburu", "Mudah merasa iri","Menjunjung tinggi suatu nilai toleransi dan kepercayaan"};
         int arrLen = arrHijau.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",Konstanta.CGREEN,warna,Konstanta.CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrHijau[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrHijau[i]);
            }    
        }       
    }
    
    public void getKuning(){
       String[] arrKuning = {"Optimis", "Suka bergaul", "Periang", "Senang menolong","Lincah dan aktif","Tidak suka meremehkan kekurangan orang lain","Loyal","Hangat","Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil","Cenderung penakut"};
        int arrLen = arrKuning.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",Konstanta.CYELLOW,warna,Konstanta.CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrKuning[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrKuning[i]);
            }    
        }       
    }
    
    public void getBiru(){
        String[] arrBiru = {"Menyenangkan", "Bijaksana", "Pembawaan diri tenang saat menghadapi masalah", "Dinamis","Senang Berbagi","Bersahabat","Tidak terlalu suka menjadi sorotan banyak orang","Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai"}; 
        int arrLen = arrBiru.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",Konstanta.CBLUE,warna,Konstanta.CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrBiru[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrBiru[i]);
            }    
        }        
    }
    
    public void getUngu(){
        String[] arrUngu = {"Optimis", "Tidak pernah ragu","Menurutnya pasangan yang ideal adalah memiliki mental yang kuat","Memiliki ambisi yang besar","Memiliki empati yang besar","Memiliki sisi misterius sebab seringkali menutupi perasaannya","Terkadang bersikap kerasa kepala dan angkuh"};
        int arrLen = arrUngu.length;
        
        System.out.printf("Warna Favoritmu adalah %s%s%n%s",Konstanta.CPURPLE,warna,Konstanta.CRESET);
        for(int i = 0; i < arrLen;i++){       
            if(i == (arrLen-1)){
                System.out.printf("%d. %s.%n",i+1,arrUngu[i]);
            }
            else{
                System.out.printf("%d. %s,%n",i+1,arrUngu[i]);
            }    
        }        
    }
    
    public void getTampil(){
        System.out.printf("%n===HASIL TEST KEPRIBADIAN %s===%n",nama);
        switch(warna){
            case "MERAH" :
                getMerah();
                break;
            case "HIJAU" :
                getHijau();
                break;
            case "KUNING" :
                getKuning();
                break;
            case "BIRU" :
                getBiru();
                break;
            case "UNGU" :
                getUngu();
                break;                
            default :
                System.out.println("Warna yang dipilih salah");
                break;
        }        
    }; 
   
}
