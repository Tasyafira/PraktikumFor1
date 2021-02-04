/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumfor1;

/**
 *
 * @author MOKLET-1
 */
public class PraktikumFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=4;
        System.out.println("PROGRAM MENAMPILKAN @ BERBENTUK PERSEGI BERONGGA");
        System.out.println("-------------------------------------------");
        
        // Perulangan 
        // i = 1, i Kurang Dari atau Sama Dengan n, Maka i++ (Perulangan dimulai dari 1 dan akan terus bertambah sampai kurang dari / sama dengan n)
        for (int i=1; i<=n; i++){
            //  j = 1, j Kurang Dari atau Sama Dengan n, Maka j++ (Perulangan dimulai dari 1 dan akan terus bertambah sampai kurang dari / sama dengan n)
            for (int j = 1; j<=n; j++){
                
                // Percabangan 
                if (i == 1 || j == 1 || i == n || j == n){
                    System.out.print("@");
                }else{
                    System.out.print(" ");
                }
            }
       System.out.println();
    }
    }
    
}
