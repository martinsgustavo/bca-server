package com.martins.gustavo.bcaserver.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "SYSTEM_USER")
public class SystemUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SYSTEM_USER")
    private Integer systemUserId;

    @Column(name = "CD_USER")
    private String user;

    @Column(name = "DS_PASSWORD")
    private String password;

    @Column(name = "ID_SYSTEM_USER_TYPE")
    private Integer systemUserType;

    @Column(name = "FL_ACTIVE")
    private Boolean active;

    @Column(name = "DT_CREATION")
    private Date creationDate;

    @Column(name = "DT_MODIFICATION")
    private Date modificationDate;
}
