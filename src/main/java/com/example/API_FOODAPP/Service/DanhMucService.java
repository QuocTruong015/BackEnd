package com.example.API_FOODAPP.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_FOODAPP.Model.DanhMuc;
import com.example.API_FOODAPP.Repository.DanhMucRepository;

@Service
public class DanhMucService {

	@Autowired
	private DanhMucRepository danhMucRepository;
	
	public List<DanhMuc> getAllDanhMuc(){
		return danhMucRepository.findAll();
	}
	
	public DanhMuc getDanhMucById(int id) {
	    Optional<DanhMuc> danhMuc = danhMucRepository.findById(id);
	    return danhMuc.orElse(null); // Trả về null nếu không tìm thấy
	}
	
	public DanhMuc addDanhMuc(DanhMuc danhmuc) {
		return danhMucRepository.save(danhmuc);
	}
}
