
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.SeedSporeBushBase;
import net.lepidodendron.block.base.SeedSporeLeavesBase;
import net.lepidodendron.block.base.SeedSporeReedBase;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemSporeCollectionEnvelope extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:spore_collection_envelope")
	public static final Item block = null;
	public ItemSporeCollectionEnvelope(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.spore_collection_envelope);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:spore_collection_envelope", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_spore_collection_envelope");
			setRegistryName("spore_collection_envelope");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public String getTranslationKey(ItemStack stack) {
			String blockName;
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().getString("plant") != null) {
					return "envelope_" + stack;
				}
			}
			return super.getTranslationKey(stack);
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

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			ItemStack itemstack = player.getHeldItem(hand);

			if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				if (collectSpores(itemstack, worldIn, pos, player, hand))
				{
					return EnumActionResult.SUCCESS;
				}
			}
			return EnumActionResult.PASS;
		}

		public static boolean collectSpores(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
		{
			IBlockState iblockstate = worldIn.getBlockState(target);
			Block blockTarget = iblockstate.getBlock();
			String nbtBlock = "";

			if (!worldIn.isRemote) {
				boolean collected = false;
				EntityItem entityToSpawn = null;
				ItemStack spores = null;

				if (blockTarget instanceof SeedSporeBushBase) {
					SeedSporeBushBase blockEnvelope = (SeedSporeBushBase) blockTarget;
					nbtBlock = blockEnvelope.planted().getRegistryName().toString();
					collected = true;
				}
				else if (blockTarget instanceof SeedSporeLeavesBase) {
					SeedSporeLeavesBase blockEnvelope = (SeedSporeLeavesBase) blockTarget;
					nbtBlock = blockEnvelope.planted().getRegistryName().toString();
					collected = true;
				}
				 else if (blockTarget instanceof SeedSporeReedBase) {
					SeedSporeReedBase blockEnvelope = (SeedSporeReedBase) blockTarget;
					nbtBlock = blockEnvelope.planted().getRegistryName().toString();
					collected = true;
				}

				if (collected) {
					stack.shrink(1);
					spores = new ItemStack(ItemSporeCollectionEnvelope.block, (int) (1));
					spores.getTagCompound().setString("plant", nbtBlock);
					if (!player.isCreative()) {
						ItemHandlerHelper.giveItemToPlayer(player, spores);
					}

					return true;
				}
			}

			return false;
		}

	}

}
