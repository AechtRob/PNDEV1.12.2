package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNarrominaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;

    public ModelNarrominaspis() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 28, 15, -1.0F, -1.1692F, -5.8236F, 2, 1, 3, -0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -2.1442F, -3.0986F, 4, 2, 5, 0.006F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -1.2188F, -7.5604F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5192F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 10, -0.5F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -2.9081F, -6.0953F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 30, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.1518F, -0.7471F, -2.7932F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2162F, -0.7956F, 0.0353F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -1.0F, -0.7F, 2.0F, 1, 1, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 0, -1.0F, -0.7F, 0.0F, 2, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.1867F, -1.1113F, -3.0083F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0403F, 0.034F, 0.187F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 25, 34, -0.2F, -2.0F, 0.025F, 1, 2, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.1518F, -0.7471F, -2.7932F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2162F, 0.7956F, -0.0353F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, 0.0F, -0.7F, 2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 0, -1.0F, -0.7F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.1867F, -1.1113F, -3.0083F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0403F, -0.034F, -0.187F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 34, -0.8F, -2.0F, 0.025F, 1, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.6855F, -2.1745F, -5.9441F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0046F, -0.2145F, -0.1348F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 29, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0154F, -1.2101F, -7.5816F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.511F, -0.289F, -0.0885F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 35, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.6855F, -2.1745F, -5.9441F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0046F, 0.2145F, 0.1348F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0154F, -1.2101F, -7.5816F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.511F, 0.289F, 0.0885F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.6583F, -1.7796F, -5.7504F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3201F, -0.2992F, -0.0974F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 34, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.6583F, -2.7334F, -6.0511F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2093F, -0.1622F, -0.0516F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 35, 29, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.6583F, -2.7334F, -6.0511F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2093F, 0.1622F, 0.0516F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 29, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.6583F, -1.7796F, -5.7504F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3201F, 0.2992F, 0.0974F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 34, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -3.341F, -4.1427F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 6, -0.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.05F, -3.341F, -4.1427F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 24, -1.95F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -3.5F, -2.5F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 8, -1.5F, 0.0F, 0.35F, 4, 2, 4, -0.003F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6567F, -5.6941F);
        this.main.addChild(jaw);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -0.4379F, 0.3663F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.432F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 34, -0.5F, 0.05F, -2.05F, 2, 1, 2, -0.006F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.5165F, -0.6971F, -0.9571F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.1793F, -0.5872F, 0.3161F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 28, 20, 0.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5165F, -0.6971F, -0.9571F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.1793F, 0.5872F, -0.3161F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 28, 20, -3.0F, 0.0F, -1.0F, 3, 0, 2, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.8838F, -1.7461F, -6.4133F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, 0.0F, 0.0F, 0.0567F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2247F, 0.2984F, 0.0774F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 38, -0.425F, -0.25F, -0.075F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 12, 38, -0.425F, -0.75F, -0.075F, 1, 1, 1, -0.003F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 38, -0.425F, -0.75F, -0.575F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 36, -0.325F, -0.5F, -0.325F, 1, 1, 1, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 38, -0.425F, -0.25F, -0.575F, 1, 1, 1, -0.006F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.8838F, -1.7461F, -6.4133F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, 0.0F, 0.0F, -0.0567F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2247F, -0.2984F, -0.0774F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 38, -0.575F, -0.25F, -0.075F, 1, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 38, -0.575F, -0.75F, -0.075F, 1, 1, 1, -0.003F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 7, 38, -0.575F, -0.75F, -0.575F, 1, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 36, -0.675F, -0.5F, -0.325F, 1, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 38, -0.575F, -0.25F, -0.575F, 1, 1, 1, -0.006F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.26F, -1.9292F, 1.4201F);
        this.main.addChild(tail);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.26F, 0.5332F, 2.9985F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 13, 24, -1.5F, -1.275F, -3.0F, 3, 2, 3, -0.003F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-2.76F, -1.6708F, 0.1799F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4363F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 30, 2.5F, 0.2F, 0.5F, 0, 2, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.26F, -1.6708F, 0.1799F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 19, 0, -0.5F, -0.05F, 0.0F, 3, 2, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.04F, 0.8202F, 2.3056F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.6561F, 0.2405F, -0.8131F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 39, 4, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.56F, 0.8202F, 2.3056F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.6561F, -0.2405F, 0.8131F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 39, 4, 0.0F, 0.0F, -0.5F, 0, 2, 1, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.26F, -0.3246F, 2.7803F);
        this.tail.addChild(tail2);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.0336F, 3.9515F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1309F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 23, -0.5F, -1.0F, -4.0F, 2, 1, 4, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.5F, -1.1346F, 0.1425F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 17, 8, -0.5F, 0.0F, -0.1F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.6571F, 1.6322F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 1.7361F, 1.9193F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3971F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 26, 29, -0.5F, -1.1F, 0.0F, 1, 1, 3, -0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-0.5F, 0.9766F, 4.8643F);
        this.tail3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 15, 15, 0.5F, -1.05F, -2.95F, 0, 2, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.3525F, 1.4103F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, -0.5F, 0.125F, 0.325F, 1, 1, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleZ = (float) Math.toRadians(0);
        this.main.rotateAngleY = (float) Math.toRadians(180);
        this.main.rotateAngleX = (float) Math.toRadians(270);
        this.main.offsetY = -0.2F;
        this.main.offsetZ = -0.1F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetZ = -0.05F;
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.6F;
        this.main.offsetX = 0.8F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.6F, -0.2F);
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

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};

        float speed = 0.186F;
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
            this.swing(main, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
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
            this.main.rotateAngleZ = (float) Math.toRadians(270);
//            this.body.offsetY = -0.05F;
//            this.body.offsetX = -0.5F;
            this.bob(main, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -3, f2, 1F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -3, f2, 1F * still);

        }

    }}
