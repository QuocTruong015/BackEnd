package com.example.API_FOODAPP.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbGIOHANG")
public class GioHang {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "sanPhamId")
	private int sanPhamId;

    @Column(name = "tenSanPham")
    private String tenSP;

    @Column(name = "hinhAnh")
    private String hinhAnh;

    @Column(name = "dacDiem")
    private String dacDiem;

    @Column(name = "soLuong")
    private int soLuong;

    @Column(name = "gia")
    private double gia;
    

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSanPhamId() {
		return sanPhamId;
	}

	public void setSanPhamId(int sanPhamId) {
		this.sanPhamId = sanPhamId;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getDacDiem() {
		return dacDiem;
	}

	public void setDacDiem(String dacDiem) {
		this.dacDiem = dacDiem;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public GioHang() {
		super();
	}

	public GioHang(int id, int sanPhamId, String tenSP, String hinhAnh, String dacDiem, int soLuong, double gia) {
		super();
		this.id = id;
		this.sanPhamId = sanPhamId;
		this.tenSP = tenSP;
		this.hinhAnh = hinhAnh;
		this.dacDiem = dacDiem;
		this.soLuong = soLuong;
		this.gia = gia;
		
	}

}
