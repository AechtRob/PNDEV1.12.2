
package net.lepidodendron.entity;

import net.ilexiconn.llibrary.client.model.tools.ChainBuffer;
import net.ilexiconn.llibrary.server.animation.Animation;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGlassJar;
import net.lepidodendron.entity.ai.DietString;
import net.lepidodendron.entity.render.entity.LayerGerarusWing;
import net.lepidodendron.entity.render.entity.RenderGerarus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.lepidodendron.entity.util.ITrappableAir;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;

public class EntityPrehistoricFloraGerarusInsect extends EntityPrehistoricFloraArchoblattinaInsect implements ITrappableAir {

	public BlockPos currentTarget;
	@SideOnly(Side.CLIENT)
	public ChainBuffer chainBuffer;
	private int animationTick;
	private Animation animation = NO_ANIMATION;

	public final EntityDamageSource SPIKY = new EntityDamageSource("spiky", this);

	public EntityPrehistoricFloraGerarusInsect(World world) {
		super(world);
		setSize(0.18F, 0.145F);
	}

	@Nullable
	@Override
	public CustomTrigger getModTrigger() {
		return ModTriggers.CLICK_GERARUS;
	}

	@Override
	public String[] getFoodOreDicts() {
		return ArrayUtils.addAll(DietString.PLANTS);
	}

	@Override
	public boolean canJar() {
		return true;
	}

	@Override
	public int defaultFlyCooldown() {
		return 5000;
	}

	@Override
	public int defaultWanderCooldown() {
		return 0;
	}

	public static String getPeriod() {return "Carboniferous";}

	//public static String getHabitat() {return "Terrestrial";}

	@Override
	protected void collideWithEntity(Entity entityIn) {
		super.collideWithEntity(entityIn);
		if (entityIn instanceof EntityPlayer) {
			entityIn.attackEntityFrom(SPIKY, (float) 2);
		}
	}

	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if (itemstack.isEmpty())
		{
			player.attackEntityFrom(SPIKY, (float) 2);
		}

		return super.processInteract(player, hand);
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source.getImmediateSource() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) source.getImmediateSource();
			player.attackEntityFrom(SPIKY, (float) 2);
		}

		return super.attackEntityFrom(source, amount);
	}

//	@Override
//	public String tagEgg () {
//		return "insect_eggs_gerarus";
//	}

	@Nullable
	protected ResourceLocation getLootTable() { return LepidodendronMod.BUG_LOOT;}

	@Override
	protected void dropLoot(boolean wasRecentlyHit, int lootingModifier, DamageSource source)
	{
		if (source == BlockGlassJar.BlockCustom.FREEZE) {
			//System.err.println("Jar loot!");
			ResourceLocation resourcelocation = LepidodendronMod.GERARUS_LOOT;
			LootTable loottable = this.world.getLootTableManager().getLootTableFromLocation(resourcelocation);
			LootContext.Builder lootcontext$builder = (new LootContext.Builder((WorldServer)this.world)).withLootedEntity(this).withDamageSource(source);
			for (ItemStack itemstack : loottable.generateLootForPools(this.rand, lootcontext$builder.build()))
			{
				NBTTagCompound variantNBT = new NBTTagCompound();
				variantNBT.setString("PNType", "");
				String stringEgg = EntityRegistry.getEntry(this.getClass()).getRegistryName().toString();
				variantNBT.setString("PNDisplaycase", stringEgg);
				itemstack.setTagCompound(variantNBT);
				this.entityDropItem(itemstack, 0.0F);
			}
		}
		else {
			super.dropLoot(wasRecentlyHit, lootingModifier, source);
		}

	}

	//Rendering taxidermy:
	//--------------------
	public static double offsetCase(@Nullable String variant) {
		return 0.32F;
	}
	public static double offsetCaseMagnified(@Nullable String variant) { return 1.12; }
	public static double offsetWall(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbackverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double upperbacklineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontverticallinedepth(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbackverticallinedepth(@Nullable String variant) {
		return 0.25;
	}
	public static double lowerfrontlineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerfrontlineoffsetperpendiular(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffset(@Nullable String variant) {
		return 0.0;
	}
	public static double lowerbacklineoffsetperpendiular(@Nullable String variant) {
		return -0.0;
	}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplay(@Nullable String variant) {return RenderGerarus.TEXTURE;}
	@SideOnly(Side.CLIENT)
	public static ResourceLocation textureDisplayTransparent(@Nullable String variant) {
		return LayerGerarusWing.TEXTURE;
	}
	@SideOnly(Side.CLIENT)
	public static ModelBase modelDisplay(@Nullable String variant) {return RenderDisplays.modelGerarus;}
	public static float getScaler(@Nullable String variant) {
		return RenderGerarus.getScaler();
	}
	public static float widthSupport(@Nullable String variant) {return 0.012F;}
	public static float getScalerMagnified(@Nullable String variant) {
		return RenderGerarus.getScaler() * 3.0F;
	}

}