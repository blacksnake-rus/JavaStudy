package ru.logrocon.lesson1.kitchen.ingredient;

public class IngredientByVolume extends Ingredient {
    private float volume = 0.0f;

    public IngredientByVolume(String name, float volume){
        super(name);
        this.volume = volume;
    }

    public IngredientByVolume(String name){
        super(name);
    }

    @Override
    public String toString(){
        String result = super.toString();
        if(volume > 0){
            result += " объемом " + volume + " мл.";
        }
        return result;
    }
}
