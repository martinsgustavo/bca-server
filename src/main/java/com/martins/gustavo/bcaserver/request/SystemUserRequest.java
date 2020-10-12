package com.martins.gustavo.bcaserver.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SystemUserRequest implements Serializable {

    private static final long serialVersionUID = 4684802647289765537L;

    private String user;

    private String password;
}
