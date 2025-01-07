package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLepidohyas extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;

    public ModelLepidohyas() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, -2.0F);
        this.base.cubeList.add(new ModelBox(base, 14, 20, -1.25F, -7.5F, -4.0F, 1, 5, 2, 0.0F, false));
        this.base.cubeList.add(new ModelBox(base, 14, 20, 0.25F, -7.5F, -4.0F, 1, 5, 2, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.675F, -4.35F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 15, -1.0F, -5.0F, -2.0F, 2, 5, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.25F, -3.7F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 8, -1.0F, -1.0F, -2.0F, 2, 1, 1, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 15, -1.0F, -3.0F, -2.0F, 2, 3, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5F, -4.0F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 5, -1.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -5.75F, -2.5F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -3.25F, 0.0F, 2, 7, 5, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 11, -1.0F, -4.875F, 1.85F, 2, 2, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.875F, 3.825F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 2.65F, 2.025F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 7, -1.0F, 1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.075F, 1.025F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 22, -1.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -3.95F, 0.075F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 20, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.55F, 5.075F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -0.75F, -1.4F, -0.25F, 1, 3, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -0.25F, -1.4F, -0.25F, 1, 3, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.65F, 0.65F, 5.15F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.2654F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.65F, -3.0F, -3.0F, 0, 3, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.65F, 1.85F, 2.4F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6981F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, -1.0F, -3.0F, -3.0F, 1, 3, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 0, -1.3F, -3.0F, -3.0F, 1, 3, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.65F, -2.0F, 2.225F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9163F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 8, -1.0F, 0.0F, -3.0F, 1, 3, 4, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 8, -1.3F, 0.0F, -3.0F, 1, 3, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.65F, -3.75F, 4.375F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9163F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 19, 0.65F, 1.0F, -3.0F, 0, 2, 3, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.15F, 2.65F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.2618F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -0.5F, -1.0F, -0.25F, 1, 2, 2, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.1F, 1.0F, 0.75F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.6F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4F, 2.95F, 2.75F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 7, 0.4F, -4.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.1F, -0.2F, 2.75F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 9, 0, -0.6F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 4.3F, 2.875F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, -0.4363F, -0.2182F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.5F, -0.25F);
        this.pelvicfinright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 2, 1.0F, 1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 4.3F, 2.875F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, -0.4363F, 0.2182F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.0F, -1.5F, -0.25F);
        this.pelvicfinleft.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 2, -1.0F, 1.0F, 0.0F, 0, 1, 2, 0.0F, true));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.25F, -2.75F, -2.25F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.8727F, 0.0F, 0.2618F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 16, 8, 0.0F, -0.5F, -0.25F, 0, 1, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.25F, -2.75F, -2.25F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.8727F, 0.0F, -0.2618F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 16, 8, 0.0F, -0.5F, -0.25F, 0, 1, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.base.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 15, -1.0F, -1.0F, -2.0F, 2, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.0F;
        this.base.offsetX = -1.338F;
        this.base.rotateAngleY = (float)Math.toRadians(200);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 1.63F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.base.offsetZ = -0.34F;
        this.base.offsetY = -0.18F;
        this.base.offsetX = -0.0F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.6F, 0.0F);
        this.base.offsetY = -0.14F;
        this.base.offsetZ = 0.015F;
        this.base.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
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


            this.swing(base, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.base.rotateAngleZ = (float) Math.toRadians(90);
                this.base.offsetY = -0.1F;
                this.bob(base, -speed, 5F, false, f2, 1);
            }
        }
    }
}
