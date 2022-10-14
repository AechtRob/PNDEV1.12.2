package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLuoxiongichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r13;

    public ModelLuoxiongichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 11, 24, -2.0F, -5.6F, -10.0F, 3, 2, 2, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 9, -2.0F, -8.025F, -7.5F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 9, -1.5F, -5.25F, -9.65F, 3, 6, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8378F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 31, -1.5F, 0.35F, -11.0F, 3, 4, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3142F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 0, -1.5F, -1.75F, -11.75F, 3, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -2.85F, -8.7F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 35, -1.0F, -0.25F, -2.45F, 2, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -5.0F, -6.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -3.0F, 0.0F, 4, 7, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 5.0F, 2.5F);
        this.body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 20, -1.0F, -13.65F, 3.0F, 2, 4, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 5.0F, 6.25F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -1.5F, -10.75F, -7.15F, 3, 3, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.0F, 6.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 0, -1.5F, -7.75F, -8.75F, 3, 3, 6, 0.015F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, 2.5F, 0.5F);
        this.body2.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.2182F, -0.4363F, 0.0F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 0, 2, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, 2.5F, 0.5F);
        this.body2.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.2182F, 0.4363F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 0, 2, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-0.5F, 4.0F, 6.0F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, -0.1745F, 0.3491F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.pelvicfinR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.0F, 0.5F, 0, 2, 1, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(0.5F, 4.0F, 6.0F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.1745F, -0.3491F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.pelvicfinL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9163F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -1.0F, 0.5F, 0, 2, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.0F, 6.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 14, -1.5F, -1.975F, -1.0F, 3, 4, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.0F, 0.25F, 3.75F, 0, 2, 3, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 29, 0.0F, -9.0F, 8.85F, 0, 7, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 32, -1.0F, -8.0F, 7.85F, 2, 6, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 28, -1.0F, -10.0F, 1.0F, 2, 3, 4, 0.005F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 19, -1.0F, -12.25F, 3.0F, 2, 3, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.0F, -0.5F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 24, -1.5F, -3.5F, 1.5F, 3, 3, 5, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.25F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 34, 0, -1.0F, -2.0F, 0.0F, 2, 4, 2, 0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 14, 14, -0.5F, -1.5F, -0.5F, 1, 3, 2, 0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 7, 0.0F, -5.25F, 0.25F, 0, 9, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 6.25F, -7.5F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -1.0908F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 9, -1.0F, -14.0F, -3.5F, 1, 4, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.1F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetX = -0.02F;
        this.body.offsetY = -0.16F;
        this.body.render(0.01F);
        GlStateManager.enableCull();
        //GlStateManager.disableBlend();
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
        this.body.offsetY = 1.25F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.67F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(27.5), false, 0, 0.5F, f2, 1);

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
                this.body.offsetY = 1.33F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
