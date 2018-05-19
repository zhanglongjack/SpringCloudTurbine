package spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;


/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineApp 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        SpringApplication.run(TurbineApp.class,args) ;
    }
}
