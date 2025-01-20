package alura.foro.hub.infra.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
         return httpSecurity.csrf(csrf -> csrf.disable())
//                .cors(c -> c.disable())
                 .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                 .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST,"/login")
                         .permitAll()
                         .anyRequest()
                         .authenticated()
                         .and()
//                         .addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class)
                 )
                 .build();
    }

}
