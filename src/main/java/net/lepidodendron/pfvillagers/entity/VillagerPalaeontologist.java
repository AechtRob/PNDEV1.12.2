package net.lepidodendron.pfvillagers.entity;

import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.lepidodendron.pfvillagers.village.PalaeontologistHouse;
import net.lepidodendron.pfvillagers.village.VillageComponentPalaeontologistHouse;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

import java.util.Random;

public class VillagerPalaeontologist {
    public static final VillagerRegistry.VillagerProfession PALAEONTOLOGIST_PROFESSION = new VillagerRegistry.VillagerProfession("lepidodendron:pn_palaeontologist", "lepidodendron:textures/entities/villager_palaeontologist.png", "lepidodendron:textures/entities/villager_palaeontologist_zombie.png");

    public static void register() {
        VillagerRegistry.VillagerCareer palaeoCareer = new VillagerRegistry.VillagerCareer(PALAEONTOLOGIST_PROFESSION, "pn_palaeontologist");

        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.IRON_BARS), new EntityVillager.PriceInfo(2, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Items.REDSTONE, new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Items.IRON_INGOT, new EntityVillager.PriceInfo(1, 1)));

        //Temporary trades:
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemPetrifiedPrototaxites.block, 1), new EntityVillager.PriceInfo(2, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemPetrifiedArchaeopterisSapling.block, 1), new EntityVillager.PriceInfo(2, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemPetrifiedCalamitesSapling.block, 1), new EntityVillager.PriceInfo(2, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemPetrifiedGlossopterisSapling.block, 1), new EntityVillager.PriceInfo(2, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemPetrifiedDicroidiumFSapling.block, 1), new EntityVillager.PriceInfo(2, 2)));


        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockBalticAmberOre.block), new EntityVillager.PriceInfo(6, 6)));
        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockDominicanAmberOre.block), new EntityVillager.PriceInfo(6, 6)));
        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockAraucarioxylonLogPetrified.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(2, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemGlassJarItem.block, 3), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(2, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemCageSmallItem.block, 2), new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(ItemFossilHammer.block, new EntityVillager.PriceInfo(2, 3)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(ItemBottleOfResin.block, new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockPlantFossil.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockPlantFossil.block), new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(4, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.SPONGE), new EntityVillager.PriceInfo(16, 16)));
        palaeoCareer.addTrade(4, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.SPONGE), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(4, new EntityVillager.ListItemForEmeralds(ItemPhial.block, new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(5, new ListEnchantedBookForEmeralds(Enchantments.SILK_TOUCH, new EntityVillager.PriceInfo(16, 16)));

        MapGenStructureIO.registerStructureComponent(VillageComponentPalaeontologistHouse.class, "Palaeontologisthouse");
        VillagerRegistry.instance().registerVillageCreationHandler(new PalaeontologistHouse());
    }

    public static class ListEnchantedBookForEmeralds implements EntityVillager.ITradeList {
        public ItemStack enchantedItemStack;
        public EntityVillager.PriceInfo priceInfo;
        private Enchantment enchantment;

        public ListEnchantedBookForEmeralds(Enchantment enchant, EntityVillager.PriceInfo priceInfo) {
            this.enchantedItemStack = new ItemStack(Items.ENCHANTED_BOOK);
            this.priceInfo = priceInfo;
            this.enchantment = enchant;
        }

        public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) {
            int i = 1;

            if (this.priceInfo != null) {
                i = this.priceInfo.getPrice(random);
            }

            ItemStack itemstack = new ItemStack(Items.EMERALD, i, 0);
            ItemStack soldBook = this.enchantedItemStack.copy();
            ItemEnchantedBook.addEnchantment(soldBook, new EnchantmentData(enchantment, 1 + random.nextInt(2)));
            recipeList.add(new MerchantRecipe(itemstack, soldBook));
        }
    }
}