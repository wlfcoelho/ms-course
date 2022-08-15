package com.coelho.demo.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelho.demo.worker.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
