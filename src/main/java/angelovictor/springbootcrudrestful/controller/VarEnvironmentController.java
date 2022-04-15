package angelovictor.springbootcrudrestful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class VarEnvironmentController {

    @Autowired
    private Environment env;

    public String getUrl() {
        String db_url = env.getProperty("spring.datasource.url");
        String db_name = env.getProperty("spring.datasource.username");
        String db_password = env.getProperty("spring.datasource.password");

        return db_url + db_name + db_password;
    }
}
