package com.example.API_FOODAPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.API_FOODAPP.Model.DanhMuc;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer>{

}
