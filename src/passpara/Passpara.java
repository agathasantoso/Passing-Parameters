/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passpara;

/**
 *
 * @author NAT
 */
public class Passpara {

    public static void main(String[] args) {
        Mobil a = new Mobil(100);
        Mobil b = a;
        System.out.println(b); //print : a
        a.setKecepatan(80);
        System.out.println(b); //print b       
    }  

    private static class Mobil{
        private int kecepatan = 100;

        public Mobil(int kecepatan) {
            this.kecepatan = kecepatan;
        }

        public void setKecepatan(int kecepatan) {
            this.kecepatan = kecepatan;
        }      

        @Override
        public String toString() {
            return "Mobil kecepatan : " + this.kecepatan;
        }      
    }
}
