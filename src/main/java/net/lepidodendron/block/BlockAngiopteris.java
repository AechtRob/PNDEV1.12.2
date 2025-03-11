
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.block.base.SeedSporeBushBase;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAngiopteris extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:angiopteris")
	public static final Block block = null;
	public BlockAngiopteris(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.angiopteris);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:angiopteris", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		GameRegistry.registerTileEntity(BlockAngiopteris.TileEntityAngiopteris.class, "lepidodendron:tileentityangiopteris");
		OreDictionary.registerOre("plantdnaPNlepidodendron:angiopteris", BlockAngiopteris.block);
		OreDictionary.registerOre("plantPrehistoric", BlockAngiopteris.block);
		OreDictionary.registerOre("plant", BlockAngiopteris.block);
	}


	public static class BlockCustomFlower extends SeedSporeBushBase implements ITileEntityProvider, IAdvancementGranter {
		public BlockCustomFlower() {
			super(Material.PLANTS);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronPlants.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_angiopteris");
			setRegistryName("angiopteris");
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			return new AxisAlignedBB(-0.5D, 0D, -0.5D, 1.5D, 2.0D, 1.5D);
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_ANGIOPTERIS;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			if (!LepidodendronConfig.doPropagation) {
				drops.add(new ItemStack(this));
				if (Math.random()>0.66) {
					drops.add(new ItemStack(this));
				}
			}
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(Item.getItemFromBlock(this), 1, this.damageDropped(state));
		}

		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}
		
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Fern plant");
	        	tooltip.add("Periods: Carboniferous [- Permian] - Triassic - Jurassic - Early Cretaceous - Late Cretaceous - Paleogene - Neogene - Pleistocene [- present]");
	        	tooltip.add("Propagation: spores");}
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
	    public EnumOffsetType getOffsetType()
	    {
	        return EnumOffsetType.XZ;
	    }

		@Override
		public Block planted() {
			return BlockAngiopteris.block;
		}

		@Override
		public int offsetY() {
			return 1;
		}

		@Override
		public Item blockItem() {
			return null;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockAngiopteris.TileEntityAngiopteris();
		}

		public BlockAngiopteris.TileEntityAngiopteris createNewTileEntity(World worldIn, int meta) {
			return new BlockAngiopteris.TileEntityAngiopteris();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}
	}

	public static class TileEntityAngiopteris extends TileEntity {

		@Override
		public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate)
		{
			return (oldState.getBlock() != newSate.getBlock());
		}

		@Override
		public SPacketUpdateTileEntity getUpdatePacket() {
			return new SPacketUpdateTileEntity(this.pos, 0, this.getUpdateTag());
		}

		@Override
		public NBTTagCompound getUpdateTag() {
			return this.writeToNBT(new NBTTagCompound());
		}

		@Override
		public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
			this.readFromNBT(pkt.getNbtCompound());
		}

		@Override
		public void handleUpdateTag(NBTTagCompound tag) {
			this.readFromNBT(tag);
		}

		@Override
		public AxisAlignedBB getRenderBoundingBox() {
			return new AxisAlignedBB(pos.north(7).west(7), pos.add(8, 5, 8));
			//return INFINITE_EXTENT_AABB;
		}

	}
	
}

