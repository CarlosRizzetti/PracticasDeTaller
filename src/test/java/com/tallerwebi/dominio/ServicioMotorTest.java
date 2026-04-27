package com.tallerwebi.dominio;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServicioMotorTest {
    private ServicioMotor servicioMotor;

    @BeforeEach
    public void init() {
        this.servicioMotor = new ServicioMotorImpl();
    }

    @Test
    public void deberiaCrearUnMotor() {
        Motor motor = dadoQueTengoUnMotor();
        Boolean creado = cuandoCreoUnMotor(motor);
        elResultadoEsVerdadero(creado);
    }

    @Test
    public void deberiaModificarElNombreDeUnMotor() {
        // given(dado) / when(cuando) / then(entonces)
        Boolean modificado = servicioMotor.modificarNombre(1, "Motor modificado");
        elResultadoEsVerdadero(modificado);
    }

    private Motor dadoQueTengoUnMotor() {
        return new Motor();
    }
    private Boolean cuandoCreoUnMotor(Motor motor) {
        return servicioMotor.crear(motor);
    }

    private void elResultadoEsVerdadero(Boolean resultado) {
        assertThat(resultado, is(true));
    }
    /*
     * @Test
     * public void noDeberiaModificarElNombreDeUnMotorSiElIdNoExiste() {
     * ServicioMotor servicioMotor=new ServicioMotorImpl();
     * Boolean modificado=servicioMotor.modificarNombre(1, "Motor modificado");
     * assertThat(modificado,is ( true));
     * }
     */
}
