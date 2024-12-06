package com.example.API_FOODAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_FOODAPP.Model.DanhMuc;
import com.example.API_FOODAPP.Service.DanhMucService;

@RestController
@RequestMapping("/api/danhmuc")
public class DanhMucController {
	@Autowired
	private DanhMucService danhMucService;
	
	@GetMapping
	public List<DanhMuc> getAllDanhMuc(){
		return danhMucService.getAllDanhMuc();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<?> getDanhMucById(@PathVariable int id) {
        try {
            DanhMuc danhMuc = danhMucService.getDanhMucById(id);
            if (danhMuc == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Không tìm thấy danh mục với ID: " + id);
            }
            return ResponseEntity.ok(danhMuc);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
	
	@PostMapping
	public ResponseEntity<DanhMuc> addDanhMuc(@RequestBody DanhMuc danhMuc) {
        DanhMuc newDanhMuc = danhMucService.addDanhMuc(danhMuc);
        return ResponseEntity.ok(newDanhMuc);
    }
}
