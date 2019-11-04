package us.cnlist.services.cityserv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import us.cnlist.services.cityserv.entity.error.ErrorMessage;
import us.cnlist.services.cityserv.error.BadRequestError;
import us.cnlist.services.cityserv.error.ObjectDoesNotExist;


public class ErrorController {

    @ExceptionHandler(ObjectDoesNotExist.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessage whenObjectNotFound(ObjectDoesNotExist e) {
        return new ErrorMessage(e.getClass().getName(), e.getMessage());
    }

    @ExceptionHandler(BadRequestError.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorMessage whenRequestIsBad(BadRequestError e) {
        return new ErrorMessage(e.getClass().getName(), e.getMessage());
    }
}
