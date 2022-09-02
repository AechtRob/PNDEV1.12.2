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
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Asteroceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Ceratites.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Coroniceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Cylolobus.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Dactylioceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Goniatites.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Manticoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Pachydesmoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Pachydiscus.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Parapuzosia.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAmmonite_Titanites.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellAphetoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellBasiloceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellCameroceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellCooperoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellCyrtoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellDeiroceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellEndoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellGonioceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellLituites.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellMooreoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellOrthoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellPhragmoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellRayonnoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellTemperoceras.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockNautiloidShellVestinautilus.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockArchaeocidaris.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockCidaroida.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockFurcaster.block, 1), new EntityVillager.PriceInfo(1, 2)));
        palaeoCareer.addTrade(1, new EntityVillager.ListItemForEmeralds(new ItemStack(BlockHelianthaster.block, 1), new EntityVillager.PriceInfo(1, 2)));

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
         palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilPrecambrian.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilPrecambrian.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilCambrian.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilCambrian.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilOrdovician.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilOrdovician.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilSilurian.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilSilurian.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilDevonian.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilDevonian.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilCarboniferous.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilCarboniferous.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilPermian.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilPermian.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilTriassic.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilTriassic.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilJurassic.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilJurassic.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilCretaceous.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilCretaceous.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilPaleogene.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilPaleogene.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilNeogene.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilNeogene.block), new EntityVillager.PriceInfo(1, 1)));
        palaeoCareer.addTrade(3, new EntityVillager.EmeraldForItems(Item.getItemFromBlock(BlockFossilPleistocene.block), new EntityVillager.PriceInfo(4, 4)));
        palaeoCareer.addTrade(3, new EntityVillager.ListItemForEmeralds(Item.getItemFromBlock(BlockFossilPleistocene.block), new EntityVillager.PriceInfo(1, 1)));

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