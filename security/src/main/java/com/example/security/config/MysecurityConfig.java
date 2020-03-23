package com.example.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class MysecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        //加入通行用户并添加权限
        auth.inMemoryAuthentication()
                .withUser("zhangsan").password("123123").roles("VIP1")
                .and()
                .withUser("lisi").password("123123").roles("VIP1","VIP2")
                .and()
                .withUser("wangwu").password("123123").roles("VIP1","VIP2","VIP3")
                .and()
                //定义明文的加密方式，否则找不到ID
                .passwordEncoder(new CustomPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制请求授权规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");
        //开启自动配置的登陆功能
        http.formLogin().usernameParameter("user").passwordParameter("pwd")
                .loginPage("/userlogin");
        /**
         * 1。 /login来到登陆页
         * 2。 重定向到/login?error表示登陆失败
         * 3. 指定loginpage后会改变默认login的所有请求为loginpage的请求
         */

        //开启自动配置的注销功能
        http.logout().logoutSuccessUrl("/");
        /**
         * 1。 访问/logout表示用户注销，清除session
         * 2。 注销成功会反回 /login?logout
         */

        //开启记住密码
        http.rememberMe().rememberMeParameter("remember");
    }
}
