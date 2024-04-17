package net.lepidodendron;

import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.cambrian.BiomeCambrian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
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
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LepidodendronFogSubscribers {

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void fogEvent(EntityViewRenderEvent.RenderFogEvent event) {

		if (event.getFogMode() == -1) {
			return;
		}

		Entity player = event.getEntity();
		IBlockState state = ActiveRenderInfo.getBlockStateAtEntityViewpoint(player.world, player, (float)event.getRenderPartialTicks());
		Vec3d vec3d = ActiveRenderInfo.projectViewFromEntity(player, (float)event.getRenderPartialTicks());
		Block b = state.getBlock();

		if (!LepidodendronConfig.renderFog) {
			return;
		}

		//if (player.getEntityWorld().isRainingAt(new BlockPos(vec3d))) {
		//	return;
		//}

		if (player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPermian
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousEarly
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousLate
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPaleogene
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimNeogene
			&& player.getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPleistocene) {
			return;
		}

		if (hasShaders()) {
			return;
		}

		if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER && state.getBlock() != Blocks.LAVA) {

			GlStateManager.setFog(GlStateManager.FogMode.LINEAR);
			//GlStateManager.setFogDensity(0);

			float f1 = event.getFarPlaneDistance();
			float near;
			float far;

			int[] ranges = ForgeModContainer.blendRanges;
			GameSettings settings = Minecraft.getMinecraft().gameSettings;
			int distance = 0;
			if (ranges.length > 0) {
				//distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, ranges.length - 1)];
				distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, 4)];
			}

			int divider = 0;
			float fog = 0;
			for (int x = -distance; x <= distance; ++x) {
				for (int z = -distance; z <= distance; ++z) {
					BlockPos pos = new BlockPos(vec3d).add(x, 0, z);
					if (player.getEntityWorld().isBlockLoaded(pos, false)) {
						Biome biome = player.world.getBiome(pos);
						float density = this.getFogDensity(player, state, vec3d);
						float biomeFog = getBiomeFactor(biome); //==0?
						float foggy = biomeFog + (density * 5000F);
						fog += 0.75f * f1 * (2.00f - Math.pow(foggy, 2) / 10000f);
						divider++;
					}
				}
			}

			near = (fog / (float) divider);
			far = f1;

			float density = this.getFogDensity(player, state, vec3d);
			GlStateManager.setFogDensity(density);
			if (density != 0) {
				GlStateManager.setFogStart(near * 0.05F);
			}
			//GlStateManager.setFogEnd(Math.max(far, 240) * 0.5F);
			GlStateManager.setFogEnd(far);

		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEvent(EntityViewRenderEvent.FogColors event) {

		//if (1 == 1) {
		//	return;
		//}

		if (LepidodendronConfig.renderFog) {
			Entity player = event.getEntity();
			World world = player.getEntityWorld();

			//if (world.isRainingAt(player.getPosition())) {
			//	return;
			//}

			IBlockState state = ActiveRenderInfo.getBlockStateAtEntityViewpoint(player.world, player, 0);
			Vec3d vec3d = ActiveRenderInfo.projectViewFromEntity(player, 0);
			Block b = state.getBlock();

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
						|| world.provider.getDimension() == LepidodendronConfig.dimJurassic
						|| world.provider.getDimension() == LepidodendronConfig.dimCretaceousEarly
						|| world.provider.getDimension() == LepidodendronConfig.dimCretaceousLate
						|| world.provider.getDimension() == LepidodendronConfig.dimPaleogene
						|| world.provider.getDimension() == LepidodendronConfig.dimNeogene
						|| world.provider.getDimension() == LepidodendronConfig.dimPleistocene
				) {

					if (hasShaders()) {
						return;
					}

					if (!(player instanceof EntityLivingBase && ((EntityLivingBase) player).isPotionActive(MobEffects.BLINDNESS))) {
						if (!((b instanceof BlockLiquid) || (b instanceof BlockFluidBase) || state.getMaterial() == Material.WATER)) {

							GameSettings settings = Minecraft.getMinecraft().gameSettings;
							int[] ranges = ForgeModContainer.blendRanges;
							int distance = 0;
							if (ranges.length > 0)
							{
								//distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, ranges.length-1)];
								distance = ranges[MathHelper.clamp(settings.renderDistanceChunks, 0, 4)];
							}
							int divider = 0;
							for (int x = -distance; x <= distance; ++x)
							{
								for (int z = -distance; z <= distance; ++z)
								{
									BlockPos pos = new BlockPos(vec3d).add(x, 0, z);
									if (world.isBlockLoaded(pos, false)) {
										Biome biome = player.world.getBiome(pos);
										Vec3d fogColor = getBiomeFogColors(world, biome, (float) event.getRenderPartialTicks());
										red += fogColor.x;
										green += fogColor.y;
										blue += fogColor.z;
										divider++;
									}
								}
							}

							float rain = world.getRainStrength((float) event.getRenderPartialTicks());
							float thunder = world.getThunderStrength((float) event.getRenderPartialTicks());

							red *= (1.0F - rain * 0.5F)*(1.0F - thunder * 0.5F);
							green *= (1.0F - rain * 0.5F)*(1.0F - thunder * 0.5F);
							blue *= (1.0F - rain * 0.4F)*(1.0F - thunder * 0.5F);
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

		float f2 = MathHelper.cos(world.getCelestialAngle(partialTicks) * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

		if (f2 < 0.0F)
		{
			f2 = 0.0F;
		}

		if (f2 > 1.0F)
		{
			f2 = 1.0F;
		}
		
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt")) {
			r = 96D/255D;
			g = 96D/255D;
			b = 96D/255D;
			r *= f2 * 0.94F + 0.06F;
			g *= f2 * 0.94F + 0.06F;
			b *= f2 * 0.91F + 0.09F;
			Vec3d fog = new Vec3d(r, g, b);
			//System.out.println("Fog: "+fog.x);
			return fog;
		}
		else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_floodbasalt_edge")) {
			r = 192D/255D;
			g = 192D/255D;
			b = 192D/255D;
			r *= f2 * 0.94F + 0.06F;
			g *= f2 * 0.94F + 0.06F;
			b *= f2 * 0.91F + 0.09F;
			Vec3d fog = new Vec3d(r, g, b);
			//System.out.println("Fog: "+fog.x);
			return fog;
		}
		else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression")) {
			r = 212D/255D;
			g = 190D/255D;
			b = 167D/255D;
			r *= f2 * 0.94F + 0.06F;
			g *= f2 * 0.94F + 0.06F;
			b *= f2 * 0.91F + 0.09F;
			Vec3d fog = new Vec3d(r, g, b);
			//System.out.println("Fog: "+fog.x);
			return fog;
		}

		else if (biome instanceof BiomeCambrian) {
			if (((BiomeCambrian)biome).getBiomeType() == EnumBiomeTypeCambrian.Dusty) {
				r = 255D / 255D;
				g = 252D / 255D;
				b = 166D / 255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
		}

		else if (biome instanceof BiomePrecambrian) {
			
			if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
				r = 227D/255D;
				g = 141D/255D;
				b = 61D/255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
			else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Paleoproterozoic) {
				r = 226D/255D;
				g = 193D/255D;
				b = 253D/255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
			else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Mesoproterozoic) {
				r = 156D/255D;
				g = 228D/255D;
				b = 184D/255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
			else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Neoproterozoic) {
				if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_desert")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach")) {
					r = 177D / 255D;
					g = 192D / 255D;
					b = 216D / 255D;
					r *= f2 * 0.94F + 0.06F;
					g *= f2 * 0.94F + 0.06F;
					b *= f2 * 0.91F + 0.09F;
					Vec3d fog = new Vec3d(r, g, b);
					//System.out.println("Fog: "+fog.x);
					return fog;

				} else {
					r = 138D / 255D;
					g = 240D / 255D;
					b = 255D / 255D;
					r *= f2 * 0.94F + 0.06F;
					g *= f2 * 0.94F + 0.06F;
					b *= f2 * 0.91F + 0.09F;
					Vec3d fog = new Vec3d(r, g, b);
					//System.out.println("Fog: "+fog.x);
					return fog;
				}
			}
			else if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:proterozoic_hills")) {
				r = 156D/255D;
				g = 228D/255D;
				b = 184D/255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
			else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Ediacaran) {
				r = 138D / 255D;
				g = 240D / 255D;
				b = 255D / 255D;
				r *= f2 * 0.94F + 0.06F;
				g *= f2 * 0.94F + 0.06F;
				b *= f2 * 0.91F + 0.09F;
				Vec3d fog = new Vec3d(r, g, b);
				//System.out.println("Fog: "+fog.x);
				return fog;
			}
		}

		r = worldFog.x;
		g = worldFog.y;
		b = worldFog.z;
		Vec3d fog = new Vec3d(r,g,b);
		return fog;
	}

	private float getBiomeFactor(Biome biome) {

		if (biome instanceof BiomePrecambrian) {
			if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
				return 150;
			}
			if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
				return 200;
			}
		}
		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ice_desert")
				|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ice_ocean")) {
			return 130;
		}

		if (biome instanceof BiomeCambrian) {
			BiomeCambrian biomeCambrian = (BiomeCambrian) biome;
			if (biomeCambrian.getBiomeType() == EnumBiomeTypeCambrian.Dusty) {
				return 125;
			}
		}

		if (biome instanceof BiomeSilurian) {
			BiomeSilurian biomeSilurian = (BiomeSilurian) biome;
			if (biomeSilurian.getBiomeType() == EnumBiomeTypeSilurian.Sands) {
				return 130;
			}
		}

		if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_spikes")) {
			return 150;
		}

		if (biome instanceof BiomeCarboniferous) {
			BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
			if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh
					|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Fen) {
				return 200;
			}
		}

		if (biome instanceof BiomePermian) {
			BiomePermian biomePermian = (BiomePermian) biome;
			if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
					|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp"))
					|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest"))
					|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris_foggy"))) {
				return 150;
			}
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains")) {
				return 150;
			}
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression")
					|| biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression_rim")) {
				return 120;
			}
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands")) {
				return 150;
			}
			if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) {
				return 150;
			}
		}

		if (biome instanceof BiomeJurassic) {
			BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
			if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Coniferous) {
				return 150;
			}
			if (biomeJurassic.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
				|| biomeJurassic.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek_fog")) {
				return 175;
			}
		}

		if (biome instanceof BiomeCretaceousEarly) {
			BiomeCretaceousEarly biomeCretaceousEarly = (BiomeCretaceousEarly) biome;
			if (biomeCretaceousEarly.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_rainforest")) {
				return 150;
			}
		}

		return 0;
	}


	public float getFogDensity(Entity player, IBlockState state, Vec3d vec3d) {

		if (LepidodendronConfig.renderFog) {
			World world = player.getEntityWorld();
			Biome biome = player.world.getBiome(player.getPosition());
			double playerEyes = vec3d.y;
			Block b = state.getBlock();

			int fogBottom = 78;
			int fogTop = 98;

			float backgroundFog = 0.0000F;
			float backgroundFog2 = 0.0010F;
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
						|| world.provider.getDimension() == LepidodendronConfig.dimJurassic
						|| world.provider.getDimension() == LepidodendronConfig.dimCretaceousEarly
						|| world.provider.getDimension() == LepidodendronConfig.dimCretaceousLate
				) {
					if (!(player instanceof EntityLivingBase && ((EntityLivingBase) player).isPotionActive(MobEffects.BLINDNESS))) {
						if (!((b instanceof BlockLiquid) || (b instanceof BlockFluidBase) || state.getMaterial() == Material.WATER)) {

							if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_spikes") && playerEyes >= (double) player.world.getSeaLevel()) {
								fogBottom = 120;
								fogTop = 175;
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							}

							else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) && playerEyes >= (double) player.world.getSeaLevel() - 4
									&& player.posY <= fogTop) {
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) && playerEyes >= (double) player.world.getSeaLevel() - 4
									&& player.posY > fogTop) {
								int fogTopFree = 125;
								fog = backgroundFog + fullFogAddition - (fullFogAddition * ((float) (Math.min(fogTopFree - fogTop, Math.max(0, player.posY - fogTop)) / (fogTopFree - fogTop))));
							}

							else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression_rim")) && playerEyes <= (double) player.world.getSeaLevel() - 1) {
								int tt = world.getSeaLevel();
								int mm = 31;
								int bb = 25;
								float foggy = 0;
								if (playerEyes >= mm) {
									foggy = (float)((mm - playerEyes) + (tt - mm))/(tt - mm);
									foggy = 1 - (float)Math.cos(foggy * ((float)Math.PI/2F));
									//System.err.println("foggy: " + foggy);
								}
								else if (playerEyes < mm && playerEyes >= bb) {
									foggy = (float)(1 - ((mm - playerEyes) / (mm - bb)));
								}
								//System.err.println("backgroundFog: " + backgroundFog);
								//System.err.println("sea: " + world.getSeaLevel());
								fog = backgroundFog + (fullFogAddition * foggy * 0.93F);
								//System.err.println("fog: " + fog);
							}

							else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome instanceof BiomePermian && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomePermian biomePermian = (BiomePermian) biome;
								if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
										|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_swamp"))
										|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_cold_glossopteris_forest"))
										|| (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_cold_glossopteris_foggy"))) {
									fog = backgroundFog2 * 10F;
								}
							}

							else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome instanceof BiomeCarboniferous && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
								if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
										|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh
										|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Fen) {
									fog = backgroundFog2 * 10F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome instanceof BiomeDevonian && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
								if (biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Swamp) {
									fog = backgroundFog2 * 10F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && state.getMaterial() != Material.WATER
									&& biome instanceof BiomeJurassic && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
								if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Coniferous
									|| biomeJurassic.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_wet")
									|| biomeJurassic.getRegistryName().toString().equalsIgnoreCase("lepidodendron:jurassic_island_large_creek_fog")) {
									fog = backgroundFog2 * 5F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_rainforest") && player.posY >= player.world.getSeaLevel() - 4) {
									fog = backgroundFog2 * 5F;
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_desert") && player.posY >= player.world.getSeaLevel() - 4) {
									fog = backgroundFog2 * 5F;								
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_beach") && player.posY >= player.world.getSeaLevel() - 4) {
									fog = backgroundFog2 * 5F;								
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cryogenian_ocean") && player.posY >= player.world.getSeaLevel() - 4) {
									fog = backgroundFog2 * 5F;								
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && state.getMaterial() != Material.WATER)
									&& biome instanceof BiomePrecambrian && player.posY >= player.world.getSeaLevel() - 4) {
								if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
									fog = backgroundFog2 * 10F;
								}
								else if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
									fog = backgroundFog2 * 10F;
								}
							}


							if (player.world.provider.doesXZShowFog((int) player.posX, (int) player.posZ) && playerEyes >= (double) player.world.getSeaLevel()) {
								fog1 = backgroundFog + fullFogAddition;
								if (player.world.isRainingAt(new BlockPos(vec3d))) {
									float d = player.world.rainingStrength;
									fog1 = fog1 * d;
								}
							} else if (playerEyes < player.world.getSeaLevel() - 4
								&& !(biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_stony_depression_rim"))) {
								fog1 = backgroundFog2 * 2F; //needs gradient with height
								fog = backgroundFog2 * 2F; //needs gradient with height
							} else {
								fog1 = backgroundFog;
							}

							//System.err.println("fog " + fog + " fog1 " + fog1);

							return (float) Math.max((double) fog, (double) fog1);

						}
					}
				}
			}
		}
		return 0F;
	}

	public static boolean hasShaders() {
		//Check if optifine is installed:
		boolean isShaders = false;
		if (FMLClientHandler.instance().hasOptifine()) {
			//Read from the optionsshaders.txt file:
			String strFile = null;
			try {
				strFile = Minecraft.getMinecraft().gameDir.getCanonicalPath() + "\\optionsshaders.txt";
			} catch (IOException e) {
			}
			try {
				BufferedReader reader = new BufferedReader(new FileReader(strFile));
				String line;
				while ((line = reader.readLine()) != null) {
					if (line.startsWith("shaderPack=")) {
						if (!(line.substring(11).equalsIgnoreCase("(internal)")
								|| line.substring(11).equalsIgnoreCase("OFF"))) {
							isShaders = true;
						}
					}
				}
				reader.close();
				reader = null;
				strFile = null;
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
			}
		}
		return isShaders;
	}

	/*
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEvent(EntityViewRenderEvent.FogDensity event) {

		//NB NOT BEING USED:
		if (LepidodendronConfig.renderFog && 1 == 2) {

			//EntityPlayer player = Minecraft.getMinecraft().player;
			Block b = event.getState().getBlock();
			Entity player = event.getEntity();
			Biome biome = player.world.getBiome(player.getPosition());
			IBlockState stateView = ActiveRenderInfo.getBlockStateAtEntityViewpoint(player.world, player, 0);
			Vec3d vec3d = ActiveRenderInfo.projectViewFromEntity(player, 0);
			double playerEyes = vec3d.y;
			b = stateView.getBlock();

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
									&& biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_spikes") && playerEyes >= (double) player.world.getSeaLevel()) {
								fogBottom = 120;
								fogTop = 175;
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) && playerEyes >= (double) player.world.getSeaLevel() - 4
									&& player.posY <= fogTop) {
								fog = backgroundFog + (fullFogAddition * ((float) (Math.min(fogTop - fogBottom, Math.max(0, player.posY - fogBottom)) / (fogTop - fogBottom))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_mountains") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_highlands") || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:permian_creek_highlands")) && playerEyes >= (double) player.world.getSeaLevel() - 4
									&& player.posY > fogTop) {
								int fogTopFree = 125;
								fog = backgroundFog + fullFogAddition - (fullFogAddition * ((float) (Math.min(fogTopFree - fogTop, Math.max(0, player.posY - fogTop)) / (fogTopFree - fogTop))));
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& biome instanceof BiomePermian && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomePermian biomePermian = (BiomePermian) biome;
								if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands
										|| biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && event.getState().getMaterial() != Material.WATER)
									&& biome instanceof BiomeCarboniferous && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeCarboniferous biomeCarboniferous = (BiomeCarboniferous) biome;
								if (biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Swamp
									|| biomeCarboniferous.getBiomeType() == EnumBiomeTypeCarboniferous.Marsh) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase) && event.getState().getMaterial() != Material.WATER)
									&& biome instanceof BiomeDevonian && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeDevonian biomeDevonian = (BiomeDevonian) biome;
								if (biomeDevonian.getBiomeType() == EnumBiomeTypeDevonian.Swamp) {
									fog = backgroundFog * 7F;
								}
							} else if ((!(b instanceof BlockLiquid)) && (!(b instanceof BlockFluidBase)) && event.getState().getMaterial() != Material.WATER
									&& biome instanceof BiomeJurassic && playerEyes >= (double) player.world.getSeaLevel() - 4) {
								BiomeJurassic biomeJurassic = (BiomeJurassic) biome;
								if (biomeJurassic.getBiomeType() == EnumBiomeTypeJurassic.Coniferous) {
									fog = backgroundFog * 4F;
								}
							}

							if (player.world.provider.doesXZShowFog((int) player.posX, (int) player.posZ) && playerEyes >= (double) player.world.getSeaLevel()) {
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
	 */

}
