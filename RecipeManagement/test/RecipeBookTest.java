import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class RecipeBookTest {

    @Test
    public void testAddRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe = new Recipe("Pancakes", Arrays.asList("Flour", "Milk", "Eggs"), "Mix and cook.");

        recipeBook.addRecipe(recipe);
        assertEquals(1, recipeBook.getRecipes().size());


    }
}
