package com.jathiswar.hospital.dao;


import com.jathiswar.hospital.entity.PatientPaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientPaymentDetailRepository extends JpaRepository<PatientPaymentDetail,Long> {
}
