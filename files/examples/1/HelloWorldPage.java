package demo;

import org.webchunks.base.application.Request;
import org.webchunks.base.html.component.ContainerMutable;
import org.webchunks.simpleui.html.WcLabel;
import org.webchunks.simpleui.html.WcPage;

/**
 *
 * @author Petr Zalyautdinov (Заляутдинов Пётр) <zalyautdinov.petr@gmail.com>
 */
public class HelloWorldPage extends WcPage {

    public HelloWorldPage(Request initData) {
        super(initData);
    }

    @Override
    public void init(ContainerMutable cm) {
        addChild(new WcLabel("hwLabel", "Hello, World"));
    }

    @Override
    public String getTitle() {
        return "Hello World Page";
    }

}
