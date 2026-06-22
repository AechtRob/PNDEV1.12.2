package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockFacivermis;
import net.lepidodendron.entity.EntityPrehistoricFloraSelkirkiaHole;
import net.lepidodendron.entity.model.entity.ModelSelkirkiaHole;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.tileentity.TileEntitySelkirkia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderSelkirkiaHole extends RenderLivingBaseWithBook<EntityPrehistoricFloraSelkirkiaHole> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/selkirkia.png");
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderSelkirkiaHole(RenderManager mgr) {
        super(mgr, new ModelSelkirkiaHole(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSelkirkiaHole entity) {
        return RenderSelkirkiaHole.TEXTURE;
    }
    public void render(TileEntitySelkirkia entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockFacivermis.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }

        int hidden = entity.getHidden();
        float scaler = 1;
        if (hidden < 0) {
            //hide animation runs from -15 to 0:
            scaler = (float) ((double)Math.abs(hidden) / 15D);
        }
        else {
            if (hidden >= 0 && hidden < 240) {
                //hidden fully from 0 to 240 ticks:
                scaler = 0;
            }
            else {
                if (hidden >= 240 && hidden <= 360) {
                    scaler = (float) (((double)hidden-240D) / 120D);
                }
            }
        }
    }
}