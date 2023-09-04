
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.ai.DietString;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGlaurung extends EntityPrehistoricFloraWeigeltisaurus {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraGlaurung(World world) {
		super(world);
		setSize(0.3F, 0.3F);
		minWidth = 0.10F;
		maxWidth = 0.3F;
		maxHeight = 0.3F;
		maxHealthAgeable = 5.0D;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.BUG);
	}

	public static String getPeriod() {return "Permian";}

	//public static String getHabitat() {return "Gliding Reptile";}

	@Override
	public boolean placesNest() {
		return true;
	}

	@Override
	public boolean isNestMound() {
		return true;
	}

	@Override
	public float getAISpeedLand() {
		return 0.395F;
	}

	@Override
	public boolean testLay(World world, BlockPos pos) {
		return (
				this.nestBlockMatch(world, pos)
		);
	}

	@Override
	public boolean nestBlockMatch(World world, BlockPos pos) {
		boolean match = false;
		if (!match) {
			match = ((world.getBlockState(pos.down()).getMaterial() == Material.GROUND
					|| world.getBlockState(pos.down()).getMaterial() == Material.GRASS
					|| world.getBlockState(pos.down()).getMaterial() == Material.CLAY
					|| (world.getBlockState(pos.down()).getMaterial() == Material.SAND
					&& world.getBlockState(pos.down()).getBlock() != Blocks.GRAVEL))
					&& world.isAirBlock(pos));
		}
		return match;
	}

	@Nullable
	protected ResourceLocation getLootTable() {
		return LepidodendronMod.GLAURUNG_LOOT;
	}

}