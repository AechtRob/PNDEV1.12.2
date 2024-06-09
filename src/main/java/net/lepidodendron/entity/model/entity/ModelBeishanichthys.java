package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBeishanichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;

    public ModelBeishanichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 13, -2.0F, -8.0F, -4.5F, 4, 7, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 30, -2.0F, -4.1F, -8.0F, 4, 1, 1, 0.03F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 40, -2.0F, -4.6F, -8.5F, 4, 2, 2, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 20, -2.0F, -5.0F, -9.4F, 4, 3, 6, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -4.0F, -3.5F);
        this.bone2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 42, 0.0F, -3.75F, 0.0F, 1, 7, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -4.0F, -3.5F);
        this.bone2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 42, -1.0F, -3.75F, 0.0F, 1, 7, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.bone2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 29, -1.5F, -0.6F, -0.4F, 3, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -8.0F, -4.0F);
        this.bone2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 30, -1.5F, -0.25F, -0.4F, 3, 1, 6, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 32, -1.5F, -9.0F, -5.65F, 3, 3, 5, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.0F, -2.0F, -2.0F);
        this.bone2.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.2618F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0F, 2.0F, 2.0F);
        this.pectoralfinL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 48, 2.0F, -1.5F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 30, 2.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.0F, -2.0F, -2.0F);
        this.bone2.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.0F, -0.2618F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0F, 2.0F, 2.0F);
        this.pectoralfinR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 44, -2.0F, -1.5F, 0.5F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 24, -2.0F, -2.0F, -2.5F, 0, 2, 3, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -5.0F, 1.0F);
        this.bone2.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 20, 0, -2.0F, -4.0F, 0.0F, 4, 9, 5, 0.01F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 21, 0.0F, -4.75F, 0.0F, 0, 1, 5, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(0.5F, 5.0F, 4.5F);
        this.body1.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.2618F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, -5.5F);
        this.pelvicfinL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 1, 1.0F, -3.5F, 4.25F, 0, 1, 3, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-0.5F, 5.0F, 4.5F);
        this.body1.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.2618F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.0F, -5.5F);
        this.pelvicfinR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.0F, -3.5F, 4.25F, 0, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.0F, -2.5F, -0.5F, 4, 7, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 20, 13, 0.0F, -4.75F, 0.0F, 0, 2, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.5F, 5.0F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 23, -1.5F, 0.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.5F, 5.0F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1571F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 14, -1.5F, -0.5F, -5.75F, 3, 2, 6, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 38, 0, -1.5F, -1.5F, 0.0F, 3, 4, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 14, 5, 0.0F, -5.25F, 0.0F, 0, 4, 9, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 21, 0.0F, 1.75F, 0.0F, 0, 4, 8, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.5F, 4.0F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 22, -1.0F, -2.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.5F, 4.0F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 37, -1.0F, -0.5F, -5.0F, 2, 2, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 12, 36, -1.0F, -1.25F, -1.0F, 2, 3, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 0, -0.5F, -1.0F, -0.25F, 1, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 30, 0.0F, -3.25F, 0.0F, 0, 6, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.0F, -19.0F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 0, -0.5F, -1.5F, 19.0F, 1, 1, 4, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -2.25F, -3.8F);
        this.bone2.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 8, -1.5F, -0.5F, -4.95F, 3, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.5F, 3.95F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2094F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 14, -1.0F, -0.05F, -8.9F, 2, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone2.render(f5);
    }
    public void renderStaticWall(float f) {
        this.bone2.rotateAngleY = (float) Math.toRadians(90);
        this.bone2.offsetX = -0.05F;
        this.bone2.offsetY = -0.2F;
        this.bone2.offsetZ = -0.02F;
        this.bone2.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body1, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.1571F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.2094F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0785F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralfinL, 0.0F, 0.2618F, 0.0F);
        this.setRotateAngle(pectoralfinR, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(pelvicfinL, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(pelvicfinR, 0.0F, 0.0F, 0.2618F);
        this.bone2.offsetX = -0.005F;
        this.bone2.offsetY = -0.45F;
        this.bone2.render(0.01F);
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
        //this.bone2.offsetY = 0.8F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.01F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
            this.swing(bone2, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(12.5), false, 0, 0.2F, f2, 1);
            this.walk(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.bone2.rotateAngleZ = (float) Math.toRadians(90);
                this.bone2.offsetY = 0F;
                this.bob(bone2, -speed, 5F, false, f2, 1);
            }
        }
    }
}
