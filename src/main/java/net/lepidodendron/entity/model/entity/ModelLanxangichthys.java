package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLanxangichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;

    public ModelLanxangichthys() {
        this.textureWidth = 72;
        this.textureHeight = 72;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 15.2536F, -10.5123F);
        this.body.cubeList.add(new ModelBox(body, 24, 0, -2.5F, -5.5036F, 1.5123F, 5, 9, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 50, 51, -2.5F, -4.2536F, -0.4877F, 5, 8, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 8, -2.0F, -2.2536F, -2.4877F, 4, 4, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 62, 0, -2.0F, -1.0036F, -1.9877F, 4, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 3.5464F, -0.5377F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 14, -3.0F, -2.0F, -2.0F, 4, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.5F, -0.6286F, -4.0627F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.6981F, 0.2182F, -0.0873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 45, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -0.6286F, -4.0627F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6981F, -0.2182F, 0.0873F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 45, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.7464F, -3.8877F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 30, -2.0F, -3.0F, -1.0F, 3, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 4.5964F, 1.7623F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 40, -3.0F, -1.0F, -2.0F, 4, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -4.2536F, 1.7623F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 35, -3.0F, -2.0F, -5.0F, 4, 2, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, 2.5964F, 1.5123F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 51, -1.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -6.4036F, 1.0123F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2007F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 45, -1.0F, 0.0F, 0.0F, 4, 2, 5, -0.02F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.25F, 3.3464F, 4.4123F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3491F, -0.1745F, 0.2618F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 42, 58, 0.0F, 0.0F, -1.0F, 0, 7, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.25F, 3.3464F, 4.4123F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3491F, 0.1745F, -0.2618F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 42, 58, 0.0F, 0.0F, -1.0F, 0, 7, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.7536F, 5.5123F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -2.5F, -6.0F, 0.0F, 5, 12, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 5.35F, 1.0F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 27, -3.0F, 0.0F, -1.0F, 4, 1, 7, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -5.75F, 1.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 36, -3.0F, -1.0F, -1.0F, 4, 2, 7, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 19, -2.0F, -5.5F, -0.75F, 4, 11, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, -5.3F, 0.25F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0611F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 0, -2.0F, -2.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 6.7F, 0.25F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0175F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 43, -2.0F, -2.0F, -1.0F, 3, 2, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 6.6F, 3.0F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.6545F, 0.0F, 0.5236F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 20, 61, 0.0F, -1.75F, -0.1F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 6.6F, 3.0F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.6545F, 0.0F, -0.5236F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 20, 61, 0.0F, -1.75F, -0.1F, 0, 2, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.3F, 5.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 40, -1.5F, -3.75F, -0.75F, 3, 9, 4, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 12, 61, 0.0F, -9.75F, -0.75F, 0, 6, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 6.75F, -0.6F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 58, 0.0F, -2.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -2.775F, -2.1F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 14, 52, 0.0F, -4.0F, -1.0F, 2, 4, 5, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 3.25F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 56, 8, 0.0F, -10.0F, 0.0F, 0, 8, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 53, -1.0F, -2.5F, -0.5F, 2, 7, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -2.05F, -0.05F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 60, 61, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 5.65F, 0.7F);
        this.body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.4363F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 50, 61, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 6.1F, 0.25F);
        this.body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.8727F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 60, 21, 0.0F, -4.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, -0.5F, 3.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 38, 14, -0.5F, -2.0F, -0.6F, 1, 5, 8, 0.01F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 19, 0.0F, -6.75F, 5.25F, 0, 12, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 4.6F, 0.0F);
        this.body6.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4102F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 58, 43, 0.0F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2964F, -2.0377F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 60, 36, -1.5F, -0.25F, -3.0F, 3, 1, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetZ = -0.34F;
        this.body.offsetY = -0.18F;
        this.body.offsetX = -0.0F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.6F, 0.0F);
        this.body.offsetY = -0.14F;
        this.body.offsetZ = 0.015F;
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
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4, this.body5, this.body6};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(pectoralfinright, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = 0.4F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
