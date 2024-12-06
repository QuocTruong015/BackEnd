package com.example.API_FOODAPP.Model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbDONHANG")
public class DonHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tenDonHang", nullable = false)
    private String tenDonHang;

    @Column(name = "maSanPham", nullable = false)
    private Integer maSanPham;

    @Column(name = "hinhAnh", nullable = false)
    private String hinhAnh;

    @Column(name = "soLuong", nullable = false, columnDefinition = "INT DEFAULT 1")
    private Integer soLuong;

    @Column(name = "gia", nullable = false)
    private Double gia;

    @Column(name = "trangThai")
    private String trangThai;


    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(Integer maSanPham) {
        this.maSanPham = maSanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    

    public Double getGia() {
		return gia;
	}

	public void setGia(Double gia) {
		this.gia = gia;
	}

	public String getTenDonHang() {
        return tenDonHang;
    }

    public void setTenDonHang(String tenDonHang) {
        this.tenDonHang = tenDonHang;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public DonHang() {
        super();
    }

    public DonHang(String tenDonHang, Integer maSanPham, String hinhAnh, Integer soLuong, Double gia, String trangThai) {
        super();
        this.tenDonHang = tenDonHang;
        this.maSanPham = maSanPham;
        this.hinhAnh = hinhAnh;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }
}
