
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraScorpion;
import net.lepidodendron.item.entities.ItemBugRaw;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraScorpion_Pulmonoscorpius extends EntityPrehistoricFloraScorpion {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraScorpion_Pulmonoscorpius(World world) {
		super(world);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.10F;
		maxWidth = 0.325F;
		maxHeight = 0.325F;
		if (getIsBaby()) {
			maxHealthAgeable = 4.0D;
		}
		else {
			maxHealthAgeable = 6.0D;
		}
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	protected float getAISpeedLand() {
		return 0.4F;
	}

	public static String getPeriod() {return "early Carboniferous";}

	public static String getHabitat() {return "Terrestrial";}

	@Override
	public int getAdultAge() {
		return 12000;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (this.getBabies() && (!this.getIsBaby())) {
			return LepidodendronMod.BUG_LOOT;
		}
		return null;
	}

	@Override
	protected void initEntityAI() {
		tasks.addTask(0, new EntityMateAIAgeableBase(this, 1.0D));
		tasks.addTask(1, new EntityAILeapAtTarget(this, 0.16F));
		tasks.addTask(2, new AttackAI(this, 1.0D, false, this.getAttackLength()));
		tasks.addTask(3, new LandEntitySwimmingAI(this, 0.15, true));
		tasks.addTask(4, new LandWanderAvoidWaterClimbingAI(this, 0.8D));
		tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(0, new EatMeatItemsAI(this));
		this.targetTasks.addTask(1, new EntityHurtByTargetSmallerThanMeAI(this, false));
	}

	@Override
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() == ItemBugRaw.block;
	}

	@Override
	public void onDeath(DamageSource cause) {
		if (!world.isRemote && this.getBabies() && (!this.getIsBaby())) {
			int ii = rand.nextInt(5);
			for (int i = 0; i <= ii; i++) {
				//Spawn babies:
				Entity entity = null;
				entity = ItemMonsterPlacer.spawnCreature(this.world, EntityList.getKey(EntityPrehistoricFloraScorpion_Pulmonoscorpius.class), (double)this.getPosition().getX() + 0.5D, (double)this.getPosition().getY() + 0.5D, (double)this.getPosition().getZ() + 0.5D);
				EntityPrehistoricFloraScorpion_Pulmonoscorpius baby = (EntityPrehistoricFloraScorpion_Pulmonoscorpius) entity;
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
			ResourceLocation resourcelocation = LepidodendronMod.PULMONOSCORPIUS_LOOT;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}

}