package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCarnufex;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCarnufex extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer Main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer rightToe;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer leftToe;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer cube_r35;
    private ModelAnimator animator;

    public ModelCarnufex() {
        this.textureWidth = 79;
        this.textureHeight = 79;

        this.Main = new AdvancedModelRenderer(this);
        this.Main.setRotationPoint(1.0196F, 10.2591F, 2.0976F);
        this.setRotateAngle(Main, 0.0F, 3.1416F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, -1.6591F, 1.6024F);
        this.Main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 17, -1.0F, -1.0F, -5.0F, 0, 1, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.5444F, -1.5591F, 2.9024F);
        this.Main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1396F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 55, 5.9F, 0.2F, -6.0F, 1, 1, 6, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 55, 0.0444F, 0.2F, -6.0F, 1, 1, 6, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 26, 0.5248F, -0.5F, -6.0F, 6, 8, 6, 0.0F, false));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(1.2612F, -1.8091F, 2.6524F);
        this.Main.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 18, 13, -0.2451F, -0.9465F, -0.2062F, 0, 1, 9, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0549F, 3.7535F, -0.0062F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0175F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -4.0F, -4.0005F, -0.0524F, 7, 8, 9, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 0, 2.6556F, -3.6005F, -0.0524F, 1, 3, 9, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 0, -4.4F, -3.6005F, -0.0524F, 1, 3, 9, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(-0.3038F, -0.2465F, 8.1938F);
        this.Body.addChild(Body2);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0697F, 0.5054F, 3.2785F);
        this.Body2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 2, -1.0F, -1.0F, -3.0F, 0, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.3962F, 1.9054F, 0.9785F);
        this.Body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 37, 5.6F, -1.6F, -0.9F, 1, 2, 5, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 68, 37, 0.3658F, -1.6F, -0.9F, 1, 2, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 35, 0.9487F, -2.0F, -1.0F, 5, 7, 5, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(-0.0928F, 3.5054F, 3.9785F);
        this.Body2.addChild(Neck1);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.1F, -3.4F, 1.3F);
        this.Neck1.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 19, -1.0F, -1.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.6F, -1.8F, 1.7F);
        this.Neck1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2967F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 34, 0, -5.4F, -1.5F, -3.0F, 1, 2, 4, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 55, -5.0795F, -2.0F, -3.0F, 3, 6, 4, 0.01F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0188F, -1.9F, 2.4F);
        this.Neck1.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0524F, 0.005F, -0.0002F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.5F, -2.354F, 2.8807F);
        this.Neck2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.192F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -3.5F, -1.0636F, -3.3243F, 0, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.9658F, -1.7237F, 2.7418F);
        this.Neck2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2254F, 0.014F, 0.0193F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 44, 4.9F, -0.6F, -3.0F, 1, 2, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.0F, -1.7237F, 2.7418F);
        this.Neck2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2254F, -0.014F, -0.0193F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 59, 44, -5.9F, -0.6F, -3.0F, 1, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0242F, 0.0385F, 2.0466F);
        this.Neck2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.2253F, -0.0149F, -0.0043F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 57, -1.5F, -2.5F, -2.0F, 3, 5, 4, -0.009F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.0384F, -0.9498F, 3.4411F);
        this.Neck2.addChild(Head);
        this.setRotateAngle(Head, -0.0698F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 62, 18, -1.5F, -1.988F, -0.2146F, 3, 3, 3, 0.009F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.4658F, 0.0F, 0.0F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 22, 3.8F, -0.2196F, 6.869F, 0, 1, 2, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 22, 3.1658F, -0.2196F, 6.869F, 0, 1, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, 4.3F, 0.3002F, 2.4237F, 0, 1, 4, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 3, 2.6658F, 0.3002F, 2.4237F, 0, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.5F, 0.0609F, 8.2037F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0349F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 17, -4.0009F, -1.0792F, -0.1967F, 1, 2, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-3.1658F, 0.0609F, 3.5037F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5225F, -0.2765F, 0.0789F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 0, 4.0F, -2.0F, -2.0F, 0, 2, 3, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(3.2F, 0.0609F, 3.5037F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.5225F, 0.2765F, -0.0789F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 0, -4.0F, -2.0F, -2.0F, 0, 2, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(3.0F, -1.5144F, 2.8707F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 57, -3.5F, -0.4834F, -0.339F, 1, 2, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.2F, 0.7609F, 7.2037F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.4538F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 0, -0.2994F, -0.9413F, -0.9126F, 1, 1, 2, -0.008F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(3.5F, -0.0391F, 2.5037F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0524F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 60, 0, -4.5F, -0.8985F, -0.0174F, 2, 2, 4, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 0.5609F, 0.1037F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.0305F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 64, 24, -1.1F, -1.3F, 0.3F, 2, 3, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 31, 66, -1.0009F, 0.6F, 2.3035F, 2, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 4, -0.8F, 0.1F, 2.3035F, 0, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 4, 0.8342F, 0.1F, 2.3035F, 0, 1, 4, 0.0F, true));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 38, 61, -0.5F, 0.6288F, 4.8056F, 1, 1, 4, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 18, -0.4F, -0.2713F, 6.6056F, 0, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 18, 0.4342F, -0.2713F, 6.6056F, 0, 1, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(3.0F, 2.1F, 3.6F);
        this.Jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2967F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 31, -3.9999F, -0.9044F, -1.0292F, 2, 1, 3, -0.009F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(3.5F, 2.5F, 0.9F);
        this.Jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0175F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 43, 47, -5.0F, -2.0F, -1.2F, 3, 2, 3, 0.009F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.0022F, -0.5F, 1.775F);
        this.Head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 1, 0, 0.5272F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 1, 0, -1.5272F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(2.5038F, 4.5054F, 3.0785F);
        this.Body2.addChild(rightArm);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-3.6F, 1.0F, -1.7F);
        this.rightArm.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1946F, -0.1901F, -0.3918F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 17, 2.3F, -1.6F, 0.0F, 2, 4, 2, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.1F, 1.5F, -0.3F);
        this.rightArm.addChild(rightArm2);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.6F, -0.2F, 0.2F);
        this.rightArm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.4033F, -0.1082F, -0.3763F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 63, -1.7773F, -0.2529F, -1.2995F, 2, 3, 2, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(1.5F, 1.9F, 0.6F);
        this.rightArm2.addChild(rightArm3);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.3F, 0.4F);
        this.rightArm3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4261F, -0.1522F, -0.2447F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 13, 36, -0.8668F, -0.3406F, -1.0541F, 1, 2, 2, 0.0F, true));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(-2.3303F, 4.5054F, 3.0785F);
        this.Body2.addChild(leftArm);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(3.6F, 1.0F, -1.7F);
        this.leftArm.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.1946F, 0.1901F, 0.3918F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 17, -4.3F, -1.6F, 0.0F, 2, 4, 2, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(-0.1F, 1.5F, -0.3F);
        this.leftArm.addChild(leftArm2);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.6F, -0.2F, 0.2F);
        this.leftArm2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.4033F, 0.1082F, 0.3763F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 63, -0.2227F, -0.2529F, -1.2995F, 2, 3, 2, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(-1.5F, 1.9F, 0.6F);
        this.leftArm2.addChild(leftArm3);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.3F, 0.4F);
        this.leftArm3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.4261F, 0.1522F, 0.2447F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 13, 36, -0.1332F, -0.3406F, -1.0541F, 1, 2, 2, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(3.7F, 0.5409F, 0.1024F);
        this.Main.addChild(rightLeg1);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-2.8444F, 0.1F, 0.0F);
        this.rightLeg1.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.2269F, 0.0039F, -0.017F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 30, 47, 0.8432F, -0.1436F, -2.3361F, 4, 7, 5, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.4F, 6.1F, 1.8F);
        this.rightLeg1.addChild(rightLeg2);


        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-3.7444F, -0.8F, 0.0F);
        this.rightLeg2.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.1222F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 27, 2.0F, 0.3407F, -1.7457F, 3, 7, 4, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-0.1F, 6.7F, -1.7F);
        this.rightLeg2.addChild(rightLeg3);


        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.1F, 0.6F, 0.1F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 49, 20, -2.1444F, -1.0F, -0.6F, 4, 1, 5, 0.0F, true));

        this.rightToe = new AdvancedModelRenderer(this);
        this.rightToe.setRotationPoint(0.1F, 0.4F, 3.8F);
        this.rightLeg4.addChild(rightToe);
        this.rightToe.cubeList.add(new ModelBox(rightToe, 60, 51, -2.2444F, -1.4F, 0.2F, 4, 1, 2, -0.003F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(-1.7F, 0.5409F, 0.1024F);
        this.Main.addChild(leftLeg1);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(2.7F, 0.1F, 0.0F);
        this.leftLeg1.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.2269F, -0.0039F, 0.017F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 47, -4.8432F, -0.1436F, -2.3361F, 4, 7, 5, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(-0.2F, 6.1F, 1.8F);
        this.leftLeg1.addChild(leftLeg2);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(3.4F, -0.8F, 0.0F);
        this.leftLeg2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.1222F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 54, 27, -5.0F, 0.3407F, -1.7457F, 3, 7, 4, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.3F, 6.7F, -1.7F);
        this.leftLeg2.addChild(leftLeg3);


        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.2F, 0.4F, -0.1F);
        this.leftLeg3.addChild(leftleg4);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 49, 20, -2.1F, -0.8F, -0.4F, 4, 1, 5, 0.0F, false));

        this.leftToe = new AdvancedModelRenderer(this);
        this.leftToe.setRotationPoint(0.2F, 0.6F, 4.0F);
        this.leftleg4.addChild(leftToe);
        this.leftToe.cubeList.add(new ModelBox(leftToe, 60, 51, -2.3F, -1.4F, 0.2F, 4, 1, 2, -0.003F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(0.9804F, -0.5591F, -2.0976F);
        this.Main.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0698F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(3.3209F, 1.4685F, -1.0602F);
        this.Tail1.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1745F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 23, 0, -4.6F, -2.7F, -7.0F, 2, 1, 7, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 17, -6.0F, -2.0F, -7.0F, 5, 7, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(-0.1041F, 0.9534F, -7.7455F);
        this.Tail1.addChild(Tail2);


        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(3.9F, 1.7151F, 0.2853F);
        this.Tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1745F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 38, 22, -4.9F, -2.7F, -8.1F, 2, 1, 8, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 8, -6.0F, -2.0F, -8.0F, 4, 5, 9, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.3F, 2.3825F, -7.3984F);
        this.Tail2.addChild(Tail3);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(3.1F, 0.8326F, -0.3163F);
        this.Tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.2094F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 8, -4.4F, -2.8F, -6.0F, 2, 1, 6, 0.0F, false));
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 40, -5.0F, -2.0F, -6.0F, 3, 4, 7, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(-0.4F, 0.8326F, -6.2163F);
        this.Tail3.addChild(Tail4);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(3.0F, 1.2837F, 0.3029F);
        this.Tail4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.2269F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 48, 47, -4.0F, -2.8123F, -7.0148F, 2, 1, 7, 0.0F, false));
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 32, -4.0F, -1.8123F, -6.8148F, 2, 3, 9, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.1F, 1.2F, -6.0F);
        this.Tail4.addChild(Tail5);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(3.0F, 1.8791F, 0.0993F);
        this.Tail5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.2967F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 51, 0, -3.6F, -3.0675F, -6.2923F, 1, 1, 7, 0.0F, false));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 49, 11, -3.6F, -2.0675F, -6.2923F, 1, 2, 7, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Main.render(f5);
    }

    public void renderStaticWall(float f) {

        this.Neck1.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        this.Main.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Main.offsetY = 0.00F;
        this.Main.offsetX = 0.0F;
        this.Main.rotateAngleY = (float)Math.toRadians(310);
        this.Main.rotateAngleX = (float)Math.toRadians(0);
        this.Main.rotateAngleZ = (float)Math.toRadians(0);
        this.Main.scaleChildren = true;
        float scaler = 0.7F;
        this.Main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Main, -0.6F, 0.8F, -0.2F);

        //End of pose, now render the model:
        this.Main.render(f);
        //Reset rotations, positions and sizing:
        this.Main.setScale(1.0F, 1.0F, 1.0F);
        this.Main.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraCarnufex EntityMegalosaurus = (EntityPrehistoricFloraCarnufex) e;
        //this.Main.offsetZ = 0.5F;

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

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

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Jaw, 0.1F, 0.05F, true, 3F, 0.05F, f2, 1F);

                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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
    



    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraCarnufex ee = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The display/roar
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.YAWN_ANIMATION) {
            animYawn(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (-2.5-(1)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 6) / 4) * (1-(-2.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 10) / 5) * (0-(1)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5 + (((tickAnim - 3) / 3) * (-19-(-5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -19 + (((tickAnim - 6) / 4) * (-10.5-(-19)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.5 + (((tickAnim - 10) / 5) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 5.75 + (((tickAnim - 3) / 3) * (14.24455-(5.75)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.74773-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (3.67473-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 14.24455 + (((tickAnim - 6) / 4) * (15.24455-(14.24455)));
            yy = -0.74773 + (((tickAnim - 6) / 4) * (-0.74773-(-0.74773)));
            zz = 3.67473 + (((tickAnim - 6) / 4) * (3.67473-(3.67473)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 15.24455 + (((tickAnim - 10) / 5) * (0-(15.24455)));
            yy = -0.74773 + (((tickAnim - 10) / 5) * (0-(-0.74773)));
            zz = 3.67473 + (((tickAnim - 10) / 5) * (0-(3.67473)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9 + (((tickAnim - 3) / 3) * (20.75-(-9)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 20.75 + (((tickAnim - 6) / 4) * (-11.75-(20.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -11.75 + (((tickAnim - 10) / 5) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.35 + (((tickAnim - 10) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -9.5 + (((tickAnim - 3) / 3) * (-41.25-(-9.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -41.25 + (((tickAnim - 6) / 2) * (0-(-41.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1 + (((tickAnim - 3) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 3) / 3) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 3) / 3) * (1-(1)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 6) / 3) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 6) / 3) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 6) / 3) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 13) / 7) * (3.675-(4.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 3.675 + (((tickAnim - 20) / 7) * (4.25-(3.675)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 4.25 + (((tickAnim - 27) / 13) * (0-(4.25)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-4.4438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.99865-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (2.25255-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -4.4438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-15 + (((tickAnim - 13) / 7) * (-3.81879-(-4.4438+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-80))*-15)));
            yy = -2.99865 + (((tickAnim - 13) / 7) * (-2.99865-(-2.99865)));
            zz = 2.25255 + (((tickAnim - 13) / 7) * (2.25255-(2.25255)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -3.81879 + (((tickAnim - 20) / 7) * (9.8062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*15-(-3.81879)));
            yy = -2.99865 + (((tickAnim - 20) / 7) * (-2.99865-(-2.99865)));
            zz = 2.25255 + (((tickAnim - 20) / 7) * (2.25255-(2.25255)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 9.8062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*15 + (((tickAnim - 27) / 13) * (0-(9.8062+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80-150))*15)));
            yy = -2.99865 + (((tickAnim - 27) / 13) * (0-(-2.99865)));
            zz = 2.25255 + (((tickAnim - 27) / 13) * (0-(2.25255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 13) / 7) * (11.75-(6.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 11.75 + (((tickAnim - 20) / 7) * (13.5-(11.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 13.5 + (((tickAnim - 27) / 13) * (0-(13.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 13) / 7) * (2-(13)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 2 + (((tickAnim - 20) / 7) * (18.5-(2)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = 18.5 + (((tickAnim - 27) / 13) * (0-(18.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -21 + (((tickAnim - 13) / 7) * (0-(-21)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 40) {
            xx = -26.5 + (((tickAnim - 27) / 13) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 27) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.75 + (((tickAnim - 15) / 20) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 35) / 15) * (0-(10.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Main, Main.rotateAngleX + (float) Math.toRadians(xx), Main.rotateAngleY + (float) Math.toRadians(yy), Main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.2-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -4.2 + (((tickAnim - 15) / 20) * (-4.2-(-4.2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.2 + (((tickAnim - 35) / 15) * (0-(-4.2)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Main.rotationPointX = this.Main.rotationPointX + (float)(xx);
        this.Main.rotationPointY = this.Main.rotationPointY - (float)(yy);
        this.Main.rotationPointZ = this.Main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 15) / 20) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 35) / 15) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.5 + (((tickAnim - 15) / 20) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 35) / 15) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-43.71241-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.07552-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.52187-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -43.71241 + (((tickAnim - 15) / 20) * (-43.71241-(-43.71241)));
            yy = -0.07552 + (((tickAnim - 15) / 20) * (-0.07552-(-0.07552)));
            zz = -0.52187 + (((tickAnim - 15) / 20) * (-0.52187-(-0.52187)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -43.71241 + (((tickAnim - 35) / 15) * (0-(-43.71241)));
            yy = -0.07552 + (((tickAnim - 35) / 15) * (0-(-0.07552)));
            zz = -0.52187 + (((tickAnim - 35) / 15) * (0-(-0.52187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.825-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.825 + (((tickAnim - 15) / 20) * (1.825-(1.825)));
            zz = 0.5 + (((tickAnim - 15) / 20) * (0.5-(0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.825 + (((tickAnim - 35) / 15) * (0-(1.825)));
            zz = 0.5 + (((tickAnim - 35) / 15) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 15) / 20) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 35) / 15) * (0-(19.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 20) * (0.425-(0.425)));
            zz = 0.325 + (((tickAnim - 15) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 15) * (0-(0.425)));
            zz = 0.325 + (((tickAnim - 35) / 15) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-43.71241-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.07552-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.52187-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -43.71241 + (((tickAnim - 15) / 20) * (-43.71241-(-43.71241)));
            yy = -0.07552 + (((tickAnim - 15) / 20) * (-0.07552-(-0.07552)));
            zz = -0.52187 + (((tickAnim - 15) / 20) * (-0.52187-(-0.52187)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -43.71241 + (((tickAnim - 35) / 15) * (0-(-43.71241)));
            yy = -0.07552 + (((tickAnim - 35) / 15) * (0-(-0.07552)));
            zz = -0.52187 + (((tickAnim - 35) / 15) * (0-(-0.52187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.825-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.5-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.825 + (((tickAnim - 15) / 20) * (1.825-(1.825)));
            zz = 0.5 + (((tickAnim - 15) / 20) * (0.5-(0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 1.825 + (((tickAnim - 35) / 15) * (0-(1.825)));
            zz = 0.5 + (((tickAnim - 35) / 15) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 15) / 20) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 19.5 + (((tickAnim - 35) / 15) * (0-(19.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.325-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.425 + (((tickAnim - 15) / 20) * (0.425-(0.425)));
            zz = 0.325 + (((tickAnim - 15) / 20) * (0.325-(0.325)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.425 + (((tickAnim - 35) / 15) * (0-(0.425)));
            zz = 0.325 + (((tickAnim - 35) / 15) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4.75 + (((tickAnim - 15) / 20) * (4.75-(4.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 35) / 15) * (0-(4.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 3.25 + (((tickAnim - 6) / 9) * (2.5-(3.25)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 35) / 5) * (3.42-(2.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 3.42 + (((tickAnim - 40) / 3) * (6.28-(3.42)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 6.28 + (((tickAnim - 43) / 7) * (0-(6.28)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 4.5 + (((tickAnim - 6) / 9) * (-6.75-(4.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 15) / 20) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -6.75 + (((tickAnim - 35) / 5) * (4.75-(-6.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 4.75 + (((tickAnim - 40) / 10) * (0-(4.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (-18-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18 + (((tickAnim - 15) / 20) * (-18-(-18)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -18 + (((tickAnim - 35) / 5) * (-9.5-(-18)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -9.5 + (((tickAnim - 40) / 3) * (1.17-(-9.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 1.17 + (((tickAnim - 43) / 3) * (2.48-(1.17)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 2.48 + (((tickAnim - 46) / 4) * (0-(2.48)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (-4-(0)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4 + (((tickAnim - 15) / 20) * (-4-(-4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4 + (((tickAnim - 35) / 5) * (-21.17-(-4)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -21.17 + (((tickAnim - 40) / 3) * (-13.11-(-21.17)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = -13.11 + (((tickAnim - 43) / 3) * (10.06-(-13.11)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 10.06 + (((tickAnim - 46) / 4) * (0-(10.06)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = -21.75 + (((tickAnim - 15) / 18) * (11.75-(-21.75)));
            yy = 0 + (((tickAnim - 15) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 18) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 33) / 17) * (0-(11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-24.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -24.5 + (((tickAnim - 15) / 9) * (-2-(-24.5)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 24) / 9) * (0-(-2)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            yy = 0.7 + (((tickAnim - 15) / 9) * (2.365-(0.7)));
            zz = 0 + (((tickAnim - 15) / 9) * (-0.4-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 2.365 + (((tickAnim - 24) / 9) * (-0.225-(2.365)));
            zz = -0.4 + (((tickAnim - 24) / 9) * (0-(-0.4)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -0.225 + (((tickAnim - 33) / 17) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-3.31-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -3.31 + (((tickAnim - 7) / 8) * (-28.25-(-3.31)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -28.25 + (((tickAnim - 15) / 4) * (-57.19-(-28.25)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -57.19 + (((tickAnim - 19) / 5) * (-42.75-(-57.19)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -42.75 + (((tickAnim - 24) / 8) * (0-(-42.75)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 33) / 17) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.425-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 15) / 4) * (3.215-(0.95)));
            zz = -0.425 + (((tickAnim - 15) / 4) * (-0.33-(-0.425)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 3.215 + (((tickAnim - 19) / 5) * (2.795-(3.215)));
            zz = -0.33 + (((tickAnim - 19) / 5) * (-0.21-(-0.33)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 2.795 + (((tickAnim - 24) / 8) * (0-(2.795)));
            zz = -0.21 + (((tickAnim - 24) / 8) * (0-(-0.21)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 1) * (0.1-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 0.1 + (((tickAnim - 33) / 17) * (0-(0.1)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (56.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 56.5 + (((tickAnim - 15) / 4) * (-37.96-(56.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = -37.96 + (((tickAnim - 19) / 5) * (-3.75-(-37.96)));
            yy = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 5) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -3.75 + (((tickAnim - 24) / 9) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.875-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.075 + (((tickAnim - 15) / 4) * (0.36-(0.075)));
            zz = 0.875 + (((tickAnim - 15) / 4) * (-0.555-(0.875)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 19) / 5) * (0-(0)));
            yy = 0.36 + (((tickAnim - 19) / 5) * (0.04-(0.36)));
            zz = -0.555 + (((tickAnim - 19) / 5) * (0.04-(-0.555)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0.04 + (((tickAnim - 24) / 9) * (0-(0.04)));
            zz = 0.04 + (((tickAnim - 24) / 9) * (0-(0.04)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToe.rotationPointX = this.leftToe.rotationPointX + (float)(xx);
        this.leftToe.rotationPointY = this.leftToe.rotationPointY - (float)(yy);
        this.leftToe.rotationPointZ = this.leftToe.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.25 + (((tickAnim - 10) / 10) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.25 + (((tickAnim - 10) / 10) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -21.75 + (((tickAnim - 10) / 10) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.25 + (((tickAnim - 10) / 10) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.325 + (((tickAnim - 10) / 10) * (0-(-0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -4.5 + (((tickAnim - 5) / 5) * (-12.5-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -12.5 + (((tickAnim - 10) / 10) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.435-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.435 + (((tickAnim - 5) / 5) * (-0.425-(-0.435)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.425 + (((tickAnim - 10) / 10) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.75 + (((tickAnim - 5) / 5) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 4 && tickAnim < 9) {
            xx = 1 + (((tickAnim - 4) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 4) / 5) * (0-(1)));
            zz = 1 + (((tickAnim - 4) / 5) * (1-(1)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 9) / 1) * (1-(1)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 1 + (((tickAnim - 9) / 1) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 10) / 4) * (1-(1)));
            yy = 0 + (((tickAnim - 10) / 4) * (1-(0)));
            zz = 1 + (((tickAnim - 10) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 520;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-5 + (((tickAnim - 24) / 21) * (-2.25-(10.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = -2.25 + (((tickAnim - 45) / 196) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -2.25 + (((tickAnim - 241) / 159) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -2.25 + (((tickAnim - 400) / 60) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -2.25 + (((tickAnim - 460) / 25) * (-5-(-2.25)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = -5 + (((tickAnim - 485) / 35) * (0-(-5)));
            yy = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Main, Main.rotateAngleX + (float) Math.toRadians(xx), Main.rotateAngleY + (float) Math.toRadians(yy), Main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.26-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            yy = -2.5 + (((tickAnim - 13) / 11) * (-4.95-(-2.5)));
            zz = 1.26 + (((tickAnim - 13) / 11) * (1.95-(1.26)));
        }
        else if (tickAnim >= 24 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 24) / 217) * (0-(0)));
            yy = -4.95 + (((tickAnim - 24) / 217) * (-4.95-(-4.95)));
            zz = 1.95 + (((tickAnim - 24) / 217) * (1.95-(1.95)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = -4.95 + (((tickAnim - 241) / 159) * (-4.95-(-4.95)));
            zz = 1.95 + (((tickAnim - 241) / 159) * (1.95-(1.95)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = -4.95 + (((tickAnim - 400) / 60) * (-4.95-(-4.95)));
            zz = 1.95 + (((tickAnim - 400) / 60) * (1.95-(1.95)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = -4.95 + (((tickAnim - 460) / 25) * (-3.725-(-4.95)));
            zz = 1.95 + (((tickAnim - 460) / 25) * (1.95-(1.95)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            yy = -3.725 + (((tickAnim - 485) / 35) * (0-(-3.725)));
            zz = 1.95 + (((tickAnim - 485) / 35) * (0-(1.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Main.rotationPointX = this.Main.rotationPointX + (float)(xx);
        this.Main.rotationPointY = this.Main.rotationPointY - (float)(yy);
        this.Main.rotationPointZ = this.Main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-6.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+60))*6-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -6.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+60))*6 + (((tickAnim - 24) / 21) * (-7.5-(-6.8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+60))*6)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = -7.5 + (((tickAnim - 45) / 196) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -7.5 + (((tickAnim - 241) / 159) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -7.5 + (((tickAnim - 400) / 60) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -7.5 + (((tickAnim - 460) / 25) * (-6.25-(-7.5)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = -6.25 + (((tickAnim - 485) / 5) * (-1.42-(-6.25)));
            yy = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (0-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 520) {
            xx = -1.42 + (((tickAnim - 490) / 30) * (0-(-1.42)));
            yy = 0 + (((tickAnim - 490) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 490) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01 + (((tickAnim - 45) / 196) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01 + (((tickAnim - 241) / 159) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01 + (((tickAnim - 400) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(xx);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(yy);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -5.5 + (((tickAnim - 24) / 21) * (-7.75-(-5.5)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = -7.75 + (((tickAnim - 45) / 196) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -7.75 + (((tickAnim - 241) / 159) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -7.75 + (((tickAnim - 400) / 60) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -7.75 + (((tickAnim - 460) / 25) * (-2.25-(-7.75)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = -2.25 + (((tickAnim - 485) / 5) * (-9.2-(-2.25)));
            yy = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (0-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = -9.2 + (((tickAnim - 490) / 13) * (0-(-9.2)));
            yy = 0 + (((tickAnim - 490) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 490) / 13) * (0-(0)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 503) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015 + (((tickAnim - 45) / 196) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015 + (((tickAnim - 241) / 159) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015 + (((tickAnim - 400) / 60) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*0.015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Body2.rotationPointX = this.Body2.rotationPointX + (float)(xx);
        this.Body2.rotationPointY = this.Body2.rotationPointY - (float)(yy);
        this.Body2.rotationPointZ = this.Body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -12 + (((tickAnim - 24) / 21) * (-32.5-(-12)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = -32.5 + (((tickAnim - 45) / 196) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = -32.5 + (((tickAnim - 241) / 21) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 21) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 278) {
            xx = -32.5 + (((tickAnim - 262) / 16) * (-22.80632-(-32.5)));
            yy = 0 + (((tickAnim - 262) / 16) * (-3.91882-(0)));
            zz = 0 + (((tickAnim - 262) / 16) * (1.64609-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 297) {
            xx = -22.80632 + (((tickAnim - 278) / 19) * (-27.93509-(-22.80632)));
            yy = -3.91882 + (((tickAnim - 278) / 19) * (-6.57096-(-3.91882)));
            zz = 1.64609 + (((tickAnim - 278) / 19) * (3.05429-(1.64609)));
        }
        else if (tickAnim >= 297 && tickAnim < 400) {
            xx = -27.93509 + (((tickAnim - 297) / 103) * (-27.93509-(-27.93509)));
            yy = -6.57096 + (((tickAnim - 297) / 103) * (-6.57096-(-6.57096)));
            zz = 3.05429 + (((tickAnim - 297) / 103) * (3.05429-(3.05429)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = -27.93509 + (((tickAnim - 400) / 25) * (-4.425-(-27.93509)));
            yy = -6.57096 + (((tickAnim - 400) / 25) * (0-(-6.57096)));
            zz = 3.05429 + (((tickAnim - 400) / 25) * (0-(3.05429)));
        }
        else if (tickAnim >= 425 && tickAnim < 435) {
            xx = -4.425 + (((tickAnim - 425) / 10) * (2-(-4.425)));
            yy = 0 + (((tickAnim - 425) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 10) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = 2 + (((tickAnim - 435) / 10) * (6-(2)));
            yy = 0 + (((tickAnim - 435) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 10) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 460) {
            xx = 6 + (((tickAnim - 445) / 15) * (6-(6)));
            yy = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 15) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 6 + (((tickAnim - 460) / 25) * (-20.25-(6)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = -20.25 + (((tickAnim - 485) / 5) * (-15.05-(-20.25)));
            yy = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (0-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = -15.05 + (((tickAnim - 490) / 13) * (-5.43-(-15.05)));
            yy = 0 + (((tickAnim - 490) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 490) / 13) * (0-(0)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = -5.43 + (((tickAnim - 503) / 17) * (0-(-5.43)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 503) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02 + (((tickAnim - 45) / 196) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02 + (((tickAnim - 241) / 21) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02)));
        }
        else if (tickAnim >= 262 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 262) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 138) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02 + (((tickAnim - 262) / 138) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02)));
        }
        else if (tickAnim >= 400 && tickAnim < 445) {
            xx = 0 + (((tickAnim - 400) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 45) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02 + (((tickAnim - 400) / 45) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-0.02)));
        }
        else if (tickAnim >= 445 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 15) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 460) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.rotationPointX = this.Neck1.rotationPointX + (float)(xx);
        this.Neck1.rotationPointY = this.Neck1.rotationPointY - (float)(yy);
        this.Neck1.rotationPointZ = this.Neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (-2.79-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 45) {
            xx = -2.79 + (((tickAnim - 33) / 12) * (18.25-(-2.79)));
            yy = 0 + (((tickAnim - 33) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 12) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 18.25 + (((tickAnim - 45) / 196) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = 18.25 + (((tickAnim - 241) / 21) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 21) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 278) {
            xx = 18.25 + (((tickAnim - 262) / 16) * (10.25498-(18.25)));
            yy = 0 + (((tickAnim - 262) / 16) * (-4.2434-(0)));
            zz = 0 + (((tickAnim - 262) / 16) * (-2.30382-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 297) {
            xx = 10.25498 + (((tickAnim - 278) / 19) * (8.75498-(10.25498)));
            yy = -4.2434 + (((tickAnim - 278) / 19) * (-4.2434-(-4.2434)));
            zz = -2.30382 + (((tickAnim - 278) / 19) * (-2.30382-(-2.30382)));
        }
        else if (tickAnim >= 297 && tickAnim < 400) {
            xx = 8.75498 + (((tickAnim - 297) / 103) * (8.75498-(8.75498)));
            yy = -4.2434 + (((tickAnim - 297) / 103) * (-4.2434-(-4.2434)));
            zz = -2.30382 + (((tickAnim - 297) / 103) * (-2.30382-(-2.30382)));
        }
        else if (tickAnim >= 400 && tickAnim < 407) {
            xx = 8.75498 + (((tickAnim - 400) / 7) * (10.68498-(8.75498)));
            yy = -4.2434 + (((tickAnim - 400) / 7) * (-2.64147-(-4.2434)));
            zz = -2.30382 + (((tickAnim - 400) / 7) * (-2.46508-(-2.30382)));
        }
        else if (tickAnim >= 407 && tickAnim < 425) {
            xx = 10.68498 + (((tickAnim - 407) / 18) * (19.76747-(10.68498)));
            yy = -2.64147 + (((tickAnim - 407) / 18) * (1.76385-(-2.64147)));
            zz = -2.46508 + (((tickAnim - 407) / 18) * (-2.90853-(-2.46508)));
        }
        else if (tickAnim >= 425 && tickAnim < 435) {
            xx = 19.76747 + (((tickAnim - 425) / 10) * (17.61747-(19.76747)));
            yy = 1.76385 + (((tickAnim - 425) / 10) * (1.76385-(1.76385)));
            zz = -2.90853 + (((tickAnim - 425) / 10) * (-2.90853-(-2.90853)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = 17.61747 + (((tickAnim - 435) / 10) * (15.25-(17.61747)));
            yy = 1.76385 + (((tickAnim - 435) / 10) * (0-(1.76385)));
            zz = -2.90853 + (((tickAnim - 435) / 10) * (0-(-2.90853)));
        }
        else if (tickAnim >= 445 && tickAnim < 454) {
            xx = 15.25 + (((tickAnim - 445) / 9) * (16.5-(15.25)));
            yy = 0 + (((tickAnim - 445) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 9) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 460) {
            xx = 16.5 + (((tickAnim - 454) / 6) * (15.25-(16.5)));
            yy = 0 + (((tickAnim - 454) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 6) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 15.25 + (((tickAnim - 460) / 25) * (12.77289-(15.25)));
            yy = 0 + (((tickAnim - 460) / 25) * (2.97091-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (1.65479-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 12.77289 + (((tickAnim - 485) / 5) * (15.56984-(12.77289)));
            yy = 2.97091 + (((tickAnim - 485) / 5) * (2.57479-(2.97091)));
            zz = 1.65479 + (((tickAnim - 485) / 5) * (1.43415-(1.65479)));
        }
        else if (tickAnim >= 490 && tickAnim < 494) {
            xx = 15.56984 + (((tickAnim - 490) / 4) * (19.03811-(15.56984)));
            yy = 2.57479 + (((tickAnim - 490) / 4) * (2.17867-(2.57479)));
            zz = 1.43415 + (((tickAnim - 490) / 4) * (1.21352-(1.43415)));
        }
        else if (tickAnim >= 494 && tickAnim < 503) {
            xx = 19.03811 + (((tickAnim - 494) / 9) * (15.4826-(19.03811)));
            yy = 2.17867 + (((tickAnim - 494) / 9) * (1.48546-(2.17867)));
            zz = 1.21352 + (((tickAnim - 494) / 9) * (0.8274-(1.21352)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 15.4826 + (((tickAnim - 503) / 17) * (0-(15.4826)));
            yy = 1.48546 + (((tickAnim - 503) / 17) * (0-(1.48546)));
            zz = 0.8274 + (((tickAnim - 503) / 17) * (0-(0.8274)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (-0.35-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = -0.35 + (((tickAnim - 45) / 196) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            zz = -0.35 + (((tickAnim - 241) / 21) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 262 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 262) / 138) * (0-(0)));
            yy = 0 + (((tickAnim - 262) / 138) * (0-(0)));
            zz = -0.35 + (((tickAnim - 262) / 138) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 400 && tickAnim < 445) {
            xx = 0 + (((tickAnim - 400) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 45) * (0-(0)));
            zz = -0.35 + (((tickAnim - 400) / 45) * (-0.175-(-0.35)));
        }
        else if (tickAnim >= 445 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            zz = -0.175 + (((tickAnim - 445) / 15) * (-0.175-(-0.175)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = -0.175 + (((tickAnim - 460) / 25) * (0-(-0.175)));
        }
        else if (tickAnim >= 485 && tickAnim < 494) {
            xx = 0 + (((tickAnim - 485) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 9) * (-0.435-(0)));
        }
        else if (tickAnim >= 494 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 494) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 494) / 26) * (0-(0)));
            zz = -0.435 + (((tickAnim - 494) / 26) * (0-(-0.435)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.rotationPointX = this.Neck2.rotationPointX + (float)(xx);
        this.Neck2.rotationPointY = this.Neck2.rotationPointY - (float)(yy);
        this.Neck2.rotationPointZ = this.Neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = -11.5 + (((tickAnim - 24) / 9) * (-4.06-(-11.5)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = -4.06 + (((tickAnim - 33) / 6) * (15.32-(-4.06)));
            yy = 0 + (((tickAnim - 33) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 6) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = 15.32 + (((tickAnim - 39) / 6) * (28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(15.32)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 45) / 196) * (28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = 28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 241) / 21) * (28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 21) * (0-(0)));
        }
        else if (tickAnim >= 262 && tickAnim < 278) {
            xx = 28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 262) / 16) * (22.4483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(28.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = 0 + (((tickAnim - 262) / 16) * (-7.0543-(0)));
            zz = 0 + (((tickAnim - 262) / 16) * (-3.2174-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 297) {
            xx = 22.4483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 278) / 19) * (32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(22.4483+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = -7.0543 + (((tickAnim - 278) / 19) * (-7.0543-(-7.0543)));
            zz = -3.2174 + (((tickAnim - 278) / 19) * (-3.2174-(-3.2174)));
        }
        else if (tickAnim >= 297 && tickAnim < 400) {
            xx = 32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 297) / 103) * (32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5-(32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = -7.0543 + (((tickAnim - 297) / 103) * (-7.0543-(-7.0543)));
            zz = -3.2174 + (((tickAnim - 297) / 103) * (-3.2174-(-3.2174)));
        }
        else if (tickAnim >= 400 && tickAnim < 407) {
            xx = 32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5 + (((tickAnim - 400) / 7) * (15.86766-(32.6983+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.5)));
            yy = -7.0543 + (((tickAnim - 400) / 7) * (-5.17316-(-7.0543)));
            zz = -3.2174 + (((tickAnim - 400) / 7) * (-2.35943-(-3.2174)));
        }
        else if (tickAnim >= 407 && tickAnim < 413) {
            xx = 15.86766 + (((tickAnim - 407) / 6) * (2.81886-(15.86766)));
            yy = -5.17316 + (((tickAnim - 407) / 6) * (-3.52715-(-5.17316)));
            zz = -2.35943 + (((tickAnim - 407) / 6) * (-1.6087-(-2.35943)));
        }
        else if (tickAnim >= 413 && tickAnim < 425) {
            xx = 2.81886 + (((tickAnim - 413) / 12) * (17.5-(2.81886)));
            yy = -3.52715 + (((tickAnim - 413) / 12) * (0-(-3.52715)));
            zz = -1.6087 + (((tickAnim - 413) / 12) * (0-(-1.6087)));
        }
        else if (tickAnim >= 425 && tickAnim < 435) {
            xx = 17.5 + (((tickAnim - 425) / 10) * (10.75-(17.5)));
            yy = 0 + (((tickAnim - 425) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 10) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = 10.75 + (((tickAnim - 435) / 10) * (-4.75-(10.75)));
            yy = 0 + (((tickAnim - 435) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 10) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 454) {
            xx = -4.75 + (((tickAnim - 445) / 9) * (-5.75-(-4.75)));
            yy = 0 + (((tickAnim - 445) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 9) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 460) {
            xx = -5.75 + (((tickAnim - 454) / 6) * (-4.75-(-5.75)));
            yy = 0 + (((tickAnim - 454) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 6) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 472) {
            xx = -4.75 + (((tickAnim - 460) / 12) * (17.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-20-(-4.75)));
            yy = 0 + (((tickAnim - 460) / 12) * (7.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10-(0)));
            zz = 0 + (((tickAnim - 460) / 12) * (0-(0)));
        }
        else if (tickAnim >= 472 && tickAnim < 485) {
            xx = 17.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-20 + (((tickAnim - 472) / 13) * (22.80088-(17.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-20)));
            yy = 7.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10 + (((tickAnim - 472) / 13) * (13.02521-(7.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10)));
            zz = 0 + (((tickAnim - 472) / 13) * (7.69805-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 22.80088 + (((tickAnim - 485) / 5) * (25.51076-(22.80088)));
            yy = 13.02521 + (((tickAnim - 485) / 5) * (11.28852-(13.02521)));
            zz = 7.69805 + (((tickAnim - 485) / 5) * (6.67164-(7.69805)));
        }
        else if (tickAnim >= 490 && tickAnim < 494) {
            xx = 25.51076 + (((tickAnim - 490) / 4) * (22.35875-(25.51076)));
            yy = 11.28852 + (((tickAnim - 490) / 4) * (9.55182-(11.28852)));
            zz = 6.67164 + (((tickAnim - 490) / 4) * (5.64524-(6.67164)));
        }
        else if (tickAnim >= 494 && tickAnim < 503) {
            xx = 22.35875 + (((tickAnim - 494) / 9) * (-3.78225-(22.35875)));
            yy = 9.55182 + (((tickAnim - 494) / 9) * (6.51261-(9.55182)));
            zz = 5.64524 + (((tickAnim - 494) / 9) * (3.84903-(5.64524)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = -3.78225 + (((tickAnim - 503) / 17) * (0-(-3.78225)));
            yy = 6.51261 + (((tickAnim - 503) / 17) * (0-(6.51261)));
            zz = 3.84903 + (((tickAnim - 503) / 17) * (0-(3.84903)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 0) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 45) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 45) * (-0.125-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = -0.05 + (((tickAnim - 45) / 196) * (-0.05-(-0.05)));
            zz = -0.125 + (((tickAnim - 45) / 196) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 241 && tickAnim < 262) {
            xx = 0 + (((tickAnim - 241) / 21) * (0-(0)));
            yy = -0.05 + (((tickAnim - 241) / 21) * (-0.05-(-0.05)));
            zz = -0.125 + (((tickAnim - 241) / 21) * (-0.125-(-0.125)));
        }
        else if (tickAnim >= 262 && tickAnim < 297) {
            xx = 0 + (((tickAnim - 262) / 35) * (0-(0)));
            yy = -0.05 + (((tickAnim - 262) / 35) * (-0.45-(-0.05)));
            zz = -0.125 + (((tickAnim - 262) / 35) * (-0.47-(-0.125)));
        }
        else if (tickAnim >= 297 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 297) / 103) * (0-(0)));
            yy = -0.45 + (((tickAnim - 297) / 103) * (-0.45-(-0.45)));
            zz = -0.47 + (((tickAnim - 297) / 103) * (-0.47-(-0.47)));
        }
        else if (tickAnim >= 400 && tickAnim < 445) {
            xx = 0 + (((tickAnim - 400) / 45) * (0-(0)));
            yy = -0.45 + (((tickAnim - 400) / 45) * (0-(-0.45)));
            zz = -0.47 + (((tickAnim - 400) / 45) * (0-(-0.47)));
        }
        else if (tickAnim >= 445 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 445) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 15) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 494) {
            xx = 0 + (((tickAnim - 490) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 490) / 4) * (0-(0)));
            zz = -0.275 + (((tickAnim - 490) / 4) * (0-(-0.275)));
        }
        else if (tickAnim >= 494 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 494) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 494) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 494) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Head.rotationPointX = this.Head.rotationPointX + (float)(xx);
        this.Head.rotationPointY = this.Head.rotationPointY - (float)(yy);
        this.Head.rotationPointZ = this.Head.rotationPointZ + (float)(zz);




        if (tickAnim >= 413 && tickAnim < 425) {
            xx = 0 + (((tickAnim - 413) / 12) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 413) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 413) / 12) * (0-(0)));
        }
        else if (tickAnim >= 425 && tickAnim < 435) {
            xx = -33.25 + (((tickAnim - 425) / 10) * (-40.75-(-33.25)));
            yy = 0 + (((tickAnim - 425) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 425) / 10) * (0-(0)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = -40.75 + (((tickAnim - 435) / 10) * (0-(-40.75)));
            yy = 0 + (((tickAnim - 435) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 435) / 10) * (0-(0)));
        }
        else if (tickAnim >= 445 && tickAnim < 454) {
            xx = 0 + (((tickAnim - 445) / 9) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 445) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 445) / 9) * (0-(0)));
        }
        else if (tickAnim >= 454 && tickAnim < 460) {
            xx = -5.25 + (((tickAnim - 454) / 6) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 454) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 454) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (10.75-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0.62461-(0)));
            yy = -7.5 + (((tickAnim - 24) / 21) * (-7.47409-(-7.5)));
            zz = 10.75 + (((tickAnim - 24) / 21) * (5.9592-(10.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0.62461 + (((tickAnim - 45) / 196) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 45) / 196) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 45) / 196) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0.62461 + (((tickAnim - 241) / 159) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 241) / 159) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 241) / 159) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0.62461 + (((tickAnim - 400) / 60) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 400) / 60) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 400) / 60) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0.62461 + (((tickAnim - 460) / 25) * (12.9108-(0.62461)));
            yy = -7.47409 + (((tickAnim - 460) / 25) * (9.23989-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 460) / 25) * (-2.71066-(5.9592)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 12.9108 + (((tickAnim - 485) / 5) * (12.46697-(12.9108)));
            yy = 9.23989 + (((tickAnim - 485) / 5) * (5.79805-(9.23989)));
            zz = -2.71066 + (((tickAnim - 485) / 5) * (8.24889-(-2.71066)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = 12.46697 + (((tickAnim - 490) / 13) * (0-(12.46697)));
            yy = 5.79805 + (((tickAnim - 490) / 13) * (0-(5.79805)));
            zz = 8.24889 + (((tickAnim - 490) / 13) * (-10-(8.24889)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = -10 + (((tickAnim - 503) / 17) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (41.5-(0)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 41.5 + (((tickAnim - 45) / 196) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 41.5 + (((tickAnim - 241) / 159) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 41.5 + (((tickAnim - 400) / 60) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 41.5 + (((tickAnim - 460) / 25) * (-16.24853-(41.5)));
            yy = 0 + (((tickAnim - 460) / 25) * (5.10842-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (22.98112-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = -16.24853 + (((tickAnim - 485) / 5) * (-30.24664-(-16.24853)));
            yy = 5.10842 + (((tickAnim - 485) / 5) * (-0.21592-(5.10842)));
            zz = 22.98112 + (((tickAnim - 485) / 5) * (1.992-(22.98112)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = -30.24664 + (((tickAnim - 490) / 13) * (0-(-30.24664)));
            yy = -0.21592 + (((tickAnim - 490) / 13) * (0-(-0.21592)));
            zz = 1.992 + (((tickAnim - 490) / 13) * (34-(1.992)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = 34 + (((tickAnim - 503) / 17) * (0-(34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 485) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 485) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 5) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (0-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = 0 + (((tickAnim - 490) / 13) * (0-(0)));
            yy = -0.725 + (((tickAnim - 490) / 13) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 490) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (11.14915-(0)));
            yy = 0 + (((tickAnim - 24) / 21) * (-9.32389-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (-1.82886-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 11.14915 + (((tickAnim - 45) / 196) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 45) / 196) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 45) / 196) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 11.14915 + (((tickAnim - 241) / 159) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 241) / 159) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 241) / 159) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 11.14915 + (((tickAnim - 400) / 60) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 400) / 60) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 400) / 60) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 460 && tickAnim < 503) {
            xx = 11.14915 + (((tickAnim - 460) / 43) * (0-(11.14915)));
            yy = -9.32389 + (((tickAnim - 460) / 43) * (0-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 460) / 43) * (0-(-1.82886)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 503) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (-10.75-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (0.62461-(0)));
            yy = -7.5 + (((tickAnim - 24) / 21) * (-7.47409-(-7.5)));
            zz = -10.75 + (((tickAnim - 24) / 21) * (5.9592-(-10.75)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0.62461 + (((tickAnim - 45) / 196) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 45) / 196) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 45) / 196) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0.62461 + (((tickAnim - 241) / 159) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 241) / 159) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 241) / 159) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0.62461 + (((tickAnim - 400) / 60) * (0.62461-(0.62461)));
            yy = -7.47409 + (((tickAnim - 400) / 60) * (-7.47409-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 400) / 60) * (5.9592-(5.9592)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0.62461 + (((tickAnim - 460) / 25) * (11.32636-(0.62461)));
            yy = -7.47409 + (((tickAnim - 460) / 25) * (-11.13321-(-7.47409)));
            zz = 5.9592 + (((tickAnim - 460) / 25) * (11.6509-(5.9592)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = 11.32636 + (((tickAnim - 485) / 5) * (11.80535-(11.32636)));
            yy = -11.13321 + (((tickAnim - 485) / 5) * (-7.06058-(-11.13321)));
            zz = 11.6509 + (((tickAnim - 485) / 5) * (-2.34595-(11.6509)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = 11.80535 + (((tickAnim - 490) / 13) * (0-(11.80535)));
            yy = -7.06058 + (((tickAnim - 490) / 13) * (0-(-7.06058)));
            zz = -2.34595 + (((tickAnim - 490) / 13) * (10-(-2.34595)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = 10 + (((tickAnim - 503) / 17) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (41.5-(0)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 41.5 + (((tickAnim - 45) / 196) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 41.5 + (((tickAnim - 241) / 159) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 41.5 + (((tickAnim - 400) / 60) * (41.5-(41.5)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 41.5 + (((tickAnim - 460) / 25) * (-15.67679-(41.5)));
            yy = 0 + (((tickAnim - 460) / 25) * (-6.69098-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (-28.53869-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 490) {
            xx = -15.67679 + (((tickAnim - 485) / 5) * (-33.49664-(-15.67679)));
            yy = -6.69098 + (((tickAnim - 485) / 5) * (-0.21592-(-6.69098)));
            zz = -28.53869 + (((tickAnim - 485) / 5) * (-1.992-(-28.53869)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = -33.49664 + (((tickAnim - 490) / 13) * (0-(-33.49664)));
            yy = -0.21592 + (((tickAnim - 490) / 13) * (0-(-0.21592)));
            zz = -1.992 + (((tickAnim - 490) / 13) * (-34-(-1.992)));
        }
        else if (tickAnim >= 503 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 503) / 17) * (0-(0)));
            zz = -34 + (((tickAnim - 503) / 17) * (0-(-34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 485 && tickAnim < 490) {
            xx = 0 + (((tickAnim - 485) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 5) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 485) / 5) * (0-(0)));
        }
        else if (tickAnim >= 490 && tickAnim < 503) {
            xx = 0 + (((tickAnim - 490) / 13) * (0-(0)));
            yy = -0.825 + (((tickAnim - 490) / 13) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 490) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 24) / 21) * (11.14915-(0)));
            yy = 0 + (((tickAnim - 24) / 21) * (-9.32389-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (-1.82886-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 11.14915 + (((tickAnim - 45) / 196) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 45) / 196) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 45) / 196) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 11.14915 + (((tickAnim - 241) / 159) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 241) / 159) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 241) / 159) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 11.14915 + (((tickAnim - 400) / 60) * (11.14915-(11.14915)));
            yy = -9.32389 + (((tickAnim - 400) / 60) * (-9.32389-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 400) / 60) * (-1.82886-(-1.82886)));
        }
        else if (tickAnim >= 460 && tickAnim < 520) {
            xx = 11.14915 + (((tickAnim - 460) / 60) * (0-(11.14915)));
            yy = -9.32389 + (((tickAnim - 460) / 60) * (0-(-9.32389)));
            zz = -1.82886 + (((tickAnim - 460) / 60) * (0-(-1.82886)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = 16.75 + (((tickAnim - 24) / 21) * (35.66785-(16.75)));
            yy = 0 + (((tickAnim - 24) / 21) * (3.65048-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (-0.6945-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 35.66785 + (((tickAnim - 45) / 196) * (35.66785-(35.66785)));
            yy = 3.65048 + (((tickAnim - 45) / 196) * (3.65048-(3.65048)));
            zz = -0.6945 + (((tickAnim - 45) / 196) * (-0.6945-(-0.6945)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 35.66785 + (((tickAnim - 241) / 159) * (35.66785-(35.66785)));
            yy = 3.65048 + (((tickAnim - 241) / 159) * (3.65048-(3.65048)));
            zz = -0.6945 + (((tickAnim - 241) / 159) * (-0.6945-(-0.6945)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 35.66785 + (((tickAnim - 400) / 60) * (35.66785-(35.66785)));
            yy = 3.65048 + (((tickAnim - 400) / 60) * (3.65048-(3.65048)));
            zz = -0.6945 + (((tickAnim - 400) / 60) * (-0.6945-(-0.6945)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 35.66785 + (((tickAnim - 460) / 25) * (23.41785-(35.66785)));
            yy = 3.65048 + (((tickAnim - 460) / 25) * (3.65048-(3.65048)));
            zz = -0.6945 + (((tickAnim - 460) / 25) * (-0.6945-(-0.6945)));
        }
        else if (tickAnim >= 485 && tickAnim < 501) {
            xx = 23.41785 + (((tickAnim - 485) / 16) * (29.48952-(23.41785)));
            yy = 3.65048 + (((tickAnim - 485) / 16) * (1.94692-(3.65048)));
            zz = -0.6945 + (((tickAnim - 485) / 16) * (-0.3704-(-0.6945)));
        }
        else if (tickAnim >= 501 && tickAnim < 520) {
            xx = 29.48952 + (((tickAnim - 501) / 19) * (0-(29.48952)));
            yy = 1.94692 + (((tickAnim - 501) / 19) * (0-(1.94692)));
            zz = -0.3704 + (((tickAnim - 501) / 19) * (0-(-0.3704)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20.04-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -20.04 + (((tickAnim - 13) / 11) * (-37.5-(-20.04)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -37.5 + (((tickAnim - 24) / 11) * (-26-(-37.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -26 + (((tickAnim - 35) / 10) * (-37.5-(-26)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = -37.5 + (((tickAnim - 45) / 196) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -37.5 + (((tickAnim - 241) / 159) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -37.5 + (((tickAnim - 400) / 60) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -37.5 + (((tickAnim - 460) / 25) * (-18-(-37.5)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 501) {
            xx = -18 + (((tickAnim - 485) / 16) * (-64.35-(-18)));
            yy = 0 + (((tickAnim - 485) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 16) * (0-(0)));
        }
        else if (tickAnim >= 501 && tickAnim < 520) {
            xx = -64.35 + (((tickAnim - 501) / 19) * (0-(-64.35)));
            yy = 0 + (((tickAnim - 501) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 501) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.475-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 1.65 + (((tickAnim - 24) / 11) * (3.075-(1.65)));
            zz = 0.475 + (((tickAnim - 24) / 11) * (0.13-(0.475)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 3.075 + (((tickAnim - 35) / 10) * (1.65-(3.075)));
            zz = 0.13 + (((tickAnim - 35) / 10) * (0.475-(0.13)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 1.65 + (((tickAnim - 45) / 196) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 45) / 196) * (0.475-(0.475)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 1.65 + (((tickAnim - 241) / 159) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 241) / 159) * (0.475-(0.475)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 1.65 + (((tickAnim - 400) / 60) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 400) / 60) * (0.475-(0.475)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 1.65 + (((tickAnim - 460) / 25) * (1.4-(1.65)));
            zz = 0.475 + (((tickAnim - 460) / 25) * (0.18-(0.475)));
        }
        else if (tickAnim >= 485 && tickAnim < 501) {
            xx = 0 + (((tickAnim - 485) / 16) * (0-(0)));
            yy = 1.4 + (((tickAnim - 485) / 16) * (1.825-(1.4)));
            zz = 0.18 + (((tickAnim - 485) / 16) * (1.025-(0.18)));
        }
        else if (tickAnim >= 501 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 501) / 19) * (0-(0)));
            yy = 1.825 + (((tickAnim - 501) / 19) * (0-(1.825)));
            zz = 1.025 + (((tickAnim - 501) / 19) * (0-(1.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.31-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 6.31 + (((tickAnim - 13) / 11) * (4-(6.31)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 24) / 11) * (-7-(4)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -7 + (((tickAnim - 35) / 10) * (4-(-7)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 4 + (((tickAnim - 45) / 196) * (4-(4)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 4 + (((tickAnim - 241) / 159) * (4-(4)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 4 + (((tickAnim - 400) / 60) * (4-(4)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 4 + (((tickAnim - 460) / 25) * (-0.5-(4)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 501) {
            xx = -0.5 + (((tickAnim - 485) / 16) * (-51.52-(-0.5)));
            yy = 0 + (((tickAnim - 485) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 16) * (0-(0)));
        }
        else if (tickAnim >= 501 && tickAnim < 511) {
            xx = -51.52 + (((tickAnim - 501) / 10) * (-1.51-(-51.52)));
            yy = 0 + (((tickAnim - 501) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 501) / 10) * (0-(0)));
        }
        else if (tickAnim >= 511 && tickAnim < 520) {
            xx = -1.51 + (((tickAnim - 511) / 9) * (0-(-1.51)));
            yy = 0 + (((tickAnim - 511) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 511) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            yy = 0.825 + (((tickAnim - 13) / 11) * (1.2-(0.825)));
            zz = 0 + (((tickAnim - 13) / 11) * (-0.275-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 1.2 + (((tickAnim - 24) / 11) * (1.225-(1.2)));
            zz = -0.275 + (((tickAnim - 24) / 11) * (-0.28-(-0.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 1.225 + (((tickAnim - 35) / 10) * (1.2-(1.225)));
            zz = -0.28 + (((tickAnim - 35) / 10) * (-0.275-(-0.28)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 1.2 + (((tickAnim - 45) / 196) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 45) / 196) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 1.2 + (((tickAnim - 241) / 159) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 241) / 159) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 1.2 + (((tickAnim - 400) / 60) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 400) / 60) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 1.2 + (((tickAnim - 460) / 25) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 460) / 25) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 485 && tickAnim < 501) {
            xx = 0 + (((tickAnim - 485) / 16) * (0-(0)));
            yy = 1.2 + (((tickAnim - 485) / 16) * (2.79-(1.2)));
            zz = -0.275 + (((tickAnim - 485) / 16) * (-0.5-(-0.275)));
        }
        else if (tickAnim >= 501 && tickAnim < 511) {
            xx = 0 + (((tickAnim - 501) / 10) * (0-(0)));
            yy = 2.79 + (((tickAnim - 501) / 10) * (1.565-(2.79)));
            zz = -0.5 + (((tickAnim - 501) / 10) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 511 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 511) / 9) * (0-(0)));
            yy = 1.565 + (((tickAnim - 511) / 9) * (0-(1.565)));
            zz = -0.25 + (((tickAnim - 511) / 9) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = -12.75 + (((tickAnim - 35) / 10) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 400) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 85) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 485) / 8) * (42.12-(0)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 498) {
            xx = 42.12 + (((tickAnim - 493) / 5) * (24.27-(42.12)));
            yy = 0 + (((tickAnim - 493) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 493) / 5) * (0-(0)));
        }
        else if (tickAnim >= 498 && tickAnim < 501) {
            xx = 24.27 + (((tickAnim - 498) / 3) * (-26.75-(24.27)));
            yy = 0 + (((tickAnim - 498) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 498) / 3) * (0-(0)));
        }
        else if (tickAnim >= 501 && tickAnim < 514) {
            xx = -26.75 + (((tickAnim - 501) / 13) * (22.75-(-26.75)));
            yy = 0 + (((tickAnim - 501) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 501) / 13) * (0-(0)));
        }
        else if (tickAnim >= 514 && tickAnim < 520) {
            xx = 22.75 + (((tickAnim - 514) / 6) * (0-(22.75)));
            yy = 0 + (((tickAnim - 514) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 514) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToe, rightToe.rotateAngleX + (float) Math.toRadians(xx), rightToe.rotateAngleY + (float) Math.toRadians(yy), rightToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (0.1-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 35) / 10) * (0-(0.1)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 400) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 85) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 493) {
            xx = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 485) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 8) * (0.75-(0)));
        }
        else if (tickAnim >= 493 && tickAnim < 498) {
            xx = 0 + (((tickAnim - 493) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 493) / 5) * (-0.075-(0)));
            zz = 0.75 + (((tickAnim - 493) / 5) * (0.15-(0.75)));
        }
        else if (tickAnim >= 498 && tickAnim < 501) {
            xx = 0 + (((tickAnim - 498) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 498) / 3) * (0.2-(-0.075)));
            zz = 0.15 + (((tickAnim - 498) / 3) * (-0.3-(0.15)));
        }
        else if (tickAnim >= 501 && tickAnim < 514) {
            xx = 0 + (((tickAnim - 501) / 13) * (0-(0)));
            yy = 0.2 + (((tickAnim - 501) / 13) * (-0.1-(0.2)));
            zz = -0.3 + (((tickAnim - 501) / 13) * (0.4-(-0.3)));
        }
        else if (tickAnim >= 514 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 514) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 514) / 6) * (0-(-0.1)));
            zz = 0.4 + (((tickAnim - 514) / 6) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToe.rotationPointX = this.rightToe.rotationPointX + (float)(xx);
        this.rightToe.rotationPointY = this.rightToe.rotationPointY - (float)(yy);
        this.rightToe.rotationPointZ = this.rightToe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 16.75 + (((tickAnim - 24) / 11) * (28.35-(16.75)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 28.35 + (((tickAnim - 35) / 6) * (33.31-(28.35)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 33.31 + (((tickAnim - 41) / 4) * (36-(33.31)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 241) {
            xx = 36 + (((tickAnim - 45) / 196) * (36-(36)));
            yy = 0 + (((tickAnim - 45) / 196) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 196) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 36 + (((tickAnim - 241) / 159) * (36-(36)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 36 + (((tickAnim - 400) / 60) * (36-(36)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 36 + (((tickAnim - 460) / 25) * (32.66785-(36)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = 32.66785 + (((tickAnim - 485) / 35) * (0-(32.66785)));
            yy = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-20.04-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = -20.04 + (((tickAnim - 13) / 11) * (-37.5-(-20.04)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 241) {
            xx = -37.5 + (((tickAnim - 24) / 217) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 24) / 217) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 217) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -37.5 + (((tickAnim - 241) / 159) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -37.5 + (((tickAnim - 400) / 60) * (-37.5-(-37.5)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -37.5 + (((tickAnim - 460) / 25) * (-20.75-(-37.5)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = -20.75 + (((tickAnim - 485) / 35) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (1.65-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0.475-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 24) / 217) * (0-(0)));
            yy = 1.65 + (((tickAnim - 24) / 217) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 24) / 217) * (0.475-(0.475)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 1.65 + (((tickAnim - 241) / 159) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 241) / 159) * (0.475-(0.475)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 1.65 + (((tickAnim - 400) / 60) * (1.65-(1.65)));
            zz = 0.475 + (((tickAnim - 400) / 60) * (0.475-(0.475)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 1.65 + (((tickAnim - 460) / 25) * (1.225-(1.65)));
            zz = 0.475 + (((tickAnim - 460) / 25) * (0.1-(0.475)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            yy = 1.225 + (((tickAnim - 485) / 35) * (0-(1.225)));
            zz = 0.1 + (((tickAnim - 485) / 35) * (0-(0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (6.31-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 6.31 + (((tickAnim - 13) / 11) * (4-(6.31)));
            yy = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 11) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 241) {
            xx = 4 + (((tickAnim - 24) / 217) * (4-(4)));
            yy = 0 + (((tickAnim - 24) / 217) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 217) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 4 + (((tickAnim - 241) / 159) * (4-(4)));
            yy = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 159) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 4 + (((tickAnim - 400) / 60) * (4-(4)));
            yy = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 60) * (0-(0)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 4 + (((tickAnim - 460) / 25) * (-8.25-(4)));
            yy = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 460) / 25) * (0-(0)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = -8.25 + (((tickAnim - 485) / 35) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 485) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 13) / 11) * (0-(0)));
            yy = 0.825 + (((tickAnim - 13) / 11) * (1.2-(0.825)));
            zz = 0 + (((tickAnim - 13) / 11) * (-0.275-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 24) / 217) * (0-(0)));
            yy = 1.2 + (((tickAnim - 24) / 217) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 24) / 217) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 241) / 159) * (0-(0)));
            yy = 1.2 + (((tickAnim - 241) / 159) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 241) / 159) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 400) / 60) * (0-(0)));
            yy = 1.2 + (((tickAnim - 400) / 60) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 400) / 60) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 0 + (((tickAnim - 460) / 25) * (0-(0)));
            yy = 1.2 + (((tickAnim - 460) / 25) * (1.2-(1.2)));
            zz = -0.275 + (((tickAnim - 460) / 25) * (-0.275-(-0.275)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 485) / 35) * (0-(0)));
            yy = 1.2 + (((tickAnim - 485) / 35) * (0-(1.2)));
            zz = -0.275 + (((tickAnim - 485) / 35) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(0), leftToe.rotateAngleY + (float) Math.toRadians(0), leftToe.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 4.75 + (((tickAnim - 9) / 15) * (0-(4.75)));
            yy = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 15) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 24) / 12) * (7.35-(0)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 7.35 + (((tickAnim - 36) / 9) * (10.25-(7.35)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 97) {
            xx = 10.25 + (((tickAnim - 45) / 52) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 45) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 52) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 150) {
            xx = 10.25 + (((tickAnim - 97) / 53) * (10.25148-(10.25)));
            yy = 0 + (((tickAnim - 97) / 53) * (-1.24257-(0)));
            zz = 0 + (((tickAnim - 97) / 53) * (-0.1361-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 241) {
            xx = 10.25148 + (((tickAnim - 150) / 91) * (10.25148-(10.25148)));
            yy = -1.24257 + (((tickAnim - 150) / 91) * (-1.24257-(-1.24257)));
            zz = -0.1361 + (((tickAnim - 150) / 91) * (-0.1361-(-0.1361)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 10.25148 + (((tickAnim - 241) / 159) * (10.25148-(10.25148)));
            yy = -1.24257 + (((tickAnim - 241) / 159) * (-1.24257-(-1.24257)));
            zz = -0.1361 + (((tickAnim - 241) / 159) * (-0.1361-(-0.1361)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 10.25148 + (((tickAnim - 400) / 60) * (10.25148-(10.25148)));
            yy = -1.24257 + (((tickAnim - 400) / 60) * (-1.24257-(-1.24257)));
            zz = -0.1361 + (((tickAnim - 400) / 60) * (-0.1361-(-0.1361)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 10.25148 + (((tickAnim - 460) / 25) * (15.50148-(10.25148)));
            yy = -1.24257 + (((tickAnim - 460) / 25) * (-1.24257-(-1.24257)));
            zz = -0.1361 + (((tickAnim - 460) / 25) * (-0.1361-(-0.1361)));
        }
        else if (tickAnim >= 485 && tickAnim < 520) {
            xx = 15.50148 + (((tickAnim - 485) / 35) * (0-(15.50148)));
            yy = -1.24257 + (((tickAnim - 485) / 35) * (0-(-1.24257)));
            zz = -0.1361 + (((tickAnim - 485) / 35) * (0-(-0.1361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (9.63-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 24) {
            xx = 9.63 + (((tickAnim - 9) / 15) * (-5.5-(9.63)));
            yy = 0 + (((tickAnim - 9) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 15) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 36) {
            xx = -5.5 + (((tickAnim - 24) / 12) * (2.25-(-5.5)));
            yy = 0 + (((tickAnim - 24) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 12) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 41) {
            xx = 2.25 + (((tickAnim - 36) / 5) * (5.55-(2.25)));
            yy = 0 + (((tickAnim - 36) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 5) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 5.55 + (((tickAnim - 41) / 4) * (6-(5.55)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 97) {
            xx = 6 + (((tickAnim - 45) / 52) * (6-(6)));
            yy = 0 + (((tickAnim - 45) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 52) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 150) {
            xx = 6 + (((tickAnim - 97) / 53) * (6.00278-(6)));
            yy = 0 + (((tickAnim - 97) / 53) * (-1.74041-(0)));
            zz = 0 + (((tickAnim - 97) / 53) * (-0.18298-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 241) {
            xx = 6.00278 + (((tickAnim - 150) / 91) * (6.00278-(6.00278)));
            yy = -1.74041 + (((tickAnim - 150) / 91) * (-1.74041-(-1.74041)));
            zz = -0.18298 + (((tickAnim - 150) / 91) * (-0.18298-(-0.18298)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = 6.00278 + (((tickAnim - 241) / 159) * (6.00278-(6.00278)));
            yy = -1.74041 + (((tickAnim - 241) / 159) * (-1.74041-(-1.74041)));
            zz = -0.18298 + (((tickAnim - 241) / 159) * (-0.18298-(-0.18298)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = 6.00278 + (((tickAnim - 400) / 60) * (6.00278-(6.00278)));
            yy = -1.74041 + (((tickAnim - 400) / 60) * (-1.74041-(-1.74041)));
            zz = -0.18298 + (((tickAnim - 400) / 60) * (-0.18298-(-0.18298)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = 6.00278 + (((tickAnim - 460) / 25) * (3.00278-(6.00278)));
            yy = -1.74041 + (((tickAnim - 460) / 25) * (-1.74041-(-1.74041)));
            zz = -0.18298 + (((tickAnim - 460) / 25) * (-0.18298-(-0.18298)));
        }
        else if (tickAnim >= 485 && tickAnim < 499) {
            xx = 3.00278 + (((tickAnim - 485) / 14) * (9.30167-(3.00278)));
            yy = -1.74041 + (((tickAnim - 485) / 14) * (-1.04425-(-1.74041)));
            zz = -0.18298 + (((tickAnim - 485) / 14) * (-0.10979-(-0.18298)));
        }
        else if (tickAnim >= 499 && tickAnim < 520) {
            xx = 9.30167 + (((tickAnim - 499) / 21) * (0-(9.30167)));
            yy = -1.04425 + (((tickAnim - 499) / 21) * (0-(-1.04425)));
            zz = -0.10979 + (((tickAnim - 499) / 21) * (0-(-0.10979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 2.87 + (((tickAnim - 7) / 8) * (-1.11-(2.87)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -1.11 + (((tickAnim - 15) / 9) * (-5.25-(-1.11)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 41) {
            xx = -5.25 + (((tickAnim - 24) / 17) * (-3.72-(-5.25)));
            yy = 0 + (((tickAnim - 24) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 17) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -3.72 + (((tickAnim - 41) / 4) * (-4.25-(-3.72)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 97) {
            xx = -4.25 + (((tickAnim - 45) / 52) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 45) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 52) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 150) {
            xx = -4.25 + (((tickAnim - 97) / 53) * (-4.25036-(-4.25)));
            yy = 0 + (((tickAnim - 97) / 53) * (0.74794-(0)));
            zz = 0 + (((tickAnim - 97) / 53) * (-0.05558-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 241) {
            xx = -4.25036 + (((tickAnim - 150) / 91) * (-4.25036-(-4.25036)));
            yy = 0.74794 + (((tickAnim - 150) / 91) * (0.74794-(0.74794)));
            zz = -0.05558 + (((tickAnim - 150) / 91) * (-0.05558-(-0.05558)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -4.25036 + (((tickAnim - 241) / 159) * (-4.25036-(-4.25036)));
            yy = 0.74794 + (((tickAnim - 241) / 159) * (0.74794-(0.74794)));
            zz = -0.05558 + (((tickAnim - 241) / 159) * (-0.05558-(-0.05558)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -4.25036 + (((tickAnim - 400) / 60) * (-4.25036-(-4.25036)));
            yy = 0.74794 + (((tickAnim - 400) / 60) * (0.74794-(0.74794)));
            zz = -0.05558 + (((tickAnim - 400) / 60) * (-0.05558-(-0.05558)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -4.25036 + (((tickAnim - 460) / 25) * (0.24964-(-4.25036)));
            yy = 0.74794 + (((tickAnim - 460) / 25) * (0.74794-(0.74794)));
            zz = -0.05558 + (((tickAnim - 460) / 25) * (-0.05558-(-0.05558)));
        }
        else if (tickAnim >= 485 && tickAnim < 499) {
            xx = 0.24964 + (((tickAnim - 485) / 14) * (8.14978-(0.24964)));
            yy = 0.74794 + (((tickAnim - 485) / 14) * (0.44876-(0.74794)));
            zz = -0.05558 + (((tickAnim - 485) / 14) * (-0.03335-(-0.05558)));
        }
        else if (tickAnim >= 499 && tickAnim < 520) {
            xx = 8.14978 + (((tickAnim - 499) / 21) * (0-(8.14978)));
            yy = 0.44876 + (((tickAnim - 499) / 21) * (0-(0.44876)));
            zz = -0.03335 + (((tickAnim - 499) / 21) * (0-(-0.03335)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6 + (((tickAnim - 4) / 3) * (-1.49-(-6)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -1.49 + (((tickAnim - 7) / 2) * (-8.6-(-1.49)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -8.6 + (((tickAnim - 9) / 6) * (-8.23-(-8.6)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -8.23 + (((tickAnim - 15) / 9) * (-6-(-8.23)));
            yy = 0 + (((tickAnim - 15) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 9) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 45) {
            xx = -6 + (((tickAnim - 24) / 21) * (-7.75-(-6)));
            yy = 0 + (((tickAnim - 24) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 21) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 97) {
            xx = -7.75 + (((tickAnim - 45) / 52) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 45) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 52) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 150) {
            xx = -7.75 + (((tickAnim - 97) / 53) * (-7.75357-(-7.75)));
            yy = 0 + (((tickAnim - 97) / 53) * (1.73401-(0)));
            zz = 0 + (((tickAnim - 97) / 53) * (-0.23606-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 241) {
            xx = -7.75357 + (((tickAnim - 150) / 91) * (-7.75357-(-7.75357)));
            yy = 1.73401 + (((tickAnim - 150) / 91) * (1.73401-(1.73401)));
            zz = -0.23606 + (((tickAnim - 150) / 91) * (-0.23606-(-0.23606)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -7.75357 + (((tickAnim - 241) / 159) * (-7.75357-(-7.75357)));
            yy = 1.73401 + (((tickAnim - 241) / 159) * (1.73401-(1.73401)));
            zz = -0.23606 + (((tickAnim - 241) / 159) * (-0.23606-(-0.23606)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -7.75357 + (((tickAnim - 400) / 60) * (-7.75357-(-7.75357)));
            yy = 1.73401 + (((tickAnim - 400) / 60) * (1.73401-(1.73401)));
            zz = -0.23606 + (((tickAnim - 400) / 60) * (-0.23606-(-0.23606)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -7.75357 + (((tickAnim - 460) / 25) * (-9.25357-(-7.75357)));
            yy = 1.73401 + (((tickAnim - 460) / 25) * (1.73401-(1.73401)));
            zz = -0.23606 + (((tickAnim - 460) / 25) * (-0.23606-(-0.23606)));
        }
        else if (tickAnim >= 485 && tickAnim < 499) {
            xx = -9.25357 + (((tickAnim - 485) / 14) * (-9.86293-(-9.25357)));
            yy = 1.73401 + (((tickAnim - 485) / 14) * (1.30667-(1.73401)));
            zz = -0.23606 + (((tickAnim - 485) / 14) * (-0.17788-(-0.23606)));
        }
        else if (tickAnim >= 499 && tickAnim < 506) {
            xx = -9.86293 + (((tickAnim - 499) / 7) * (3.70739-(-9.86293)));
            yy = 1.30667 + (((tickAnim - 499) / 7) * (1.093-(1.30667)));
            zz = -0.17788 + (((tickAnim - 499) / 7) * (-0.1488-(-0.17788)));
        }
        else if (tickAnim >= 506 && tickAnim < 513) {
            xx = 3.70739 + (((tickAnim - 506) / 7) * (4.10369-(3.70739)));
            yy = 1.093 + (((tickAnim - 506) / 7) * (0.5465-(1.093)));
            zz = -0.1488 + (((tickAnim - 506) / 7) * (-0.0744-(-0.1488)));
        }
        else if (tickAnim >= 513 && tickAnim < 520) {
            xx = 4.10369 + (((tickAnim - 513) / 7) * (0-(4.10369)));
            yy = 0.5465 + (((tickAnim - 513) / 7) * (0-(0.5465)));
            zz = -0.0744 + (((tickAnim - 513) / 7) * (0-(-0.0744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-13.39-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -13.39 + (((tickAnim - 4) / 3) * (2.37-(-13.39)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 2.37 + (((tickAnim - 7) / 2) * (-10.75-(2.37)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -10.75 + (((tickAnim - 9) / 5) * (-8.53-(-10.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = -8.53 + (((tickAnim - 14) / 10) * (-9.75-(-8.53)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 97) {
            xx = -9.75 + (((tickAnim - 24) / 73) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 24) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 73) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 150) {
            xx = -9.75 + (((tickAnim - 97) / 53) * (-9.77052-(-9.75)));
            yy = 0 + (((tickAnim - 97) / 53) * (3.69576-(0)));
            zz = 0 + (((tickAnim - 97) / 53) * (-0.63594-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 241) {
            xx = -9.77052 + (((tickAnim - 150) / 91) * (-9.77052-(-9.77052)));
            yy = 3.69576 + (((tickAnim - 150) / 91) * (3.69576-(3.69576)));
            zz = -0.63594 + (((tickAnim - 150) / 91) * (-0.63594-(-0.63594)));
        }
        else if (tickAnim >= 241 && tickAnim < 400) {
            xx = -9.77052 + (((tickAnim - 241) / 159) * (-9.77052-(-9.77052)));
            yy = 3.69576 + (((tickAnim - 241) / 159) * (3.69576-(3.69576)));
            zz = -0.63594 + (((tickAnim - 241) / 159) * (-0.63594-(-0.63594)));
        }
        else if (tickAnim >= 400 && tickAnim < 460) {
            xx = -9.77052 + (((tickAnim - 400) / 60) * (-9.77052-(-9.77052)));
            yy = 3.69576 + (((tickAnim - 400) / 60) * (3.69576-(3.69576)));
            zz = -0.63594 + (((tickAnim - 400) / 60) * (-0.63594-(-0.63594)));
        }
        else if (tickAnim >= 460 && tickAnim < 485) {
            xx = -9.77052 + (((tickAnim - 460) / 25) * (-7.52052-(-9.77052)));
            yy = 3.69576 + (((tickAnim - 460) / 25) * (3.69576-(3.69576)));
            zz = -0.63594 + (((tickAnim - 460) / 25) * (-0.63594-(-0.63594)));
        }
        else if (tickAnim >= 485 && tickAnim < 499) {
            xx = -7.52052 + (((tickAnim - 485) / 14) * (-17.26231-(-7.52052)));
            yy = 3.69576 + (((tickAnim - 485) / 14) * (2.21746-(3.69576)));
            zz = -0.63594 + (((tickAnim - 485) / 14) * (-0.38157-(-0.63594)));
        }
        else if (tickAnim >= 499 && tickAnim < 506) {
            xx = -17.26231 + (((tickAnim - 499) / 7) * (-1.61563-(-17.26231)));
            yy = 2.21746 + (((tickAnim - 499) / 7) * (1.81297-(2.21746)));
            zz = -0.38157 + (((tickAnim - 499) / 7) * (-0.31196-(-0.38157)));
        }
        else if (tickAnim >= 506 && tickAnim < 513) {
            xx = -1.61563 + (((tickAnim - 506) / 7) * (16.44219-(-1.61563)));
            yy = 1.81297 + (((tickAnim - 506) / 7) * (0.90649-(1.81297)));
            zz = -0.31196 + (((tickAnim - 506) / 7) * (-0.15598-(-0.31196)));
        }
        else if (tickAnim >= 513 && tickAnim < 520) {
            xx = 16.44219 + (((tickAnim - 513) / 7) * (0-(16.44219)));
            yy = 0.90649 + (((tickAnim - 513) / 7) * (0-(0.90649)));
            zz = -0.15598 + (((tickAnim - 513) / 7) * (0-(-0.15598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1 + (((tickAnim - 17) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 3) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 17) / 3) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 1 + (((tickAnim - 20) / 3) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 20) / 3) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 20) / 3) * (1-(1)));
        }
        else if (tickAnim >= 23 && tickAnim < 43) {
            xx = 1 + (((tickAnim - 23) / 20) * (1-(1)));
            yy = 1 + (((tickAnim - 23) / 20) * (1-(1)));
            zz = 1 + (((tickAnim - 23) / 20) * (1-(1)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 43) / 4) * (1-(1)));
            yy = 1 + (((tickAnim - 43) / 4) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 43) / 4) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 47) / 3) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 47) / 3) * (1-(-0.0025)));
            zz = 1 + (((tickAnim - 47) / 3) * (1-(1)));
        }
        else if (tickAnim >= 50 && tickAnim < 74) {
            xx = 1 + (((tickAnim - 50) / 24) * (1-(1)));
            yy = 1 + (((tickAnim - 50) / 24) * (1-(1)));
            zz = 1 + (((tickAnim - 50) / 24) * (1-(1)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 1 + (((tickAnim - 74) / 8) * (1-(1)));
            yy = 1 + (((tickAnim - 74) / 8) * (-0.0025-(1)));
            zz = 1 + (((tickAnim - 74) / 8) * (1-(1)));
        }
        else if (tickAnim >= 82 && tickAnim < 88) {
            xx = 1 + (((tickAnim - 82) / 6) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 82) / 6) * (0.4925-(-0.0025)));
            zz = 1 + (((tickAnim - 82) / 6) * (1-(1)));
        }
        else if (tickAnim >= 88 && tickAnim < 96) {
            xx = 1 + (((tickAnim - 88) / 8) * (1-(1)));
            yy = 0.4925 + (((tickAnim - 88) / 8) * (-0.0025-(0.4925)));
            zz = 1 + (((tickAnim - 88) / 8) * (1-(1)));
        }
        else if (tickAnim >= 96 && tickAnim < 241) {
            xx = 1 + (((tickAnim - 96) / 145) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 96) / 145) * (-0.0025-(-0.0025)));
            zz = 1 + (((tickAnim - 96) / 145) * (1-(1)));
        }
        else if (tickAnim >= 241 && tickAnim < 247) {
            xx = 1 + (((tickAnim - 241) / 6) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 241) / 6) * (0.3025-(-0.0025)));
            zz = 1 + (((tickAnim - 241) / 6) * (1-(1)));
        }
        else if (tickAnim >= 247 && tickAnim < 253) {
            xx = 1 + (((tickAnim - 247) / 6) * (1-(1)));
            yy = 0.3025 + (((tickAnim - 247) / 6) * (0.1525-(0.3025)));
            zz = 1 + (((tickAnim - 247) / 6) * (1-(1)));
        }
        else if (tickAnim >= 253 && tickAnim < 262) {
            xx = 1 + (((tickAnim - 253) / 9) * (1-(1)));
            yy = 0.1525 + (((tickAnim - 253) / 9) * (0.3025-(0.1525)));
            zz = 1 + (((tickAnim - 253) / 9) * (1-(1)));
        }
        else if (tickAnim >= 262 && tickAnim < 274) {
            xx = 1 + (((tickAnim - 262) / 12) * (1-(1)));
            yy = 0.3025 + (((tickAnim - 262) / 12) * (0.5625-(0.3025)));
            zz = 1 + (((tickAnim - 262) / 12) * (1-(1)));
        }
        else if (tickAnim >= 274 && tickAnim < 297) {
            xx = 1 + (((tickAnim - 274) / 23) * (1-(1)));
            yy = 0.5625 + (((tickAnim - 274) / 23) * (0.3025-(0.5625)));
            zz = 1 + (((tickAnim - 274) / 23) * (1-(1)));
        }
        else if (tickAnim >= 297 && tickAnim < 303) {
            xx = 1 + (((tickAnim - 297) / 6) * (1-(1)));
            yy = 0.3025 + (((tickAnim - 297) / 6) * (-0.0025-(0.3025)));
            zz = 1 + (((tickAnim - 297) / 6) * (1-(1)));
        }
        else if (tickAnim >= 303 && tickAnim < 400) {
            xx = 1 + (((tickAnim - 303) / 97) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 303) / 97) * (-0.0025-(-0.0025)));
            zz = 1 + (((tickAnim - 303) / 97) * (1-(1)));
        }
        else if (tickAnim >= 400 && tickAnim < 425) {
            xx = 1 + (((tickAnim - 400) / 25) * (1-(1)));
            yy = -0.0025 + (((tickAnim - 400) / 25) * (-0.2675-(-0.0025)));
            zz = 1 + (((tickAnim - 400) / 25) * (1-(1)));
        }
        else if (tickAnim >= 425 && tickAnim < 435) {
            xx = 1 + (((tickAnim - 425) / 10) * (1-(1)));
            yy = -0.2675 + (((tickAnim - 425) / 10) * (-0.05-(-0.2675)));
            zz = 1 + (((tickAnim - 425) / 10) * (1-(1)));
        }
        else if (tickAnim >= 435 && tickAnim < 445) {
            xx = 1 + (((tickAnim - 435) / 10) * (1-(1)));
            yy = -0.05 + (((tickAnim - 435) / 10) * (-0.3075-(-0.05)));
            zz = 1 + (((tickAnim - 435) / 10) * (1-(1)));
        }
        else if (tickAnim >= 445 && tickAnim < 454) {
            xx = 1 + (((tickAnim - 445) / 9) * (1-(1)));
            yy = -0.3075 + (((tickAnim - 445) / 9) * (-0.03-(-0.3075)));
            zz = 1 + (((tickAnim - 445) / 9) * (1-(1)));
        }
        else if (tickAnim >= 454 && tickAnim < 460) {
            xx = 1 + (((tickAnim - 454) / 6) * (1-(1)));
            yy = -0.03 + (((tickAnim - 454) / 6) * (-0.415-(-0.03)));
            zz = 1 + (((tickAnim - 454) / 6) * (1-(1)));
        }
        else if (tickAnim >= 460 && tickAnim < 478) {
            xx = 1 + (((tickAnim - 460) / 18) * (1-(1)));
            yy = -0.415 + (((tickAnim - 460) / 18) * (1-(-0.415)));
            zz = 1 + (((tickAnim - 460) / 18) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animYawn(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 55;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = -2.5 + (((tickAnim - 27) / 15) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 15.75 + (((tickAnim - 27) / 15) * (12.75-(15.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 12.75 + (((tickAnim - 42) / 13) * (0-(12.75)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = -4.5 + (((tickAnim - 27) / 15) * (-8.75-(-4.5)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = -8.75 + (((tickAnim - 42) / 13) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = -29.25 + (((tickAnim - 27) / 15) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 42) / 5) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 42) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 5) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 52) {
            xx = -5.75 + (((tickAnim - 47) / 5) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 1 + (((tickAnim - 0) / 29) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 29) * (0.0925-(1)));
            zz = 1 + (((tickAnim - 0) / 29) * (1-(1)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = 1 + (((tickAnim - 29) / 2) * (1-(1)));
            yy = 0.0925 + (((tickAnim - 29) / 2) * (0.0925-(0.0925)));
            zz = 1 + (((tickAnim - 29) / 2) * (1-(1)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = 1 + (((tickAnim - 31) / 14) * (1-(1)));
            yy = 0.0925 + (((tickAnim - 31) / 14) * (1-(0.0925)));
            zz = 1 + (((tickAnim - 31) / 14) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Main, Main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-50))*2), Main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254))*0.5), Main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-30))*2));
        this.Main.rotationPointX = this.Main.rotationPointX + (float)(0);
        this.Main.rotationPointY = this.Main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-80))*0.2);
        this.Main.rotationPointZ = this.Main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*-0.5);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*-2), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-0.5), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*1));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*3), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*0.5), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-300))*2), Neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-0.5), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*2));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-390))*2), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-470))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*-3), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-390))*-4), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*-3), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*2));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-390))*-4), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-2));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 15.25 + (((tickAnim - 0) / 14) * (-30.25-(15.25)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = -30.25 + (((tickAnim - 14) / 14) * (15.25-(-30.25)));
            yy = 0 + (((tickAnim - 14) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 4.5 + (((tickAnim - 0) / 14) * (-21.25-(4.5)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -21.25 + (((tickAnim - 14) / 3) * (-16.56-(-21.25)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -16.56 + (((tickAnim - 17) / 5) * (5.32-(-16.56)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 5.32 + (((tickAnim - 22) / 4) * (7.96-(5.32)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 7.96 + (((tickAnim - 26) / 2) * (4.5-(7.96)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = -0.5 + (((tickAnim - 0) / 14) * (0.7-(-0.5)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 14) / 3) * (1.3-(0.7)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 17) / 5) * (2.13-(1.3)));
            zz = 0 + (((tickAnim - 17) / 5) * (-0.575-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 2.13 + (((tickAnim - 22) / 6) * (-0.5-(2.13)));
            zz = -0.575 + (((tickAnim - 22) / 6) * (0-(-0.575)));
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
            xx = -17.75 + (((tickAnim - 0) / 3) * (-4.13-(-17.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -4.13 + (((tickAnim - 3) / 4) * (0.99-(-4.13)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0.99 + (((tickAnim - 7) / 7) * (-41.75-(0.99)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -41.75 + (((tickAnim - 14) / 3) * (-56.87-(-41.75)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -56.87 + (((tickAnim - 17) / 5) * (-28.53-(-56.87)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -28.53 + (((tickAnim - 22) / 5) * (0-(-28.53)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (0.125-(0.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 4) * (0.05-(0.125)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 3) * (1.12-(0.05)));
            zz = 0 + (((tickAnim - 7) / 3) * (-0.06-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.12 + (((tickAnim - 10) / 4) * (1.675-(1.12)));
            zz = -0.06 + (((tickAnim - 10) / 4) * (-0.125-(-0.06)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 1.675 + (((tickAnim - 14) / 3) * (3.11-(1.675)));
            zz = -0.125 + (((tickAnim - 14) / 3) * (-0.485-(-0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 3.11 + (((tickAnim - 17) / 1) * (3.51-(3.11)));
            zz = -0.485 + (((tickAnim - 17) / 1) * (-0.485-(-0.485)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 3.51 + (((tickAnim - 18) / 4) * (1.615-(3.51)));
            zz = -0.485 + (((tickAnim - 18) / 4) * (-0.235-(-0.485)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 1.615 + (((tickAnim - 22) / 5) * (0-(1.615)));
            zz = -0.235 + (((tickAnim - 22) / 5) * (0-(-0.235)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0.5-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (55.5-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 55.5 + (((tickAnim - 14) / 3) * (-18.47-(55.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -18.47 + (((tickAnim - 17) / 10) * (0-(-18.47)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToe, rightToe.rotateAngleX + (float) Math.toRadians(xx), rightToe.rotateAngleY + (float) Math.toRadians(yy), rightToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 7) * (0.4-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0.85-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 14) / 1) * (0.035-(0.4)));
            zz = 0.85 + (((tickAnim - 14) / 1) * (0.48-(0.85)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0.035 + (((tickAnim - 15) / 1) * (-0.02-(0.035)));
            zz = 0.48 + (((tickAnim - 15) / 1) * (0.1-(0.48)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -0.02 + (((tickAnim - 16) / 1) * (0.125-(-0.02)));
            zz = 0.1 + (((tickAnim - 16) / 1) * (-0.275-(0.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            yy = 0.125 + (((tickAnim - 17) / 10) * (0-(0.125)));
            zz = -0.275 + (((tickAnim - 17) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToe.rotationPointX = this.rightToe.rotationPointX + (float)(xx);
        this.rightToe.rotationPointY = this.rightToe.rotationPointY - (float)(yy);
        this.rightToe.rotationPointZ = this.rightToe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30.25 + (((tickAnim - 0) / 13) * (15.25-(-30.25)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 15.25 + (((tickAnim - 13) / 15) * (-30.25-(15.25)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -21.25 + (((tickAnim - 0) / 3) * (-16.56-(-21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -16.56 + (((tickAnim - 3) / 4) * (5.32-(-16.56)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 5.32 + (((tickAnim - 7) / 4) * (7.96-(5.32)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 7.96 + (((tickAnim - 11) / 2) * (4.5-(7.96)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 4.5 + (((tickAnim - 13) / 15) * (-21.25-(4.5)));
            yy = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 3) * (1.3-(0.7)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 3) / 4) * (2.13-(1.3)));
            zz = 0 + (((tickAnim - 3) / 4) * (-0.575-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 2.13 + (((tickAnim - 7) / 6) * (-0.5-(2.13)));
            zz = -0.575 + (((tickAnim - 7) / 6) * (0-(-0.575)));
        }
        else if (tickAnim >= 13 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 13) / 15) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 15) * (0.7-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 15) * (0-(0)));
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
            xx = -41.75 + (((tickAnim - 0) / 3) * (-56.87-(-41.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -56.87 + (((tickAnim - 3) / 4) * (-28.53-(-56.87)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -28.53 + (((tickAnim - 7) / 5) * (0-(-28.53)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -17.75 + (((tickAnim - 13) / 4) * (-5.38-(-17.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5.38 + (((tickAnim - 17) / 3) * (2.99-(-5.38)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 2.99 + (((tickAnim - 20) / 8) * (-41.75-(2.99)));
            yy = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 1.675 + (((tickAnim - 0) / 3) * (3.11-(1.675)));
            zz = -0.125 + (((tickAnim - 0) / 3) * (-0.485-(-0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 3.11 + (((tickAnim - 3) / 1) * (3.51-(3.11)));
            zz = -0.485 + (((tickAnim - 3) / 1) * (-0.485-(-0.485)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 3.51 + (((tickAnim - 4) / 3) * (1.615-(3.51)));
            zz = -0.485 + (((tickAnim - 4) / 3) * (-0.235-(-0.485)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 1.615 + (((tickAnim - 7) / 5) * (0-(1.615)));
            zz = -0.235 + (((tickAnim - 7) / 5) * (0-(-0.235)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.6-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 13) / 4) * (0.3-(0.6)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 17) / 3) * (-0.1-(0.3)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = -0.1 + (((tickAnim - 20) / 4) * (1.12-(-0.1)));
            zz = 0 + (((tickAnim - 20) / 4) * (-0.06-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.12 + (((tickAnim - 24) / 4) * (1.675-(1.12)));
            zz = -0.06 + (((tickAnim - 24) / 4) * (-0.125-(-0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 55.5 + (((tickAnim - 0) / 3) * (-18.47-(55.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = -18.47 + (((tickAnim - 3) / 9) * (0-(-18.47)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (38.5-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 38.5 + (((tickAnim - 24) / 4) * (55.5-(38.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 0) / 1) * (0.035-(0.4)));
            zz = 0.85 + (((tickAnim - 0) / 1) * (0.48-(0.85)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.035 + (((tickAnim - 1) / 1) * (-0.02-(0.035)));
            zz = 0.48 + (((tickAnim - 1) / 1) * (0.1-(0.48)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.02 + (((tickAnim - 2) / 1) * (0.125-(-0.02)));
            zz = 0.1 + (((tickAnim - 2) / 1) * (-0.275-(0.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0.125 + (((tickAnim - 3) / 9) * (0-(0.125)));
            zz = -0.275 + (((tickAnim - 3) / 9) * (0-(-0.275)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0.15-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0.27-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 24) / 4) * (0.4-(0.15)));
            zz = 0.27 + (((tickAnim - 24) / 4) * (0.85-(0.27)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToe.rotationPointX = this.leftToe.rotationPointX + (float)(xx);
        this.leftToe.rotationPointY = this.leftToe.rotationPointY - (float)(yy);
        this.leftToe.rotationPointZ = this.leftToe.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-100))*1), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-50))*-0.5), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-30))*-1));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-150))*1.5), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-100))*-1), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-80))*-1));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*2), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-150))*-3), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-130))*-1));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-200))*2.5), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-200))*-6), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-180))*-1));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254/0.5-250))*3), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-250))*-9), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*254-250))*-1));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCarnufex entity = (EntityPrehistoricFloraCarnufex) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Main, Main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-90))*8), Main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*4), Main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*4));
        this.Main.rotationPointX = this.Main.rotationPointX + (float)(0);
        this.Main.rotationPointY = this.Main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*-1);
        this.Main.rotationPointZ = this.Main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*-1);


        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*6), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*4), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*3));


        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*4), Body2.rotateAngleY + (float) Math.toRadians(0), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*6), Neck1.rotateAngleY + (float) Math.toRadians(0), Neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-450))*6), Neck2.rotateAngleY + (float) Math.toRadians(0), Neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-450))*-6), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*8), rightArm.rotateAngleY + (float) Math.toRadians(0), rightArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-450))*8), rightArm2.rotateAngleY + (float) Math.toRadians(0), rightArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-350))*8), leftArm.rotateAngleY + (float) Math.toRadians(0), leftArm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-450))*8), leftArm2.rotateAngleY + (float) Math.toRadians(0), leftArm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-3));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 22 + (((tickAnim - 0) / 8) * (-38-(22)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -38 + (((tickAnim - 8) / 7) * (20.25-(-38)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 0) / 8) * (-27-(4.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -27 + (((tickAnim - 8) / 1) * (-21.1-(-27)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -21.1 + (((tickAnim - 9) / 6) * (4.5-(-21.1)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.7 + (((tickAnim - 0) / 8) * (0.7-(-0.7)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.7 + (((tickAnim - 8) / 1) * (1.36-(0.7)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 1.36 + (((tickAnim - 9) / 3) * (1.93-(1.36)));
            zz = 0 + (((tickAnim - 9) / 3) * (-0.175-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.93 + (((tickAnim - 12) / 3) * (-0.7-(1.93)));
            zz = -0.175 + (((tickAnim - 12) / 3) * (0-(-0.175)));
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
            xx = -19.25 + (((tickAnim - 0) / 3) * (7.25-(-19.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 3) / 5) * (-41.75-(7.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -41.75 + (((tickAnim - 8) / 1) * (-43.45-(-41.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -43.45 + (((tickAnim - 9) / 3) * (-47.85-(-43.45)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -47.85 + (((tickAnim - 12) / 1) * (0-(-47.85)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-19.25-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 2) * (0.98-(0.075)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.4-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.98 + (((tickAnim - 2) / 1) * (0.925-(0.98)));
            zz = -0.4 + (((tickAnim - 2) / 1) * (0-(-0.4)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.925 + (((tickAnim - 3) / 3) * (0-(0.925)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (1.675-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.125-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.675 + (((tickAnim - 8) / 1) * (2.415-(1.675)));
            zz = -0.125 + (((tickAnim - 8) / 1) * (-0.3-(-0.125)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 2.415 + (((tickAnim - 9) / 3) * (3.435-(2.415)));
            zz = -0.3 + (((tickAnim - 9) / 3) * (-0.15-(-0.3)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 3.435 + (((tickAnim - 12) / 1) * (0.45-(3.435)));
            zz = -0.15 + (((tickAnim - 12) / 1) * (0-(-0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 13) / 2) * (0.25-(0.45)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (58.55-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 58.55 + (((tickAnim - 6) / 2) * (-38.5-(58.55)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -38.5 + (((tickAnim - 8) / 1) * (-34-(-38.5)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -34 + (((tickAnim - 9) / 4) * (12.25-(-34)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 13) / 2) * (0-(12.25)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToe, rightToe.rotateAngleX + (float) Math.toRadians(xx), rightToe.rotateAngleY + (float) Math.toRadians(yy), rightToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (1.125-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.35-(0)));
            zz = 1.125 + (((tickAnim - 6) / 2) * (-0.475-(1.125)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 1) * (0.35-(0.35)));
            zz = -0.475 + (((tickAnim - 8) / 1) * (-0.375-(-0.475)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 9) / 3) * (0-(0.35)));
            zz = -0.375 + (((tickAnim - 9) / 3) * (0-(-0.375)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0.4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 2) * (0-(-0.05)));
            zz = 0.4 + (((tickAnim - 13) / 2) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToe.rotationPointX = this.rightToe.rotationPointX + (float)(xx);
        this.rightToe.rotationPointY = this.rightToe.rotationPointY - (float)(yy);
        this.rightToe.rotationPointZ = this.rightToe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -38 + (((tickAnim - 0) / 8) * (20.25-(-38)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 20.25 + (((tickAnim - 8) / 7) * (-38-(20.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -27 + (((tickAnim - 0) / 2) * (-21.1-(-27)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -21.1 + (((tickAnim - 2) / 5) * (4.5-(-21.1)));
            yy = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 4.5 + (((tickAnim - 7) / 1) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 4.5 + (((tickAnim - 8) / 7) * (-27-(4.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 2) * (1.36-(0.7)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 1.36 + (((tickAnim - 2) / 2) * (1.93-(1.36)));
            zz = 0 + (((tickAnim - 2) / 2) * (-0.175-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 1.93 + (((tickAnim - 4) / 3) * (-0.25-(1.93)));
            zz = -0.175 + (((tickAnim - 4) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.25 + (((tickAnim - 7) / 1) * (-0.7-(-0.25)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 8) / 2) * (0-(-0.7)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.7-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -41.75 + (((tickAnim - 0) / 2) * (-43.45-(-41.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -43.45 + (((tickAnim - 2) / 2) * (-47.85-(-43.45)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -47.85 + (((tickAnim - 4) / 2) * (0-(-47.85)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-26.75-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -26.75 + (((tickAnim - 8) / 0) * (-12-(-26.75)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -12 + (((tickAnim - 8) / 2) * (-1.25-(-12)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.25 + (((tickAnim - 10) / 5) * (-41.75-(-1.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.675 + (((tickAnim - 0) / 2) * (3.49-(1.675)));
            zz = -0.125 + (((tickAnim - 0) / 2) * (-0.3-(-0.125)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 3.49 + (((tickAnim - 2) / 2) * (3.435-(3.49)));
            zz = -0.3 + (((tickAnim - 2) / 2) * (-0.15-(-0.3)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 3.435 + (((tickAnim - 4) / 2) * (0.45-(3.435)));
            zz = -0.15 + (((tickAnim - 4) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 2) * (0.575-(0.45)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 0) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (1.05-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 1.05 + (((tickAnim - 10) / 5) * (1.675-(1.05)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -38.5 + (((tickAnim - 0) / 2) * (-34-(-38.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -34 + (((tickAnim - 2) / 4) * (12.25-(-34)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 12.25 + (((tickAnim - 6) / 2) * (0-(12.25)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (49-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 49 + (((tickAnim - 13) / 2) * (-38.5-(49)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 0) / 2) * (0.35-(0.35)));
            zz = -0.475 + (((tickAnim - 0) / 2) * (-0.375-(-0.475)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 2) / 2) * (0-(0.35)));
            zz = -0.375 + (((tickAnim - 2) / 2) * (0-(-0.375)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.4-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.05 + (((tickAnim - 6) / 2) * (0-(-0.05)));
            zz = 0.4 + (((tickAnim - 6) / 2) * (0-(0.4)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.1 + (((tickAnim - 12) / 1) * (0-(0.1)));
            zz = -0.05 + (((tickAnim - 12) / 1) * (0.675-(-0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0.35-(0)));
            zz = 0.675 + (((tickAnim - 13) / 2) * (-0.475-(0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToe.rotationPointX = this.leftToe.rotationPointX + (float)(xx);
        this.leftToe.rotationPointY = this.leftToe.rotationPointY - (float)(yy);
        this.leftToe.rotationPointZ = this.leftToe.rotationPointZ + (float)(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-100))*-4), Tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2), Tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*4));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-150))*4), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*4), Tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*4));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-200))*6), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*6), Tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*4));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-250))*8), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*8), Tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*4));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-300))*10), Tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*10), Tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*4));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCarnufex e = (EntityPrehistoricFloraCarnufex) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.Neck1, (float) Math.toRadians(10),0,0);
        animator.move(this.Neck2, (float) Math.toRadians(10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);

    }
}
