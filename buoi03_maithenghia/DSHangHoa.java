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
public class DSHangHoa {
    public static void main(String[] args) {
        byte chon,loai;
        Scanner doc= new Scanner(System.in);
        ArrayList<HangHoa> dshh = new ArrayList<>();
       
        do{
            System.out.println("1:Them mot mat hang vao danh sach:");
            System.out.println("2:Xuat mat hang them loai");
            System.out.println("0: Thoat");
            System.out.println("Chon chuc nang:");
            chon=doc.nextByte();
            switch(chon){
                case 1:
                    System.out.println("1:Hang dien may,2 Hang thuc pham.Hay chon loai mat hang:");
                    loai=doc.nextByte();
                    if(loai==1){
                        HangHoa h=new HangDienMay();
                        h.Nhap();
                        dshh.add(h);
                    }else{
                       HangHoa h=new HangHoa();
                       h.Nhap();
                       dshh.add(h);
                    }
                    
                    break;
                case 2:
                    System.out.println("Xuat danh sach mat hang nao(1.DM/2.TP):");
                    int a =doc.nextInt();
                    for(int i=0; i<dshh.size(); i++)
                        dshh.get(i).Xuat();
            }
        }while(chon!=0);
    }
}
