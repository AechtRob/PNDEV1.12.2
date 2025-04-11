package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPseudomonocentris extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;

    public ModelPseudomonocentris() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.0F, -1.25F);
        this.body.cubeList.add(new ModelBox(body, 18, 16, -1.15F, -4.0F, -3.0F, 1, 3, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 16, 0.15F, -4.0F, -3.0F, 1, 3, 2, 0.01F, true));
        this.body.cubeList.add(new ModelBox(body, 12, 0, -1.0F, -4.95F, -1.9F, 2, 1, 4, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -4.2F, -1.95F, 2, 4, 4, 0.005F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -1.25F, -3.45F, -1.95F, 1, 0, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, 0.25F, -3.45F, -1.95F, 1, 0, 4, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.4F, -2.25F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3752F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 5, -1.0F, -2.0F, -2.6F, 2, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.5F, -2.35F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 8, -1.0F, -1.2F, -1.7F, 2, 1, 1, 0.01F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, -1.0F, -2.0F, -2.5F, 2, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -3.95F, 1.225F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 18, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, -3.95F, 0.275F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 16, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -4.075F, -0.75F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 5, 0.0F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.025F, -0.95F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 20, -1.0F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.25F, -0.95F, -0.95F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 13, -1.0F, 0.0F, -1.0F, 1, 0, 3, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 13, -2.5F, 0.0F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, -0.7F, 1.3F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 22, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.25F, -1.7F, -0.95F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 10, -1.0F, 0.0F, -1.0F, 1, 0, 3, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 10, -2.5F, 0.0F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -0.7F, 1.3F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 22, 0.0F, -0.5F, -0.5F, 0, 1, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-1.1F, -2.1F, -1.0F);
        this.body.addChild(bone);
        this.setRotateAngle(bone, 0.1745F, -0.2618F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 8, 18, 0.0F, -0.5F, -0.1F, 0, 1, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(1.1F, -2.1F, -1.0F);
        this.body.addChild(bone2);
        this.setRotateAngle(bone2, 0.1745F, 0.2618F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 8, 18, 0.0F, -0.5F, -0.1F, 0, 1, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -2.75F, 2.05F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 12, 10, -0.75F, -1.25F, -0.8F, 1, 3, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 12, 10, -0.25F, -1.25F, -0.8F, 1, 3, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.35F, -1.05F, 0.2F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, -0.85F, -1.0F, -1.0F, 1, 1, 3, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.35F, 2.25F, 0.2F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 16, -0.85F, -1.0F, -1.0F, 1, 1, 3, 0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -0.85F, 1.525F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 3, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -1.075F, -0.05F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 25, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.975F, 0.7F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 24, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.2F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 16, 21, -0.5F, -1.1F, -0.7F, 1, 2, 2, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 8, 26, -0.5F, -0.6F, 1.3F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.35F, -1.6F, 0.475F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2182F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 4, 26, -0.85F, 0.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.35F, 0.9F, 1.3F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 23, -0.85F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.8F, 1.4F);
        this.body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.829F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 0, 0.0F, -0.5F, -2.0F, 0, 1, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.1F, 1.3F);
        this.body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.6545F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 14, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.35F, -1.1F, 1.3F);
        this.body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5236F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 26, -0.85F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.15F, -0.1F, 1.55F);
        this.body3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.7854F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 12, 23, 0.15F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -1.45F, -4.25F);
        this.body.addChild(jaw);
        this.setRotateAngle(jaw, -0.6109F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 21, -0.75F, -0.75F, -1.95F, 1, 1, 2, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 21, -0.25F, -0.75F, -1.95F, 1, 1, 2, -0.02F, true));

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
        this.body.offsetX = 0.238F;
        this.body.rotateAngleY = (float)Math.toRadians(242);
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
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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

            this.flap(bone2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(bone2, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(bone, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(bone, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);


            this.swing(body, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.body.rotateAngleZ = (float) Math.toRadians(90);
                this.body.offsetY = -0.1F;
                this.bob(body, -speed, 5F, false, f2, 1);
            }
        }
    }
}
