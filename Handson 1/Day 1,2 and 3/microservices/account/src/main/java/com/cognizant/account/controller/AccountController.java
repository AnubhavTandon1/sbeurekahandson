package com.cognizant.account.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.AccountMicroservices;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@GetMapping("/{number}")
	public AccountMicroservices accountDetails(@PathVariable String number) {
		AccountMicroservices am=new AccountMicroservices();
		am.setNumber("00987987973432");
		am.setBalance(475893);
		am.setType("saving");
		return am;
	}

}
