package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDoryaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Doryaspis;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer BrachialPlateL_NOANIMATION;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer BrachialPlateR_NOANIMATION;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Tail2;

    public ModelDoryaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Doryaspis = new AdvancedModelRenderer(this);
        this.Doryaspis.setRotationPoint(0.0F, 21.0F, 2.0F);
        this.Doryaspis.cubeList.add(new ModelBox(Doryaspis, 15, 14, -1.5F, -1.5F, -1.0F, 3, 3, 6, 0.0F, false));
        this.Doryaspis.cubeList.add(new ModelBox(Doryaspis, 22, 26, -0.5F, -1.75F, -1.0F, 1, 1, 6, -0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Doryaspis.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 29, 19, -0.5F, -1.0F, -14.0F, 1, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 11, 32, -1.5F, -2.0F, -9.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -2.5F, -2.0F, -7.0F, 5, 3, 7, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 18, 0, -2.5F, 1.0F, -5.0F, 5, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 32, 0, -2.5F, 0.5F, -1.0F, 5, 1, 1, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5F, 0.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, -1.5F, 0.0F, -7.0F, 3, 1, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.0F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4119F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 14, -2.5F, -1.0F, -2.0F, 5, 1, 2, -0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 26, -1.5F, -1.0F, -5.0F, 3, 1, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2531F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 5, -2.5F, -1.0F, 0.0F, 5, 1, 2, -0.01F, false));

        this.BrachialPlateL_NOANIMATION = new AdvancedModelRenderer(this);
        this.BrachialPlateL_NOANIMATION.setRotationPoint(5.0F, -0.5F, 0.0F);
        this.Head.addChild(BrachialPlateL_NOANIMATION);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0873F, 0.3403F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 36, -0.05F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, -0.5F, -1.5F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.2025F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 37, -0.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.5F, -0.5F, -2.0F);
        this.BrachialPlateL_NOANIMATION.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4102F, 0.2025F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 9, -0.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.BrachialPlateR_NOANIMATION = new AdvancedModelRenderer(this);
        this.BrachialPlateR_NOANIMATION.setRotationPoint(-5.0F, -0.5F, 0.0F);
        this.Head.addChild(BrachialPlateR_NOANIMATION);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BrachialPlateR_NOANIMATION.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.0873F, -0.3403F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 33, -2.95F, 0.02F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, -0.5F, -1.5F);
        this.BrachialPlateR_NOANIMATION.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.2025F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 34, -2.5F, 0.0F, 0.5F, 3, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.5F, -0.5F, -2.0F);
        this.BrachialPlateR_NOANIMATION.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.4102F, -0.2025F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 34, -2.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Doryaspis.addChild(Tail1);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 19, 5, -1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, false));
        this.Tail1.cubeList.add(new ModelBox(Tail1, 13, 24, -0.5F, -1.25F, 0.0F, 1, 1, 6, -0.01F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Tail1.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 7, 20, -0.5F, -0.5F, 1.0F, 1, 1, 4, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 20, 0.0F, -3.5F, 4.0F, 0, 7, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        this.Doryaspis.render(f5 * 0.18F);

    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Doryaspis.rotateAngleY = (float) Math.toRadians(90);
        this.Doryaspis.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Doryaspis.offsetY = 1.1F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Tail1, this.Tail2};
        float speed = 0.53F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed * 2, 0.08F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.4F, -2, f2, 0.8F);
            this.swing(Doryaspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Doryaspis.offsetY = 1.1F;
                this.bob(Doryaspis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
