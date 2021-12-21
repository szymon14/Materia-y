//package pl.b2b.service;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;
//import pl.b2b.model.Car;
//import pl.b2b.repositories.CarRepositoryJpa;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class CarServiceImplTest {
//
//    @Mock
//    private CarRepositoryJpa carRepositoryJpa;
//
//    @InjectMocks
//    private CarServiceImpl carService;
//
//    @Test
//    public void testCar() {
//
//        Car car = new Car();
//        car.setRegistrationNumber("WB89898");
//
//        when(carRepositoryJpa.getOne(1L)).thenReturn(car);
//
//        Car changerCar = carService.changeRegistrationNumber(1L, "WK11111");
//
//        assertEquals(changerCar.getRegistrationNumber(), "WK11111");
//
//    }
//
//
//}