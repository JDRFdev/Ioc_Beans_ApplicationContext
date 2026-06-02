package com.pizzeria.pizzeria_lab;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
     public KitchenService kitchenService(@Qualifier("pastaChef") Chef chef){
         return new KitchenService(chef);
     }
     @Bean("pastaChef")
   public Chef pastaChef(){
        return new pastaChef();
     }
}
