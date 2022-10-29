package com.sandbox.configuracion;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    public FlywayMigrationStrategy migrationStrategy(){
        return flyway -> {
            flyway.repair();
            flyway.migrate();
        };
    }

}
