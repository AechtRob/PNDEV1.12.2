
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronBespokeSpawner;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemRespawner extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:respawner")
	public static final Item block = null;
	public ItemRespawner(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.respawner);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:respawner", "inventory"));
	}
	public static class ItemCustom extends ItemTool {
		public ItemCustom() {
			super(ToolMaterial.WOOD, null);
			setMaxDamage(500);
			maxStackSize = 64;
			setTranslationKey("pf_respawner");
			setRegistryName("respawner");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
		{
			return false;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			playerIn.swingArm(handIn);
			itemstack.damageItem(1, playerIn);

			//Get this chunk and the adjacent one:
			int chunkx = playerIn.chunkCoordX;
			int chunkz = playerIn.chunkCoordZ;
			int ii = (chunkx * 16) - 16;
			int jj = (chunkz * 16) - 16;
			int i = ii;
			int j = jj;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 8, 8, new Random());
			}

			i = ii + 16;
			j = jj;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii + 16;
			j = jj + 16;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii + 16;
			j = jj - 16;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii - 16;
			j = jj;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii - 16;
			j = jj + 16;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii - 16;
			j = jj - 16;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii + 16;
			j = jj;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			i = ii - 16;
			j = jj;
			if (worldIn.isBlockLoaded(new BlockPos(i, 0, j))) {
				boolean onlyWater = (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian);
				ChunkGenSpawner.executeProcedure(onlyWater, worldIn, new BlockPos(i, 0, j), worldIn.rand, null);
				LepidodendronBespokeSpawner.onMobRespawn(worldIn, new BlockPos(i, 0, j));
				Biome biome = worldIn.getBiome(new BlockPos(i, 0, j));
				WorldEntitySpawner.performWorldGenSpawning(worldIn, biome, i + 8, j + 8, 32, 32, new Random());
			}

			SoundEvent soundevent =(SoundEvent) SoundEvent.REGISTRY
					.getObject(new ResourceLocation("lepidodendron:respawner"));
			playerIn.getEntityWorld().playSound(playerIn, playerIn.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);

			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        tooltip.add("Encourages native mobs to respawn in the area");
	        super.addInformation(stack, player, tooltip, advanced);
	    }

		@Override
		public boolean isFull3D() {
			return true;
		}

	}
}
