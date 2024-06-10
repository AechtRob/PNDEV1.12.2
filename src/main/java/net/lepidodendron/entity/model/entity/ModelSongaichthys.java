package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSongaichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Songaichthys;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer PectoralL2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PelvicL2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body5;

    public ModelSongaichthys() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Songaichthys = new AdvancedModelRenderer(this);
        this.Songaichthys.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -3.8F, 0.6F);
        this.Songaichthys.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 30, -2.0F, -2.0F, -6.0F, 4, 5, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 21, -2.5F, -2.0F, -3.0F, 5, 5, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 15, -1.5F, 2.7166F, -5.4109F, 3, 1, 6, 0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 2.0F, -6.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -1.0F, 0.0F, 0.5F, 2, 1, 1, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.2F, -7.8F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.8029F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 28, -1.0F, 0.0013F, -1.0302F, 2, 3, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4189F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 35, 36, -1.5F, 0.0F, -2.0F, 3, 5, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.9F, -6.5F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3229F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 18, -2.0F, 1.3993F, 0.4185F, 4, 2, 2, 0.03F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 0, -2.0F, 1.8993F, 0.9185F, 4, 1, 1, 0.04F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.5F, 2.3F, -1.5F);
        this.Head.addChild(PectoralL);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.5672F, 1.0036F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 29, 0.0F, -1.0F, -1.0F, 0, 2, 6, 0.0F, false));

        this.PectoralL2 = new AdvancedModelRenderer(this);
        this.PectoralL2.setRotationPoint(-2.5F, 2.3F, -1.5F);
        this.Head.addChild(PectoralL2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.5672F, -1.0036F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 29, 0.0F, -1.0F, -1.0F, 0, 2, 6, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -5.875F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.6545F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 29, -1.0F, 0.0F, -3.5F, 2, 1, 4, -0.001F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -2.0F, -1.0F, 6, 5, 5, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 23, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 11, -2.5F, -2.0F, -1.0F, 5, 4, 5, 0.002F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 0, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.5F, 2.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 38, 0.0F, -1.025F, -1.275F, 0, 3, 4, 0.0F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(2.0F, 2.5F, 0.4F);
        this.Body2.addChild(PelvicL);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.PelvicL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 1.0908F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 18, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.PelvicL2 = new AdvancedModelRenderer(this);
        this.PelvicL2.setRotationPoint(-2.0F, 2.5F, 0.4F);
        this.Body2.addChild(PelvicL2);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.PelvicL2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -1.0908F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 18, -1.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 19, 7, -2.0F, -2.0F, -1.0F, 4, 3, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 11, 39, 0.0F, 0.0F, 0.0F, 0, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 6, -1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 32, 11, -1.5F, -1.0F, -1.0F, 3, 2, 4, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body4.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 39, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 15, 34, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 17, 23, 0.0F, -2.0F, 1.0F, 0, 4, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Songaichthys.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Songaichthys.rotateAngleY = (float) Math.toRadians(90);
        this.Songaichthys.offsetY = -0.25F;
        this.Songaichthys.offsetX = -0.06F;
        this.Songaichthys.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Songaichthys, -0.2F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.0F);
        this.Songaichthys.offsetY = -0.13F;
        this.Songaichthys.render(0.01F);
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
        //this.Congophiopsis.offsetY = 0F;

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
            this.walk(PectoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(PelvicL2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(PelvicL2, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);


            this.swing(Songaichthys, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Songaichthys.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 0.58F;
                this.bob(Songaichthys, -speed, 5F, false, f2, 1);
            }
        }
    }
}
