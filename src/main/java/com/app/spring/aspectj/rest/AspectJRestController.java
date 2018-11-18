/**
 * 
 */
package com.app.spring.aspectj.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.aspectj.aj.AccountModel;
import com.app.spring.aspectj.aj.StudentModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Sandeep
 *
 */
@RestController
@Slf4j
public class AspectJRestController<T> {

    @GetMapping(path = "/aspectj/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> getResponse() {

        AccountModel accountModel = new AccountModel(" sandeep  ", "  Jeedimetla   ", "   098908 0986 ",
                "  12345      ");

        log.info(accountModel.getName());
        System.out.println(accountModel.getName());
        System.out.println(accountModel.getId());
        System.out.println(accountModel.getPhoneNum());
        System.out.println(accountModel.getAddress());

        log.info(accountModel.getName());

        StudentModel studentModel = new StudentModel(" sandeep  ", "  Jeedimetla   ", "   098908 0986 ",
                "  12345      ");

        log.info(studentModel.getName());
        System.out.println(studentModel.getName());
        System.out.println(studentModel.getId());
        System.out.println(studentModel.getPhoneNum());
        System.out.println(studentModel.getAddress());

        log.info(studentModel.getName());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
