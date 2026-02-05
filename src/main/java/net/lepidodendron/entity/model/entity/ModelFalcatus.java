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

public class ModelFalcatus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r28;

    private ModelAnimator animator;

    public ModelFalcatus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0987F, 20.179F, -2.9626F);
        this.main.cubeList.add(new ModelBox(main, 15, 0, -1.5987F, -0.779F, 2.9626F, 3, 2, 5, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5987F, 2.9392F, 0.2117F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2138F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 33, 29, -1.0F, -3.0F, -1.0F, 3, 3, 1, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5987F, 2.7953F, 3.2082F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.048F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 16, -1.0F, -3.0F, -3.0F, 3, 3, 3, 0.006F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.4013F, 2.121F, 8.1626F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1353F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 8, -2.0F, -2.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.0987F, 1.5711F, -2.2707F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 10, -1.0F, -2.0F, 0.0F, 2, 2, 2, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.0987F, 0.7946F, -5.1685F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.1013F, 0.446F, -1.1837F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 37, -0.2F, -1.2F, -2.4F, 0, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.0987F, 0.446F, -1.1837F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, -0.8F, -1.1F, -3.4F, 0, 1, 3, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 37, 0.8F, -1.1F, -3.4F, 0, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 23, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.003F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.1487F, 0.5356F, -0.1072F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0272F, -0.2748F, -0.0074F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 34, -0.5F, -1.0F, -2.0F, 1, 2, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.943F, -0.4644F, -0.1132F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0028F, 0.2531F, -0.0203F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 34, -0.475F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5987F, -1.1644F, 1.4428F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 0, -1.0F, 0.0F, -2.0F, 3, 2, 2, 0.003F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 15, -0.5F, 0.0F, -3.0F, 2, 2, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.9013F, -3.2719F, -0.3499F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.453F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 37, 22, -1.5F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.9013F, -2.5308F, 1.5077F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1912F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 21, 40, -1.5F, -2.0F, -1.0F, 1, 2, 1, 0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.9013F, -0.6224F, 2.0397F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.4494F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 39, -1.5F, -1.95F, -0.65F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5987F, 1.221F, 2.9626F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 29, -1.0F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.6591F, 0.4768F, -2.2122F);
        this.main.addChild(eye);
        this.setRotateAngle(eye, -0.0873F, 0.1963F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, -0.1348F, 0.9669F);
        this.eye.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0873F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 40, 0.0F, -0.8F, -1.15F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 39, 0.05F, -0.45F, -1.475F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 10, 0.0F, -0.1F, -1.15F, 1, 1, 1, -0.003F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 40, 0.0F, -0.1F, -1.8F, 1, 1, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 39, 19, 0.0F, -0.8F, -1.8F, 1, 1, 1, -0.003F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.8565F, 0.4768F, -2.2122F);
        this.main.addChild(eye2);
        this.setRotateAngle(eye2, -0.0873F, -0.1963F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -0.1348F, 0.9669F);
        this.eye2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 40, -1.0F, -0.8F, -1.15F, 1, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 39, -1.05F, -0.45F, -1.475F, 1, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 10, -1.0F, -0.1F, -1.15F, 1, 1, 1, -0.003F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 40, -1.0F, -0.1F, -1.8F, 1, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 39, 19, -1.0F, -0.8F, -1.8F, 1, 1, 1, -0.003F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(1.4013F, 2.7953F, 1.4582F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0404F, 0.0774F, -1.0893F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontLeftFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 29, 0.0F, -0.3F, 0.0F, 0, 3, 4, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-1.5987F, 2.7953F, 1.4582F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0404F, -0.0774F, 1.0893F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontRightFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 13, 29, 0.0F, -0.3F, 0.0F, 0, 3, 4, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5987F, 1.8869F, -0.5111F);
        this.main.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.3F, 0.0639F, -1.4337F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 37, 0.0F, -0.55F, -1.425F, 0, 1, 3, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 37, 1.6F, -0.55F, -1.425F, 0, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, -0.3082F, -1.6727F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1745F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 5, -1.0F, -0.125F, -1.2F, 2, 1, 3, -0.006F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.0987F, 0.214F, 7.401F);
        this.main.addChild(tail);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.8992F, 0.0313F);
        this.tail.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1876F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 26, -0.5F, -0.925F, 0.025F, 2, 1, 4, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, -0.968F, 0.0615F);
        this.tail.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0436F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 19, -0.5F, 0.0F, 0.0F, 2, 2, 4, 0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.9462F, 0.5611F);
        this.tail.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.7418F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 29, 34, 0.5F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0F, 1.741F, 0.7149F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.1008F, 0.1427F, -0.9527F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.0102F, -0.0062F);
        this.backLeftFin.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2182F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 22, 34, 0.0F, -0.2F, 0.0F, 0, 2, 3, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0F, 1.741F, 0.7149F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.1008F, -0.1427F, 0.9527F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -0.0102F, -0.0062F);
        this.backRightFin.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 22, 34, 0.0F, -0.2F, 0.0F, 0, 2, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.1283F, 3.5657F);
        this.tail.addChild(tail2);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.1863F, 2.9461F);
        this.tail2.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 28, 16, -0.5F, -0.475F, -2.925F, 1, 1, 4, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, -0.9436F, -0.0075F);
        this.tail2.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0436F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 26, 23, -0.5F, 0.025F, 0.0F, 1, 1, 4, 0.003F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0765F, 2.7771F);
        this.tail2.addChild(tail3);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.4947F, 0.2187F);
        this.tail3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.096F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, 0.0F, -5.725F, -0.175F, 0, 11, 7, 0.0F, false));
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
        this.main.offsetY = 0.03F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.main.offsetZ = -0.1F;
        this.main.offsetY = 0.3F;
        this.main.offsetX = -0.02F;
        this.main.render(0.01F);
        this.resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.8F;
        this.main.offsetX = 1.0F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 3.6F;
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
        this.main.offsetY = 0F;
        this.main.offsetZ = -0F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.4F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.06F, -3, f2, 0.6F);
            this.chainSwing(fishTail, speed, 0.65F, -3, f2, 0.7F);
            this.swing(main, speed, 0.1F, true, 0, 0, f2, 0.5F);
            this.flap(frontLeftFin, (float) (speed ), 0.5F, true, 0, 0, f2, 0.5F);
            this.swing(frontLeftFin, (float) (speed), 0.2F, true, 0, 0, f2, 0.5F);
            this.flap(frontRightFin, (float) (speed), 0.5F, true, -3, 0, f2, 0.5F);
            this.swing(frontRightFin, (float) (speed), 0.2F, true, -3, 0, f2, 0.5F);
            this.flap(backLeftFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);
            this.flap(backRightFin, (float) (speed * 0.75), 0.3F, true, 1, 0, f2, 0.5F);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);

                this.main.offsetY = 0F;
                this.main.offsetZ = -0.F;
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
        animator.rotate(this.jaw, (float) Math.toRadians(22.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(4);
        animator.resetKeyframe(3);
    }


}