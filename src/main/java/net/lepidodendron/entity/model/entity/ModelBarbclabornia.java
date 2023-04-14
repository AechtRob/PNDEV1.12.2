package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBarbclabornia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBarbclabornia extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;

    public ModelBarbclabornia() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 17.0F, -19.0F);
        this.body.cubeList.add(new ModelBox(body, 29, 39, -4.5F, -6.1F, -2.0F, 9, 9, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0262F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 75, 55, -1.0F, -3.25F, 0.0F, 1, 6, 6, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0262F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 55, 0.0F, -3.25F, 0.0F, 1, 6, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 7.0F, 19.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 59, -4.0F, -14.85F, -19.75F, 8, 1, 10, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-4.5F, 2.0F, 5.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.1309F, 0.0436F, 0.8727F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 26, 59, 0.0F, 0.0F, 0.0F, 0, 8, 11, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(4.5F, 2.0F, 5.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.1309F, -0.0436F, -0.8727F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 26, 59, 0.0F, 0.0F, 0.0F, 0, 8, 11, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body.addChild(head);


        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 48, 19, -4.0F, -3.0F, -10.0F, 8, 3, 10, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 7.0F, 21.0F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2356F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 39, 0, -3.5F, -17.25F, -28.5F, 7, 3, 11, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 74, 16, -4.0F, -2.975F, -5.0F, 8, 3, 5, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 58, 32, -4.0F, 0.0F, -9.5F, 8, 2, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 7.0F, 21.0F);
        this.jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 44, -3.5F, -3.25F, -30.25F, 7, 1, 10, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.0F, 8.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 28, 18, 0.0F, -11.0F, 5.0F, 0, 6, 14, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -5.0F, -5.0F, 0.0F, 10, 10, 19, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 9.0F, 11.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -10.25F, -16.0F, 1, 7, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -1.0F, 19.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 64, 0.0F, -9.75F, 0.0F, 0, 6, 11, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 29, -4.0F, -3.75F, -1.0F, 8, 9, 12, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-2.0F, 5.25F, 1.0F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.1047F, -0.0873F, 0.7854F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 57, 0.0F, -0.25F, -0.5F, 0, 5, 13, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(2.0F, 5.25F, 1.0F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.1047F, 0.0873F, -0.7854F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 57, 0.0F, -0.25F, -0.5F, 0, 5, 13, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 54, 59, -3.0F, -3.5F, -1.0F, 6, 8, 9, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 0, 0, 0.0F, -9.5F, 0.0F, 0, 6, 8, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 10.0F, -19.0F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 0, 0.0F, 18.0F, 18.0F, 0, 6, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -1.0F, 8.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 40, 76, -2.0F, -2.25F, -1.0F, 4, 6, 8, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 11.0F, -27.0F);
        this.body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.0036F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 55, 0.0F, 22.5F, 23.0F, 0, 10, 4, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 15, 75, -1.0F, -1.75F, -1.0F, 2, 4, 7, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 23, 0.0F, -5.5F, 0.0F, 0, 11, 6, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 36, 0.0F, -7.5F, 0.0F, 0, 15, 14, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 61, 0, -0.5F, -1.0F, -1.0F, 1, 2, 14, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(80);
        this.head.rotateAngleY = (float) Math.toRadians(-12.5);
        this.jaw.rotateAngleX = (float) Math.toRadians(20);
        this.body2.rotateAngleY = (float) Math.toRadians(10);
        this.body3.rotateAngleY = (float) Math.toRadians(7.5);
        this.body4.rotateAngleY = (float) Math.toRadians(7.5);
        this.body5.rotateAngleY = (float) Math.toRadians(7.5);
        this.body.offsetX = -0.165F;
        this.body.offsetZ = 0.13F;
        this.body.offsetY = -0.14F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body7, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0262F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.0262F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralfinL, -0.1309F, -0.0436F, -0.8727F);
        this.setRotateAngle(pectoralfinR, -0.1309F, 0.0436F, 0.8727F);
        this.setRotateAngle(pelvicfinL, -0.1047F, 0.0873F, -0.7854F);
        this.setRotateAngle(pelvicfinR, -0.1047F, -0.0873F, 0.7854F);
        this.setRotateAngle(upperjaw, -0.0873F, 0.0F, 0.0F);
        this.body.offsetX = 0F;
        this.body.offsetY = -0.3F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(body2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(body7, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0262F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.0262F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.2356F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralfinL, -0.1309F, -0.0436F, -0.8727F);
        this.setRotateAngle(pectoralfinR, -0.1309F, 0.0436F, 0.8727F);
        this.setRotateAngle(pelvicfinL, -0.1047F, 0.0873F, -0.7854F);
        this.setRotateAngle(pelvicfinR, -0.1047F, -0.0873F, 0.7854F);
        this.setRotateAngle(upperjaw, -0.0873F, 0.0F, 0.0F);
        this.body.offsetX = 0F;
        this.body.offsetY = 0.04F;
        this.body.render(0.01F);
        resetToDefaultPose();
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
        EntityPrehistoricFloraBarbclabornia entity = (EntityPrehistoricFloraBarbclabornia) e;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6, this.body7};

        float speed = 0.1F;
        float still = 1f;
        float inwater = 1f;
        if (f3 == 0.0F) {
            still = 0.3F;}
        if (!e.isInWater()) {
            speed = 0.3F;
            inwater = 0.5F;
        }

        this.faceTarget(f3, f4, 12, head);

        if (f3 != 0.0F) {
            this.jaw.rotateAngleX = entity.mouthAngle() * (float)Math.toRadians(30);
            //System.err.println("Mouth Angle:" + entity.mouthAngle());
            //System.err.println("Feed Ticks:" + entity.getFeedTicks());
        }

        this.chainWave(fishTail, speed * still, 0.02F * still, -3, f2, 0.8F * still);
        this.chainSwing(fishTail, speed * still, 0.4F * still, -3, f2, 0.6F * still);
        if (e.isInWater()) {
            this.swing(body, speed * 0.6F, 0.15F, true, 0, 0, f2, 1);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinL, (float) (speed * 0.65), 0.5F * inwater, true, 0.8F, 0.3F, f2, 1 * inwater);
        this.swing(pectoralfinL, (float) (speed * 0.65), 0.3F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(pectoralfinR, (float) (speed * 0.65), -0.5F * inwater, true, 0.8F, -0.3F, f2, 1 * inwater);
        this.swing(pectoralfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0, 0, f2, 1 * inwater);

        this.flap(pelvicfinL, (float) (speed * 0.65), 0.3F * inwater, true, 0.8F, 0.1F, f2, 1 * inwater);
        this.swing(pelvicfinL, (float) (speed * 0.65), 0.2F * inwater, true, 0, 0, f2, 1 * inwater);
        this.flap(pelvicfinR, (float) (speed * 0.65), -0.3F * inwater, true, 0.8F, -0.1F, f2, 1 * inwater);
        this.swing(pelvicfinR, (float) (speed * 0.65), -0.2F * inwater, true, 0, 0, f2, 1 * inwater);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 0.4F;
            this.bob(body, -speed * 1.8F, 1.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.05F, -0.55, f2, 0.4F * still);
        }

    }
}
