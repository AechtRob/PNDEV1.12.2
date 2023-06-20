
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemGlassJarItem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:glass_jar_item")
	public static final Item block = null;
	public ItemGlassJarItem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.glass_jar_item);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:spore_collection_envelope", "inventory"));

		ModelBakery.registerItemVariants(block,
				new ModelResourceLocation("lepidodendron:glass_jar_item", "inventory"),
				new ModelResourceLocation("lepidodendron:glass_jar_item_full", "inventory")

		);

		ModelLoader.setCustomMeshDefinition(block, stack -> {
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().getString("mob_name") != null) {
					if (!stack.getTagCompound().getString("mob_name").equalsIgnoreCase(""))
						return new ModelResourceLocation("lepidodendron:glass_jar_item_full", "inventory");
				}
			}
			return new ModelResourceLocation("lepidodendron:glass_jar_item", "inventory");
		});
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_glass_jar_item");
			setRegistryName("glass_jar_item");
			setCreativeTab(TabLepidodendronMisc.tab);
			setMaxStackSize(16);
		}

		public static boolean isTargetInList(EntityLivingBase target) {
			if (target == null) {
				return false;
			}
			if (target instanceof EntityPrehistoricFloraAgeableBase) {
				EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) target;
				if (e.canJar()) {
					return true;
				}
			}
			else if (target instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
				EntityPrehistoricFloraCrawlingFlyingInsectBase e = (EntityPrehistoricFloraCrawlingFlyingInsectBase) target;
				if (e.canJar()) {
					return true;
				}
			}
			else if (target instanceof EntityPrehistoricFloraInsectFlyingBase) {
				EntityPrehistoricFloraInsectFlyingBase e = (EntityPrehistoricFloraInsectFlyingBase) target;
				if (e.canJar()) {
					return true;
				}
			}

			String[] MobString = LepidodendronConfig.jarMobs;
			if (Arrays.asList(MobString).contains(EntityList.getKey(target).toString())) {
				return true;
			}
			return false;
		}

		@Override
		public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target, EnumHand hand) {
			//If we are holding an empty jar we can click on an entity:
			if (isEntityFromItemStack(stack)) {
				return super.itemInteractionForEntity(stack, playerIn, target, hand);
			}
			else if (isTargetInList(target)) { //catch the mob
				ItemStack stackJar = new ItemStack(ItemGlassJarItem.block, (int) (1));
				stackJar.setCount(1);
				stack.shrink(1);
				//Pick up this entity with the Jar:
				ItemHandlerHelper.giveItemToPlayer(playerIn, BlockGlassJar.BlockCustom.createJarWithEntity(target));
				if ((playerIn instanceof EntityPlayerMP)) {
					ModTriggers.USE_JAR.trigger((EntityPlayerMP) playerIn);
				}
			}
			return super.itemInteractionForEntity(stack, playerIn, target, hand);
		}

		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	    {

			IBlockState iblockstate = worldIn.getBlockState(pos);
			Block block = iblockstate.getBlock();

			if (!block.isReplaceable(worldIn, pos))
			{
				pos = pos.offset(facing);
			}

			ItemStack itemstack = player.getHeldItem(hand);

			if (player.canPlayerEdit(pos, facing, itemstack) && BlockGlassJar.block.canPlaceBlockAt(worldIn, pos)) {
				if (placejar(worldIn, pos, BlockGlassJar.block, itemstack, player)) {
					SoundType soundtype = worldIn.getBlockState(pos).getBlock().getSoundType(worldIn.getBlockState(pos), worldIn, pos, player);
					worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
					itemstack.setTagCompound(null); //Necessary as the UID of the creatures would otherwise be duplicated and not work properly
					itemstack.shrink(1);
					return EnumActionResult.SUCCESS;
				}
				else {
					return EnumActionResult.FAIL;
				}
			}
			else
			{
				return EnumActionResult.FAIL;
			}

	    }

		@Override
		@SideOnly(Side.CLIENT)
		public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
		{
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("mob_name")) {
					tooltip.add("Contains : " + stack.getTagCompound().getString("mob_name"));
				}
			}
		}
	
	    public static boolean placejar(World worldIn, BlockPos pos, Block jar, ItemStack stack, EntityPlayer player)
	    {
			List<Entity> entity = worldIn.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(pos));

			//Is there an entity here?
			if (!entity.isEmpty()) {
				//No room to place this jar:
				return false;
			}
			//Place jar containing its Entity:
			IBlockState iblockstate = jar.getDefaultState();
			worldIn.setBlockState(pos, iblockstate, 3);
			worldIn.notifyNeighborsOfStateChange(pos, jar, false);
			if (stack.hasTagCompound()) { //Add the mob if there was one:
				spawnEntityFromItemStack(stack, worldIn, pos.getX() + 0.5D, pos.getY() + 0.0625D, pos.getZ() + 0.5D);
			}
			return true;
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

	}
}
