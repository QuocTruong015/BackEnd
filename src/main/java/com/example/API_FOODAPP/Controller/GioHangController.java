package com.example.API_FOODAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API_FOODAPP.Model.GioHang;
import com.example.API_FOODAPP.Service.GioHangService;

@RestController
@RequestMapping("/api/giohang")
public class GioHangController {
	
	@Autowired
    private GioHangService gioHangService;
	
	@PostMapping
    public GioHang addProductToCart(@RequestBody GioHang gioHang) {
        return gioHangService.addProductToCart(gioHang);
    }

    // API để lấy tất cả sản phẩm trong giỏ hàng
    @GetMapping
    public List<GioHang> getAllProductsInCart() {
        return gioHangService.getAllProductsInCart();
    }

    // API để xóa sản phẩm khỏi giỏ hàng
    @DeleteMapping("/{id}")
    public void removeProductFromCart(@PathVariable int id) {
        gioHangService.removeProductFromCart(id);
    }
}
