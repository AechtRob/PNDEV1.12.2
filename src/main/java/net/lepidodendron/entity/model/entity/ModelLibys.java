package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLibys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer dorsalfinR;
    private final AdvancedModelRenderer dorsalfinL;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    public ModelLibys() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 54, 18, -3.0F, -11.0F, -7.0F, 6, 2, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 61, 25, -3.0F, -10.5F, -6.5F, 6, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 32, 0, -3.5F, -14.7F, -2.7F, 7, 11, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -15.0F, -2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 35, -4.0F, 0.05F, -0.7F, 6, 2, 5, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -12.6F, -6.8F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5934F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 0, -5.0F, 1.025F, -3.175F, 6, 2, 3, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -15.0F, -2.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.685F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 41, -5.0F, -0.2F, -5.6F, 6, 4, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.0F, -1.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 12, -3.0F, 0.45F, -4.05F, 6, 2, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.0F, -7.0F, -0.9F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 5, -5.0F, -1.5F, -8.35F, 6, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -7.0F, -1.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 16, -5.0F, -3.5F, -6.3F, 6, 4, 7, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -12.75F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -3.0F, -3.0F, -1.0F, 6, 13, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.25F, -4.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 33, -3.0F, -0.95F, 4.2F, 5, 2, 9, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.0F, 4.0F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.7418F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 53, 0.0F, -8.75F, 0.0F, 0, 9, 6, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.75F, 10.0F, 7.25F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.6545F, -0.3491F, 0.0F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 42, 19, 0.0F, -2.3F, -0.85F, 0, 5, 8, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.75F, 10.0F, 7.25F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.6545F, 0.3491F, 0.0F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 42, 19, 0.0F, -2.3F, -0.85F, 0, 5, 8, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.5F, 9.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 23, -2.5F, -2.0F, -0.5F, 5, 12, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.4F, 5.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -1.0908F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.0F, -1.55F, -0.5F, 2, 3, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.4F, 0.0F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 44, -2.0F, -0.3F, -0.5F, 4, 2, 7, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.5F, -5.0F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -1.0472F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 12, 0.0F, -16.5F, 4.25F, 0, 7, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 9.1F, 6.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 44, -2.0F, -10.0F, -0.75F, 4, 10, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.1F, 2.0F);
        this.body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.9163F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 55, -0.01F, -1.75F, -1.25F, 0, 9, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -4.75F, 4.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 53, 53, -1.5F, -4.5F, -1.0F, 3, 8, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 42, 53, 0.0F, -8.25F, -1.0F, 0, 14, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.75F, 4.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 57, 42, -1.0F, -2.5F, -0.5F, 2, 5, 4, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 14, 0.0F, -9.0F, 0.0F, 0, 17, 9, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 4, 0.0F, -0.75F, 8.0F, 0, 1, 2, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 20, 59, -0.5F, -0.75F, 3.5F, 1, 1, 5, 0.0F, false));

        this.dorsalfinR = new AdvancedModelRenderer(this);
        this.dorsalfinR.setRotationPoint(-3.25F, -4.75F, 2.25F);
        this.body.addChild(dorsalfinR);
        this.setRotateAngle(dorsalfinR, -0.0873F, -0.3491F, 0.0F);
        this.dorsalfinR.cubeList.add(new ModelBox(dorsalfinR, 42, 45, 0.0F, -2.3F, -0.35F, 0, 5, 8, 0.0F, false));

        this.dorsalfinL = new AdvancedModelRenderer(this);
        this.dorsalfinL.setRotationPoint(3.25F, -4.75F, 2.25F);
        this.body.addChild(dorsalfinL);
        this.setRotateAngle(dorsalfinL, -0.0873F, 0.3491F, 0.0F);
        this.dorsalfinL.cubeList.add(new ModelBox(dorsalfinL, 42, 45, 0.0F, -2.3F, -0.35F, 0, 5, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.05F, -2.75F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.5672F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, 3.25F, -5.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 50, -3.0F, -2.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 2.25F, 3.25F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 27, -3.0F, -2.25F, -8.65F, 4, 1, 7, 0.01F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.15F;
        this.body.offsetX = -0.13F;
        this.body.offsetZ = -0.72F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(body6, 0.0F, -0.08F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.Bodyfront.offsetY = 1.3F;

        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.1F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.225F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        if (f3 != 0.0F) {this.walk(jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}

        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(body, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(body, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(dorsalfinL, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.swing(dorsalfinL, (float) (speed * 0.75), 0.1F, true, 3, 0, f2, 1);
        this.walk(dorsalfinR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
        this.swing(dorsalfinR, (float) (speed * 0.75), -0.1F, true, 0, 0, f2, 1);

        this.walk(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.swing(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
        this.flap(pelvicfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

        this.walk(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
        this.swing(pelvicfinR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
        this.flap(pelvicfinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            //this.Bodyfront.offsetY = 1.32F;
            this.bob(body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

}

