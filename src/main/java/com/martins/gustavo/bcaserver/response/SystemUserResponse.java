package com.martins.gustavo.bcaserver.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SystemUserResponse extends GeneralResponse {

    private static final long serialVersionUID = 4736669329323196946L;

    private boolean isValidate;
}
