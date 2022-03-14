package com.cursocloud.cloud.persistencia;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;


import javax.management.InvalidAttributeValueException;
import java.io.IOException;
import java.util.Properties;


@org.springframework.context.annotation.Configuration
public class PersistenciaConfiguration {
    
    @Bean
    IPersonaGBD getIPersonaGDB() throws InvalidAttributeValueException, NumberFormatException, IOException
    {
      return new PersonaTextGBD();
    }
    
}
