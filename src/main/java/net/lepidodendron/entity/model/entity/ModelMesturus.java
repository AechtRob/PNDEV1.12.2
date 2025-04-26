package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMesturus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Mesturus;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body5;

    public ModelMesturus() {
        this.textureWidth = 85;
        this.textureHeight = 70;

        this.Mesturus = new AdvancedModelRenderer(this);
        this.Mesturus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.Mesturus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 34, 30, -2.0F, -10.0F, -4.0F, 4, 6, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.7F, -6.5F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.9512F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 51, -1.0F, -2.9F, 0.1F, 2, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -6.8F, -6.4F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 45, 54, -1.5F, -2.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -10.7F, -3.1F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4276F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 27, -1.5F, -0.0887F, 0.0188F, 3, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -7.6F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6894F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 18, -1.0F, 1.0F, 2.1F, 2, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 37, -1.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -9.6F, -6.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, -2.0F, -1.0007F, 3.9185F, 4, 1, 1, 0.04F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 35, -2.0F, -1.5007F, 3.4185F, 4, 2, 2, 0.03F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.3F, -4.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4887F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 35, -1.5F, -4.9181F, -0.2974F, 3, 5, 5, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -5.7F, -4.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.4451F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 5, -1.5F, 0.0F, -2.5F, 3, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 37, 0, -1.0F, 0.0F, -3.5F, 2, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.0F, -3.5F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -1.4F, 1.1F, 1, 1, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 21, -0.5F, -1.0F, 0.1F, 1, 1, 2, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.5F, -1.4F, 1.0F, 1, 1, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 21, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 18, 16, -2.5F, -5.0F, 0.0F, 5, 13, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -5.4F, 0.5F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 46, 47, -2.0F, -0.0846F, -0.087F, 4, 2, 4, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.5F, 4.6F, 0.6F);
        this.Body1.addChild(PectoralL);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5672F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 54, 56, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.5F, 4.6F, 0.6F);
        this.Body1.addChild(PectoralR);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 54, 56, 0.0F, -1.0F, 0.0F, 0, 3, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -2.5F, -6.0F, 0.0F, 5, 14, 6, 0.02F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 23, 0, -2.0F, -3.0F, -1.0F, 4, 8, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.5F, 1.0F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.7679F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 50, 0.0F, -3.9135F, 3.8853F, 0, 4, 5, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 55, 0.0F, -3.9135F, -0.1147F, 0, 4, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5411F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 18, -1.5F, 0.0F, -0.025F, 3, 3, 5, -0.001F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 18, -1.5F, 0.0F, 0.3F, 3, 3, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4363F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 9, -1.5F, -3.0F, 0.0F, 3, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 1.0F, 4.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 46, -1.5F, -2.0F, -1.0F, 3, 4, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -4.4F, 0.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6894F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 35, 42, -1.0F, -0.1F, 0.0F, 2, 3, 5, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.8F, 0.5F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.7243F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 50, 0.0F, -1.3457F, 0.4816F, 0, 4, 5, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 13, 0.0F, -1.3457F, -4.5184F, 0, 4, 5, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 0, -1.0F, -2.9457F, -0.0184F, 2, 3, 5, -0.001F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 20, 41, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 21, -0.01F, -5.5F, 2.0F, 0, 11, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Mesturus.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Mesturus.offsetY = -0.8F;
        this.Mesturus.offsetX = 0.35F;
        this.Mesturus.offsetZ = 2.0F;
        this.Mesturus.rotateAngleY = (float)Math.toRadians(120);
        this.Mesturus.rotateAngleX = (float)Math.toRadians(1);
        this.Mesturus.rotateAngleZ = (float)Math.toRadians(0);
        this.Mesturus.scaleChildren = true;
        float scaler = 2.2F;
        this.Mesturus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Mesturus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.2F, 0.0F);
        //End of pose, now render the model:
        this.Mesturus.render(f);
        //Reset rotations, positions and sizing:
        this.Mesturus.setScale(1.0F, 1.0F, 1.0F);
        this.Mesturus.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Mesturus, -0.15F, 0.0F, -0.1F);
        this.setRotateAngle(Head, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.2F, 0.0F);
        this.Mesturus.offsetY = -0.4F;
        this.Mesturus.render(0.018f);
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
        this.Mesturus.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
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


            this.swing(Mesturus, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Mesturus.rotateAngleZ = (float) Math.toRadians(90);
                this.Mesturus.offsetY = -0.1F;
                this.bob(Mesturus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
