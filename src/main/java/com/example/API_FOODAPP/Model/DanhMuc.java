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
@Table(name = "tbDANHMUC")
public class DanhMuc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tenDanhMuc", nullable = false)
	private String tenDanhMuc;
	
	@Column(name = "hinhAnh")
	private String hinhAnh;
	
	@OneToMany(mappedBy = "danhMuc", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
    private List<SanPham> sanPhams;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDanhMuc() {
		return tenDanhMuc;
	}
	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public List<SanPham> getSanPhams() { return sanPhams; }
    public void setSanPhams(List<SanPham> sanPhams) { this.sanPhams = sanPhams; }
	
	public DanhMuc() {
		super();
	}
	public DanhMuc(int id, String tenDanhMuc, String hinhAnh) {
		super();
		this.id = id;
		this.tenDanhMuc = tenDanhMuc;
		this.hinhAnh = hinhAnh;
	}
	
	
}
