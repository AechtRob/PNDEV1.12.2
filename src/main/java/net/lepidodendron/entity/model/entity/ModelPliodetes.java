package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPliodetes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer bb_main;

    public ModelPliodetes() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 20.75F, -3.75F);
        this.base.cubeList.add(new ModelBox(base, 10, 26, -1.5F, -3.0F, -1.0F, 3, 3, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.7F, -3.05F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4581F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 35, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 13, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.075F, -3.425F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 36, -1.0F, -1.0F, -1.0F, 2, 1, 1, 0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.8F, -2.8F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 35, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.15F, -1.9F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 31, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.8F, -0.2F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 31, -1.0F, -2.0F, -1.0F, 2, 2, 2, 0.02F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.3054F, -0.0873F, 0.3491F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 34, 22, 0.0F, -0.5F, -0.5F, 0, 4, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.3054F, 0.0873F, -0.3491F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 34, 22, 0.0F, -0.5F, -0.5F, 0, 4, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.9F, -2.8F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, 0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 34, -0.75F, -0.4F, -1.45F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 34, -0.25F, -0.4F, -1.45F, 1, 1, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.0F, 0.75F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -0.75F, -0.75F, 3, 4, 7, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 3.725F, 2.1F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 11, -0.5F, -1.0F, -1.0F, 2, 1, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.25F, 2.1F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 17, -0.5F, -2.3F, -1.0F, 0, 1, 5, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, -1.5F, -2.0F, -1.0F, 2, 2, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 3.425F, 0.275F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 5, -0.5F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.35F, 0.475F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3927F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 22, 0.5F, -1.3F, -0.65F, 0, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 8, -0.5F, -1.0F, -1.0F, 2, 1, 2, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 2.0F, 6.25F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -1.0F, -1.95F, -0.75F, 2, 3, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 20, 0, 0.0F, -5.25F, -0.25F, 0, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.75F, -1.55F, 0.0F);
        this.body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2967F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 23, -1.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 23, -1.5F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.75F, 1.65F, 0.3F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 0, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 0, -1.5F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.5F, 1.65F, 0.25F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 1.0036F, 0.0F, 0.1745F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 12, 18, 0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.5F, 1.65F, 0.25F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 1.0036F, 0.0F, -0.1745F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 12, 18, 0.0F, 0.0F, 0.0F, 0, 3, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.45F, 3.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 25, -0.75F, -1.2F, -0.65F, 1, 2, 4, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 25, -0.25F, -1.2F, -0.65F, 1, 2, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.0F, 0.35F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 29, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 3.15F, 2.4F);
        this.body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1745F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 17, 0.0F, -2.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.6F, 0.35F);
        this.body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 8, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.2F, 3.3F);
        this.body3.addChild(body4);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 1.2F, 0.8F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 34, 0.0F, -1.0F, -1.0F, 1, 1, 3, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.25F, 2.65F);
        this.body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 17, 0.0F, -4.0F, -1.0F, 0, 4, 5, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.0F, 0.9F);
        this.body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0175F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 29, 0.0F, -2.0F, -1.0F, 1, 2, 3, 0.0F, false));

        this.bb_main = new AdvancedModelRenderer(this);
        this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bb_main.cubeList.add(new ModelBox(bb_main, 30, 34, -1.0F, -5.75F, -6.825F, 2, 1, 1, 0.02F, false));

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
        this.setRotateAngle(base, 0.0F, 0.0F, 0.0F);
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
                this.base.offsetY = 0.15F;
                this.bob(base, -speed, 5F, false, f2, 1);
            }
        }
    }
}
