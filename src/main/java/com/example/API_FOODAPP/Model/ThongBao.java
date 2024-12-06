package com.example.API_FOODAPP.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbTHONGBAO")
public class ThongBao {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tenThongBao")
    private String tenThongBao;
	
	@Column(name = "moTa")
    private String moTa;
	
	@Column(name = "hinhAnh")
    private String hinhAnh;
	
	public ThongBao(int id, String tenThongBao, String moTa, String hinhAnh) {
		super();
		this.id = id;
		this.tenThongBao = tenThongBao;
		this.moTa = moTa;
		this.hinhAnh = hinhAnh;
	}
	
	
	
	public ThongBao() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenThongBao() {
		return tenThongBao;
	}
	public void setTenThongBao(String tenThongBao) {
		this.tenThongBao = tenThongBao;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
    
    
}
