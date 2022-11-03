package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.DoctorDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorDetailsRepository extends JpaRepository<DoctorDetails, Long> {
}
