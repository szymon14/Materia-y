package pl.b2b.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import pl.b2b.TestContext;
import pl.b2b.model.CarOwner;
import pl.b2b.service.CarOwnerService;


@WebAppConfiguration
@SpringBootTest(classes = TestContext.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SqlGroup({@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:insert.sql"),
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:delete.sql")})
public class TestIntegration {

    @Autowired
    private CarOwnerService carOwnerService;

    @Test
    public void carOwnerIntegrationTest(){

        CarOwner carOwner1 = new CarOwner("Marek", "Mankowski", 34, null, null);
        CarOwner carOwner2 = carOwnerService.findById(1001L);

        Assert.assertEquals(carOwner1,carOwner2);

    }

}
