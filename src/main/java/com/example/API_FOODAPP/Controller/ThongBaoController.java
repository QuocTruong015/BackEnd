package com.example.API_FOODAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_FOODAPP.Model.ThongBao;
import com.example.API_FOODAPP.Service.ThongBaoService;

@RestController
@RequestMapping("/api/thongbao")
public class ThongBaoController {
	@Autowired
	private ThongBaoService thongBaoService;
	
	@GetMapping
	public List<ThongBao> getAllThongBao(){
		return thongBaoService.getAllThongBao();
	}
	
	@PostMapping
	public ResponseEntity<ThongBao> addThongBao(@RequestBody ThongBao ThongBao) {
        ThongBao newThongBao = thongBaoService.addThongBao(ThongBao);
        return ResponseEntity.ok(newThongBao);
    }
}
