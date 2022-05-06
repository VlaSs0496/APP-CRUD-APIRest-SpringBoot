package com.example.app_apirest_springboot.Utils;

public class Apis {

    public static final String URL_001 = "http://190.66.179.185:8080";

    public static PersonService getPersonaService(){
        return Cliente.getCliente(URL_001).create(PersonService.class);
    }
}
