package com.cursocloud.cloud.aplicacion;

import com.cursocloud.cloud.persistencia.IPersonaGBD;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class AplicationConfiguration {

    @Bean
    IPersonaAplication getPersonaAplication(IPersonaGBD iPersonaGBD)
    {
        return new PersonaAplication(iPersonaGBD);
    }
    
}
