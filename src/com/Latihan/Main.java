package com.Latihan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku b2 = new Buku("UML", "Ivar Jacobson", 400000);

        ArrayList buku1 = new ArrayList<Buku>();
        buku1.add("Judul : " + b1.getJudul());
        buku1.add("Pengarang : " + b1.getPengarang());
        buku1.add("Harga : " + b1.getHarga());

        ArrayList buku2 = new ArrayList<Buku>();
        buku2.add("Judul : " + b2.getJudul());
        buku2.add("Pengarang : " + b2.getPengarang());
        buku2.add("Harga : " + b2.getHarga());

        System.out.println("====== Buku 1 ======");
        for (Object bk1 : buku1){
            System.out.println(bk1);
        }

        System.out.println("\n====== Buku 2 ======");
        for (Object bk2 : buku2){
            System.out.println(bk2);
        }
    }
}
