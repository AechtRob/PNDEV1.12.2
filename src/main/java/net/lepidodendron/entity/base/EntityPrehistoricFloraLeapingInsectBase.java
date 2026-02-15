
package net.lepidodendron.entity.base;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.entity.util.PathNavigateGliding;
import net.lepidodendron.entity.util.PathNavigateGroundNoWater;
import net.lepidodendron.entity.util.PathNavigateSwimmerTopLayer;
import net.lepidodendron.item.entities.ItemUnknownEggLand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public abstract class EntityPrehistoricFloraLeapingInsectBase extends EntityPrehistoricFloraLandClimbingGlidingBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer tailBuffer;
	private int launchCooldown;
	private Animation animation = NO_ANIMATION;
	private static final DataParameter<Integer> JUMPCOOLDOWN = EntityDataManager.createKey(EntityPrehistoricFloraLeapingInsectBase.class, DataSerializers.VARINT);

	public EntityPrehistoricFloraLeapingInsectBase(World world) {
		super(world);
		setNoAI(!true);
		enablePersistence();
	}

	/**
	 * This abstract method allows you to control how long between jumps. Larger number = longer time between jumps
	 * @return
	 */

	public abstract int jumpCooldown();

	/**
		when attacked, jump
	 */

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		if((!this.isJumping) && this.onGround && !this.isReallyInWater() && !this.getIsLaunching() && !this.getIsFlying()){
			this.jump();
		}
		return super.attackEntityFrom(ds, i);
	}

	public ItemStack getDroppedEggItemStack() {
		return new ItemStack(ItemUnknownEggLand.block, (int) (1));
	}

	public boolean getIsJumping() {
		return this.isJumping;
	}

	/**
	 * when touched by any entity, jump
	 * @param entityIn
	 */

	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if(this.getIsMoving() && (!this.isJumping) && this.onGround && !this.isReallyInWater() && !this.getIsLaunching()){
			this.jump();
		}

	}

	@Override
	public boolean canJar() {
		return true;
	}

	/**
	 * set the jump cooldown on first spawn
	 * @param difficulty
	 * @param livingdata
	 * @return
	 */

	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		if (this.getLaunchCooldown() < 0) {
			this.launchCooldown = rand.nextInt(this.getLaunchCooldown()) + 100;
		}
		this.setJumpCooldown(rand.nextInt(jumpCooldown()));
		this.launchProgress = 0;
		return livingdata;
	}

	@Override
	public void selectNavigator () {
		if (this.getIsFlying()) {
			if ((!(this.moveHelper instanceof EntityPrehistoricFloraLeapingInsectBase.GlideMoveHelper))
					|| (!(this.navigator instanceof PathNavigateGliding))) {
				this.moveHelper = new EntityPrehistoricFloraLeapingInsectBase.GlideMoveHelper(this);
				this.navigator = new PathNavigateGliding(this, world);
			}
		}
		else { //Is not flying
			if (this.isSwimmingInWater() && this.canSwim()) {
				if ((!(this.moveHelper instanceof SwimmingMoveHelper))
						|| (!(this.navigator instanceof PathNavigateSwimmerTopLayer))) {
					this.moveHelper = new SwimmingMoveHelper();
					this.navigator = new PathNavigateSwimmerTopLayer(this, world);

					//System.err.println(this.getClass() + " Navigator changed to " + this.navigator);
				}
			} else if ((!this.isSwimmingInWater()) || (!this.canSwim())) {
				if ((!(this.moveHelper instanceof WanderMoveHelper))
						|| (!(this.navigator instanceof PathNavigateGroundNoWater))) {
					this.moveHelper = new WanderMoveHelper();
					this.navigator = new PathNavigateGroundNoWater(this, world);
					//System.err.println(this.getClass() + "Navigator changed to " + this.navigator);
				}
			}
		}
	}

	public int getJumpCooldown() {
		return this.dataManager.get(JUMPCOOLDOWN);
	}

	public void setJumpCooldown(int jumpcooldown) {
		this.dataManager.set(JUMPCOOLDOWN, jumpcooldown);
	}

	@Override
	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		//Drop an egg perhaps:
		if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && this.getLaying()) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = getDroppedEggItemStack();
				if (!itemstack.hasTagCompound()) {
					itemstack.setTagCompound(new NBTTagCompound());
				}
				itemstack.getTagCompound().setString("creature", getEntityId(this));
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				this.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
				world.spawnEntity(entityToSpawn);
				this.setLaying(false);
			}
			this.setTicks(0);
		}
	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(JUMPCOOLDOWN, jumpCooldown());
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setInteger("jumpCooldown", this.getJumpCooldown());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setJumpCooldown(compound.getInteger("jumpCooldown"));
	}

	/**
	 * when jump cooldown decreases to 0, perform a short jump.
	 */

	@Override
	public void onLivingUpdate()
	{

		if(!world.isRemote) {
			//decrease jumpcooldown
			if (this.getJumpCooldown() > 0) {
				this.setJumpCooldown(this.getJumpCooldown() - 1);
			}

			if(this.getJumpCooldown() <= 0 && !this.getIsFlying() && this.isOnGround() && this.getIsMoving() && !this.isReallyInWater() && !this.getIsLaunching()){
				this.jump();
				this.setJumpCooldown(rand.nextInt(jumpCooldown()));
			}
		}

		super.onLivingUpdate();

	}

	@Override
	public String getTexture() {
		return this.getTexture();
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}

}