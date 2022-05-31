
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWanderBottomDweller;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.item.entities.ItemBucketMimetaster;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
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

public class EntityPrehistoricFloraMimetaster extends EntityPrehistoricFloraFishBase {

	private static final DataParameter<Integer> SPONGE = EntityDataManager.createKey(EntityPrehistoricFloraMimetaster.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> SPONGE_COOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraMimetaster.class, DataSerializers.VARINT);

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraMimetaster(World world) {
		super(world);
		setSize(0.3F, 0.2F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
	}

	public static String getPeriod() {return "Devonian";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(SPONGE, 0);
		this.dataManager.register(SPONGE_COOLDOWN, 0);
	}

	public int getSponge() {
		if (this.dataManager.get(SPONGE) == null) {
			this.setSponge(0);
			return 0;
		}
		return this.dataManager.get(SPONGE);
	}

	public void setSponge(int sponge) {
		this.dataManager.set(SPONGE, sponge);
	}

	public int getSpongeCooldown() {
		if (this.dataManager.get(SPONGE_COOLDOWN) == null) {
			this.setSpongeCooldown(0);
			return 0;
		}
		return this.dataManager.get(SPONGE_COOLDOWN);
	}

	public void setSpongeCooldown(int spongeCooldown) {
		this.dataManager.set(SPONGE_COOLDOWN, spongeCooldown);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("sponge", this.getSponge());
		compound.setInteger("spongeCooldown", this.getSpongeCooldown());
	}

	//@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setSponge(compound.getInteger("sponge"));
		this.setSpongeCooldown(compound.getInteger("spongeCooldown"));
	}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	protected float getAISpeedFish() {
		if (this.isAtBottom()) {
			return 0.132f * 2f;
		}
		return 0.132f;
	}

	@Override
	protected boolean isBase() {
		return true;
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
		tasks.addTask(0, new EntityMateAIFishBase(this, 1));
		tasks.addTask(1, new FishWanderBottomDweller(this, NO_ANIMATION));
		tasks.addTask(2, new EntityAILookIdle(this));
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
		return EnumCreatureAttribute.ARTHROPOD;
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

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.renderYawOffset = this.rotationYaw;
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Update sponge texture?
		if (!world.isRemote) {
			int i = getSpongeCooldown();
			if (i > 0) {
				i = i - 1;
				this.setSpongeCooldown(i);
			}
			int sponge = getSponge();
			if (i < 1) {
				sponge = 0;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockBlueSponge.block) {
				sponge = 1;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockYellowSponge.block) {
				sponge = 2;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockBranchedSponge.block) {
				sponge = 2;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockBrownSponge.block) {
				sponge = 3;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockRedSponge.block) {
				sponge = 4;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockOrangeSponge.block) {
				sponge = 5;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockPinkSponge.block) {
				sponge = 6;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockWhiteSponge.block) {
				sponge = 7;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockDarkPinkSponge.block) {
				sponge = 8;
			}
			if (world.getBlockState(this.getPosition()).getBlock() == BlockDarkOrangeSponge.block) {
				sponge = 9;
			}
			if (sponge != this.getSponge()) {
				this.playSound(SoundEvents.BLOCK_WATERLILY_PLACE, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
				this.setSponge(sponge);
				if (sponge > 0) {
					this.setSpongeCooldown(1200); //A minutes's worth of colour change
				}
			}
		}
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.MIMETASTER_LOOT;
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
				ItemStack itemstack1 = new ItemStack(ItemBucketMimetaster.block, (int) (1));
				itemstack1.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(player, itemstack1);
				this.setDead();
				return true;
			}
		}

		return super.processInteract(player, hand);
	}
}