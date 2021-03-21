package com.envaali.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class EnvaaliExceptionMapper extends EnvaaliException implements ExceptionMapper<Throwable> {

    public EnvaaliExceptionMapper(String message) {
        super(message);
    }

    @Override
    public Response toResponse(Throwable exception) {

        if(exception instanceof EnvaaliException){
//            return Response.Status(Response.Status.BAD_REQUEST)
        }
        return null;
    }
}
