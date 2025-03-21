
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeLeavesBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLophosoria extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lophosoria")
	public static final Block block = null;
	public BlockLophosoria(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lophosoria);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lophosoria"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lophosoria", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockLeaves.DECAYABLE, BlockLeaves.CHECK_DECAY).build());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:lophosoria", BlockLophosoria.block);
		OreDictionary.registerOre("plantPrehistoric", BlockLophosoria.block);
		OreDictionary.registerOre("plant", BlockLophosoria.block);
	}

	public static class BlockCustom extends SeedSporeLeavesBase implements IAdvancementGranter {
		public BlockCustom() {
			super();
			setTranslationKey("pf_lophosoria");
			setSoundType(SoundType.PLANT);
			setHardness(0.2F);
			setResistance(0.2F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(CHECK_DECAY, false).withProperty(DECAYABLE, false));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_LOPHOSORIA;
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
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
		public BlockPlanks.EnumType getWoodType(int meta) {
			return null;
		}

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(BlockLophosoria.block, (int) (1)));
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{CHECK_DECAY, DECAYABLE});
		}

		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(DECAYABLE, (meta & 1) != 0).withProperty(CHECK_DECAY, (meta & 2) != 0);
		}

		public int getMetaFromState(IBlockState state) {
			int i = 0;
			if (!(Boolean) state.getValue(DECAYABLE))
				i |= 1;
			if ((Boolean) state.getValue(CHECK_DECAY))
				i |= 2;
			return i;
		}

		@SideOnly(Side.CLIENT)
		@Override
    	public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
		
		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 30;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.FOLIAGE;
		}

		@Override
		protected int getSaplingDropChance(IBlockState state) {
			return 1;
		}

		@Override
		public Item getItemDropped(IBlockState state, java.util.Random rand, int fortune) {
			if (LepidodendronConfig.doPropagation) {
				// Drop air and use the seeds method instead:
				return new ItemStack(Blocks.AIR, (int) (1)).getItem();
			}
			else {
				return Item.getItemFromBlock(BlockLophosoria.block);
			}
		}

		public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos) {
        	return false;
    	}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return true;
	    }

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);

			if (world.isAirBlock(pos.down())) {
				world.destroyBlock(pos, false);
				if ((Math.random() > 0.66) && (!LepidodendronConfig.doPropagation)) {
					//Spawn another sapling:
					if (!world.isRemote) {
						EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockLophosoria.block, (int) (1)));
						entityToSpawn.setPickupDelay(10);
						world.spawnEntity(entityToSpawn);
					}
				}
			}
			else {
				Block blockU = world.getBlockState(pos.up()).getBlock();
				if (blockU != BlockLophosoriaCentre.block) {
					world.setBlockToAir(pos);
	
					if ((Math.random() > 0.66) && (!LepidodendronConfig.doPropagation)) {
						//Spawn another sapling:
						if (!world.isRemote) {
							EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(BlockLophosoria.block, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							world.spawnEntity(entityToSpawn);
						}
					}
				}

			}
			
		}
		
		@Override
		public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
			boolean flag = true;
			for (int y = 1; y <= 2; y++) {
				for (int x = -1; x <= 1; x++) {
					for (int z = -1; z <= 1; z++) {
						if ((!(y == 2 && x == -1 && z == -1)) && (!(y == 2 && x == 1 && z == -1))) {
							if (!worldIn.getBlockState(pos.add(x, y, z)).getBlock().isReplaceable(worldIn, pos.add(x, y, z))) {
								flag = false;
								break;
							}
						}
					}
				}
			}
	        return super.canPlaceBlockAt(worldIn, pos) && flag;
	    }

	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {

			if (world.isRemote) {
				super.onBlockAdded(world, pos, state);
				return;
			}
			//Place the top as a structure so it doesn't decay whilst being placed!
			Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
					new ResourceLocation("lepidodendron", "lophosoria_top"));
			if (template == null)
				return;
			IBlockState iblockstate = world.getBlockState(pos.north().west().up());
			world.notifyBlockUpdate(pos.north().west().up(), iblockstate, iblockstate, 3);
			template.addBlocksToWorldChunk(world, pos.north().west().up(), new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
					.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(true).setIgnoreEntities(true));

//			world.setBlockState(pos.up(), BlockLophosoriaCentre.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().north(), BlockLophosoriaCentreNorth.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().east(), BlockLophosoriaCentreEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().south(), BlockLophosoriaCentreSouth.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().west(), BlockLophosoriaCentreWest.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().north().east(), BlockLophosoriaCentreNorthEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().south().east(), BlockLophosoriaCentreSouthEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().south().west(), BlockLophosoriaCentreSouthWest.block.getDefaultState(), 3);
//			world.setBlockState(pos.up().north().west(), BlockLophosoriaCentreNorthWest.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2), BlockLophosoriaTop.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).north(), BlockLophosoriaTopNorth.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).east(), BlockLophosoriaTopEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).south(), BlockLophosoriaTopSouth.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).west(), BlockLophosoriaTopWest.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).north().east(), BlockLophosoriaTopNorthEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).south().east(), BlockLophosoriaTopSouthEast.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).south().west(), BlockLophosoriaTopSouthWest.block.getDefaultState(), 3);
//			world.setBlockState(pos.up(2).north().west(), BlockLophosoriaTopNorthWest.block.getDefaultState(), 3);
			super.onBlockAdded(world, pos, state);
	    }

	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Fern");
	        tooltip.add("Periods: Cretaceous - Paleogene  - Neogene - Pleistocene [- present]");
	        tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public boolean canBeReplacedByLeaves(IBlockState state, IBlockAccess world, BlockPos pos)
	    {
	        return true;
	    }

		@Override
		public Block planted() {
			return BlockLophosoria.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}
	}
}