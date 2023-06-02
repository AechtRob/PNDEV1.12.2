package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGuiyu extends AdvancedModelBase {
    private final AdvancedModelRenderer Guiyu;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r17;

    public ModelGuiyu() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Guiyu = new AdvancedModelRenderer(this);
        this.Guiyu.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -5.6F, -3.3F);
        this.Guiyu.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 41, 51, -2.0F, -1.6F, -7.2F, 4, 2, 4, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 17, 32, -2.5F, -3.0F, -4.0F, 5, 6, 4, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3665F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 43, -2.0F, -1.9563F, -0.4924F, 4, 2, 5, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.8F, -7.2F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5411F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, -1.3F, -0.0139F, -2.1768F, 0, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 38, 1.3F, -0.0139F, -2.1768F, 0, 2, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 12, -1.5F, -0.0139F, -1.9768F, 3, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.1F, -1.7F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0698F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -1.5F, -0.0458F, 0.0617F, 3, 2, 2, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.9F, -7.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4014F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 38, -1.5F, 0.0F, -0.2F, 3, 2, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.5F, -7.5F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5323F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 20, -2.0F, -0.2795F, -0.6268F, 4, 1, 1, 0.04F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -7.9F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.7F, -1.8F, 0.0F, 0, 2, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 1.7F, -1.8F, 0.0F, 0, 2, 3, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 52, -2.0F, -2.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.8F, -4.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 46, 33, -2.0F, -0.2F, -3.9F, 4, 1, 5, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 55, 20, 1.7F, -0.4F, -3.9F, 0, 1, 5, -0.001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 55, 20, -1.7F, -0.4F, -3.9F, 0, 1, 5, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3142F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.8F, -1.5F, -1.0F, 0, 1, 1, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.8F, -1.5F, -1.0F, 0, 1, 1, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 21, -1.0F, -1.0F, -1.0F, 2, 1, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.8F, -3.9F);
        this.Jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 40, -1.5F, -1.0F, 0.0F, 3, 1, 5, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -4.3F, 0.0F, 6, 9, 7, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.3F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.4712F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 40, 0.0F, 0.7F, 1.4F, 0, 3, 7, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 3.5F, 1.3F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.5067F, -1.0663F, 1.0057F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 53, 16, -0.1402F, -0.0376F, -1.3987F, 6, 0, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 3.5F, 1.3F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.5067F, 1.0663F, -1.0057F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 53, 16, -5.8598F, -0.0376F, -1.3987F, 6, 0, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 17, 17, -2.5F, -4.0F, -1.0F, 5, 8, 6, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.3F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 47, -1.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.Body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1396F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 0, -1.5F, -1.0F, -0.1F, 3, 1, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 27, 0, -2.0F, -2.2F, -1.0F, 4, 5, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 53, 53, -1.0F, -2.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 25, 0.0F, -5.0F, -0.1F, 0, 5, 7, -0.002F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 38, -1.5F, 0.0F, -0.1F, 3, 2, 6, -0.002F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.0F, 3.0F, 0.6F);
        this.Body3.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.2637F, -0.8552F, 0.8727F);
        this.AnalL.cubeList.add(new ModelBox(AnalL, 9, 17, 0.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-1.0F, 3.0F, 0.6F);
        this.Body3.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.2637F, 0.8552F, -0.8727F);
        this.AnalR.cubeList.add(new ModelBox(AnalR, 9, 17, -4.0F, 0.0F, -1.0F, 4, 0, 2, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 12, -1.5F, -1.2F, -1.0F, 3, 3, 6, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 3.1F, 0.9F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.7505F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 54, 0.0F, -0.4123F, -0.5197F, 0, 4, 5, -0.002F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.3F, -0.1F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2094F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 22, -1.0F, -2.0F, 0.0F, 2, 2, 6, -0.002F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.6F, 0.0F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 47, -1.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.3F, 5.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 47, 7, -1.0F, -1.5F, -1.0F, 2, 3, 5, 0.002F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 17, 0.0F, -6.3F, 2.0F, 0, 12, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.9F, -0.1F);
        this.Body5.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 17, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Guiyu.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Guiyu.rotateAngleY = (float) Math.toRadians(90);
        this.Guiyu.offsetY = -0.13F;
        this.Guiyu.offsetX = -0.06F;
        this.Guiyu.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Jaw, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, -0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1F, 0.0F);
        this.Guiyu.offsetY = -0.13F;
        this.Guiyu.offsetZ = -0.0F;
        this.Guiyu.offsetX = -0.0F;
        this.Guiyu.render(0.01F);
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
        this.Guiyu.offsetY = 0F;

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
            this.walk(AnalL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(AnalR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(AnalR, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);


            this.swing(Guiyu, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Guiyu.rotateAngleZ = (float) Math.toRadians(90);
                this.Guiyu.offsetY = -0.15F;
                this.bob(Guiyu, -speed, 5F, false, f2, 1);
            }
        }
    }
}
