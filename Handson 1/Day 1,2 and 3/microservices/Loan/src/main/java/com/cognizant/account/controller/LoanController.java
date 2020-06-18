package com.cognizant.account.controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.LoanMicroservices;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@GetMapping("/{number}")
	public LoanMicroservices accountDetails(@PathVariable String number) {
		LoanMicroservices am=new LoanMicroservices();
		am.setNumber("H00987987972342");
		am.setType("car");
		am.setLoan(400000);
		am.setEmi(3258);
		am.setTenure(18);
		return am;
	}

}
