//package net.lepidodendron.entity.render.entity;
//
//import net.lepidodendron.LepidodendronMod;
//import net.lepidodendron.entity.EntityPrehistoricFloraDaohugoucossus;
//import net.lepidodendron.entity.model.entity.ModelDaohugoucossus;
//import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
//import net.minecraft.client.renderer.GlStateManager;
//import net.minecraft.client.renderer.entity.RenderManager;
//import net.minecraft.util.ResourceLocation;
//
//public class RenderDaohugoucossus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDaohugoucossus> {
//    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Daohugoucossus.png");
//
//    public static float getScaler() {return 0.2f;}
//
//    public RenderDaohugoucossus(RenderManager mgr) {
//        super(mgr, new ModelDaohugoucossus(), 0.0f);
//    }
//
//    @Override
//    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaohugoucossus entity) {
//        return RenderDaohugoucossus.TEXTURE;
//    }
//
//    @Override
//    protected void applyRotations(EntityPrehistoricFloraDaohugoucossus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
//        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
//        float offset = 0.14F;
//        switch (entityLiving.getAttachmentFacing()) {
//            case DOWN:
//            default:
//                break;
//            case EAST:
//                GlStateManager.translate(offset, 0.1F, 0.0F);
//                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
//                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
//                break;
//            case WEST:
//                GlStateManager.translate(-offset, 0.1F, 0.0F);
//                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
//                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
//                break;
//            case NORTH:
//                GlStateManager.translate(0.0F, 0.1F, -offset);
//                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
//                break;
//            case SOUTH:
//                GlStateManager.translate(0.0F, 0.1F, offset);
//                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
//                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
//                break;
//            case UP:
//                GlStateManager.translate(0.0F, 0.5F, 0.0F);
//                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
//        }
//    }
//
//    @Override
//    protected void preRenderCallback(EntityPrehistoricFloraDaohugoucossus entity, float f) {
//        float scale = getScaler();
//        GlStateManager.scale(scale, scale, scale);
//    }
//
//}