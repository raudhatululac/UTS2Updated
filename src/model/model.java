/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author naufa
 */
public class model {

    private double reguler;
    private double mahasiswa;
    private double privat;
    private double premium;
    private double out;
    public String akhir;

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }

    public double getReguler() {
        return reguler;
    }

    public void setReguler(double reguler) {
        this.reguler = 450000;
    }

    public double getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(double mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public double getPrivat() {
        return privat;
    }

    public void setPrivat(double privat) {
        this.privat = privat;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
}
