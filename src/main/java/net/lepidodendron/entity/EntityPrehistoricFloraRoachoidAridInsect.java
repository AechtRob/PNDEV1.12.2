
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraRoachoidAridInsect extends EntityPrehistoricFloraArchoblattinaInsect {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public EntityPrehistoricFloraRoachoidAridInsect(World world) {
		super(world);
		setSize(0.18F, 0.145F);
		experienceValue = 0;
		this.isImmuneToFire = false;
		setNoAI(!true);
		enablePersistence();
	}

	public static String getPeriod() {return "Carboniferous - Permian - Triassic - Jurassic - Cretaceous - Paleogene - Neogene - Quaternary";}

	public static String getHabitat() {return "Terrestrial";}

	@Override
	public String tagEgg () {
		return "insect_eggs_roachoid_arid";
	}

	@Nullable
	protected ResourceLocation getLootTable() { return LepidodendronMod.BUG_LOOT;}

}

