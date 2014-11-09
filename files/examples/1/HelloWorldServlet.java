package demo;


import java.util.Properties;

import org.webchunks.base.servlet.WebChunksServlet;

/**
 *
 * @author Petr Zalyautdinov (Заляутдинов Пётр) <zalyautdinov.petr@gmail.com>
 */
public class HelloWorldServlet extends WebChunksServlet<HelloWorldApplication> {

    @Override
    protected HelloWorldApplication createApplication(Properties prprts) {
        return new HelloWorldApplication(prprts);
    }

}
