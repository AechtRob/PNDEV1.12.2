package net.lepidodendron.util;

import net.lepidodendron.block.BlockSorterFossil;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.wrapper.InvWrapper;

import javax.annotation.Nonnull;

public class FossilSorterItemHandler extends InvWrapper
{
    private final BlockSorterFossil.TileEntitySorterFossil hopper;

    public FossilSorterItemHandler(BlockSorterFossil.TileEntitySorterFossil hopper)
    {
        super(hopper);
        this.hopper = hopper;
    }

    @Override
    @Nonnull
    public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate)
    {
        if (simulate)
        {
            return super.insertItem(slot, stack, simulate);
        }
        else
        {
            boolean wasEmpty = getInv().isEmpty();

            int originalStackSize = stack.getCount();
            stack = super.insertItem(slot, stack, simulate);

            if (wasEmpty && originalStackSize > stack.getCount())
            {
                if (!hopper.mayTransfer())
                {
                    // This cooldown is always set to 8 in vanilla with one exception:
                    // Hopper -> Hopper transfer sets this cooldown to 7 when this hopper
                    // has not been updated as recently as the one pushing items into it.
                    // This vanilla behavior is preserved by VanillaInventoryCodeHooks#insertStack,
                    // the cooldown is set properly by the hopper that is pushing items into this one.
                    hopper.setTransferCooldown(8);
                }
            }

            return stack;
        }
    }
}