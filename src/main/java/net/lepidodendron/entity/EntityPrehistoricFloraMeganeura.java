
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockInsectEggsMeganeura;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraMeganeura extends EntityPrehistoricFloraMeganeuropsis {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	public double maxHealthAgeable;
	private Animation animation = NO_ANIMATION;
	public Animation ATTACK_ANIMATION;

	public EntityPrehistoricFloraMeganeura(World world) {
		super(world);
		setSize(1.0F, 0.42F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
		ATTACK_ANIMATION = Animation.create(this.getAttackLength());
	}

	public static String getPeriod() {
		return "Carboniferous";
	}

	public static String getHabitat() {
		return "Terrestrial";
	}

	@Override
	public IBlockState getEggBlockState() {
		return BlockInsectEggsMeganeura.block.getDefaultState();
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		//return null;
		return LepidodendronMod.MEGANEURA_LOOT;
	}


}