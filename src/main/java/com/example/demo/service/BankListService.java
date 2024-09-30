package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BankList;
import com.example.demo.repo.BankListRepo;

@Service
public class BankListService implements BankListServiceImpl{
	
	@Autowired
	BankListRepo bankListRepo;

	@Override
	public Optional<BankList> findByIfsc(String ifsc) {
		
		Optional<BankList>bankLists=bankListRepo.findByIfsc(ifsc);
		return bankLists;
	}

}
