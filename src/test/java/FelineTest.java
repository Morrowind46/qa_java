import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens ();
        Assert.assertEquals(1, actualKittensCount);
    }

    @Test
    public void getKittensTestMethodWithoutParameters() {

        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens(1));
    }
}