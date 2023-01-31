
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.EatFishFoodAIAgeable;
import net.lepidodendron.entity.ai.EntityMateAIAgeableBase;
import net.lepidodendron.entity.ai.NautiloidWander;
import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.lepidodendron.entity.render.entity.RenderIvoites;
import net.lepidodendron.entity.render.entity.RenderSphooceras;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.item.ItemFishFood;
import net.lepidodendron.item.entities.ItemNautiloidEggsAscoceras;
import net.lepidodendron.item.entities.ItemNautiloidEggsSphooceras;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraSphooceras extends EntityPrehistoricFloraNautiloidBase {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraSphooceras(World world) {
		super(world);
		setSize(0.2F, 0.2F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		//minSize = 0.2F;
		//maxSize = 1.0F;
		minWidth = 0.07F;
		maxWidth = 0.3F;
		maxHeight = 0.25F;
		maxHealthAgeable = 3.0D;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	public static String getPeriod() {return "Silurian";}

	//public static String getHabitat() {return "Aquatic";}

	@Override
	public boolean dropsEggs() {
		return false;
	}
	
	@Override
	public boolean laysEggs() {
		return false;
	}

	@Override
	public int getAdultAge() {
		return 64000;
	}

	@Override
	protected float getAISpeedNautiloid() {
		//return 0;
		return 0.0698f;
	}

	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1));
		tasks.addTask(1, new NautiloidWander(this, NO_ANIMATION));
		tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatFishFoodAIAgeable(this));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return (stack.getItem() == new ItemStack(ItemFishFood.block, (int) (1)).getItem());
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
	public SoundEvent getAmbientSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.hurt"));
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		//Drop an egg perhaps:
		if (!world.isRemote && this.isPFAdult() && this.getCanBreed() && (LepidodendronConfig.doMultiplyMobs || this.getLaying())) {
			if (Math.random() > 0.5) {
				ItemStack itemstack = new ItemStack(ItemNautiloidEggsSphooceras.block, (int) (1));
				EntityItem entityToSpawn = new EntityItem(world, this.getPosition().getX(), this.getPosition().getY(), this.getPosition().getZ(), itemstack);
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			this.setTicks(0);
		}

	}

	@Override
	public SoundEvent getDeathSound() {
		return (SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.generic.death"));
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.SPHOOCERAS_LOOT;
	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetWall() {
		return -0.73;
	}
	public static double upperfrontverticallinedepth() {
		return 0.8;
	}
	public static double upperbackverticallinedepth() {
		return 0.8;
	}
	public static double upperfrontlineoffset() {
		return 0.2;
	}
	public static double upperfrontlineoffsetperpendiular() {
		return -0.04F;
	}
	public static double upperbacklineoffset() {
		return 0.2;
	}
	public static double upperbacklineoffsetperpendiular() {
		return -0.04F;
	}
	public static double lowerfrontverticallinedepth() {
		return 0;
	}
	public static double lowerbackverticallinedepth() {
		return 0.7;
	}
	public static double lowerfrontlineoffset() {
		return 0;
	}
	public static double lowerfrontlineoffsetperpendiular() {
		return -0F;
	}
	public static double lowerbacklineoffset() {
		return 0;
	}
	public static double lowerbacklineoffsetperpendiular() {
		return -0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay() {
		return RenderDisplays.TEXTURE_SPHOOCERAS;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay() {
		return RenderDisplays.modelSphooceras;
	}
	public static float getScaler() {
		return RenderSphooceras.getScaler();
	}

}
