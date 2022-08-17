
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.item.ItemHoldfast;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeStickFromHoldfast extends ElementsLepidodendronMod.ModElement {
	public RecipeStickFromHoldfast(ElementsLepidodendronMod instance) {
		super(instance, 436);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemHoldfast.block, (int) (1)), new ItemStack(Items.STICK, (int) (1)), 0.1F);
	}
}
