package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraConcavotectum;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConcavotectum extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r29;

    private ModelAnimator animator;

    public ModelConcavotectum() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -14.0F, -13.0F, 5, 11, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 65, -2.5F, -12.5F, -17.0F, 5, 9, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 0, 0.025F, -21.875F, -13.5F, 0, 7, 11, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 51, 19, 0.025F, -7.4641F, -22.0198F, 1, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 51, 19, -1.025F, -7.4641F, -22.0198F, 1, 1, 1, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -15.8172F, -8.4237F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 58, 23, -1.5F, 0.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -7.0671F, -22.9265F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 83, -0.5F, -1.0F, 0.0F, 2, 2, 3, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.1441F, -6.1962F, -23.49F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.8646F, -0.1936F, 0.0176F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 87, 30, 0.0F, -0.975F, -0.325F, 1, 1, 3, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -6.4141F, -24.181F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3155F, -0.2494F, 0.0804F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 59, 33, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.1441F, -6.1962F, -23.49F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.8646F, 0.1936F, -0.0176F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 87, 30, -1.0F, -0.975F, -0.325F, 1, 1, 3, 0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -6.4141F, -24.181F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3155F, 0.2494F, -0.0804F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 59, 33, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -6.4141F, -24.181F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 19, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -6.6751F, -22.1981F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 19, -0.5F, -1.0F, -2.0F, 2, 1, 2, 0.006F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -6.7116F, -19.9623F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 35, -0.5F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.0F, -8.0628F, -18.4877F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7418F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 84, -0.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, -10.8482F, -18.9789F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.9599F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 63, -0.5F, 0.0F, -2.0F, 3, 2, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, -12.2624F, -17.5647F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 82, 57, -0.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, -14.9489F, -13.3477F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.5672F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 67, 42, -1.5F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -14.975F, -13.2F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 72, -2.0F, 0.0F, -0.15F, 4, 2, 5, -0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, -2.5624F, -19.0431F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3142F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 34, 79, -0.5F, -5.0F, -3.0F, 3, 5, 3, 0.003F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.6726F, -2.0664F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0524F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 67, 33, -0.5F, -2.0F, -17.0F, 3, 2, 6, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 23, -1.0F, -2.0F, -11.0F, 4, 2, 11, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.5F, -6.5F, -19.75F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.3447F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 77, -0.05F, -3.0F, -0.125F, 3, 6, 4, 0.003F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.5F, -6.5F, -19.75F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.3447F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 74, 77, -2.95F, -3.0F, -0.125F, 3, 6, 4, 0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.1F, -10.0827F, -3.0104F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 23, -1.9F, -3.9173F, 0.0104F, 4, 10, 9, 0.003F, false));
        this.tail.cubeList.add(new ModelBox(tail, 65, 53, 0.1F, -10.4173F, 0.1104F, 0, 6, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.9F, 6.7467F, 8.7692F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2094F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 56, 0, -0.5F, -3.0F, -8.0F, 3, 3, 8, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.9F, -5.4728F, 0.581F);
        this.tail.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 56, 12, -0.5F, 0.0F, 0.5F, 3, 2, 8, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(-2.4F, 6.7467F, 8.7692F);
        this.tail.addChild(backLeftFin);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(3.5F, 0.4085F, -2.1623F);
        this.backLeftFin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1614F, 0.134F, -0.6873F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 57, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(2.6F, 6.7467F, 8.7692F);
        this.tail.addChild(backRightFin);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-3.5F, 0.4085F, -2.1623F);
        this.backRightFin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.1614F, -0.134F, 0.6873F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 19, 57, 0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.005F, -1.7356F, 8.0224F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 43, -1.405F, -1.1818F, -0.012F, 3, 4, 9, 0.003F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 67, 0.095F, 2.8182F, 0.988F, 0, 9, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 57, 0.12F, -6.4068F, -0.012F, 0, 5, 9, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.405F, 2.8182F, 8.988F);
        this.tail2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.6021F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 42, 37, -0.5F, -5.0F, -10.0F, 2, 5, 10, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.405F, -3.4101F, 0.0515F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 53, -0.5F, 0.325F, 0.3F, 2, 2, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.005F, -0.6072F, 7.9893F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 74, 68, -0.9F, -0.5746F, -0.0013F, 2, 2, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 61, 68, 0.1F, 2.1754F, -0.0013F, 0, 8, 6, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 47, 79, 0.1F, -3.8246F, 0.0987F, 0, 3, 5, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.1F, 2.1754F, 5.9987F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2443F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 79, 0, -0.5F, -2.0F, -5.825F, 1, 2, 6, 0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.1F, -0.5746F, 5.9987F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 79, 9, -0.5F, -0.25F, -6.0F, 1, 1, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.1F, 0.5976F, 4.9986F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 81, 17, -0.5F, -1.1722F, 0.0001F, 1, 2, 4, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 27, 37, 0.0F, -11.3722F, 3.0001F, 0, 22, 7, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.5778F, 1.0001F);
        this.tail4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0262F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 51, -0.5F, -1.0F, -0.975F, 1, 1, 4, -0.003F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.1722F, 1.0001F);
        this.tail4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 81, 24, -0.5F, -0.25F, -1.0F, 1, 1, 4, -0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.55F, -5.2F, -16.1F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.48F, 0.0F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 80, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.55F, -5.2F, -16.1F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, -0.48F, 0.0F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 80, 0.0F, -1.5F, 0.0F, 0, 3, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -4.4285F, -21.6684F);
        this.main.addChild(jaw);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.5F, 0.9391F, -0.2279F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.7243F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 22, 84, -0.5F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.2F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.18F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        ((EntityPrehistoricFloraConcavotectum)e).tailBuffer.applyChainSwingBuffer(fishTail);

        float speed = 0.223F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.05F, true, 0, 0, f2, 0.5F);
        }
        this.flap(frontLeftFin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontLeftFin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(frontRightFin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(frontRightFin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(backLeftFin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backLeftFin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(backRightFin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(backRightFin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = -0.1F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(32.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

