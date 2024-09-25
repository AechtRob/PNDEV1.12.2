
package net.lepidodendron.block;

import biomesoplenty.common.block.BlockBOPMud;
import net.lepidodendron.item.armor.ArmorInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBOPMudPF extends BlockBOPMud {

	public BlockBOPMudPF() {
		super();
	}

	@Override
	public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {

		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != ItemStack.EMPTY) {
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ArmorInit.RUBBER_BOOTS) {
					return;
				}
			}
		}

		//default BOP behaviour:
		entity.motionX *= 0.4;
		entity.motionZ *= 0.4;
	}

}
