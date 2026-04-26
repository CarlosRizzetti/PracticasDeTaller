package com.tallerwebi.dominio;

public class ServicioMotorImpl implements ServicioMotor {
    @Override
    public Boolean crear(Motor motor) {
        return true;
    }

    @Override
    public Boolean modificarNombre(int id, String string) {
        return true;
    }
}
