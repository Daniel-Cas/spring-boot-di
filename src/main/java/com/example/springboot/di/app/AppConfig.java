package com.example.springboot.di.app;


import com.example.springboot.di.app.models.domain.ItemFactura;
import com.example.springboot.di.app.models.domain.Producto;
import com.example.springboot.di.app.models.services.IServicio;
import com.example.springboot.di.app.models.services.MiServicio;
import com.example.springboot.di.app.models.services.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("miServicioSimple")
    @Primary()
    public IServicio registrarMiServicio() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }


    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camra Sony", 100);
        Producto producto2 = new Producto(" Biclicleta Bianchio aro 26", 200);

        ItemFactura linea1= new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG", 250);
        Producto producto2 = new Producto("Notebook ASUS", 500);
        Producto producto3 = new Producto("Impresora HP ", 80);
        Producto producto4 = new Producto("Escritorio Oficina", 300);
        Producto producto5 = new Producto("MacBook Pro", 900);


        ItemFactura linea1= new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 1);
        ItemFactura linea4 = new ItemFactura(producto4, 1);
        ItemFactura linea5 = new ItemFactura(producto5, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4, linea5 );
    }
}
