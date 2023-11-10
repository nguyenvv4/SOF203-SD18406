/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203.sd18406.repository;

import java.util.ArrayList;
import sof203.sd18406.entity.HoaDon;
import java.sql.*;

/**
 *
 * @author nguyenvv
 */
public class HoaDonRepository {

    DbConnection dbConnection;

    public ArrayList<HoaDon> getAll() {
        String sql = "SELECT  * FROM HoaDon";
        ArrayList<HoaDon> list = new ArrayList<>();
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Integer id = rs.getInt("Id");
                String ten = rs.getString("Ten");
                Integer soLuong = rs.getInt("SoLuong");
                String loaiVe = rs.getString("LoaiVe");
                HoaDon hoaDon = new HoaDon(id, ten, soLuong, loaiVe);
                list.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
