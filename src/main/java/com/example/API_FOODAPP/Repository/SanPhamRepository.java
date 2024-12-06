package com.example.API_FOODAPP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_FOODAPP.Model.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
	
	// Lấy sản phẩm theo danh mục
    List<SanPham> findByDanhMucId(int danhMucId);

    // Lấy sản phẩm theo nhà hàng
    List<SanPham> findByNhaHangId(int nhaHangId);
	
    List<SanPham> findByTenSPContainingIgnoreCase(String tenSP);
}
