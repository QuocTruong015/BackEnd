package com.example.API_FOODAPP.Controller;

import com.example.API_FOODAPP.Model.DonHang;
import com.example.API_FOODAPP.Service.DonHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donhang")
public class DonHangController {

    @Autowired
    private DonHangService donHangService;

    // Get all orders
    @GetMapping
    public ResponseEntity<List<DonHang>> getAllDonHang() {
        return ResponseEntity.ok(donHangService.getAllDonHang());
    }

    // Get orders by status
    @GetMapping("/trangthai")
    public ResponseEntity<List<DonHang>> getDonHangByTrangThai(@RequestParam String trangThai) {
        return ResponseEntity.ok(donHangService.getDonHangByTrangThai(trangThai));
    }

    // Add a new order
    @PostMapping
    public ResponseEntity<DonHang> addDonHang(@RequestBody DonHang donHang) {
        DonHang newDonHang = donHangService.addDonHang(donHang);
        return ResponseEntity.ok(newDonHang);
    }
}
