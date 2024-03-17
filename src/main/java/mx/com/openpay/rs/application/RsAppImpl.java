package mx.com.openpay.rs.application;

import org.springframework.stereotype.Component;

import mx.com.openpay.marvel.Prueba;

@Component
public class RsAppImpl implements RsApp{

    @Override
    public String getMensaje(String mensaje) {
        Prueba prueba = new Prueba();
        return prueba.getMensaje("Consumo desde JAR. " + mensaje);
    }

}
