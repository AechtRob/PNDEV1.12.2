package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelIsanichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PelvicfinR;
    private final AdvancedModelRenderer PelvicfinL;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer PectoralfinR;
    private final AdvancedModelRenderer PectoralfinL;

    public ModelIsanichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 28.0F, 2.0F);
        this.Body.cubeList.add(new ModelBox(Body, 11, 36, -3.0F, -11.0F, -8.5F, 6, 6, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 38, 11, -2.5F, -10.0F, -11.5F, 5, 4, 3, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 2, -2.0F, -9.15F, -12.3F, 4, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -11.0F, -9.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7069F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -2.5F, -5.725F, 4, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -11.0F, -9.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 45, -2.0F, 0.025F, -5.35F, 4, 2, 3, -0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -11.0F, -9.0F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 42, -3.0F, -0.2F, -2.75F, 5, 2, 3, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.0F, -11.5F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 26, -2.0F, -1.5F, -2.0F, 4, 2, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -7.0F, -11.5F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 47, -2.0F, -0.9F, -4.0F, 4, 1, 3, 0.005F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -6.0F, -11.5F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 19, -1.5F, -1.1F, 0.2F, 3, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -11.75F, -6.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 36, -2.5F, 0.1F, -3.25F, 5, 2, 4, -0.015F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -6.5F, -11.75F);
        this.Body.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3054F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 43, 32, -1.5F, -0.7F, -3.6F, 3, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -8.0F, -6.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -3.85F, 0.0F, 5, 7, 11, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.1F, 0.0F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -2.0F, -0.95F, 0.0F, 4, 1, 11, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 23, 23, -2.0F, -2.75F, -0.5F, 4, 6, 7, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 3.25F, 6.5F);
        this.Body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 0, -1.0F, -1.0F, -7.0F, 3, 1, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -2.75F, 6.5F);
        this.Body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1484F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 11, -1.0F, 0.0F, -7.0F, 3, 1, 7, 0.0F, false));

        this.PelvicfinR = new AdvancedModelRenderer(this);
        this.PelvicfinR.setRotationPoint(-1.3F, 3.75F, 0.75F);
        this.Body3.addChild(PelvicfinR);
        this.setRotateAngle(PelvicfinR, 0.0F, 0.0F, 0.5236F);
        this.PelvicfinR.cubeList.add(new ModelBox(PelvicfinR, 0, 6, 0.0F, 0.0F, -0.25F, 0, 2, 3, 0.0F, false));

        this.PelvicfinL = new AdvancedModelRenderer(this);
        this.PelvicfinL.setRotationPoint(1.3F, 3.75F, 0.75F);
        this.Body3.addChild(PelvicfinL);
        this.setRotateAngle(PelvicfinL, 0.0F, 0.0F, -0.5236F);
        this.PelvicfinL.cubeList.add(new ModelBox(PelvicfinL, 0, 6, 0.0F, 0.0F, -0.25F, 0, 2, 3, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 6.5F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 36, 3, -1.5F, -1.5F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.5F, 4.0F);
        this.Body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3491F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 13, 0.5F, 0.0F, -5.0F, 0, 4, 6, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 38, 19, -0.5F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.5F, 4.0F);
        this.Body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2443F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.5F, -4.0F, -5.0F, 0, 4, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 40, -0.5F, 0.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 42, 42, -1.0F, -1.5F, -0.75F, 2, 3, 4, -0.01F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 0, 23, 0.0F, -4.75F, -0.25F, 0, 9, 7, 0.0F, false));

        this.PectoralfinR = new AdvancedModelRenderer(this);
        this.PectoralfinR.setRotationPoint(-2.8F, -5.25F, -6.5F);
        this.Body.addChild(PectoralfinR);
        this.setRotateAngle(PectoralfinR, 0.48F, 0.0F, 0.6109F);
        this.PectoralfinR.cubeList.add(new ModelBox(PectoralfinR, 0, 15, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.PectoralfinL = new AdvancedModelRenderer(this);
        this.PectoralfinL.setRotationPoint(2.8F, -5.25F, -6.5F);
        this.Body.addChild(PectoralfinL);
        this.setRotateAngle(PectoralfinL, 0.48F, 0.0F, -0.6109F);
        this.PectoralfinL.cubeList.add(new ModelBox(PectoralfinL, 0, 15, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetY = -0.2F;
        this.Body.offsetX = -0.05F;
        this.Body.offsetZ = -0.0F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, -0.5F, 0.0F);
        this.Body.offsetY = -0.14F;
        this.Body.offsetZ = -0.1F;
        this.Body.render(0.01F);
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
        //this.Body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body6, this.Body6};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.75F, 0.15F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Body, speed*0.75F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
                this.Body.offsetY = -0.28F;
                this.bob(Body, speed*1.5F, 5F, false, f2, 1);
            }
        }
    }
}
