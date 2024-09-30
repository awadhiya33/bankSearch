package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BankList;
import com.example.demo.service.BankListServiceImpl;

@RestController
@RequestMapping("/bank")
public class BankListController {
	
	@Autowired
	BankListServiceImpl bankListServiceImpl;
	
	@GetMapping("/ifsc/{ifsc}")
	public Optional<BankList> processBankList(@PathVariable String ifsc){
		
		Optional<BankList>bankLists=bankListServiceImpl.findByIfsc(ifsc);
		return bankLists;
		
	}
}
























