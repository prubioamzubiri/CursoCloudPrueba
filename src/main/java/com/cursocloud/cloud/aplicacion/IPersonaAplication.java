package com.cursocloud.cloud.aplicacion;

import com.cursocloud.cloud.dominio.Persona;

public interface IPersonaAplication {

    public void addPersona(Persona p);

    public Persona getPersona (String id);

    public void removePersona (String id);

    
}
