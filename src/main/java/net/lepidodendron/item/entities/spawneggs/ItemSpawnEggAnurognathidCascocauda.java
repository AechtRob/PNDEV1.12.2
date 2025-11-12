
package net.lepidodendron.item.entities.spawneggs;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraAnurognathid;
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
public class ItemSpawnEggAnurognathidCascocauda extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:spawn_egg_anurognathid_cascocauda")
	public static final Item block = null;
	public ItemSpawnEggAnurognathidCascocauda(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.anurognathid_cascocauda_raw);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/spawneggs/spawn_egg_anurognathid_cascocauda", "inventory"));
	}

	public static class ItemCustom extends ItemPNSpawnEgg {
		public static String variant;
		public ItemCustom() {
			setTranslationKey("pf_spawn_egg_anurognathid_cascocauda");
			setRegistryName("spawn_egg_anurognathid_cascocauda");
			setCreativeTab(CreativeTabs.MISC);
			setMaxStackSize(64);
			this.variant = "cascocauda";
		}

		@Override
		public int eggPrimaryColour() {
			return -12437460;
		}

		@Override
		public int eggSecondaryColour() {
			return -7107713;
		}

		@Override
		public String getPeriod() {
			return "Jurassic";
		}

		@Override
		@Nullable
		public Entity spawnPNCreature(World worldIn, @Nullable ResourceLocation entityID, double x, double y, double z)
		{
			Entity entity = EntityList.createEntityByIDFromName(new ResourceLocation("lepidodendron:prehistoric_flora_anurognathid"), worldIn);

			if (entity instanceof EntityLiving)
			{
				EntityLiving entityliving = (EntityLiving)entity;
				entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
				entityliving.rotationYawHead = entityliving.rotationYaw;
				entityliving.renderYawOffset = entityliving.rotationYaw;
				if (net.minecraftforge.event.ForgeEventFactory.doSpecialSpawn(entityliving, worldIn, (float) x, (float) y, (float) z, null)) return null;
				entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
				worldIn.spawnEntity(entity);
				((EntityPrehistoricFloraAnurognathid)entityliving).setPNType(EntityPrehistoricFloraAnurognathid.Type.getTypeFromString(this.variant));
				this.setSizer((EntityPrehistoricFloraAnurognathid)entityliving, ((EntityPrehistoricFloraAnurognathid)entityliving).getHitBoxSize()[0], ((EntityPrehistoricFloraAnurognathid)entityliving).getHitBoxSize()[1]);
				entityliving.playLivingSound();
			}
			return entity;

		}

		protected void setSizer(EntityPrehistoricFloraAnurognathid entity, float width, float height)
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
