package com.java;


import com.java.resources.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        String query="insert into phone values (?,?,?)";
        Object[] param1={101,"Poco",13000};
        Object[] param2={102,"Iphone",130000};
        Object[] param3={103,"Samsung",72000};
        Object[] param4={104,"MI",21000};

        int count=jdbcTemplate.update(query,param1);
        int count2=jdbcTemplate.update(query,param2);
        int count3=jdbcTemplate.update(query,param3);
        int count4=jdbcTemplate.update(query,param4);
        if(count>0&&count2>0&&count3>0&&count4>0){
            System.out.println("Success");
        }else
            System.out.println("Fail");
    }
}
