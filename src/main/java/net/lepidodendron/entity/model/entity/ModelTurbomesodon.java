package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTurbomesodon extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;

    public ModelTurbomesodon() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 18.925F, -7.075F);
        this.body.cubeList.add(new ModelBox(body, 36, 14, -1.0F, -3.925F, 0.075F, 2, 5, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 44, 19, -1.0F, -2.65F, 0.3F, 2, 1, 1, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -8.9F, 3.5F, 3, 13, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 26, 20, -1.5F, -6.0F, 2.0F, 3, 8, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5978F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 17, -1.0F, 0.0F, 0.0F, 2, 1, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, -0.85F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1178F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 14, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -3.925F, 0.075F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 41, -1.0F, -0.45F, -0.025F, 2, 4, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 6.15F, 5.325F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 37, -2.0F, -3.0F, 0.0F, 3, 2, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 5.025F, 3.175F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 36, -2.0F, -3.0F, 0.0F, 3, 2, 2, -0.02F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 5.175F, 3.5F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 40, -1.0F, -4.0F, -2.0F, 2, 3, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.05F, 2.95F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4363F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 41, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.825F, 1.075F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 5, -1.0F, -2.0F, -1.0F, 2, 1, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -10.4F, 4.55F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 42, -0.01F, -0.25F, 0.0F, 0, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 30, -1.5F, -0.075F, 0.075F, 3, 2, 3, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -9.15F, 2.975F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6458F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 25, -0.5F, -0.025F, 0.175F, 2, 2, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -4.1F, -0.275F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 30, -1.0F, -6.225F, -0.2F, 2, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.925F, 0.075F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4451F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 0, -1.0F, -3.25F, -0.075F, 2, 3, 2, -0.02F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, 1.325F, 4.075F);
        this.body.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.0F, -0.5236F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 34, 41, 0.0F, -2.0F, -0.25F, 0, 3, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, 1.325F, 4.075F);
        this.body.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.0F, 0.5236F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 34, 41, 0.0F, -2.0F, -0.25F, 0, 3, 3, 0.0F, true));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.5F, 4.325F, 6.825F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, -0.3927F, 0.0F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 12, 20, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 12, 17, 0.0F, -1.0F, 0.5F, 0, 2, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.5F, 4.325F, 6.825F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.3927F, 0.0F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 12, 20, 0.0F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 12, 17, 0.0F, -1.0F, 0.5F, 0, 2, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.075F, 7.575F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 30, 0.0F, -15.0F, -0.25F, 0, 9, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 14, 0, -1.0F, -9.75F, -0.5F, 2, 11, 4, 0.02F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.525F, 2.625F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.829F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 41, -1.0F, -2.0F, 0.0F, 2, 2, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.175F, -0.275F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 35, -1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -12.175F, -0.025F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5672F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 0, -1.0F, 0.0F, -0.075F, 2, 3, 5, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -5.25F, 2.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 36, 8, -0.5F, -1.025F, -0.25F, 1, 2, 4, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 17, 0.0F, 1.0F, 0.0F, 0, 7, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 26, 8, -0.01F, -2.75F, 3.5F, 0, 7, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 14, 15, 0.0F, -9.75F, 0.0F, 0, 9, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 41, -0.5F, -0.5F, 3.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 1.2F, 4.25F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.0297F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 35, 0.0F, -3.0F, -6.0F, 1, 3, 3, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.0F, 3.75F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.2043F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 29, 0.0F, -3.0F, -3.0F, 1, 3, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.0F, 3.75F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.9338F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 30, 0.0F, 0.0F, -4.05F, 1, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, 0.6545F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 21, -1.0F, -0.5F, -3.0F, 2, 1, 3, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -1.2F;
        this.body.offsetX = 1.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(100);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 5.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.125F;
        this.body.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
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
        //this.body.offsetY = 1.35F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinleft, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pectoralfinright, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(pectoralfinright, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(pelvicfinleft, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinleft, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(pelvicfinright, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(pelvicfinright, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                //this.body.offsetY = -0.10F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
