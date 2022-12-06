import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println("Бины bean и bean2 ссылаются на один и тот же объект: " + (bean == bean2));

        Cat cat1 =
                (Cat) applicationContext.getBean("cat");
        Cat cat2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Бины cat1 и cat2 ссылаются на один и тот же объект: " + (cat1 == cat2));

    }
}