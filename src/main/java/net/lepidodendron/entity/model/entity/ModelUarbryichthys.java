package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUarbryichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pelvicfinR;
    private final AdvancedModelRenderer pelvicfinL;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r13;

    public ModelUarbryichthys() {
        this.textureWidth = 50;
        this.textureHeight = 45;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 11, 25, -2.5F, -7.9F, -3.0F, 5, 7, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 30, 14, -2.0F, -5.9F, -5.0F, 4, 4, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 35, 20, -2.0F, -4.9F, -7.0F, 4, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -8.0F, -3.35F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 14, -2.0F, 0.45F, -2.8F, 4, 1, 1, 0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 40, 14, -2.0F, 1.7F, -6.975F, 4, 1, 1, -0.02F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -2.0F, -0.05F, -7.05F, 4, 2, 7, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 8, -2.0F, -11.4F, -2.0F, 4, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 0, -2.0F, -0.9F, -4.0F, 4, 1, 4, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.3054F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 29, -1.5F, -0.9F, -6.0F, 3, 1, 2, 0.0F, false));

        this.pectoralfinR = new AdvancedModelRenderer(this);
        this.pectoralfinR.setRotationPoint(-2.5F, -1.75F, -2.0F);
        this.body.addChild(pectoralfinR);
        this.setRotateAngle(pectoralfinR, 0.3491F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.pectoralfinR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.8727F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 31, 0.0F, 0.0F, -1.25F, 0, 5, 4, 0.0F, false));

        this.pectoralfinL = new AdvancedModelRenderer(this);
        this.pectoralfinL.setRotationPoint(2.5F, -1.75F, -2.0F);
        this.body.addChild(pectoralfinL);
        this.setRotateAngle(pectoralfinL, 0.3491F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.pectoralfinL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.8727F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 31, 0.0F, 0.0F, -1.25F, 0, 5, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 22, 0.0F, -9.0F, 0.0F, 0, 7, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -2.25F, -1.0F, 5, 6, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -2.25F, 5.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 6, -2.0F, -0.4F, -5.75F, 4, 2, 6, 0.0F, false));

        this.pelvicfinR = new AdvancedModelRenderer(this);
        this.pelvicfinR.setRotationPoint(-1.0F, 3.5F, 4.25F);
        this.body2.addChild(pelvicfinR);
        this.setRotateAngle(pelvicfinR, 0.3491F, 0.0F, 0.6109F);
        this.pelvicfinR.cubeList.add(new ModelBox(pelvicfinR, 0, 0, 0.0F, 0.0F, -0.25F, 0, 2, 2, 0.0F, false));

        this.pelvicfinL = new AdvancedModelRenderer(this);
        this.pelvicfinL.setRotationPoint(1.0F, 3.5F, 4.25F);
        this.body2.addChild(pelvicfinL);
        this.setRotateAngle(pelvicfinL, 0.3491F, 0.0F, -0.6109F);
        this.pelvicfinL.cubeList.add(new ModelBox(pelvicfinL, 0, 0, 0.0F, 0.0F, -0.25F, 0, 2, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 27, 27, 0.0F, -9.0F, 0.0F, 0, 7, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 1, -1.0F, -5.75F, -1.75F, 3, 3, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 2.5F, 0.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 16, -1.5F, -4.0F, -0.65F, 4, 4, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 27, 20, 0.0F, -6.5F, 0.0F, 0, 6, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 7.0F, -9.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 34, -1.5F, -10.25F, 5.25F, 2, 1, 4, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.7418F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 3, 0.0F, -0.25F, -0.35F, 0, 2, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 7.0F, -9.0F);
        this.body4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 34, -2.0F, -6.9F, 9.1F, 3, 3, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.5F, 2.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 14, 0.0F, -3.25F, 1.5F, 0, 6, 7, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 37, 25, -1.0F, -1.0F, -0.5F, 2, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 35, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.offsetY = -0.18F;
        this.body.offsetX = -0.05F;
        this.body.offsetZ = 0.02F;
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.28F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.1F;
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
        this.body.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.75F, 0.15F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pelvicfinL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pelvicfinR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(body, speed*0.75F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = -0.15F;
                this.bob(body, speed*0.75F, 5F, false, f2, 1);
            }
        }
    }
}
