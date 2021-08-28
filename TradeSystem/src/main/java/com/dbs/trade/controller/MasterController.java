package com.dbs.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.trade.beans.Client;
import com.dbs.trade.repository.ClientRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MasterController {
	
	@Autowired
	private ClientRepository clientrepo;
	
	
	@GetMapping("/client/{cid}")
	public Client getClient(@PathVariable String cid)
	{
		return this.clientrepo.findById(cid).get();
	}
	
	
	

}
