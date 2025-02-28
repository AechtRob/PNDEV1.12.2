package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelStenamara extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;

    public ModelStenamara() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 16.225F, -4.95F);
        this.body.cubeList.add(new ModelBox(body, 10, 20, -1.1F, -1.225F, 0.35F, 1, 5, 2, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 10, 20, 0.1F, -1.225F, 0.35F, 1, 5, 2, 0.02F, true));
        this.body.cubeList.add(new ModelBox(body, 30, 8, -1.0F, -0.325F, -0.675F, 2, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 5.25F, 2.2F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 26, -1.0F, -3.0F, -1.0F, 2, 3, 2, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6F, 1.1F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 5, -1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 22, -1.0F, -2.0F, -1.0F, 2, 2, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 2.6F, -0.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 22, 0, -1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.875F, -0.2F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 27, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.015F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.1F, 2.525F, 2.35F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, -0.2618F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 14, 30, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.1F, 2.525F, 2.35F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.2618F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 14, 30, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.575F, 0.35F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.1F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 29, -1.0F, 0.0F, -1.5F, 2, 1, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.3F, 1.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -4.8F, 0.0F, 2, 10, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 30, 0, -1.0F, 5.0F, 1.45F, 2, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.275F, -4.525F, 3.575F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6981F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 30, -0.5F, -2.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 30, -1.05F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.275F, -4.85F, 1.825F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 31, -0.5F, -2.0F, 0.0F, 1, 2, 1, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 31, -1.05F, -2.0F, 0.0F, 1, 2, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.275F, -4.625F, 1.95F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 31, -0.5F, -2.0F, 0.0F, 1, 2, 1, -0.02F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 31, -1.05F, -2.0F, 0.0F, 1, 2, 1, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.275F, -4.975F, -0.15F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -0.5F, -2.0F, 0.0F, 1, 2, 3, 0.01F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -1.05F, -2.0F, 0.0F, 1, 2, 3, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 6.0F, 3.45F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5672F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 30, -1.5F, -1.0F, -1.0F, 2, 1, 1, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 5.725F, 0.475F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 26, -1.5F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 24, 10, -0.75F, -1.0F, -0.65F, 1, 2, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 32, -0.5F, -0.25F, 2.25F, 1, 1, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 26, 15, -0.01F, -1.5F, 2.35F, 0, 4, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 10, -0.25F, -1.0F, -0.65F, 1, 2, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.75F, 1.0F, 2.35F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.0472F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 12, -1.0F, -3.0F, -5.0F, 1, 3, 5, -0.01F, true));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 12, 12, -1.5F, -3.0F, -5.0F, 1, 3, 5, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.75F, -1.0F, 2.35F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.3526F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 3, -1.0F, 0.0F, -2.0F, 1, 3, 2, 0.01F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 3, -1.5F, 0.0F, -2.0F, 1, 3, 2, 0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.75F, -2.9F, 1.925F);
        this.body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.9512F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 20, -1.0F, 0.0F, -3.0F, 1, 3, 3, 0.0F, true));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 20, -1.5F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.6F, 3.3F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -1.0036F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, 0.0F, -1.0F, -3.0F, 0, 5, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.1F, 1.1F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.829F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 0, 0.0F, -2.0F, -3.0F, 0, 7, 5, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 5.8F, 2.25F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.3927F, 0.0F, 0.2618F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 10, 14, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 5.8F, 2.25F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.3927F, 0.0F, -0.2618F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 10, 14, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.7F;
        this.body.offsetX = 0.638F;
        this.body.rotateAngleY = (float)Math.toRadians(245);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.63F;
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
        AdvancedModelRenderer[] fishTail = {this.body3};
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
