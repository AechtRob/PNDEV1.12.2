package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHaimirichia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHaimirichia extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r27;

    public ModelHaimirichia() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 25, 18, -2.5F, -0.525F, -5.0F, 5, 2, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 13, -2.5F, -0.525F, -6.0F, 5, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 46, 22, -0.5F, -0.5F, -7.95F, 1, 1, 2, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.6864F, 1.07F, -6.2695F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2932F, 0.1757F, 0.0084F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 49, -0.125F, -0.7F, -0.375F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.6864F, 1.07F, -6.2695F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2932F, -0.1757F, -0.0084F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 27, 49, 0.125F, -0.7F, -0.375F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.1806F, 0.5F, -7.5899F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.5047F, -0.323F, 0.0882F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 49, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.1806F, 0.5F, -7.5899F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.5047F, 0.323F, -0.0882F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 49, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.8189F, 0.5F, -6.4427F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4931F, 0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 43, 8, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.1806F, 0.0F, -7.5899F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 17, 30, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.5F, 0.0F, -7.0F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 5, -1.4F, -0.5F, -0.3F, 2, 1, 2, 0.003F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.25F, 0.05F, -5.65F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 49, -0.5F, -0.5F, -0.425F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.1806F, 0.0F, -7.5899F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 30, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.8189F, 0.5F, -6.4427F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4931F, -0.6109F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 43, 8, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 0.0F, -7.0F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 5, -0.6F, -0.5F, -0.3F, 2, 1, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, -7.925F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4887F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 46, 37, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.7819F, -6.2202F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1353F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 47, 34, -0.5F, 0.05F, -1.75F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -1.2F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 30, -1.5F, 0.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.25F, 0.05F, -5.65F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1745F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 49, -0.5F, -0.5F, -0.425F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.25F, -5.5F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3796F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 13, -2.5F, -0.5F, -0.475F, 5, 1, 2, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 18, -2.0F, -1.025F, -1.325F, 4, 3, 8, 0.006F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.3066F, -4.3749F);
        this.body.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.4756F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 19, -1.5F, -1.0F, -1.8F, 3, 1, 1, -0.003F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 46, 16, -1.5F, -1.0F, -1.0F, 3, 1, 1, -0.006F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 2.5811F, -1.3875F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0916F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 43, -1.5F, -2.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 2.773F, 2.6079F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.048F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 43, -0.5F, -1.0F, -4.0F, 3, 1, 4, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.0F, 2.2682F, 6.576F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.1265F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 37, -0.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, -1.025F, 2.7F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 43, 43, 2.0F, -3.0F, 0.0F, 0, 3, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.9788F, -4.9996F);
        this.body.addChild(jaw);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.9F, -0.89F, -0.5861F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.5018F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 49, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 49, 1.8F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.2819F, -1.2801F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2836F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 44, 26, -1.0F, -1.075F, -0.6F, 2, 1, 2, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.0F, 2.023F, -0.8921F);
        this.body.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.0465F, -0.2577F, 0.1806F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 27, 0, -1.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.0F, 2.023F, -0.8921F);
        this.body.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.0465F, 0.2577F, -0.1806F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 27, 0, -6.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 6.5F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 5, -1.5F, -0.1F, 0.0F, 3, 2, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.9F, 5.0F);
        this.tail.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 36, -0.5F, -1.0F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, -0.1862F, 3.9877F);
        this.tail.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.384F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 49, 1.5F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.5F, 0.0F);
        this.tail.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0785F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 36, -0.5F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 43, -1.0F, -0.1F, 0.0F, 2, 2, 4, -0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 30, 0.85F, 0.9F, 0.7F, 1, 0, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 30, -1.85F, 0.9F, 0.7F, 1, 0, 3, 0.0F, true));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.5F, 0.25F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, -0.7418F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 12, 49, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.5F, 0.25F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, 0.7418F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 12, 49, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.tail2.addChild(tail3);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.0F, 0.5F, 0.25F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 2.0F, -0.5F, -0.25F, 0, 4, 13, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 25, 26, 1.5F, -0.5F, -0.25F, 1, 1, 8, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.07F;
        this.main.offsetZ = -0.01F;
        this.main.offsetY = -0.245F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
            this.setRotateAngle(main, 0.0F, 0.0F, 0.1F);
            this.setRotateAngle(tail, 0.0F, 0.1F, 0.0F);
            this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
            this.setRotateAngle(tail3, 0.1F, -0.3F, 0.0F);
            this.main.offsetY = -0.14F;
            this.main.render(0.01F);
            resetToDefaultPose();
        }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.3F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(220);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                //this.bob(body, speed, 5F, false, f2, 1);
                this.chainWave(fishTail, speed*0.1F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed*0.1F, 0.1F, -3, f2, 1);
                return;
            }


            this.flap(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backLeftFin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| e.isInWater()) { //if moving, slap fins
                this.flap(frontLeftFin, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else{ //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(frontLeftFin, (speed), 0.25F, true, -3, 0, f2, 1);
                this.flap(frontRightFin, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.flap(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(backRightFin, (float) (speed), 0.2F, true, 0, 0, f2, 1);



        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHaimirichia e = (EntityPrehistoricFloraHaimirichia) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
