package com.example.API_FOODAPP.Service;

import com.example.API_FOODAPP.Model.DonHang;
import com.example.API_FOODAPP.Repository.DonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonHangService {
	@Autowired
    private DonHangRepository donHangRepository;

    // Get all orders
    public List<DonHang> getAllDonHang() {
        return donHangRepository.findAll();
    }

    // Get orders by status
    public List<DonHang> getDonHangByTrangThai(String trangThai) {
        return donHangRepository.findByTrangThai(trangThai);
    }

    // Add a new order
    public DonHang addDonHang(DonHang donHang) {
        return donHangRepository.save(donHang);
    }
}
