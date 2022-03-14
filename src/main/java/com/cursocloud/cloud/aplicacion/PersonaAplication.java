package com.cursocloud.cloud.aplicacion;

import com.cursocloud.cloud.dominio.Persona;
import com.cursocloud.cloud.persistencia.IPersonaGBD;

public class PersonaAplication implements IPersonaAplication{

    private IPersonaGBD gbd;

    public PersonaAplication(IPersonaGBD gbd)
    {
        this.gbd = gbd;
    }

    
    @Override
    public void addPersona(Persona p) {
        
        gbd.addPersona(p);
        
    }

    @Override
    public Persona getPersona(String id) {
        
        return gbd.getPersona(id);
    }

    @Override
    public void removePersona(String id) {
        
        gbd.removePersona(id);
        
    }
    
}
