package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMacromesodon extends AdvancedModelBase {
    private final AdvancedModelRenderer Macromesodon;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer UpperJawJoint;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r16;

    public ModelMacromesodon() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Macromesodon = new AdvancedModelRenderer(this);
        this.Macromesodon.setRotationPoint(0.0F, 13.0F, 3.3F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.Macromesodon.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 81, 45, -3.0F, -2.96F, -8.1F, 5, 7, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 62, 53, -3.5F, -3.3F, -6.0F, 6, 9, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 6.5F, -7.3F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6458F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 0, -2.5F, -5.0F, -0.4F, 4, 4, 9, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.75F, -3.54F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.4712F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 65, -2.5F, -8.1324F, -0.2047F, 4, 10, 6, -0.002F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.75F, -8.24F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.733F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 71, 12, -2.5F, -6.9931F, -0.0576F, 4, 7, 6, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 4.6F, -10.2F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2531F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 7, -2.5F, -0.3497F, 3.2997F, 4, 2, 2, -0.002F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 81, -2.5F, -1.3497F, -0.7003F, 4, 2, 6, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.5F, -10.99F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4102F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 14, -2.5F, -6.8853F, -0.0362F, 4, 7, 3, -0.002F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -0.37F, -10.06F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 0, -3.0F, -2.3224F, 1.9959F, 5, 1, 1, 0.04F, false));

        this.UpperJawJoint = new AdvancedModelRenderer(this);
        this.UpperJawJoint.setRotationPoint(0.0F, 5.07F, -9.53F);
        this.Head.addChild(UpperJawJoint);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.UpperJawJoint.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2654F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, 1.6F, 0.097F, 0.003F, 0, 3, 2, 0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 0, -2.6F, 0.097F, 0.003F, 0, 3, 2, 0.01F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 4.41F, -6.79F);
        this.Head.addChild(Jaw);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0011F, 0.0345F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2443F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 65, -2.5F, -0.0017F, -3.8918F, 4, 1, 4, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Macromesodon.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 24, 25, -4.5F, -16.0F, 0.0F, 8, 26, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 77, -3.5F, -3.0F, 0.0F, 6, 3, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.5F, 4.0F, 0.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.6109F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 78, 74, 0.0F, -4.0F, 0.0F, 0, 7, 7, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-4.5F, 4.0F, 0.0F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, -0.6109F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 78, 74, 0.0F, -4.0F, 0.0F, 0, 7, 7, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 46, 0, -4.0F, -14.0F, 0.0F, 7, 23, 5, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 73, 36, -3.5F, 8.3F, -0.3F, 6, 3, 5, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 26, -3.0F, 0.1F, -0.2F, 5, 3, 6, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.8F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 52, 29, -3.5F, -11.0F, 0.0F, 6, 19, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 11.3F, -0.3F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6458F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 71, 0, -3.0F, -5.0F, 0.0F, 5, 5, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5236F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 82, -2.5F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 71, -3.0F, -5.0F, 0.0F, 5, 8, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.9687F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 45, -0.5F, -1.9F, -4.0F, 0, 13, 12, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 62, 69, -2.5F, -3.9F, 0.0F, 4, 4, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -11.6F, 0.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -1.0472F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.4F, -13.1F, -1.8F, 0, 15, 14, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -11.6F, 0.0F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -1.0821F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 30, -2.0F, -0.3F, 0.2F, 3, 4, 8, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.5F, 3.8F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -2.0F, -2.0F, 0.0F, 3, 4, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.Body5.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0349F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 47, -0.51F, -8.1F, 0.6F, 0, 19, 10, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Macromesodon.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Macromesodon.rotateAngleY = (float) Math.toRadians(90);
        this.Macromesodon.rotateAngleX = (float) Math.toRadians(0);
        //this.body.offsetX = -0.09F;
        this.Macromesodon.offsetY = -0.12F;
        this.Macromesodon.offsetX = -0.08F;
        this.Macromesodon.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.Macromesodon.rotateAngleY = (float) Math.toRadians(90);
        this.Macromesodon.rotateAngleX = (float) Math.toRadians(0);
        this.setRotateAngle(cube_r1, -0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r3, -0.733F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.2531F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.4102F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r6, -0.1833F, 0.0F, 0.0F);
        this.setRotateAngle(UpperJawJoint, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, 1.2654F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.6109F, 0.0F);
        this.setRotateAngle(PectoralR, 0.0F, -0.6109F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(cube_r10, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(cube_r11, 0.6458F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r13, 0.9687F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, -1.0472F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, -1.0821F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(cube_r16, -0.0349F, 0.0F, 0.0F);
        //this.body.offsetX = -0.09F;
        this.Macromesodon.offsetY = -0.19F;
        this.Macromesodon.offsetZ = -0.06F;
        this.Macromesodon.offsetX = -0.08F;
        this.Macromesodon.render(0.01F);
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
        this.Macromesodon.offsetY = 0;
        this.Macromesodon.offsetZ = -0.65F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.3F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Macromesodon, speed, 0.3F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Macromesodon.rotateAngleZ = (float) Math.toRadians(90);
                this.Macromesodon.offsetY = 0.65F;
                 this.Macromesodon.offsetZ = -0.65F;
                this.bob(Macromesodon, -speed, 5F, false, f2, 1);
            }
        }
    }
}
