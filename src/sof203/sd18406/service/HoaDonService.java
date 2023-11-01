/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd18406.service;

import java.util.ArrayList;
import sof203.sd18406.entity.HoaDon;

/**
 *
 * @author nguyenvv
 */
public class HoaDonService {

    ArrayList<HoaDon> listHoaDon = new ArrayList();

    public HoaDonService() {
        listHoaDon.add(new HoaDon("Nguyen Van A", 5, "Hoc Lai"));
        listHoaDon.add(new HoaDon("Nguyen Van B", 5, "Hoc Lai"));
        listHoaDon.add(new HoaDon("Nguyen Van C", 5, "Hoc Di"));

    }

    public ArrayList<HoaDon> getList() {
        return listHoaDon;
    }

    public String addNew(HoaDon hoaDon) {
        listHoaDon.add(hoaDon);
        return "Them thanh cong";
    }

    public ArrayList<HoaDon> searchByName(String ten) {
        ArrayList<HoaDon> kq = new ArrayList<>();
        for (HoaDon hd : listHoaDon) {
            if (hd.getTen().equals(ten)) {
                kq.add(hd);
            }
        }
        return kq;
    }

}
