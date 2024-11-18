
package net.lepidodendron.tileentity;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.BlockPortalBlock;
import net.lepidodendron.util.BlockSounds;
import net.lepidodendron.util.Functions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TileEntityPortalBlock extends TileEntity implements ITickable {

	private int animationTick;
	private boolean isActive;

	@Override
	public void update()
	{

		if (this.isActive) {
			//Are we part of a valid portal?
			IBlockState portalCarboniferous = Functions.getPortalState(LepidodendronConfig.dimCarboniferous);
			if (portalCarboniferous != null) {
				boolean xChecked = false;
				if (this.world.getBlockState(this.getPos().east()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().east()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().east().up()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().east().up()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().east().down()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().east().down()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().west()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().west()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().west().up()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().west().up()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().west().down()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().west().down()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.X) {
						xChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().up()).getBlock() == portalCarboniferous.getBlock()) {
					xChecked = true;
				}
				else if (this.world.getBlockState(this.getPos().down()).getBlock() == portalCarboniferous.getBlock()) {
					xChecked = true;
				}

				boolean zChecked = false;
				if (this.world.getBlockState(this.getPos().north()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().north()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().north().up()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().north().up()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().north().down()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().north().down()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().south()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().south()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().south().up()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().south().up()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().south().down()).getBlock() == portalCarboniferous.getBlock()) {
					if (this.world.getBlockState(this.getPos().south().down()).getValue(BlockPortal.AXIS) == EnumFacing.Axis.Z) {
						zChecked = true;
					}
				}
				else if (this.world.getBlockState(this.getPos().up()).getBlock() == portalCarboniferous.getBlock()) {
					zChecked = true;
				}
				else if (this.world.getBlockState(this.getPos().down()).getBlock() == portalCarboniferous.getBlock()) {
					zChecked = true;
				}
				if ((!xChecked) & (!zChecked)) {
					this.setIsActive(false);
				}
			}

			if (this.animationTick <= 90) { //4++ seconds
				setAnimationTick(this.animationTick + 1);
				if (this.getAnimationTick() == 1) {
					world.playSound(null, pos, BlockSounds.PORTAL_INITIALISE, SoundCategory.BLOCKS, 1.0F, 1.0F);
				}
				if (this.animationTick == 8) {
					world.playSound(null, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, SoundEvents.ENTITY_PAINTING_PLACE, SoundCategory.BLOCKS, 0.65F, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7F);
					for (int i = 0; i < 5; i++) {
						IBlockState state = world.getBlockState(pos);
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.5D, this.pos.getY() + 1D, this.pos.getZ() + 0.25D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), 0.15D + world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.5D, this.pos.getY() + 1D, this.pos.getZ() + 0.75D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), 0.15D + world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));

						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 1.0D, this.pos.getY() + 0.25D, this.pos.getZ() + 0.5D, 0.15 + world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 1.0D, this.pos.getY() + 0.75D, this.pos.getZ() + 0.5D, 0.15 + world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));

						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX(), this.pos.getY() + 0.25D, this.pos.getZ() + 0.5D, -(0.15 + world.rand.nextDouble() * 0.075), world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX(), this.pos.getY() + 0.75D, this.pos.getZ() + 0.5D, -(0.15 + world.rand.nextDouble() * 0.075), world.rand.nextDouble() * 0.075, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));

						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.25D, this.pos.getY() + 0.5D, this.pos.getZ() + 1.0D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), world.rand.nextDouble() * 0.075, 0.15 + world.rand.nextDouble() * 0.075, Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.75D, this.pos.getY() + 0.5D, this.pos.getZ() + 1.0D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), world.rand.nextDouble() * 0.075, 0.15 + world.rand.nextDouble() * 0.075, Block.getStateId(state));

						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.25D, this.pos.getY() + 0.5D, this.pos.getZ(), world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), world.rand.nextDouble() * 0.075, -(0.15 + world.rand.nextDouble() * 0.075), Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.75D, this.pos.getY() + 0.5D, this.pos.getZ(), world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), world.rand.nextDouble() * 0.075, -(0.15 + world.rand.nextDouble() * 0.075), Block.getStateId(state));

						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.5D, this.pos.getY(), this.pos.getZ() + 0.25D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), -(0.05D + world.rand.nextDouble() * 0.025), world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));
						world.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.pos.getX() + 0.5D, this.pos.getY(), this.pos.getZ() + 0.75D, world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), -(0.05D + world.rand.nextDouble() * 0.025), world.rand.nextDouble() * 0.075 * (world.rand.nextInt(3) - 1), Block.getStateId(state));

					}
				}
			}
			if (this.animationTick > 90) {
				setAnimationTick(90);
			}
		}
		else {
			if (this.animationTick > 0) { //4++ seconds
				--this.animationTick;
			}
			if (this.animationTick < 0) {
				this.animationTick = 0;
			}
		}
	}

	public boolean isFaceActive(World world, BlockPos pos, EnumFacing face) {
		return world.getBlockState(pos.offset(face)).getBlockFaceShape(world, pos.offset(face), face.getOpposite()) != BlockFaceShape.SOLID
			&& (!(world.getBlockState(pos.offset(face)) instanceof BlockPortalBlock));
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox() {
		//return new AxisAlignedBB(pos, pos.add(2, 2, 2));
		return INFINITE_EXTENT_AABB;
	}

	public int getAnimationTick() {
		return this.animationTick;
	}

	public void setAnimationTick(int tick) {
		this.animationTick = tick;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean active) {
		this.isActive = active;
	}

	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		NBTTagCompound tag = new NBTTagCompound();
		this.writeToNBT(tag);
		return new SPacketUpdateTileEntity(pos, 1, tag);
	}

	@Override
	public void onDataPacket(NetworkManager netManager, SPacketUpdateTileEntity packet) {
		readFromNBT(packet.getNbtCompound());
	}

	@Override
	public NBTTagCompound getUpdateTag() {
		return this.writeToNBT(new NBTTagCompound());
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		this.readFromNBT(tag);
	}

	@Override
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		if (compound.hasKey("animationTick")) {
			this.animationTick = compound.getInteger("animationTick");
		}
		if (compound.hasKey("isActive")) {
			this.isActive = compound.getBoolean("isActive");
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("animationTick", this.animationTick);
		compound.setBoolean("isActive", this.isActive);
		return compound;
	}

}