package demo;

import java.util.Collections;
import java.util.Map;
import java.util.Properties;

import org.webchunks.base.application.Application;
import org.webchunks.base.application.Request;
import org.webchunks.base.html.component.Page;
import org.webchunks.base.html.update.UpdateManager;
import org.webchunks.base.resource.ResourceManager;
import org.webchunks.simpleui.html.resource.SimpleResourceManager;
import org.webchunks.simpleui.html.update.SimpleUpdateManager;
import org.webchunks.simpleui.ui.SimpleUI;

/**
 *
 * @author Petr Zalyautdinov (Заляутдинов Пётр) <zalyautdinov.petr@gmail.com>
 */
public class HelloWorldApplication extends Application<SimpleUI> {

    public HelloWorldApplication(Properties config) {
        super(config);
    }

    @Override
    protected UpdateManager initUpdateManager() {
        return new SimpleUpdateManager();
    }

    @Override
    protected ResourceManager initResourceManager() {
        return new SimpleResourceManager();
    }

    @Override
    public String getApplicationName() {
        return "HelloWorldApp";
    }

    @Override
    public int getSessionDuration() {
        return 100;
    }

    @Override
    protected Page createMainPage(Request rqst) {
        return new HelloWorldPage(rqst);
    }

    @Override
    protected Map<String, Class<? extends Page>> initPages(String string) {
        return Collections.EMPTY_MAP;
    }

    @Override
    protected SimpleUI createUI() {
        return new SimpleUI();
    }

}
