package net.rosiestsum.myfirstmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f).build();

    private static FoodComponent.Builder createBucket(int hunger) {
        return new FoodComponent.Builder().nutrition(hunger).saturationModifier(0.6F).usingConvertsTo(Items.BUCKET);
    }
}
