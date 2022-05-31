
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.BlockAraucarioxylonLog;
import net.lepidodendron.block.BlockAraucarioxylonLogPetrified;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipePetrifiedWoodFromLogs extends ElementsLepidodendronMod.ModElement {
	public RecipePetrifiedWoodFromLogs(ElementsLepidodendronMod instance) {
		super(instance, 476);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAraucarioxylonLog.block, (int) (1)),
				new ItemStack(BlockAraucarioxylonLogPetrified.block, (int) (1)), 1F);
	}
}
