package com.example.API_FOODAPP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_FOODAPP.Model.DonHang;

@Repository
public interface DonHangRepository extends JpaRepository<DonHang, Integer>{

	List<DonHang> findByTrangThai(String trangThai);
	
}
