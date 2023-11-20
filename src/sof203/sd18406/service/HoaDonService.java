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

    public String addNew(HoaDon hoaDon) {
        if (hoaDonRepository.addNew(hoaDon) == true) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }
    public String update(HoaDon hoaDon) {
        if (hoaDonRepository.update(hoaDon) == true) {
            return "Update thanh cong";
        } else {
            return "Update that bai";
        }
    }

    public String delete(String id) {
        Boolean check = hoaDonRepository.delete(id);
        if (check) {
            return "Xoa thanh cong";
        } else {
            return "Xoa that bai";
        }
    }

    public ArrayList<HoaDon> searchByName(String ten) {
        ArrayList<HoaDon> kq = hoaDonRepository.searchByName(ten);
        return kq;
    }
}
