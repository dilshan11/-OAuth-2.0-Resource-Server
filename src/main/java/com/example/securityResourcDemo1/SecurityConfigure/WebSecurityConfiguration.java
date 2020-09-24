package com.example.securityResourcDemo1.SecurityConfigure;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@Configuration
@EnableResourceServer
public class WebSecurityConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.resourceId("resource");
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {

//        http
//                .authorizeRequests()
//                .antMatchers("/", "/home").permitAll() // (3)
//                .anyRequest().authenticated() // (4)
//                .and()
//                .formLogin() // (5)
//                .loginPage("/login") // (5)
//                .permitAll()
//                .and()
//                .logout() // (6)
//                .permitAll()
//                .and()
//                .httpBasic(); // (7)

//        http
//                .authorizeRequests()
//                .antMatchers("/api/user/**", "/api/ticket/**", "/index").hasAuthority("ROLE_USER")
//                .antMatchers(HttpMethod.POST, "/forms/**").hasAnyRole("ADMIN", "CALLCENTER")
//                .antMatchers("/user/**").access("@webSecurity.check(authentication,request)");
//    }


        http.authorizeRequests()
                .antMatchers("/customers").hasAuthority("ROLE_admin")
                .antMatchers("/customerDetails").hasAnyAuthority("ROLE_admin","ROLE_user")
                .antMatchers("/orders").access("#oauth2.hasScope('READ')")
                .anyRequest().authenticated();
    }
}
