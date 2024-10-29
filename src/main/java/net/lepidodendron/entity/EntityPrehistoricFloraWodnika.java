
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.entity.render.entity.RenderWodnika;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraWodnika extends EntityPrehistoricFloraAgeableFishBase implements IAdvancementGranter, ITrappableWater {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraWodnika(World world) {
		super(world);
		setSize(0.9F, 0.5F);
		minWidth = 0.1F;
		maxWidth = 0.7F;
		maxHeight = 0.575F;
		maxHealthAgeable = 14.0D;
	}

	@Override
	public int getEggType(@Nullable String variantIn) {
		return 41; //mermaid-purse type
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Permian";}


	@Override
	public void playLivingSound() {
	}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public boolean divesToLay() {
		return true;
	}

	@Override
	public int getAdultAge() {
		return 96000;
	} //Only adults!

	@Override
	protected float getAISpeedFish() {
		float AIspeed = 0.231f;
		if (this.getIsFast()) {
			AIspeed = AIspeed * 2.2F;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return AIspeed;
	}

	@Override
	protected boolean isSlowAtBottom() {
		return false;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityTemptAI(this, 1, false, true, (float) this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new AgeableFishWander(this, NO_ANIMATION, 1D, 0));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
		this.targetTasks.addTask(2, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
		//this.targetTasks.addTask(1, new HuntAI(this, EntityPrehistoricFloraFishBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
		//this.targetTasks.addTask(1, new HuntAI(this, EntitySquid. class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.FISH);
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
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
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

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		//System.err.println(this.getAnimationTick());
		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();

		//Lay eggs perhaps:
		if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getCanBreed() && this.getLaying() && this.getTicks() > 0
				&& (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())
				|| BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down()))
		){
			//if (Math.random() > 0.5) {
			this.setTicks(-50); //Flag this as stationary for egg-laying
			//}
		}

		if (!world.isRemote && this.isInWater() && this.isPFAdult() && this.getTicks() > -47 && this.getTicks() < 0) {
			//Is stationary for egg-laying:
			//System.err.println("Test2");
			IBlockState eggs = BlockEggsWater.block.getDefaultState();
			if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition())) {
				if (!(world.isRemote)) {
					world.setBlockState(this.getPosition(), eggs);
					world.setTileEntity(this.getPosition(), new BlockEggsWater.TileEntityCustom());
					TileEntity te = world.getTileEntity(this.getPosition());
					te.getTileData().setString("creature", getEntityId(this));
				}
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			if (BlockEggsWater.block.canPlaceBlockAt(world, this.getPosition().down())) {
				if (!(world.isRemote)) {
					world.setBlockState(this.getPosition().down(), eggs);
					world.setTileEntity(this.getPosition().down(), new BlockEggsWater.TileEntityCustom());
					TileEntity te = world.getTileEntity(this.getPosition().down());
					te.getTileData().setString("creature", "lepidodendron:prehistoric_flora_wodnika");
				}
				this.setLaying(false);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
			}
			this.setTicks(0);
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	public float getAgeScale() {
		return 1;
	}

	public boolean isDirectPathBetweenPoints(Vec3d vec1, Vec3d vec2) {
		RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec1, new Vec3d(vec2.x, vec2.y, vec2.z), false, true, false);
		return movingobjectposition == null || movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.WODNIKA_LOOT_YOUNG;
		}
		return LepidodendronMod.WODNIKA_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.7;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.7;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return -0.035;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.3F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.02;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.4F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.5;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.7;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.02;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.3F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.1;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.5F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderWodnika.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {
		return RenderDisplays.modelWodnika;
	}
	public static float getScaler(@Nullable String variant) {
		return RenderWodnika.getScaler();
	}
	public static float widthSupport(@Nullable String variant) {return 0.035F;}
	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_WODNIKA;
	}

}

