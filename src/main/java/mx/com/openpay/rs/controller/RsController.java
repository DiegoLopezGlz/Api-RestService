package mx.com.openpay.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.openpay.rs.application.RsApp;

@RestController
@RequestMapping("/openpay/rs/marvel")
public class RsController {

    @Autowired
    private RsApp rsApp;

    @GetMapping("/characters")
    public String getCharacters() {
        String respuesta = rsApp.getMensaje("Diego");
        return respuesta;
    }

}
