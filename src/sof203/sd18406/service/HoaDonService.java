/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd18406.service;

import java.util.ArrayList;
import sof203.sd18406.entity.HoaDon;
import sof203.sd18406.repository.HoaDonRepository;

/**
 *
 * @author nguyenvv
 */
public class HoaDonService {

    HoaDonRepository hoaDonRepository = new HoaDonRepository();

    public ArrayList<HoaDon> getList() {
        return hoaDonRepository.getAll();
    }

//    public String addNew(HoaDon hoaDon) {
//        listHoaDon.add(hoaDon);
//        return "Them thanh cong";
//    }
//
//    public ArrayList<HoaDon> searchByName(String ten) {
//        ArrayList<HoaDon> kq = new ArrayList<>();
//        for (HoaDon hd : listHoaDon) {
//            if (hd.getTen().equals(ten)) {
//                kq.add(hd);
//            }
//        }
//        return kq;
//    }
}
