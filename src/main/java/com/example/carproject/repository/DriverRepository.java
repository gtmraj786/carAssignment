package com.example.carproject.repository;

import com.example.carproject.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Long>
{
    Driver findByDriverName(String s);
}
