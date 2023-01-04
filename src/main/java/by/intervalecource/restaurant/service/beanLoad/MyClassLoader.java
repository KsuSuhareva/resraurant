package by.intervalecource.restaurant.service.beanLoad;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class MyClassLoader extends ClassLoader {

    @Override
    @SneakyThrows
    public Class<?> findClass(String className)  {
        String filename = "target/classes" + className.replace('.', File.separatorChar) + ".class";
        byte[] bytes = Files.newInputStream(Path.of(filename)).readAllBytes();
        return defineClass(className, bytes, 0, bytes.length);
    }
}