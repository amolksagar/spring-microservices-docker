package com.devprojects.springmicroservicesdocker.api.v1.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarRegistration{
 
    /*@RequestMapping(method = RequestMethod.POST,
                    value = "/registercar",
                    produces = {"application/json"})
    public CarData register(@RequestBody Car car) {
      boolean carAlreadyExists = false;
        if(carAlreadyExists) {
            throw new IllegalArgumentException("error.username");
        }
        return new CarData(...);
    }
     
    @ExceptionHandler
    void handleIllegalArgumentException(
                      IllegalArgumentException e,
                      HttpServletResponse response) throws IOException {
 
        response.sendError(HttpStatus.BAD_REQUEST.value());
 
    }*/
}