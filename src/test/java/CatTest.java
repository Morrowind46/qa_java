import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith (MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnExpectedSound() {
        Cat cat = new Cat (this.feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals ("ErrorSound", expectedSound, actualSound);
    }

    @Test
    public void getFoodVerifyTest() throws Exception {
        Cat cat = new Cat(this.feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when (feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood ();
        assertEquals (expectedFood, actualFood);
    }
}