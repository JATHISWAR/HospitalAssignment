package com.jathiswar.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;


public interface BaseRepository<T extends BaseEntity,IdType extends Serializable> extends JpaRepository<T,IdType> {
}
