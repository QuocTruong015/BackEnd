package com.example.API_FOODAPP.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbNHAHANG")
public class NhaHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "hinhAnh")
	private String hinhAnh;
	
	@Column(name = "tenNhaHang")
	private String tenNhaHang;
	
	@Column(name = "moTa")
	private String moTa;
	
	@Column(name = "tenMonAn")
	private String tenMonAn;
	
	@OneToMany(mappedBy = "nhaHang", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
    private List<SanPham> sanPhams;
	
	public NhaHang() {
		super();
	}
	public NhaHang(int id, String hinhAnh, String tenNhaHang, String moTa, String tenMonAn) {
		super();
		this.id = id;
		this.hinhAnh = hinhAnh;
		this.tenNhaHang = tenNhaHang;
		this.moTa = moTa;
		this.tenMonAn = tenMonAn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getTenNhaHang() {
		return tenNhaHang;
	}
	public void setTenNhaHang(String tenNhaHang) {
		this.tenNhaHang = tenNhaHang;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getTenMonAn() {
		return tenMonAn;
	}
	public void setTenMonAn(String tenMonAn) {
		this.tenMonAn = tenMonAn;
	}
	public List<SanPham> getSanPhams() { return sanPhams; }
    public void setSanPhams(List<SanPham> sanPhams) { this.sanPhams = sanPhams; }
}
