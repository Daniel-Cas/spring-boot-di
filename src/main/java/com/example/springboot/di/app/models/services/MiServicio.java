package com.example.springboot.di.app.models.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// Este es un componente que se distribuye en nuestra aplicación
//@Service
//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IServicio {

    @Override
    public String operacion() {

        return "Ejecutando algun proceso importante Simple...";
    }

}
