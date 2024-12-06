package com.example.API_FOODAPP.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_FOODAPP.Model.SanPham;
import com.example.API_FOODAPP.Repository.SanPhamRepository;

import java.util.List;

@Service
public class SanPhamService {
    @Autowired
    private SanPhamRepository sanPhamRepository;

    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }
    
    // Lấy sản phẩm theo ID danh mục
    public List<SanPham> getSanPhamByDanhMucId(int danhMucId) {
        return sanPhamRepository.findByDanhMucId(danhMucId);
    }

 // Lấy sản phẩm theo tên
    public List<SanPham> getSanPhamByName(String tenSanPham) {
        return sanPhamRepository.findByTenSPContainingIgnoreCase(tenSanPham);
    }
    
    // Lấy sản phẩm theo ID nhà hàng
    public List<SanPham> getSanPhamByNhaHangId(int nhaHangId) {
        return sanPhamRepository.findByNhaHangId(nhaHangId);
    }

    public SanPham getSanPhamById(int id) {
        return sanPhamRepository.findById(id).orElse(null);
    }

    public SanPham saveSanPham(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    public void deleteSanPham(int id) {
        sanPhamRepository.deleteById(id);
    }
}
