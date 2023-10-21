package net.lepidodendron.item;

import com.google.common.collect.Multimap;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockFossil;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
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
public class ItemFossilHammer extends ElementsLepidodendronMod.ModElement {
    @GameRegistry.ObjectHolder("lepidodendron:fossil_hammer")
    public static final Item block = null;
    public ItemFossilHammer(ElementsLepidodendronMod instance) {
        super(instance, LepidodendronSorter.fossil_hammer);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemToolCustom() {
        }.setTranslationKey("pf_fossil_hammer").setRegistryName("fossil_hammer").setCreativeTab(TabLepidodendronPlants.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:fossil_hammer", "inventory"));
    }

    private static class ItemToolCustom extends ItemPickaxe {
        protected ItemToolCustom() {
            super(ToolMaterial.IRON);
            setMaxDamage(500);
            setMaxStackSize(1);
            this.efficiency = 4.0F;
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
                multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Tool modifier", 0f, 0));
                multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Tool modifier", -3, 0));
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
                        stack.damageItem(2, entityLiving);
                    }
                }
                else {
                    stack.damageItem(5, entityLiving);
                }
            }
            return (state.getBlock() instanceof BlockFossil);
        }

        @Override
        public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
            return 2;
        }

        @Override
        public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
            if (attacker instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) attacker;
                if (!player.capabilities.isCreativeMode) {
                    stack.damageItem(2, attacker);
                }
            }
            else {
                stack.damageItem(2, attacker);
            }
            return true;
        }

        @Override
        public boolean isFull3D() {
            return true;
        }

        @Override
        public float getDestroySpeed(ItemStack stack, IBlockState state)
        {
            Material material = state.getMaterial();
            return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? 1.0F : this.efficiency;
        }

    }
}

