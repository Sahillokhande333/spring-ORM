package com.spring.ormh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ormh.dao.StudentDao;
import com.spring.ormh.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
     StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
     
     Student student=new Student(9,"raj","kerala");
     int r = studentDao.insert(student);
     System.out.println("Done" + r);		
    }
}
