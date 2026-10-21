package SpringDemo.example.demo.Field1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee employee = context.getBean(Employee.class);
        String result = employee.displayAddress();

        System.out.println(result);
        context.close();
    }
}
