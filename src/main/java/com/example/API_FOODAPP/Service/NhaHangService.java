package com.example.API_FOODAPP.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_FOODAPP.Model.NhaHang;
import com.example.API_FOODAPP.Repository.NhaHangRepository;

@Service
public class NhaHangService {
	@Autowired
	private NhaHangRepository nhaHangRepository;
	
	public List<NhaHang> getAllNhaHang(){
		return nhaHangRepository.findAll();
	}
	
	public NhaHang getNhaHangById(int id) {
		Optional<NhaHang> nhaHang = nhaHangRepository.findById(id);
	    return nhaHang.orElse(null); // Trả về null nếu không tìm thấy
	}
	
	public NhaHang addNhaHang(NhaHang nhaHang) {
		return nhaHangRepository.save(nhaHang);
	}
}
