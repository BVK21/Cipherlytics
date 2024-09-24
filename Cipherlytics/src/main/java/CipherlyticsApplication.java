import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rws")
public class CipherlyticsApplication extends Application {
    private Set<Class> classes = new HashSet<Class>();

    public CipherlyticsApplication() {
        classes.add(CipherlyticsService.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}
