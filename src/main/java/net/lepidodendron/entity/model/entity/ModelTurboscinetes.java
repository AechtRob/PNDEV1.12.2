package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelTurboscinetes extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Turboscinetes;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;

    public ModelTurboscinetes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Turboscinetes = new AdvancedModelRenderer(this);
        this.Turboscinetes.setRotationPoint(0.0F, 24.0F, -1.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -8.0F, -3.0F);
        this.Turboscinetes.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 26, -1.5F, -4.0F, -3.0F, 3, 8, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 6.0F, -0.1F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.8552F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 30, -1.0F, -2.9592F, -3.0207F, 2, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.3F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.0734F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 4, -1.0F, 0.469F, 0.9969F, 2, 1, 1, -0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 30, -1.0F, -0.031F, -0.0031F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 21, -1.0F, -1.3F, -1.7F, 2, 1, 3, 0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.4F, -4.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 47, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.011F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.9425F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 50, -1.0F, -3.0F, 0.0F, 2, 3, 2, -0.01F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 45, -1.0F, -3.6F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 37, -1.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.1F, -2.2F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1833F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 44, -2.0F, -2.0578F, -1.5516F, 3, 2, 2, 0.03F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 0, -2.0F, -1.5578F, -1.0516F, 3, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.7F, -3.0F);
        this.Head.addChild(Jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 0, -1.0F, 0.0F, -1.8F, 2, 1, 2, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 11, 14, -2.0F, -6.0F, -1.0F, 4, 11, 4, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 6.0F, -1.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 23, -1.0F, -2.0F, -0.1F, 2, 2, 4, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -6.3F, -0.8F);
        this.Body1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 39, -1.0F, 0.1F, -0.3F, 2, 2, 4, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 3.5F, -0.3F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.6545F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 28, 16, 0.0F, -1.1F, -0.1F, 0, 2, 2, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 3.5F, -0.3F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.6545F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 28, 16, 0.0F, -1.1F, -0.1F, 0, 2, 2, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 24, 0, -1.5F, -6.0F, -1.0F, 3, 11, 4, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 10, 44, -1.0F, 4.5F, -0.2F, 2, 2, 3, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 44, 9, -1.0F, -7.2F, -0.2F, 2, 2, 3, 0.01F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(1.0F, 5.9F, 1.4F);
        this.Body2.addChild(VentralL);
        this.setRotateAngle(VentralL, -0.5993F, 0.5459F, -0.3509F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 18, 34, 0.0F, -1.4F, 0.0F, 0, 2, 2, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-1.0F, 5.9F, 1.4F);
        this.Body2.addChild(VentralR);
        this.setRotateAngle(VentralR, -0.5993F, -0.5459F, 0.3509F);
        this.VentralR.cubeList.add(new ModelBox(VentralR, 18, 34, 0.0F, -1.4F, 0.0F, 0, 2, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 25, 27, -1.5F, -5.0F, -0.3F, 3, 9, 3, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 6.5F, -0.2F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2443F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 40, -1.0F, -3.0F, 0.0F, 2, 3, 3, -0.01F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 40, -1.0F, -3.0F, 0.5F, 2, 3, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -7.3F, -0.1F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.7156F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, 0.0F, -6.8F, 0.0F, 0, 7, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -7.3F, -0.1F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4887F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 36, -1.0F, 0.1F, -0.1F, 2, 3, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.7F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 35, 12, -1.0F, -2.0F, -1.0F, 2, 4, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -5.5F, -13.9F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.9076F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 16, -0.5F, 17.9F, -0.3F, 0, 5, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 5.7F, 0.6F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9774F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 35, -1.0F, -3.1216F, -0.0014F, 1, 3, 4, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 35, -1.0F, -3.1216F, 0.7986F, 1, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -5.5F, 0.5F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.9076F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 18, -1.0F, 0.0F, 0.1F, 1, 3, 4, -0.01F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 18, -1.0F, 0.0F, 0.7F, 1, 3, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -7.3F, -2.8F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7156F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 0, 0.0F, -4.0F, 3.8F, 0, 4, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 46, -0.5F, -1.0F, -1.0F, 1, 2, 3, 0.02F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, 0.001F, -5.0F, 0.7F, 0, 10, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, -5.5F, -16.9F);
        this.Body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.9076F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 15, -1.0F, 14.9F, 4.9F, 1, 3, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 15, -1.0F, 14.9F, 4.5F, 1, 3, 1, 0.01F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 48, 3, -0.5F, 17.9F, 4.7F, 0, 2, 2, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -7.3F, -5.8F);
        this.Body5.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.7156F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 30, 0.0F, -2.0F, 7.8F, 0, 3, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -5.5F, -2.5F);
        this.Body5.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.9076F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -1.0F, 0.0F, 4.3F, 1, 3, 2, 0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Turboscinetes.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Turboscinetes.rotateAngleY = (float) Math.toRadians(90);
        this.Turboscinetes.offsetY = -0.14F;
        this.Turboscinetes.offsetX = -0.06F;
        this.Turboscinetes.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Turboscinetes, -0.2F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.8552F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 1.0734F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.9425F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0436F, 0.0F);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, 0.2793F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.6545F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.6545F, 0.0F);
        this.setRotateAngle(VentralL, -0.5993F, 0.5459F, -0.3509F);
        this.setRotateAngle(VentralR, -0.5993F, -0.5459F, 0.3509F);
        this.setRotateAngle(Body3, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(cube_r11, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, -0.4887F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(cube_r14, 0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.9774F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r16, -0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, -0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r18, 0.9076F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.9076F, 0.0F, 0.0F);
        this.Turboscinetes.offsetY = -0.5F;
        this.Turboscinetes.offsetZ = 0.01F;
        this.Turboscinetes.offsetX = -0.02F;
        this.Turboscinetes.render(0.01F);
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
        this.Turboscinetes.offsetY = -0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.15F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);

            this.walk(VentralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(VentralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(VentralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(VentralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Turboscinetes, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Turboscinetes.rotateAngleZ = (float) Math.toRadians(90);
                //this.Turboscinetes.offsetY = 0.58F;
                this.bob(Turboscinetes, -speed, 0.9F, false, f2, 1);
            }
        }
    }
}
