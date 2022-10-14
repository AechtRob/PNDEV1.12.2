package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrembodus extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body5;

    public ModelBrembodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 22.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 10, 43, -1.5F, -5.0F, -5.0F, 3, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 31, 3, -1.5F, -7.0F, -8.0F, 3, 2, 7, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.0F, -7.5F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -1.0F, 0.25F, 8.5F, 2, 2, 8, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 16, -1.5F, 0.0F, 2.5F, 3, 6, 6, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 5, -1.5F, 0.0F, -0.5F, 3, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 49, -1.5F, 0.0F, 0.5F, 3, 4, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 11, -1.5F, -3.0F, 0.0F, 3, 3, 8, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -5.0F, -5.0F);
        this.body.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 42, 45, -1.0F, 0.0F, -3.0F, 2, 1, 4, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 45, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -7.0F, -1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 22, -2.0F, -7.0F, 0.0F, 4, 13, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 13, 0, -1.5F, -9.0F, 1.0F, 3, 2, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -5.75F, 2.75F, 4, 14, 5, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -9.75F, 2.75F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 34, -1.5F, 0.5F, 0.0F, 3, 4, 5, 0.01F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(2.0F, 3.25F, 0.5F);
        this.body2.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, 0.2618F, 0.0F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 30, 0.0F, -2.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(-2.0F, 3.25F, 0.5F);
        this.body2.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, -0.2618F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 14, 31, 0.0F, -2.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 7.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -1.5F, -6.75F, 0.0F, 3, 14, 4, 0.005F, false));
        this.body3.cubeList.add(new ModelBox(body3, 3, 22, -1.5F, -6.75F, -1.0F, 3, 14, 1, 0.005F, false));
        this.body3.cubeList.add(new ModelBox(body3, 38, 39, 0.0F, -12.75F, 0.0F, 0, 6, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 2, 0, 0.0F, 7.25F, 3.0F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -10.75F, -5.0F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 23, -1.0F, -1.8F, 4.65F, 2, 4, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(-0.25F, 7.25F, 1.25F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.3927F, 0.0F, 0.3491F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 2, 0.0F, 0.0F, -0.25F, 0, 2, 1, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(0.25F, 7.25F, 1.25F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.3927F, 0.0F, -0.3491F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.0F, 0.0F, -0.25F, 0, 2, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 28, 34, 0.0F, -12.75F, 0.0F, 0, 10, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 40, 12, -1.0F, -2.5F, -1.0F, 2, 5, 5, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 37, 0.0F, 2.25F, 0.0F, 0, 9, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.5F, 3.75F);
        this.body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6981F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 10, -1.0F, 0.0F, -2.95F, 2, 6, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.5F, 4.0F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 0, -1.0F, -5.5F, -3.5F, 2, 5, 3, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 30, 0, -0.5F, -1.5F, -1.25F, 1, 3, 3, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 28, 22, 0.0F, -4.75F, 1.0F, 0, 11, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.13F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.body.offsetY = -0.02F;
        this.body.render(0.01F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.25F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
