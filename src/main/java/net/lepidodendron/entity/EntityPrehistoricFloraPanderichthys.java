
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWanderSurface;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.item.entities.ItemBucketPanderichthys;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPanderichthys extends EntityPrehistoricFloraFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;
	public Animation BREATHE_ANIMATION;
	private Animation currentAnimation;

	private static final DataParameter<Integer> BREATHING = EntityDataManager.createKey(EntityPrehistoricFloraPanderichthys.class, DataSerializers.VARINT);


	public EntityPrehistoricFloraPanderichthys(World world) {
		super(world);
		setSize(0.55F, 0.4F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		BREATHE_ANIMATION = Animation.create(55);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BREATHING, 0);
	}

	public int getBreathing() {
		if (this.dataManager.get(BREATHING) == null) {
			this.setBreathing(0);
			return 0;
		}
		return this.dataManager.get(BREATHING);
	}

	public void setBreathing(int breathing) {
		this.dataManager.set(BREATHING, breathing);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("Breathing", this.getBreathing());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBreathing(compound.getInteger("Breathing"));
	}

	public boolean isBreathing() {
		Material material = this.world.getBlockState(this.getPosition()).getMaterial();
		Material materialU = this.world.getBlockState(this.getPosition().up()).getMaterial();
		Material materialD = this.world.getBlockState(this.getPosition().down()).getMaterial();
		return (this.getBreathing() > 350 && material == Material.WATER && (materialU == Material.AIR || materialU == Material.PLANTS) && materialD != Material.WATER);
	}

	@Override
	public Animation[] getAnimations() {
		return new Animation[]{BREATHE_ANIMATION};
	}

	public static String getPeriod() {return "Devonian";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		if (this.isBreathing()) {
			return 0F;
		}
		return 0.22f;
	}

	@Override
	protected boolean isBase() {
		return false;
	}

	@Override
	public int getAnimationTick() {
		return animationTick;
	}

	@Override
	public void setAnimationTick(int tick) {
		animationTick = tick;
	}

	@Override
	public Animation getAnimation() {
		return currentAnimation == null ? NO_ANIMATION : currentAnimation;
	}

	@Override
	public void setAnimation(Animation animation) {
		if (this.getAnimation() != animation) {
			this.currentAnimation = animation;
			setAnimationTick(0);
		}
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new FishWanderSurface(this, NO_ANIMATION));
		this.targetTasks.addTask(0, new EatFishFoodAIFish(this));
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
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
		this.renderYawOffset = this.rotationYaw;

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public void onEntityUpdate() {
		super.onEntityUpdate();

		if (!world.isRemote) {
			if ((!(this.getBreathing() > 0)) || this.getBreathing() > 400) {
				this.setBreathing(0 + rand.nextInt(20));
			}
			this.setBreathing(this.getBreathing() + 1);

			if (this.getAnimation() == NO_ANIMATION && this.isBreathing()) {
				this.setAnimation(BREATHE_ANIMATION);
			}
			if (this.getAnimation() == BREATHE_ANIMATION && this.getAnimationTick() == 30) {
				this.playSound((net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
						.getObject(this.BreatheSound()), this.getSoundVolume(), 1);
			}
		}

	}

	public ResourceLocation BreatheSound() {
		return new ResourceLocation("lepidodendron:panderichthys_breathe");
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.PANDERICHTHYS_LOOT;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source != DamageSource.DROWN) {
			return super.attackEntityFrom(source, (amount * 0.5F));
		}
		return super.attackEntityFrom(source, amount);
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
				ItemStack itemstack1 = new ItemStack(ItemBucketPanderichthys.block, (int) (1));
				itemstack1.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(player, itemstack1);
				this.setDead();
				return true;
			}
		}

		return super.processInteract(player, hand);
	}

	@Override
	public void travel(float strafe, float vertical, float forward)
	{
		super.travel(strafe, vertical, forward);
		if (this.isBreathing()) {
			this.motionY = 0.01D;
		}
	}

}