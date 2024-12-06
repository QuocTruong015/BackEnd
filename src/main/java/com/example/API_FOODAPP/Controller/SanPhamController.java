package com.example.API_FOODAPP.Controller;

import com.example.API_FOODAPP.Model.SanPham;
import com.example.API_FOODAPP.Service.SanPhamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sanpham")
public class SanPhamController {
    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping
    public List<SanPham> getAllSanPham() {
        return sanPhamService.getAllSanPham();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SanPham> getSanPhamById(@PathVariable int id) {
        SanPham sanPham = sanPhamService.getSanPhamById(id);
        if (sanPham != null) {
            return ResponseEntity.ok(sanPham);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
 // API tìm sản phẩm theo tên
    @GetMapping("/search")
    public List<SanPham> getSanPhamByName(@RequestParam String tenSanPham) {
        return sanPhamService.getSanPhamByName(tenSanPham);
    }
    
    // Lấy sản phẩm theo danh mục
    @GetMapping("/danhmuc/{id}")
    public ResponseEntity<List<SanPham>> getSanPhamByDanhMucId(@PathVariable int id) {
        List<SanPham> sanPhamList = sanPhamService.getSanPhamByDanhMucId(id);
        if (sanPhamList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sanPhamList);
    }

    // Lấy sản phẩm theo nhà hàng
    @GetMapping("/nhahang/{id}")
    public ResponseEntity<List<SanPham>> getSanPhamByNhaHangId(@PathVariable int id) {
        List<SanPham> sanPhamList = sanPhamService.getSanPhamByNhaHangId(id);
        if (sanPhamList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sanPhamList);
    }

    @PostMapping
    public SanPham saveSanPham(@RequestBody SanPham sanPham) {
        return sanPhamService.saveSanPham(sanPham);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSanPham(@PathVariable int id) {
        sanPhamService.deleteSanPham(id);
        return ResponseEntity.noContent().build();
    }
}
