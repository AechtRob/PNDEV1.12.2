
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockNelumbo extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:nelumbo")
	public static final Block block = null;
	public BlockNelumbo(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.nelumbo);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("nelumbo"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:nelumbo", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockNelumbo.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_nelumbo");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(0);
			setTickRandomly(true);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
	    }

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState();
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL});
	    }
	    
		@Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    @SideOnly(Side.CLIENT)
	    @Override
	    public BlockRenderLayer getRenderLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    @Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing facing)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	
	    	int colWater;
	    	
	    	colWater = 1; //North
	    	if (isWaterBlock(world, pos.north())) {
		    	while (colWater < 6 && isWaterBlock(world, pos.north().up(colWater))) {
		    		//Check the water column and place stems, and then leaves, accordingly:
		    		if (isWaterBlock(world, pos.north().up(colWater + 1)))
		    		{
		    			world.setBlockState(pos.north().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
		    		}
		    		colWater = colWater + 1;
		    	}
		    	if (canLeavesPlaceAt(world, pos.north().up(colWater))) {
		    		world.setBlockState(pos.north().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
		    	}
	    	}

	    	colWater = 1; //South
	    	if (isWaterBlock(world, pos.south())) {
		    	while (colWater < 6 && isWaterBlock(world, pos.south().up(colWater))) {
		    		//Check the water column and place stems, and then leaves, accordingly:
		    		if (isWaterBlock(world, pos.south().up(colWater + 1)))
		    		{
		    			world.setBlockState(pos.south().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
		    		}
		    		colWater = colWater + 1;
		    	}
		    	if (canLeavesPlaceAt(world, pos.south().up(colWater))) {
		    		world.setBlockState(pos.south().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
		    	}
	    	}

	    	colWater = 1; //East
	    	if (isWaterBlock(world, pos.east())) {
		    	while (colWater < 6 && isWaterBlock(world, pos.east().up(colWater))) {
		    		//Check the water column and place stems, and then leaves, accordingly:
		    		if (isWaterBlock(world, pos.east().up(colWater + 1)))
		    		{
		    			world.setBlockState(pos.east().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
		    		}
		    		colWater = colWater + 1;
		    	}
		    	if (canLeavesPlaceAt(world, pos.east().up(colWater))) {
		    		world.setBlockState(pos.east().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
		    	}
	    	}

	    	colWater = 1; //West
	    	if (isWaterBlock(world, pos.west())) {
		    	while (colWater < 6 && isWaterBlock(world, pos.west().up(colWater))) {
		    		//Check the water column and place stems, and then leaves, accordingly:
		    		if (isWaterBlock(world, pos.west().up(colWater + 1)))
		    		{
		    			world.setBlockState(pos.west().up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
		    		}
		    		colWater = colWater + 1;
		    	}
		    	if (canLeavesPlaceAt(world, pos.west().up(colWater))) {
		    		world.setBlockState(pos.west().up(colWater), BlockNelumboLeaves.block.getDefaultState(), 3);
		    	}
	    	}

			super.onBlockAdded(world, pos, state);
	    }

	    public boolean canLeavesPlaceAt(World worldIn, BlockPos pos) {
	    	IBlockState iblockstate1 = worldIn.getBlockState(pos.down());
			if (!isWaterBlock(worldIn, pos.down()))
	    	{
	    		return false;
	    	}
	    	if (!worldIn.isAirBlock(pos)) 
	    	{
	    		return false;
	    	}
			if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockNelumboStem.block) {
				return true;
			}
	    	if ((worldIn.getBlockState(pos.down(2).east()).getBlock() != BlockNelumbo.block) 
	    		&& (worldIn.getBlockState(pos.down(2).west()).getBlock() != BlockNelumbo.block)
	    		&& (worldIn.getBlockState(pos.down(2).north()).getBlock() != BlockNelumbo.block)
	    		&& (worldIn.getBlockState(pos.down(2).south()).getBlock() != BlockNelumbo.block))
	    	{
	    		return false;
	    	}

	    	return true;
	    	 
	    }

	    public boolean canFlowerPlaceAt(World worldIn, BlockPos pos) {
	    	IBlockState iblockstate1 = worldIn.getBlockState(pos.down());
			if (!isWaterBlock(worldIn, pos.down()))
	    	{
	    		return false;
	    	}
	    	if (!worldIn.isAirBlock(pos) || !worldIn.isAirBlock(pos.up())
	    		|| !worldIn.canSeeSky(pos))
	    	{
	    		return false;
	    	}
			if (worldIn.getBlockState(pos.down(2)).getBlock() == BlockNelumboStem.block) {
				return true;
			}
	    	if (worldIn.getBlockState(pos.down(2)).getBlock() != BlockNelumbo.block) 
	    	{
	    		return false;
	    	}

	    	return true;
	    	 
	    }

	    public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				//}
			}
	    	return false;
	    }

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Force ticks of any stems around it:
			worldIn.scheduleUpdate(pos.north().up(), BlockNelumboStem.block, 1);
			worldIn.scheduleUpdate(pos.south().up(), BlockNelumboStem.block, 1);
			worldIn.scheduleUpdate(pos.east().up(), BlockNelumboStem.block, 1);
			worldIn.scheduleUpdate(pos.west().up(), BlockNelumboStem.block, 1);
			worldIn.scheduleUpdate(pos.up(), BlockNelumboStem.block, 1);
			
			worldIn.scheduleUpdate(pos.north().up(2), BlockNelumboLeaves.block, 1);
			worldIn.scheduleUpdate(pos.south().up(2), BlockNelumboLeaves.block, 1);
			worldIn.scheduleUpdate(pos.east().up(2), BlockNelumboLeaves.block, 1);
			worldIn.scheduleUpdate(pos.west().up(2), BlockNelumboLeaves.block, 1);
			worldIn.scheduleUpdate(pos.up(2), BlockNelumboBud.block, 1);
			worldIn.scheduleUpdate(pos.up(2), BlockNelumboFlower.block, 1);

			//Chance of a second drop:
			if (Math.random() >= 0.7 && !LepidodendronConfig.doPropagation) {
				if (!worldIn.isRemote) {
					EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					worldIn.spawnEntity(entityToSpawn);
				}
			}
	    	
	    	super.breakBlock(worldIn, pos, state);
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
	        if (!isWaterBlock(worldIn, pos.up()) || !isWaterBlock(worldIn, pos)) {
	        	return false;
	        }

			int colWater = 1;
			boolean isAir = false;
	    	while (colWater < 6 && isWaterBlock(worldIn, pos.up(colWater))) {
	    		//Check the water column:
	    		if (worldIn.isAirBlock(pos.up(colWater + 1))
	    			|| worldIn.getBlockState(pos.up(colWater + 1)).getMaterial() == Material.ICE
					|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock().isReplaceable(worldIn, pos.up(colWater + 1))
	    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockNelumboBud.block
	    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockNelumboFlower.block
	    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockNelumboFlowerPlaceable.block)
	    		{
	    			isAir = true;
	    		}
	    		colWater = colWater + 1;
	    	}
	    	if (!isAir) {return false;}
	        
	        return super.canPlaceBlockAt(worldIn, pos);
	    }

	    @Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
			if ((!this.canPlaceBlockAt(world, pos))
				|| ((world.getBlockState(pos.down()).getMaterial() != Material.SAND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.CLAY)
				)) {
				world.destroyBlock(pos, true);
			}
			else {
				this.onBlockAdded(world, pos, state);
				//Do a flower?
				if ((Math.random() > 0.6) && (Math.random() > 0.6) && (world.getBlockState(pos.up(2)).getBlock() != BlockNelumboFlower.block) 
			    	&& (world.getBlockState(pos.up(2)).getBlock() != BlockNelumboBud.block)) {
					int colWater = 1;
			    	while (colWater < 6 && isWaterBlock(world, pos.up(colWater))) {
			    		//Check the water column and place stems, and then bud/flower, accordingly:
			    		if (isWaterBlock(world, pos.up(colWater + 1)))
			    		{
			    			world.setBlockState(pos.up(colWater), BlockNelumboStem.block.getDefaultState(), 3);
			    		}
			    		colWater = colWater + 1;
			    	}
			    	if (canFlowerPlaceAt(world, pos.up(colWater))) {
			    		if ((world.getBlockState(pos.up(colWater)).getBlock() != BlockNelumboFlower.block) 
			    			&& (world.getBlockState(pos.up(colWater)).getBlock() != BlockNelumboBud.block
			    			&& world.getBlockState(pos.up(colWater)).getBlock() != BlockNelumboFlowerPlaceable.block))
			    		{
							world.setBlockState(pos.up(colWater), BlockNelumboBud.block.getDefaultState(), 3);
			    		}
			    	}
				}
			}
		}

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if ((!this.canPlaceBlockAt(world, pos))
				|| ((world.getBlockState(pos.down()).getMaterial() != Material.SAND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.GROUND)
				&& (world.getBlockState(pos.down()).getMaterial() != Material.CLAY)
				)) {
				world.destroyBlock(pos, true);
			}
		}

		 @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Flowering water plant");
	        tooltip.add("Periods: Cretaceous - Paleogene - Neogene - Quaternary");
	        tooltip.add("Note: planted under water");
	        tooltip.add("Propagation: flowers");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

	}
}
