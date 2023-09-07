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
public class HangThucPham extends HangHoa {
    String NgaySx;
    String NgayHH;

    public HangThucPham() {
        NgaySx=null;
        NgayHH=null;
    }

    public HangThucPham(String mahang,String tenhang,long dongia,String NgaySx, String NgayHH) {
        super(mahang,tenhang,dongia);
        this.NgaySx = NgaySx;
        this.NgayHH = NgayHH;
    }

    public String getNgaySx() {
        return NgaySx;
    }

    public void setNgaySx(String NgaySx) {
        this.NgaySx = NgaySx;
    }

    public String getNgayHH() {
        return NgayHH;
    }

    public void setNgayHH(String NgayHH) {
        this.NgayHH = NgayHH;
    }
    public void NhapTp(){
         Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap ngay san xuat:");
        NgaySx= sc.nextLine();
        System.out.println("Nhap ngay het han");
        NgayHH= sc.nextLine();  
    }
     public void XuatTp(){
        super.Xuat();
        System.out.println("Ngay San xuat: "+getNgaySx());
         System.out.println("Ngay Het Han: "+getNgayHH());
    }

    
}
  
