
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGlaurung extends EntityPrehistoricFloraWeigeltisaurus {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraGlaurung(World world) {
		super(world);
		experienceValue = 0;
		this.isImmuneToFire = false;
		minWidth = 0.10F;
		maxWidth = 0.69F;
		maxHeight = 0.4F;
		maxHealthAgeable = 5.0D;
		setNoAI(!true);
		enablePersistence();
	}

	public static String getPeriod() {return "Permian";}

	public static String getHabitat() {return "Gliding Reptile";}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	protected float getAISpeedLand() {
		return 0.395F;
	}

	@Override
	public boolean testLay(World world, BlockPos pos) {
		return (
				nestBlockMatch(world, pos)
		);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		boolean match = false;
		if (!match) {
			match = ((world.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					&& world.isAirBlock(pos));
		}
		return match;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.GLAURUNG_LOOT;
	}

}