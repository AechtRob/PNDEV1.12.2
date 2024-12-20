
package net.lepidodendron.block;

import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.tileentity.TileEntityPortalBlock;
import net.lepidodendron.util.BlockSounds;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class BlockPortalBlock extends Block {

	public static final PropertyBool ACTIVE = PropertyBool.create("active");

	public BlockPortalBlock() {
		super(Material.IRON, MapColor.TNT);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 1);
		setHardness(25F);
		setResistance(1200F);
		setLightLevel(0F);
		setLightOpacity(0);
		setCreativeTab(TabLepidodendronBuilding.tab);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return 0;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState();
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {ACTIVE});
	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if (tileEntity != null)
			if (tileEntity instanceof TileEntityPortalBlock) {
				return state.withProperty(ACTIVE, ((TileEntityPortalBlock)tileEntity).getIsActive() && ((TileEntityPortalBlock)tileEntity).getAnimationTick() >= 90);
			}
		return state;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Nullable
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityPortalBlock();
	}

	public TileEntityPortalBlock createNewTileEntity(World worldIn, int meta) {
		return new TileEntityPortalBlock();
	}

	@Override
	public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
		super.eventReceived(state, worldIn, pos, eventID, eventParam);
		TileEntity tileentity = worldIn.getTileEntity(pos);
		return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state) {
		world.removeTileEntity(pos);
		super.breakBlock(world, pos, state);
	}

	public static void setPortalAsActive(World world, BlockPos pos, boolean isActive, int ticks) {
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity != null) {
			if (tileEntity instanceof TileEntityPortalBlock) {
				((TileEntityPortalBlock)tileEntity).setIsActive(isActive);
				((TileEntityPortalBlock)tileEntity).setAnimationTick(ticks);
			}
		}
	}

	public static void setPortalAnimation(World world, BlockPos pos, boolean xx) {
		if (xx) {
			for (int x = -1; x <= 1; x++) {
				for (int y = -1; y <= 1; y++) {
					TileEntity tileEntity = world.getTileEntity(pos.add(x, y, 0));
					if (tileEntity instanceof TileEntityPortalBlock) {
						((TileEntityPortalBlock) tileEntity).setIsActive(true);
						((TileEntityPortalBlock) tileEntity).setAnimationTick(0);
					}
				}
			}
		}
		else {
			for (int z = -1; z <= 1; z++) {
				for (int y = -1; y <= 1; y++) {
					TileEntity tileEntity = world.getTileEntity(pos.add(0, y, z));
					if (tileEntity instanceof TileEntityPortalBlock) {
						((TileEntityPortalBlock) tileEntity).setIsActive(true);
						((TileEntityPortalBlock) tileEntity).setAnimationTick(0);
					}
				}
			}
		}
	}

	public static void unsetPortalAnimation(World world, BlockPos pos, boolean xx) {
		if (xx) {
			for (int x = -1; x <= 1; x++) {
				for (int y = -1; y <= 1; y++) {
					TileEntity tileEntity = world.getTileEntity(pos.add(x, y, 0));
					if (tileEntity instanceof TileEntityPortalBlock) {
						((TileEntityPortalBlock) tileEntity).setIsActive(false);
						world.playSound(null, pos, BlockSounds.PORTAL_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
					}
				}
			}
		}
		else {
			for (int z = -1; z <= 1; z++) {
				for (int y = -1; y <= 1; y++) {
					TileEntity tileEntity = world.getTileEntity(pos.add(0, y, z));
					if (tileEntity instanceof TileEntityPortalBlock) {
						((TileEntityPortalBlock) tileEntity).setIsActive(false);
						world.playSound(null, pos, BlockSounds.PORTAL_CLOSE, SoundCategory.BLOCKS, 1.0F, 1.0F);
					}
				}
			}
		}
	}

}

