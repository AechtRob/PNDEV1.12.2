//package net.lepidodendron.pfvillagers.entity;
//
//import net.minecraft.entity.IMerchant;
//import net.minecraft.entity.passive.EntityVillager;
//import net.minecraft.init.Items;
//import net.minecraft.item.ItemStack;
//import net.minecraft.village.MerchantRecipe;
//import net.minecraft.village.MerchantRecipeList;
//
//import java.util.Random;
//
//public class ListItemForEmeraldsNBT extends EntityVillager.ListItemForEmeralds {
//
//    public ListItemForEmeraldsNBT(ItemStack stack, EntityVillager.PriceInfo priceInfo) {
//        super(stack, priceInfo);
//    }
//
//    @Override
//    public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random)
//    {
//        int i = 1;
//
//        if (this.priceInfo != null)
//        {
//            i = this.priceInfo.getPrice(random);
//        }
//
//        ItemStack itemstack;
//        ItemStack itemstack1;
//
//        itemstack = new ItemStack(Items.EMERALD, i, 0);
//        itemstack1 = this.itemToBuy;
//
//        recipeList.add(new MerchantRecipe(itemstack, itemstack1));
//    }
//
//}
