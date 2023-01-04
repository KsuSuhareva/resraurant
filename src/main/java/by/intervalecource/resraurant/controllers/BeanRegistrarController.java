package by.intervalecource.resraurant.controllers;

import by.intervalecource.resraurant.model.MyBeanDefinition;
import by.intervalecource.resraurant.service.beanLoad.MyClassLoader;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BeanRegistrarController {
    private GenericApplicationContext context;
    private MyClassLoader myClassLoader;

    @SneakyThrows
    @PostMapping("/registrar")
    public String registrar(@RequestBody MyBeanDefinition myBeanDefinition) {
        Class<?> beanClass = myClassLoader.findClass(myBeanDefinition.getBeanClassName());
        BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();

        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        beanDefinition.setBeanClass(beanClass);
        beanFactory.registerBeanDefinition(myBeanDefinition.getBeanName(),beanDefinition);
        return "registered";
    }
}
