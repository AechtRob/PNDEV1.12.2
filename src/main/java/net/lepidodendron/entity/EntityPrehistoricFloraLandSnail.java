
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.block.BlockAncientMoss;
import net.lepidodendron.block.BlockDollyphyton;
import net.lepidodendron.block.BlockEdwardsiphyton;
import net.lepidodendron.block.BlockSelaginella;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.LandEntitySwimmingAI;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandSlitheringBase;
import net.lepidodendron.item.entities.ItemLandSnail;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraLandSnail extends EntityPrehistoricFloraLandSlitheringBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraLandSnail(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.1F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 0.8D;
	}

	@Override
	public boolean canJar() {
		return true;
	}


	public static String getPeriod() {return "Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Pleistocene - Present";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public boolean dropsEggs() {
		return true;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 0;
	} //Only adults!

	@Override
	public int getAnimationTick() {
		return getAnimationTick();
	}

	@Override
	protected float getAISpeedLand() {
		return 0.07f;
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
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new LandEntitySwimmingAI(this, 0.75, true));
		tasks.addTask(2, new EntityAIWanderAvoidWater(this, 1.0D));
		tasks.addTask(3, new EntityAILookIdle(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (OreDictionary.containsMatch(false, OreDictionary.getOres("itemMoss"), stack));
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
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		//Eat moss!
		BlockPos pos = this.getPosition();
		if ((this.getHealth() < this.getMaxHealth()) && this.getHealth() > 0
			&& ((this.world.getBlockState(pos).getBlock() == BlockDollyphyton.block)
			|| (this.world.getBlockState(pos).getBlock() == BlockEdwardsiphyton.block)
			|| (this.world.getBlockState(pos).getBlock() == BlockAncientMoss.block)
			|| (this.world.getBlockState(pos).getBlock() == BlockSelaginella.block))
		) {
			this.world.destroyBlock(pos,false);
			this.setHealth(this.getHealth() + 0.5F);
		}

	}

	public static final PropertyDirection FACING = BlockDirectional.FACING;


	@Nullable
	protected ResourceLocation getLootTable() {
		return null;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.world.isRemote && !this.isDead) {
			if ("player".equals(source.getDamageType())) {
				EntityItem entityToSpawn = new EntityItem(world, this.posX, this.posY, this.posZ, new ItemStack(ItemLandSnail.block, (int) (1)));
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

}