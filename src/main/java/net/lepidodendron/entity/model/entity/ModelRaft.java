package net.lepidodendron.entity.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelRaft extends ModelBase
{
    private final ModelRenderer base;

    public ModelRenderer[] paddles = new ModelRenderer[2];
    private final int patchList = GLAllocation.generateDisplayLists(1);

    public ModelRaft()
    {
        textureWidth = 128;
        textureHeight = 64;

        base = new ModelRenderer(this);
        base.setRotationPoint(0.0F, 0.0F, 0.0F);
        base.cubeList.add(new ModelBox(base, 0, 0, -13.5F, -13.0F, -2.0F, 28, 26, 3, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 29, -18.5F, -11.0F, -2.0F, 5, 22, 3, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 0, 29, 2.0F, -1.0F, 1.0F, 1, 1, 29, 0.0F, false));
        base.cubeList.add(new ModelBox(base, 27, 36, 3.0F, -0.5F, 21.0F, 11, 0, 7, 0.0F, false));
        base.rotateAngleX = - ((float)Math.PI / 2);
        base.rotateAngleZ = - ((float)Math.PI);
        base.rotateAngleY = (float)Math.toRadians(360);

        this.paddles[0] = this.makePaddle(true);
        this.paddles[0].setRotationPoint(3.0F, -5.0F, 9.0F);
        this.paddles[1] = this.makePaddle(false);
        this.paddles[1].setRotationPoint(3.0F, -5.0F, -9.0F);
        this.paddles[1].rotateAngleY = (float)Math.PI;
        this.paddles[0].rotateAngleZ = 0.19634955F;
        this.paddles[1].rotateAngleZ = 0.19634955F;

    }

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
        EntityBoat entityboat = (EntityBoat)entityIn;
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

        this.base.render(scale);

        this.renderPaddle(entityboat, 0, scale, limbSwing);
        this.renderPaddle(entityboat, 1, scale, limbSwing);
    }

    protected ModelRenderer makePaddle(boolean p_187056_1_)
    {
        ModelRenderer modelrenderer = (new ModelRenderer(this, 62, p_187056_1_ ? 0 : 20)).setTextureSize(128, 64);
        int i = 20;
        int j = 7;
        int k = 6;
        float f = -5.0F;
        modelrenderer.addBox(-1.0F, 0.0F, -5.0F, 2, 2, 18);
        modelrenderer.addBox(p_187056_1_ ? -1.001F : 0.001F, -3.0F, 8.0F, 1, 6, 7);
        return modelrenderer;
    }

    protected void renderPaddle(EntityBoat boat, int paddle, float scale, float limbSwing)
    {
        float f = boat.getRowingTime(paddle, limbSwing);
        ModelRenderer modelrenderer = this.paddles[paddle];
        modelrenderer.rotateAngleX = (float)MathHelper.clampedLerp(-1.0471975803375244D, -0.2617993950843811D, (double)((MathHelper.sin(-f) + 1.0F) / 2.0F));
        modelrenderer.rotateAngleY = (float)MathHelper.clampedLerp(-(Math.PI / 4D), (Math.PI / 4D), (double)((MathHelper.sin(-f + 1.0F) + 1.0F) / 2.0F));

        if (paddle == 1)
        {
            modelrenderer.rotateAngleY = (float)Math.PI - modelrenderer.rotateAngleY;
        }

        modelrenderer.render(scale);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
