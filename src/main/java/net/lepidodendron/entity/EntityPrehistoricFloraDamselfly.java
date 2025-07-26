
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
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

public class EntityPrehistoricFloraDamselfly extends EntityPrehistoricFloraMeganeuropsis implements ITrappableAir, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public double maxHealthAgeable;
	private Animation animation = NO_ANIMATION;
	public Animation ATTACK_ANIMATION;

		public EntityPrehistoricFloraDamselfly(World world) {
		super(world);
		setSize(0.15F, 0.30F);
		ATTACK_ANIMATION = Animation.create(this.getAttackLength());
	}

	@Override
	public String getEntityId(Entity entity) {
		return "lepidodendron:prehistoric_flora_aquaticnymph@damselfly";
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DAMSELFLY;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
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
		return "Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene - present";
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		//return null;
		return LepidodendronMod.BUG_LOOT;
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source) {
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.DAMSELFLY_LOOT;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer) this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build())) {
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", "");
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		} else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}
	}
        //-------------------
		//Displays general:
//		public static float getScaler(@Nullable String variant) {
//		return RenderNamurotypus.getScaler();
//	}
//		@SideOnly(Side.CLIENT)
//		public static ResourceLocation textureDisplay(@Nullable String variant) {
//		return RenderNamurotypus.TEXTURE;
//	}
//		@SideOnly(Side.CLIENT)
//		public static ResourceLocation textureDisplayTransparent(@Nullable String variant) {
//		return LayerNamurotypusWing.TEXTURE;
//	}
//		@SideOnly(Side.CLIENT)
//		public static ModelBase modelDisplay(@Nullable String variant) {
//		return RenderDisplays.modelMeganeurites;
//	}
	//Entomology Case
//	public static double offsetCase(@Nullable String variant) {
//		return 0.385;
//	}
	//-------------------


		//-------------------
		//Taxidermy:

		//-------------------
	}
