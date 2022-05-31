
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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

			if (!worldIn.isRemote) {
				boolean collected = false;
				EntityItem entityToSpawn = null;
				ItemStack spores = null;

				if (blockTarget == BlockBothrodendronStrobilus.block) {
					spores = new ItemStack(ItemBothrodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockDiaphorodendronStrobilus.block) {
					spores = new ItemStack(ItemDiaphorodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockLepidodendronStrobilus.block) {
					spores = new ItemStack(ItemLepidodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSigillariaStrobilus.block) {
					spores = new ItemStack(ItemSigillariaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockTempskyaLeaves.block || blockTarget == BlockTempskyaLeavesPlaceable.block) {
					spores = new ItemStack(ItemTempskyaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCalamitesStrobilus.block) {
					spores = new ItemStack(ItemCalamitesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPleuromeiaShootTopFlower.block) {
					spores = new ItemStack(ItemPleuromeiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPsaroniusLeaves.block
					|| blockTarget == BlockPsaroniusLeavesPlaceable.block
					|| blockTarget == BlockPsaroniusLeavesSmall.block
					|| blockTarget == BlockPsaroniusLeavesSmallPlaceable.block
					|| blockTarget == BlockPsaroniusLeavesTop.block) {
					spores = new ItemStack(ItemPsaroniusSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockTieteaLeaves.block
						|| blockTarget == BlockTieteaLeavesPlaceable.block
						|| blockTarget == BlockTieteaLeavesSmall.block
						|| blockTarget == BlockTieteaLeavesSmallPlaceable.block
						|| blockTarget == BlockTieteaLeavesTop.block) {
					spores = new ItemStack(ItemTieteaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockDicksoniaLeaves.block
						|| blockTarget == BlockDicksoniaLeavesPlaceable.block
						|| blockTarget == BlockDicksoniaLeaves2.block
						|| blockTarget == BlockDicksoniaLeaves3.block
						|| blockTarget == BlockDicksoniaLeaves4.block) {
					spores = new ItemStack(ItemDicksoniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockZygopteridaceaeLeaves.block
						|| blockTarget == BlockZygopteridaceaeLeavesPlaceable.block
						|| blockTarget == BlockZygopteridaceaeLeaves2.block
						|| blockTarget == BlockZygopteridaceaeLeaves3.block
						|| blockTarget == BlockZygopteridaceaeLeaves4.block) {
					spores = new ItemStack(ItemZygopteridaceaeSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSphenophyllales.block) {
					spores = new ItemStack(ItemSphenophyllalesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockGiantHorsetailFlowerShoot.block) {
					spores = new ItemStack(ItemHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCooksoniaSpore.block) {
					spores = new ItemStack(ItemCooksoniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPsilophytonSpore.block) {
					spores = new ItemStack(ItemPsilophytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAsteroxylon.block) {
					spores = new ItemStack(ItemAsteroxylonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPrototaxitesStrobilus.block) {
					spores = new ItemStack(ItemPrototaxitesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockWattiezaShoot.block
						|| blockTarget == BlockWattiezaShootPlaceable.block
						|| blockTarget == BlockWattiezaShoot02.block
						|| blockTarget == BlockWattiezaShoot03.block
						|| blockTarget == BlockWattiezaShootSide02.block
						|| blockTarget == BlockWattiezaShootSide03.block) {
					spores = new ItemStack(ItemWattiezaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockValmeyerodendronStrobilus.block) {
					spores = new ItemStack(ItemValmeyerodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockIsoetes.block) {
					spores = new ItemStack(ItemIsoetesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSphenophyllales1.block) {
					spores = new ItemStack(ItemSphenophyllales1Spores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockClaytosmunda.block) {
					spores = new ItemStack(ItemClaytosmundaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockWachtleria.block) {
					spores = new ItemStack(ItemWachtleriaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockBaragwanathia.block) {
					spores = new ItemStack(ItemBaragwanathiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockMatonia.block) {
					spores = new ItemStack(ItemSmallMatoniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockMatoniaLarge.block) {
					spores = new ItemStack(ItemLargeMatoniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockArchaeopterisLeaves.block
						|| blockTarget == BlockArchaeopterisLeavesPlaceable.block
						|| blockTarget == BlockArchaeopterisLeavesSmall.block
						|| blockTarget == BlockArchaeopterisLeavesSmallPlaceable.block) {
					spores = new ItemStack(ItemArchaeopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockDollyphyton.block) {
					spores = new ItemStack(ItemDollyphytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockRhacophyton.block) {
					spores = new ItemStack(ItemRhacophytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockOsmunda.block) {
					spores = new ItemStack(ItemOsmundaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockStauropteris.block) {
					spores = new ItemStack(ItemStauropterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNeuropteridium.block) {
					spores = new ItemStack(ItemNeuropteridiumSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCinnamonFern.block) {
					spores = new ItemStack(ItemCinnamonFernSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockGuangdedendronTop.block) {
					spores = new ItemStack(ItemGuangdedendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockMarattia.block) {
					spores = new ItemStack(ItemMarattiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockWaterHorsetail.block) {
					spores = new ItemStack(ItemWaterHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockWoodHorsetail.block) {
					spores = new ItemStack(ItemWoodHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockFieldHorsetail.block) {
					spores = new ItemStack(ItemFieldHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockEquisitesStrobilus.block) {
					spores = new ItemStack(ItemEquisetitesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNathorstiana.block) {
					spores = new ItemStack(ItemNathorstianaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockOmphalophloiosPlaceable.block
					|| blockTarget == BlockOmphalophloiosCentre.block
					|| blockTarget == BlockOmphalophloiosTop.block) {
					spores = new ItemStack(ItemOmphalophloiosSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNeocalamites3.block) {
					spores = new ItemStack(ItemNeocalamitesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPhyllothecaTop.block || blockTarget == BlockPhyllotheca.block) {
					spores = new ItemStack(ItemPhyllothecaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPseudobornia.block
						|| blockTarget == BlockPseudobornia2.block
						|| blockTarget == BlockPseudobornia3.block) {
					spores = new ItemStack(ItemPseudoborniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAdoketophytonSpore.block) {
					spores = new ItemStack(ItemAdoketophytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockZosterophyllumSpore.block) {
					spores = new ItemStack(ItemZosterophyllumSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPerticaSpore.block) {
					spores = new ItemStack(ItemPerticaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockFooziaSpore.block) {
					spores = new ItemStack(ItemFooziaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockTetraxylopterisSpore.block) {
					spores = new ItemStack(ItemTetraxylopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockTmesipteris.block) {
					spores = new ItemStack(ItemTmesipterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockFernEpiphyte.block) {
					spores = new ItemStack(ItemFernEpiphyteSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAnkyropterisStem.block
						|| blockTarget == BlockAnkyropterisStemNE.block
						|| blockTarget == BlockAnkyropterisStemNW.block) {
					spores = new ItemStack(ItemAnkyropterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPalaeostachyaTop.block
						|| blockTarget == BlockPalaeostachyaBottom.block) {
					spores = new ItemStack(ItemPalaeostachyaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSchizoneura1.block
						|| blockTarget == BlockSchizoneura2.block) {
					spores = new ItemStack(ItemSchizoneuraSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNoeggerathialesShoot.block
						|| blockTarget == BlockNoeggerathialesShootPlaceable.block) {
					spores = new ItemStack(ItemNoeggerathialesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockProtolepidodendropsisShoot.block) {
					spores = new ItemStack(ItemProtolepidodendropsisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNematophyta.block) {
					spores = new ItemStack(ItemNematophytaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockBolbitis.block) {
					spores = new ItemStack(ItemBolbitisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockIbyka.block) {
					spores = new ItemStack(ItemIbykaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCecropsis.block) {
					spores = new ItemStack(ItemCecropsisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == Blocks.DOUBLE_PLANT.getStateFromMeta(3).getBlock()) {
					spores = new ItemStack(ItemLargeFernSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == Blocks.TALLGRASS.getStateFromMeta(2).getBlock()) {
					spores = new ItemStack(ItemSmallFernSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockZygopterisShootPlaceable.block
					|| blockTarget == BlockZygopterisShoot.block) {
					spores = new ItemStack(ItemZygopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockRellimiaSpore.block) {
					spores = new ItemStack(ItemRellimiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockXenocladiaShoot.block
						|| blockTarget == BlockXenocladiaShootPlaceable.block) {
					spores = new ItemStack(ItemXenocladiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCalamophytonShoot.block
						|| blockTarget == BlockCalamophytonShootPlaceable.block) {
					spores = new ItemStack(ItemCalamophytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockLeclercqia.block) {
					spores = new ItemStack(ItemLeclercqiaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockEdwardsiphyton.block) {
					spores = new ItemStack(ItemEdwardsiphytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSelaginella.block) {
					spores = new ItemStack(ItemSelaginellaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAlliopteris.block) {
					spores = new ItemStack(ItemAlliopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockNemejcopteris.block) {
					spores = new ItemStack(ItemNemejcopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockRhyniaLandSpore.block
					|| blockTarget == BlockRhyniaWaterSpore.block) {
					spores = new ItemStack(ItemRhyniaSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockLycopiaTop.block) {
					if (iblockstate.getValue(BlockLycopiaTop.VAR) == 0 || iblockstate.getValue(BlockLycopiaTop.VAR) == 1) {
						spores = new ItemStack(ItemLycopiaSpores.block, (int) (1));
						collected = true;
					}
				}
				if (blockTarget == BlockCyclodendron.block) {
					spores = new ItemStack(ItemCyclodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPaurodendron.block) {
					spores = new ItemStack(ItemPaurodendronSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAridHorsetail.block) {
					spores = new ItemStack(ItemAridHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockAneurophytonShoot.block || blockTarget == BlockAneurophytonShootPlaceable.block) {
					spores = new ItemStack(ItemAneurophytonSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSwampHorsetailLand.block || blockTarget == BlockSwampHorsetailWater.block) {
					spores = new ItemStack(ItemSwampHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockSkaaripteris.block) {
					spores = new ItemStack(ItemSkaaripterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockScolecopteris.block) {
					spores = new ItemStack(ItemScolecopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockArthropitysLeaves.block) {
					spores = new ItemStack(ItemArthropitysSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockDictyophyllum.block) {
					spores = new ItemStack(ItemDictyophyllumSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockToditesShootPlaceable.block
						|| blockTarget == BlockToditesShoot.block) {
					spores = new ItemStack(ItemToditesSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockCladophlebis.block) {
					spores = new ItemStack(ItemCladophlebisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockClathropteris.block) {
					spores = new ItemStack(ItemClathropterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockConiopteris.block) {
					spores = new ItemStack(ItemConiopterisSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockXihuphyllum.block
					|| blockTarget == BlockXihuphyllum2.block
					|| blockTarget == BlockXihuphyllum3.block) {
					spores = new ItemStack(ItemXihuphyllumSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockLygodium.block) {
					spores = new ItemStack(ItemLygodiumSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockGrassyHorsetail.block) {
					spores = new ItemStack(ItemGrassyHorsetailSpores.block, (int) (1));
					collected = true;
				}
				if (blockTarget == BlockPachypteris.block
						|| blockTarget == BlockPachypterisTop.block
						|| blockTarget == BlockPachypterisStem.block) {
					spores = new ItemStack(ItemWeichseliaSpores.block, (int) (1));
					collected = true;
				}

				if (collected) {
					stack.shrink(1);
					if (!player.isCreative()) {
						if (player.inventory.getFirstEmptyStack() == -1) {
							//Is there room for this in an exsiting stack?
							int i = 1;
							int slotSpace = 0;
							while (i <= 32 && slotSpace == 0) {
								if (player.inventory.getStackInSlot(i).getItem() == spores.getItem()
										&& player.inventory.getStackInSlot(i).getCount() < spores.getMaxStackSize()) {
									spores.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(player, spores);
									slotSpace=i;
								}
								i += 1;
							}
							if (slotSpace == 0) { //No slots free in main inventory so just drop the item:
								entityToSpawn = new EntityItem(worldIn, target.getX() + 0.5, target.getY(), target.getZ() + 0.5, spores);
								entityToSpawn.setPickupDelay(10);
								worldIn.spawnEntity(entityToSpawn);
							}
						} else {
							spores.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(player, spores);
						}
					}

					return true;
				}
			}

			return false;
		}

	}

}
