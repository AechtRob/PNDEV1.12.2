package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUrvaspis extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer leftSpine;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightSpine;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private ModelAnimator animator;

    public ModelUrvaspis() {
        animator = ModelAnimator.create();
        this.textureWidth = 58;
        this.textureHeight = 58;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -3.0F, -4.0F, 5, 3, 6, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.3095F, -1.2866F, -6.0165F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.3568F, -0.1338F, -0.0112F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 45, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.3095F, -1.2866F, -6.0165F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.3568F, 0.1338F, 0.0112F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 45, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.282F, -6.8833F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.7112F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, -1.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 23, -1.5F, 0.0F, 0.8F, 3, 2, 2, 0.006F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.2989F, -3.1045F, -6.0755F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.2926F, -0.5241F, 0.1751F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 11, 42, 0.0F, -0.075F, -2.025F, 2, 3, 2, -0.009F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.2989F, -3.1045F, -6.0755F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.2926F, 0.5241F, -0.1751F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 42, -2.0F, -0.075F, -2.025F, 2, 3, 2, -0.009F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.5F, -2.5828F, -7.8371F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.2654F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 42, -0.5F, 3.0F, -1.0F, 4, 2, 1, 0.003F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 43, 36, 0.0F, 1.0F, -1.0F, 3, 2, 1, 0.003F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.1739F, -2.4853F, -6.1028F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0993F, 0.7355F, -1.3939F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 38, -0.55F, -0.5F, -0.45F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.1739F, -2.4853F, -6.1028F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0993F, -0.7355F, 1.3939F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 38, -0.45F, -0.5F, -0.45F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -5.4F, -2.625F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0218F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 38, 8, -2.5F, 0.0F, 3.65F, 5, 3, 1, -0.006F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -4.9865F, -2.9621F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4451F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 38, 13, -2.0F, 0.0F, -2.0F, 4, 2, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -5.3198F, 1.0491F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0829F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 19, 20, -2.5F, 0.0F, -4.025F, 5, 3, 4, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(2.7063F, -1.2095F, -1.7945F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, -0.329F, 0.9899F, -0.1515F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 32, -3.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-2.7063F, -1.2095F, -1.7945F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, -0.329F, -0.9899F, 0.1515F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 32, 0.0F, 0.0F, 0.0F, 3, 0, 5, 0.0F, true));

        this.leftSpine = new AdvancedModelRenderer(this);
        this.leftSpine.setRotationPoint(0.2872F, 0.621F, 0.0F);
        this.main.addChild(leftSpine);
        this.setRotateAngle(leftSpine, 0.0F, 0.0F, -0.0305F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.8757F, -2.0276F, -4.05F);
        this.leftSpine.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0008F, 0.2356F, -0.0045F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 18, -2.075F, 0.0F, -0.075F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.9633F, -5.2193F, -3.9895F);
        this.leftSpine.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0057F, 0.1089F, -0.1699F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 38, -1.75F, 0.425F, -0.05F, 2, 3, 3, 0.0F, false));

        this.rightSpine = new AdvancedModelRenderer(this);
        this.rightSpine.setRotationPoint(-0.2872F, 0.621F, 0.0F);
        this.main.addChild(rightSpine);
        this.setRotateAngle(rightSpine, 0.0F, 0.0F, 0.0305F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.8757F, -2.0276F, -4.05F);
        this.rightSpine.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0008F, -0.2356F, 0.0045F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 18, 0.075F, 0.0F, -0.075F, 2, 1, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.9633F, -5.2193F, -3.9895F);
        this.rightSpine.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0057F, -0.1089F, 0.1699F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 38, -0.25F, 0.425F, -0.05F, 2, 3, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.8909F, -4.0488F);
        this.main.addChild(jaw);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.5019F, -0.5065F, -2.3794F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3901F, -0.2283F, 0.1292F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 45, 0.4F, -0.55F, -0.6F, 0, 1, 2, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(1.5019F, -0.5065F, -2.3794F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3901F, 0.2283F, -0.1292F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 45, -0.4F, -0.55F, -0.6F, 0, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, -0.0423F, -2.287F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 4, -0.5F, -0.675F, 0.475F, 3, 1, 2, -0.003F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 0, -0.5F, -0.675F, -0.825F, 3, 1, 2, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -3.5537F, 1.1308F);
        this.main.addChild(body);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.0F, -1.4352F, 0.1521F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.5672F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 42, 2.0F, -3.3F, 0.8F, 0, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.6696F, 3.2019F);
        this.body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1309F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 19, 10, -2.0F, -2.0F, -3.0F, 4, 4, 5, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 3.5537F, 0.6192F);
        this.body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0654F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 0, -2.0F, -2.05F, -0.675F, 4, 2, 5, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(2.0F, 2.8037F, 2.8692F);
        this.body.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, -0.1353F, -0.6398F, 0.2708F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 31, 42, 0.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-2.0F, 2.8037F, 2.8692F);
        this.body.addChild(backRightFin);
        this.setRotateAngle(backRightFin, -0.1353F, 0.6398F, -0.2708F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 31, 42, -3.0F, 0.0F, 0.0F, 3, 0, 2, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.4722F, 4.8623F);
        this.body.addChild(tail);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0F, 1.4189F, 4.5349F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.2618F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 17, 28, -0.5F, -2.025F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0F, -2.2184F, 0.6068F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.1745F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 24, -0.5F, 0.875F, -0.5F, 3, 2, 5, 0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.5589F, 4.1325F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 17, 36, -1.0F, -0.0095F, -0.0256F, 2, 1, 4, 0.003F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, 1.0155F, 4.9744F);
        this.tail2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 36, -0.5F, -0.425F, -5.0F, 2, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6014F, 3.7852F);
        this.tail2.addChild(tail3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0615F, 0.1204F);
        this.tail3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.5149F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 45, -0.5F, -0.975F, 0.0F, 1, 1, 2, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5F, -0.5109F, -0.4109F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1745F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 10, 0.5F, 0.0F, 0.0F, 0, 4, 9, 0.0F, false));
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 34, 28, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

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

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.jaw, (float) Math.toRadians(37.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
