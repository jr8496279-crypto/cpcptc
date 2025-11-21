package com.mongocpc.mongocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongocpc.mongocrud.model.Customer; 
import com.mongocpc.mongocrud.repository.CustRepo;

@RestController
public class CustController {
	
	@Autowired
	
	CustRepo custrepo;
	
	@RequestMapping("/addCust")
	public String addCust(@RequestBody Customer customer) {
		custrepo.save(customer);
		return "record inserted successfully";
	}
	@GetMapping("/getCust")
public List<Customer> getCust(){
	return custrepo.findAll();
}
	@DeleteMapping("/delCust/{cid}")
 public String delCust(@PathVariable int cid) {
		custrepo.deleteById(cid);
		return "record deleted successfully";
	}
	@PutMapping("/updCust")
	public String updCust(@RequestBody Customer customer) {
		Customer newCust=custrepo.findById(customer.getCid()).get();
		newCust.setCname(customer.getCname());
		newCust.setFname(customer.getFname());
		newCust.setLname(customer.getLname());
		newCust.setLocation(customer.getLocation());
		custrepo.save(newCust);
		return "record updated successfully";
		
	}
	
}
