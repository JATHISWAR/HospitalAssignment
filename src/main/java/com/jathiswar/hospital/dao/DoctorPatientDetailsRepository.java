package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.DoctorPatientDetails;
import com.jathiswar.hospital.entity.DoctorPatientID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorPatientDetailsRepository extends JpaRepository<DoctorPatientDetails, DoctorPatientID> {

}
