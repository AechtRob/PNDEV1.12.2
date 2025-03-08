package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCommentrya extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;

    public ModelCommentrya() {
        this.textureWidth = 40;
        this.textureHeight = 36;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 20.0F, -3.0F);
        this.base.cubeList.add(new ModelBox(base, 24, 18, -1.5F, -3.1F, -4.3F, 3, 1, 1, 0.02F, false));
        this.base.cubeList.add(new ModelBox(base, 0, 24, -1.5F, -3.75F, -1.0F, 3, 4, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -5.7F, -3.325F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 13, -2.0F, 1.0F, -3.0F, 3, 1, 2, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -5.175F, -0.55F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 17, -2.0F, 0.0F, -3.0F, 3, 2, 4, -0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -2.45F, -3.65F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 5, -2.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -2.0F, -5.0F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, -2.0F, -1.0F, 0.0F, 3, 1, 5, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.1F, 0.7F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, -2.5F, -0.5F, 3, 4, 6, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 6, 10, -1.0F, 1.25F, -0.5F, 2, 1, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.35F, 3.4F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 28, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.4F, 0.7F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0611F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 29, -1.0F, -1.0F, -1.0F, 2, 1, 3, 0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 1.75F, 3.5F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0F, 0.0F, 0.3491F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 0, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 1.75F, 3.5F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0F, 0.0F, -0.3491F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 0, 0.0F, 0.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 17, -1.5F, -1.35F, -0.75F, 3, 3, 4, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.95F, 3.15F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 0, -1.0F, 0.0F, -4.0F, 2, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.8F, 3.15F);
        this.body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 23, -1.0F, -1.0F, -4.0F, 2, 2, 4, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.25F, 3.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 16, 6, -1.0F, -1.0F, -0.5F, 2, 2, 5, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 1.0F, 2.75F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2007F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 23, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, 1.9F, -0.2F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 14, 1.0F, -1.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.1F, 3.1F);
        this.body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9599F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 0, 1.0F, -2.0F, -3.0F, 0, 3, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -1.2F, 2.75F);
        this.body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 18, 0.0F, 0.0F, -3.0F, 1, 1, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.body3.addChild(body4);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 1.0F, 0.0F);
        this.body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -2.0F, -1.0F, 1, 2, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.9F, 2.5F);
        this.body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 4, 0.0F, -5.0F, -1.0F, 0, 5, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.1F, 0.5F);
        this.body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 28, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.0F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.525F, -0.75F, 0.0F);
        this.base.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.48F, 0.0F, 0.2182F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 0, 13, 0.005F, 0.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.525F, -0.75F, 0.0F);
        this.base.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.48F, 0.0F, -0.2182F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 0, 13, -0.005F, 0.0F, -1.0F, 0, 3, 2, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.8F, -1.0F);
        this.base.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 23, -1.0F, 0.0F, -3.75F, 2, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.25F, -2.35F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 24, 13, -1.0F, -1.0F, -1.0F, 2, 1, 4, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -2.3F;
        this.base.offsetX = 1.0F;
        this.base.rotateAngleY = (float)Math.toRadians(235);
        this.base.rotateAngleX = (float)Math.toRadians(8);
        this.base.rotateAngleZ = (float)Math.toRadians(-8);
        this.base.scaleChildren = true;
        float scaler = 3.83F;
        this.base.setScale(scaler, scaler, scaler);

        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.base.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetX = -0.05F;
        this.base.offsetY = -0.2F;
        this.base.offsetZ = -1.6F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, -0.1F, 0.0F, 0.01F);
        this.setRotateAngle(body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.15F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.base.offsetY = -0.05F;
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
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};
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
