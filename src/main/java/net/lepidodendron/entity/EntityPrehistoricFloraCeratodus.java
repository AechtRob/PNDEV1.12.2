
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIFish;
import net.lepidodendron.entity.ai.EntityMateAIFishBase;
import net.lepidodendron.entity.ai.FishWanderBottomDweller;
import net.lepidodendron.entity.base.EntityPrehistoricFloraFishBase;
import net.lepidodendron.item.entities.ItemUnknownEgg;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraCeratodus extends EntityPrehistoricFloraFishBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraCeratodus(World world) {
		super(world);
		setSize(0.5F, 0.3F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Triassic - Jurassic - Cretaceous";}

	public static String getSize() {return "L";}
	public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return true;
	}

	@Override
	protected float getAISpeedFish() {
		return 0.185f;
	}

	@Override
	protected boolean isBase() {
		return true;
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
		tasks.addTask(1, new FishWanderBottomDweller(this, NO_ANIMATION));
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
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
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

	//this is a lungfish so they have longer time on land
	public void onEntityUpdate() {
		{
			int i = this.getAir();
			super.onEntityUpdate();

			if (this.isEntityAlive() && !isInWater()) {
				--i;
				this.setAir(i);

				if (this.getAir() == -20) {
					this.setAir(0);
					this.attackEntityFrom(DamageSource.DROWN, 1.0F);
				}
			} else {
				this.setAir(3000);
			}

			//General ticker (for babies etc.)
			int ii = this.getTicks();
			if (this.isEntityAlive()) {
				++ii;
				//limit at 48000 (two MC days) and then reset:
				if (ii >= 48000) {
					ii = 0;
				}
				this.setTicks(ii);
			}

			//Drop an egg perhaps:
			if (!world.isRemote && this.getCanBreed() && this.dropsEggs() && LepidodendronConfig.doMultiplyMobs) {
				if (Math.random() > 0.5) {
					ItemStack itemstack = new ItemStack(ItemUnknownEgg.block, (int) (1));
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
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.CERATODUS_LOOT;
	}

}