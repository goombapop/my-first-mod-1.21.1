package net.rosiestsum.myfirstmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f).build();

    //random edible buckets that I made for 0 reason in particular
    public static final FoodComponent EDIBLE_WATER_BUCKET = createBucket(3).alwaysEdible().build();
    public static final FoodComponent EDIBLE_LAVA_BUCKET = createBucket(5)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 3), 0.7f).alwaysEdible().build();

    private static FoodComponent.Builder createBucket(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6F).usingConvertsTo(Items.BUCKET);
    }
}
