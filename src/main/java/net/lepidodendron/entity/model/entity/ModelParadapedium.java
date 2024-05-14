package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelParadapedium extends AdvancedModelBase {
    private final AdvancedModelRenderer Paradapedium;
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
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer Body5;

    public ModelParadapedium() {
        this.textureWidth = 74;
        this.textureHeight = 74;

        this.Paradapedium = new AdvancedModelRenderer(this);
        this.Paradapedium.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 2.7F, -6.5F);
        this.Paradapedium.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 22, 41, -2.5F, -19.0F, -5.0F, 5, 8, 3, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 44, 56, -2.5F, -18.0F, -6.5F, 5, 6, 2, -0.1F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 53, -3.0F, -19.0F, -2.0F, 6, 8, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -18.1F, -7.1F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.0472F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 57, -1.5F, -0.1239F, -3.1781F, 3, 5, 3, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -10.6F, -5.7F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.8203F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 22, -2.0F, -4.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -13.9F, -7.8F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9861F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 10, -1.0F, -1.9964F, -0.0742F, 2, 2, 4, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -21.0F, -3.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.6109F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 12, -1.5F, 0.0F, -5.2F, 3, 3, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -13.6F, -6.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 41, -2.5F, -3.1007F, -0.9815F, 5, 2, 2, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 10, -2.5F, -2.6007F, -0.4815F, 5, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -14.3F, -6.5F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.5672F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5236F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 0, -1.5F, 0.0F, -2.4F, 3, 1, 3, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -15.0F, -1.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.5F, -6.0F, 0.0F, 7, 14, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 8.8F, -1.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.384F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 14, -2.0F, -5.2F, 0.0F, 4, 5, 8, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -8.5F, 2.3F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 47, -2.0F, -0.0672F, 0.0268F, 4, 3, 5, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 48, 47, -2.0F, -0.0672F, -0.3732F, 4, 3, 5, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.3F, -1.7F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5585F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 33, -2.0F, 0.0275F, 0.2909F, 4, 3, 4, -0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 33, -2.0F, 0.0275F, -0.0091F, 4, 3, 4, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.5F, 3.0F, 0.3F);
        this.Body1.addChild(PectoralL);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6109F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.5F, 3.0F, 0.3F);
        this.Body1.addChild(PectoralR);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -1.5F, 0.0F, 0, 3, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 22, -2.5F, -6.0F, -1.0F, 5, 14, 7, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -8.8F, 0.3F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6283F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 47, 0.0F, -4.0F, 0.0F, 0, 4, 6, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -8.8F, 0.3F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4538F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 29, 0, -1.5F, 0.0F, 0.0F, 3, 4, 7, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 11.4F, -0.5F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3665F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 28, -1.5F, -4.9F, 0.0F, 3, 5, 7, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.5F, 11.1F, 0.1F);
        this.Body2.addChild(PelvicL);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.7543F, 0.0854F, -0.0967F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 22, 0.0F, -0.6F, 0.0F, 0, 1, 2, 0.0F, false));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-1.5F, 11.1F, 0.1F);
        this.Body2.addChild(PelvicR);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PelvicR.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7543F, -0.0854F, 0.0967F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 22, 0.0F, -0.6F, 0.0F, 0, 1, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -1.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 44, -1.5F, -3.0F, -1.0F, 3, 8, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5236F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 0, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.1345F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 62, 0.0F, 0.2F, 2.0F, 0, 3, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.Body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.0036F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 0, -1.0F, -3.0F, 0.0F, 2, 3, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -7.8F, -5.7F);
        this.Body3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6283F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 56, 0.0F, -4.0F, 6.0F, 0, 4, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 30, 58, -1.0F, -2.0F, -1.0F, 2, 3, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3054F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 18, 63, -0.5F, -0.1F, 0.0F, 1, 3, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -7.8F, -8.7F);
        this.Body4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.6283F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 15, 44, 0.0F, -4.0F, 10.0F, 0, 4, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.9599F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 17, -0.5F, -3.0F, 0.0F, 1, 3, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 10.0F, -3.0F);
        this.Body4.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.1345F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 29, 0.0F, 0.2F, 6.0F, 0, 3, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 63, 14, -0.5F, -1.0F, -1.0F, 1, 3, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 40, 35, 0.0F, -5.0F, 1.0F, 0, 10, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Paradapedium.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Paradapedium.rotateAngleY = (float) Math.toRadians(90);
        this.Paradapedium.offsetX = -0.05F;
        this.Paradapedium.offsetY = -0.23F;
        this.Paradapedium.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Paradapedium, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1F, 0.0F);
        this.Paradapedium.offsetZ = 0.0F;
        this.Paradapedium.offsetY = -0.05F;
        this.Paradapedium.offsetX = 0.0F;
        this.Paradapedium.render(0.01F);
        this.resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Paradapedium.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(Paradapedium, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(PelvicR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(PelvicR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.Paradapedium.rotateAngleZ = (float) Math.toRadians(90);
                this.Paradapedium.offsetX = -0.5F;
                this.bob(Paradapedium, -speed, 5F, false, f2, 1);
            }
        }
    }
}
