package com.example.API_FOODAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_FOODAPP.Service.NhaHangService;
import com.example.API_FOODAPP.Model.NhaHang;

@RestController
@RequestMapping("/api/nhahang")
public class NhaHangController {
	@Autowired
	private NhaHangService nhaHangService;
	
	@GetMapping
	public List<NhaHang> getAllNhaHang(){
		return nhaHangService.getAllNhaHang();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<NhaHang> getNhaHangById(@PathVariable int id) {
	    try {
	        NhaHang nhaHang = nhaHangService.getNhaHangById(id);
	        return ResponseEntity.ok(nhaHang);
	    } catch (RuntimeException e) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	    }
	}
}
