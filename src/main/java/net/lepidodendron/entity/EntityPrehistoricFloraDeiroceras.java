
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraAgeableBaseAI;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.NautiloidWanderBottomFeed;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.render.entity.RenderDeiroceras;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemNautiloidEggsDeiroceras;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraDeiroceras extends EntityPrehistoricFloraNautiloidBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	@SideOnly(Side.CLIENT)
	public float bodyAngle;

	public EntityPrehistoricFloraDeiroceras(World world) {
		super(world);
		setSize(0.9F, 0.9F);
		minWidth = 0.1F;
		maxWidth = 0.9F;
		maxHeight = 0.9F;
		maxHealthAgeable = 6.0D;
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		if (LepidodendronConfig.renderBigMobsProperly) {
			return this.getEntityBoundingBox().grow(5, 0.1, 5);
		}
		return this.getEntityBoundingBox();
	}

	@Override
	public boolean isSmall() {
		return this.getAgeScale() < 0.2;
	}

	public static String getPeriod() {
		return "Ordovician - Silurian - Devonian";
	}

	public boolean canBeVertical() {
		//isReally in Water
		boolean check1 = this.isReallyInWater();
		int waterTest = Math.round(2 * this.getAgeScale());
		boolean check2 = this.world.getBlockState(this.getPosition().up(waterTest)).getMaterial() != Material.WATER;


		return check1 && !check2;
	}

	@Override
	public boolean isAtBottom() {
		//Used for giant orthocone feeding animations:
		if ((this.getPosition().getY() - ((double) this.getAgeScale() * 2) > 1)
				&& ((this.posY - (double) this.getPosition().getY()) < ((double) this.getAgeScale() * 0.4D))
		) {
			BlockPos pos = new BlockPos(this.getPosition().getX(), this.getPosition().getY() - ((double) this.getAgeScale() * 1.2), this.getPosition().getZ());
			return ((this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL))
					&& ((this.world.getBlockState(pos)).getMaterial() != Material.WATER)
					&& ((this.world.getBlockState(pos.north())).getMaterial() != Material.WATER)
					&& ((this.world.getBlockState(pos.south())).getMaterial() != Material.WATER)
					&& ((this.world.getBlockState(pos.east())).getMaterial() != Material.WATER)
					&& ((this.world.getBlockState(pos.west())).getMaterial() != Material.WATER));
		}
		return false;
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 72000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		return 0.05f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new NautiloidWanderBottomFeed(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD);
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
	}

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemNautiloidEggsDeiroceras.block, (int) (1));
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;
		if (this.world.isRemote) {
			if (this.canBeVertical()) {
				this.bodyAngle ++;
			}
			else {
				this.bodyAngle --;
			}
			if (this.bodyAngle > 90) {
				this.bodyAngle = 90;
			}
			if (this.bodyAngle < 0) {
				this.bodyAngle = 0;
			}
		}
		if (this.isEntityAlive() && isInWater()) {
			if (this.isAtBottom()) {
				//Feeding from bottom pose:
				BlockPos posIn = this.getPosition();
				World worldIn = this.world;
				//worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);
				if (worldIn instanceof WorldServer) {
					if (Math.random() > 0.3) {
						for (int k = 0; k < 8; ++k) {
							((WorldServer) worldIn).spawnParticle(EnumParticleTypes.WATER_BUBBLE, posIn.getX(), posIn.getY(), posIn.getZ(), (int) 1, 1, 1, 1, 0.2, new int[0]);
						}
					}
					if (Math.random() > 0.4) {
						for (int k = 0; k < 4; ++k) {
							((WorldServer) worldIn).spawnParticle(EnumParticleTypes.SMOKE_NORMAL, posIn.getX(), posIn.getY(), posIn.getZ(), (int) 1, 1, 1, 1, 0.1, new int[0]);
						}
					}
				}
			}
		}
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_DEIROCERAS;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.DEIROCERAS_LOOT_YOUNG;
		}
		return LepidodendronMod.DEIROCERAS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return 0.01;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {return 1.2;}
	public static double upperbackverticallinedepth(@Nullable String variant) {return 1.3;}
	public static double upperfrontlineoffset(@Nullable String variant) {return 0.0;}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {return 1.5F;}
	public static double upperbacklineoffset(@Nullable String variant) {return 0.0;}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {return -0.8F;}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {return 3.5;}
	public static double lowerbackverticallinedepth(@Nullable String variant) {return 1.5;}
	public static double lowerfrontlineoffset(@Nullable String variant) {return 0;}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {return 0.9F;}
	public static double lowerbacklineoffset(@Nullable String variant) {return -0.0;}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {return -0.5F;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderDeiroceras.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelDeiroceras;}
	public static float getScaler(@Nullable String variant) {return RenderDeiroceras.getScaler();}
}
