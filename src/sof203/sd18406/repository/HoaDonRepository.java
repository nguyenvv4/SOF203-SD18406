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

    public Boolean addNew(HoaDon hoaDon) {
        String sql = "INSERT INTO HoaDon (Ten, SoLuong, LoaiVe) "
                + "VALUES (?, ?, ?)";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setObject(1, hoaDon.getTen());
            pst.setObject(2, hoaDon.getSoLuong());
            pst.setObject(3, hoaDon.getLoaiVe());
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean update(HoaDon hoaDon) {
        String sql = "update HoaDon "
                + " set Ten =?, SoLuong =?, LoaiVe =? where id =?";
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setObject(1, hoaDon.getTen());
            pst.setObject(2, hoaDon.getSoLuong());
            pst.setObject(3, hoaDon.getLoaiVe());
            pst.setObject(4, hoaDon.getId());
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(String id) {
        String sql = "delete from HoaDon where id = " + id;
        try (Connection conn = dbConnection.getConnection();
                PreparedStatement pst = conn.prepareStatement(sql)) {
//            pst.setObject(1, id);
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public ArrayList<HoaDon> searchByName(String name) {
        String sql = "select * from HoaDon "
                + " WHERE Ten like  '%" + name + "%'";
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
