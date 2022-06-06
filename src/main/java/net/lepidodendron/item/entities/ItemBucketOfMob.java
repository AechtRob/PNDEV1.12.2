
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBucketOfMob extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:mob_bucket")
	public static final Item block = null;

	public ItemBucketOfMob(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.mob_bucket);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:brasilodendron_spores", "inventory"));

		ModelBakery.registerItemVariants(block,
				new ModelResourceLocation("lepidodendron:mob_bucket_empty", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acadoaradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthodes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostomatops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acrolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acutiramus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/adelophthalmus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ainiktozoon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/akmonistion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/alacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/albertonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/allenypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amphibamus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amplectobelua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anomalocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antarcticarcinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anthracomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antineosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aphetoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asaphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asteroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ateleaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/balanerpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bandringa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/banffia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/barbclabornia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/basiloceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/batofasciculus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belantsea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/birkenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/blourugia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bobasatrania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bothriolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/branchiosaur_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brochoadmones_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bushizheia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cacops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cambroraster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cameroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/campbellodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/canadaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/canadia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/carolowilhelmina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cephalaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheirurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheloniellon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/claudiosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/clydagnathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coccosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coelacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cooperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coroniceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cothurnocystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crassigyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crotalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cylolobus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyrtoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dactylioceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/daedalichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dalmanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dasyceps_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/deiroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dickinsonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/didymograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplocaulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diploceraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/doryaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dorypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/drepanaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dunkleosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dvinosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ebenaqua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/edestus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eglonaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ellipsocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/elrathia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/endoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/enoploura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoandromeda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoredlichia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eosaurichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ericixerxes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eurypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eusthenopteron_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/feroxichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcacauda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gabreyaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gantarostrataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemmactena_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemuendina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gnathorhiza_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goniatites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gonioceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/groenlandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gyracanthides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haikouichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hallucigenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/helianthaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/helmetia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hemicyclaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heterosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hibbertopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hibernaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hungioides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyneria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iniopteryx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/isotelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jaekelopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/janassa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish5_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish6_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish7_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish_precambrian_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jianshanopodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kaibabvenator_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kalbarria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kerygmachela_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kimberella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kodymirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kokomopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laccognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laminacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lebachacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/limnoscelis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/listracanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lunaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lunataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lungmenshanaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lyrarapax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/manticoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/marrella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mastodonsaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mcnamaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeura_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeuropsis_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megarachne_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/menaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metaspriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microdictyon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microdictyon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mimetaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mixopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/monograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mooreoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nectocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odaraia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odontogriphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/omnidens_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onychodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/opabinia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthrozanclus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/osteolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ottoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pachydesmoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pachydiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pagea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_perm_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoisopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panderichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paranichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parapuzosia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parexus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parvancorina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paucipodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paucipodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pederpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pelurgaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phantaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pharyngolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pholiderpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pikaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platycaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platyhystrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platylomaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platysomus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pomatrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/poraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prionoschus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/profallotaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/promissum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/proterogyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/psarolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pteraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pterygotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/qilinyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rayonnoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rebellatrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/retifacies_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhizodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sacabambaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saivodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_freshwater_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_marine_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scaumenacia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schinderhannes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/selenopeltis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/semionotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/shonisaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/siberion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sidneyia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spathicephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squatinactis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stensioella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/synophalos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tartuosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegopelte_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/temperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/terataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tetragraptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thelodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/titanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/titanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tokummia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/traquairius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trimerus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tullimonstrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turrisaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urosthenes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/varialepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vestinautilus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/walliserops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wiwaxia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xenusion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yawunik_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yilingia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yohoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yorgia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yunnanozoon_bucket", "inventory")

				);

		ModelLoader.setCustomMeshDefinition(block, stack -> {
			if (stack.hasTagCompound()) {
				if (!ItemBucketOfMob.ItemCustom.isEntityFromItemStack(stack)) {
					return new ModelResourceLocation(stack.getItem().getRegistryName() + "_empty", "inventory");
				} else {
					NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
					ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
					String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
					return new ModelResourceLocation(LepidodendronMod.MODID +":entities/" + mobname + "_bucket", "inventory");
				}
			}
			else return new ModelResourceLocation(stack.getItem().getRegistryName() + "_empty", "inventory");
		});
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_mob_bucket");
			setRegistryName("mob_bucket");
			maxStackSize = 1;
			setCreativeTab(null);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isEntityFromItemStack(stack)) {
				NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
				ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
				String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
				return "item.pf_" + mobname + "_bucket.name";
			}
			return super.getTranslationKey(stack);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			boolean flag = false;
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);
			ActionResult<ItemStack> ret = onBucketUse(playerIn, worldIn, itemstack, raytraceresult);
			if (ret != null) return ret;

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(playerIn, blockpos))
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}

				{
					boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
					BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);

					if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else if (tryPlaceContainedLiquid(playerIn, worldIn, blockpos1, itemstack))
					{
						if (playerIn instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
						}

						playerIn.addStat(StatList.getObjectUseStats(this));
						return !playerIn.capabilities.isCreativeMode ? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET)) : new ActionResult(EnumActionResult.SUCCESS, itemstack);
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
				}
			}
		}

		public boolean tryPlaceContainedLiquid(@Nullable EntityPlayer player, World worldIn, BlockPos posIn, ItemStack stack)
		{
			{
				IBlockState iblockstate = worldIn.getBlockState(posIn);
				Material material = iblockstate.getMaterial();
				boolean flag = !material.isSolid();
				boolean flag1 = iblockstate.getBlock().isReplaceable(worldIn, posIn);

				if (!worldIn.isAirBlock(posIn) && !flag && !flag1)
				{
					return false;
				}
				else
				{
					if (worldIn.provider.doesWaterVaporize())
					{
						int l = posIn.getX();
						int i = posIn.getY();
						int j = posIn.getZ();
						worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

						for (int k = 0; k < 8; ++k)
						{
							worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)l + Math.random(), (double)i + Math.random(), (double)j + Math.random(), 0.0D, 0.0D, 0.0D);
						}
					}
					else
					{
						if (!worldIn.isRemote && (flag || flag1) && !material.isLiquid())
						{
							worldIn.destroyBlock(posIn, true);
						}

						SoundEvent soundevent = SoundEvents.ITEM_BUCKET_EMPTY;
						worldIn.playSound(player, posIn, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
						worldIn.setBlockState(posIn, Blocks.FLOWING_WATER.getDefaultState(), 11);

						if (!(worldIn.isRemote)) {
							spawnEntityFromItemStack(stack, worldIn, (double) posIn.getX() + 0.5D, (double) posIn.getY(), (double) posIn.getZ() + 0.5D);
						}
					}

					return true;
				}
			}
		}

		public static Entity spawnEntityFromItemStack(ItemStack stack, World world, double x, double y, double z) {

			if (!isEntityFromItemStack(stack)) return null;

			NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");

			Entity entity = EntityList.createEntityFromNBT(entityNBT, world);

			if (entity != null) {
				entity.setLocationAndAngles(x, y, z, 0,0 );
				if (!world.isRemote) {
					world.spawnEntity(entity);
				}
			}
			return entity;
		}

		public static boolean isEntityFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| !stack.getTagCompound().hasKey("Mob")) return false;

			return true;
		}

		@Nullable
		public static ActionResult<ItemStack> onBucketUse(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull ItemStack stack, @Nullable RayTraceResult target)
		{
			FillBucketEvent event = new FillBucketEvent(player, stack, world, target);
			if (MinecraftForge.EVENT_BUS.post(event)) return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);

			if (event.getResult() == Event.Result.ALLOW)
			{
				if (player.capabilities.isCreativeMode)
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);

				stack.shrink(1);
				if (stack.isEmpty())
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, event.getFilledBucket());

				if (!player.inventory.addItemStackToInventory(event.getFilledBucket()))
					player.dropItem(event.getFilledBucket(), false);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
			}
			return null;
		}
	}
}
