package net.lepidodendron.palaeobotanist.entity;

import net.lepidodendron.block.*;
import net.lepidodendron.enchantments.Enchantments;
import net.lepidodendron.item.ItemBottleOfResin;
import net.lepidodendron.item.ItemFossilHammer;
import net.lepidodendron.item.ItemHerbicide;
import net.lepidodendron.item.ItemSporeCollectionEnvelope;
import net.lepidodendron.palaeobotanist.village.PalaeobotanistHouse;
import net.lepidodendron.palaeobotanist.village.VillageComponentPalaeobotanistHouse;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

import java.util.Random;

public class Villager {
    public static final VillagerRegistry.VillagerProfession PALAEOBOTANIST_PROFESSION = new VillagerRegistry.VillagerProfession("lepidodendron:palaeobotanist", "lepidodendron:textures/entities/villager_palaeobotanist.png", "lepidodendron:textures/entities/villager_palaeobotanist_zombie.png");

    public static void register() {
        VillagerRegistry.VillagerCareer palaeoCareer = new VillagerRegistry.VillagerCareer(PALAEOBOTANIST_PROFESSION, "palaeobotanist");

        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.LEAVES), new EntityVillager.PriceInfo(32, 32)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.LEAVES2), new EntityVillager.PriceInfo(32, 32)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.GLASS), new EntityVillager.PriceInfo(16, 16)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Items.FLOWER_POT, new EntityVillager.PriceInfo(8, 8)));
        palaeoCareer.addTrade(1, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockHayThatchBundle.block), new EntityVillager.PriceInfo(8, 8)));

        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockBalticAmberOre.block), new EntityVillager.PriceInfo(6, 6)));
        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockDominicanAmberOre.block), new EntityVillager.PriceInfo(6, 6)));
        palaeoCareer.addTrade(2, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockAraucarioxylonLogPetrified.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(2, new EntityVillager.ListItemForEmeralds(new ItemStack(ItemHerbicide.block, 3), new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(ItemFossilHammer.block, new EntityVillager.PriceInfo(2, 3)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(ItemBottleOfResin.block, new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockPlantFossil.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockPlantFossil.block), new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(4, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(Blocks.SPONGE), new EntityVillager.PriceInfo(16, 16)));
        palaeoCareer.addTrade(4, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(Blocks.SPONGE), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(4, new EntityVillager.ListItemForEmeralds(ItemSporeCollectionEnvelope.block, new EntityVillager.PriceInfo(1, 1)));

        palaeoCareer.addTrade(5, new ListEnchantedBookForEmeralds(Enchantments.TIME_REVERSAL, new EntityVillager.PriceInfo(64, 64)));

        MapGenStructureIO.registerStructureComponent(VillageComponentPalaeobotanistHouse.class, "palaeobotanisthouse");
        VillagerRegistry.instance().registerVillageCreationHandler(new PalaeobotanistHouse());
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