
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.item.entities.ItemBucketSynophalos;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemMonsterPlacer;
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

public class EntityPrehistoricFloraSynophalos extends EntityPrehistoricFloraFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	private static final DataParameter<Integer> CHAIN = EntityDataManager.createKey(EntityPrehistoricFloraSynophalos.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> HITCOOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraSynophalos.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraSynophalos(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
	}

	public static String getPeriod() {return "Cambrian";}

	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		//return 0;
		return 0.119f * 0.75F;
	}

	public int getChain() {
		if (this.dataManager.get(CHAIN) == null) {
			setChain(1);
		}
		return (this.dataManager.get(CHAIN));
	}

	public void setChain(int Chain) {
		this.dataManager.set(CHAIN, Chain);
	}

	public int getCooldown() {
		if (this.dataManager.get(HITCOOLDOWN) == null) {
			setCooldown(0);
		}
		return (this.dataManager.get(HITCOOLDOWN));
	}

	public void setCooldown(int Cooldow) {
		this.dataManager.set(HITCOOLDOWN, Cooldow);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(CHAIN, 1);
		this.dataManager.register(HITCOOLDOWN, 0);
	}


	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("chain", this.getChain());
		compound.setInteger("hitcooldown", this.getCooldown());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setChain(compound.getInteger("chain"));
		this.setCooldown(compound.getInteger("hitcooldown"));
	}

	@Override
	protected boolean isBase() {
		return false;
	}

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
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
		tasks.addTask(1, new FishWander(this, NO_ANIMATION));
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
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (this.getCooldown() > 0) {setCooldown(this.getCooldown() - 1);}
		if (this.getCooldown() < 0) {setCooldown(0);}
	}

	public boolean canChain() {
		return this.getCooldown() == 0;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.SYNOPHALOS_LOOT;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!world.isRemote && this.getChain() > 1) {
			//break the chains down first:
			double posX = this.posX;
			double posY = this.posY;
			double posZ = this.posZ;
			if (this.getChain() == 2) {
				//this.setDead();
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraSynophalos.class), posX, posY, posZ);
				if (MobSpawn != null) {
					EntityPrehistoricFloraSynophalos ee = (EntityPrehistoricFloraSynophalos) MobSpawn;
					ee.setChain(1);
					ee.setCooldown(240);
				}
				this.setChain(1);
				this.setCooldown(240);
				return true;
			}
			if (this.getChain() == 4) {
				//this.setDead();
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraSynophalos.class), posX, posY, posZ);
				if (MobSpawn != null) {
					EntityPrehistoricFloraSynophalos ee = (EntityPrehistoricFloraSynophalos) MobSpawn;
					ee.setChain(2);
					ee.setCooldown(240);
				}
				this.setChain(2);
				this.setCooldown(240);
				return true;
			}
			if (this.getChain() == 8) {
				//this.setDead();
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraSynophalos.class), posX, posY, posZ);
				if (MobSpawn != null) {
					EntityPrehistoricFloraSynophalos ee = (EntityPrehistoricFloraSynophalos) MobSpawn;
					ee.setChain(4);
					ee.setCooldown(240);
				}
				this.setChain(4);
				this.setCooldown(240);
				return true;
			}
			if (this.getChain() == 16) {
				//this.setDead();
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraSynophalos.class), posX, posY, posZ);
				if (MobSpawn != null) {
					EntityPrehistoricFloraSynophalos ee = (EntityPrehistoricFloraSynophalos) MobSpawn;
					ee.setChain(8);
					ee.setCooldown(240);
				}
				this.setChain(8);
				this.setCooldown(240);
				return true;
			}
		}

		return super.attackEntityFrom(source, amount);
	}

	@Override
	protected void collideWithEntity(Entity entityIn) {
		if (this.canChain() && !this.world.isRemote && entityIn instanceof EntityPrehistoricFloraSynophalos) {
			int newChain = 0;
			EntityPrehistoricFloraSynophalos e = (EntityPrehistoricFloraSynophalos) entityIn;
			if (e.canChain()) {
				if (this.getChain() == 1 && e.getChain() == 1) {
					newChain = 2;
				}
				if (this.getChain() == 2 && e.getChain() == 2) {
					newChain = 4;
				}
				if (this.getChain() == 4 && e.getChain() == 4) {
					newChain = 8;
				}
				if (this.getChain() == 8 && e.getChain() == 8) {
					newChain = 16;
				}
				if (newChain > 0) {
					//Join the chains:
					entityIn.setDead();
					this.setChain(newChain);
				}
				else {
					super.collideWithEntity(entityIn);
				}
			}
			else {
				super.collideWithEntity(entityIn);
			}
		}
		else {
			super.collideWithEntity(entityIn);
		}
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
				ItemStack itemstack1 = new ItemStack(ItemBucketSynophalos.block, (int) (1));
				itemstack1.setCount(1);

				//Apply nbt to the bucket:
				int chain = this.getChain();
				if (!itemstack1.hasTagCompound())
					itemstack1.setTagCompound(new NBTTagCompound());
				itemstack1.getTagCompound().setInteger("chain", chain);

				ItemHandlerHelper.giveItemToPlayer(player, itemstack1);
				this.setDead();
				return true;
			}
		}

		return super.processInteract(player, hand);
	}

}