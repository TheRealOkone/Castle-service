package serv;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import serv.models.Castle;
import serv.repositories.CastleRepository;
import serv.sevices.CastleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class CastleServiceTest {

    @InjectMocks
    CastleService castleService;

    @Mock
    CastleRepository castleRepository;

    @Test
    public void getCars() {

        Castle castle1 = new Castle();
        castle1.setId(1);
        castle1.setBrand("Brand 1");

        Castle castle2 = new Castle();
        castle2.setId(2);
        castle2.setBrand("Brand 2");

        List<Castle> list = new ArrayList<Castle>();

        list.add(castle1);
        list.add(castle2);

        Mockito.when(castleRepository.findAll()).thenReturn(list);

        List<Castle> castles = castleService.getCastles();

        Assertions.assertEquals(2, castles.size());
        Assertions.assertEquals(castle1, castles.get(0));
        Assertions.assertEquals(castle2, castles.get(1));
        Mockito.verify(castleRepository, times(1)).findAll();


    }

    @Test
    public void getCarById() {
        Castle castle1 = new Castle();
        castle1.setId(1);
        castle1.setBrand("Brand 1");

        Castle castle2 = new Castle();
        castle2.setId(2);
        castle2.setBrand("Brand 1");

        Mockito.when(castleRepository.findById(1)).thenReturn(Optional.of(castle1));
        Mockito.when(castleRepository.findById(2)).thenReturn(Optional.of(castle2));


        Castle res1 = castleService.getCastleById(1);
        Castle res2 = castleService.getCastleById(2);

        Assertions.assertEquals(castle1,res1);
        Assertions.assertEquals(castle1.getId(), 1);

        Assertions.assertEquals(castle2,res2);
        Assertions.assertEquals(castle2.getId(), 2);
    }
}
