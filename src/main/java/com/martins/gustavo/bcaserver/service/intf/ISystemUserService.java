package com.martins.gustavo.bcaserver.service.intf;

public interface ISystemUserService {

    boolean validateSignIn(String user, String password);
}
