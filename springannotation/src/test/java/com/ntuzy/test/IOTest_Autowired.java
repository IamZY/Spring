package com.ntuzy.test;

import com.ntuzy.bean.Car;
import com.ntuzy.bean.Person;
import com.ntuzy.config.MainConfigOfAutowired;
import com.ntuzy.config.MainConfig_Pro;
import com.ntuzy.dao.BookDao;
import com.ntuzy.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;

/**
 * @Author IamZY
 * @create 2020/2/20 20:43
 */
public class IOTest_Autowired {

    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bookService = (BookService) annotationConfigApplicationContext.getBean(BookService.class);
        System.out.println(bookService);
        annotationConfigApplicationContext.close();


        try {

            Car car = Car.class.newInstance();
            car.setName("1");
            System.out.println(car);


        }  catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }


}
