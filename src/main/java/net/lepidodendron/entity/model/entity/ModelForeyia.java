package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelForeyia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pectoralfinR;

    public ModelForeyia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 13, 9, -2.0F, -10.5F, -9.475F, 4, 7, 5, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 0, -2.0F, -12.35F, -6.475F, 4, 2, 2, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 14, 26, -2.0F, -4.0F, -8.0F, 4, 3, 4, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 39, -1.5F, -12.475F, -6.75F, 2, 3, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6545F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 25, -2.5F, -7.5F, -14.35F, 4, 7, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 28, -1.5F, -2.25F, -9.25F, 3, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 0, -2.0F, -3.5F, -14.1F, 4, 5, 4, 0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, -3.5F, -8.725F);
        this.body.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.48F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -1.0F, 0.0F, -1.75F, 2, 2, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 3.5F, 8.75F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 40, -1.5F, -6.1F, -9.25F, 2, 2, 2, -0.02F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -7.0F, -4.5F);
        this.body.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -1.5F, -3.25F, -1.0F, 3, 8, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 7.0F, 4.5F);
        this.body1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 8, 0.0F, -15.25F, -8.0F, 0, 5, 6, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 21, -1.0F, -10.25F, -8.0F, 2, 2, 5, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 7.0F, 4.5F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 4, -1.0F, -4.0F, -4.0F, 2, 2, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 26, 29, -1.0F, -3.0F, -1.0F, 2, 6, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 6.5F, -0.5F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 29, 0.0F, -14.75F, -4.75F, 0, 5, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.5F, -0.5F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 35, -1.0F, -10.25F, -3.25F, 2, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.5F, -0.5F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 18, -1.0F, -4.25F, 0.25F, 2, 2, 4, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(0.5F, 3.75F, 0.25F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.2182F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.25F, 2.75F, -0.75F);
        this.pelvicfinL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 2, 4, -0.25F, -1.65F, 1.75F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 4, -0.25F, 1.35F, 1.75F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 2, -0.25F, -0.65F, 1.25F, 0, 2, 2, 0.0F, true));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-0.5F, 3.75F, 0.25F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, -0.2182F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, 2.75F, -0.75F);
        this.pelvicfinR.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 2, 4, 0.25F, -1.65F, 1.75F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 4, 0.25F, 1.35F, 1.75F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 2, 0.25F, -0.65F, 1.25F, 0, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 19, 38, -1.0F, -2.5F, 0.0F, 2, 5, 2, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 6.75F, -3.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 0, 0.0F, 2.85F, 5.25F, 0, 1, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 2, 0.0F, -1.15F, 5.25F, 0, 2, 1, 0.0F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 17, 0.0F, 0.85F, 4.75F, 0, 2, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 36, -0.5F, -1.75F, -0.25F, 1, 3, 4, 0.02F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 0, -0.5F, -1.0F, 3.75F, 1, 1, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 15, 0.01F, -1.75F, 6.5F, 0, 2, 4, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 13, 0.0F, 2.775F, 7.25F, 0, 4, 8, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 11, -0.5F, 0.85F, 7.75F, 1, 2, 5, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6109F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 14, 0.0F, -17.825F, -0.8F, 0, 5, 7, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 33, -0.5F, -12.85F, -0.75F, 1, 2, 5, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 7.0F, -5.0F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 11, -0.5F, -5.75F, 8.5F, 1, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 7.0F, -5.0F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 1, -1.0F, -8.75F, 2.5F, 1, 3, 3, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.75F, 2.75F, 0.0F);
        this.body1.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.1745F, 0.3491F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 1, 0.0F, -1.0F, 1.0F, 0, 2, 2, 0.0F, true));
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 4, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.75F, 2.75F, 0.0F);
        this.body1.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.1745F, -0.3491F, 0.0F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 1, 0.0F, -1.0F, 1.0F, 0, 2, 2, 0.0F, false));
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 4, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.2F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.rotateAngleY = (float) Math.toRadians(90);
        //this.body.offsetX = -0.09F;
        this.body.offsetY = -0.19F;
        this.body.render(0.01F);
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
        this.body.offsetY = 1.18F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.27F, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.25), (float)Math.toRadians(27.5), true, 0, 0.5F, f2, 1);

            this.walk(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(body, speed, 0.15F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 1.16F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
