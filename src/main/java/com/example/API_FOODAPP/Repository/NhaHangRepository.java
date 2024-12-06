package com.example.API_FOODAPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_FOODAPP.Model.NhaHang;

@Repository
public interface NhaHangRepository extends JpaRepository<NhaHang, Integer>{

}
