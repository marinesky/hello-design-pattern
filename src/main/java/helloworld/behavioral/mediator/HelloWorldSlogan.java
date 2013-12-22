package helloworld.behavioral.mediator;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldSlogan implements SplitHelloWorld.HelloWorldSlogan, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String separator = " ";

    private static final String terminator = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String slogan() {
        return "Hello";
    }

    @Override
    public String helloWorld() {
        return slogan() + separator + helloWorldMediator.target() + terminator;
    }
}