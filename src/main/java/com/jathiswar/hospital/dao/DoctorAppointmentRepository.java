package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Long> {
}
