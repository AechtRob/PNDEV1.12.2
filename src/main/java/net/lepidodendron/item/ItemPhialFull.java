
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPhialFull extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial")
	public static final Item block = null;
	public ItemPhialFull(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phial);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(block,
				new ModelResourceLocation("lepidodendron:entities/phial", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_acutiramus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_arthropleura", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_attercopus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_carcinosoma", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eoarthropleura", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eurypterus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_hibbertopterus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_jaekelopterus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_kokomopterus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_megarachne", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_mixopterus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pagea", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_perm", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pneumodesmus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pterygotus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_carb", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_dev", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_os", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_perm", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_amphibamus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_ichthyostega", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_limnoscelis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_megalocephalus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cladoselache", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_dracopristis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_hyneria", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_onychodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_rhizodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_xenacanthus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_spathicephalus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eryops", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_helicoprion", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pederpes", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_acanthostega", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_platyhystrix", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_archoblattina", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_roachoid_arid", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_gerarus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_roachoid_forest", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_roachoid_swamp", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_meganeuropsis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_proterogyrinus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_prionosuchus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_listracanthus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_edestus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pholiderpeton", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_acanthostomatops", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_kaibabvenator", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_kaibabvenator", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_saivodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_parhybodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_hybodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cobelodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_phlegethontia", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_antarcticarcinus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_crassigyrinus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_mastodonsaurus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_megalograptus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_harvestman", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_adelophthalmus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_meganeura", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_diplocaulus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_diploceraspis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cacops", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_dasyceps", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_dvinosaurus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_melosaurus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pantylus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_uranocentrodon", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_balanerpeton", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_barbclabornia", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_lebachacanthus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_orodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_protozygoptera", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeontinid", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tiktaalik", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_lonchidion", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_titanoptera", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_italophlebia", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_megactenopetalus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_branchiosaur", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_gerrothorax", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_whatcheeria", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_urocordylus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_fadenia_permotriassic", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_fadenia_carboniferous", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_barameda", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_metoposaurus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_parmastega", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_notidanoides", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_asteracanthus", "inventory")

			);

		ModelLoader.setCustomMeshDefinition(block, stack -> {
			if (stack.hasTagCompound()) {
				if (!ItemPhialFull.ItemCustom.isBlockFromItemStack(stack)) {
					return new ModelResourceLocation("lepidodendron:entities/phial", "inventory");
				} else {
					String resourcelocation = stack.getTagCompound().getString("id_eggs");
					String mobname = ItemPhialFull.ItemCustom.getEggStr(resourcelocation);
					return new ModelResourceLocation(LepidodendronMod.MODID +":entities/phial_eggs_" + mobname, "inventory");
				}
			}
			else return new ModelResourceLocation("lepidodendron:entities/phial", "inventory");
		});
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_phial");
			setRegistryName("phial");
			setCreativeTab(null);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				String resourcelocation = stack.getTagCompound().getString("id_eggs");
				return "item.pf_phial_eggs_" + getEggStr(resourcelocation);
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
				if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack)) {
					return EnumActionResult.FAIL;
				}
				if (!isBlockFromItemStack(itemstack)) {
					return EnumActionResult.FAIL; //The phial is empty!
				}
				String resourcelocation = itemstack.getTagCompound().getString("id_eggs");
				Block placeBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation (resourcelocation));
				if (placeBlock.canPlaceBlockOnSide(worldIn, pos.offset(facing), facing)) {
					worldIn.setBlockState(pos.offset(facing), placeBlock.getStateForPlacement(worldIn, pos.offset(facing), facing, hitX, hitY, hitZ, 0, (EntityLivingBase) player));
					SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_EMPTY;
					worldIn.playSound(player, pos.offset(facing), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					ItemStack phial = new ItemStack(ItemPhial.block, (int) (1));
					if (!player.isCreative()) {
						phial.setCount(1);
						itemstack.shrink(1);
						ItemHandlerHelper.giveItemToPlayer(player, phial);
					}
					return EnumActionResult.SUCCESS;
				}

			}
			return EnumActionResult.PASS;
		}

		public static boolean isBlockFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| !stack.getTagCompound().hasKey("id_eggs")) return false;

			return true;
		}

		public static String getEggStr(String string) {
			string = string.replace("lepidodendron:eggs_", "");
			string = string.replace("lepidodendron:amphibian_spawn_", "");
			string = string.replace("lepidodendron:eurypterid_eggs_", "");
			string = string.replace("lepidodendron:insect_eggs_", "");
			return string;
		}

	}

}
