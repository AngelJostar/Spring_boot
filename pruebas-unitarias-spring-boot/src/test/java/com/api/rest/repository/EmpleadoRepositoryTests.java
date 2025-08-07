package com.api.rest.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EmpleadoRepositoryTests {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Test
    void testGuardarEmpleado(){
        //given - dado o condición previa o configuración
        //When - Acción o comportamiento que vamos a probar
        // tjhen - verificar la salida
        
    }

}
 