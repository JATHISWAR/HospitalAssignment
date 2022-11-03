package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT DISTINCT p FROM Person p JOIN p.doctorDetails doc WHERE doc.patientAadharNo=?1")
    public Set<Person> findAllDoctors(Long patient);

    @Query("SELECT DISTINCT p FROM Person p JOIN p.patientDetails doc WHERE doc.doctorAadharNo=?1")
    public Set<Person> findAllPatients(Long doctor);



}
