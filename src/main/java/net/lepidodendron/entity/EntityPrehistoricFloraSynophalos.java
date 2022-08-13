
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

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

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Cambrian";}

	//public static String getHabitat() {return "Aquatic";}

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
					//Check to see if it was trying to breed!
					if (this.isInLove()) {
						ItemStack itemstack = this.getPropagule();
						if (!itemstack.hasTagCompound()) {
							itemstack.setTagCompound(new NBTTagCompound());
						}
						Random random = this.getRNG();
						String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
						itemstack.getTagCompound().setString("creature", stringEgg);
						EntityItem entityToSpawn = new EntityItem(this.world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
						entityToSpawn.setPickupDelay(10);
						this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (random.nextFloat() - random.nextFloat()) * 0.2F + 1.0F);
						this.world.spawnEntity(entityToSpawn);
						this.resetInLove();
						this.setTicks(0);
						this.setNotMateable();
						this.setNotMateable();

						for (int i = 0; i < 7; ++i)
						{
							double d0 = random.nextGaussian() * 0.02D;
							double d1 = random.nextGaussian() * 0.02D;
							double d2 = random.nextGaussian() * 0.02D;
							double d3 = random.nextDouble() * (double)this.width * 2.0D - (double)this.width;
							double d4 = 0.5D + random.nextDouble() * (double)this.height;
							double d5 = random.nextDouble() * (double)this.width * 2.0D - (double)this.width;
							this.world.spawnParticle(EnumParticleTypes.HEART, this.posX + d3, this.posY + d4, this.posZ + d5, d0, d1, d2);
						}

						if (this.world.getGameRules().getBoolean("doMobLoot"))
						{
							this.world.spawnEntity(new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, random.nextInt(7) + 1));
						}
					}
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

}