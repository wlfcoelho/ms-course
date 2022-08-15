package com.coelho.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coelho.payroll.entities.Payment;
import com.coelho.payroll.entities.Worker;
import com.coelho.payroll.feignclients.WorkerFeingCleint;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeingCleint workerFeingCleint; 
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeingCleint.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
