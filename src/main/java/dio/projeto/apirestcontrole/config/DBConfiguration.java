package dio.projeto.apirestcontrole.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConnection(){
        System.out.println("Conexão DB para DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "Conexão DB para H2_TEST - instância de teste";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection() {
        System.out.println("DB Connection para Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection para MySQL_PROD - instância de produção";
    }

}
