
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.item.entities.ItemEggsProsictodon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraProsictodon extends EntityPrehistoricFloraDiictodon {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraProsictodon(World world) {
		super(world);
		//setSize(0.6F, 0.35F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		minWidth = 0.10F;
		maxWidth = 0.22F;
		maxHeight = 0.25F;
		maxHealthAgeable = 8.0D;
	}

	@Override
	public String tagEgg() {
		return "eggs_prosictodon";
	}

	@Override
	public ItemStack eggItemStack() {
		return new ItemStack(ItemEggsProsictodon.block, 1);
	}

	protected float getAISpeedLand() {
		float speedBase = 0.348F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		return speedBase;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraProsictodon> Prosictodon = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraProsictodon.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraProsictodon currentProsictodon : Prosictodon) {
				currentProsictodon.setRevengeTarget(ee);
			}
		}
		return super.attackEntityFrom(ds, i);
	}

	@Override
	public int getTalkInterval() {
		return 80;
	}

	@Override
	public float getEyeHeight()
	{
		return Math.max(super.getEyeHeight(), this.height * 1.05F);
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		if (!this.isPFAdult()) {
			return LepidodendronMod.PROSICTODON_LOOT_YOUNG;
		}
		return LepidodendronMod.PROSICTODON_LOOT;
	}

}