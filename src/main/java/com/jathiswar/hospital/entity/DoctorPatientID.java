package com.jathiswar.hospital.entity;


import java.io.Serializable;
import java.util.Objects;

public class DoctorPatientID implements Serializable {
    private Long doctorAadharNo;
    private Long patientAadharNo;




    public DoctorPatientID() {
    }



    public DoctorPatientID(long doctorNumber, long patientNumber) {
        this.doctorAadharNo = doctorNumber;
        this.patientAadharNo = patientNumber;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DoctorPatientID docpatientId = (DoctorPatientID) o;
        return doctorAadharNo.equals(docpatientId.doctorAadharNo)
                && patientAadharNo.equals(docpatientId.patientAadharNo);
    }



    @Override
    public int hashCode() {
        return Objects.hash(doctorAadharNo, patientAadharNo);
    }
}