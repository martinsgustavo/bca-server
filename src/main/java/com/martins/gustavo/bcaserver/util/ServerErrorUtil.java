package com.martins.gustavo.bcaserver.util;

import com.martins.gustavo.bcaserver.response.GeneralResponse;

/**
 * @author martinsgustavo
 */
public class ServerErrorUtil {

    public static GeneralResponse createErrorResponse(String message) {
        GeneralResponse generalResponse = new GeneralResponse();

        generalResponse.setMessage(message);

        return generalResponse;
    }
}
