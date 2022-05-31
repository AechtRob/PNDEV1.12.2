
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.entity.ai.EatFishFoodAITrilobiteBottomBase;
import net.lepidodendron.entity.ai.EntityMateAITrilobiteBottomBase;
import net.lepidodendron.entity.ai.TrilobiteWanderBottom;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.lepidodendron.item.entities.ItemBucketYilingia;
import net.lepidodendron.item.entities.ItemUnknownEdiacaranBlob;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraYilingia extends EntityPrehistoricFloraTrilobiteBottomBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	private int jumpTicks;
	private int slitherStage;
	private boolean slitherState;

	public EntityPrehistoricFloraYilingia(World world) {
		super(world);
		setSize(0.4F, 0.3F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public ItemStack getPropagule() {
		return new ItemStack(ItemUnknownEdiacaranBlob.block, (int) (1));
	}

	public static String getPeriod() {return "Ediacaran";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	public float getMaxTurnDistancePerTick() {
		return 5;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	protected float getAISpeedTrilobite() {
		return 0.105f;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return null;
	}

	@Override
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAITrilobiteBottomBase(this, 1));
		tasks.addTask(1, new TrilobiteWanderBottom(this, NO_ANIMATION));
		tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishFoodAITrilobiteBottomBase(this));
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

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	public int getSlitherStage() {
		int slitherstage = this.slitherStage;

		return slitherstage;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();

		if (!(slitherStage > 0)) {slitherStage = 0;}

		if (slitherState) {
			if (slitherStage > 30) {
				slitherState = false;
			} else {
				slitherStage = slitherStage + rand.nextInt(2);
			}
		}

		if (!slitherState) {
			if (slitherStage < 1) {
				slitherState = true;
			} else {
				slitherStage = slitherStage - rand.nextInt(2);
			}
		}

		//Drop an egg perhaps:
		if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && LepidodendronConfig.doMultiplyMobs) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = new ItemStack(ItemUnknownEdiacaranBlob.block, (int) (1));
				if (!itemstack.hasTagCompound()) {
					itemstack.setTagCompound(new NBTTagCompound());
				}
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				itemstack.getTagCompound().setString("creature", stringEgg);
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
				world.spawnEntity(entityToSpawn);
			}
			this.setTicks(0);
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if (!itemstack.isEmpty())
		{
			if (itemstack.getItem() == Items.WATER_BUCKET)
			{
				player.inventory.clearMatchingItems(new ItemStack(Items.WATER_BUCKET, (int) (1)).getItem(), -1, (int) 1, null);
				SoundEvent soundevent = SoundEvents.ITEM_BUCKET_FILL;
				player.getEntityWorld().playSound(player, player.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				ItemStack itemstack1 = new ItemStack(ItemBucketYilingia.block, (int) (1));
				itemstack1.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(player, itemstack1);
				this.setDead();
				return true;
			}
		}

		return super.processInteract(player, hand);
	}

	@Override
	public void onLivingUpdate() {

		this.renderYawOffset = this.rotationYaw;

		//Updated from vanilla to allow underwater jumping:
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

		if (this.isJumping)
		{

			if (this.isInWater() && this.jumpTicks == 0)
			{
				this.jump();
				this.jumpTicks = 10;
			}
			else if (this.isInLava())
			{
				this.handleJumpLava();
			}
			else if (this.onGround && this.jumpTicks == 0)
			{
				this.jump();
				this.jumpTicks = 10;
			}
		}
		else
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
}