
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.EntityPrehistoricFloraDragonflyNymph;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.item.ItemDragonflyEggsItem;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockInsectEggsDragonflyPlaceable extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:insect_eggs_dragonfly")
	public static final Block block = null;
	public BlockInsectEggsDragonflyPlaceable(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.insect_eggs_dragonfly);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("insect_eggs_dragonfly"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(BlockInsectEggsDragonflyPlaceable.TileEntityCustom.class, "lepidodendron:tileentityinsect_eggs_dragonfly");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:insect_eggs_dragonfly", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockInsectEggsDragonflyPlaceable.BlockCustom.LEVEL).build());
	}

	public static class BlockCustom extends BlockMobSpawn {
		public BlockCustom() {
			setTranslationKey("pf_insect_eggs_dragonfly");
			this.setTickRandomly(true);
			setCreativeTab(null);
		}

		@Override
		public void breakBlock(World world, BlockPos pos, IBlockState state) {
			world.removeTileEntity(pos);
			super.breakBlock(world, pos, state);
		}

		@Override
		public boolean hasTileEntity(IBlockState state) {
			return true;
		}

		@Nullable
		@Override
		public TileEntity createTileEntity(World world, IBlockState state) {
			return new BlockInsectEggsDragonflyPlaceable.TileEntityCustom();
		}

		public BlockInsectEggsDragonflyPlaceable.TileEntityCustom createNewTileEntity(World worldIn, int meta) {
			return new BlockInsectEggsDragonflyPlaceable.TileEntityCustom();
		}

		@Override
		public boolean eventReceived(IBlockState state, World worldIn, BlockPos pos, int eventID, int eventParam) {
			super.eventReceived(state, worldIn, pos, eventID, eventParam);
			TileEntity tileentity = worldIn.getTileEntity(pos);
			return tileentity == null ? false : tileentity.receiveClientEvent(eventID, eventParam);
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			ItemStack stack = new ItemStack(ItemDragonflyEggsItem.block, (int) (1));
			NBTTagCompound variantNBT = new NBTTagCompound();
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				if (tileentity.getTileData() != null) {
					if (tileentity.getTileData().hasKey("PNType")) {
						variantNBT.setString("PNType", tileentity.getTileData().getString("PNType"));
						stack.setTagCompound(variantNBT);
						return stack;
					}
				}
			}
			return new ItemStack(Items.AIR, (int) (1));
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {

			if (!(worldIn.isRemote)) {
				if (this.getVariantID(worldIn, pos).equalsIgnoreCase("")) {
					EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraDragonflyNymph.class).toString(), "{AgeTicks:1}", pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
				} else {
					EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraDragonflyNymph.class).toString() + "@" + this.getVariantID(worldIn, pos), "{AgeTicks:1}", pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
				}
				//EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraDragonflyNymph.class).toString(), "{AgeTicks:1}", (double)pos.getX() , (double)pos.getY(), (double)pos.getZ());
				worldIn.destroyBlock(pos, false);
			}

			super.updateTick(worldIn, pos, state, rand);
		}

		public String getVariantID(World world, BlockPos pos) {
			TileEntity tileentity = world.getTileEntity(pos);
			if (tileentity != null) {
				if (tileentity.getTileData() != null) {
					if (tileentity.getTileData().hasKey("PNType")) {
						return tileentity.getTileData().getString("PNType");
					}
				}
			}
			return "";
		}

		/*@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: " + EntityPrehistoricFloraDragonflyNymph.getHabitat() + " Insect");
				tooltip.add("Periods: " + EntityPrehistoricFloraDragonflyNymph.getPeriod());
				tooltip.add("Habitat: Eggs and nymphs in water; adults fly");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}*/

	}

	public static class TileEntityCustom extends TileEntity {

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

	}
}