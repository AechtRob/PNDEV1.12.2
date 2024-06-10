package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDorypterus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Dorypterus;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer Headbase;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r18;

    public ModelDorypterus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Dorypterus = new AdvancedModelRenderer(this);
        this.Dorypterus.setRotationPoint(0.0F, 17.0F, -7.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, 3.0F, -5.0F);
        this.Dorypterus.addChild(Cephalon);


        this.Headbase = new AdvancedModelRenderer(this);
        this.Headbase.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.Cephalon.addChild(Headbase);
        this.Headbase.cubeList.add(new ModelBox(Headbase, 28, 0, -3.0F, -5.0F, -5.0F, 6, 10, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -6.0F, -4.0F);
        this.Headbase.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2793F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 53, 0.0F, 0.5F, -1.2F, 0, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.0F, -5.0F);
        this.Headbase.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 47, -2.0F, -0.1F, 0.0F, 4, 1, 5, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-3.0F, 5.0F, -4.0F);
        this.Headbase.addChild(VentralR);
        this.setRotateAngle(VentralR, 0.4363F, -0.2182F, 0.4363F);
        this.VentralR.cubeList.add(new ModelBox(VentralR, 59, 50, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(3.0F, 5.0F, -4.0F);
        this.Headbase.addChild(VentralL);
        this.setRotateAngle(VentralL, 0.4363F, 0.2182F, -0.4363F);
        this.VentralL.cubeList.add(new ModelBox(VentralL, 11, 24, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 0.0F, -3.0F);
        this.Headbase.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.3054F, -0.5236F, 0.0F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 51, 53, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 0.0F, -3.0F);
        this.Headbase.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.3054F, 0.48F, 0.0F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 40, 53, 0.0F, -2.0F, 0.0F, 0, 4, 5, 0.0F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Headbase.addChild(Snout);
        this.Snout.cubeList.add(new ModelBox(Snout, 31, 26, -2.5F, -3.0F, -5.0F, 5, 6, 6, 0.0F, false));
        this.Snout.cubeList.add(new ModelBox(Snout, 48, 26, -2.5F, 3.0F, -2.0F, 5, 2, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.Snout.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 0, -2.0F, -0.6F, -1.6F, 4, 2, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.Snout.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 16, -2.0F, -1.5F, -0.2F, 4, 4, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 3.0F, -5.3F);
        this.Snout.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6894F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 45, 43, -2.0F, -5.2269F, -3.5969F, 4, 5, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -5.5F);
        this.Snout.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.3054F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 55, 32, -1.5F, -0.4F, -3.5F, 3, 1, 4, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 0, -1.0F, -0.2F, -2.6F, 2, 1, 3, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -3.0F, 9.0F);
        this.Cephalon.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -5.8F, 0.0F, 6, 11, 7, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 47, 32, 0.0F, -6.7F, 0.8F, 0, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5672F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 19, 0.0F, -28.8F, 0.0F, 0, 28, 5, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 32, -2.5F, -5.6F, 0.0F, 5, 9, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3142F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 7, 0.0F, -0.1F, -0.1F, 0, 5, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 58, 0.0F, -0.8F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 30, 39, -2.0F, -2.1F, -0.8F, 4, 2, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 11, 46, -2.0F, -5.0F, 0.0F, 4, 7, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.576F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 58, 38, 0.0F, -0.5F, -0.3F, 0, 1, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2793F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 7, 0.0F, -0.3F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4712F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 54, -1.0F, -3.3F, -0.4F, 2, 3, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -6.0F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1571F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 6, 19, -1.0F, 0.5F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -2.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 56, 18, -1.0F, -2.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.637F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, -0.4F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.Body4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3142F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 46, 53, -0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6283F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 57, -0.5F, -2.0F, -0.3F, 1, 2, 4, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 59, 60, -0.5F, -1.6F, 0.0F, 1, 2, 3, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 18, 10, 0.0F, -6.6F, 1.0F, 0, 12, 9, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.Body5.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.576F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 46, 0, -0.5F, -1.0F, 0.0F, 1, 1, 2, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Dorypterus.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Dorypterus.offsetX = -0.1F;
        this.Dorypterus.offsetY = -0.15F;
        this.Dorypterus.rotateAngleY = (float) Math.toRadians(90);
        this.Dorypterus.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Dorypterus, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body2, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.1F, 0.0F);
        this.Dorypterus.offsetX = 0.015F;
        this.Dorypterus.offsetY = 0.4F;
        this.Dorypterus.render(0.01F);
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
        //this.Dorypterus.offsetY = 1.35F;

        AdvancedModelRenderer[] fishTail = {this.Body1, this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.6F;
        if (!e.isInWater()) {
            speed = 0.9F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.1F, -1.5, f2, 1);
            this.swing(Dorypterus, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.35), 0.5F, true, 0, 0, f2, 1);

            this.flap(VentralR, speed * 1.5F, 0.75F, false, 0F, -0.3F, f2, 1F);
            this.flap(VentralL, speed * 1.5F, -0.75F, false, 0F, 0.3F, f2, 1F);
            this.flap(PectoralR, speed * 1.5F, 0.25F, false, 0F, -0.1F, f2, 1F);
            this.flap(PectoralL, speed * 1.5F, -0.25F, false, 0F, 0.1F, f2, 1F);
            this.swing(PectoralR, speed * 1.5F, 0.65F, false, 0F, -0.2F, f2, 1F);
            this.swing(PectoralL, speed * 1.5F, -0.65F, false, 0F, 0.2F, f2, 1F);

            if (!e.isInWater()) {
                this.Dorypterus.rotateAngleZ = (float) Math.toRadians(90);
                this.Dorypterus.offsetY = 0.05F;
                this.bob(Dorypterus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
