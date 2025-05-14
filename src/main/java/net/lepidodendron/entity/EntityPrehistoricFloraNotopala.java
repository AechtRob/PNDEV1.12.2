
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EntityLookIdleAI;
import net.lepidodendron.entity.ai.EntityMateAISlitheringWaterBase;
import net.lepidodendron.entity.ai.SlitheringWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraSlitheringWaterBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.item.entities.ItemNotopala;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraNotopala extends EntityPrehistoricFloraSlitheringWaterBase implements ITrappableWater, IAdvancementGranter {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private int jumpTicks;

	public EntityPrehistoricFloraNotopala(World world) {
		super(world, 26);
		setSize(0.2F, 0.2F);
	}

	@Override
	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Early Cretaceous - Late Cretaceous - Paleogene  - Neogene - Pleistocene [ - present]";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	protected float getAISpeedSlithering() {
		return 0.04f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAISlitheringWaterBase(this, 1));
		tasks.addTask(1, new SlitheringWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityLookIdleAI(this));
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.ALGAE);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
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

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Override
	public void onLivingUpdate() {
		////this.renderYawOffset = this.rotationYaw;
		//Updated from vanilla to disable jumping
		//Adjusted from base so that mob rotates properly and faces forwards
		if (this.jumpTicks > 0)
		{
			--this.jumpTicks;
		}

		if (this.newPosRotationIncrements > 0 && !this.canPassengerSteer())
		{
			double d0 = this.posX + (this.interpTargetX - this.posX) / (double)this.newPosRotationIncrements;
			double d1 = this.posY + (this.interpTargetY - this.posY) / (double)this.newPosRotationIncrements;
			double d2 = this.posZ + (this.interpTargetZ - this.posZ) / (double)this.newPosRotationIncrements;
			double d3 = MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw);
			this.rotationYaw = (float)((double)this.rotationYaw + d3 / (double)this.newPosRotationIncrements);
			this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
			--this.newPosRotationIncrements;
			this.setPosition(d0, d1, d2);
			this.setRotation(this.rotationYaw, this.rotationPitch);
		}
		else if (!this.isServerWorld())
		{
			this.motionX *= 0.98D;
			this.motionY *= 0.98D;
			this.motionZ *= 0.98D;
		}

		if (Math.abs(this.motionX) < 0.003D)
		{
			this.motionX = 0.0D;
		}

		if (Math.abs(this.motionY) < 0.003D)
		{
			this.motionY = 0.0D;
		}

		if (Math.abs(this.motionZ) < 0.003D)
		{
			this.motionZ = 0.0D;
		}

		this.world.profiler.startSection("ai");

		if (this.isMovementBlocked())
		{
			this.isJumping = false;
			this.moveStrafing = 0.0F;
			this.moveForward = 0.0F;
			this.randomYawVelocity = 0.0F;
		}
		else if (this.isServerWorld())
		{
			this.world.profiler.startSection("newAi");
			this.updateEntityActionState();
			this.world.profiler.endSection();
		}

		this.world.profiler.endSection();
		this.world.profiler.startSection("jump");

		{
			this.jumpTicks = 0;
		}

		this.world.profiler.endSection();
		this.world.profiler.startSection("travel");
		this.moveStrafing *= 0.98F;
		this.moveForward *= 0.98F;
		this.randomYawVelocity *= 0.9F;
		//this.updateElytra();
		this.travel(this.moveStrafing, this.moveVertical, this.moveForward);
		this.world.profiler.endSection();
		this.world.profiler.startSection("push");
		this.collideWithNearbyEntities();
		this.world.profiler.endSection();
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.world.isRemote && !this.isDead) {
			if ("player".equals(source.getDamageType())) {
				EntityItem entityToSpawn = new EntityItem(world, this.posX, this.posY, this.posZ, new ItemStack(ItemNotopala.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
				if (this.world instanceof WorldServer)
				{
					((WorldServer)this.world).spawnParticle(EnumParticleTypes.BLOCK_DUST, this.posX, this.posY + (double)this.height / 1.5D, this.posZ, 10, (double)(this.width / 4.0F), (double)(this.height / 4.0F), (double)(this.width / 4.0F), 0.05D, Block.getStateId(Blocks.PLANKS.getDefaultState()));
				}
				this.setDead();
			}
		}
		return super.attackEntityFrom(source, amount);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_NOTOPALA;
	}
}
