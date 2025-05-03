package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRhadinacanthus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Rhadinacanthus;
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
    private final AdvancedModelRenderer VentralL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer VentralR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Anal2L;
    private final AdvancedModelRenderer Anal2R;
    private final AdvancedModelRenderer Anal1L;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Anal1R;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r21;

    public ModelRhadinacanthus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Rhadinacanthus = new AdvancedModelRenderer(this);
        this.Rhadinacanthus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -4.0F, -3.0F);
        this.Rhadinacanthus.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 46, 31, -2.0F, -1.0F, -4.4F, 4, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 10, 51, -1.5F, 0.0F, -5.2F, 3, 1, 1, -0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 15, -2.5F, -2.0F, -3.0F, 5, 4, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -5.8F, -3.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2356F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 19, -2.0F, 4.8591F, -2.335F, 4, 1, 1, 0.04F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.4014F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 9, -2.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.4F, -3.1F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2967F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 20, -2.0F, -3.0123F, -0.3069F, 4, 3, 6, -0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0123F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 35, 49, -1.5F, -0.0312F, -1.0913F, 3, 1, 1, -0.002F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 36, -1.5F, -0.0312F, -0.9913F, 3, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -0.9F, -4.6F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.576F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 0, -1.5F, -0.0312F, 0.0087F, 3, 2, 2, 0.001F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 49, -2.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 49, 12, -1.5F, 0.0F, -2.0F, 3, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 30, -1.5F, -1.0F, 0.0F, 3, 1, 2, -0.002F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -3.0F, -3.9F, -1.0F, 6, 8, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.3F, 0.5F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.5061F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, 0.0F, -6.7F, 0.0F, 0, 7, 5, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -4.6F, 2.4F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1745F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 41, 24, -2.0F, -0.011F, -0.046F, 4, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -4.3F, -0.5F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1047F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 44, 0, -2.0F, 0.0F, 0.0F, 4, 2, 3, -0.001F, false));

        this.VentralL = new AdvancedModelRenderer(this);
        this.VentralL.setRotationPoint(1.5F, 4.1F, 0.3F);
        this.Body1.addChild(VentralL);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -1.2608F, 1.4593F);
        this.VentralL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 49, 0.0F, 0.0F, -0.1F, 0, 2, 3, 0.0F, false));

        this.VentralR = new AdvancedModelRenderer(this);
        this.VentralR.setRotationPoint(-1.5F, 4.1F, 0.3F);
        this.Body1.addChild(VentralR);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.2608F, 1.4593F);
        this.VentralR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.8727F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 49, 0.0F, 0.0F, -0.1F, 0, 2, 3, 0.0F, true));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 3.3F, 1.0F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.0F, 0.0F, 0.4363F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 32, 19, 0.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 3.3F, 1.0F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.0F, 0.0F, -0.4363F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 32, 19, -5.0F, 0.0F, -1.0F, 5, 0, 4, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 26, -2.5F, -3.0F, 0.0F, 5, 5, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 0, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -4.1F, 0.0F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 8, -1.5F, 0.0F, 0.1F, 3, 2, 4, 0.0F, false));

        this.Anal2L = new AdvancedModelRenderer(this);
        this.Anal2L.setRotationPoint(2.0F, 1.9F, 3.0F);
        this.Body2.addChild(Anal2L);
        this.setRotateAngle(Anal2L, 0.0F, 0.0F, 0.7418F);
        this.Anal2L.cubeList.add(new ModelBox(Anal2L, 40, 15, 0.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, false));

        this.Anal2R = new AdvancedModelRenderer(this);
        this.Anal2R.setRotationPoint(-2.0F, 1.9F, 3.0F);
        this.Body2.addChild(Anal2R);
        this.setRotateAngle(Anal2R, 0.0F, 0.0F, -0.7418F);
        this.Anal2R.cubeList.add(new ModelBox(Anal2R, 40, 15, -4.0F, 0.0F, -1.0F, 4, 0, 3, 0.0F, true));

        this.Anal1L = new AdvancedModelRenderer(this);
        this.Anal1L.setRotationPoint(2.0F, 3.0F, 0.8F);
        this.Body2.addChild(Anal1L);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.Anal1L.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.6109F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 33, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.Anal1R = new AdvancedModelRenderer(this);
        this.Anal1R.setRotationPoint(-2.0F, 3.0F, 0.8F);
        this.Body2.addChild(Anal1R);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.Anal1R.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.6109F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 33, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, -0.6F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 34, 41, -1.5F, -2.1F, 0.0F, 3, 4, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.6F, 1.7F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.5411F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 44, -0.001F, 0.0F, -0.7F, 0, 5, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5934F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 26, 30, 0.0F, -7.2F, 0.0F, 0, 8, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.5236F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 45, -1.0F, -1.5F, 0.5F, 2, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.8F, 0.0F);
        this.Body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2094F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 46, -1.0F, 0.0F, -0.1F, 2, 2, 3, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 37, 33, -1.0F, -2.0F, 0.0F, 2, 3, 4, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 47, 38, 0.0F, -0.3F, 1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2269F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 6, -1.0F, -1.0F, 0.0F, 2, 1, 4, -0.002F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 13, 30, 0.0F, -3.3F, 0.0F, 0, 8, 6, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3491F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 24, -0.5F, -1.0F, -0.4F, 1, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Rhadinacanthus.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Rhadinacanthus.rotateAngleY = (float) Math.toRadians(90);
        this.Rhadinacanthus.offsetX = -0.09F;
        this.Rhadinacanthus.offsetY = -0.21F;
        this.Rhadinacanthus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(PectoralR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Anal2L, 0.0F, 0.0F, 0.7418F);
        this.setRotateAngle(Anal2R, 0.0F, 0.0F, -0.7418F);
        this.setRotateAngle(Body3, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3054F, 0.0F);
        this.Rhadinacanthus.rotateAngleY = (float) Math.toRadians(90);
        this.Rhadinacanthus.offsetX = -0.02F;
        this.Rhadinacanthus.offsetY = -0.4F;
        this.Rhadinacanthus.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Rhadinacanthus.offsetY = -1.0F;
        this.Rhadinacanthus.offsetX = 0.4F;
        this.Rhadinacanthus.offsetZ = 2.0F;
        this.Rhadinacanthus.rotateAngleY = (float)Math.toRadians(120);
        this.Rhadinacanthus.rotateAngleX = (float)Math.toRadians(0);
        this.Rhadinacanthus.rotateAngleZ = (float)Math.toRadians(0);
        this.Rhadinacanthus.scaleChildren = true;
        float scaler = 3.0F;
        this.Rhadinacanthus.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Rhadinacanthus, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Jaw, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.2182F, 0.0F);
        this.setRotateAngle(PectoralL, 0.0F, 0.0F, 0.4363F);
        this.setRotateAngle(PectoralR, 0.0F, 0.0F, -0.4363F);
        this.setRotateAngle(Body2, 0.0F, 0.0873F, 0.0F);
        this.setRotateAngle(Anal2L, 0.0F, 0.0F, 0.7418F);
        this.setRotateAngle(Anal2R, 0.0F, 0.0F, -0.7418F);
        this.setRotateAngle(Body3, 0.0F, -0.2618F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3054F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3054F, 0.0F);
        //End of pose, now render the model:
        this.Rhadinacanthus.render(f);
        //Reset rotations, positions and sizing:
        this.Rhadinacanthus.setScale(1.0F, 1.0F, 1.0F);
        this.Rhadinacanthus.scaleChildren = false;
        resetToDefaultPose();

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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.42F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.25F, -2, f2, 1);
            this.swing(Rhadinacanthus, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);
            this.swing(Anal1L, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(Anal1R, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);

            this.walk(Anal2L, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(Anal2L, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.walk(Anal2R, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);
            this.swing(Anal2R, (float) (speed * 0.75), 0.25F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.Rhadinacanthus.rotateAngleZ = (float) Math.toRadians(90);
                this.bob(Rhadinacanthus, -speed, 5F, false, f2, 1);
            }
        }
    }
}
