package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKuehneosuchus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelKuehneosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer rightWing;
    private final AdvancedModelRenderer rightWing2;
    private final AdvancedModelRenderer rightWing3;
    private final AdvancedModelRenderer rightWing4;
    private final AdvancedModelRenderer rightWing5;
    private final AdvancedModelRenderer leftWing;
    private final AdvancedModelRenderer leftWing2;
    private final AdvancedModelRenderer leftWing3;
    private final AdvancedModelRenderer leftWing4;
    private final AdvancedModelRenderer leftWing5;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neckpouch;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;

    private ModelAnimator animator;

    public ModelKuehneosuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 22.6393F, 0.8683F);
        this.setRotateAngle(root, -0.0873F, 0.0F, 0.0F);
        this.root.cubeList.add(new ModelBox(root, 0, 22, -1.5F, -1.7059F, 0.5127F, 3, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.9941F, -2.4873F);
        this.root.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 22, -1.5F, -0.4F, 3.0F, 3, 1, 4, -0.01F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-0.6F, 0.3138F, 2.3658F);
        this.root.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0534F, 0.8671F, -0.0814F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 36, 14, -4.25F, -1.0F, -1.0F, 5, 1, 2, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.8455F, -0.0127F, -0.3606F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.0029F, 0.7449F, -0.0438F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.125F, 0.0F, 0.375F);
        this.rightLeg2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0349F, 0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 18, -3.7543F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-3.5133F, 0.0625F, 0.7052F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1126F, -0.7055F, 0.2919F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.475F, 0.0F, 0.475F);
        this.rightFoot.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0218F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 9, -4.2038F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(0.6F, 0.3138F, 2.3658F);
        this.root.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0534F, -0.8671F, 0.0814F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 36, 14, -0.75F, -1.0F, -1.0F, 5, 1, 2, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.8455F, -0.0127F, -0.3606F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.0029F, -0.7449F, 0.0438F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.125F, 0.0F, 0.375F);
        this.leftLeg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0349F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 18, -0.2457F, -0.9755F, -0.7528F, 4, 1, 1, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(3.5133F, 0.0625F, 0.7052F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1126F, 0.7055F, -0.2919F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.475F, 0.0F, 0.475F);
        this.leftFoot.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 19, 9, -0.7962F, -0.097F, -1.8835F, 5, 0, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.6059F, 4.5127F);
        this.root.addChild(tail);
        this.setRotateAngle(tail, -0.0611F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 26, 35, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0946F, 2.9766F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0087F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 28, -0.25F, -0.25F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 14, -0.75F, -0.2491F, -0.525F, 1, 1, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 28, -0.775F, -0.75F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 29, -0.25F, -0.75F, -0.5F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.0214F, -0.1626F, 4.2913F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0829F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 36, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0349F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 29, 0, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0218F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 30, 21, -0.4786F, -0.5F, 0.0F, 1, 1, 5, 0.01F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0087F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 42, 0, -0.4786F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.6059F, 0.2627F);
        this.root.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 9, -1.5F, -0.1147F, -5.376F, 3, 3, 6, 0.01F, false));

        this.rightWing = new AdvancedModelRenderer(this);
        this.rightWing.setRotationPoint(-1.3049F, 0.8853F, -6.7471F);
        this.body.addChild(rightWing);
        this.setRotateAngle(rightWing, 0.0F, 1.352F, 0.0F);
        this.rightWing.cubeList.add(new ModelBox(rightWing, 0, 0, -11.9041F, 0.0F, 0.0645F, 12, 0, 2, 0.0F, true));

        this.rightWing2 = new AdvancedModelRenderer(this);
        this.rightWing2.setRotationPoint(0.0709F, 0.1F, 2.0895F);
        this.rightWing.addChild(rightWing2);
        this.setRotateAngle(rightWing2, 3.1067F, 0.0115F, 0.0F);
        this.rightWing2.cubeList.add(new ModelBox(rightWing2, 0, 3, -11.9337F, -0.075F, -0.2532F, 12, 0, 2, 0.0F, true));

        this.rightWing3 = new AdvancedModelRenderer(this);
        this.rightWing3.setRotationPoint(-5.1837F, -0.025F, 1.7217F);
        this.rightWing2.addChild(rightWing3);
        this.setRotateAngle(rightWing3, 3.1372F, 0.0081F, 0.0F);
        this.rightWing3.cubeList.add(new ModelBox(rightWing3, 0, 6, -6.0698F, 0.0F, -0.2503F, 11, 0, 2, 0.0F, true));

        this.rightWing4 = new AdvancedModelRenderer(this);
        this.rightWing4.setRotationPoint(0.7302F, -0.025F, 1.6497F);
        this.rightWing3.addChild(rightWing4);
        this.setRotateAngle(rightWing4, -3.098F, 0.0124F, 0.0F);
        this.rightWing4.cubeList.add(new ModelBox(rightWing4, 0, 19, -4.7719F, 0.05F, -0.0107F, 9, 0, 2, 0.0F, true));

        this.rightWing5 = new AdvancedModelRenderer(this);
        this.rightWing5.setRotationPoint(1.0587F, 0.0866F, 1.9031F);
        this.rightWing4.addChild(rightWing5);
        this.setRotateAngle(rightWing5, 3.0543F, -0.0007F, 0.0F);
        this.rightWing5.cubeList.add(new ModelBox(rightWing5, 27, 7, -3.8147F, -0.0116F, 0.0384F, 7, 0, 1, 0.0F, true));

        this.leftWing = new AdvancedModelRenderer(this);
        this.leftWing.setRotationPoint(1.3049F, 0.8853F, -6.7471F);
        this.body.addChild(leftWing);
        this.setRotateAngle(leftWing, 0.0F, -1.352F, 0.0F);
        this.leftWing.cubeList.add(new ModelBox(leftWing, 0, 0, -0.0959F, 0.0F, 0.0645F, 12, 0, 2, 0.0F, false));

        this.leftWing2 = new AdvancedModelRenderer(this);
        this.leftWing2.setRotationPoint(-0.0709F, 0.1F, 2.0895F);
        this.leftWing.addChild(leftWing2);
        this.setRotateAngle(leftWing2, 3.1067F, -0.0115F, 0.0F);
        this.leftWing2.cubeList.add(new ModelBox(leftWing2, 0, 3, -0.0663F, -0.075F, -0.2532F, 12, 0, 2, 0.0F, false));

        this.leftWing3 = new AdvancedModelRenderer(this);
        this.leftWing3.setRotationPoint(5.1837F, -0.025F, 1.7217F);
        this.leftWing2.addChild(leftWing3);
        this.setRotateAngle(leftWing3, 3.1372F, -0.0081F, 0.0F);
        this.leftWing3.cubeList.add(new ModelBox(leftWing3, 0, 6, -4.9302F, 0.0F, -0.2503F, 11, 0, 2, 0.0F, false));

        this.leftWing4 = new AdvancedModelRenderer(this);
        this.leftWing4.setRotationPoint(-0.7302F, -0.025F, 1.6497F);
        this.leftWing3.addChild(leftWing4);
        this.setRotateAngle(leftWing4, -3.098F, -0.0124F, 0.0F);
        this.leftWing4.cubeList.add(new ModelBox(leftWing4, 0, 19, -4.2281F, 0.05F, -0.0107F, 9, 0, 2, 0.0F, false));

        this.leftWing5 = new AdvancedModelRenderer(this);
        this.leftWing5.setRotationPoint(-1.0587F, 0.0866F, 1.9031F);
        this.leftWing4.addChild(leftWing5);
        this.setRotateAngle(leftWing5, 3.0543F, 0.0007F, 0.0F);
        this.leftWing5.cubeList.add(new ModelBox(leftWing5, 27, 7, -3.1853F, -0.0116F, 0.0384F, 7, 0, 1, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 1.3854F, -4.876F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 13, 35, -1.5F, -1.5F, -3.0F, 3, 3, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.3721F, -2.7236F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1365F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(11.0F, 1.7866F, -2.2751F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1222F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 28, -12.0F, -2.0737F, -0.351F, 2, 2, 3, -0.003F, false));

        this.neckpouch = new AdvancedModelRenderer(this);
        this.neckpouch.setRotationPoint(0.0F, 1.8726F, -1.1029F);
        this.neck.addChild(neckpouch);
        this.setRotateAngle(neckpouch, -0.1745F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, 0.3436F, -1.5482F);
        this.neckpouch.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1527F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 42, 0.0F, -1.0751F, -0.0221F, 1, 1, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.9764F, -2.0261F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 39, 35, -0.5F, -0.4F, -3.6F, 1, 1, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.7406F, -0.6172F, -2.5744F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3052F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 42, 0.0F, 0.2304F, -0.9996F, 1, 1, 3, 0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, -0.729F, 0.2706F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.3488F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 31, 45, 0.0F, 0.3304F, -0.9996F, 1, 1, 1, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.7406F, -0.6172F, -2.5744F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3052F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 42, -1.0F, 0.2304F, -0.9996F, 1, 1, 3, 0.003F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -0.729F, 0.2706F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.3488F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 31, 45, -1.0F, 0.3304F, -0.9996F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7093F, -1.229F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0393F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 42, -1.0F, -0.575F, 0.175F, 2, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -1.2038F, -1.7733F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 47, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.8618F, -2.713F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 47, 18, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -0.4F, -3.6F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.48F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 47, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.6336F, 0.1944F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 39, 41, -0.5F, -0.5F, -3.775F, 1, 1, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.3416F, 0.4928F, -0.8882F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0048F, 0.3488F, 0.0139F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 9, 47, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-1.3417F, 0.5046F, -0.8858F);
        this.jaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0096F, -0.305F, 0.032F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 43, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(1.3417F, 0.5046F, -0.8858F);
        this.jaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0096F, 0.305F, -0.032F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 43, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.3416F, 0.4928F, -0.8882F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0048F, -0.3488F, -0.0139F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 9, 47, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.003F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.75F, -0.7813F, -1.3069F);
        this.head.addChild(eyeleft);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0412F, 0.3052F, 0.0124F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 47, -0.55F, -0.25F, -0.8F, 1, 1, 1, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.75F, -0.7813F, -1.3069F);
        this.head.addChild(eyeright);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.eyeright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0412F, -0.3052F, -0.0124F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 24, 47, -0.45F, -0.25F, -0.8F, 1, 1, 1, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(1.1795F, 0.1974F, -1.6188F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.056F, -0.2331F, 0.256F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 43, 21, -0.2444F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, false));
        this.leftArm.cubeList.add(new ModelBox(leftArm, 44, 6, -0.2444F, -0.606F, -0.3888F, 3, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(2.3731F, -0.0506F, 0.2144F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 0.9498F, 1.3824F, 0.9653F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 43, 24, -0.25F, -0.5F, -0.5F, 3, 1, 1, -0.01F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(2.738F, 0.1784F, -0.0186F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2763F, 0.4223F, -0.0866F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 38, 9, -1.0483F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-1.1795F, 0.1974F, -1.6188F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.056F, 0.2331F, -0.256F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 43, 21, -2.7556F, -0.606F, -0.7888F, 3, 1, 1, 0.01F, true));
        this.rightArm.cubeList.add(new ModelBox(rightArm, 44, 6, -2.7556F, -0.606F, -0.3888F, 3, 1, 1, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-2.3731F, -0.0506F, 0.2144F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 0.9498F, -1.3824F, -0.9653F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 43, 24, -2.75F, -0.5F, -0.5F, 3, 1, 1, -0.01F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-2.738F, 0.1784F, -0.0186F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2763F, -0.4223F, 0.0866F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 38, 9, -1.9517F, 0.0496F, -1.4917F, 3, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    public void renderStaticWall(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.30F;
        this.root.offsetX = -0.05F;
        this.root.rotateAngleY = (float)Math.toRadians(210);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 2.9F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraKuehneosuchus ee = (EntityPrehistoricFloraKuehneosuchus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
            this.chainSwing(Tail, 0.2F, -0.1F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKuehneosuchus ee = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (ee.getHeadCollided()) {
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
                else {
                    //Just pose with no animation running:
                    animClimbing(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                }
            }
            else if (ee.getIsMoving()) {
                if (!ee.getIsFlying()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
                else {
                    //Is gliding:
                    animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }
            }
        }
        else {
            animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKuehneosuchus entity = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -13.5 + (((tickAnim - 2) / 1) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.5 + (((tickAnim - 3) / 3) * (-20.75-(-13.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -20.75 + (((tickAnim - 6) / 2) * (4.38328-(-20.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (-7.98578-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.47827-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.38328 + (((tickAnim - 8) / 2) * (-3-(4.38328)));
            yy = -7.98578 + (((tickAnim - 8) / 2) * (0-(-7.98578)));
            zz = 0.47827 + (((tickAnim - 8) / 2) * (0-(0.47827)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 10) / 3) * (-19.5-(-3)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -19.5 + (((tickAnim - 13) / 1) * (-12.5-(-19.5)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 14) / 4) * (-18.75-(-12.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.75 + (((tickAnim - 18) / 2) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.4 + (((tickAnim - 2) / 1) * (0.4-(0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0.4 + (((tickAnim - 3) / 7) * (0-(0.4)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.75-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0.75 + (((tickAnim - 13) / 7) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -17.25 + (((tickAnim - 6) / 4) * (0-(-17.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (4.5-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 4.5 + (((tickAnim - 13) / 5) * (10.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.5 + (((tickAnim - 18) / 2) * (0-(10.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neckpouch, neckpouch.rotateAngleX + (float) Math.toRadians(xx), neckpouch.rotateAngleY + (float) Math.toRadians(yy), neckpouch.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.42-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.42 + (((tickAnim - 6) / 7) * (0.15-(0.42)));
            zz = 1.35 + (((tickAnim - 6) / 7) * (0-(1.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.15 + (((tickAnim - 13) / 5) * (0.05-(0.15)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.525-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 18) / 2) * (0-(0.05)));
            zz = 0.525 + (((tickAnim - 18) / 2) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neckpouch.rotationPointX = this.neckpouch.rotationPointX + (float)(xx);
        this.neckpouch.rotationPointY = this.neckpouch.rotationPointY - (float)(yy);
        this.neckpouch.rotationPointZ = this.neckpouch.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 32.75 + (((tickAnim - 2) / 1) * (32.75-(32.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 32.75 + (((tickAnim - 3) / 3) * (57-(32.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 57 + (((tickAnim - 6) / 2) * (5.02508-(57)));
            yy = 0 + (((tickAnim - 6) / 2) * (12.71646-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0.46713-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.02508 + (((tickAnim - 8) / 2) * (-30.95015-(5.02508)));
            yy = 12.71646 + (((tickAnim - 8) / 2) * (-1.11244-(12.71646)));
            zz = 0.46713 + (((tickAnim - 8) / 2) * (-5.13111-(0.46713)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -30.95015 + (((tickAnim - 10) / 2) * (-18.70015-(-30.95015)));
            yy = -1.11244 + (((tickAnim - 10) / 2) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 10) / 2) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -18.70015 + (((tickAnim - 12) / 1) * (-21.03349-(-18.70015)));
            yy = -1.11244 + (((tickAnim - 12) / 1) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 12) / 1) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.03349 + (((tickAnim - 13) / 1) * (23.79985-(-21.03349)));
            yy = -1.11244 + (((tickAnim - 13) / 1) * (-1.11244-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 13) / 1) * (-5.13111-(-5.13111)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 23.79985 + (((tickAnim - 14) / 3) * (-14.49503-(23.79985)));
            yy = -1.11244 + (((tickAnim - 14) / 3) * (-2.04045-(-1.11244)));
            zz = -5.13111 + (((tickAnim - 14) / 3) * (-12.57638-(-5.13111)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -14.49503 + (((tickAnim - 17) / 3) * (0-(-14.49503)));
            yy = -2.04045 + (((tickAnim - 17) / 3) * (0-(-2.04045)));
            zz = -12.57638 + (((tickAnim - 17) / 3) * (0-(-12.57638)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.25 + (((tickAnim - 2) / 1) * (0.25-(0.25)));
            zz = 0.475 + (((tickAnim - 2) / 1) * (0.475-(0.475)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 3) / 3) * (0.8-(0.25)));
            zz = 0.475 + (((tickAnim - 3) / 3) * (0.855-(0.475)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 6) / 4) * (0-(0.8)));
            zz = 0.855 + (((tickAnim - 6) / 4) * (0-(0.855)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 6) / 2) * (0-(20)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (31.75-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 31.75 + (((tickAnim - 10) / 2) * (0-(31.75)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (24.5-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 24.5 + (((tickAnim - 17) / 3) * (0-(24.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuehneosuchus entity = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;
        int animCycle = 170;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5))*3 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 0.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5 + (((tickAnim - 20) / 25) * (1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2-(0.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5)));
            yy = 0 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*3 + (((tickAnim - 20) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-50))*3)));
        }
        else if (tickAnim >= 45 && tickAnim < 169) {
            xx = 1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2 + (((tickAnim - 45) / 124) * (0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2-(1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2 + (((tickAnim - 45) / 124) * (-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5 + (((tickAnim - 45) / 124) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5)));
        }
        else if (tickAnim >= 169 && tickAnim < 170) {
            xx = 0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2 + (((tickAnim - 169) / 1) * (0-(0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-80))*0.2)));
            yy = -1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2 + (((tickAnim - 169) / 1) * (0-(-1.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-300))*2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5 + (((tickAnim - 169) / 1) * (2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5-300))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 0) / 93) * (-0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-80))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 93) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 93) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 140) {
            xx = -0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-80))*1 + (((tickAnim - 93) / 47) * (0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-1-(-0.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-80))*1)));
            yy = 0 + (((tickAnim - 93) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 47) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 170) {
            xx = 0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-1 + (((tickAnim - 140) / 30) * (0-(0.425-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40-80))*-1)));
            yy = 0 + (((tickAnim - 140) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 82.97871 + (((tickAnim - 0) / 170) * (82.97871-(82.97871)));
            yy = 7.96837 + (((tickAnim - 0) / 170) * (7.96837-(7.96837)));
            zz = 2.63338 + (((tickAnim - 0) / 170) * (2.63338-(2.63338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -1.54336 + (((tickAnim - 0) / 170) * (-1.54336-(-1.54336)));
            yy = -49.01596 + (((tickAnim - 0) / 170) * (-49.01596-(-49.01596)));
            zz = -16.22714 + (((tickAnim - 0) / 170) * (-16.22714-(-16.22714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 47.25 + (((tickAnim - 0) / 170) * (47.25-(47.25)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3 + (((tickAnim - 0) / 20) * (3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3)));
            yy = -9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*9 + (((tickAnim - 0) / 20) * (-9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-9-(-9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*9)));
            zz = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-5 + (((tickAnim - 0) / 20) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3 + (((tickAnim - 20) / 25) * (11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3)));
            yy = -9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-9 + (((tickAnim - 20) / 25) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2-(-9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-9)));
            zz = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5 + (((tickAnim - 20) / 25) * (0-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*5)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = 11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1 + (((tickAnim - 45) / 120) * (4.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1-(11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2 + (((tickAnim - 45) / 120) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = 4.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1 + (((tickAnim - 165) / 5) * (2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-3-(4.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150/0.5-80))*-1)));
            yy = -Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2 + (((tickAnim - 165) / 5) * (-4.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*9-(-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-250))*-2)));
            zz = 0 + (((tickAnim - 165) / 5) * (-2.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-80))*-5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-100))*-6 + (((tickAnim - 0) / 20) * (6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-100))*-10-(6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-100))*-6)));
            yy = 2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5 + (((tickAnim - 0) / 20) * (2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*8-(2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-100))*-10 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1-(6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-100))*-10)));
            yy = 2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*8 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2-(2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*8)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1 + (((tickAnim - 165) / 5) * (5.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*-6-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-100))*-1)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2 + (((tickAnim - 165) / 5) * (-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-200))*-2)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-9 + (((tickAnim - 0) / 20) * (8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-15-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-9)));
            yy = -2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*-5 + (((tickAnim - 0) / 20) * (2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*5-(-2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*-5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-15 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-15)));
            yy = 2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*5 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2-(2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*5)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2 + (((tickAnim - 165) / 5) * (-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-120))*-2)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2 + (((tickAnim - 165) / 5) * (-3.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-150))*-2)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-10 + (((tickAnim - 0) / 20) * (8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-20-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-10)));
            yy = -5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5 + (((tickAnim - 0) / 20) * (-2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9-(-5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-20 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-20)));
            yy = -2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2-(-2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3 + (((tickAnim - 165) / 5) * (-3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-130))*-3)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2 + (((tickAnim - 165) / 5) * (-3.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-100))*2)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15 + (((tickAnim - 0) / 20) * (9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15-(9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15)));
            yy = -5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5 + (((tickAnim - 0) / 20) * (10-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9-(-5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4-(9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15)));
            yy = 10-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2-(10-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9)));
            zz = 0 + (((tickAnim - 20) / 25) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4 + (((tickAnim - 165) / 5) * (-8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-15-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-140))*-4)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2 + (((tickAnim - 165) / 5) * (-5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-180))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-50))*2)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18 + (((tickAnim - 0) / 22) * (9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18-(9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18)));
            yy = -5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5 + (((tickAnim - 0) / 22) * (3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9-(-5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*-5)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 45) {
            xx = 9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18 + (((tickAnim - 22) / 23) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5-(9-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18)));
            yy = 3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9 + (((tickAnim - 22) / 23) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2-(3-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-250))*9)));
            zz = 0 + (((tickAnim - 22) / 23) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 165) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2 + (((tickAnim - 45) / 120) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2)));
            zz = 0 + (((tickAnim - 45) / 120) * (0-(0)));
        }
        else if (tickAnim >= 165 && tickAnim < 170) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5 + (((tickAnim - 165) / 5) * (-11.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-18-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-150))*-5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2 + (((tickAnim - 165) / 5) * (-5.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-200))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5))*2)));
            zz = 0 + (((tickAnim - 165) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3 + (((tickAnim - 0) / 20) * (4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-190))*-3-(2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = -4.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4 + (((tickAnim - 20) / 25) * (-0.65-(-4.825-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4)));
            yy = 0 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(0)));
            zz = 4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-190))*-3 + (((tickAnim - 20) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1-(4.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*200/0.5-190))*-3)));
        }
        else if (tickAnim >= 45 && tickAnim < 169) {
            xx = -0.65 + (((tickAnim - 45) / 124) * (-0.65-(-0.65)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 45) / 124) * (1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1 + (((tickAnim - 45) / 124) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1)));
        }
        else if (tickAnim >= 169 && tickAnim < 170) {
            xx = -0.65 + (((tickAnim - 169) / 1) * (0-(-0.65)));
            yy = 1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 169) / 1) * (0-(1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1 + (((tickAnim - 169) / 1) * (2.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 1.5 + (((tickAnim - 0) / 170) * (1.5-(1.5)));
            yy = -77.75 + (((tickAnim - 0) / 170) * (-77.75-(-77.75)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing, rightWing.rotateAngleX + (float) Math.toRadians(xx), rightWing.rotateAngleY + (float) Math.toRadians(yy), rightWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 180 + (((tickAnim - 0) / 170) * (180-(180)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing2, rightWing2.rotateAngleX + (float) Math.toRadians(xx), rightWing2.rotateAngleY + (float) Math.toRadians(yy), rightWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing2.rotationPointX = this.rightWing2.rotationPointX + (float)(xx);
        this.rightWing2.rotationPointY = this.rightWing2.rotationPointY - (float)(yy);
        this.rightWing2.rotationPointZ = this.rightWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -181.25399 + (((tickAnim - 0) / 170) * (-181.25399-(-181.25399)));
            yy = -0.00874 + (((tickAnim - 0) / 170) * (-0.00874-(-0.00874)));
            zz = 0.49994 + (((tickAnim - 0) / 170) * (0.49994-(0.49994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing3, rightWing3.rotateAngleX + (float) Math.toRadians(xx), rightWing3.rotateAngleY + (float) Math.toRadians(yy), rightWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 170) * (0.05-(0.05)));
            zz = 0.25 + (((tickAnim - 0) / 170) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing3.rotationPointX = this.rightWing3.rotationPointX + (float)(xx);
        this.rightWing3.rotationPointY = this.rightWing3.rotationPointY - (float)(yy);
        this.rightWing3.rotationPointZ = this.rightWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 177 + (((tickAnim - 0) / 170) * (177-(177)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing4, rightWing4.rotateAngleX + (float) Math.toRadians(xx), rightWing4.rotateAngleY + (float) Math.toRadians(yy), rightWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing4.rotationPointX = this.rightWing4.rotationPointX + (float)(xx);
        this.rightWing4.rotationPointY = this.rightWing4.rotationPointY - (float)(yy);
        this.rightWing4.rotationPointZ = this.rightWing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -173 + (((tickAnim - 0) / 170) * (-173-(-173)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightWing5, rightWing5.rotateAngleX + (float) Math.toRadians(xx), rightWing5.rotateAngleY + (float) Math.toRadians(yy), rightWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0.025 + (((tickAnim - 0) / 170) * (0.025-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightWing5.rotationPointX = this.rightWing5.rotationPointX + (float)(xx);
        this.rightWing5.rotationPointY = this.rightWing5.rotationPointY - (float)(yy);
        this.rightWing5.rotationPointZ = this.rightWing5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3 + (((tickAnim - 0) / 20) * (-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3-(2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4 + (((tickAnim - 20) / 25) * (-0.65-(6.125-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-220))*4)));
            yy = 0 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(0)));
            zz = -2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3 + (((tickAnim - 20) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1-(-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3)));
        }
        else if (tickAnim >= 45 && tickAnim < 169) {
            xx = -0.65 + (((tickAnim - 45) / 124) * (0-(-0.65)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 45) / 124) * (1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1 + (((tickAnim - 45) / 124) * (-1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1)));
        }
        else if (tickAnim >= 169 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 169) / 1) * (0-(0)));
            yy = 1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 169) / 1) * (0-(1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = -1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1 + (((tickAnim - 169) / 1) * (2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3-(-1.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 12 + (((tickAnim - 0) / 20) * (17.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-190))*-5-(12)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3 + (((tickAnim - 0) / 20) * (-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3-(2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 45) {
            xx = 17.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-190))*-5 + (((tickAnim - 20) / 25) * (12-(17.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-190))*-5)));
            yy = 0 + (((tickAnim - 20) / 25) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(0)));
            zz = -2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3 + (((tickAnim - 20) / 25) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1-(-2.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*3)));
        }
        else if (tickAnim >= 45 && tickAnim < 169) {
            xx = 12 + (((tickAnim - 45) / 124) * (12-(12)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 45) / 124) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1 + (((tickAnim - 45) / 124) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1)));
        }
        else if (tickAnim >= 169 && tickAnim < 170) {
            xx = 12 + (((tickAnim - 169) / 1) * (12-(12)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1 + (((tickAnim - 169) / 1) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*100/0.5-350))*-1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1 + (((tickAnim - 169) / 1) * (2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250/0.5-50))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*300/0.5-190))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -12 + (((tickAnim - 0) / 170) * (-12-(-12)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 88.10926 + (((tickAnim - 0) / 170) * (88.10926-(88.10926)));
            yy = 11.14353 + (((tickAnim - 0) / 170) * (11.14353-(11.14353)));
            zz = -22.96583 + (((tickAnim - 0) / 170) * (-22.96583-(-22.96583)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -55.84919 + (((tickAnim - 0) / 170) * (-55.84919-(-55.84919)));
            yy = -67.61638 + (((tickAnim - 0) / 170) * (-67.61638-(-67.61638)));
            zz = -67.21205 + (((tickAnim - 0) / 170) * (-67.21205-(-67.21205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = -0.225 + (((tickAnim - 0) / 170) * (-0.225-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -0.35698 + (((tickAnim - 0) / 170) * (-0.35698-(-0.35698)));
            yy = -15.8707 + (((tickAnim - 0) / 170) * (-15.8707-(-15.8707)));
            zz = 16.51564 + (((tickAnim - 0) / 170) * (16.51564-(16.51564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 88.10926 + (((tickAnim - 0) / 170) * (88.10926-(88.10926)));
            yy = -11.14353 + (((tickAnim - 0) / 170) * (-11.14353-(-11.14353)));
            zz = 22.96583 + (((tickAnim - 0) / 170) * (22.96583-(22.96583)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -55.84919 + (((tickAnim - 0) / 170) * (-55.84919-(-55.84919)));
            yy = 67.61638 + (((tickAnim - 0) / 170) * (67.61638-(67.61638)));
            zz = 67.21205 + (((tickAnim - 0) / 170) * (67.21205-(67.21205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = -0.225 + (((tickAnim - 0) / 170) * (-0.225-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -0.35698 + (((tickAnim - 0) / 170) * (-0.35698-(-0.35698)));
            yy = 15.8707 + (((tickAnim - 0) / 170) * (15.8707-(15.8707)));
            zz = -16.51564 + (((tickAnim - 0) / 170) * (-16.51564-(-16.51564)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 82.97871 + (((tickAnim - 0) / 170) * (82.97871-(82.97871)));
            yy = -7.96837 + (((tickAnim - 0) / 170) * (-7.96837-(-7.96837)));
            zz = -2.63338 + (((tickAnim - 0) / 170) * (-2.63338-(-2.63338)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -1.54336 + (((tickAnim - 0) / 170) * (-1.54336-(-1.54336)));
            yy = 49.01596 + (((tickAnim - 0) / 170) * (49.01596-(49.01596)));
            zz = 16.22714 + (((tickAnim - 0) / 170) * (16.22714-(16.22714)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = -47.25 + (((tickAnim - 0) / 170) * (-47.25-(-47.25)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 1.5 + (((tickAnim - 0) / 170) * (1.5-(1.5)));
            yy = 77.75 + (((tickAnim - 0) / 170) * (77.75-(77.75)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing, leftWing.rotateAngleX + (float) Math.toRadians(xx), leftWing.rotateAngleY + (float) Math.toRadians(yy), leftWing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 180 + (((tickAnim - 0) / 170) * (180-(180)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing2, leftWing2.rotateAngleX + (float) Math.toRadians(xx), leftWing2.rotateAngleY + (float) Math.toRadians(yy), leftWing2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing2.rotationPointX = this.leftWing2.rotationPointX + (float)(xx);
        this.leftWing2.rotationPointY = this.leftWing2.rotationPointY - (float)(yy);
        this.leftWing2.rotationPointZ = this.leftWing2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 181.25399 + (((tickAnim - 0) / 170) * (181.25399-(181.25399)));
            yy = 0.00874 + (((tickAnim - 0) / 170) * (0.00874-(0.00874)));
            zz = -0.49994 + (((tickAnim - 0) / 170) * (-0.49994-(-0.49994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing3, leftWing3.rotateAngleX + (float) Math.toRadians(xx), leftWing3.rotateAngleY + (float) Math.toRadians(yy), leftWing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0.05 + (((tickAnim - 0) / 170) * (0.05-(0.05)));
            zz = 0.25 + (((tickAnim - 0) / 170) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing3.rotationPointX = this.leftWing3.rotationPointX + (float)(xx);
        this.leftWing3.rotationPointY = this.leftWing3.rotationPointY - (float)(yy);
        this.leftWing3.rotationPointZ = this.leftWing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 177 + (((tickAnim - 0) / 170) * (177-(177)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing4, leftWing4.rotateAngleX + (float) Math.toRadians(xx), leftWing4.rotateAngleY + (float) Math.toRadians(yy), leftWing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing4.rotationPointX = this.leftWing4.rotationPointX + (float)(xx);
        this.leftWing4.rotationPointY = this.leftWing4.rotationPointY - (float)(yy);
        this.leftWing4.rotationPointZ = this.leftWing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 170) {
            xx = -173 + (((tickAnim - 0) / 170) * (-173-(-173)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 170) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftWing5, leftWing5.rotateAngleX + (float) Math.toRadians(xx), leftWing5.rotateAngleY + (float) Math.toRadians(yy), leftWing5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 170) {
            xx = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 170) * (0-(0)));
            zz = 0.025 + (((tickAnim - 0) / 170) * (0.025-(0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftWing5.rotationPointX = this.leftWing5.rotationPointX + (float)(xx);
        this.leftWing5.rotationPointY = this.leftWing5.rotationPointY - (float)(yy);
        this.leftWing5.rotationPointZ = this.leftWing5.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuehneosuchus entity = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-4), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*-17), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-8));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*1);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*-0.5);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-0.5);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.6533 + (((tickAnim - 0) / 3) * (6.67223-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 3) * (-29.0609-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 3) * (8.10828-(0.18491)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.67223 + (((tickAnim - 3) / 2) * (0-(6.67223)));
            yy = -29.0609 + (((tickAnim - 3) / 2) * (0.475-(-29.0609)));
            zz = 8.10828 + (((tickAnim - 3) / 2) * (0-(8.10828)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 5) / 3) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 5) / 3) * (11.03701-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.69903 + (((tickAnim - 8) / 2) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 8) / 2) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 8) / 2) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 4.71839 + (((tickAnim - 0) / 3) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 3) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 3) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 5.5328 + (((tickAnim - 3) / 2) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 3) / 2) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 3) / 2) * (0-(4.44427)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 27.23355 + (((tickAnim - 7) / 3) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 7) / 3) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 7) / 3) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-3.80899-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (-16.38638-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (4.54136-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -3.80899 + (((tickAnim - 1) / 2) * (0-(-3.80899)));
            yy = -16.38638 + (((tickAnim - 1) / 2) * (-50.25-(-16.38638)));
            zz = 4.54136 + (((tickAnim - 1) / 2) * (0-(4.54136)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -50.25 + (((tickAnim - 3) / 2) * (0-(-50.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 30.11605 + (((tickAnim - 7) / 3) * (0-(30.11605)));
            yy = 13.56425 + (((tickAnim - 7) / 3) * (0-(13.56425)));
            zz = -10.87267 + (((tickAnim - 7) / 3) * (0-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (0.25-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 5) * (0-(0.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(5.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-50))*4), tail.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*15), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(4.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-100))*4), tail2.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+80))*18), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-7.0828-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*1), tail3.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*-21.0542), tail3.rotateAngleZ + (float) Math.toRadians(2.91129));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*2), tail4.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*-23), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*3), tail5.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+250))*25), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*4), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+300))*27), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*17), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*3), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-17), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(12.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-4), neck.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*17), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-16.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-250))*-6), head.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-17), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11 + (((tickAnim - 0) / 3) * (77.49291-(11)));
            yy = 59.25 + (((tickAnim - 0) / 3) * (-5.88557-(59.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-38.68357-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 77.49291 + (((tickAnim - 3) / 2) * (126.93156-(77.49291)));
            yy = -5.88557 + (((tickAnim - 3) / 2) * (-59.72046-(-5.88557)));
            zz = -38.68357 + (((tickAnim - 3) / 2) * (-69.89086-(-38.68357)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 126.93156 + (((tickAnim - 5) / 3) * (-13.65173-(126.93156)));
            yy = -59.72046 + (((tickAnim - 5) / 3) * (18.92581-(-59.72046)));
            zz = -69.89086 + (((tickAnim - 5) / 3) * (-58.60603-(-69.89086)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -13.65173 + (((tickAnim - 8) / 2) * (11-(-13.65173)));
            yy = 18.92581 + (((tickAnim - 8) / 2) * (59.25-(18.92581)));
            zz = -58.60603 + (((tickAnim - 8) / 2) * (0-(-58.60603)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -34.33401 + (((tickAnim - 0) / 5) * (-56.33832-(-34.33401)));
            yy = -28.89493 + (((tickAnim - 0) / 5) * (-44.55976-(-28.89493)));
            zz = -36.44092 + (((tickAnim - 0) / 5) * (-63.48918-(-36.44092)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -56.33832 + (((tickAnim - 5) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 5) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 5) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -31.59373 + (((tickAnim - 7) / 3) * (-34.33401-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 7) / 3) * (-28.89493-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 7) / 3) * (-36.44092-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -6 + (((tickAnim - 0) / 3) * (-39.76974-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 3) * (1.44315-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 3) * (-29.73427-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -39.76974 + (((tickAnim - 3) / 2) * (-68.74177-(-39.76974)));
            yy = 1.44315 + (((tickAnim - 3) / 2) * (17.88173-(1.44315)));
            zz = -29.73427 + (((tickAnim - 3) / 2) * (-64.16327-(-29.73427)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -68.74177 + (((tickAnim - 5) / 2) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 5) / 2) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 5) / 2) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 12.57886 + (((tickAnim - 7) / 1) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 7) / 1) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 7) / 1) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.26519 + (((tickAnim - 8) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 8) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 8) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.13-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -0.8 + (((tickAnim - 1) / 4) * (0-(-0.8)));
            yy = 0.23 + (((tickAnim - 1) / 4) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 1) / 4) * (-0.575-(-0.13)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 5) / 2) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 5) / 2) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.19 + (((tickAnim - 7) / 1) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 7) / 1) * (0.16-(0.315)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 8) / 1) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 8) / 1) * (0.08-(0.16)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 9) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 9) / 1) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 126.93156 + (((tickAnim - 0) / 3) * (-13.65173-(126.93156)));
            yy = 59.72046 + (((tickAnim - 0) / 3) * (-18.92581-(59.72046)));
            zz = 69.89086 + (((tickAnim - 0) / 3) * (58.60603-(69.89086)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -13.65173 + (((tickAnim - 3) / 1) * (11-(-13.65173)));
            yy = -18.92581 + (((tickAnim - 3) / 1) * (-59.25-(-18.92581)));
            zz = 58.60603 + (((tickAnim - 3) / 1) * (0-(58.60603)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11 + (((tickAnim - 4) / 4) * (77.49291-(11)));
            yy = -59.25 + (((tickAnim - 4) / 4) * (5.88557-(-59.25)));
            zz = 0 + (((tickAnim - 4) / 4) * (38.68357-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.49291 + (((tickAnim - 8) / 2) * (126.93156-(77.49291)));
            yy = 5.88557 + (((tickAnim - 8) / 2) * (59.72046-(5.88557)));
            zz = 38.68357 + (((tickAnim - 8) / 2) * (69.89086-(38.68357)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -56.33832 + (((tickAnim - 0) / 1) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 1) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 1) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -31.59373 + (((tickAnim - 1) / 3) * (-34.33401-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 1) / 3) * (28.89493-(42.45071)));
            zz = 28.10927 + (((tickAnim - 1) / 3) * (36.44092-(28.10927)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -34.33401 + (((tickAnim - 4) / 6) * (-56.33832-(-34.33401)));
            yy = 28.89493 + (((tickAnim - 4) / 6) * (44.55976-(28.89493)));
            zz = 36.44092 + (((tickAnim - 4) / 6) * (63.48918-(36.44092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -68.74177 + (((tickAnim - 0) / 1) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 1) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 1) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12.57886 + (((tickAnim - 1) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 1) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 1) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -7.26519 + (((tickAnim - 3) / 1) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 3) / 1) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 3) / 1) * (0-(-50.72073)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6 + (((tickAnim - 4) / 4) * (-39.76974-(-6)));
            yy = 21.75 + (((tickAnim - 4) / 4) * (-1.44315-(21.75)));
            zz = 0 + (((tickAnim - 4) / 4) * (29.73427-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -39.76974 + (((tickAnim - 8) / 2) * (-68.74177-(-39.76974)));
            yy = -1.44315 + (((tickAnim - 8) / 2) * (-17.88173-(-1.44315)));
            zz = 29.73427 + (((tickAnim - 8) / 2) * (64.16327-(29.73427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 1) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 0) / 1) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 1) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 1) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.11 + (((tickAnim - 3) / 0) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 3) / 0) * (0.08-(0.16)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 3) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 3) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.88-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.88 + (((tickAnim - 6) / 4) * (0.35-(0.88)));
            zz = -0.13 + (((tickAnim - 6) / 4) * (-0.575-(-0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 3) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 3) * (-11.03701-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 7.69903 + (((tickAnim - 3) / 2) * (7.6533-(7.69903)));
            yy = 29.25881 + (((tickAnim - 3) / 2) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 3) / 2) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 7.6533 + (((tickAnim - 5) / 3) * (6.29605-(7.6533)));
            yy = 57.54768 + (((tickAnim - 5) / 3) * (29.00117-(57.54768)));
            zz = -0.18491 + (((tickAnim - 5) / 3) * (-7.04154-(-0.18491)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.29605 + (((tickAnim - 8) / 2) * (0-(6.29605)));
            yy = 29.00117 + (((tickAnim - 8) / 2) * (-0.475-(29.00117)));
            zz = -7.04154 + (((tickAnim - 8) / 2) * (0-(-7.04154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.81046-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 27.23355 + (((tickAnim - 2) / 3) * (4.71839-(27.23355)));
            yy = -4.49933 + (((tickAnim - 2) / 3) * (31.05942-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 2) / 3) * (5.1049-(-0.81046)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 4.71839 + (((tickAnim - 5) / 3) * (5.5328-(4.71839)));
            yy = 31.05942 + (((tickAnim - 5) / 3) * (15.94246-(31.05942)));
            zz = 5.1049 + (((tickAnim - 5) / 3) * (-4.44427-(5.1049)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.5328 + (((tickAnim - 8) / 2) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 8) / 2) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 8) / 2) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (10.87267-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 30.11605 + (((tickAnim - 2) / 3) * (0-(30.11605)));
            yy = -13.56425 + (((tickAnim - 2) / 3) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 2) / 3) * (0-(10.87267)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 50.25 + (((tickAnim - 8) / 2) * (0-(50.25)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 2) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.91-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.91 + (((tickAnim - 7) / 1) * (0.64-(0.91)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.64 + (((tickAnim - 8) / 2) * (0.225-(0.64)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKuehneosuchus entity = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-12), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.35);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.6533 + (((tickAnim - 0) / 4) * (4.78017-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 4) * (-28.82811-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 4) * (2.76755-(0.18491)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.78017 + (((tickAnim - 4) / 4) * (0-(4.78017)));
            yy = -28.82811 + (((tickAnim - 4) / 4) * (0.475-(-28.82811)));
            zz = 2.76755 + (((tickAnim - 4) / 4) * (0-(2.76755)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (11.03701-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.69903 + (((tickAnim - 12) / 3) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 12) / 3) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 12) / 3) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.71839 + (((tickAnim - 0) / 4) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 4) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 4) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5328 + (((tickAnim - 4) / 4) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 4) / 4) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 4) / 4) * (0-(4.44427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.23355 + (((tickAnim - 10) / 5) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 10) / 5) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 10) / 5) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-50.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -50.25 + (((tickAnim - 3) / 5) * (0-(-50.25)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30.11605 + (((tickAnim - 10) / 5) * (0-(30.11605)));
            yy = 13.56425 + (((tickAnim - 10) / 5) * (0-(13.56425)));
            zz = -10.87267 + (((tickAnim - 10) / 5) * (0-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 5) * (0-(0.6)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*7), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*7), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*7), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.11962-(0)));
            yy = 48 + (((tickAnim - 0) / 4) * (-0.2005-(48)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.94096-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.11962 + (((tickAnim - 4) / 4) * (51.69534-(26.11962)));
            yy = -0.2005 + (((tickAnim - 4) / 4) * (-60.37037-(-0.2005)));
            zz = -10.94096 + (((tickAnim - 4) / 4) * (-14.76137-(-10.94096)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 51.69534 + (((tickAnim - 8) / 3) * (29.24371-(51.69534)));
            yy = -60.37037 + (((tickAnim - 8) / 3) * (2.53566-(-60.37037)));
            zz = -14.76137 + (((tickAnim - 8) / 3) * (-30.47476-(-14.76137)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 29.24371 + (((tickAnim - 11) / 2) * (-9.98614-(29.24371)));
            yy = 2.53566 + (((tickAnim - 11) / 2) * (25.30525-(2.53566)));
            zz = -30.47476 + (((tickAnim - 11) / 2) * (-34.91675-(-30.47476)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.98614 + (((tickAnim - 13) / 2) * (0-(-9.98614)));
            yy = 25.30525 + (((tickAnim - 13) / 2) * (48-(25.30525)));
            zz = -34.91675 + (((tickAnim - 13) / 2) * (0-(-34.91675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -34.33401 + (((tickAnim - 0) / 8) * (-56.33832-(-34.33401)));
            yy = -28.89493 + (((tickAnim - 0) / 8) * (-44.55976-(-28.89493)));
            zz = -36.44092 + (((tickAnim - 0) / 8) * (-63.48918-(-36.44092)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.33832 + (((tickAnim - 8) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 8) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 8) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -31.59373 + (((tickAnim - 10) / 5) * (-34.33401-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 10) / 5) * (-28.89493-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 10) / 5) * (-36.44092-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 0) / 4) * (-39.76974-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 4) * (1.44315-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-29.73427-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -39.76974 + (((tickAnim - 4) / 4) * (-68.74177-(-39.76974)));
            yy = 1.44315 + (((tickAnim - 4) / 4) * (17.88173-(1.44315)));
            zz = -29.73427 + (((tickAnim - 4) / 4) * (-64.16327-(-29.73427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -68.74177 + (((tickAnim - 8) / 2) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 8) / 2) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 8) / 2) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.57886 + (((tickAnim - 10) / 3) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 10) / 3) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 10) / 3) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.26519 + (((tickAnim - 13) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 13) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 13) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 2) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 2) / 6) * (-0.575-(-0.13)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 2) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 8) / 2) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 3) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 10) / 3) * (0.16-(0.315)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 1) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 13) / 1) * (0.08-(0.16)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 14) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 14) / 1) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.55895 + (((tickAnim - 0) / 3) * (29.24371-(43.55895)));
            yy = 59.2817 + (((tickAnim - 0) / 3) * (-2.53566-(59.2817)));
            zz = 6.2402 + (((tickAnim - 0) / 3) * (30.47476-(6.2402)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 29.24371 + (((tickAnim - 3) / 1) * (-9.98614-(29.24371)));
            yy = -2.53566 + (((tickAnim - 3) / 1) * (-25.30525-(-2.53566)));
            zz = 30.47476 + (((tickAnim - 3) / 1) * (34.91675-(30.47476)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.98614 + (((tickAnim - 4) / 3) * (0-(-9.98614)));
            yy = -25.30525 + (((tickAnim - 4) / 3) * (-48-(-25.30525)));
            zz = 34.91675 + (((tickAnim - 4) / 3) * (0-(34.91675)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (26.11962-(0)));
            yy = -48 + (((tickAnim - 7) / 5) * (0.2005-(-48)));
            zz = 0 + (((tickAnim - 7) / 5) * (10.94096-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.11962 + (((tickAnim - 12) / 3) * (43.55895-(26.11962)));
            yy = 0.2005 + (((tickAnim - 12) / 3) * (59.2817-(0.2005)));
            zz = 10.94096 + (((tickAnim - 12) / 3) * (6.2402-(10.94096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -56.33832 + (((tickAnim - 0) / 2) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 2) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 2) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -31.59373 + (((tickAnim - 2) / 5) * (-34.33401-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 2) / 5) * (28.89493-(42.45071)));
            zz = 28.10927 + (((tickAnim - 2) / 5) * (36.44092-(28.10927)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -34.33401 + (((tickAnim - 7) / 8) * (-56.33832-(-34.33401)));
            yy = 28.89493 + (((tickAnim - 7) / 8) * (44.55976-(28.89493)));
            zz = 36.44092 + (((tickAnim - 7) / 8) * (63.48918-(36.44092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -68.74177 + (((tickAnim - 0) / 2) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 2) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 2) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 12.57886 + (((tickAnim - 2) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 2) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 2) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.26519 + (((tickAnim - 4) / 3) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 4) / 3) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 4) / 3) * (0-(-50.72073)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 7) / 5) * (-39.76974-(-6)));
            yy = 21.75 + (((tickAnim - 7) / 5) * (-1.44315-(21.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (29.73427-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -39.76974 + (((tickAnim - 12) / 3) * (-68.74177-(-39.76974)));
            yy = -1.44315 + (((tickAnim - 12) / 3) * (-17.88173-(-1.44315)));
            zz = 29.73427 + (((tickAnim - 12) / 3) * (64.16327-(29.73427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 0) / 2) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 2) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 2) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 4) / 2) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 4) / 2) * (0.08-(0.16)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 6) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 9) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 9) / 6) * (-0.575-(-0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 4) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.03701-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.69903 + (((tickAnim - 4) / 4) * (7.6533-(7.69903)));
            yy = 29.25881 + (((tickAnim - 4) / 4) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 4) / 4) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7.6533 + (((tickAnim - 8) / 4) * (4.78017-(7.6533)));
            yy = 57.54768 + (((tickAnim - 8) / 4) * (28.82811-(57.54768)));
            zz = -0.18491 + (((tickAnim - 8) / 4) * (-2.76755-(-0.18491)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 4.78017 + (((tickAnim - 12) / 3) * (0-(4.78017)));
            yy = 28.82811 + (((tickAnim - 12) / 3) * (-0.475-(28.82811)));
            zz = -2.76755 + (((tickAnim - 12) / 3) * (0-(-2.76755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.81046-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.23355 + (((tickAnim - 3) / 5) * (4.71839-(27.23355)));
            yy = -4.49933 + (((tickAnim - 3) / 5) * (31.05942-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 3) / 5) * (5.1049-(-0.81046)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.71839 + (((tickAnim - 8) / 4) * (5.5328-(4.71839)));
            yy = 31.05942 + (((tickAnim - 8) / 4) * (15.94246-(31.05942)));
            zz = 5.1049 + (((tickAnim - 8) / 4) * (-4.44427-(5.1049)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.5328 + (((tickAnim - 12) / 3) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 12) / 3) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 12) / 3) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.87267-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30.11605 + (((tickAnim - 3) / 5) * (0-(30.11605)));
            yy = -13.56425 + (((tickAnim - 3) / 5) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 3) / 5) * (0-(10.87267)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 50.25 + (((tickAnim - 11) / 4) * (0-(50.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.64-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.64 + (((tickAnim - 11) / 4) * (0.225-(0.64)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);


    }
    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraKuehneosuchus entity = (EntityPrehistoricFloraKuehneosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1), root.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-12), root.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));
        this.root.rotationPointX = this.root.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*0.35);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-0.1);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 7.6533 + (((tickAnim - 0) / 4) * (4.78017-(7.6533)));
            yy = -57.54768 + (((tickAnim - 0) / 4) * (-28.82811-(-57.54768)));
            zz = 0.18491 + (((tickAnim - 0) / 4) * (2.76755-(0.18491)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 4.78017 + (((tickAnim - 4) / 4) * (0-(4.78017)));
            yy = -28.82811 + (((tickAnim - 4) / 4) * (0.475-(-28.82811)));
            zz = 2.76755 + (((tickAnim - 4) / 4) * (0-(2.76755)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (7.69903-(0)));
            yy = 0.475 + (((tickAnim - 8) / 4) * (-29.25881-(0.475)));
            zz = 0 + (((tickAnim - 8) / 4) * (11.03701-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 7.69903 + (((tickAnim - 12) / 3) * (7.6533-(7.69903)));
            yy = -29.25881 + (((tickAnim - 12) / 3) * (-57.54768-(-29.25881)));
            zz = 11.03701 + (((tickAnim - 12) / 3) * (0.18491-(11.03701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 4.71839 + (((tickAnim - 0) / 4) * (5.5328-(4.71839)));
            yy = -31.05942 + (((tickAnim - 0) / 4) * (-15.94246-(-31.05942)));
            zz = -5.1049 + (((tickAnim - 0) / 4) * (4.44427-(-5.1049)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5328 + (((tickAnim - 4) / 4) * (0-(5.5328)));
            yy = -15.94246 + (((tickAnim - 4) / 4) * (0-(-15.94246)));
            zz = 4.44427 + (((tickAnim - 4) / 4) * (0-(4.44427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (4.49933-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0.81046-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 27.23355 + (((tickAnim - 10) / 5) * (4.71839-(27.23355)));
            yy = 4.49933 + (((tickAnim - 10) / 5) * (-31.05942-(4.49933)));
            zz = 0.81046 + (((tickAnim - 10) / 5) * (-5.1049-(0.81046)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-50.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -50.25 + (((tickAnim - 3) / 5) * (0-(-50.25)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (13.56425-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-10.87267-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 30.11605 + (((tickAnim - 10) / 5) * (0-(30.11605)));
            yy = 13.56425 + (((tickAnim - 10) / 5) * (0-(13.56425)));
            zz = -10.87267 + (((tickAnim - 10) / 5) * (0-(-10.87267)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 5) * (0-(0.6)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*7), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-4));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*7), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-7), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-7), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+250))*7), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*7), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*-1), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*15), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*1), chest.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*-2), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*-4), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-15), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.11962-(0)));
            yy = 48 + (((tickAnim - 0) / 4) * (-0.2005-(48)));
            zz = 0 + (((tickAnim - 0) / 4) * (-10.94096-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.11962 + (((tickAnim - 4) / 4) * (51.69534-(26.11962)));
            yy = -0.2005 + (((tickAnim - 4) / 4) * (-60.37037-(-0.2005)));
            zz = -10.94096 + (((tickAnim - 4) / 4) * (-14.76137-(-10.94096)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 51.69534 + (((tickAnim - 8) / 3) * (29.24371-(51.69534)));
            yy = -60.37037 + (((tickAnim - 8) / 3) * (2.53566-(-60.37037)));
            zz = -14.76137 + (((tickAnim - 8) / 3) * (-30.47476-(-14.76137)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 29.24371 + (((tickAnim - 11) / 2) * (-9.98614-(29.24371)));
            yy = 2.53566 + (((tickAnim - 11) / 2) * (25.30525-(2.53566)));
            zz = -30.47476 + (((tickAnim - 11) / 2) * (-34.91675-(-30.47476)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -9.98614 + (((tickAnim - 13) / 2) * (0-(-9.98614)));
            yy = 25.30525 + (((tickAnim - 13) / 2) * (48-(25.30525)));
            zz = -34.91675 + (((tickAnim - 13) / 2) * (0-(-34.91675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -34.33401 + (((tickAnim - 0) / 8) * (-56.33832-(-34.33401)));
            yy = -28.89493 + (((tickAnim - 0) / 8) * (-44.55976-(-28.89493)));
            zz = -36.44092 + (((tickAnim - 0) / 8) * (-63.48918-(-36.44092)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -56.33832 + (((tickAnim - 8) / 2) * (-31.59373-(-56.33832)));
            yy = -44.55976 + (((tickAnim - 8) / 2) * (-42.45071-(-44.55976)));
            zz = -63.48918 + (((tickAnim - 8) / 2) * (-28.10927-(-63.48918)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -31.59373 + (((tickAnim - 10) / 5) * (-34.33401-(-31.59373)));
            yy = -42.45071 + (((tickAnim - 10) / 5) * (-28.89493-(-42.45071)));
            zz = -28.10927 + (((tickAnim - 10) / 5) * (-36.44092-(-28.10927)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -6 + (((tickAnim - 0) / 4) * (-39.76974-(-6)));
            yy = -21.75 + (((tickAnim - 0) / 4) * (1.44315-(-21.75)));
            zz = 0 + (((tickAnim - 0) / 4) * (-29.73427-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -39.76974 + (((tickAnim - 4) / 4) * (-68.74177-(-39.76974)));
            yy = 1.44315 + (((tickAnim - 4) / 4) * (17.88173-(1.44315)));
            zz = -29.73427 + (((tickAnim - 4) / 4) * (-64.16327-(-29.73427)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -68.74177 + (((tickAnim - 8) / 2) * (12.57886-(-68.74177)));
            yy = 17.88173 + (((tickAnim - 8) / 2) * (-56.73456-(17.88173)));
            zz = -64.16327 + (((tickAnim - 8) / 2) * (37.78518-(-64.16327)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.57886 + (((tickAnim - 10) / 3) * (-7.26519-(12.57886)));
            yy = -56.73456 + (((tickAnim - 10) / 3) * (-46.86725-(-56.73456)));
            zz = 37.78518 + (((tickAnim - 10) / 3) * (50.72073-(37.78518)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.26519 + (((tickAnim - 13) / 2) * (-6-(-7.26519)));
            yy = -46.86725 + (((tickAnim - 13) / 2) * (-21.75-(-46.86725)));
            zz = 50.72073 + (((tickAnim - 13) / 2) * (0-(50.72073)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 2) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 2) / 6) * (-0.575-(-0.13)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 2) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 8) / 2) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.19 + (((tickAnim - 10) / 3) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 10) / 3) * (0.16-(0.315)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.11 + (((tickAnim - 13) / 1) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 13) / 1) * (0.08-(0.16)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 14) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 14) / 1) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.55895 + (((tickAnim - 0) / 3) * (29.24371-(43.55895)));
            yy = 59.2817 + (((tickAnim - 0) / 3) * (-2.53566-(59.2817)));
            zz = 6.2402 + (((tickAnim - 0) / 3) * (30.47476-(6.2402)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 29.24371 + (((tickAnim - 3) / 1) * (-9.98614-(29.24371)));
            yy = -2.53566 + (((tickAnim - 3) / 1) * (-25.30525-(-2.53566)));
            zz = 30.47476 + (((tickAnim - 3) / 1) * (34.91675-(30.47476)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -9.98614 + (((tickAnim - 4) / 3) * (0-(-9.98614)));
            yy = -25.30525 + (((tickAnim - 4) / 3) * (-48-(-25.30525)));
            zz = 34.91675 + (((tickAnim - 4) / 3) * (0-(34.91675)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (26.11962-(0)));
            yy = -48 + (((tickAnim - 7) / 5) * (0.2005-(-48)));
            zz = 0 + (((tickAnim - 7) / 5) * (10.94096-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 26.11962 + (((tickAnim - 12) / 3) * (43.55895-(26.11962)));
            yy = 0.2005 + (((tickAnim - 12) / 3) * (59.2817-(0.2005)));
            zz = 10.94096 + (((tickAnim - 12) / 3) * (6.2402-(10.94096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -56.33832 + (((tickAnim - 0) / 2) * (-31.59373-(-56.33832)));
            yy = 44.55976 + (((tickAnim - 0) / 2) * (42.45071-(44.55976)));
            zz = 63.48918 + (((tickAnim - 0) / 2) * (28.10927-(63.48918)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -31.59373 + (((tickAnim - 2) / 5) * (-34.33401-(-31.59373)));
            yy = 42.45071 + (((tickAnim - 2) / 5) * (28.89493-(42.45071)));
            zz = 28.10927 + (((tickAnim - 2) / 5) * (36.44092-(28.10927)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -34.33401 + (((tickAnim - 7) / 8) * (-56.33832-(-34.33401)));
            yy = 28.89493 + (((tickAnim - 7) / 8) * (44.55976-(28.89493)));
            zz = 36.44092 + (((tickAnim - 7) / 8) * (63.48918-(36.44092)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -68.74177 + (((tickAnim - 0) / 2) * (12.57886-(-68.74177)));
            yy = -17.88173 + (((tickAnim - 0) / 2) * (56.73456-(-17.88173)));
            zz = 64.16327 + (((tickAnim - 0) / 2) * (-37.78518-(64.16327)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 12.57886 + (((tickAnim - 2) / 2) * (-7.26519-(12.57886)));
            yy = 56.73456 + (((tickAnim - 2) / 2) * (46.86725-(56.73456)));
            zz = -37.78518 + (((tickAnim - 2) / 2) * (-50.72073-(-37.78518)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7.26519 + (((tickAnim - 4) / 3) * (-6-(-7.26519)));
            yy = 46.86725 + (((tickAnim - 4) / 3) * (21.75-(46.86725)));
            zz = -50.72073 + (((tickAnim - 4) / 3) * (0-(-50.72073)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 7) / 5) * (-39.76974-(-6)));
            yy = 21.75 + (((tickAnim - 7) / 5) * (-1.44315-(21.75)));
            zz = 0 + (((tickAnim - 7) / 5) * (29.73427-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -39.76974 + (((tickAnim - 12) / 3) * (-68.74177-(-39.76974)));
            yy = -1.44315 + (((tickAnim - 12) / 3) * (-17.88173-(-1.44315)));
            zz = 29.73427 + (((tickAnim - 12) / 3) * (64.16327-(29.73427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.19-(0.35)));
            zz = -0.575 + (((tickAnim - 0) / 2) * (0.315-(-0.575)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 2) / 2) * (-0.11-(0.19)));
            zz = 0.315 + (((tickAnim - 2) / 2) * (0.16-(0.315)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = -0.11 + (((tickAnim - 4) / 2) * (0.175-(-0.11)));
            zz = 0.16 + (((tickAnim - 4) / 2) * (0.08-(0.16)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 1) * (0-(0.175)));
            zz = 0.08 + (((tickAnim - 6) / 1) * (0-(0.08)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0.23-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-0.13-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.23 + (((tickAnim - 9) / 6) * (0.35-(0.23)));
            zz = -0.13 + (((tickAnim - 9) / 6) * (-0.575-(-0.13)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (7.69903-(0)));
            yy = -0.475 + (((tickAnim - 0) / 4) * (29.25881-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 4) * (-11.03701-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 7.69903 + (((tickAnim - 4) / 4) * (7.6533-(7.69903)));
            yy = 29.25881 + (((tickAnim - 4) / 4) * (57.54768-(29.25881)));
            zz = -11.03701 + (((tickAnim - 4) / 4) * (-0.18491-(-11.03701)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7.6533 + (((tickAnim - 8) / 4) * (4.78017-(7.6533)));
            yy = 57.54768 + (((tickAnim - 8) / 4) * (28.82811-(57.54768)));
            zz = -0.18491 + (((tickAnim - 8) / 4) * (-2.76755-(-0.18491)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 4.78017 + (((tickAnim - 12) / 3) * (0-(4.78017)));
            yy = 28.82811 + (((tickAnim - 12) / 3) * (-0.475-(28.82811)));
            zz = -2.76755 + (((tickAnim - 12) / 3) * (0-(-2.76755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.23355-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.49933-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.81046-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 27.23355 + (((tickAnim - 3) / 5) * (4.71839-(27.23355)));
            yy = -4.49933 + (((tickAnim - 3) / 5) * (31.05942-(-4.49933)));
            zz = -0.81046 + (((tickAnim - 3) / 5) * (5.1049-(-0.81046)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.71839 + (((tickAnim - 8) / 4) * (5.5328-(4.71839)));
            yy = 31.05942 + (((tickAnim - 8) / 4) * (15.94246-(31.05942)));
            zz = 5.1049 + (((tickAnim - 8) / 4) * (-4.44427-(5.1049)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5.5328 + (((tickAnim - 12) / 3) * (0-(5.5328)));
            yy = 15.94246 + (((tickAnim - 12) / 3) * (0-(15.94246)));
            zz = -4.44427 + (((tickAnim - 12) / 3) * (0-(-4.44427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (30.11605-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-13.56425-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (10.87267-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 30.11605 + (((tickAnim - 3) / 5) * (0-(30.11605)));
            yy = -13.56425 + (((tickAnim - 3) / 5) * (0-(-13.56425)));
            zz = 10.87267 + (((tickAnim - 3) / 5) * (0-(10.87267)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (50.25-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 50.25 + (((tickAnim - 11) / 4) * (0-(50.25)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 3) * (0-(0.225)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.64-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.64 + (((tickAnim - 11) / 4) * (0.225-(0.64)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
