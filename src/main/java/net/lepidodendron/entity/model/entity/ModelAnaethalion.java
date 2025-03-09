package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAnaethalion extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Anaethalion;
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
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body5;

    public ModelAnaethalion() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Anaethalion = new AdvancedModelRenderer(this);
        this.Anaethalion.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Anaethalion.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 30, 0, -1.5F, -2.0F, -5.0F, 3, 4, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 32, -2.0F, -2.4F, -2.0F, 4, 5, 2, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.1F, -5.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 9, -1.0F, 0.0015F, 0.0174F, 2, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.9F, -6.8F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8378F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, -1.0F, -1.9709F, 0.645F, 2, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 40, -1.0F, -0.9709F, -0.055F, 2, 1, 3, 0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 26, -1.0F, -1.0F, 2.0F, 2, 1, 6, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.2F, -5.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 43, -1.0F, 0.1F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.9F, -5.5F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 23, -1.5F, 4.5993F, 2.3185F, 3, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 41, 0, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 20, 14, -1.0F, 0.0F, -3.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2967F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 38, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.002F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.5F, -2.4F, 0.0F, 5, 5, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.096F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 6, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.5F, 2.0F, 0.6F);
        this.Body1.addChild(PectoralL);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6109F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 41, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.5F, 2.0F, 0.6F);
        this.Body1.addChild(PectoralR);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6109F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 41, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 11, -2.0F, -2.4F, 0.0F, 4, 6, 5, 0.02F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(2.0F, 3.5F, 3.3F);
        this.Body2.addChild(PelvicL);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 20, 0.0F, -1.8F, 0.0F, 0, 2, 4, 0.0F, false));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-2.0F, 3.5F, 3.3F);
        this.Body2.addChild(PelvicR);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2182F, -0.3927F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 20, 0.0F, -1.8F, 0.0F, 0, 2, 4, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 26, 14, -1.5F, -2.0F, -1.0F, 3, 5, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 30, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.3F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.829F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 41, 0.0F, -4.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.3F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0873F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 0, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 26, 24, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 37, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.3F, 1.8F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.672F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 15, 0.0F, -0.0421F, 0.0691F, 0, 2, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 34, -0.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 28, 33, -0.5F, -1.5F, -1.0F, 1, 3, 4, -0.001F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 13, 17, 0.0F, -4.0F, 2.0F, 0, 8, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Anaethalion.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Anaethalion.rotateAngleY = (float) Math.toRadians(90);
        this.Anaethalion.offsetY = -0.13F;
        this.Anaethalion.offsetX = -0.06F;
        this.Anaethalion.offsetZ = -0.87F;
        this.Anaethalion.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body1, 0.0F, 0.01F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.03F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.04F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.05F, 0.0F);
        this.Anaethalion.offsetY = -0.2F;
        this.Anaethalion.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Anaethalion.offsetY = -2.0F;
        this.Anaethalion.offsetX = 0.5F;
        this.Anaethalion.rotateAngleY = (float) Math.toRadians(210);
        this.Anaethalion.rotateAngleX = (float) Math.toRadians(8);
        this.Anaethalion.rotateAngleZ = (float) Math.toRadians(-4);
        this.Anaethalion.scaleChildren = true;
        float scaler = 5.5F;
        this.Anaethalion.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Anaethalion, 0.5F, 3.9F, -0.2F);
        this.setRotateAngle(Body1, 0.0F, 0.01F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.02F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.03F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.04F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.05F, 0.0F);
        //End of pose, now render the model:
        this.Anaethalion.render(f);
        //Reset rotations, positions and sizing:
        this.Anaethalion.setScale(1.0F, 1.0F, 1.0F);
        this.Anaethalion.scaleChildren = false;
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
        this.Anaethalion.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PelvicR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Anaethalion, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Anaethalion.rotateAngleZ = (float) Math.toRadians(90);
                this.Anaethalion.offsetY = -0.15F;
                this.bob(Anaethalion, -speed, 5F, false, f2, 1);
            }
        }
    }
}
