package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHelodus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;

    private ModelAnimator animator;

    public ModelHelodus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -9.4685F, -2.1036F, 4, 5, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, -4.4685F, -2.1036F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0524F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -0.5F, -2.0F, 0.0F, 3, 2, 7, 0.006F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -7.4657F, -7.7191F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9163F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 9, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -4.4918F, -1.3692F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 45, -1.0F, -1.95F, -4.4F, 2, 2, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 23, -1.5F, -1.95F, -2.4F, 3, 2, 2, -0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -6.6224F, -7.1818F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 39, 0.5F, -1.625F, 1.65F, 2, 2, 4, -0.003F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 9, 0.5F, -1.0F, 0.0F, 2, 1, 2, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -6.4474F, -7.0318F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 51, -0.5F, -1.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -8.003F, -6.8757F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 50, -0.5F, 0.0F, -1.0F, 2, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.775F, -7.9503F, -4.9914F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3414F, -0.0741F, 0.2054F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 49, -0.625F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 15, -0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.775F, -7.9503F, -4.9914F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3414F, 0.0741F, -0.2054F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 15, -0.35F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 49, -0.375F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -9.0356F, -4.0562F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 44, -0.5F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.5F, -9.6496F, 3.7957F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4058F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 46, 1.5F, -1.7F, 0.775F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 9, 1.0F, -1.9F, -0.225F, 1, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -9.8211F, 0.8756F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0567F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 33, -0.5F, 0.0F, 0.025F, 3, 1, 4, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -9.4685F, -2.1036F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1178F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 0, -0.5F, 0.0F, 0.025F, 3, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.0F, -9.4685F, -2.1036F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 39, -2.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.5792F, -5.7046F);
        this.main.addChild(jaw);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, 1.4211F, -0.8302F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1527F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 45, -0.5F, -1.0F, 0.0F, 2, 1, 1, -0.01F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.0431F, -1.4772F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 51, -0.5F, 0.0F, 0.25F, 2, 1, 1, -0.006F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 51, 12, 0.0F, 0.0F, -0.75F, 1, 1, 1, -0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.1932F, -1.3772F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1091F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 51, 18, -0.5F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -0.0431F, -1.4772F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 5, -0.5F, 0.0F, 0.0F, 2, 1, 2, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.6F, -5.4685F, -0.6036F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.6291F, 0.5553F, -0.3663F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 17, 25, 0.25F, -4.0F, 0.0F, 0, 5, 6, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.6F, -5.4685F, -0.6036F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.6291F, -0.5553F, 0.3663F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 17, 25, -0.25F, -4.0F, 0.0F, 0, 5, 6, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -7.3592F, 3.9359F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 23, -1.5F, -1.4093F, -0.0396F, 3, 3, 5, 0.003F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -2.2093F, -0.0396F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1004F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 32, -0.5F, -0.05F, 0.1F, 2, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.0F, 3.2596F, 0.94F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 0, -0.5F, -3.125F, -0.675F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.0063F, -0.4907F, 3.9246F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 30, 25, -0.9938F, -0.4185F, 0.0358F, 2, 2, 5, 0.003F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4938F, -1.3575F, 0.1202F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1353F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 45, 28, 0.475F, -1.0F, 1.0F, 0, 1, 4, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 16, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.4938F, 3.0619F, 1.287F);
        this.tail2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.3796F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 28, 39, -0.5F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.7562F, 2.0619F, 2.537F);
        this.tail2.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.4181F, 0.5692F, -0.2351F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 38, 50, -0.5F, -0.5F, -0.25F, 1, 1, 2, 0.0F, false));
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 24, 46, 0.25F, -1.3F, 0.25F, 0, 2, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.7438F, 2.0619F, 2.537F);
        this.tail2.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.4181F, -0.5692F, 0.2351F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 38, 50, -0.5F, -0.5F, -0.25F, 1, 1, 2, 0.0F, true));
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 24, 46, -0.25F, -1.3F, 0.25F, 0, 2, 3, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0063F, 0.1705F, 4.4817F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 49, 5, -0.5F, -0.239F, 0.054F, 1, 1, 2, 0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.839F, 1.054F);
        this.tail3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1745F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 31, 46, 0.5F, -0.6F, -1.0F, 0, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.839F, 1.054F);
        this.tail3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1309F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 38, 9, -0.5F, 0.1F, -1.0F, 1, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.711F, 5.0541F);
        this.tail3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1396F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 15, 37, -0.5F, -0.925F, -5.0F, 1, 1, 5, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0364F, 4.7655F);
        this.tail3.addChild(tail4);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.5506F, 2.0403F);
        this.tail4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.3054F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 45, 34, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, 0.3159F, -0.0078F);
        this.tail4.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.2574F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 21, 13, 0.5F, -0.575F, 0.0F, 0, 3, 8, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.3159F, -0.0078F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 49, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.006F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.035F;
        this.main.offsetY = -0.23F;
        this.main.offsetZ = -0.77F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.05F;
        this.main.offsetX = 0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.8F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 2.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(tail, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
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
        //this.main.offsetY = 1.4F;
        //this.main.offsetZ = -0.65F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.walk(jaw, (float) (speed * 0.35), 0.2F, false, 0.5f, 0.2f, f2, 1);

            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(frontLeftFin, (float) (speed ), 0.2F, true, 0, 0, f2, 0.5F);
            this.swing(frontLeftFin, (float) (speed), 0.5F, true, 0, 0, f2, 0.5F);
            this.flap(frontRightFin, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.swing(frontRightFin, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(backRightFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);

                //this.main.offsetY = 1.25F;
                //this.main.offsetZ = -0.2F;
                this.bob(main, -speed, 2F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
       // animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}