/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi03_maithenghia;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class HangHoa {
    protected String maHang;
    protected String tenhang;
    protected long dongia;
    public HangHoa(){
        maHang=null;
        tenhang=null;
        dongia=0;
    }
    public HangHoa(String mh,String th,long dg){
        maHang=mh;
        tenhang=th;
        dongia=dg;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }
    
    public void Nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ma Hang:");
        maHang=sc.nextLine();
        System.out.println("Ten Hang:");
        tenhang=sc.nextLine();
        System.out.println("Don Gia:");
        dongia=sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Ma Hang: "+getMaHang());
        System.out.println("Ten Hang: "+getTenhang());
        System.out.println("Don Gia: "+getDongia());
    }
    
   
}
