package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kevin.code.HelloWorld;


class HelloWorldTest {

    @Test void test() {
        final HelloWorld hello = new HelloWorld();
        final String helloResult = hello.sayHello();
        assertTrue(helloResult.length() > 0);
    }

}
