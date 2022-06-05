package net.lepidodendron;

import net.lepidodendron.util.EnumBiomeTypeCarboniferous;
import net.lepidodendron.util.EnumBiomeTypeDevonian;
import net.lepidodendron.util.EnumBiomeTypeJurassic;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.devonian.BiomeDevonianSpikes;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LepidodendronFogSubscribers {

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void fogEvent(EntityViewRenderEvent.RenderFogEvent event) {

		Entity player = event.getEntity();
		double y = player.posY;
		Block b = event.getState().getBlock();

		if (!LepidodendronConfig.renderFog) {
			return;
		}

		if (player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPermian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCretaceous) {
			return;
		}

		if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER && event.getState().getBlock() != Blocks.LAVA) {

			GlStateManager.setFog(GlStateManager.FogMode.LINEAR);
			//GlStateManager.setFogDensity(0);

			float f1 = event.getFarPlaneDistance();
			float near;
			float far;

			int[] ranges = ForgeModContainer.blendRanges;
			GameSettings settings = Minecraft.getMinecraft().gameSettings;
			int distance = 0;
			if (ranges.length > 0) {
				distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, ranges.length - 1)];
			}

			int divider = 0;
			float fog = 0;
			for (int x = -distance; x <= distance; ++x) {
				for (int z = -distance; z <= distance; ++z) {
					BlockPos pos = player.getPosition().add(x, 0, z);
					Biome biome = player.world.getBiome(pos);
					float density = this.getFogDensity(player);
					float biomeFog = getBiomeFactor(biome);
					float foggy = biomeFog + (density * 5000F);
					fog += 0.75f * f1 * (2.00f - Math.pow(foggy, 2) / 10000f);
					divider++;
				}
			}

			near = (fog / (float) divider);
			far = f1;

			GlStateManager.setFogDensity(this.getFogDensity(player));

			//if (event.getFogMode() == -1) {
			//	GlStateManager.setFogStart(0.0F);
			//	GlStateManager.setFogEnd(far);
			//} else {

				GlStateManager.setFogStart(near * 0.05F);
				GlStateManager.setFogEnd(far * 0.5F);

			//}

			//if (GLContext.getCapabilities().GL_NV_fog_distance) {
			//	GlStateManager.glFogi(34138, 34139);
			//}

			//GlStateManager.setFogStart(near * 0.25F);
			//GlStateManager.setFogEnd(far);
			//GlStateManager.setFogDensity(0);
			//GlStateManager.setFogDensity(getFogDensity(b, player, world.getBiome(player.getPosition()), world, world.getBlockState(player.getPosition())));

		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEvent(EntityViewRenderEvent.FogColors event) {

		if (LepidodendronConfig.renderFog) {
			Entity player = event.getEntity();
			World world = player.getEntityWorld();
			//Biome biome = player.world.getBiome(player.getPosition());
			IBlockState state = world.getBlockState(player.getPosition());
			Block b = state.getBlock();
			//Vec3d worldFog = world.getFogColor(0);

			float red = 0;
			float green = 0;
			float blue = 0;

			if (world.isRemote && (player instanceof EntityPlayer)) {
				if (world.provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| world.provider.getDimension() == LepidodendronConfig.dimCambrian
						|| world.provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| world.provider.getDimension() == LepidodendronConfig.dimSilurian
						|| world.provider.getDimension() == LepidodendronConfig.dimDevonian
						|| world.provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| world.provider.getDimension() == LepidodendronConfig.dimPermian
						|| world.provider.getDimension() == LepidodendronConfig.dimTriassic
						|| player.world.provider.getDimension() == LepidodendronConfig.dimJurassic
				) {
					if (!(player instanceof EntityLivingBase && ((EntityLivingBase) player).isPotionActive(MobEffects.BLINDNESS))) {
						if (!((b instanceof BlockLiquid) || (b instanceof BlockFluidBase) || state.getMaterial() == Material.WATER)) {

							GameSettings settings = Minecraft.getMinecraft().gameSettings;
							int[] ranges = ForgeModContainer.blendRanges;
							int distance = 0;
							if (ranges.length > 0)
							{
								distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, ranges.length-1)];
							}
							int divider = 0;
							for (int x = -distance; x <= distance; ++x)
							{
								for (int z = -distance; z <= distance; ++z)
								{
									BlockPos pos = player.getPosition().add(x, 0, z);
									Biome biome = player.world.getBiome(pos);
									Vec3d fogColor = getBiomeFogColors(world, biome, (float) event.getRenderPartialTicks());
									red += fogColor.x;
									green += fogColor.y;
									blue += fogColor.z;
									divider++;
								}
							}

							float rain = world.getRainStrength((float) event.getRenderPartialTicks());
							float thunder = world.getThunderStrength((float) event.getRenderPartialTicks());

							red *= (1.0F - rain * 0.5F)*(1.0F - thunder * 0.5F);
							green *= (1.0F - rain * 0.5F)*(1.0F - thunder * 0.5F);
							blue *= (1.0F - rain * 0.4F)*(1.0F - thunder * 0.5F);
							//System.out.println("Red: "+red+" Green:"+green+" Blue: "+blue);
							// int multiplier = (red / divider & 255) << 16 | (green / divider & 255) << 8 | blue / divider & 255;
							event.setRed(red/divider);
							event.setGreen(green/divider);
							event.setBlue(blue/divider);
						}
					}
				}
			}
		}
	}

	private Vec3d getBiomeFogColors(World world, Biome biome, float partialTicks) {
		Vec3d worldFog = world.getFogColor(partialTicks);

		double r = 0;
		double g = 0;
		double b = 0;

		if (biome == BiomePermianFloodbasalt.biome) {
			r = 96D/255D;
			g = 96D/255D;
			b = 96D/255D;
			Vec3d fog = new Vec3d(r,g,b);
			//System.out.println("Fog: "+fog.x);
			return fog;
		}
		if (biome == BiomePermianFloodbasaltEdge.biome) {
			r = 192D/255D;
			g = 192D/255D;
			b = 192D/255D;
			Vec3d fog = new Vec3d(r,g,b);
			//System.out.println("Fog: "+fog.x);
			return fog;
		}

		r = worldFog.x;
		g = worldFog.y;
		b = worldFog.z;
		Vec3d fog = new Vec3d(r,g,b);
		return fog;
	}

	private float getBiomeFactor(Biome biome) {
		if (biome == BiomeDevonianSpikes.biome) {
			return 150;
		}
		if (biome == BiomePermianMountains.biome) {
			return 150;
		}
		if (biome == BiomePermianHighlands.biome) {
			return 150;
		}
		if (biome instanceof BiomePermian) {
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
					|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
				return 150;
			}
		}
		if (biome instanceof BiomeCarboniferous) {
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh) {
				return 200;
			}
		}
		if (biome instanceof BiomeJurassic) {
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Redwood) {
				return 150;
			}
		}
		return 100;
	}


	public float getFogDensity(Entity player) {

		if (LepidodendronConfig.renderFog) {

			//EntityPlayer player = Minecraft.getMinecraft().player;
			//Block b = event.getState().getBlock();
			//Entity player = event.getEntity();
			World world = player.getEntityWorld();
			Biome biome = player.world.getBiome(player.getPosition());
			IBlockState state = world.getBlockState(player.getPosition());
			Block b = state.getBlock();

			int fogBottom = 78;
			int fogTop = 98;
			float backgroundFog = 0.0000F;
			float fullFogAddition = 0.0985F;
			float fog = 0;
			float fog1 = 0;

			if (world.isRemote && (player instanceof EntityPlayer)) {
				if (world.provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| world.provider.getDimension() == LepidodendronConfig.dimCambrian
						|| world.provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| world.provider.getDimension() == LepidodendronConfig.dimSilurian
						|| world.provider.getDimension() == LepidodendronConfig.dimDevonian
						|| world.provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| world.provider.getDimension() == LepidodendronConfig.dimPermian
						|| world.provider.getDimension() == LepidodendronConfig.dimTriassic
						|| player.world.provider.getDimension() == LepidodendronConfig.dimJurassic
				) {
					if (!(player instanceof EntityLivingBase && ((EntityLivingBase) player).isPotionActive(MobEffects.BLINDNESS))) {
						if (!((b instanceof BlockLiquid) || (b instanceof BlockFluidBase) || state.getMaterial() == Material.WATER)) {

							if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome == BiomeDevonianSpikes.biome && player.posY > player.world.getSeaLevel()) {
								fogBottom = 120;
								fogTop = 175;
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& (biome == BiomePermianMountains.biome || biome == BiomePermianHighlands.biome) && player.posY >= player.world.getSeaLevel() - 4
									&& player.posY <= fogTop) {
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& (biome == BiomePermianMountains.biome || biome == BiomePermianHighlands.biome) && player.posY >= player.world.getSeaLevel() - 4
									&& player.posY > fogTop) {
								int fogTopFree = 125;
								fog = backgroundFog + fullFogAddition - (fullFogAddition * ((float) (Math.min(fogTopFree - fogTop, Math.max(0, player.posY - fogTop)) / (fogTopFree - fogTop))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome instanceof BiomePermian && player.posY >= player.world.getSeaLevel() - 4) {
								BiomePermian biomePermian = (BiomePermian) biome;
								if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
										|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome instanceof BiomeCarboniferous && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
								if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
										|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome instanceof BiomeDevonian && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
								if (biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Swamp) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome instanceof BiomeJurassic && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
								if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Redwood) {
									fog = backgroundFog * 4F;
								}
							}

							if (player.world.provider.doesXZShowFog((int) player.posX, (int) player.posZ) && player.posY > player.world.getSeaLevel()) {
								fog1 = backgroundFog + fullFogAddition;
								if (player.world.isRainingAt(new BlockPos(player.getPosition()))) {
									float d = player.world.rainingStrength;
									fog1 = fog1 * d;
								}
							} else if (player.posY < player.world.getSeaLevel() - 4) {
								fog1 = backgroundFog * 2F;
								fog = backgroundFog * 2F;
							} else {
								fog1 = backgroundFog;
							}

							return (float) Math.max((double) fog, (double) fog1);
							//GlStateManager.setFog(GlStateManager.FogMode.EXP2);
							//System.err.println("Render fog: " + doFog);
							//event.setDensity((float) doFog);
							//event.setCanceled(true);
						}
					}
				}
			}
		}
		return 0F;
	}





	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEvent(EntityViewRenderEvent.FogDensity event) {

		//NB NOT BEING USED:
		if (LepidodendronConfig.renderFog && 1 == 2) {

			//EntityPlayer player = Minecraft.getMinecraft().player;
			Block b = event.getState().getBlock();
			Entity player = event.getEntity();
			Biome biome = player.world.getBiome(player.getPosition());

			int fogBottom = 78;
			int fogTop = 98;
			float backgroundFog = 0.0025F;
			float fullFogAddition = 0.0985F;
			float fog = 0;
			float fog1 = 0;

			if (event.getEntity().world.isRemote && (player instanceof EntityPlayer)) {
				if (event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimCambrian
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimSilurian
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimDevonian
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimPermian
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimTriassic
						|| event.getEntity().world.provider.getDimension() == LepidodendronConfig.dimJurassic
				) {
					if (!(player instanceof EntityLivingBase && ((EntityLivingBase) player).isPotionActive(MobEffects.BLINDNESS))) {
						if (!((b instanceof BlockLiquid) || (b instanceof BlockFluidBase) || event.getState().getMaterial() == Material.WATER)) {

							if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& biome == BiomeDevonianSpikes.biome && player.posY > player.world.getSeaLevel()) {
								fogBottom = 120;
								fogTop = 175;
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& (biome == BiomePermianMountains.biome || biome == BiomePermianHighlands.biome) && player.posY >= player.world.getSeaLevel() - 4
									&& player.posY <= fogTop) {
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& (biome == BiomePermianMountains.biome || biome == BiomePermianHighlands.biome) && player.posY >= player.world.getSeaLevel() - 4
									&& player.posY > fogTop) {
								int fogTopFree = 125;
								fog = backgroundFog + fullFogAddition - (fullFogAddition * ((float) (Math.min(fogTopFree - fogTop, Math.max(0, player.posY - fogTop)) / (fogTopFree - fogTop))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& biome instanceof BiomePermian && player.posY >= player.world.getSeaLevel() - 4) {
								BiomePermian biomePermian = (BiomePermian) biome;
								if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
										|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && event.getState().getMaterial() != Material.WATER)
									&& biome instanceof BiomeCarboniferous && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
								if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
									|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && event.getState().getMaterial() != Material.WATER)
									&& biome instanceof BiomeDevonian && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
								if (biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Swamp) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& biome instanceof BiomeJurassic && player.posY >= player.world.getSeaLevel() - 4) {
								BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
								if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Redwood) {
									fog = backgroundFog * 4F;
								}
							}

							if (player.world.provider.doesXZShowFog((int) player.posX, (int) player.posZ) && player.posY > player.world.getSeaLevel()) {
								fog1 = backgroundFog + fullFogAddition;
								if (player.world.isRainingAt(new BlockPos(player.getPosition()))) {
									float d = player.world.rainingStrength;
									fog1 = fog1 * d;
								}
							} else if (player.posY < player.world.getSeaLevel() - 4) {
								fog1 = backgroundFog * 2F;
								fog = backgroundFog * 2F;
							} else {
								fog1 = backgroundFog;
							}

							double doFog = Math.max((double) fog, (double) fog1);
							GlStateManager.setFog(GlStateManager.FogMode.EXP2);
							//System.err.println("Render fog: " + doFog);
							event.setDensity((float) doFog);
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}
}
