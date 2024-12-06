package com.example.API_FOODAPP.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "tbSANPHAM")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String tenSP;

    @Column(name = "hinhAnh")
    private String hinhAnh;

    @Column(name = "dacDiem")
    private String dacDiem;

    @Column(name = "chiTiet")
    private String chiTiet;

    @Column(name = "gia")
    private double gia;

    @ManyToOne
    @JoinColumn(name = "maDanhMuc", nullable = false)
    @JsonBackReference
    private DanhMuc danhMuc;

    @ManyToOne
    @JoinColumn(name = "maNhaHang", nullable = false)
    @JsonBackReference
    private NhaHang nhaHang;
//    
//    @ManyToOne
//    @JoinColumn(name = "maGioHang", nullable = false)
//    @JsonBackReference
//    private GioHang gioHang;
    

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTenSP() { return tenSP; }
    public void setTenSP(String tenSP) { this.tenSP = tenSP; }
    public String getHinhAnh() { return hinhAnh; }
    public void setHinhAnh(String hinhAnh) { this.hinhAnh = hinhAnh; }
    public String getDacDiem() { return dacDiem; }
    public void setDacDiem(String dacDiem) { this.dacDiem = dacDiem; }
    public String getChiTiet() { return chiTiet; }
    public void setChiTiet(String chiTiet) { this.chiTiet = chiTiet; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
    public DanhMuc getDanhMuc() { return danhMuc; }
    public void setDanhMuc(DanhMuc danhMuc) { this.danhMuc = danhMuc; }
    public NhaHang getNhaHang() { return nhaHang; }
    public void setNhaHang(NhaHang nhaHang) { this.nhaHang = nhaHang; }
}