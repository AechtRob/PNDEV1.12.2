
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.render.entity.RenderEosimops;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class EntityPrehistoricFloraEosimops extends EntityPrehistoricFloraDiictodon {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;

	public EntityPrehistoricFloraEosimops(World world) {
		super(world);
		setSize(0.25F, 0.30F);
		minWidth = 0.10F;
		maxWidth = 0.25F;
		maxHeight = 0.30F;
		maxHealthAgeable = 8.0D;
	}

	protected float getAISpeedLand() {
		float speedBase = 0.318F;
		if (this.getTicks() < 0) {
			return 0.0F; //Is laying eggs
		}
		if (this.getIsFast()) {
			speedBase = speedBase * 1.25F;
		}
		if (this.getAnimation() == DRINK_ANIMATION || this.getAnimation() == MAKE_NEST_ANIMATION) {
			return 0.0F;
		}
		return speedBase;
	}

	@Override
	public boolean attackEntityFrom(DamageSource ds, float i) {
		Entity e = ds.getTrueSource();
		if (e instanceof EntityLivingBase) {
			EntityLivingBase ee = (EntityLivingBase) e;
			List<EntityPrehistoricFloraEosimops> Eosimops = this.world.getEntitiesWithinAABB(EntityPrehistoricFloraEosimops.class, new AxisAlignedBB(this.getPosition().add(-8, -4, -8), this.getPosition().add(8, 4, 8)));
			for (EntityPrehistoricFloraEosimops currentEosimops : Eosimops) {
				currentEosimops.setRevengeTarget(ee);
				currentEosimops.screamAlarmCooldown = rand.nextInt(20);
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
			return LepidodendronMod.EOSIMOPS_LOOT_YOUNG;
		}
		return LepidodendronMod.EOSIMOPS_LOOT;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {
		return RenderEosimops.TEXTURE;
	}
}