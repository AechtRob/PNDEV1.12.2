package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelOreochima extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;

    public ModelOreochima() {
        this.textureWidth = 28;
        this.textureHeight = 25;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.0437F, -0.4567F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.0437F, -3.5433F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 8, -1.5F, -0.575F, -2.9F, 3, 1, 1, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 20, -1.0F, -0.725F, -3.41F, 2, 2, 0, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 4, -1.5F, -0.975F, -3.4F, 3, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.9563F, -3.5433F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 0, -1.5F, -1.175F, -2.2F, 3, 1, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0437F, -3.5433F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 8, -1.5F, 0.0F, -1.7F, 3, 3, 2, 0.015F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-1.5F, 1.4563F, -3.2933F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, -0.0436F, -0.48F, 0.0F);
        this.pectoralfinR.cubeList.add(new ModelBox(pectoralfinR, 7, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(1.5F, 1.4563F, -3.2933F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, -0.0436F, 0.48F, 0.0F);
        this.pectoralfinL.cubeList.add(new ModelBox(pectoralfinL, 7, 6, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.7563F, -5.4433F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.48F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 17, -1.0F, -0.6F, -1.6F, 2, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2937F, -3.5433F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.75F, 0.0F, 3, 4, 4, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.0436F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 8, -1.0F, -1.85F, -0.5F, 2, 3, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.7F, 1.4F);
        this.body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 10, 0.0F, -0.1F, -0.65F, 0, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.25F, 2.5F);
        this.body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2269F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 7, 13, -0.5F, -0.9F, -3.0F, 2, 1, 3, -0.01F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-0.35F, 1.5F, 0.25F);
        this.body3.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, -0.5236F, -0.1309F, 0.0F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 1, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(0.35F, 1.5F, 0.25F);
        this.body3.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, -0.5236F, 0.1309F, 0.0F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 1, 0.0F, -0.5F, -0.5F, 0, 1, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.1F, 2.7F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 3, 17, -0.75F, -1.6F, -0.5F, 1, 2, 3, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 3, 17, -0.25F, -1.6F, -0.5F, 1, 2, 3, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.25F, 1.25F, 2.5F);
        this.body4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 14, -1.5F, -2.65F, -2.875F, 1, 2, 3, -0.02F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 14, -2.0F, -2.65F, -2.875F, 1, 2, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.6F, -1.3F);
        this.body4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, 0.9F, 2.6F, 0, 1, 2, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.9F, 2.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, 0.0873F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 19, 12, -0.5F, -0.6F, -0.25F, 1, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, 0.0F, -1.85F, 1.5F, 0, 4, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 1.25F, 2.5F);
        this.body5.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2443F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 0, 0.5F, -1.55F, -2.55F, 1, 1, 2, -0.02F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetZ = -0.38F;
        this.body.offsetY = -0.2F;
        this.body.offsetX = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.F, -0.2F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.3F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.render(0.01F);
        resetToDefaultPose();
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
        //this.body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = -0.15F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
