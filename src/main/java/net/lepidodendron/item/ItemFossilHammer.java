package net.lepidodendron.item;

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockPlantFossil;
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
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
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
    private static class ItemToolCustom extends ItemTool {
        protected ItemToolCustom() {
            super(ToolMaterial.IRON, Sets.newHashSet(BlockPlantFossil.block));
            setMaxDamage(500);
            setMaxStackSize(1);
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
                        stack.damageItem(5, entityLiving);
                    }
                }
                else {
                    stack.damageItem(5, entityLiving);
                }
            }
            return (state.getBlock() == BlockPlantFossil.block);
        }

        public boolean canHarvestBlock(IBlockState blockIn)
        {
            return blockIn.getBlock() == BlockPlantFossil.block;
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
            return material != Material.IRON && material != Material.ANVIL && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
        }

    }
}

