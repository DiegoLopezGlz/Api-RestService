package mx.com.openpay.rs.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import mx.com.openpay.marvel.app.MarvelApp;
import mx.com.openpay.marvel.app.MarvelAppImpl;


@Component
public class RsAppImpl implements RsApp{

    @Value("${service.marvel.personajes}")
    private String url;

    @Value("${marvel.llave.publica}")
    private String llavePublica;

    @Value("${marvel.llave.privada}")
    private String llavePrivada;

    @Override
    public String getCharacters() {
        MarvelApp servicioMarvel = new MarvelAppImpl(url,llavePublica,llavePrivada);
        return servicioMarvel.getCharacters();
    }

}
