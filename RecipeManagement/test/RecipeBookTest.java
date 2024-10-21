import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class RecipeBookTest {

    @Test
    void testAddRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe = new Recipe("Pancakes", Arrays.asList("Flour", "Milk", "Eggs"), "Mix and cook.");

        recipeBook.addRecipe(recipe);


    }
}
