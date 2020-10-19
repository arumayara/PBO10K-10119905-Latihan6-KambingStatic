/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan6.KambingStatic;

/**
 *
 * @author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program ini merupakan pengaksesan variabel Static dan konstanta
 */
public class KambingStatic {
   public static final String NAMA_KAMBING="MIDUN ";
   
   public static void main(String[] args){
       Mamalia.jumlahKambing= 485000;
       System.out.println(NAMA_KAMBING + "Memiliki kambing sebanyak "+ Mamalia.jumlahKambing);
       
   }
    
}
