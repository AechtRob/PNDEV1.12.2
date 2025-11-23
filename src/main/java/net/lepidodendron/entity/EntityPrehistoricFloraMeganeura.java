
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.render.entity.LayerMeganeuraWing;
import net.lepidodendron.entity.render.entity.RenderMeganeura;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraMeganeura extends EntityPrehistoricFloraMeganeuropsis implements ITrappableAir {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public double maxHealthAgeable;
	private Animation animation = NO_ANIMATION;
	public Animation ATTACK_ANIMATION;

	public EntityPrehistoricFloraMeganeura(World world) {
		super(world);
		setSize(0.55F, 0.42F);
		ATTACK_ANIMATION = Animation.create(this.getAttackLength());
	}

	@Override
	public String getEntityId(Entity entity) {
		return "lepidodendron:prehistoric_flora_meganeura_nymph";
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_MEGANEURA;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.MEAT, DietString.BUG);
	}

	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {
		return "Carboniferous";
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		//return null;
		return LepidodendronMod.MEGANEURA_LOOT;
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.MEGANEURA_LOOT_JAR;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", "");
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}


	//-------------------
	//Displays general:
	public static float getScaler(@Nullable String variant) {
		return RenderMeganeura.getScaler();
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderMeganeura.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplayTransparent(@Nullable String variant) {
		return LayerMeganeuraWing.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelMeganeuropsis; //NB Meganeura uses this model
	}


	//-------------------
	//Entomology Case
	public static double offsetCase(@Nullable String variant) {
		return 0.385;
	}
	public static double offsetCaseMagnified(@Nullable String variant) { return 0.57; }
	//-------------------


	//-------------------
	//Taxidermy:
	public static double offsetWall(@Nullable String variant) {
		return 0.075;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.4;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.2F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.15F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.45;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.6F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.02;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}
	public static float widthSupport(@Nullable String variant) {return 0.016F;}
	public static float getScalerMagnified(@Nullable String variant) {
		return RenderMeganeura.getScaler() * 1.5F;
	}
	//-------------------

}