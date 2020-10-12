package com.martins.gustavo.bcaserver.dao.intf;

import com.martins.gustavo.bcaserver.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserDAO extends JpaRepository<SystemUser, Integer> {

}
