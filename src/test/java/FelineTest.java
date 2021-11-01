import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

    @Test
    public void eatMeatReturnFoodList() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = feline.eatMeat();
        Assert.assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void getFamilyReturnName() {
        Feline feline = new Feline();
        String expectedFamilyName = "Кошачьи";
        String actualFamilyName = feline.getFamily();
        Assert.assertEquals(expectedFamilyName, actualFamilyName);
    }

    @Test
    public void getKittensReturnKittensCount() {
        Feline feline = spy(new Feline());
        int expectedKittensCount = 1;
        Mockito.when (feline.getKittens(1)).thenReturn(1);
        int actualKittensCount = feline.getKittens ();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensTestMethodWithoutParameters() {

        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens(1);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}