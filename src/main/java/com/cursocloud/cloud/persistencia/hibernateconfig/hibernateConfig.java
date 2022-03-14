package com.cursocloud.cloud.persistencia.hibernateconfig;

import com.cursocloud.cloud.dominio.Persona;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class hibernateConfig {

    public static Session getHibernateSession()
    {
      
      Configuration cfg = getEnviromentConfiguration();

      SessionFactory factory = cfg.configure().addAnnotatedClass(Persona.class).buildSessionFactory();

      Session session = factory.openSession();

      return session;
    }

    private static Configuration getEnviromentConfiguration()
    {
      Configuration cfg = new Configuration();

      String connectionURL;

      // -Ddbhost=host -Ddbport=port -Ddbdatabase=databasename

      String host = getProperty("dbhost", "127.0.0.1");
      String port = getProperty("dbport","3306");
      String database = getProperty("dbdatabase","database1");

      connectionURL = "jdbc:mysql://" + host + ":" + port + "/" + database;
      cfg.setProperty("hibernate.connection.url", connectionURL);

      // -Ddbuser=user
      String user = getProperty("dbuser", "root");
      cfg.setProperty("hibernate.connection.username", user);

      //-Ddbpassword=password
      String password = getProperty("dbpassword","root");
      cfg.setProperty("hibernate.connection.password", password);

      return cfg;

    }

    private static String getProperty(String data, String defaultValue){
      String info = System.getProperty(data);
      if (info == null){
        info = defaultValue;
      }
      return info;
  }
    
}
