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
        assertEquals("Pancakes", recipeBook.getRecipes().get(0).getName());
    }

    @Test
    public void testRemoveRecipe() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe = new Recipe("Pancakes", Arrays.asList("Flour", "Milk", "Eggs"), "Mix and cook.");

        recipeBook.removeRecipe("Pancakes");
        assertEquals(0, recipeBook.getRecipes().size());
    }

    @Test
    public void testShowAllRecipes() {
        RecipeBook recipeBook = new RecipeBook();
        Recipe recipe1 = new Recipe("Pancakes", Arrays.asList("Flour", "Milk", "Eggs"), "Mix and cook.");
        Recipe recipe2 = new Recipe("Omelette", Arrays.asList("Eggs", "Salt"), "Whisk and cook.");
        recipeBook.addRecipe(recipe1);
        recipeBook.addRecipe(recipe2);
        assertEquals(2, recipeBook.getRecipes().size());
    }
}
