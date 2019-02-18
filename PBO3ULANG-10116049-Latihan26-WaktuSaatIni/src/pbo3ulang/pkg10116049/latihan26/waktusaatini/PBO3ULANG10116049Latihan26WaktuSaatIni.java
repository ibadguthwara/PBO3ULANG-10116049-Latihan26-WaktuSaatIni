/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : untuk menampilkan waktu saat ini atau terkini
 */
public class PBO3ULANG10116049Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy  hh:mm:ss ");

      System.out.println("Current Date: " + ft.format(dNow));
    }
    
}
