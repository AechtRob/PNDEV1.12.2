package net.lepidodendron.item;

import com.google.common.collect.Multimap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockFossil;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemTaxidermyScalpel extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:taxidermy_scalpel")
    public static final Item block = null;
    public ItemTaxidermyScalpel(ElementsLepidodendronMod instance) {
        super(instance, LepidodendronSorter.taxidermy_scalpel);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemTaxidermyScalpel.ItemCustom());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:taxidermy_scalpel", "inventory"));
    }

    private static class ItemCustom extends Item {
        protected ItemCustom() {
            setMaxDamage(200);
            setMaxStackSize(1);
            setTranslationKey("pf_taxidermy_scalpel");
            setRegistryName("taxidermy_scalpel");
            this.setCreativeTab(TabLepidodendronMisc.tab);
        }

        @Override
        @Nullable
        public CreativeTabs getCreativeTab()
        {
            return TabLepidodendronMisc.tab;
        }

        @Override
        public Multimap<String, AttributeModifier> getItemAttributeModifiers(EntityEquipmentSlot equipmentSlot) {
            Multimap<String, AttributeModifier> multimap = super.getItemAttributeModifiers(equipmentSlot);
            if (equipmentSlot == EntityEquipmentSlot.MAINHAND) {
                multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 2f, 0));
            }
            return multimap;
        }

        @Override
        public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState state, BlockPos pos, EntityLivingBase entityLiving) {
            if (!worldIn.isRemote)
            {
                if (entityLiving instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) entityLiving;
                    if (!player.capabilities.isCreativeMode) {
                        stack.damageItem(40, entityLiving);
                    }
                }
                else {
                    stack.damageItem(40, entityLiving);
                }
            }
            return (state.getBlock() instanceof BlockFossil);
        }

        public boolean canHarvestBlock(IBlockState blockIn)
        {
            return false;
        }

        @Override
        public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
            if (attacker instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) attacker;
                if (!player.capabilities.isCreativeMode) {
                    stack.damageItem(20, attacker);
                }
            }
            else {
                stack.damageItem(20, attacker);
            }
            return true;
        }

        @Override
        public boolean isFull3D() {
            return true;
        }

    }
}

