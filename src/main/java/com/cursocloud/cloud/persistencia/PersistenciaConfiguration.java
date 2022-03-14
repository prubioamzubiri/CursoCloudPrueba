package com.cursocloud.cloud.persistencia;

import org.springframework.context.annotation.Bean;

import javax.management.InvalidAttributeValueException;
import java.io.IOException;


@org.springframework.context.annotation.Configuration
public class PersistenciaConfiguration {
    
    @Bean
    IPersonaGBD getIPersonaGDB() throws InvalidAttributeValueException, NumberFormatException, IOException
    {
      return new PersonaTextGBD();
    }
    
}
