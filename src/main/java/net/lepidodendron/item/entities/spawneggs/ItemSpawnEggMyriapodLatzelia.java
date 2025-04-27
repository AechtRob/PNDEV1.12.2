
package net.lepidodendron.item.entities.spawneggs;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
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
public class ItemSpawnEggMyriapodLatzelia extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:spawn_egg_myriapod_latzelia")
	public static final Item block = null;
	public ItemSpawnEggMyriapodLatzelia(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.latzelia_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/spawneggs/spawn_egg_myriapod_latzelia", "inventory"));
	}

	public static class ItemCustom extends ItemPNSpawnEgg {
		String variant;
		public ItemCustom() {
			setTranslationKey("pf_spawn_egg_myriapod_latzelia");
			setRegistryName("spawn_egg_myriapod_latzelia");
			setCreativeTab(CreativeTabs.MISC);
			setMaxStackSize(64);
			this.variant = "latzelia";
		}

		@Override
		public int eggPrimaryColour() {
			return -9482988;
		}

		@Override
		public int eggSecondaryColour() {
			return -6147308;
		}

		@Override
		public String getPeriod() {
			return "Carboniferous";
		}

		@Override
		@Nullable
		public Entity spawnPNCreature(World worldIn, @Nullable ResourceLocation entityID, double x, double y, double z)
		{
			Entity entity = EntityList.createEntityByIDFromName(new ResourceLocation("lepidodendron:prehistoric_flora_myriapod"), worldIn);

			if (entity instanceof EntityLiving)
			{
				EntityLiving entityliving = (EntityLiving)entity;
				entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
				entityliving.rotationYawHead = entityliving.rotationYaw;
				entityliving.renderYawOffset = entityliving.rotationYaw;
				if (net.minecraftforge.event.ForgeEventFactory.doSpecialSpawn(entityliving, worldIn, (float) x, (float) y, (float) z, null)) return null;
				entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
				worldIn.spawnEntity(entity);
				((EntityPrehistoricFloraMyriapod)entityliving).setPNType(EntityPrehistoricFloraMyriapod.Type.getTypeFromString(this.variant));
				this.setSizer((EntityPrehistoricFloraMyriapod)entityliving, ((EntityPrehistoricFloraMyriapod)entityliving).getHitBoxSize()[0], ((EntityPrehistoricFloraMyriapod)entityliving).getHitBoxSize()[1]);
				entityliving.playLivingSound();
			}
			return entity;

		}

		protected void setSizer(EntityPrehistoricFloraMyriapod entity, float width, float height)
		{
			if (width != entity.width || height != entity.height)
			{
				float f = entity.width;
				entity.width = width;
				entity.height = height;
				if (entity.width < f) {
					double d0 = (double) width / 2.0D;
					entity.setEntityBoundingBox(new AxisAlignedBB(entity.posX - d0, entity.posY, entity.posZ - d0, entity.posX + d0, entity.posY + (double) entity.height, entity.posZ + d0));
				}
			}
		}
	}
}
