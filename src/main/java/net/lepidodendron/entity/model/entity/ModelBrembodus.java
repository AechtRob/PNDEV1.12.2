package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrembodus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;

    public ModelBrembodus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 10, -1.0F, -8.25F, -6.0F, 2, 4, 3, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 12, 10, -1.0F, -8.25F, -5.75F, 2, 4, 3, -0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 17, -1.0F, -1.0F, -5.95F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 7, -1.0F, -3.25F, -6.45F, 2, 1, 3, -0.03F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 7, -1.0F, -3.25F, -6.95F, 2, 1, 3, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 20, 0.0F, -13.3F, -3.65F, 0, 5, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 26, -0.5F, -8.9F, -3.65F, 1, 2, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 18, -1.0F, -4.05F, -0.05F, 2, 1, 1, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, -1.0F, -7.8F, -0.7F, 2, 7, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 23, -1.0F, -1.075F, -0.025F, 2, 1, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -7.0F, -3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.0F, -4.5F, 0.0F, 2, 9, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 22, 14, -1.0F, 4.05F, 2.0F, 2, 1, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.5F, 4.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 5, 22, -0.5F, -0.25F, -2.875F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 5.0F, 2.0F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 11, -1.5F, -1.0F, -2.0F, 2, 1, 2, -0.02F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.0F, 2.5F, 0.0F);
        this.body2.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.2182F, -0.5236F, 0.0F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 6, 13, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.0F, 2.5F, 0.0F);
        this.body2.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.2182F, 0.5236F, 0.0F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 6, 13, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 10, 17, -0.75F, -2.5F, -0.75F, 1, 5, 3, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.75F, -1.25F, 2.25F, 1, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 10, 17, -0.25F, -2.5F, -0.75F, 1, 5, 3, 0.0F, true));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -0.25F, -1.25F, 2.25F, 1, 2, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 4.2F, 1.3F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.0472F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -1.35F, -1.975F, -0.05F, 1, 2, 4, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -1.0F, 0.025F, -0.3F, 0, 2, 4, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 16, -1.65F, -1.975F, -0.05F, 1, 2, 4, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.0F, 4.5F, 0.0F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 25, -1.35F, -2.05F, -0.65F, 1, 2, 2, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 25, -1.65F, -2.05F, -0.65F, 1, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -3.0F, 2.25F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.0908F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -1.35F, 0.0F, 0.0F, 1, 2, 2, -0.01F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 24, -1.65F, 0.0F, 0.0F, 1, 2, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -3.0F, 2.25F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.829F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 0, -1.35F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 0, -1.65F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -3.0F, 2.25F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.9599F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 7, 1.0F, -2.0F, -3.25F, 0, 3, 6, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.4F, 4.35F, 0.25F);
        this.body3.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.3054F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.35F, 0.15F, -0.75F);
        this.pelvicfinright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1309F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 2, 0.35F, -0.05F, 0.35F, 0, 1, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.4F, 4.35F, 0.25F);
        this.body3.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.3054F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.35F, 0.15F, -0.75F);
        this.pelvicfinleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 2, -0.35F, -0.05F, 0.35F, 0, 1, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.25F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 19, 0, -0.5F, -0.25F, -0.75F, 1, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 18, 14, 0.0F, -2.75F, 0.25F, 0, 6, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.25F, 1.25F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 0, 0.0F, -0.35F, -2.0F, 1, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -5.3F, -5.5F);
        this.body.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.3F, -2.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 20, -1.0F, -0.125F, -0.025F, 2, 1, 2, -0.02F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -0.25F;
        this.body.offsetX = 1.4F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 5.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
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
        this.setRotateAngle(body, -0.2F, -0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.body.offsetZ = -0.05F;
        this.body.offsetY = 0.05F;
        this.body.render(0.01F);
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
        AdvancedModelRenderer[] fishTail = {this.body3, this.body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.35F, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

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
                this.body.offsetY = -0.10F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
