package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHeterostrophus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Heterostrophus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PctoralL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PctoralL2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer PelvicL2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body5;

    public ModelHeterostrophus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.Heterostrophus = new AdvancedModelRenderer(this);
        this.Heterostrophus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -5.0F, -7.0F);
        this.Heterostrophus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 17, 43, -2.5F, -4.0F, -5.0F, 5, 6, 3, -0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 32, -3.0F, -4.0F, -3.0F, 6, 7, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.5F, -5.2F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5847F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 9, -2.0F, -2.9598F, 0.076F, 4, 3, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -3.1F, -6.6F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0908F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 49, -1.5F, -0.0573F, -2.9392F, 3, 4, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -5.6F, -3.4F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 33, -2.5F, -0.022F, 0.0001F, 5, 3, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.4F, -5.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6545F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 18, -2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -2.9F, -5.5F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 55, 0, -2.5F, 0.4993F, 0.3185F, 5, 2, 2, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 9, -2.5F, 0.9993F, 0.8185F, 5, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0436F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.48F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 51, -1.5F, 0.0F, -3.3F, 3, 1, 4, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 19, 16, -3.0F, -6.0F, -1.0F, 6, 11, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.4F, -1.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2269F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 43, -2.5F, 0.1F, 0.1F, 5, 2, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.4F, -1.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 26, -2.5F, -2.1F, 0.0F, 5, 2, 3, 0.01F, false));

        this.PctoralL = new AdvancedModelRenderer(this);
        this.PctoralL.setRotationPoint(3.0F, 1.4F, 0.0F);
        this.Body1.addChild(PctoralL);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PctoralL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 55, 0.01F, -1.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.PctoralL2 = new AdvancedModelRenderer(this);
        this.PctoralL2.setRotationPoint(-3.0F, 1.4F, 0.0F);
        this.Body1.addChild(PctoralL2);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PctoralL2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 55, -0.01F, -1.5F, 0.0F, 0, 3, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -7.0F, -1.0F, 5, 13, 6, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(2.5F, 5.0F, 1.7F);
        this.Body2.addChild(PelvicL);
        this.setRotateAngle(PelvicL, -0.9113F, 0.2485F, -0.3073F);
        this.PelvicL.cubeList.add(new ModelBox(PelvicL, 17, 0, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.PelvicL2 = new AdvancedModelRenderer(this);
        this.PelvicL2.setRotationPoint(-2.5F, 5.0F, 1.7F);
        this.Body2.addChild(PelvicL2);
        this.setRotateAngle(PelvicL2, -0.9113F, -0.2485F, 0.3073F);
        this.PelvicL2.cubeList.add(new ModelBox(PelvicL2, 17, 0, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 23, 0, -2.0F, -4.0F, -1.0F, 4, 7, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.48F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 21, 53, 0.0F, -3.0F, 1.0F, 0, 3, 5, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 36, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 26, -1.5F, -3.0F, 0.0F, 3, 3, 6, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 52, 0.0F, -1.0F, 6.0F, 0, 3, 5, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 20, 0.0F, 0.0F, 3.0F, 0, 3, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 46, -1.5F, -2.0F, -1.0F, 3, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.2F, 0.0F);
        this.Body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 41, -1.0F, -0.1F, 0.0F, 2, 3, 6, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 44, 0, -1.0F, -2.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -7.0F, -5.0F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 53, 13, 0.0F, -2.0F, 6.0F, 0, 3, 5, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 8, 20, -0.5F, -0.5F, -1.0F, 1, 2, 4, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 20, 0.0F, -6.0F, 2.0F, 0, 13, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Heterostrophus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Heterostrophus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.Heterostrophus.offsetZ = -1.27F;
        this.Heterostrophus.offsetY = -0.2F;
        this.Heterostrophus.offsetX = -0.03F;
        this.Heterostrophus.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Heterostrophus, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Heterostrophus.offsetZ = 0.02F;
        this.Heterostrophus.offsetY = -0.05F;
        this.Heterostrophus.offsetX = -0.02F;
        this.Heterostrophus.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Heterostrophus.offsetY = -1.6F;
        this.Heterostrophus.offsetX = -0.35F;
        this.Heterostrophus.rotateAngleY = (float)Math.toRadians(200);
        this.Heterostrophus.rotateAngleX = (float)Math.toRadians(8);
        this.Heterostrophus.rotateAngleZ = (float)Math.toRadians(-8);
        this.Heterostrophus.scaleChildren = true;
        float scaler = 3.5F;
        this.Heterostrophus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Heterostrophus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Heterostrophus.render(f);
        //Reset rotations, positions and sizing:
        this.Heterostrophus.setScale(1.0F, 1.0F, 1.0F);
        this.Heterostrophus.scaleChildren = false;
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
        //this.Dapedium.offsetY = 1.15F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.5F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, -0.2f, f2, 1);

            this.walk(PctoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PctoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PctoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PctoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.walk(PelvicL2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);
            this.swing(PelvicL2, (float) (speed * 0.75), 0.11F, true, 1.5F, 0, f2, 1);


            this.swing(Heterostrophus, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Heterostrophus.rotateAngleZ = (float) Math.toRadians(270);
                //this.Dapedium.offsetY = 1.15F;
                this.bob(Heterostrophus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
