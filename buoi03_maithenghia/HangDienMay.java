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
public class HangDienMay extends HangHoa{
    private int thoigianbh;
    private int dienap;
    private int congxuat;
    public HangDienMay(){
        thoigianbh=0;
        dienap=0;
        congxuat=0;
    }
    public HangDienMay(String mahang,String tenhang,long dongia,int thoigianbh,int dienap,int congsuat){
        super(mahang,tenhang,dongia);
        this.thoigianbh=thoigianbh;
        this.dienap=dienap;
        this.congxuat=congsuat;
    }

    public int getThoigianbh() {
        return thoigianbh;
    }

    public void setThoigianbh(int thoigianbh) {
        this.thoigianbh = thoigianbh;
    }

    public int getDienap() {
        return dienap;
    }

    public void setDienap(int dienap) {
        this.dienap = dienap;
    }

    public int getCongxuat() {
        return congxuat;
    }

    public void setCongxuat(int congxuat) {
        this.congxuat = congxuat;
    }
    public void NhapHH(){
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap Tg bao hanh:");
        thoigianbh= sc.nextInt();
        System.out.println("Nhap so dien ap:");
        dienap= sc.nextInt();
        System.out.println("Nhap so cong suat:");
        congxuat= sc.nextInt();
    }
    public void XuatHH(){
        super.Xuat();
        System.out.println("Thoi gian bao hanh: "+getThoigianbh());
         System.out.println("Dien ap: "+getDienap());
         System.out.println("Cong suat:"+getCongxuat());
    }
   
}

 
