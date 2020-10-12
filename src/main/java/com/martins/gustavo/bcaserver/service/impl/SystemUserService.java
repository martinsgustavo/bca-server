package com.martins.gustavo.bcaserver.service.impl;

import com.martins.gustavo.bcaserver.service.intf.ISystemUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class SystemUserService implements ISystemUserService {

    @Override
    public boolean validateSignIn(String user, String password) {

        return true;
    }
}
