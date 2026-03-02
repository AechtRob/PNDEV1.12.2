
package net.lepidodendron.item.entities.spawneggs;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeontinid;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSpawnEggPalaeontinidDaohugoucossus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:spawn_egg_palaeontinid_daohugoucossus")
	public static final Item block = null;
	public ItemSpawnEggPalaeontinidDaohugoucossus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.daohugoucossus_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/spawneggs/spawn_egg_palaeontinid_daohugoucossus", "inventory"));
	}

	public static class ItemCustom extends ItemPNSpawnEgg {
		String variant;
		public ItemCustom() {
			setTranslationKey("pf_spawn_egg_palaeontinid_daohugoucossus");
			setRegistryName("spawn_egg_palaeontinid_daohugoucossus");
			setCreativeTab(CreativeTabs.MISC);
			setMaxStackSize(64);
			this.variant = "daohugoucossus";
		}

		@Override
		public int eggPrimaryColour() {
			return -15578831;
		}

		@Override
		public int eggSecondaryColour() {
			return -3422527;
		}


		@Override
		public String getPeriod() {
			return "Jurassic";
		}

		//@Override
		//public String getHabitat() {
		//	return "Terrestrial";
		//}

		@Override
		@Nullable
		public Entity spawnPNCreature(World worldIn, @Nullable ResourceLocation entityID, double x, double y, double z)
		{
			Entity entity = EntityList.createEntityByIDFromName(new ResourceLocation("lepidodendron:prehistoric_flora_palaeontinid"), worldIn);

			if (entity instanceof EntityLiving)
			{
				EntityLiving entityliving = (EntityLiving)entity;
				entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
				entityliving.rotationYawHead = entityliving.rotationYaw;
				entityliving.renderYawOffset = entityliving.rotationYaw;
				if (net.minecraftforge.event.ForgeEventFactory.doSpecialSpawn(entityliving, worldIn, (float) x, (float) y, (float) z, null)) return null;
				entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
				worldIn.spawnEntity(entity);
				((EntityPrehistoricFloraPalaeontinid)entityliving).setPNType(EntityPrehistoricFloraPalaeontinid.Type.getTypeFromString(this.variant));
				entityliving.playLivingSound();
			}
			return entity;

		}
	}
}
