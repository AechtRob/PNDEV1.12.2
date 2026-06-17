package net.lepidodendron;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(
		modid = LepidodendronMod.MODID,
		value = Side.CLIENT
)
public class LepidodendronEventSubscribersClient {

	public static TextureAtlasSprite TAR_BUBBLE;

	@SubscribeEvent
	public static void stitchPre(TextureStitchEvent.Pre event) {
		event.getMap().registerSprite(
				new ResourceLocation(LepidodendronMod.MODID, "particle/tar_bubble")
		);
	}

	@SubscribeEvent
	public static void stitchPost(TextureStitchEvent.Post event) {
		TAR_BUBBLE = event.getMap().getAtlasSprite(
				LepidodendronMod.MODID + ":particle/tar_bubble"
		);
	}
}
