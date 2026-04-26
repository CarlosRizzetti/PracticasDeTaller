package com.tallerwebi.dominio;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ServicioMotorTest {
private ServicioMotor servicioMotor;
@BeforeEach
public void init() {
    this.servicioMotor=new ServicioMotorImpl();
}

    @Test
    public void deberiaCrearUnMotor() {
        
        Motor motor=new Motor();
        Boolean creado=servicioMotor.crear(motor);
        assertThat(creado,is ( true));
    }
    @Test
    public void deberiaModificarElNombreDeUnMotor() {
                      
            Boolean modificado=servicioMotor.modificarNombre(1, "Motor modificado");
            assertThat(modificado,is ( true));
    }
 /*    @Test
    public void noDeberiaModificarElNombreDeUnMotorSiElIdNoExiste() {
            ServicioMotor servicioMotor=new ServicioMotorImpl();           
            Boolean modificado=servicioMotor.modificarNombre(1, "Motor modificado");
            assertThat(modificado,is ( true));
    } */
}
    