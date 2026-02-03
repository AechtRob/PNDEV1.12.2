package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraErpetosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGracilisuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;

    private ModelAnimator animator;

    public ModelGracilisuchus() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 8, -1.5F, -7.25F, 0.0F, 3, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.55F, -0.05F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.048F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 21, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.001F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.5F, -6.25F, 2.5F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3796F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 28, 14, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.5F, 3.3959F, -0.9009F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6109F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 39, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 40, 32, -1.0F, 0.0F, 0.3F, 1, 3, 1, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 3.0752F, 1.2434F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2269F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 0, 29, -1.5F, -0.325F, -3.2F, 2, 1, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-1.5F, -6.25F, 2.5F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3796F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 28, 14, -1.0F, -0.5F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.5F, 3.3959F, -0.9009F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6109F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 39, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 40, 32, 0.0F, 0.0F, 0.3F, 1, 3, 1, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 3.0752F, 1.2434F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2269F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 0, 29, -0.5F, -0.325F, -3.2F, 2, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -7.1086F, 3.8161F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 17, 0, -0.5F, 0.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.275F, 0.0F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0741F, 0.0005F, -0.0004F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 32, -0.5F, 0.025F, 0.075F, 1, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 3.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 14, -0.5F, -1.0F, 0.0F, 2, 2, 4, 0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1515F, 3.5174F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 16, 0.0F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0021F, 4.5239F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 23, 0.0F, -0.5F, 0.0F, 1, 1, 4, 0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -7.25F, 0.0F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.5F, 0.0F, -4.0F, 4, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 8, -1.0F, -0.3F, -4.0F, 3, 1, 4, 0.001F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0434F, -3.2793F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0087F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 26, 21, -1.0F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 37, 17, -0.5F, -0.275F, -2.0F, 2, 1, 2, -0.001F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.075F, 2.0F, -1.25F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, -0.8727F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 37, 12, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.001F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 0.197F, 2.5347F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -1.1345F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 11, 33, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, -0.2733F, 2.0713F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3883F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 9, 38, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-1.075F, 2.0F, -1.25F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, -0.8727F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 37, 12, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.001F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 0.197F, 2.5347F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -1.1345F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 11, 33, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, -0.2733F, 2.0713F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3883F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 9, 38, -1.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0868F, -1.0076F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1745F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 11, 27, -0.5F, 0.0F, -3.0F, 2, 2, 3, -0.003F, false));
        this.body3.cubeList.add(new ModelBox(body3, 22, 32, 0.0F, -0.175F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.725F, -3.0F);
        this.body3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 27, -1.0F, -0.3F, 0.0F, 2, 1, 3, -0.004F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2029F, -2.7002F);
        this.body3.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.1852F, -1.0277F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -1.5F, 0.0F, -1.0F, 3, 1, 2, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.0201F, -2.014F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3229F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 27, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.5F, 0.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0393F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 8, -2.0F, 0.025F, -1.9F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.9735F, 1.5738F, -1.9093F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0532F, -0.4145F, -0.0038F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 5, 39, 0.3F, -0.7F, -2.875F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.9735F, 1.5738F, -1.9093F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0532F, 0.4145F, 0.0038F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 5, 39, -0.3F, -0.7F, -2.875F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.9735F, 1.5738F, -1.9093F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0102F, -0.5454F, -0.0053F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 38, 0.0F, -1.0F, -1.95F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.9735F, 1.5738F, -1.9093F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0102F, 0.5454F, 0.0053F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 38, -1.0F, -1.0F, -1.95F, 1, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.5968F, -1.8083F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0087F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 16, 38, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(1.375F, 0.7171F, -2.1617F);
        this.head.addChild(eye);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.75F, 0.0F, 0.0F);
        this.eye.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2183F, -0.4781F, -0.0623F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 41, 0, -0.45F, -0.5F, -0.3F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eye.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.2183F, 0.4781F, 0.0623F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 0, -0.55F, -0.5F, -0.3F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.3527F, -0.7082F);
        this.head.addChild(jaw);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -0.0089F, 0.2489F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.048F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 34, -1.0F, 0.025F, -4.0F, 1, 1, 3, -0.002F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 37, 21, -1.5F, -0.9F, -1.375F, 2, 1, 2, -0.005F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 4, -2.0F, 0.05F, -1.4F, 3, 1, 2, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.9735F, 0.9461F, -1.2011F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0594F, -0.4554F, 0.0191F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 31, 37, 0.175F, -1.3F, -2.775F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.9735F, 0.9461F, -1.2011F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0594F, 0.4554F, -0.0191F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 37, -0.175F, -1.3F, -2.775F, 0, 1, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.9735F, 0.9461F, -1.2011F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0623F, -0.5425F, 0.0252F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 38, 37, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.9735F, 0.9461F, -1.2011F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0623F, 0.5425F, -0.0252F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 37, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

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
        this.main.offsetY = 0.2F;
        this.main.offsetX = 0.35F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
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
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.105F;
        this.main.render(0.01F);
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraErpetosuchus EntityMegalosaurus = (EntityPrehistoricFloraErpetosuchus) e;

        this.faceTarget(f3, f4, 8, body3);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.body3, this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraErpetosuchus entity = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraErpetosuchus ee = (EntityPrehistoricFloraErpetosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraErpetosuchus e = (EntityPrehistoricFloraErpetosuchus) entity;

    }
}
