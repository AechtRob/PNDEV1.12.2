
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraScorpion;
import net.lepidodendron.entity.render.entity.RenderScorpion_Pulmonoscorpius;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMonsterPlacer;
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

public class EntityPrehistoricFloraScorpion_Pulmonoscorpius extends EntityPrehistoricFloraScorpion implements ITrappableAir {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraScorpion_Pulmonoscorpius(World world) {
		super(world);
		setSize(0.325F, 0.325F);
		minWidth = 0.10F;
		maxWidth = 0.325F;
		maxHeight = 0.325F;
		if (getIsBaby()) {
			maxHealthAgeable = 4.0D;
		}
		else {
			maxHealthAgeable = 6.0D;
		}
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public float getAISpeedLand() {
		return 0.4F;
	}

	public static String getPeriod() {return "Carboniferous";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public int getAdultAge() {
		return 12000;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (this.getBabies() && (!this.getIsBaby())) {
			return LepidodendronMod.PULMONOSCORPIUS_LOOT;
		}
		else if (!this.getIsBaby()) {
			return LepidodendronMod.BUG_LOOT;
		}
		return null;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAILeapAtTarget(this, 0.16F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new LandEntitySwimmingAI(this, 0.15, true));
		tasks.addTask(4, new LandWanderAvoidWaterClimbingAI(this, 0.8D));
		tasks.addTask(5, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
	}

	

	@Override
	public void onDeath(DamageSource cause) {
		if (!world.isRemote && this.getBabies() && (!this.getIsBaby()) && cause != BlockGlassJar.BlockCustom.FREEZE) {
			int ii = rand.nextInt(5);
			for (int i = 0; i <= ii; i++) {
				//Spawn babies:
				Entity entity = null;
				entity = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraScorpion_Pulmonoscorpius.class), (double)this.getPosition().getX() + 0.5D, (double)this.getPosition().getY() + 0.5D, (double)this.getPosition().getZ() + 0.5D);
				EntityPrehistoricFloraScorpion_Pulmonoscorpius baby = (EntityPrehistoricFloraScorpion_Pulmonoscorpius) entity;
				baby.setAgeTicks(1);
				baby.setIsBaby(true);
				if (Math.random() >= 0.8) {
					baby.setBabies(true);
				}
				Entity target = cause.getTrueSource();
				if (target instanceof EntityLivingBase) {
					if (target instanceof EntityPlayer) {
						EntityPlayer player = (EntityPlayer) target;
						if (!player.capabilities.isCreativeMode) {
							baby.setAttackTarget((EntityLivingBase) target);
						}
					}
					else {
						baby.setAttackTarget((EntityLivingBase) target);
					}
				}
			}
		}
		super.onDeath(cause);
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.PULMONOSCORPIUS_LOOT_JAR;
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
		return RenderScorpion_Pulmonoscorpius.getScaler();
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderScorpion_Pulmonoscorpius.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelScorpion;
	}


	//-------------------
	//Entomology Case
	public static double offsetCase(@Nullable String variant) {
		return 0.410;
	}
	public static double offsetCaseMagnified(@Nullable String variant) { return 0.65; }
	//-------------------


	//-------------------
	//Taxidermy:
	public static double offsetWall(@Nullable String variant) {
		return 0.075;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 1.5;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.8;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.4;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0F;
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
		return -0.06;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0F;
	}
	public static float getScalerMagnified(@Nullable String variant) {
		return RenderScorpion_Pulmonoscorpius.getScaler() * 1.5F;
	}
	//-------------------

}