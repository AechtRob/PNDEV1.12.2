
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockEggs;
import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.block.BlockEggsWaterSurface;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
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
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_acanthostega", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_acanthostomatops", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_acutiramus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_adelophthalmus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_amphibamus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_antarcticarcinus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_archaboilus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_archoblattina", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_archocyrtus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_arthropleura", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_asteracanthus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_attercopus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_balanerpeton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_barameda", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_barbclabornia", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_branchiosaur", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_cacops", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_carcinosoma", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_chunerpeton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_ciurcopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_cladoselache", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_cotylorhynchus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_cobelodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_crassigyrinus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_daohugoucossus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dasyceps", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_diadectes", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_diplocaulus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_diploceraspis", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dracopristis", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly1", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly2", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly3", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly4", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly5", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly6", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly7", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly8", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly9", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dragonfly_nymph_dragonfly10", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_dvinosaurus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_edestus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_eoarthropleura", "inventory"),
            new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_crussolum", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_eryops", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_eurypterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_fadenia_carboniferous", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_fadenia_permotriassic", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_gephyrostegus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_gerarus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_gerrothorax", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_greererpeton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_harvestman", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_helicoprion", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_hibbertopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_hybodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_hyneria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_ichthyostega", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_italophlebia_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_jaekelopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_jeholotriton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_kaibabvenator", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_kokomopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_laidleria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_lebachacanthus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_limnoscelis", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_listracanthus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_marmorerpeton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_mastodonsaurus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_megactenopetalus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_megalocephalus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_megalograptus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_meganeura_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_meganeurites_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_meganeuropsis_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_megarachne", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_megasecoptera_nymph_sylvohymen", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_melosaurus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_metoposaurus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_mixopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriacantherpestes", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_notidanoides", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_onychodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_onychopterella", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_orcanopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_orodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pagea", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_delitzschala", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_dunbaria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_homaloneura", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_lithomantis", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_lycocercus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_mazothairos", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_psychroptilus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_sinodunbaria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeodictyoptera_nymph_stenodictya", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_palaeontinid", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pantylus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_parhybodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_parmastega", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pederpes", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pentecopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_phlegethontia", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pholiderpeton", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_platyhystrix", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_pneumodesmus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_prionosuchus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_proterogyrinus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_protozygoptera_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pterygotus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_pycnophlebia", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_rhizodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_saivodus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_siderops", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_slimonia", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_spathicephalus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_stanocephalosaurus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_stoermeropterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_strobilopterus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_tiktaalik", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_titanoptera_nymph_mesotitan", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_titanoptera_nymph_clatrotitan", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_titanoptera_nymph_gigatitan", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_cryptomartus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_eophrynus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_kreischeria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_palaeocharinus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_palaeotarbus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_permotarbus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_trigonotarbid_gondwanarachne", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_uranocentrodon", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_urocordylus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_whatcheeria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_xenacanthus", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_hughmilleria", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_banksiops", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_wodnika", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_namurotypus_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_erasipteroides_nymph", "inventory"),
			new ModelResourceLocation("lepidodendron:entities/phial_eggs_archeria", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_nigerpeton", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_acherontiscus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_anthracosaurus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_sclerocephalus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eucritta", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_pholidogaster", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eoherpeton", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_caerorhachis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_eldeceeon", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_silvanerpeton", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_westlothiana", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_rhadinosteus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_triadobatrachus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_apateon", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_microbrachis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_koolasuchus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_ptychodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_onchopristis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_squalicorax", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cretoxyrhina", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_egertonodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_thaiodus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_sarcoprion", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_notobatrachus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cretalamna", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_cratopipa", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_prosalirus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_permarachne", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_santanmantis", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_valdotriton", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_kururubatrachus", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_gaiasia", "inventory"),//why tadpole?
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_diplocaulus_minimus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_saharastega", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_plesioblattogryllus", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_velocipede", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_devonobius", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_polydesmid", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_myriapod_juliform", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_hyogobatrachus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_tadpole_genibatrachus", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_cretosaja", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_hangingfly", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_scorpionfly", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_aquaticnymph_mayfly", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_aquaticnymph_stonefly", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_aquaticnymph_damselfly", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_fortiholcorpa", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_juracimbrophlebia", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_aquaticnymph_argentinala", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_aquaticnymph_velisoptera", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phial_eggs_ptyktoptychion", "inventory")




				);

		ModelLoader.setCustomMeshDefinition(block, stack -> {
			if (stack.hasTagCompound()) {
				if (!ItemPhialFull.ItemCustom.isBlockFromItemStack(stack)) {
					return new ModelResourceLocation("lepidodendron:entities/phial", "inventory");
				} else {
					String resourcelocation = stack.getTagCompound().getString("id_eggs");
					String variant = ItemCustom.getTypeFromStack(stack);
					String mobname = ItemPhialFull.ItemCustom.getEggStr(resourcelocation);
					if (variant.equalsIgnoreCase("")) {
						return new ModelResourceLocation(LepidodendronMod.MODID + ":entities/phial_eggs_" + mobname, "inventory");
					}
					else {
						return new ModelResourceLocation(LepidodendronMod.MODID + ":entities/phial_eggs_" + mobname + "_" + variant, "inventory");
					}
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

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				String resourcelocation = stack.getTagCompound().getString("id_eggs");
				String variant = getTypeFromStack(stack);
				if (!variant.equalsIgnoreCase("")) {
					return I18n.translateToLocal("item.pf_phial_eggs_full.name").trim()
							+ ": "
							+ I18n.translateToLocal("tile." + getEggStrForName(resourcelocation) + "_" + variant + ".name").trim();

				}
				else {
					return I18n.translateToLocal("item.pf_phial_eggs_full.name").trim()
							+ ": "
							+ I18n.translateToLocal("tile." + getEggStrForName(resourcelocation) + ".name").trim();
				}
			}
			return super.getItemStackDisplayName(stack);
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
				String PNVariant = "";
				if (itemstack.getTagCompound().hasKey("PNType")) {
					PNVariant = itemstack.getTagCompound().getString("PNType");
				}
				if (!PNVariant.equals("")) {
					resourcelocation = resourcelocation + "@" + PNVariant;
				}
				if (itemstack.getTagCompound().getBoolean("water")) {
					if (BlockEggsWater.block.canPlaceBlockAt(worldIn, pos.offset(facing))) {
						if (!(worldIn.isRemote)) {
							worldIn.setBlockState(pos.offset(facing), BlockEggsWater.block.getDefaultState());
							worldIn.setTileEntity(pos.offset(facing), new BlockEggsWater.TileEntityCustom());
							TileEntity te = worldIn.getTileEntity(pos.offset(facing));
							te.getTileData().setString("creature", resourcelocation);
							if (!PNVariant.equalsIgnoreCase("")) {
								te.getTileData().setString("PNType", PNVariant);
							}
							((BlockEggsWater.TileEntityCustom)te).setHatchable(true);
						}
						if (!player.capabilities.isCreativeMode) {
							itemstack.shrink(1);
							ItemStack phial = new ItemStack(ItemPhial.block, 1);
							ItemHandlerHelper.giveItemToPlayer(player, phial);
						}
						player.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(player, pos.offset(facing), SoundEvents.BLOCK_SLIME_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return EnumActionResult.SUCCESS;
					}
				}
				if (itemstack.getTagCompound().getBoolean("surface")) {
					if (BlockEggsWaterSurface.block.canPlaceBlockAt(worldIn, pos.up(2))) {
						if (!(worldIn.isRemote)) {
							worldIn.setBlockState(pos.up(2), BlockEggsWaterSurface.block.getDefaultState());
							worldIn.setTileEntity(pos.up(2), new BlockEggsWaterSurface.TileEntityCustom());
							TileEntity te = worldIn.getTileEntity(pos.up(2));
							te.getTileData().setString("creature", resourcelocation);
							if (!PNVariant.equalsIgnoreCase("")) {
								te.getTileData().setString("PNType", PNVariant);
							}
							((BlockEggsWaterSurface.TileEntityCustom)te).setHatchable(true);
						}
						if (!player.capabilities.isCreativeMode) {
							itemstack.shrink(1);
							ItemStack phial = new ItemStack(ItemPhial.block, 1);
							ItemHandlerHelper.giveItemToPlayer(player, phial);
						}
						player.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(player, pos.offset(facing), SoundEvents.BLOCK_SLIME_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return EnumActionResult.SUCCESS;
					}
				}
				else {
					if (BlockEggs.block.canPlaceBlockAt(worldIn, pos.offset(facing))) {
						if (!(worldIn.isRemote)) {
							worldIn.setBlockState(pos.offset(facing), BlockEggs.block.getDefaultState());
							worldIn.setTileEntity(pos.offset(facing), new BlockEggs.TileEntityCustom());
							TileEntity te = worldIn.getTileEntity(pos.offset(facing));
							te.getTileData().setString("creature", resourcelocation);
							if (!PNVariant.equalsIgnoreCase("")) {
								te.getTileData().setString("PNType", PNVariant);
							}
						}
						if (!player.capabilities.isCreativeMode) {
							itemstack.shrink(1);
							ItemStack phial = new ItemStack(ItemPhial.block, 1);
							ItemHandlerHelper.giveItemToPlayer(player, phial);
						}
						player.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(player, pos.offset(facing), SoundEvents.BLOCK_SLIME_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return EnumActionResult.SUCCESS;
					}
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
			string = string.replace("lepidodendron:prehistoric_flora_", "");
			string = string.replace("_item", "");
			return string;
		}

		public static String getEggStrForName(String string) {
			string = string.replace("lepidodendron:prehistoric_flora_", "pf_eggs_");
			return string;
		}

		public static String getTypeFromStack(ItemStack stack) {
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PNType")) {
					return stack.getTagCompound().getString("PNType");
				}
			}
			return "";
		}

	}

}
