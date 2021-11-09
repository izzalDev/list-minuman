package com.rizal.listminuman;

public class Data {
    public Data(String nama, String rating, String deskripsi, int id_image) {
        this.nama = nama;
        this.rating = rating;
        this.deskripsi = deskripsi;
        this.id_image = id_image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    private String nama,rating,deskripsi;
    private int id_image;
}
