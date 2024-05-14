
package net.lepidodendron.entity;

import com.google.common.base.Predicate;
import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.AnimationHandler;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraWalkingAmphibianBase;
import net.lepidodendron.entity.render.entity.RenderEramoscorpius;
import net.lepidodendron.entity.render.entity.RenderPraearcturus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.IBrood;
import net.lepidodendron.entity.util.ITrappableWater;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraPraearcturus extends EntityPrehistoricFloraWalkingAmphibianBase implements ITrappableWater, IAdvancementGranter, IBrood {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraPraearcturus(World world) {
		super(world);
		setSize(0.5F, 0.2F);
		minWidth = 0.10F;
		maxWidth = 0.50F;
		maxHeight = 0.20F;
		if (getIsBaby()) {
			maxHealthAgeable = 4.0D;
		}
		else {
			maxHealthAgeable = 9.0D;
		}
	}

	@Override
	public int getAttackLength() {
		return 21;
	}
	@Override
	protected float getAISpeedWalkingAmphibian() {

		float calcSpeed = 0.15F;
		if (this.isReallyInWater()) {
			calcSpeed = 0.28f;
		}
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		return  calcSpeed;
	}

	@Override
	public int WaterDist() {
		int i = (int) LepidodendronConfig.waterHibbertopterus;
		if (i > 16) {i = 16;}
		if (i < 1) {i = 1;}
		return i;
	}

	@Override
	public boolean isSmall() {
		return true;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.FISH, DietString.MEAT);
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.ARTHROPOD;
	}

	@Override
	public boolean canJar() {
		return true;
	}

	public static String getPeriod() {return "Devonian";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	public int getAdultAge() {
		return 12000;
	}


	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		livingdata = super.onInitialSpawn(difficulty, livingdata);
		this.setTicks(0);
		this.setAgeTicks(this.getAdultAge());
		if (Math.random() >= 0.8) {
			this.setBabies(true);
		}
		return livingdata;
	}

	public void onEntityUpdate() {
		super.onEntityUpdate();
		this.setIsBaby(!(this.getAgeTicks() >= getAdultAge()));
	}

	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("Babies", this.getBabies());
		compound.setBoolean("IsBaby", this.getIsBaby());
	}

	public void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		this.setBabies(compound.getBoolean("Babies"));
		this.setIsBaby(compound.getBoolean("IsBaby"));
	}


	@Nullable
	protected ResourceLocation getLootTable() {
		if (this.getBabies() && (!this.getIsBaby())) {
			return LepidodendronMod.PRAEARCTURUS_LOOT;
		}
		else if (!this.getIsBaby()) {
			return LepidodendronMod.BUG_LOOT;
		}
		return null;
	}
	//Rendering taxidermy:
	//--------------------
	public static double offsetWall(@Nullable String variant) {
		return -1.36;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.9;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return -0.0F;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return -0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0F;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderPraearcturus.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelPraearcturus;}
	public static float getScaler(@Nullable String variant) {
		return RenderPraearcturus.getScaler();
	}
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		//this.renderYawOffset = this.rotationYaw;

		if (this.getAnimation() == ATTACK_ANIMATION && this.getAnimationTick() == 5 && this.getAttackTarget() != null) {
			launchAttack();
		}

		AnimationHandler.INSTANCE.updateAnimations(this);

	}

	public AxisAlignedBB getAttackBoundingBox() {
		float size = this.getRenderSizeModifier() * 0.25F;
		return this.getEntityBoundingBox().grow(0.0F + size, 0.0F + size, 0.0F + size);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (this.getAnimation() == NO_ANIMATION) {
			this.setAnimation(ATTACK_ANIMATION);
			//System.err.println("set attack");
		}
		return false;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAILeapAtTarget(this, 0.16F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new EntityTemptAI(this, 1, true, true, (float) 0.5F));
		tasks.addTask(4, new WalkingAmphibianWander(this, NO_ANIMATION, 0.9, 0));
		tasks.addTask(5, new EntityLookIdleAI(this));
		this.targetTasks.addTask(0, new EatItemsEntityPrehistoricFloraAgeableBaseAI(this, 1));
		this.targetTasks.addTask(1, new HuntForDietEntityPrehistoricFloraAgeableBaseAI(this, EntityLivingBase.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase, 0.1F, 1.2F, false));
		//this.targetTasks.addTask(2, new HuntPlayerAlwaysAI(this, EntityPlayer.class, true, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));

	}



	@Override
	public void onDeath(DamageSource cause) {
		if (!world.isRemote && this.getBabies() && (!this.getIsBaby())) {
			int ii = rand.nextInt(5);
			for (int i = 0; i <= ii; i++) {
				//Spawn babies:
				Entity entity = null;
				entity = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraPraearcturus.class), (double)this.getPosition().getX() + 0.5D, (double)this.getPosition().getY() + 0.5D, (double)this.getPosition().getZ() + 0.5D);
				EntityPrehistoricFloraPraearcturus baby = (EntityPrehistoricFloraPraearcturus) entity;
				baby.setAgeTicks(1);
				baby.setIsBaby(true);
				if (Math.random() >= 0.8) {
					baby.setBabies(true);
				}
				Entity target = cause.getTrueSource();
				if (target instanceof EntityLivingBase) {
					if (target instanceof EntityPlayer) {
						EntityPlayer player = (EntityPlayer) target;
						if (!player.capabilities.isCreativeMode) {
							baby.setAttackTarget((EntityLivingBase) target);
						}
					}
					else {
						baby.setAttackTarget((EntityLivingBase) target);
					}
				}
			}
		}
		super.onDeath(cause);
	}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.PRAEARCTURUS_LOOT_JAR;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", "");
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_PRAEARCTURUS;
	}
}