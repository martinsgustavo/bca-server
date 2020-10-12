package com.martins.gustavo.bcaserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "SYSTEM_USER_TYPE")
public class SystemUserType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SYSTEM_USER_TYPE")
    private Integer systemUserTypeId;

    @Column(name = "DS_TYPE")
    private String type;
}
