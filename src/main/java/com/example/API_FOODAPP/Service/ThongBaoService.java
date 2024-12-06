package com.example.API_FOODAPP.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_FOODAPP.Model.ThongBao;
import com.example.API_FOODAPP.Repository.ThongBaoRepository;


@Service
public class ThongBaoService {
	@Autowired
	private ThongBaoRepository thongBaoRepository;
	
	public List<ThongBao> getAllThongBao(){
		return thongBaoRepository.findAll();
	}
	
	public ThongBao addThongBao(ThongBao thongBao) {
		return thongBaoRepository.save(thongBao);
	}
}
