package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.DoctorPatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorPatientDetailsRepository extends JpaRepository<DoctorPatientDetails, Integer> {
}
