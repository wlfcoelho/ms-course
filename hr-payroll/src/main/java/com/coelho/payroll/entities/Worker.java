package com.coelho.payroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Worker implements Serializable {


	private static final long serialVersionUID = 1L;

	private Long id;	
	private String name;
	private Double dailyIncome;
}
