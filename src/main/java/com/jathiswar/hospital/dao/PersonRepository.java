package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
