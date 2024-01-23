
package net.lepidodendron.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGuano;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGuanoGolem extends EntityGolem implements IRangedAttackMob {

	public EntityPrehistoricFloraGuanoGolem(World world) {
		super(world);
		this.setSize(0.95F, 2.2F);
	}

	protected void initEntityAI()
	{
		this.tasks.addTask(1, new EntityAIAttackRanged(this, 1.0D, 20, 10.0F));
		this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.6D));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, true, false, IMob.MOB_SELECTOR));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(18.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.175D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.60D);
	}

	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (!this.world.isRemote)
		{
			if (this.getRevengeTarget() != null) {
				if (this.getRevengeTarget() instanceof EntityPrehistoricFloraGuanoGolem || this.getRevengeTarget().isDead) {
					this.setRevengeTarget(null);
				}
			}
			if (this.getAttackTarget() != null) {
				if (this.getAttackTarget() instanceof EntityPrehistoricFloraGuanoGolem || this.getAttackTarget().isDead) {
					this.setAttackTarget(null);
				}
			}

			int i = MathHelper.floor(this.posX);
			int j = MathHelper.floor(this.posY);
			int k = MathHelper.floor(this.posZ);

			if (this.isWet())
			{
				this.attackEntityFrom(DamageSource.DROWN, 1.0F);
			}

			if (!net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this))
			{
				return;
			}

			if (world.getGameRules().getBoolean("mobGriefing")) {
				for (int l = 0; l < 4; ++l) {
					i = MathHelper.floor(this.posX + (double) ((float) (l % 2 * 2 - 1) * 0.25F));
					j = MathHelper.floor(this.posY);
					k = MathHelper.floor(this.posZ + (double) ((float) (l / 2 % 2 * 2 - 1) * 0.25F));
					BlockPos blockpos = new BlockPos(i, j, k);

					if (this.world.getBlockState(blockpos).getMaterial() == Material.AIR && BlockGuano.block.canPlaceBlockAt(this.world, blockpos)) {
						this.world.setBlockState(blockpos, BlockGuano.block.getDefaultState());
					}
				}
			}
		}
	}

	@Nullable
	protected ResourceLocation getLootTable()
	{
		return LepidodendronMod.GUANO_GOLEM_LOOT;
	}

	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor)
	{
		EntityPrehistoricFloraGuanoBall entityguanoball = new EntityPrehistoricFloraGuanoBall(this.world, this);
		double d0 = target.posY + (double)target.getEyeHeight() - 1.100000023841858D;
		double d1 = target.posX - this.posX;
		double d2 = d0 - entityguanoball.posY;
		double d3 = target.posZ - this.posZ;
		float f = MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F;
		entityguanoball.shoot(d1, d2 + (double)f, d3, 1.6F, 12.0F);
		SoundEvent soundevent = this.getShootSound();
		if (soundevent != null) {
			this.playSound(soundevent, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		}
		this.world.spawnEntity(entityguanoball);
	}

	@Nullable
	public SoundEvent getShootSound() {
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:guano_golem_shoot"));
	}

	public float getEyeHeight()
	{
		return 1.7F;
	}

	@Nullable
	protected SoundEvent getAmbientSound()
	{
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:guano_golem_idle"));
	}

	@Nullable
	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.ENTITY_SNOWMAN_HURT;
	}

	@Nullable
	protected SoundEvent getDeathSound()
	{
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:guano_golem_death"));
	}

	protected void playStepSound(BlockPos pos, Block blockIn)
	{
		SoundEvent soundevent = this.getStepSound();
		if (soundevent != null) {
			this.playSound(soundevent, 1.0F, 1.0F);
		}
	}

	@Nullable
	protected SoundEvent getStepSound()
	{
		return (SoundEvent) SoundEvent.REGISTRY
				.getObject(new ResourceLocation("lepidodendron:guano_golem_walk"));
	}

	public void setSwingingArms(boolean swingingArms)
	{
	}

}