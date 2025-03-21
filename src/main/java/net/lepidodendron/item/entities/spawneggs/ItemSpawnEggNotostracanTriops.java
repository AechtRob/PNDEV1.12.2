
package net.lepidodendron.item.entities.spawneggs;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraNotostracan;
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
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSpawnEggNotostracanTriops extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:spawn_egg_notostracan_triops")
	public static final Item block = null;
	public ItemSpawnEggNotostracanTriops(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.triops1_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/spawneggs/spawn_egg_notostracan_triops", "inventory"));
	}

	public static class ItemCustom extends ItemPNSpawnEgg {
		//String variant;
		public ItemCustom() {
			setTranslationKey("pf_spawn_egg_notostracan_triops");
			setRegistryName("spawn_egg_notostracan_triops");
			setCreativeTab(CreativeTabs.MISC);
			setMaxStackSize(64);
			//this.variant = "notostracan_triops";
		}

		@Override
		public int eggPrimaryColour() {
			return -10530510;
		}

		@Override
		public int eggSecondaryColour() {
			return -12371420;
		}

		@Override
		public String getPeriod() {
			return "Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Palaeogene  - Neogene - Pleistocene - [Present]";
		}

		@Override
		public String getHabitat() {
			return I18n.translateToLocal("helper.pf_aquatic.name");
		}

		@Override
		@Nullable
		public Entity spawnPNCreature(World worldIn, @Nullable ResourceLocation entityID, double x, double y, double z)
		{
			Entity entity = EntityList.createEntityByIDFromName(new ResourceLocation("lepidodendron:prehistoric_flora_notostracan"), worldIn);

			if (entity instanceof EntityLiving)
			{
				EntityLiving entityliving = (EntityLiving)entity;
				entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
				entityliving.rotationYawHead = entityliving.rotationYaw;
				entityliving.renderYawOffset = entityliving.rotationYaw;
				if (net.minecraftforge.event.ForgeEventFactory.doSpecialSpawn(entityliving, worldIn, (float) x, (float) y, (float) z, null)) return null;
				entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
				worldIn.spawnEntity(entity);
				((EntityPrehistoricFloraNotostracan)entityliving).setPNType(EntityPrehistoricFloraNotostracan.Type.byId(itemRand.nextInt(3) + 1));
				entityliving.playLivingSound();
			}
			return entity;

		}
	}
}
