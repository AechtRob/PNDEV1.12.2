
package net.lepidodendron.entity;

import net.lepidodendron.entity.base.EntityPrehistoricFloraNautiloidBase;
import net.minecraft.world.World;

public class EntityPrehistoricFloraSphooceras extends EntityPrehistoricFloraNautiloidBase {

	public EntityPrehistoricFloraSphooceras(World world)
	{
		super(world);
	}

	@Override
	protected float getAISpeedNautiloid() {
		return 0;
	}

	@Override
	public boolean isSmall() {
		return false;
	}

	@Override
	public String getTexture() {
		return null;
	}

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
		return 0;
	}

}

