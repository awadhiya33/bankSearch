package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BankList;

@Service
public interface BankListServiceImpl {
	Optional<BankList> findByIfsc(String ifsc);
}
