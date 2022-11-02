package com.jathiswar.hospital;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public abstract class BaseEntity<IdType extends Serializable> {
    @Id
    private IdType id;
}
