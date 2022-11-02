package com.jathiswar.hospital.dao;

import com.jathiswar.hospital.BaseEntity;
import com.jathiswar.hospital.BaseRepository;
import com.jathiswar.hospital.entity.PatientPaymentDetail;
import org.hibernate.type.IdentifierType;


public interface PatientPaymentDetailRepository extends BaseRepository<BaseEntity, IdentifierType> {
}
