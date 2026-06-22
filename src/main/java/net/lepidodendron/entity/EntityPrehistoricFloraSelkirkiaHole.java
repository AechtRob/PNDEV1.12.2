
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockWebsteroprionBurrow;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.ai.EatItemsEntityPrehistoricFloraTrilobiteBottomBaseAI;
import net.lepidodendron.entity.base.EntityPrehistoricFloraTrilobiteBottomBase;
import net.lepidodendron.entity.util.EnumCreatureAttributePN;
import net.lepidodendron.entity.util.IPrehistoricDiet;
import net.minecraft.block.material.Material;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFood;
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
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.util.Comparator;

public class EntityPrehistoricFloraSelkirkiaHole extends EntityPrehistoricFloraTrilobiteBottomBase implements IAnimatedEntity, IPrehistoricDiet {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private static final DataParameter<Integer> BURROWX = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkiaHole.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> BURROWY = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkiaHole.class, DataSerializers.VARINT);
	private static final DataParameter<Integer> BURROWZ = EntityDataManager.createKey(EntityPrehistoricFloraSelkirkiaHole.class, DataSerializers.VARINT);

	private Animation currentAnimation;
	private int animationTick;

	private final EntityPrehistoricFloraSelkirkiaHole.PlayerSorter targetSorter;

	public EntityPrehistoricFloraSelkirkiaHole(World world) {
		super(world);
		setSize(0.99F, 0.99F);
		this.targetSorter = new EntityPrehistoricFloraSelkirkiaHole.PlayerSorter(this);
	}

	public EnumCreatureAttributePN getPNCreatureAttribute() {
		return EnumCreatureAttributePN.INVERTEBRATE;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entity) {
		return null;
	}

	@Override
	public boolean isSmall() {
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

	@Override
	public Animation[] getAnimations() {
		return null;
	}

	@Override
	public String[] getFoodOreDictsForVariantInPalaeopedia(@Nullable String variantIn) {
		return getFoodOreDicts();
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

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("BurrowX", this.getBurrowX());
		compound.setInteger("BurrowY", this.getBurrowY());
		compound.setInteger("BurrowZ", this.getBurrowZ());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		int BurrowX = compound.getInteger("BurrowX");
		int BurrowY = compound.getInteger("BurrowY");
		int BurrowZ = compound.getInteger("BurrowZ");
		this.setBurrow(new BlockPos(BurrowX, BurrowY, BurrowZ));
	}

	//@Override
	//public int getRoarLength() {
	//	return 0;
	//}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISHFOOD, DietString.MICROBIAL);
	}

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
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraTrilobiteBottomBaseAI(this));;
	}

	@Override
	public boolean isAIDisabled() {
		return false;
	}

	@Override
	public String getTexture() {
		return null;
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

		//if (!world.isRemote) {
			//System.err.println("server tick " + this.getAttackTick() );
		//}
		//else {
			//System.err.println("client tick " + this.getAttackTick() );
		//}

		if (this.getAttackTarget() != null) {
			this.getLookHelper().setLookPositionWithEntity(this.getAttackTarget(), 30.0F, 30.0F);
			}
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

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.SELKIRKIA_LOOT;
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

	@Override
	public boolean dropsEggs() {
		return false;
	}

	@Override
	protected float getAISpeedTrilobite() {
		return 0;
	}
}