package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPaulchoffatia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPaulchoffatia extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLowerLeg_r1;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLowerLeg_r1;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r26;


    private ModelAnimator animator;

    public ModelPaulchoffatia() {
        this.textureWidth = 35;
        this.textureHeight = 34;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 20.3F, 2.6F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.1F, 0.1F, 0.3F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5149F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -1.6F, -1.3F, -1.2F, 3, 3, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.root.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, -3.9F, 4, 3, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.0F, 0.5F, -3.9F, 4, 1, 4, -0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.2F, -3.9F);
        this.body.addChild(chest);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3142F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 13, 14, -1.5F, -1.5853F, -2.2956F, 3, 3, 3, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.8F, -1.9F);
        this.chest.addChild(Neck);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.8125F, -0.7971F);
        this.Neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2443F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 12, -1.0F, -1.0F, -1.2F, 2, 2, 2, 0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.1F, -0.9F, -1.35F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1745F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.8945F, -0.5439F, -0.3029F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.014F, 0.3248F, 0.0627F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 12, -0.825F, -0.5F, 0.0F, 1, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0945F, -0.5439F, -0.3029F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.014F, -0.3248F, -0.0627F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 12, -0.175F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.675F, -1.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2443F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 8, -1.0F, -1.45F, -0.8F, 1, 1, 1, 0.0F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 8, 0.2F, -1.45F, -0.8F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.6F, -0.1F, -1.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2793F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 26, -1.5F, -0.875F, -0.875F, 2, 2, 2, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, 0.3F, -1.1F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5739F, -0.331F, -0.2322F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 31, -0.4F, -1.25F, -1.2177F, 1, 1, 1, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.7F, 0.3F, -1.1F);
        this.Head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5739F, 0.331F, 0.2322F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 31, -0.6F, -1.25F, -1.2177F, 1, 1, 1, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.1F, 0.8977F, -3.0948F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0611F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 12, -0.5F, -0.55F, 0.075F, 1, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.6F, 0.725F, -2.35F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5411F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 28, 4, -1.0F, -1.0F, -1.0F, 1, 1, 2, 0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.1F, 0.078F, -1.3817F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.1309F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.3F, 0.6211F, -1.266F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.1432F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 12, 0.8F, -0.625F, -0.3F, 1, 1, 0, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.9F, 0.2F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.576F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 17, 31, 0.1F, -1.3F, -1.1F, 0, 1, 1, -0.01F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 31, 0.9F, -1.3F, -1.1F, 0, 1, 1, -0.01F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 9, 27, 0.0F, -1.1F, -1.7F, 1, 1, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-1.275F, 0.6462F, -1.8895F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.0524F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.375F, 0.2507F, 0.5549F);
        this.rightArm1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.4451F, 0.0131F, -0.0007F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 21, -1.025F, -1.0F, -1.0F, 2, 2, 2, -0.05F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.175F, 0.9001F, 1.2052F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.1658F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.5819F, -0.3026F);
        this.rightArm2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3853F, 0.0809F, -0.0328F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 27, -0.6F, -1.0386F, -0.5121F, 1, 2, 1, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-0.075F, 1.3809F, -0.4663F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, -0.1834F, -0.0298F, 0.0066F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.125F, 0.975F, 0.0F);
        this.rightHand.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.1396F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 26, 17, -0.7F, -1.1F, -1.725F, 1, 1, 2, -0.01F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(1.275F, 0.6462F, -1.8895F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.0524F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.375F, 0.2507F, 0.5549F);
        this.leftArm1.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4451F, -0.0131F, 0.0007F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 21, -0.975F, -1.0F, -1.0F, 2, 2, 2, -0.05F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.175F, 0.9001F, 1.2052F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.1658F, 0.0F, 0.0F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.5819F, -0.3026F);
        this.leftArm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3853F, -0.0809F, 0.0328F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 27, -0.4F, -1.0386F, -0.5121F, 1, 2, 1, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.075F, 1.3809F, -0.4663F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, -0.1834F, 0.0298F, -0.0066F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.125F, 0.975F, 0.0F);
        this.leftHand.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, -0.1396F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 17, -0.3F, -1.1F, -1.725F, 1, 1, 2, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 0.2F, 1.0F);
        this.root.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1225F, 0.0869F, -0.0053F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.3735F, 0.8152F, -1.2555F);
        this.rightLeg1.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.5061F, 0.2967F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 21, -0.9964F, -1.0925F, -1.4621F, 2, 2, 3, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-0.8F, 1.5F, -1.9F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.429F, 0.2601F, -0.0565F);


        this.rightLowerLeg_r1 = new AdvancedModelRenderer(this);
        this.rightLowerLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightLowerLeg_r1);
        this.setRotateAngle(rightLowerLeg_r1, -0.6225F, -0.0588F, 0.1429F);
        this.rightLowerLeg_r1.cubeList.add(new ModelBox(rightLowerLeg_r1, 28, 0, -0.5667F, -0.6934F, -0.0862F, 1, 1, 2, -0.01F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-0.3988F, 0.5977F, 1.5786F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.4509F, 0.1046F, 0.1113F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.2799F, 0.5537F, -0.028F);
        this.rightFoot.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.1107F, -0.1559F, 0.0451F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 27, -0.675F, -0.675F, -2.5F, 1, 1, 3, 0.01F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 0.2F, 1.0F);
        this.root.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1225F, -0.0869F, 0.0053F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.3735F, 0.8152F, -1.2555F);
        this.leftLeg1.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.5061F, -0.2967F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 21, -1.0036F, -1.0925F, -1.4621F, 2, 2, 3, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.8F, 1.5F, -1.9F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.429F, -0.2601F, 0.0565F);


        this.leftLowerLeg_r1 = new AdvancedModelRenderer(this);
        this.leftLowerLeg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftLowerLeg_r1);
        this.setRotateAngle(leftLowerLeg_r1, -0.6225F, 0.0588F, -0.1429F);
        this.leftLowerLeg_r1.cubeList.add(new ModelBox(leftLowerLeg_r1, 28, 0, -0.4333F, -0.6934F, -0.0862F, 1, 1, 2, -0.01F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.3988F, 0.5977F, 1.5786F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.4509F, -0.1046F, -0.1113F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.2799F, 0.5537F, -0.028F);
        this.leftFoot.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.1107F, 0.1559F, -0.0451F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 27, -0.325F, -0.675F, -2.5F, 1, 1, 3, 0.01F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.6F, 1.2F);
        this.root.addChild(tail1);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-0.5F, -1.0F, 0.5F);
        this.tail1.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3665F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 0, -0.5F, 0.3F, -0.3F, 2, 2, 3, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0753F, 2.4023F);
        this.tail1.addChild(tail2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.5F, -0.35F, 0.425F);
        this.tail2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.2269F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 21, -1.5F, -0.5F, -0.3F, 2, 2, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.6699F, 2.8186F);
        this.tail2.addChild(tail3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.55F, -0.25F);
        this.tail3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0698F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 17, 6, -1.5F, -0.4F, 0.2F, 2, 2, 3, -0.01F, false));



        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.80F;
        this.root.offsetX = .0F;
        this.root.rotateAngleY = (float)Math.toRadians(250);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = 0.037F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

//    public void renderStaticWall(float f) {
//
//        resetToDefaultPose();
//    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPaulchoffatia entityPaulchoffatia = (EntityPrehistoricFloraPaulchoffatia) e;

        this.faceTarget(f3, f4, 12, Neck);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        if (entityPaulchoffatia.getAnimation() == entityPaulchoffatia.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityPaulchoffatia.isReallyInWater()) {

                if (f3 == 0.0F || !entityPaulchoffatia.getIsMoving()) {
                    if (entityPaulchoffatia.getAnimation() != entityPaulchoffatia.EAT_ANIMATION
                        && entityPaulchoffatia.getAnimation() != entityPaulchoffatia.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityPaulchoffatia.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPaulchoffatia ee = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
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
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The graze anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.75 + (((tickAnim - 8) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -16.25 + (((tickAnim - 5) / 3) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -16.25 + (((tickAnim - 12) / 3) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 30.5 + (((tickAnim - 5) / 3) * (0-(30.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (19.5-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 19.5 + (((tickAnim - 12) / 3) * (0-(19.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 14.75 + (((tickAnim - 5) / 7) * (0-(14.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -7.5 + (((tickAnim - 20) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -7.5 + (((tickAnim - 30) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -7.5 + (((tickAnim - 40) / 3) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 20.5 + (((tickAnim - 5) / 7) * (0-(20.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -5 + (((tickAnim - 20) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 30) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-5-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -5 + (((tickAnim - 40) / 3) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 20.75 + (((tickAnim - 5) / 3) * (0-(20.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (17.5-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 17.5 + (((tickAnim - 14) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (17.5-(0)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 17.5 + (((tickAnim - 24) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 24) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 5) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (17.5-(0)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 17.5 + (((tickAnim - 34) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.18461-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.25307-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = -0.18461 + (((tickAnim - 12) / 5) * (-0.3552-(-0.18461)));
            zz = 0.25307 + (((tickAnim - 12) / 5) * (-0.02374-(0.25307)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -0.3552 + (((tickAnim - 17) / 2) * (0-(-0.3552)));
            zz = -0.02374 + (((tickAnim - 17) / 2) * (0-(-0.02374)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 3) * (-0.18461-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0.25307-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = -0.18461 + (((tickAnim - 22) / 5) * (-0.3552-(-0.18461)));
            zz = 0.25307 + (((tickAnim - 22) / 5) * (-0.02374-(0.25307)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            yy = -0.3552 + (((tickAnim - 27) / 2) * (0-(-0.3552)));
            zz = -0.02374 + (((tickAnim - 27) / 2) * (0-(-0.02374)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 3) * (-0.18461-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0.25307-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = -0.18461 + (((tickAnim - 32) / 5) * (-0.3552-(-0.18461)));
            zz = 0.25307 + (((tickAnim - 32) / 5) * (-0.02374-(0.25307)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = -0.3552 + (((tickAnim - 37) / 2) * (0-(-0.3552)));
            zz = -0.02374 + (((tickAnim - 37) / 2) * (0-(-0.02374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Jaw.rotationPointX = this.Jaw.rotationPointX + (float)(xx);
        this.Jaw.rotationPointY = this.Jaw.rotationPointY - (float)(yy);
        this.Jaw.rotationPointZ = this.Jaw.rotationPointZ + (float)(zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.25 + (((tickAnim - 4) / 4) * (-13.25-(11.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.25 + (((tickAnim - 8) / 2) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-55.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -55.25 + (((tickAnim - 4) / 4) * (0.5-(-55.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 8) / 2) * (0-(0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (48.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 48.75 + (((tickAnim - 4) / 3) * (0-(48.75)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 69;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (-70-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 64) {
            xx = -70 + (((tickAnim - 13) / 51) * (-70-(-70)));
            yy = 0 + (((tickAnim - 13) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 51) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = -70 + (((tickAnim - 64) / 5) * (0-(-70)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 66) {
            xx = 27.5 + (((tickAnim - 5) / 61) * (27.5-(27.5)));
            yy = 0 + (((tickAnim - 5) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 61) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 27.5 + (((tickAnim - 66) / 4) * (0-(27.5)));
            yy = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 20 + (((tickAnim - 7) / 4) * (21.93011-(20)));
            yy = 0 + (((tickAnim - 7) / 4) * (41.56076-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (30.78973-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 21.93011 + (((tickAnim - 11) / 3) * (21.93011-(21.93011)));
            yy = 41.56076 + (((tickAnim - 11) / 3) * (41.56076-(41.56076)));
            zz = 30.78973 + (((tickAnim - 11) / 3) * (30.78973-(30.78973)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 21.93011 + (((tickAnim - 14) / 2) * (16.39534-(21.93011)));
            yy = 41.56076 + (((tickAnim - 14) / 2) * (-3.96045-(41.56076)));
            zz = 30.78973 + (((tickAnim - 14) / 2) * (1.27489-(30.78973)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 16.39534 + (((tickAnim - 16) / 2) * (16.39534-(16.39534)));
            yy = -3.96045 + (((tickAnim - 16) / 2) * (-3.96045-(-3.96045)));
            zz = 1.27489 + (((tickAnim - 16) / 2) * (1.27489-(1.27489)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 16.39534 + (((tickAnim - 18) / 2) * (12.81245-(16.39534)));
            yy = -3.96045 + (((tickAnim - 18) / 2) * (-14.59426-(-3.96045)));
            zz = 1.27489 + (((tickAnim - 18) / 2) * (-9.13816-(1.27489)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 12.81245 + (((tickAnim - 20) / 4) * (12.81245-(12.81245)));
            yy = -14.59426 + (((tickAnim - 20) / 4) * (-14.59426-(-14.59426)));
            zz = -9.13816 + (((tickAnim - 20) / 4) * (-9.13816-(-9.13816)));
        }
        else if (tickAnim >= 24 && tickAnim < 34) {
            xx = 12.81245 + (((tickAnim - 24) / 10) * (12.81245-(12.81245)));
            yy = -14.59426 + (((tickAnim - 24) / 10) * (-14.59426-(-14.59426)));
            zz = -9.13816 + (((tickAnim - 24) / 10) * (-9.13816-(-9.13816)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 12.81245 + (((tickAnim - 34) / 4) * (21.93011-(12.81245)));
            yy = -14.59426 + (((tickAnim - 34) / 4) * (41.56076-(-14.59426)));
            zz = -9.13816 + (((tickAnim - 34) / 4) * (30.78973-(-9.13816)));
        }
        else if (tickAnim >= 38 && tickAnim < 49) {
            xx = 21.93011 + (((tickAnim - 38) / 11) * (21.93011-(21.93011)));
            yy = 41.56076 + (((tickAnim - 38) / 11) * (41.56076-(41.56076)));
            zz = 30.78973 + (((tickAnim - 38) / 11) * (30.78973-(30.78973)));
        }
        else if (tickAnim >= 49 && tickAnim < 51) {
            xx = 21.93011 + (((tickAnim - 49) / 2) * (20-(21.93011)));
            yy = 41.56076 + (((tickAnim - 49) / 2) * (0-(41.56076)));
            zz = 30.78973 + (((tickAnim - 49) / 2) * (0-(30.78973)));
        }
        else if (tickAnim >= 51 && tickAnim < 54) {
            xx = 20 + (((tickAnim - 51) / 3) * (-16.25-(20)));
            yy = 0 + (((tickAnim - 51) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 3) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = -16.25 + (((tickAnim - 54) / 3) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = -16.25 + (((tickAnim - 60) / 4) * (0-(-16.25)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (30.5-(0)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 57) {
            xx = 30.5 + (((tickAnim - 54) / 3) * (0-(30.5)));
            yy = 0 + (((tickAnim - 54) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 3) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 57) / 3) * (30.5-(0)));
            yy = 0 + (((tickAnim - 57) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 3) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 30.5 + (((tickAnim - 60) / 4) * (0-(30.5)));
            yy = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 60 + (((tickAnim - 11) / 53) * (60-(60)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 60 + (((tickAnim - 64) / 6) * (0-(60)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (55-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 55 + (((tickAnim - 11) / 53) * (55-(55)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 55 + (((tickAnim - 64) / 6) * (0-(55)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (60-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 60 + (((tickAnim - 11) / 53) * (60-(60)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 60 + (((tickAnim - 64) / 6) * (0-(60)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (55-(0)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 64) {
            xx = 55 + (((tickAnim - 11) / 53) * (55-(55)));
            yy = 0 + (((tickAnim - 11) / 53) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 53) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 70) {
            xx = 55 + (((tickAnim - 64) / 6) * (0-(55)));
            yy = 0 + (((tickAnim - 64) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -23.75 + (((tickAnim - 4) / 2) * (-7.5-(-23.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (30.92355-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-11.66768-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-5.04266-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (22.5-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            yy = 22.5 + (((tickAnim - 6) / 12) * (22.5-(22.5)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 22.5 + (((tickAnim - 18) / 12) * (22.5-(22.5)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 22.5 + (((tickAnim - 30) / 8) * (-22.5-(22.5)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 38) / 9) * (0-(0)));
            yy = -22.5 + (((tickAnim - 38) / 9) * (-22.5-(-22.5)));
            zz = 0 + (((tickAnim - 38) / 9) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = -22.5 + (((tickAnim - 47) / 5) * (11.25-(-22.5)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 52) / 6) * (0-(0)));
            yy = 11.25 + (((tickAnim - 52) / 6) * (11.25-(11.25)));
            zz = 0 + (((tickAnim - 52) / 6) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            yy = 11.25 + (((tickAnim - 58) / 4) * (0-(11.25)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-1.14145-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (31.23578-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-0.83557-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -1.14145 + (((tickAnim - 7) / 11) * (-1.14145-(-1.14145)));
            yy = 31.23578 + (((tickAnim - 7) / 11) * (31.23578-(31.23578)));
            zz = -0.83557 + (((tickAnim - 7) / 11) * (-0.83557-(-0.83557)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.14145 + (((tickAnim - 18) / 12) * (-1.14145-(-1.14145)));
            yy = 31.23578 + (((tickAnim - 18) / 12) * (31.23578-(31.23578)));
            zz = -0.83557 + (((tickAnim - 18) / 12) * (-0.83557-(-0.83557)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -1.14145 + (((tickAnim - 30) / 10) * (-1.14145-(-1.14145)));
            yy = 31.23578 + (((tickAnim - 30) / 10) * (-31.23578-(31.23578)));
            zz = -0.83557 + (((tickAnim - 30) / 10) * (0.83557-(-0.83557)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = -1.14145 + (((tickAnim - 40) / 7) * (-1.14145-(-1.14145)));
            yy = -31.23578 + (((tickAnim - 40) / 7) * (-31.23578-(-31.23578)));
            zz = 0.83557 + (((tickAnim - 40) / 7) * (0.83557-(0.83557)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = -1.14145 + (((tickAnim - 47) / 5) * (-0.57-(-1.14145)));
            yy = -31.23578 + (((tickAnim - 47) / 5) * (15.62-(-31.23578)));
            zz = 0.83557 + (((tickAnim - 47) / 5) * (-0.42-(0.83557)));
        }
        else if (tickAnim >= 52 && tickAnim < 59) {
            xx = -0.57 + (((tickAnim - 52) / 7) * (-0.57-(-0.57)));
            yy = 15.62 + (((tickAnim - 52) / 7) * (15.62-(15.62)));
            zz = -0.42 + (((tickAnim - 52) / 7) * (-0.42-(-0.42)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = -0.57 + (((tickAnim - 59) / 4) * (0-(-0.57)));
            yy = 15.62 + (((tickAnim - 59) / 4) * (0-(15.62)));
            zz = -0.42 + (((tickAnim - 59) / 4) * (0-(-0.42)));
        }
        else if (tickAnim >= 63 && tickAnim < 66) {
            xx = 0 + (((tickAnim - 63) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 63) / 3) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 63) / 3) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 66) / 4) * (0-(0)));
            yy = -17.5 + (((tickAnim - 66) / 4) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 66) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 30 + (((tickAnim - 8) / 10) * (0-(30)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (30-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (0-(0)));
            yy = 30 + (((tickAnim - 30) / 12) * (-30-(30)));
            zz = 0 + (((tickAnim - 30) / 12) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 42) / 5) * (-30-(-30)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = -30 + (((tickAnim - 47) / 5) * (15-(-30)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 52) / 2) * (0-(0)));
            yy = 15 + (((tickAnim - 52) / 2) * (-22.5-(15)));
            zz = 0 + (((tickAnim - 52) / 2) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = -22.5 + (((tickAnim - 54) / 6) * (15-(-22.5)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 60) / 4) * (0-(0)));
            yy = 15 + (((tickAnim - 60) / 4) * (0-(15)));
            zz = 0 + (((tickAnim - 60) / 4) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 64) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 64) / 4) * (-17.5-(0)));
            zz = 0 + (((tickAnim - 64) / 4) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 68) / 2) * (0-(0)));
            yy = -17.5 + (((tickAnim - 68) / 2) * (0-(-17.5)));
            zz = 0 + (((tickAnim - 68) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-3), root.rotateAngleY + (float) Math.toRadians(0), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-40))*4), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+30))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-4), Neck.rotateAngleY + (float) Math.toRadians(0), Neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -27.17 + (((tickAnim - 0) / 8) * (17.58-(-27.17)));
            yy = -3.3 + (((tickAnim - 0) / 8) * (0-(-3.3)));
            zz = -4.18 + (((tickAnim - 0) / 8) * (0-(-4.18)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 17.58 + (((tickAnim - 8) / 5) * (-37.11889-(17.58)));
            yy = 0 + (((tickAnim - 8) / 5) * (-4.02912-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (-5.10334-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -37.11889 + (((tickAnim - 13) / 2) * (-27.17-(-37.11889)));
            yy = -4.02912 + (((tickAnim - 13) / 2) * (-3.3-(-4.02912)));
            zz = -5.10334 + (((tickAnim - 13) / 2) * (-4.18-(-5.10334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.76 + (((tickAnim - 0) / 8) * (24.33-(16.76)));
            yy = 6.29 + (((tickAnim - 0) / 8) * (0-(6.29)));
            zz = 1.98 + (((tickAnim - 0) / 8) * (0-(1.98)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 24.33 + (((tickAnim - 8) / 1) * (-24.51-(24.33)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -24.51 + (((tickAnim - 9) / 3) * (-28.25539-(-24.51)));
            yy = 0 + (((tickAnim - 9) / 3) * (4.61261-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (1.44902-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -28.25539 + (((tickAnim - 12) / 1) * (15.08164-(-28.25539)));
            yy = 4.61261 + (((tickAnim - 12) / 1) * (7.6878-(4.61261)));
            zz = 1.44902 + (((tickAnim - 12) / 1) * (2.41507-(1.44902)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15.08164 + (((tickAnim - 13) / 2) * (16.76-(15.08164)));
            yy = 7.6878 + (((tickAnim - 13) / 2) * (6.29-(7.6878)));
            zz = 2.41507 + (((tickAnim - 13) / 2) * (1.98-(2.41507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.26 + (((tickAnim - 0) / 8) * (0.25-(-0.26)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 5) * (-0.375-(0.25)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.375 + (((tickAnim - 13) / 2) * (-0.26-(-0.375)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.11 + (((tickAnim - 0) / 3) * (-12.18-(7.11)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -12.18 + (((tickAnim - 3) / 5) * (51.25-(-12.18)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 51.25 + (((tickAnim - 8) / 1) * (43.67-(51.25)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 43.67 + (((tickAnim - 9) / 4) * (16.75-(43.67)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 16.75 + (((tickAnim - 13) / 2) * (7.11-(16.75)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 8) * (0.275-(0.05)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 8) / 5) * (0-(0.275)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.05-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 17.58 + (((tickAnim - 0) / 6) * (-37.11889-(17.58)));
            yy = 0 + (((tickAnim - 0) / 6) * (4.02912-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (5.10334-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -37.11889 + (((tickAnim - 6) / 9) * (17.58-(-37.11889)));
            yy = 4.02912 + (((tickAnim - 6) / 9) * (0-(4.02912)));
            zz = 5.10334 + (((tickAnim - 6) / 9) * (0-(5.10334)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 24.33 + (((tickAnim - 0) / 2) * (-24.51-(24.33)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -24.51 + (((tickAnim - 2) / 2) * (-28.25539-(-24.51)));
            yy = 0 + (((tickAnim - 2) / 2) * (-4.61261-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (-1.44902-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -28.25539 + (((tickAnim - 4) / 2) * (15.08164-(-28.25539)));
            yy = -4.61261 + (((tickAnim - 4) / 2) * (-7.6878-(-4.61261)));
            zz = -1.44902 + (((tickAnim - 4) / 2) * (-2.41507-(-1.44902)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 15.08164 + (((tickAnim - 6) / 9) * (24.33-(15.08164)));
            yy = -7.6878 + (((tickAnim - 6) / 9) * (0-(-7.6878)));
            zz = -2.41507 + (((tickAnim - 6) / 9) * (0-(-2.41507)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 6) * (-0.375-(0.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = -0.375 + (((tickAnim - 6) / 9) * (0.25-(-0.375)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 51.25 + (((tickAnim - 0) / 2) * (43.67-(51.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 43.67 + (((tickAnim - 2) / 4) * (16.75-(43.67)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 16.75 + (((tickAnim - 6) / 5) * (-12.18-(16.75)));
            yy = 0 + (((tickAnim - 6) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 5) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -12.18 + (((tickAnim - 11) / 4) * (51.25-(-12.18)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 6) * (0-(0.275)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0.275-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (47.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 47.5 + (((tickAnim - 8) / 7) * (0-(47.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 0) / 8) * (27.5-(-30)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 27.5 + (((tickAnim - 8) / 3) * (18.61-(27.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 18.61 + (((tickAnim - 11) / 4) * (-30-(18.61)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0.07416-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.32069-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.21014-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0.07416 + (((tickAnim - 11) / 4) * (0-(0.07416)));
            yy = 0.32069 + (((tickAnim - 11) / 4) * (0-(0.32069)));
            zz = -0.21014 + (((tickAnim - 11) / 4) * (0-(-0.21014)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30 + (((tickAnim - 0) / 3) * (-8.61-(30)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.61 + (((tickAnim - 3) / 5) * (37.5-(-8.61)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 37.5 + (((tickAnim - 8) / 3) * (14.17-(37.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 14.17 + (((tickAnim - 11) / 2) * (1.17-(14.17)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.17 + (((tickAnim - 13) / 2) * (30-(1.17)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.00643-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.26905-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.22376-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.00643 + (((tickAnim - 11) / 2) * (-0.01125-(-0.00643)));
            yy = 0.26905 + (((tickAnim - 11) / 2) * (0.39509-(0.26905)));
            zz = -0.22376 + (((tickAnim - 11) / 2) * (-0.27224-(-0.22376)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.01125 + (((tickAnim - 13) / 2) * (0-(-0.01125)));
            yy = 0.39509 + (((tickAnim - 13) / 2) * (0-(0.39509)));
            zz = -0.27224 + (((tickAnim - 13) / 2) * (0-(-0.27224)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*10), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+10))*5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(6.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 47.5 + (((tickAnim - 0) / 8) * (0-(47.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (47.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (18.61-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 18.61 + (((tickAnim - 3) / 5) * (-30-(18.61)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 8) / 7) * (27.5-(-30)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -0.05 + (((tickAnim - 0) / 3) * (-0.07416-(-0.05)));
            yy = 0.22 + (((tickAnim - 0) / 3) * (0.32069-(0.22)));
            zz = -0.15 + (((tickAnim - 0) / 3) * (-0.21014-(-0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -0.07416 + (((tickAnim - 3) / 5) * (0-(-0.07416)));
            yy = 0.32069 + (((tickAnim - 3) / 5) * (0-(0.32069)));
            zz = -0.21014 + (((tickAnim - 3) / 5) * (0-(-0.21014)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-0.05-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.22-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (14.17-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 14.17 + (((tickAnim - 3) / 3) * (1.17-(14.17)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.17 + (((tickAnim - 6) / 2) * (30-(1.17)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 30 + (((tickAnim - 8) / 3) * (-8.61-(30)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -8.61 + (((tickAnim - 11) / 4) * (37.5-(-8.61)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.00643-(0)));
            yy = 0.19 + (((tickAnim - 0) / 3) * (0.26905-(0.19)));
            zz = -0.15 + (((tickAnim - 0) / 3) * (-0.22376-(-0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.00643 + (((tickAnim - 3) / 2) * (0.01125-(0.00643)));
            yy = 0.26905 + (((tickAnim - 3) / 2) * (0.39509-(0.26905)));
            zz = -0.22376 + (((tickAnim - 3) / 2) * (-0.27224-(-0.22376)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.01125 + (((tickAnim - 5) / 3) * (0-(0.01125)));
            yy = 0.39509 + (((tickAnim - 5) / 3) * (0-(0.39509)));
            zz = -0.27224 + (((tickAnim - 5) / 3) * (0-(-0.27224)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.19-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPaulchoffatia entity = (EntityPrehistoricFloraPaulchoffatia) entitylivingbaseIn;
        int animCycle = 5;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.5 + (((tickAnim - 0) / 3) * (14-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 14 + (((tickAnim - 3) / 0) * (27.5-(14)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.5 + (((tickAnim - 3) / 2) * (-2.5-(27.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 3) * (1.7-(1)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.7 + (((tickAnim - 3) / 0) * (1.15-(1.7)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.15 + (((tickAnim - 3) / 2) * (1-(1.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.25 + (((tickAnim - 0) / 1) * (-2.25-(4.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2.25 + (((tickAnim - 1) / 2) * (-11-(-2.25)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -11 + (((tickAnim - 3) / 0) * (-12.5-(-11)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -12.5 + (((tickAnim - 3) / 2) * (4.25-(-12.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 5.75 + (((tickAnim - 0) / 1) * (0-(5.75)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 5 + (((tickAnim - 3) / 0) * (5-(5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5 + (((tickAnim - 3) / 2) * (5.75-(5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 13 + (((tickAnim - 0) / 1) * (12-(13)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 1) / 2) * (13-(12)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 13 + (((tickAnim - 3) / 0) * (-13-(13)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -13 + (((tickAnim - 3) / 2) * (13-(-13)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -27.5 + (((tickAnim - 0) / 2) * (-26.5-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -26.5 + (((tickAnim - 2) / 1) * (-11.5-(-26.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -11.5 + (((tickAnim - 3) / 2) * (-27.5-(-11.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.51411 + (((tickAnim - 0) / 1) * (2.75706-(27.51411)));
            yy = -9.54456 + (((tickAnim - 0) / 1) * (-4.77228-(-9.54456)));
            zz = 17.65812 + (((tickAnim - 0) / 1) * (8.82906-(17.65812)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.75706 + (((tickAnim - 1) / 2) * (-48-(2.75706)));
            yy = -4.77228 + (((tickAnim - 1) / 2) * (0-(-4.77228)));
            zz = 8.82906 + (((tickAnim - 1) / 2) * (0-(8.82906)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -48 + (((tickAnim - 3) / 0) * (-46.24294-(-48)));
            yy = 0 + (((tickAnim - 3) / 0) * (-4.77228-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (8.82906-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.24294 + (((tickAnim - 3) / 2) * (27.51411-(-46.24294)));
            yy = -4.77228 + (((tickAnim - 3) / 2) * (-9.54456-(-4.77228)));
            zz = 8.82906 + (((tickAnim - 3) / 2) * (17.65812-(8.82906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -49 + (((tickAnim - 0) / 1) * (-53-(-49)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -53 + (((tickAnim - 1) / 2) * (15-(-53)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 3) / 0) * (27-(15)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 3) / 2) * (-49-(27)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 164 + (((tickAnim - 0) / 1) * (157.5-(164)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 157.5 + (((tickAnim - 1) / 2) * (23-(157.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 3) / 0) * (-0.5-(23)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (164-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 27.51411 + (((tickAnim - 0) / 1) * (2.75706-(27.51411)));
            yy = 9.54456 + (((tickAnim - 0) / 1) * (4.77228-(9.54456)));
            zz = -17.65812 + (((tickAnim - 0) / 1) * (-8.82906-(-17.65812)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 2.75706 + (((tickAnim - 1) / 2) * (-48-(2.75706)));
            yy = 4.77228 + (((tickAnim - 1) / 2) * (0-(4.77228)));
            zz = -8.82906 + (((tickAnim - 1) / 2) * (0-(-8.82906)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -48 + (((tickAnim - 3) / 0) * (-46.24294-(-48)));
            yy = 0 + (((tickAnim - 3) / 0) * (4.77228-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-8.82906-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -46.24294 + (((tickAnim - 3) / 2) * (27.51411-(-46.24294)));
            yy = 4.77228 + (((tickAnim - 3) / 2) * (9.54456-(4.77228)));
            zz = -8.82906 + (((tickAnim - 3) / 2) * (-17.65812-(-8.82906)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -49 + (((tickAnim - 0) / 1) * (-53-(-49)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -53 + (((tickAnim - 1) / 2) * (15-(-53)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 15 + (((tickAnim - 3) / 0) * (27-(15)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27 + (((tickAnim - 3) / 2) * (-49-(27)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 164 + (((tickAnim - 0) / 1) * (157.5-(164)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 157.5 + (((tickAnim - 1) / 2) * (23-(157.5)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 3) / 0) * (-0.5-(23)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -0.5 + (((tickAnim - 3) / 2) * (164-(-0.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (10-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (49.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 49.5 + (((tickAnim - 2) / 1) * (57-(49.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 57 + (((tickAnim - 3) / 0) * (20.5-(57)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 3) / 2) * (6-(20.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25 + (((tickAnim - 0) / 1) * (-34-(-25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -34 + (((tickAnim - 1) / 1) * (-20-(-34)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-10-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-22.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-25-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 26 + (((tickAnim - 0) / 1) * (24-(26)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 1) / 1) * (2-(24)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 2) / 1) * (74-(2)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 74 + (((tickAnim - 3) / 0) * (-15-(74)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (26-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (10-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 10 + (((tickAnim - 1) / 1) * (49.5-(10)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 49.5 + (((tickAnim - 2) / 1) * (57-(49.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 57 + (((tickAnim - 3) / 0) * (20.5-(57)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 20.5 + (((tickAnim - 3) / 2) * (6-(20.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -25 + (((tickAnim - 0) / 1) * (-34-(-25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -34 + (((tickAnim - 1) / 1) * (-20-(-34)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -20 + (((tickAnim - 2) / 1) * (-10-(-20)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 3) / 0) * (-22.5-(-10)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.5 + (((tickAnim - 3) / 2) * (-25-(-22.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 26 + (((tickAnim - 0) / 1) * (24-(26)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 24 + (((tickAnim - 1) / 1) * (2-(24)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2 + (((tickAnim - 2) / 1) * (74-(2)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 74 + (((tickAnim - 3) / 0) * (-15-(74)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -15 + (((tickAnim - 3) / 2) * (26-(-15)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25))*10), tail1.rotateAngleY + (float) Math.toRadians(0), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-30))*15), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-16-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.25-60))*15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPaulchoffatia e = (EntityPrehistoricFloraPaulchoffatia) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
