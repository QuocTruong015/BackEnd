package com.example.API_FOODAPP.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_FOODAPP.Model.GioHang;
import com.example.API_FOODAPP.Repository.GioHangRepository;

@Service
public class GioHangService {

	@Autowired
	GioHangRepository gioHangRepository;
	
	public GioHang addProductToCart(GioHang gioHang) {
        return gioHangRepository.save(gioHang);
    }

    public List<GioHang> getAllProductsInCart() {
        return gioHangRepository.findAll();
    }

    public void removeProductFromCart(int id) {
        gioHangRepository.deleteById(id);
    }
    
    public void removeProduct() {
        gioHangRepository.deleteAll();
    }
	
}
