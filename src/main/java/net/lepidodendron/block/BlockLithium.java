
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLithium extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lithium_block")
	public static final Block block = null;
	public BlockLithium(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lithium_block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lithium_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lithium_block", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_lithium_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
		}



		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			if ((world.getBlockState(pos.up()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.down()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.north()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.south()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.east()).getMaterial() == Material.WATER
					|| world.getBlockState(pos.west()).getMaterial() == Material.WATER
					))
			{
				sizzle(world, pos, random);
			}
			else if (world.isRaining()
					&& world.getBiome(pos).canRain()
					&& world.getRainStrength(1.0F) > 0
					&& world.getBiomeProvider().getTemperatureAtHeight(world.getBiome(pos).getTemperature(pos), pos.getY()) >= 0.15F
			) {
				int yy = pos.getY() + 1;
				boolean isBlocked = false;
				while (!isBlocked && yy < 255) {
					BlockPos posCheck = new BlockPos(pos.getX(), yy, pos.getZ());
					IBlockState stateCheck = world.getBlockState(posCheck);
					if (stateCheck.getBlock().isOpaqueCube(stateCheck)) {
						isBlocked = true;
					}
					if (stateCheck.getBlock().isFullBlock(stateCheck)) {
						isBlocked = true;
					}
					if (stateCheck.getMaterial().blocksMovement()) {
						isBlocked = true;
					}
					if (world.isAirBlock(posCheck)) {
						yy ++;
						isBlocked = false;
						continue;
					}
					if (stateCheck.getBlock().isPassable(world, posCheck)){
						yy ++;
						isBlocked = false;
						continue;
					}
					AxisAlignedBB aabb = stateCheck.getBlock().getCollisionBoundingBox(stateCheck, world, posCheck);
					if (aabb.intersects(new AxisAlignedBB(0,0,0,1,1,1))) {
						isBlocked = true;
					}
				}
				if (!isBlocked) {
					sizzle(world, pos, random);
				}
			}
		}

		@SideOnly(Side.CLIENT)
		public static void sizzle(World world, BlockPos pos, Random random) {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			int i = x;
			int j = y;
			int k = z;

			for (int l = 0; l < 5; ++l) {
				double d0 = (i + random.nextFloat());
				double d1 = (j + random.nextFloat());
				double d2 = (k + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
				double d4 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
				double d5 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
				world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, d3, d4, d5);
			}
			for (int l = 0; l < 3; ++l) {
				double d0 = (i + random.nextFloat());
				double d1 = (j + random.nextFloat());
				double d2 = (k + random.nextFloat());
				int i1 = random.nextInt(2) * 2 - 1;
				double d3 = (random.nextFloat() - 0.5D) * 0.04999999985098839D;
				double d4 = (random.nextFloat() - 0.5D) * 0.02999999985098839D;
				double d5 = (random.nextFloat() - 0.5D) * 0.04999999985098839D;
				world.spawnParticle(EnumParticleTypes.FLAME, d0, d1, d2, d3, d4, d5);
			}
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getBlockState(pos.up()).getMaterial() == Material.WATER
					|| worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER
					|| worldIn.getBlockState(pos.north()).getMaterial() == Material.WATER
					|| worldIn.getBlockState(pos.south()).getMaterial() == Material.WATER
					|| worldIn.getBlockState(pos.east()).getMaterial() == Material.WATER
					|| worldIn.getBlockState(pos.west()).getMaterial() == Material.WATER) {
				worldIn.destroyBlock(pos, false);
				worldIn.playSound(null, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS, 0.65F, (1.0F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.2F) * 0.7F);
				LepidodendronMod.PACKET_HANDLER.sendToAll(new BlockTimeResearcherFinderBottom.ParticlePacket(pos.getX(), pos.getY() - 1, pos.getZ()));
			}
			else {
				if (worldIn.isRaining()
						&& worldIn.getBiome(pos).canRain()
						&& worldIn.getRainStrength(1.0F) > 0
						&& worldIn.getBiomeProvider().getTemperatureAtHeight(worldIn.getBiome(pos).getTemperature(pos), pos.getY()) >= 0.15F) {
					int yy = pos.getY() + 1;
					boolean isBlocked = false;
					while (!isBlocked && yy < 255) {
						BlockPos posCheck = new BlockPos(pos.getX(), yy, pos.getZ());
						IBlockState stateCheck = worldIn.getBlockState(posCheck);
						if (stateCheck.getBlock().isOpaqueCube(stateCheck)) {
							isBlocked = true;
						}
						if (stateCheck.getBlock().isFullBlock(stateCheck)) {
							isBlocked = true;
						}
						if (stateCheck.getMaterial().blocksMovement()) {
							isBlocked = true;
						}
						if (worldIn.isAirBlock(posCheck)) {
							yy++;
							isBlocked = false;
							continue;
						}
						if (stateCheck.getBlock().isPassable(worldIn, posCheck)) {
							yy++;
							isBlocked = false;
							continue;
						}
						AxisAlignedBB aabb = stateCheck.getBlock().getCollisionBoundingBox(stateCheck, worldIn, posCheck);
						if (aabb.intersects(new AxisAlignedBB(0, 0, 0, 1, 1, 1))) {
							isBlocked = true;
						}
					}
					if (!isBlocked) {
						worldIn.destroyBlock(pos, false);
						worldIn.playSound(null, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.BLOCKS, 0.65F, (1.0F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.2F) * 0.7F);
						LepidodendronMod.PACKET_HANDLER.sendToAll(new BlockTimeResearcherFinderBottom.ParticlePacket(pos.getX(), pos.getY() - 1, pos.getZ()));
					}
				}
			}
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.IRON;
		}
	}
}
