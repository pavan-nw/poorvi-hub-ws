package hub.poorvi.app;

import hub.poorvi.app.api.exception.GenericExceptionMapper;
import hub.poorvi.app.api.resource.MemberResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 * Created by IntelliJ IDEA.
 * User: pwadawadagi
 * Date: 14/4/17
 * Time: 6:05 PM
 */
public class HubApplication extends Application<Configuration>
{
    @Override
    public void run(Configuration configuration, Environment environment) throws Exception
    {
        MemberResource memberResource = new MemberResource();
        environment.jersey().register(memberResource);
        environment.jersey().register(new GenericExceptionMapper());
    }

    @Override
    public String getName()
    {
        return "Poorvi Hub";
    }

    public static void main(String[] args) throws Exception {
        new HubApplication().run(args);
    }
}
