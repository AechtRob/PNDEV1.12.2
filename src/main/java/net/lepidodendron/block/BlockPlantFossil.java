
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.*;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPlantFossil extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:plant_fossil")
	public static final Block block = null;
	public BlockPlantFossil(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.plant_fossil);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("plant_fossil"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:plant_fossil", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == 0 && LepidodendronConfig.genFossil)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		for (int i = 0; i < 18; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(Math.max(world.getSeaLevel()-15,1)) + 10;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 6, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
						blockCriteria = true;
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}

	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setTranslationKey("pf_plant_fossil");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(1.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
		{
			Random rand = new Random();
			if (!worldIn.isRemote && stack.getItem() == ItemFossilHammer.block) {
				int levelEnchantment = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.FORTUNE, stack);
				int ii = rand.nextInt(levelEnchantment + 2);
				//System.err.println(ii);
				for (int i = 0; i < ii; ++i) {
					player.addStat(StatList.getBlockStats(this));
					spawnAsEntity(worldIn, pos, getFossilDrop(getPetrifiedDrops()));
				}
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(this, (int) (1)).getItem();
		}

		@Override
		public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player)
		{
			return false;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 0;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.STONE;
		}
	}


	public static ItemStack[] getPetrifiedDrops() {

		ItemStack[] stack = {
			new ItemStack(ItemPetrifiedSapling.block,1),
			new ItemStack(ItemPetrifiedGlossopterisSapling.block,1),
			new ItemStack(ItemPetrifiedLiriodendronSapling.block,1),
			new ItemStack(ItemPetrifiedMagnoliaSapling.block,1),
			new ItemStack(ItemPetrifiedRedwoodSapling.block,1),
			new ItemStack(ItemPetrifiedWollemiSapling.block,1),
			new ItemStack(ItemPetrifiedBothrodendronSapling.block,1),
			new ItemStack(ItemPetrifiedDiaphorodendronSapling.block,1),
			new ItemStack(ItemPetrifiedGinkgoSapling.block,1),
			new ItemStack(ItemPetrifiedAgathisSapling.block,1),
			new ItemStack(ItemPetrifiedBushyAraucariaSapling.block,1),
			new ItemStack(ItemPetrifiedColumnarisSapling.block,1),
			new ItemStack(ItemPetrifiedBunyaSapling.block,1),
			new ItemStack(ItemPetrifiedTempskyaSapling.block,1),
			new ItemStack(ItemPetrifiedCycadeoideaSapling.block,1),
			new ItemStack(ItemPetrifiedSahnioxylonSapling.block,1),
			new ItemStack(ItemPetrifiedWilliamsoniaSapling.block,1),
			new ItemStack(ItemPetrifiedZamitesSapling.block,1),
			new ItemStack(ItemPetrifiedSigillariaSapling.block,1),
			new ItemStack(ItemPetrifiedCalamitesSapling.block,1),
			new ItemStack(ItemPetrifiedAraucarioxylonSaping.block,1),
			new ItemStack(ItemPetrifiedSciadopitysSapling.block,1),
			new ItemStack(ItemPetrifiedPleuromeiaSapling.block,1),
			new ItemStack(ItemPetrifiedBjuviaSapling.block,1),
			new ItemStack(ItemPetrifiedEncblueSapling.block,1),
			new ItemStack(ItemPetrifiedAntarcticycas.block,1),
			new ItemStack(ItemPetrifiedCycasSapling.block,1),
			new ItemStack(ItemPetrifiedLeptocycasSapling.block,1),
			new ItemStack(ItemPetrifiedDioonSapling.block,1),
			new ItemStack(ItemPetrifiedSpinyCycadSapling.block,1),
			new ItemStack(ItemPetrifiedPsaroniusSapling.block,1),
			new ItemStack(ItemPetrifiedCaytoniales.block,1),
			new ItemStack(ItemPetrifiedCaytoniales2.block,1),
			new ItemStack(ItemPetrifiedDicksoniaSapling.block,1),
			new ItemStack(ItemPetrifiedDicroidiumSapling.block,1),
			new ItemStack(ItemPetrifiedCordaitesSapling.block,1),
			new ItemStack(ItemPetrifiedSphenophyllales.block,1),
			new ItemStack(ItemPetrifiedGiantHorsetail.block,1),
			new ItemStack(ItemPetrifiedCooksonia.block,1),
			new ItemStack(ItemPetrifiedPsilophyton.block,1),
			new ItemStack(ItemPetrifiedAsteroxylon.block,1),
			new ItemStack(ItemPetrifiedPrototaxites.block,1),
			new ItemStack(ItemPetrifiedWattiezaSapling.block,1),
			new ItemStack(ItemPetrifiedValmeyerodendronSapling.block,1),
			new ItemStack(ItemPetrifiedProteaSapling.block,1),
			new ItemStack(ItemPetrifiedProteaSapling1.block,1),
			new ItemStack(ItemPetrifiedWalchiaSapling.block,1),
			new ItemStack(ItemPetrifiedLepidopteris.block,1),
			new ItemStack(ItemPetrifiedBaikalophyllum.block,1),
			new ItemStack(ItemPetrifiedBaiera.block,1),
			new ItemStack(ItemPetrifiedIsoetes.block,1),
			new ItemStack(ItemPetrifiedSphenophyllales1.block,1),
			new ItemStack(ItemPetrifiedClaytosmunda.block,1),
			new ItemStack(ItemPetrifiedWachtleria.block,1),
			new ItemStack(ItemPetrifiedScytophyllum.block,1),
			new ItemStack(ItemPetrifiedAethophyllum.block,1),
			new ItemStack(ItemPetrifiedTallAraucariaSapling.block,1),
			new ItemStack(ItemPetrifiedNelumbo.block,1),
			new ItemStack(ItemPetrifiedAlpiaSapling.block,1),
			new ItemStack(ItemPetrifiedKomlopterisSapling.block,1),
			new ItemStack(ItemPetrifiedMedullosalesSapling.block,1),
			new ItemStack(ItemPetrifiedBaragwanathia.block,1),
			new ItemStack(ItemPetrifiedGigantopteridSapling.block,1),
			new ItemStack(ItemPetrifiedBristleconeSapling.block,1),
			new ItemStack(ItemPetrifiedHironoiaSapling.block,1),
			new ItemStack(ItemPetrifiedSmallMatonia.block,1),
			new ItemStack(ItemPetrifiedLargeMatonia.block,1),
			new ItemStack(ItemPetrifiedArchaeopterisSapling.block,1),
			new ItemStack(ItemPetrifiedDollyphyton.block,1),
			new ItemStack(ItemPetrifiedRhacophyton.block,1),
			new ItemStack(ItemPetrifiedOsmunda.block,1),
			new ItemStack(ItemPetrifiedStauropteris.block,1),
			new ItemStack(ItemPetrifiedNeuropteridium.block,1),
			new ItemStack(ItemPetrifiedCinnamonFern.block,1),
			new ItemStack(ItemPetrifiedNilssoniocladusSapling.block,1),
			new ItemStack(ItemPetrifiedAlethopterisSapling.block,1),
			new ItemStack(ItemPetrifiedMapleSapling.block,1),
			new ItemStack(ItemPetrifiedMarattia.block,1),
			new ItemStack(ItemPetrifiedGuangdedendron.block,1),
			new ItemStack(ItemPetrifiedEdwardsiphyton.block,1),
			new ItemStack(ItemPetrifiedEphedra.block,1),
			new ItemStack(ItemPetrifiedArtocarpusSapling.block,1),
			new ItemStack(ItemPetrifiedArchaefructus.block,1),
			new ItemStack(ItemPetrifiedEquisetitesSapling.block,1),
			new ItemStack(ItemPetrifiedWaterHorsetail.block,1),
			new ItemStack(ItemPetrifiedWoodHorsetail.block,1),
			new ItemStack(ItemPetrifiedFieldHorsetail.block,1),
			new ItemStack(ItemPetrifiedUmaltolepis.block,1),
			new ItemStack(ItemPetrifiedSphenopteris.block,1),
			new ItemStack(ItemPetrifiedTyrmia.block,1),
			new ItemStack(ItemPetrifiedWielandiella.block,1),
			new ItemStack(ItemPetrifiedLadiniaSapling.block,1),
			new ItemStack(ItemPetrifiedNothofagusSapling.block,1),
			new ItemStack(ItemPetrifiedPachypteris.block,1),
			new ItemStack(ItemPetrifiedNathorstiana.block,1),
			new ItemStack(ItemPetrifiedOmphalophloiosSapling.block,1),
			new ItemStack(ItemPetrifiedNeocalamites.block,1),
			new ItemStack(ItemPetrifiedYewSapling.block,1),
			new ItemStack(ItemPetrifiedBrachyphyllumSapling.block,1),
			new ItemStack(ItemPetrifiedPterophyllumSapling.block,1),
			new ItemStack(ItemPetrifiedQuasistrobus.block,1),
			new ItemStack(ItemPetrifiedUtrechtiaSapling.block,1),
			new ItemStack(ItemPetrifiedSelaginella.block,1),
			new ItemStack(ItemPetrifiedCobbania.block,1),
			new ItemStack(ItemPetrifiedElkinsia.block,1),
			new ItemStack(ItemPetrifiedCallistophytales.block,1),
			new ItemStack(ItemPetrifiedPseudobornia.block,1),
			new ItemStack(ItemPetrifiedAdoketophyton.block,1),
			new ItemStack(ItemPetrifiedZosterophyllum.block,1),
			new ItemStack(ItemPetrifiedFoozia.block,1),
			new ItemStack(ItemPetrifiedPertica.block,1),
			new ItemStack(ItemPetrifiedTetraxylopteris.block,1),
			new ItemStack(ItemPetrifiedAnkyropteris.block,1),
			new ItemStack(ItemPetrifiedOdontopteris.block,1),
			new ItemStack(ItemPetrifiedTmesipteris.block,1),
			new ItemStack(ItemPetrifiedPrimaevalGrass.block,1),
			new ItemStack(ItemPetrifiedPalaeostachya.block,1),
			new ItemStack(ItemPetrifiedSchizoneura.block,1),
			new ItemStack(ItemPetrifiedNoeggerathialesSapling.block,1),
			new ItemStack(ItemPetrifiedBanksia1Sapling.block,1),
			new ItemStack(ItemPetrifiedBanksia2Sapling.block,1),
			new ItemStack(ItemPetrifiedProtolepidodendropsisSapling.block,1),
			new ItemStack(ItemPetrifiedPalaeognetaleana.block,1),
			new ItemStack(ItemPetrifiedBolbitis.block,1),
			new ItemStack(ItemPetrifiedTaxodiumSapling.block,1),
			new ItemStack(ItemPetrifiedZygopteridaceaeSapling.block,1),
			new ItemStack(ItemPetrifiedTieteaSapling.block,1),
			new ItemStack(ItemPetrifiedEmplectopterisSapling.block,1),
			new ItemStack(ItemPetrifiedNilssoniaSapling.block,1),
			new ItemStack(ItemPetrifiedFernEpiphyte.block,1),
			new ItemStack(ItemPetrifiedNystroemia.block,1),
			new ItemStack(ItemPetrifiedPolyspermophyllum.block,1),
			new ItemStack(ItemPetrifiedTrichopitys.block,1),
			new ItemStack(ItemPetrifiedHymenaeaSapling.block,1),
			new ItemStack(ItemPetrifiedIbyka.block,1),
			new ItemStack(ItemPetrifiedCalamophytonSapling.block,1),
			new ItemStack(ItemPetrifiedCecropsis.block,1),
			new ItemStack(ItemPetrifiedCtenisSapling.block,1),
			new ItemStack(ItemPetrifiedLeclercqia.block,1),
			new ItemStack(ItemPetrifiedRhynia.block,1),
			new ItemStack(ItemPetrifiedPodocarpSapling.block,1),
			new ItemStack(ItemPetrifiedRellimia.block,1),
			new ItemStack(ItemPetrifiedRufloriaSapling.block,1),
			new ItemStack(ItemPetrifiedXenocladiaSapling.block,1),
			new ItemStack(ItemPetrifiedZygopterisSapling.block,1),
			new ItemStack(ItemPetrifiedPitysSapling.block,1),
			new ItemStack(ItemPetrifiedEremopteris.block,1),
			new ItemStack(ItemPetrifiedAlliopteris.block,1),
			new ItemStack(ItemPetrifiedNemejcopteris.block,1),
			new ItemStack(ItemPetrifiedReticulopteris.block,1),
			new ItemStack(ItemPetrifiedLycopia.block,1),
			new ItemStack(ItemPetrifiedCzekanowskiaSapling.block,1),
			new ItemStack(ItemPetrifiedNilssoniopteris.block,1),
			new ItemStack(ItemPetrifiedBelemnopteris.block,1),
			new ItemStack(ItemPetrifiedBrasilodendron.block,1),
			new ItemStack(ItemPetrifiedSurangephyllum.block,1),
			new ItemStack(ItemPetrifiedCyclodendron.block,1),
			new ItemStack(ItemPetrifiedPaurodendron.block,1),
			new ItemStack(ItemPetrifiedPhyllotheca.block,1),
			new ItemStack(ItemPetrifiedBuriadia.block,1),
			new ItemStack(ItemPetrifiedPseudovoltzia.block,1),
			new ItemStack(ItemPetrifiedQuadrocladus.block,1),
			new ItemStack(ItemPetrifiedAridHorsetail.block,1),
			new ItemStack(ItemPetrifiedSwampHorsetail.block,1),
			new ItemStack(ItemPetrifiedAneurophytonSapling.block,1),
			new ItemStack(ItemPetrifiedSkaaripteris.block,1),
			new ItemStack(ItemPetrifiedGlenopteris.block,1),
			new ItemStack(ItemPetrifiedDicranophyllum.block,1),
			new ItemStack(ItemPetrifiedScolecopteris.block,1),
			new ItemStack(ItemPetrifiedLesleya.block,1),
			new ItemStack(ItemPetrifiedWachtlerina.block,1),
			new ItemStack(ItemPetrifiedThucydia.block,1),
			new ItemStack(ItemPetrifiedOrtiseia.block,1),
			new ItemStack(ItemPetrifiedDictyophyllum.block,1),
			new ItemStack(ItemPetrifiedOtozamites.block,1),
			new ItemStack(ItemPetrifiedAnomozamitesSapling.block,1),
			new ItemStack(ItemPetrifiedPtilophyllumSapling.block,1),
			new ItemStack(ItemPetrifiedTongchuanophyllum.block,1),
			new ItemStack(ItemPetrifiedToditesSapling.block,1),
			new ItemStack(ItemPetrifiedCladophlebis.block,1),
			new ItemStack(ItemPetrifiedClathropteris.block,1),
			new ItemStack(ItemPetrifiedIschnophyton.block,1),
			new ItemStack(ItemPetrifiedPetriellales.block,1),
			new ItemStack(ItemPetrifiedFurculaSapling.block,1),
			new ItemStack(ItemPetrifiedSanmiguelia.block,1),
			new ItemStack(ItemPetrifiedConiopteris.block,1),
			new ItemStack(ItemPetrifiedXihuphyllum.block,1),
			new ItemStack(ItemPetrifiedMacrotaeniopteris.block,1),
			new ItemStack(ItemPetrifiedArthropitysSapling.block,1),
			new ItemStack(ItemPetrifiedDicroidiumFSapling.block,1),
			new ItemStack(ItemPetrifiedTelemachusSapling.block,1),
			new ItemStack(ItemPetrifiedSphenobaieraSapling.block,1),
			new ItemStack(ItemPetrifiedBeechSapling.block,1),
			new ItemStack(ItemPetrifiedPlaneSapling.block,1),
			new ItemStack(ItemPetrifiedSycamoreSapling.block,1),
			new ItemStack(ItemPetrifiedLyginopteris.block,1),
			new ItemStack(ItemPetrifiedMacroneuropterisSapling.block,1),
			new ItemStack(ItemPetrifiedStiffCycadSapling.block,1)
		};
		return stack;
	}

	public static ItemStack getFossilDrop(ItemStack[] stack) {

		int ii = (new Random()).nextInt(stack.length);
		ItemStack i = stack[ii];
		//System.err.println("Len: " + stack.length + " pos:" + ii + " res: " + i);
		return i;
	}

}
