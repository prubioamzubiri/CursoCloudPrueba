package com.cursocloud.cloud.persistencia;

import org.springframework.context.annotation.Bean;

import javax.management.InvalidAttributeValueException;

import java.io.File;
import java.io.IOException;


@org.springframework.context.annotation.Configuration
public class PersistenciaConfiguration {
    
    @Bean
    IPersonaGBD getIPersonaGDB() throws InvalidAttributeValueException, NumberFormatException, IOException
    {
      PersonaTextGBD gbd = new PersonaTextGBD();

      File f = new File("datos.txt");

      gbd.load(f);

      return gbd;     

    }
    
}
