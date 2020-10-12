package com.martins.gustavo.bcaserver.rest;

import com.martins.gustavo.bcaserver.constants.AplicationConstants;
import com.martins.gustavo.bcaserver.constants.AplicationURLs;
import com.martins.gustavo.bcaserver.request.SystemUserRequest;
import com.martins.gustavo.bcaserver.response.SystemUserResponse;
import com.martins.gustavo.bcaserver.service.intf.ISystemUserService;
import com.martins.gustavo.bcaserver.util.ServerErrorUtil;
import com.martins.gustavo.bcaserver.util.ValidationUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author martinsgustavo
 */
@RestController
@RequestMapping(AplicationURLs.SYSTEM_USER_BASE_URL)
public class SystemUserEndpoint {

    private static final Logger LOGGER = LogManager.getLogger(SystemUserEndpoint.class.getName());

    @Autowired
    private ISystemUserService systemUserService;

    @RequestMapping(method = RequestMethod.POST, value = AplicationURLs.SYSTEM_USER_VALIDATION_SIGN_IN)
    public ResponseEntity<?> validateSignIn(SystemUserRequest request) {
        SystemUserResponse response = new SystemUserResponse();

        try {
            LOGGER.info(String.format("%s START - Validation SignIn", AplicationConstants.SYSTEM_USER));

            if (ValidationUtil.isBlankOrNull(request)) {
                LOGGER.error("User or Password is null or empty");
            }

            boolean isValidate = systemUserService.validateSignIn(request.getUser(), request.getPassword());

            response.setValidate(isValidate);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(ServerErrorUtil.createErrorResponse(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
