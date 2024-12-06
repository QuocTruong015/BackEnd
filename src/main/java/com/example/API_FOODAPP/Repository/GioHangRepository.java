package com.example.API_FOODAPP.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_FOODAPP.Model.GioHang;

@Repository
public interface GioHangRepository extends JpaRepository<GioHang, Integer>{

}
