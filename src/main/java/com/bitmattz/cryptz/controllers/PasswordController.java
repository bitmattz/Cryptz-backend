package com.bitmattz.cryptz.controllers;

import com.bitmattz.cryptz.models.Password;
import com.bitmattz.cryptz.services.CreatePasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password/")
public class PasswordController {

    CreatePasswordService createPasswordService;

    @PostMapping
    public ResponseEntity createPassword(@RequestBody Password password){
        createPasswordService = new CreatePasswordService();
        createPasswordService.execute(password);
        return new ResponseEntity<>(password, HttpStatus.OK);
    }


}
