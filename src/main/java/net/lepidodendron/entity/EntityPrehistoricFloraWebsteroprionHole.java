
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockWebsteroprionBurrow;
import net.lepidodendron.entity.ai.WebsteroprionEatItemsAIHole;
import net.minecraft.block.material.Material;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;

public class EntityPrehistoricFloraWebsteroprionHole extends EntityAnimal implements IAnimatedEntity {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private static final DataParameter<Integer> BURROWX = EntityDataManager.createKey(EntityPrehistoricFloraWebsteroprionHole.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> BURROWY = EntityDataManager.createKey(EntityPrehistoricFloraWebsteroprionHole.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> BURROWZ = EntityDataManager.createKey(EntityPrehistoricFloraWebsteroprionHole.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> ATTACKTICK = EntityDataManager.createKey(EntityPrehistoricFloraWebsteroprionHole.class, DataSerializers.VARINT);

	private Animation currentAnimation;
	private int animationTick;

	private final EntityPrehistoricFloraWebsteroprionHole.PlayerSorter targetSorter;

	public EntityPrehistoricFloraWebsteroprionHole(World world) {
		super(world);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		setSize(0.99F, 0.99F);
		//minWidth = 0.2F;
		//maxWidth = 0.75F;
		//maxHeight = 0.99F;
		//maxHealthAgeable = 12D;
		this.targetSorter = new EntityPrehistoricFloraWebsteroprionHole.PlayerSorter(this);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
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

	@Override
	public Animation[] getAnimations() {
		return null;
	}


	//@Override
	public int getAttackLength() {
		return 90;
	}

	public int getticksExtension() {
		return 10;
	}

	public int getticksRetraction() {
		return 65;
	}

	public int getBiteDuration() {
		return 5;
	}

	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(BURROWX, 1);
		this.dataManager.register(BURROWY, 1);
		this.dataManager.register(BURROWZ, 1);
		this.dataManager.register(ATTACKTICK, 0);
	}

	public int getBurrowX() {
		return this.dataManager.get(BURROWX);
	}

	public int getBurrowY() {
		return this.dataManager.get(BURROWY);
	}

	public int getBurrowZ() {
		return this.dataManager.get(BURROWZ);
	}

	public void setBurrow(BlockPos burrow) {
		this.dataManager.set(BURROWX, burrow.getX());
		this.dataManager.set(BURROWY, burrow.getY());
		this.dataManager.set(BURROWZ, burrow.getZ());
	}

	public int getAttackTick() {
		return this.dataManager.get(ATTACKTICK);
	}

	public void setAttackTick(int tick) {
		this.dataManager.set(ATTACKTICK, tick);
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("BurrowX", this.getBurrowX());
		compound.setInteger("BurrowY", this.getBurrowY());
		compound.setInteger("BurrowZ", this.getBurrowZ());
		compound.setInteger("AttackTick", this.getAttackTick());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		int BurrowX = compound.getInteger("BurrowX");
		int BurrowY = compound.getInteger("BurrowY");
		int BurrowZ = compound.getInteger("BurrowZ");
		this.setBurrow(new BlockPos(BurrowX, BurrowY, BurrowZ));
		this.setAttackTick(compound.getInteger("AttackTick"));
	}

	//@Override
	//public int getRoarLength() {
	//	return 0;
	//}

	@Override
	public void playLivingSound() {
	}

	//@Override
	//public boolean dropsEggs() {
	//	return false;
	//}

	//@Override
	//public boolean laysEggs() {
	//	return false;
	//}

	//@Override
	//public int getAdultAge() {
	//	return 1;
	//}

	protected void initEntityAI() {
		//No attack AI to run
		//tasks.addTask(0, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		this.targetTasks.addTask(0, new WebsteroprionEatItemsAIHole(this));
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	//@Override
	//public String getTexture() {
	//	return this.getTexture();
	//}

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

	//@Override
	//protected double getSwimSpeed() {
	//	return this.getSwimSpeed();
	//}

	//@Override
	//protected float getAISpeedEurypterid() {
	//	return 0;
	//}

	@Override
	public boolean isInWater() {
		return super.isInWater() || this.isInsideOfMaterial(Material.WATER) || this.isInsideOfMaterial(Material.CORAL);
	}

	public boolean isInLava() {
		return (this.isInsideOfMaterial(Material.LAVA) || world.getBlockState(this.getPosition().up()).getMaterial() == Material.LAVA);
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

	//@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		//No egg-laying for this one!
	}

	@Override
	public void onDeath(DamageSource cause) {
		if (world.getBlockState(new BlockPos(getBurrowX(), getBurrowY(), getBurrowZ())).getBlock() == BlockWebsteroprionBurrow.block) {
			world.setBlockState(new BlockPos(getBurrowX(), getBurrowY(), getBurrowZ()), BlockWebsteroprionBurrow.block.getDefaultState().withProperty(BlockWebsteroprionBurrow.OCCUPIED, false), 3);
		}
		super.onDeath(cause);
	}

	@Override
	protected float getSoundVolume() {
		return 1.0F;
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(3);
	}

	@Override
	public void onLivingUpdate() {

		//if (!this.world.isRemote) {
		//System.err.println("server tick " + this.getAttackTick() );
		//}
		//else {
		//System.err.println("client tick " + this.getAttackTick() );
		//}

		super.onLivingUpdate();

		//Hold it in the hole if collided:
		this.setPosition((double)this.getBurrowX() + 0.5D, (double)this.getBurrowY(), (double)this.getBurrowZ() + 0.5D);

		if (this.isInLava()) {
			this.setOnFireFromLava();
			this.damageEntity(DamageSource.LAVA, 50);
		}

		if (!this.world.isRemote) {
			this.setAttackTick(this.getAttackTick() + 1);
		}

		//if (!world.isRemote) {
			//System.err.println("server tick " + this.getAttackTick() );
		//}
		//else {
			//System.err.println("client tick " + this.getAttackTick() );
		//}

		if (this.getAttackTarget() != null) {
			this.getLookHelper().setLookPositionWithEntity(this.getAttackTarget(), 30.0F, 30.0F);
		}

		if (this.getAttackTick() == (this.getticksExtension() + this.getBiteDuration() - 1) && this.getAttackTarget() != null) {
			launchAttack();
			if (this.world instanceof WorldServer) {
				for (int k = 0; k < 5; ++k) {
					((WorldServer) this.world).spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), (int) 1, 1, 1, 1, 0.2, new int[0]);
				}
			}
		}

		if ((this.getAttackTick() > this.getAttackLength())) {
			//System.err.println("Setting block check " + getBurrowX() + " " + getBurrowY() + " " + getBurrowZ());
			//Attack is over and the worm is back in the hole!
			if (!this.world.isRemote) {
				if (this.world.getBlockState(new BlockPos(getBurrowX(), getBurrowY(), getBurrowZ())).getBlock() == BlockWebsteroprionBurrow.block) {
					//System.err.println("Setting block to occupied on server " + getBurrowX() + " " + getBurrowY() + " " + getBurrowZ());
					this.world.setBlockState(new BlockPos(getBurrowX(), getBurrowY(), getBurrowZ()), BlockWebsteroprionBurrow.block.getDefaultState().withProperty(BlockWebsteroprionBurrow.OCCUPIED, true), 3);
				}
				//System.err.println("Setting dead 1");
				this.setDead();
				return; //no more animation loops
			}
			//System.err.println("Setting dead 1");
			//this.setDead();
			//return; //no more animation loops
		}

		if (this.world.getBlockState(new BlockPos(getBurrowX(), getBurrowY(), getBurrowZ())).getBlock() != BlockWebsteroprionBurrow.block) {
			//The burrow has been removed! Spawn a free Websteroprion to attack the nearest player!
			if (!this.world.isRemote) {
				//System.err.println("Setting free mob");
				Entity MobSpawn = ItemMonsterPlacer.spawnCreature(world, EntityList.getKey(EntityPrehistoricFloraWebsteroprion.class), (double) getBurrowX() + 0.5D, (double) getBurrowY(), (double) getBurrowZ() + 0.5D);
				if (MobSpawn != null) {
					//System.err.println("Spawned!");
					EntityPrehistoricFloraWebsteroprion websteroprionFree = (EntityPrehistoricFloraWebsteroprion) MobSpawn;
					websteroprionFree.setAgeTicks(1);
					websteroprionFree.setRevengeTarget(getNearestPlayer(16, this));
				}
				//System.err.println("Setting dead 2");
				this.setDead();
				return; //no more animation loops
			}
			//System.err.println("Setting dead 2");
			//this.setDead();
			//return; //no more animation loops
		}

		AnimationHandler.INSTANCE.updateAnimations(this);
	}

	private EntityPlayer getNearestPlayer(int range, EntityPrehistoricFloraWebsteroprionHole websteroprion) {
		List<EntityPlayer> Entities = websteroprion.world.getEntitiesWithinAABB(EntityPlayer.class, websteroprion.getEntityBoundingBox().grow(range, range, range));
		Entities.sort(this.targetSorter);
		for (EntityPlayer currentEntity : Entities) {
			if (!currentEntity.isDead) {
				return currentEntity;
			}
		}
		return null;
	}

	public class PlayerSorter implements Comparator<Entity> {
		private final Entity e;

		public PlayerSorter(Entity entity) {
			this.e = entity;
		}

		@Override
		public int compare(Entity entity1, Entity entity2) {
			double distance1 = this.e.getDistanceSq(entity1);
			double distance2 = this.e.getDistanceSq(entity2);
			return Double.compare(distance1, distance2);
		}
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		return false;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.WEBSTEROPRION_LOOT;
	}

	public void launchAttack() {
		IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		if (getAttackTarget() != null) {
			boolean b = this.getAttackTarget().attackEntityFrom(DamageSource.causeMobDamage(this), (float) iattributeinstance.getAttributeValue());
		}
	}

	public void eatItem(ItemStack stack) {
		if (stack != null && stack.getItem() != null) {
			float itemHealth = 0.5F; //Default minimal nutrition
			if (stack.getItem() instanceof ItemFood) {
				itemHealth = ((ItemFood) stack.getItem()).getHealAmount(stack);
			}
			this.setHealth(Math.min(this.getHealth() + itemHealth, (float) this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue()));
			stack.shrink(1);
			if (!world.isRemote) {
				SoundEvent soundevent = SoundEvents.ENTITY_GENERIC_EAT;
				this.getEntityWorld().playSound(null, this.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
			}
		}
	}
}