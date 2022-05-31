
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemUnknownPlanula extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:planula_unknown")
	public static final Item block = null;
	public ItemUnknownPlanula(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.planula_unknown);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/planula_unknown", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_planula_unknown");
			setRegistryName("planula_unknown");
			setCreativeTab(TabLepidodendronMobile.tab);
			setMaxStackSize(1);
		}

		public String getTranslationKey(ItemStack stack)
		{
			String stringEgg = ((stack).hasTagCompound() ? (stack).getTagCompound().getString("creature") : null);
			if (stringEgg != null) {
				stringEgg = stringEgg.replace(LepidodendronMod.MODID.toString() + ":", "planula_");
				return "item." + stringEgg;
			}
			return super.getTranslationKey(stack);
		}

		public Class getEggClassfromNBT(ItemStack itemstack) {
			Class classEgg = null;
			String stringEgg = ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("creature") : null);
			if (stringEgg != null) {
				classEgg = findEntity(stringEgg);
			}
			return classEgg;
		}

		private static Class<? extends Entity> findEntity(String entity) {
			Class<? extends Entity> entityClass;
			EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
			entityClass = ee == null ? null : ee.getEntityClass();
			if (entityClass == null) {
				return null;
			}
			return entityClass;
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);
	        RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

	        if (raytraceresult == null)
	        {
	            return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	        }
	        else
	        {
	            if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
	            {
	                BlockPos blockpos = raytraceresult.getBlockPos();

	                if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
	                {
	                    return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	                }

	                IBlockState iblockstate = worldIn.getBlockState(blockpos);

					if (iblockstate.getMaterial() == Material.WATER) {
						String nbtStr = "";
						Entity entity = EntityList.createEntityByIDFromName(EntityList.getKey(getEggClassfromNBT(itemstack)), worldIn);
						if (entity instanceof EntityPrehistoricFloraAgeableBase) {
							nbtStr = "{AgeTicks:0}";
						}
						if (!(worldIn.isRemote)) {
							EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEggClassfromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5);
						}
						if (!playerIn.capabilities.isCreativeMode) {
							itemstack.shrink(1);
						}
						playerIn.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(playerIn, blockpos, SoundEvents.ENTITY_BOBBER_SPLASH, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
	            }
	
	            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	        }
	    }
	}

}
