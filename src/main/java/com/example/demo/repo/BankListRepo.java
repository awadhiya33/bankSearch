package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BankList;

public interface BankListRepo extends JpaRepository<BankList,String>{
	
	//@Query(value="select * from \"bank_list\" where \"ifsc\" = :ifsc",nativeQuery=true)
	Optional<BankList> findByIfsc(String ifsc);
}
