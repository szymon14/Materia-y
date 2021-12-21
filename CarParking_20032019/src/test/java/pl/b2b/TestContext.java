package pl.b2b;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
@ComponentScan(basePackages = "pl.b2b")
@EnableJpaRepositories("pl.b2b.repositories")
public class TestContext {



}
