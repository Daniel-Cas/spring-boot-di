package com.example.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Este es un componente que se distribuye en nuestra aplicación
//@Service

//@Primary //Para ejecutar primero un Servicio "En otras palabras seria una clase primaria"
//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion() {

        return "Ejecutando algun proceso importante complicado...";
    }

}
