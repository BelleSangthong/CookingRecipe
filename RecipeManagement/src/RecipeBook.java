import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
    private List<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }


    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void removeRecipe(String recipeName) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equals(recipeName)) {
                recipes.remove(i);
                break;
            }
        }
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }











}
