package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGyracanthides extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer spikefinL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer spikefinR;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r21;

    public ModelGyracanthides() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0F, -15.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -2.4F, 10.9F, 12, 6, 14, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 27, 31, -5.5F, -1.4F, 5.9F, 11, 5, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, 3.0F, 2.75F, 11.4F, 2, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, 2.75F, 11.4F, 2, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.25F, 18.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.9163F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 40, -0.5F, -0.25F, 6.5F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, 0.0F, 0.25F, -0.5F, 0, 5, 9, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 0, -1.0F, -0.75F, -0.5F, 2, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, 3.0F, 8.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.8727F, -0.3054F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 25, -2.75F, -0.6F, -1.75F, 4, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.0F, 3.0F, 8.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, -0.8727F, 0.3054F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 0, -1.25F, -0.6F, -1.75F, 4, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.25F, 6.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 41, -5.0F, -0.25F, 0.0F, 10, 2, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.5F, 4.0F, 21.0F);
        this.body.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.1745F, 0.0F, 0.0F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 64, 63, -0.25F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 64, 45, -0.75F, -0.99F, -0.99F, 1, 1, 5, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 43, 5, -0.5F, -1.0F, 4.0F, 1, 1, 2, 0.0F, false));
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 7, 0.0F, -2.0F, -0.25F, 0, 1, 6, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.5F, 4.0F, 21.0F);
        this.body.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.1745F, 0.0F, 0.0F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 39, 64, -0.75F, -1.0F, -1.0F, 1, 1, 5, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 32, 62, -0.25F, -0.99F, -0.99F, 1, 1, 5, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 43, 0, -0.5F, -1.0F, 4.0F, 1, 1, 2, 0.0F, false));
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 6, 0.0F, -2.0F, -0.25F, 0, 1, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.1F, 24.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 52, 13, -4.0F, -2.4F, -0.625F, 8, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 32, 20, -5.0F, -1.9F, -0.6F, 10, 5, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 26, 55, -4.0F, -2.25F, 4.4F, 8, 5, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.25F, 5.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6109F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 33, 0.0F, -5.0F, 1.5F, 0, 5, 3, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 0, -0.5F, -5.25F, 0.5F, 1, 5, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.15F, 6.25F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 53, 35, -2.5F, -1.65F, -0.85F, 5, 4, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 40, 57, -2.0F, -2.2F, -0.875F, 4, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.25F, 1.5F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 31, 0.0F, 0.25F, 1.15F, 0, 4, 5, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, 0.25F, 0.4F, 1, 4, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.35F, 5.15F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0436F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 59, -1.5F, -1.65F, -1.0F, 3, 4, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 4.1F);
        this.body4.addChild(body5);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -0.75F, 0.0F);
        this.body5.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 58, 0.0F, -1.4F, 4.9F, 1, 2, 6, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 36, -0.5F, -1.4F, -1.1F, 2, 4, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -0.75F, 0.0F);
        this.body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 0, 0.001F, 2.75F, 2.65F, 1, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7854F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, 0.0F, 0.85F, -3.1F, 0, 9, 7, 0.0F, false));

        this.spikefinL = new AdvancedModelRenderer(this);
        this.spikefinL.setRotationPoint(4.7F, 2.0F, 12.0F);
        this.body.addChild(spikefinL);
        this.setRotateAngle(spikefinL, 0.0F, 0.0698F, 0.0873F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.5F, 0.0F, 17.0F);
        this.spikefinL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 40, -2.4996F, -0.499F, 0.9934F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.75F, 0.0F, 13.0F);
        this.spikefinL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3054F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 62, 57, -2.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(4.0F, 0.0F, 3.0F);
        this.spikefinL.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0436F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 20, -6.6F, 0.0F, 0.0F, 4, 0, 16, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(4.0F, 0.0F, 3.0F);
        this.spikefinL.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0262F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 0, -3.2F, -1.0F, -1.0F, 3, 2, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(4.0F, 0.0F, 3.0F);
        this.spikefinL.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6109F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 62, -2.6157F, -1.01F, -5.962F, 3, 2, 5, 0.0F, false));

        this.spikefinR = new AdvancedModelRenderer(this);
        this.spikefinR.setRotationPoint(-4.7F, 2.0F, 12.0F);
        this.body.addChild(spikefinR);
        this.setRotateAngle(spikefinR, 0.0F, -0.0698F, -0.0873F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.5F, 0.0F, 17.0F);
        this.spikefinR.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.5236F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 38, 5, 1.4996F, -0.499F, 0.9934F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.75F, 0.0F, 13.0F);
        this.spikefinR.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.3054F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 19, 0.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-4.0F, 0.0F, 3.0F);
        this.spikefinR.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0436F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 20, 2.6F, 0.0F, 0.0F, 4, 0, 16, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.0F, 0.0F, 3.0F);
        this.spikefinR.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0262F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 36, 0.2F, -1.0F, -1.0F, 3, 2, 11, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-4.0F, 0.0F, 3.0F);
        this.spikefinR.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, -0.6109F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 29, -0.3843F, -1.01F, -5.962F, 3, 2, 5, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 2.1F, 6.0F);
        this.body.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, -0.0873F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 54, -4.5F, 0.0F, -3.5F, 9, 1, 4, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 55, 9, -3.5F, 0.0F, -4.5F, 7, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.lowerjaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 30, -4.0F, -1.0F, 0.8F, 8, 1, 4, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 2.1F, 6.0F);
        this.body.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.0873F, 0.0F, 0.0F);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 47, 51, -5.0F, -2.0F, -4.0F, 10, 2, 4, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 46, 48, -4.0F, -2.0F, -4.75F, 8, 2, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.upperjaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 48, -4.5F, -0.05F, 0.35F, 9, 2, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.42F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        //GlStateManager.enableCull();
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
        this.body.offsetY = 0.9F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -2.2, f2, 1);
            this.chainSwing(fishTail, speed, 0.26F, -1.9, f2, 0.8F);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 1);
            this.walk(lowerjaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(spikefinL, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.swing(spikefinL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(spikefinR, (float) (speed * 0.75), 0.05F, true, 0, 0, f2, 1);
            this.swing(spikefinR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.9F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
