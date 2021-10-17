package com.Latihan;

class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    // Konstruktor
    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method set
    void setJudul(String judul) {
        this.judul = judul;
    }
    void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    void setHarga(double harga) {
        this.harga = harga;
    }

    // Method get
    String getJudul() {
        return judul;
    }
    String getPengarang () {
        return pengarang;
    }
    double getHarga () {
        return harga;
    }
}
