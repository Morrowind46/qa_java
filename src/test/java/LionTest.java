import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnKittensCount() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        int expectedLionsKittens = 1;
        Mockito.when (feline.getKittens ()).thenReturn(1);
        int actualLionsKittens = lion.getKittens ();
        Assert.assertEquals(expectedLionsKittens, actualLionsKittens);
    }

    @Test
    public void doesHaveManeReturnHasMane() {

    }
    @Test
    public void getKittensReturnFoodList() throws Exception {
        Lion lion = new Lion ("Самец", feline);
        Mockito.when (feline.getFood ("Хищник")).thenReturn (List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected,actual);
    }

    // Тест проверяет исключение при создании объекта класса Lion, если не указать "Самец" это или "Самка"
    @Test(expected = Exception.class)
    public void lionInvalidValueOfSexExceptionTest() throws Exception {
        Lion lion = new Lion("Еще не определился", this.feline);
        lion.doesHaveMane();
    }
}
