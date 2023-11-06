/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd18406.service;

import java.util.ArrayList;
import sof203.sd18406.entity.SanPham;

/**
 *
 * @author nguyenvv
 */
public class SanPhamService {

    ArrayList<SanPham> list = new ArrayList<>();

    public SanPhamService() {
        list.add(new SanPham("Banh mi", "SP01", 20, 100, "Hang kho", "Con hang"));
        list.add(new SanPham("Banh gao", "SP02", 10, 50, "Hang kho", "Con hang"));
        list.add(new SanPham("Banh gai", "SP03", 10, 5000, "Hang kho", "Con hang"));
    }

    public ArrayList<SanPham> getList() {
        return list;
    }

    public ArrayList<SanPham> search(int min, int max) {
        ArrayList<SanPham> listKq = new ArrayList<>();
        for (SanPham sp : list) {
            if (sp.getGiaBan() > min && sp.getGiaBan() < max) {
                listKq.add(sp);
            }
        }
        return listKq;
    }

}
