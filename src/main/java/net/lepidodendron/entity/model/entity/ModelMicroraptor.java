package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMicroraptor;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelMicroraptor extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightclaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftclaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer leftTertials;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftSecondaries;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leftSecondariesToHide;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer leftPrimaries1;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer leftPrimaries2;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer leftPrimaries3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer rightTertials;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer rightSecondaries;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer rightSecondariesToHide;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer rightPrimaries1;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer rightPrimaries2;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer rightPrimaries3;
    private final AdvancedModelRenderer cube_r52;

    private ModelAnimator animator;

    public ModelMicroraptor() {
        this.textureWidth = 59;
        this.textureHeight = 59;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 14.4618F, -0.0565F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.5382F, -0.4435F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 24, -1.0F, -1.6F, -1.5F, 4, 4, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.6F, 0.3221F, -0.3177F);
        this.hips.addChild(rightleg);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.216F, -2.1258F);
        this.rightleg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 15, -1.0F, -3.0F, 0.1F, 2, 4, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.3F, 1.9992F, -2.6527F);
        this.rightleg.addChild(rightleg2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 1.4627F, 3.1434F);
        this.rightleg2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.5701F, -0.0353F, -0.0743F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 43, 0.3F, -2.9F, -0.1F, 0, 6, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.7832F, 0.5269F);
        this.rightleg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 42, -1.0F, 0.3F, -1.0F, 1, 6, 2, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 4.3217F, 4.036F);
        this.rightleg2.addChild(rightleg3);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.4294F, -0.117F);
        this.rightleg3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0698F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -2.7F, -0.5F, 0, 4, 6, -0.001F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.4294F, -0.117F);
        this.rightleg3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 46, -1.0F, -1.5F, -1.0F, 1, 3, 1, -0.001F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.05F, 1.9951F, -1.3091F);
        this.rightleg3.addChild(rightfoot);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 42, 0, -1.0F, -0.1F, -2.9F, 2, 1, 3, 0.0F, true));

        this.rightclaw = new AdvancedModelRenderer(this);
        this.rightclaw.setRotationPoint(0.95F, -0.1F, 0.0F);
        this.rightfoot.addChild(rightclaw);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.6F, -0.9F);
        this.rightclaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.0F, -1.3F, -0.8F, 0, 2, 2, 0.0F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.6F, 0.3221F, -0.3177F);
        this.hips.addChild(leftleg);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.216F, -2.1258F);
        this.leftleg.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.829F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, -1.0F, -3.0F, 0.1F, 2, 4, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.3F, 1.9992F, -2.6527F);
        this.leftleg.addChild(leftleg2);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 1.4627F, 3.1434F);
        this.leftleg2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.5701F, 0.0353F, 0.0743F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 43, -0.3F, -2.9F, -0.1F, 0, 6, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -0.7832F, 0.5269F);
        this.leftleg2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5672F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 42, 0.0F, 0.3F, -1.0F, 1, 6, 2, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 4.3217F, 4.036F);
        this.leftleg2.addChild(leftleg3);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 1.4294F, -0.117F);
        this.leftleg3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0698F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.5F, -2.7F, -0.5F, 0, 4, 6, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, 1.4294F, -0.117F);
        this.leftleg3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 46, 0.0F, -1.5F, -1.0F, 1, 3, 1, -0.001F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(-0.05F, 1.9951F, -1.3091F);
        this.leftleg3.addChild(leftfoot);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 42, 0, -1.0F, -0.1F, -2.9F, 2, 1, 3, 0.0F, false));

        this.leftclaw = new AdvancedModelRenderer(this);
        this.leftclaw.setRotationPoint(-0.95F, -0.1F, 0.0F);
        this.leftfoot.addChild(leftclaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.6F, -0.9F);
        this.leftclaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, -1.3F, -0.8F, 0, 2, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0382F, 2.0565F);
        this.hips.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 31, 28, -1.0F, -0.5F, -0.5F, 2, 2, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 44, -0.6F, 1.5F, -0.5F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 17, 43, 0.6F, 1.5F, -0.5F, 0, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.0737F, 4.3962F);
        this.tail.addChild(tail2);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0737F, 3.6038F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 0, 0.0F, 0.3F, -3.6F, 0, 1, 3, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 6, -0.5F, -0.6F, -3.6F, 1, 1, 6, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.2076F, 5.9099F);
        this.tail2.addChild(tail3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, 0.2813F, -2.3061F);
        this.tail3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 52, -1.0F, -0.8F, 2.3F, 1, 1, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.2813F, 4.9939F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1396F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0008F, -7.3672F);
        this.tail4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -3.0F, -0.4F, 6.3F, 5, 0, 14, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 0.1067F, -0.163F);
        this.tail4.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 21, -0.5F, -0.5916F, 0.098F, 1, 1, 4, -0.001F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0311F, -1.6363F);
        this.hips.addChild(body);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.4692F, 1.1928F);
        this.body.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 0, -2.0F, 1.9F, -4.8F, 4, 1, 4, 0.012F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.5692F, 1.1928F);
        this.body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 15, -2.0F, -1.9F, -5.0F, 4, 4, 4, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0516F, -3.7339F);
        this.body.addChild(chest);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 1.6341F, -0.681F);
        this.chest.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.7854F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 34, 6, -1.0F, 0.3F, -0.6F, 3, 1, 3, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 1.6341F, -0.681F);
        this.chest.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 41, 36, -1.0F, -1.7F, -0.6F, 3, 3, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5916F, -1.0779F);
        this.chest.addChild(neck);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -0.4046F, -1.7547F);
        this.neck.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.48F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 43, 18, -1.0F, -0.8231F, 0.6194F, 2, 2, 2, 0.004F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.6571F, -0.6664F);
        this.neck.addChild(neck2);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.2525F, -1.0883F);
        this.neck2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.829F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 46, 9, -1.0F, -1.1005F, -0.979F, 2, 2, 2, 0.003F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.1824F, -1.0101F);
        this.neck2.addChild(neck3);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.4348F, -0.0782F);
        this.neck3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.3927F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 48, 42, -1.0F, -1.4026F, -1.4481F, 2, 2, 1, 0.002F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.3698F, -0.9329F);
        this.neck3.addChild(neck4);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.8046F, 0.9547F);
        this.neck4.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0436F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 48, -1.0F, -1.8447F, -1.8929F, 2, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3094F, -0.5948F);
        this.neck4.addChild(head);


        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.5F, -0.1168F, -1.995F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.6021F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 4, 27, -1.0F, 0.034F, -0.8923F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.0778F, -1.2047F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.4276F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 11, -1.0F, -0.5F, -0.5365F, 2, 1, 1, -0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.0274F, -1.2981F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.3927F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 53, -1.0F, -1.0326F, 0.9721F, 2, 1, 1, -0.006F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.5331F, -0.9671F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 22, -1.0F, -0.0326F, -0.0279F, 2, 1, 1, -0.005F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.7852F, -3.248F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 11, -1.0F, -0.6F, 1.7F, 2, 1, 1, 0.002F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 44, 5, -1.0F, -0.3F, 1.4F, 2, 1, 2, 0.001F, false));
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 31, -0.5F, -0.3F, -0.6F, 1, 1, 2, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.55F, -0.2766F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.5236F, 0.0F, 0.0F);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.5F, 1.3133F, -1.2202F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.6981F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 48, 23, -1.0F, -0.5F, -1.7F, 1, 1, 2, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 26, 15, -1.5F, -0.5F, 0.3F, 2, 1, 2, -0.005F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.4436F, -0.3016F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.4363F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 41, 29, -1.0F, -0.6F, -0.8F, 2, 1, 2, -0.015F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(1.597F, 1.6267F, -0.3423F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.2171F, -0.0504F, -0.3141F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(1.203F, 0.1909F, 1.3689F);
        this.leftarm.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0432F, 0.1726F, 0.0129F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 39, 11, -0.8F, -1.7F, -2.0F, 1, 2, 4, 0.0F, false));

        this.leftTertials = new AdvancedModelRenderer(this);
        this.leftTertials.setRotationPoint(1.203F, -1.5091F, 1.3689F);
        this.leftarm.addChild(leftTertials);


        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.1F, 0.7F, 0.0F);
        this.leftTertials.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0463F, 0.1719F, 0.0306F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 21, 33, -0.8F, -5.7F, -2.0F, 1, 5, 4, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(1.4257F, -0.1021F, 3.1368F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.0524F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.0843F, 2.1172F, -1.7364F);
        this.leftarm2.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.6885F, 0.0477F, -0.1131F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 41, 23, -0.5F, -1.0F, -1.2F, 1, 1, 4, 0.0F, false));

        this.leftSecondaries = new AdvancedModelRenderer(this);
        this.leftSecondaries.setRotationPoint(0.3548F, 1.3646F, -0.9778F);
        this.leftarm2.addChild(leftSecondaries);
        this.setRotateAngle(leftSecondaries, 0.6254F, -0.2248F, 0.0175F);


        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.5391F, 0.7526F, -0.7586F);
        this.leftSecondaries.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.9328F, 0.0477F, -0.1131F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 36, 0.5F, 0.0F, -1.2F, 0, 7, 4, 0.0F, false));

        this.leftSecondariesToHide = new AdvancedModelRenderer(this);
        this.leftSecondariesToHide.setRotationPoint(0.3691F, 1.5906F, 3.5986F);
        this.leftSecondaries.addChild(leftSecondariesToHide);


        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.leftSecondariesToHide.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.6875F, -0.0063F, -0.1574F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 32, 15, -1.0F, -3.5F, 0.0F, 1, 7, 4, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.0863F, 2.2267F, -2.819F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.6766F, -0.2733F, -0.0966F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.1413F, 0.4246F, 0.9091F);
        this.lefthand.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.5236F, 0.1745F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 9, 44, 0.3204F, -1.0747F, -1.8075F, 0, 5, 2, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.1413F, 0.4246F, 1.3091F);
        this.lefthand.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0873F, 0.1745F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 14, 45, 0.3204F, -0.8204F, -1.4819F, 0, 3, 1, 0.0F, false));

        this.leftPrimaries1 = new AdvancedModelRenderer(this);
        this.leftPrimaries1.setRotationPoint(0.1811F, 0.8942F, 0.4361F);
        this.lefthand.addChild(leftPrimaries1);


        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.3224F, -0.4696F, 0.473F);
        this.leftPrimaries1.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.7011F, 0.2059F, 0.0167F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 7, 27, 0.4204F, -0.0747F, -0.8075F, 0, 13, 3, 0.0F, false));

        this.leftPrimaries2 = new AdvancedModelRenderer(this);
        this.leftPrimaries2.setRotationPoint(-0.1413F, 0.4246F, 0.9091F);
        this.lefthand.addChild(leftPrimaries2);
        this.setRotateAngle(leftPrimaries2, -0.1309F, 0.0F, 0.0F);


        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftPrimaries2.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.9622F, 0.221F, 0.0147F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 27, 0.4204F, -0.0747F, -0.8075F, 0, 13, 3, 0.0F, false));

        this.leftPrimaries3 = new AdvancedModelRenderer(this);
        this.leftPrimaries3.setRotationPoint(0.254F, 0.9152F, 1.0233F);
        this.lefthand.addChild(leftPrimaries3);
        this.setRotateAngle(leftPrimaries3, -0.3054F, 0.0F, 0.0F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.3954F, -0.4905F, -0.1142F);
        this.leftPrimaries3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 1.2318F, 0.2018F, 0.058F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 14, 30, 0.4204F, -0.0747F, -0.8075F, 0, 11, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-1.597F, 1.6267F, -0.3423F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.2171F, 0.0504F, 0.3141F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-1.203F, 0.1909F, 1.3689F);
        this.rightarm.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0432F, -0.1726F, -0.0129F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 39, 11, -0.2F, -1.7F, -2.0F, 1, 2, 4, 0.0F, true));

        this.rightTertials = new AdvancedModelRenderer(this);
        this.rightTertials.setRotationPoint(-1.203F, -1.5091F, 1.3689F);
        this.rightarm.addChild(rightTertials);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.1F, 0.7F, 0.0F);
        this.rightTertials.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0463F, -0.1719F, -0.0306F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 21, 33, -0.2F, -5.7F, -2.0F, 1, 5, 4, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-1.4257F, -0.1021F, 3.1368F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.0524F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0843F, 2.1172F, -1.7364F);
        this.rightarm2.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.6885F, -0.0477F, 0.1131F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 41, 23, -0.5F, -1.0F, -1.2F, 1, 1, 4, 0.0F, true));

        this.rightSecondaries = new AdvancedModelRenderer(this);
        this.rightSecondaries.setRotationPoint(-0.3548F, 1.3646F, -0.9778F);
        this.rightarm2.addChild(rightSecondaries);
        this.setRotateAngle(rightSecondaries, 0.6254F, 0.2248F, -0.0175F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5391F, 0.7526F, -0.7586F);
        this.rightSecondaries.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.9328F, -0.0477F, 0.1131F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 32, 36, -0.5F, 0.0F, -1.2F, 0, 7, 4, 0.0F, true));

        this.rightSecondariesToHide = new AdvancedModelRenderer(this);
        this.rightSecondariesToHide.setRotationPoint(-0.3691F, 1.5906F, 3.5986F);
        this.rightSecondaries.addChild(rightSecondariesToHide);


        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.1F, 0.0F, 0.0F);
        this.rightSecondariesToHide.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.6875F, 0.0063F, 0.1574F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 15, 0.0F, -3.5F, 0.0F, 1, 7, 4, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.0863F, 2.2267F, -2.819F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.6766F, 0.2733F, 0.0966F);


        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.1413F, 0.4246F, 0.9091F);
        this.righthand.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.5236F, -0.1745F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 9, 44, -0.3204F, -1.0747F, -1.8075F, 0, 5, 2, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.1413F, 0.4246F, 1.3091F);
        this.righthand.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0873F, -0.1745F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 14, 45, -0.3204F, -0.8204F, -1.4819F, 0, 3, 1, 0.0F, true));

        this.rightPrimaries1 = new AdvancedModelRenderer(this);
        this.rightPrimaries1.setRotationPoint(-0.1811F, 0.8942F, 0.4361F);
        this.righthand.addChild(rightPrimaries1);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.3224F, -0.4696F, 0.473F);
        this.rightPrimaries1.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.7011F, -0.2059F, -0.0167F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 7, 27, -0.4204F, -0.0747F, -0.8075F, 0, 13, 3, 0.0F, true));

        this.rightPrimaries2 = new AdvancedModelRenderer(this);
        this.rightPrimaries2.setRotationPoint(0.1413F, 0.4246F, 0.9091F);
        this.righthand.addChild(rightPrimaries2);
        this.setRotateAngle(rightPrimaries2, -0.1309F, 0.0F, 0.0F);


        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightPrimaries2.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.9622F, -0.221F, -0.0147F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 27, -0.4204F, -0.0747F, -0.8075F, 0, 13, 3, 0.0F, true));

        this.rightPrimaries3 = new AdvancedModelRenderer(this);
        this.rightPrimaries3.setRotationPoint(-0.254F, 0.9152F, 1.0233F);
        this.righthand.addChild(rightPrimaries3);
        this.setRotateAngle(rightPrimaries3, -0.3054F, 0.0F, 0.0F);


        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.3954F, -0.4905F, -0.1142F);
        this.rightPrimaries3.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.2318F, -0.2018F, -0.058F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 14, 30, -0.4204F, -0.0747F, -0.8075F, 0, 11, 3, 0.0F, true));
        this.leftTertials.scaleChildren = true;
        this.rightTertials.scaleChildren = true;
        this.leftSecondariesToHide.scaleChildren = true;
        this.rightSecondariesToHide.scaleChildren = true;

        this.leftTertials.setScale((float)1,(float)0,(float)0);
        this.rightTertials.setScale((float)1,(float)0,(float)0);
        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)0);
        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)0);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {
        this.hips.offsetY = -0.15F;
        this.hips.offsetX = 0.0F;
        this.hips.offsetZ = -0.4F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.hips.offsetZ = -0.1F;
        this.hips.offsetY = 0F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.5F;
        this.hips.offsetX = -0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(220);
        this.hips.rotateAngleX = (float)Math.toRadians(3);
        this.hips.rotateAngleZ = (float)Math.toRadians(-2);
        this.hips.scaleChildren = true;
        float scaler = 3.5F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
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

        EntityPrehistoricFloraMicroraptor ee = (EntityPrehistoricFloraMicroraptor) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, neck4);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.neck4, this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.25F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.5F, -0.02F, 0.5F, f2, 0.4F);
            this.chainWave(Tail, 0.5F, -0.01F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMicroraptor ee = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        if (ee.getIsFlying() || ee.getIsClimbing()) {

            this.leftTertials.setScale((float)1,(float)1,(float)1);
            this.rightTertials.setScale((float)1,(float)1,(float)1);
            this.leftSecondariesToHide.setScale((float)1,(float)1,(float)1);
            this.rightSecondariesToHide.setScale((float)1,(float)1,(float)1);


        } else {
            this.leftTertials.setScale((float)1,(float)0,(float)0);
            this.rightTertials.setScale((float)1,(float)0,(float)0);
            this.leftSecondariesToHide.setScale((float)1,(float)0,(float)0);
            this.rightSecondariesToHide.setScale((float)1,(float)0,(float)0);
        }

        if (!ee.isReallyInWater()) {
            if (ee.getClimbFacing() == EnumFacing.NORTH
                    || ee.getClimbFacing() == EnumFacing.EAST
                    || ee.getClimbFacing() == EnumFacing.SOUTH
                    || ee.getClimbFacing() == EnumFacing.WEST
                    || ee.getIsClimbing()) {
                if (!ee.getHeadCollided()) {
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
                    if (ee.getIsLaunching()) {
                        animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                    else {
                        //Is gliding:
                        animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            }
        }
        else {
            if (ee.getIsLaunching()) {
                animLaunching(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            else {
                //Is gliding:
                animGliding(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

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
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animLaunching(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-20.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-9), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*60/0.5))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*1);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-80))*-1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(10.393-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*9), rightleg.rotateAngleY + (float) Math.toRadians(0), rightleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(-6.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*-13), rightleg2.rotateAngleY + (float) Math.toRadians(-0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-100))*-13), rightleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), rightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(82.75), rightfoot.rotateAngleY + (float) Math.toRadians(0), rightfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(67.75), rightclaw.rotateAngleY + (float) Math.toRadians(0), rightclaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(22.4001-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*9), leftleg.rotateAngleY + (float) Math.toRadians(0), leftleg.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(-13-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*-13), leftleg2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-100))*-13), leftleg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), leftleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(75.25), leftfoot.rotateAngleY + (float) Math.toRadians(0), leftfoot.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(67.75), leftclaw.rotateAngleY + (float) Math.toRadians(0), leftclaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-10-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-100))*-4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-150))*-10), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(11-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-150))*-15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(3.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-200))*-19), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-5.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*9), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(11.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-100))*-9), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-150))*9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-230))));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(21-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-250))*9), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-21.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-350))*9), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.1);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.15);


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-18.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-400))*9), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));





        {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftTertials, leftTertials.rotateAngleX + (float) Math.toRadians(0), leftTertials.rotateAngleY + (float) Math.toRadians(0), leftTertials.rotateAngleZ + (float) Math.toRadians(-11));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(117.55205), leftarm2.rotateAngleY + (float) Math.toRadians(4.2793332387-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*-25), leftarm2.rotateAngleZ + (float) Math.toRadians(1.3931681763+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*-25));


        this.setRotateAngle(leftSecondaries, leftSecondaries.rotateAngleX + (float) Math.toRadians(-41.40361), leftSecondaries.rotateAngleY + (float) Math.toRadians(5.47362), leftSecondaries.rotateAngleZ + (float) Math.toRadians(-0.54676));


        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(-108.29718), lefthand.rotateAngleY + (float) Math.toRadians(8.2972932517-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3+50))*-25), lefthand.rotateAngleZ + (float) Math.toRadians(5.2306029939+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-150))*-25));


        this.setRotateAngle(leftPrimaries1, leftPrimaries1.rotateAngleX + (float) Math.toRadians(21.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), leftPrimaries1.rotateAngleY + (float) Math.toRadians(0), leftPrimaries1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftPrimaries2, leftPrimaries2.rotateAngleX + (float) Math.toRadians(28.9876407246-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), leftPrimaries2.rotateAngleY + (float) Math.toRadians(0.5245306221+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), leftPrimaries2.rotateAngleZ + (float) Math.toRadians(-2.69955));


        this.setRotateAngle(leftPrimaries3, leftPrimaries3.rotateAngleX + (float) Math.toRadians(48.2308561937-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), leftPrimaries3.rotateAngleY + (float) Math.toRadians(3.1521460885+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), leftPrimaries3.rotateAngleZ + (float) Math.toRadians(-9.75821));





     {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightTertials, rightTertials.rotateAngleX + (float) Math.toRadians(0), rightTertials.rotateAngleY + (float) Math.toRadians(0), rightTertials.rotateAngleZ + (float) Math.toRadians(11));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(117.55205), rightarm2.rotateAngleY + (float) Math.toRadians(-4.2793332387-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*25), rightarm2.rotateAngleZ + (float) Math.toRadians(-1.3931681763+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-50))*25));


        this.setRotateAngle(rightSecondaries, rightSecondaries.rotateAngleX + (float) Math.toRadians(-41.40361), rightSecondaries.rotateAngleY + (float) Math.toRadians(-5.47362), rightSecondaries.rotateAngleZ + (float) Math.toRadians(0.54676));


        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(-108.29718), righthand.rotateAngleY + (float) Math.toRadians(-8.2972932517-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3+50))*25), righthand.rotateAngleZ + (float) Math.toRadians(-5.2306029939+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3-150))*25));


        this.setRotateAngle(rightPrimaries1, rightPrimaries1.rotateAngleX + (float) Math.toRadians(21.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), rightPrimaries1.rotateAngleY + (float) Math.toRadians(0), rightPrimaries1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightPrimaries2, rightPrimaries2.rotateAngleX + (float) Math.toRadians(28.9876407246-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), rightPrimaries2.rotateAngleY + (float) Math.toRadians(-0.5245306221+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))), rightPrimaries2.rotateAngleZ + (float) Math.toRadians(2.69955));


        this.setRotateAngle(rightPrimaries3, rightPrimaries3.rotateAngleX + (float) Math.toRadians(48.2308561937-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.3))*-25), rightPrimaries3.rotateAngleY + (float) Math.toRadians(-3.15215), rightPrimaries3.rotateAngleZ + (float) Math.toRadians(9.75821));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(15.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.25 + (((tickAnim - 10) / 10) * (0-(29.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (51.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 51.75 + (((tickAnim - 10) / 10) * (0-(51.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.65-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = -0.65 + (((tickAnim - 10) / 10) * (0-(-0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.25 + (((tickAnim - 5) / 5) * (0-(20.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = -0.25 + (((tickAnim - 5) / 15) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (48-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 48 + (((tickAnim - 5) / 5) * (0-(48)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -8.5 + (((tickAnim - 3) / 5) * (9-(-8.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9 + (((tickAnim - 8) / 5) * (0-(9)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -9 + (((tickAnim - 3) / 5) * (4.5-(-9)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 8) / 5) * (0-(4.5)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 5) * (0-(-0.225)));
            zz = 0.3 + (((tickAnim - 3) / 5) * (0-(0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (20.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20.25 + (((tickAnim - 3) / 5) * (-7.25-(20.25)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -7.25 + (((tickAnim - 8) / 5) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -6.75 + (((tickAnim - 8) / 5) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-18.78651-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.27166-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.15824-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -18.78651 + (((tickAnim - 7) / 1) * (-4.73314-(-18.78651)));
            yy = 0.27166 + (((tickAnim - 7) / 1) * (0.33957-(0.27166)));
            zz = 0.15824 + (((tickAnim - 7) / 1) * (0.1978-(0.15824)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -4.73314 + (((tickAnim - 8) / 5) * (0-(-4.73314)));
            yy = 0.33957 + (((tickAnim - 8) / 5) * (0-(0.33957)));
            zz = 0.1978 + (((tickAnim - 8) / 5) * (0-(0.1978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 13.5 + (((tickAnim - 3) / 4) * (43.75-(13.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 43.75 + (((tickAnim - 7) / 1) * (0-(43.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 37.5 + (((tickAnim - 15) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (37.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 37.5 + (((tickAnim - 40) / 10) * (0-(37.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 10.25 + (((tickAnim - 15) / 2) * (23.54-(10.25)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 23.54 + (((tickAnim - 17) / 8) * (0-(23.54)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 10.25 + (((tickAnim - 40) / 2) * (23.54-(10.25)));
            yy = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 23.54 + (((tickAnim - 42) / 8) * (0-(23.54)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 15) / 5) * (-49.25-(3.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -49.25 + (((tickAnim - 20) / 2) * (-49.25-(-49.25)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -49.25 + (((tickAnim - 22) / 3) * (0-(-49.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 3.5 + (((tickAnim - 40) / 5) * (-49.25-(3.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = -49.25 + (((tickAnim - 45) / 2) * (-49.25-(-49.25)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = -49.25 + (((tickAnim - 47) / 3) * (0-(-49.25)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 2) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 22) / 3) * (0-(0.625)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 25) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 25) / 20) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 45) / 2) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.625 + (((tickAnim - 47) / 3) * (0-(0.625)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (79.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 79.75 + (((tickAnim - 15) / 5) * (91.88-(79.75)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 91.88 + (((tickAnim - 20) / 2) * (91.88-(91.88)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 91.88 + (((tickAnim - 22) / 3) * (0-(91.88)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (79.75-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 79.75 + (((tickAnim - 40) / 5) * (91.88-(79.75)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 91.88 + (((tickAnim - 45) / 2) * (91.88-(91.88)));
            yy = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 91.88 + (((tickAnim - 47) / 3) * (0-(91.88)));
            yy = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);
        
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 15) / 15) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -22.5 + (((tickAnim - 30) / 10) * (25.5-(-22.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.5 + (((tickAnim - 40) / 10) * (0-(25.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.525-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -4.5 + (((tickAnim - 15) / 15) * (-4.5-(-4.5)));
            zz = 1.525 + (((tickAnim - 15) / 15) * (1.525-(1.525)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -4.5 + (((tickAnim - 30) / 10) * (0-(-4.5)));
            zz = 1.525 + (((tickAnim - 30) / 10) * (1.825-(1.525)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 1.825 + (((tickAnim - 40) / 10) * (0-(1.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26 + (((tickAnim - 15) / 15) * (-26-(-26)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26 + (((tickAnim - 30) / 10) * (-24-(-26)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 40) / 10) * (0-(-24)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 15) / 15) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39.25 + (((tickAnim - 30) / 10) * (-17.75-(39.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 40) / 10) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 15) / 15) * (0.625-(0.625)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 10) * (0-(0.625)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-61.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -61.5 + (((tickAnim - 15) / 15) * (-61.5-(-61.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -61.5 + (((tickAnim - 30) / 10) * (0-(-61.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (70.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 70.5 + (((tickAnim - 15) / 15) * (70.5-(70.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 70.5 + (((tickAnim - 30) / 10) * (18-(70.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 40) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.775-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.775 + (((tickAnim - 15) / 15) * (0.775-(0.775)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.325-(0)));
            zz = 0.775 + (((tickAnim - 30) / 10) * (0-(0.775)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -26 + (((tickAnim - 15) / 15) * (-26-(-26)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -26 + (((tickAnim - 30) / 10) * (-24-(-26)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -24 + (((tickAnim - 40) / 10) * (0-(-24)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (39.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 39.25 + (((tickAnim - 15) / 15) * (39.25-(39.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 39.25 + (((tickAnim - 30) / 10) * (-17.75-(39.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -17.75 + (((tickAnim - 40) / 10) * (0-(-17.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 15) / 15) * (0.625-(0.625)));
            zz = -0.25 + (((tickAnim - 15) / 15) * (-0.25-(-0.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 10) * (0-(0.625)));
            zz = -0.25 + (((tickAnim - 30) / 10) * (0-(-0.25)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-61.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -61.5 + (((tickAnim - 15) / 15) * (-61.5-(-61.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -61.5 + (((tickAnim - 30) / 10) * (0-(-61.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = -0.3 + (((tickAnim - 15) / 15) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.3 + (((tickAnim - 30) / 10) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (70.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 70.5 + (((tickAnim - 15) / 15) * (70.5-(70.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 70.5 + (((tickAnim - 30) / 10) * (18-(70.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 40) / 10) * (0-(18)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.775-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.775 + (((tickAnim - 15) / 15) * (0.775-(0.775)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.325-(0)));
            zz = 0.775 + (((tickAnim - 30) / 10) * (0-(0.775)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (9.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 15) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 9.5 + (((tickAnim - 30) / 3) * (-18-(9.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -18 + (((tickAnim - 33) / 7) * (-19-(-18)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -19 + (((tickAnim - 40) / 10) * (0-(-19)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0.325-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 40) / 10) * (0-(-0.325)));
            zz = 0.325 + (((tickAnim - 40) / 10) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (11.5-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 11.5 + (((tickAnim - 15) / 15) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 11.5 + (((tickAnim - 30) / 3) * (12.67-(11.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 12.67 + (((tickAnim - 33) / 2) * (-1.5-(12.67)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 35) / 5) * (-11.71281-(-1.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (-0.34851-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (-3.5416-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -11.71281 + (((tickAnim - 40) / 10) * (0-(-11.71281)));
            yy = -0.34851 + (((tickAnim - 40) / 10) * (0-(-0.34851)));
            zz = -3.5416 + (((tickAnim - 40) / 10) * (0-(-3.5416)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (7.25-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 7.25 + (((tickAnim - 15) / 15) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 7.25 + (((tickAnim - 30) / 3) * (19.83-(7.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 19.83 + (((tickAnim - 33) / 2) * (17.41-(19.83)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 17.41 + (((tickAnim - 35) / 2) * (0-(17.41)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = -6 + (((tickAnim - 15) / 15) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -6 + (((tickAnim - 30) / 10) * (-5.75-(-6)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5.75 + (((tickAnim - 40) / 10) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 9.5 + (((tickAnim - 15) / 15) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 9.5 + (((tickAnim - 30) / 10) * (-23.25-(9.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -23.25 + (((tickAnim - 40) / 10) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 20.75 + (((tickAnim - 15) / 15) * (20.75-(20.75)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20.75 + (((tickAnim - 30) / 10) * (0-(20.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.05-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0.05 + (((tickAnim - 15) / 15) * (0.05-(0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);



        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);

    }
    

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 4.75 + (((tickAnim - 7) / 7) * (0-(4.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -20.5 + (((tickAnim - 7) / 7) * (0-(-20.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.45 + (((tickAnim - 7) / 7) * (0-(-0.45)));
            zz = 0.5 + (((tickAnim - 7) / 7) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 3 + (((tickAnim - 7) / 7) * (-25-(3)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -25 + (((tickAnim - 14) / 6) * (0-(-25)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -5.5 + (((tickAnim - 7) / 7) * (-10.41-(-5.5)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -10.41 + (((tickAnim - 14) / 6) * (0-(-10.41)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -4.75 + (((tickAnim - 7) / 7) * (42-(-4.75)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 42 + (((tickAnim - 14) / 3) * (0-(42)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);

    }

    public void animClimbing(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isMoving) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*8), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(11.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(-16.75);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 34.75 + (((tickAnim - 0) / 5) * (-32.17-(34.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.17 + (((tickAnim - 5) / 5) * (-18.59329-(-32.17)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.59329 + (((tickAnim - 10) / 10) * (34.75-(-18.59329)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.75 + (((tickAnim - 0) / 3) * (24.66-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 24.66 + (((tickAnim - 3) / 2) * (53.34-(24.66)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 53.34 + (((tickAnim - 5) / 5) * (-18.06778-(53.34)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.06778 + (((tickAnim - 10) / 10) * (-4.75-(-18.06778)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.125 + (((tickAnim - 5) / 5) * (0.925-(-1.125)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 10) / 10) * (0-(0.925)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2 + (((tickAnim - 0) / 5) * (-81.63-(2)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -81.63 + (((tickAnim - 5) / 5) * (-58.25-(-81.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -58.25 + (((tickAnim - 10) / 10) * (2-(-58.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 5) / 5) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.25 + (((tickAnim - 0) / 3) * (51.22-(-33.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 51.22 + (((tickAnim - 3) / 2) * (62.37-(51.22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 62.37 + (((tickAnim - 5) / 5) * (65.5-(62.37)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 65.5 + (((tickAnim - 10) / 10) * (-33.25-(65.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 2) * (0-(1.275)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1.25-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 17) / 3) * (0-(1.25)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (65.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 65.25 + (((tickAnim - 10) / 10) * (0-(65.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(xx), rightclaw.rotateAngleY + (float) Math.toRadians(yy), rightclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 34.75 + (((tickAnim - 0) / 5) * (-32.17-(34.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.17 + (((tickAnim - 5) / 5) * (-18.59329-(-32.17)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.59329 + (((tickAnim - 10) / 10) * (34.75-(-18.59329)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -4.75 + (((tickAnim - 0) / 3) * (24.66-(-4.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 24.66 + (((tickAnim - 3) / 2) * (53.34-(24.66)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 53.34 + (((tickAnim - 5) / 5) * (-18.06778-(53.34)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -18.06778 + (((tickAnim - 10) / 10) * (-4.75-(-18.06778)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.125 + (((tickAnim - 5) / 5) * (0.925-(-1.125)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.925 + (((tickAnim - 10) / 10) * (0-(0.925)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2 + (((tickAnim - 0) / 5) * (-81.63-(2)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -81.63 + (((tickAnim - 5) / 5) * (-58.25-(-81.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -58.25 + (((tickAnim - 10) / 10) * (2-(-58.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -0.75 + (((tickAnim - 5) / 5) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -33.25 + (((tickAnim - 0) / 3) * (51.22-(-33.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 51.22 + (((tickAnim - 3) / 2) * (34.72-(51.22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 34.72 + (((tickAnim - 5) / 5) * (65.5-(34.72)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 65.5 + (((tickAnim - 10) / 10) * (-33.25-(65.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 2) * (0-(1.275)));
            zz = 0.45 + (((tickAnim - 3) / 2) * (0-(0.45)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 10) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 7) * (1.325-(0)));
            zz = 0 + (((tickAnim - 10) / 7) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 1.325 + (((tickAnim - 17) / 3) * (0-(1.325)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (57.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 57.75 + (((tickAnim - 10) / 10) * (0-(57.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*8), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(18.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-15.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-350))*5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-450))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -82.34353 + (((tickAnim - 0) / 4) * (-65.72031-(-82.34353)));
            yy = 10.24636 + (((tickAnim - 0) / 4) * (10.1764-(10.24636)));
            zz = -32.24972 + (((tickAnim - 0) / 4) * (-40.68639-(-32.24972)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -65.72031 + (((tickAnim - 4) / 6) * (-42.84505-(-65.72031)));
            yy = 10.1764 + (((tickAnim - 4) / 6) * (9.78843-(10.1764)));
            zz = -40.68639 + (((tickAnim - 4) / 6) * (-33.29169-(-40.68639)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -42.84505 + (((tickAnim - 10) / 6) * (-81.94767-(-42.84505)));
            yy = 9.78843 + (((tickAnim - 10) / 6) * (10.09468-(9.78843)));
            zz = -33.29169 + (((tickAnim - 10) / 6) * (-74.43965-(-33.29169)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -81.94767 + (((tickAnim - 16) / 4) * (-82.34353-(-81.94767)));
            yy = 10.09468 + (((tickAnim - 16) / 4) * (10.24636-(10.09468)));
            zz = -74.43965 + (((tickAnim - 16) / 4) * (-32.24972-(-74.43965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 81.5 + (((tickAnim - 0) / 10) * (106-(81.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 106 + (((tickAnim - 10) / 6) * (105.39-(106)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 105.39 + (((tickAnim - 16) / 4) * (81.5-(105.39)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 10) / 10) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSecondaries, leftSecondaries.rotateAngleX + (float) Math.toRadians(xx), leftSecondaries.rotateAngleY + (float) Math.toRadians(yy), leftSecondaries.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -54.19457 + (((tickAnim - 0) / 3) * (-67.28758-(-54.19457)));
            yy = -7.72295 + (((tickAnim - 0) / 3) * (-7.03596-(-7.72295)));
            zz = -23.02749 + (((tickAnim - 0) / 3) * (-12.20583-(-23.02749)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -67.28758 + (((tickAnim - 3) / 2) * (-81.9656-(-67.28758)));
            yy = -7.03596 + (((tickAnim - 3) / 2) * (-4.39209-(-7.03596)));
            zz = -12.20583 + (((tickAnim - 3) / 2) * (-3.34343-(-12.20583)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -81.9656 + (((tickAnim - 5) / 5) * (-106.12542-(-81.9656)));
            yy = -4.39209 + (((tickAnim - 5) / 5) * (3.38317-(-4.39209)));
            zz = -3.34343 + (((tickAnim - 5) / 5) * (7.75534-(-3.34343)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -106.12542 + (((tickAnim - 10) / 6) * (-35.6532-(-106.12542)));
            yy = 3.38317 + (((tickAnim - 10) / 6) * (3.38317-(3.38317)));
            zz = 7.75534 + (((tickAnim - 10) / 6) * (7.75534-(7.75534)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -35.6532 + (((tickAnim - 16) / 4) * (-54.19457-(-35.6532)));
            yy = 3.38317 + (((tickAnim - 16) / 4) * (-7.72295-(3.38317)));
            zz = 7.75534 + (((tickAnim - 16) / 4) * (-23.02749-(7.75534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.07046 + (((tickAnim - 0) / 10) * (29.82046-(0.07046)));
            yy = 9.08541 + (((tickAnim - 0) / 10) * (9.08541-(9.08541)));
            zz = -7.39602 + (((tickAnim - 0) / 10) * (-7.39602-(-7.39602)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.82046 + (((tickAnim - 10) / 10) * (0.07046-(29.82046)));
            yy = 9.08541 + (((tickAnim - 10) / 10) * (9.08541-(9.08541)));
            zz = -7.39602 + (((tickAnim - 10) / 10) * (-7.39602-(-7.39602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries1, leftPrimaries1.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries1.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.37259 + (((tickAnim - 0) / 10) * (38.12259-(10.37259)));
            yy = 8.63398 + (((tickAnim - 0) / 10) * (8.63398-(8.63398)));
            zz = -2.29153 + (((tickAnim - 0) / 10) * (-2.29153-(-2.29153)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 38.12259 + (((tickAnim - 10) / 6) * (14.70593-(38.12259)));
            yy = 8.63398 + (((tickAnim - 10) / 6) * (8.63398-(8.63398)));
            zz = -2.29153 + (((tickAnim - 10) / 6) * (-2.29153-(-2.29153)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.70593 + (((tickAnim - 16) / 4) * (10.37259-(14.70593)));
            yy = 8.63398 + (((tickAnim - 16) / 4) * (8.63398-(8.63398)));
            zz = -2.29153 + (((tickAnim - 16) / 4) * (-2.29153-(-2.29153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries2, leftPrimaries2.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries2.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 33.15949 + (((tickAnim - 0) / 10) * (59.40949-(33.15949)));
            yy = 11.01718 + (((tickAnim - 0) / 10) * (11.01718-(11.01718)));
            zz = -8.22692 + (((tickAnim - 0) / 10) * (-8.22692-(-8.22692)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 59.40949 + (((tickAnim - 10) / 6) * (18.82616-(59.40949)));
            yy = 11.01718 + (((tickAnim - 10) / 6) * (11.01718-(11.01718)));
            zz = -8.22692 + (((tickAnim - 10) / 6) * (-8.22692-(-8.22692)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 18.82616 + (((tickAnim - 16) / 4) * (33.15949-(18.82616)));
            yy = 11.01718 + (((tickAnim - 16) / 4) * (11.01718-(11.01718)));
            zz = -8.22692 + (((tickAnim - 16) / 4) * (-8.22692-(-8.22692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries3, leftPrimaries3.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries3.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -82.34353 + (((tickAnim - 0) / 4) * (-65.33267-(-82.34353)));
            yy = -10.24636 + (((tickAnim - 0) / 4) * (-9.49865-(-10.24636)));
            zz = 32.24972 + (((tickAnim - 0) / 4) * (37.48429-(32.24972)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -65.33267 + (((tickAnim - 4) / 6) * (-42.84505-(-65.33267)));
            yy = -9.49865 + (((tickAnim - 4) / 6) * (-9.78843-(-9.49865)));
            zz = 37.48429 + (((tickAnim - 4) / 6) * (33.29169-(37.48429)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -42.84505 + (((tickAnim - 10) / 6) * (-81.94767-(-42.84505)));
            yy = -9.78843 + (((tickAnim - 10) / 6) * (-10.09468-(-9.78843)));
            zz = 33.29169 + (((tickAnim - 10) / 6) * (74.43965-(33.29169)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -81.94767 + (((tickAnim - 16) / 4) * (-82.34353-(-81.94767)));
            yy = -10.09468 + (((tickAnim - 16) / 4) * (-10.24636-(-10.09468)));
            zz = 74.43965 + (((tickAnim - 16) / 4) * (32.24972-(74.43965)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 81.5 + (((tickAnim - 0) / 10) * (106-(81.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 106 + (((tickAnim - 10) / 6) * (105.39-(106)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 105.39 + (((tickAnim - 16) / 4) * (81.5-(105.39)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 10) / 10) * (0-(-27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSecondaries, rightSecondaries.rotateAngleX + (float) Math.toRadians(xx), rightSecondaries.rotateAngleY + (float) Math.toRadians(yy), rightSecondaries.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -54.19457 + (((tickAnim - 0) / 3) * (-65.66288-(-54.19457)));
            yy = 7.72295 + (((tickAnim - 0) / 3) * (9.61322-(7.72295)));
            zz = 23.02749 + (((tickAnim - 0) / 3) * (15.43965-(23.02749)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -65.66288 + (((tickAnim - 3) / 2) * (-80.08803-(-65.66288)));
            yy = 9.61322 + (((tickAnim - 3) / 2) * (2.17412-(9.61322)));
            zz = 15.43965 + (((tickAnim - 3) / 2) * (10.79493-(15.43965)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -80.08803 + (((tickAnim - 5) / 5) * (-106.12542-(-80.08803)));
            yy = 2.17412 + (((tickAnim - 5) / 5) * (3.38317-(2.17412)));
            zz = 10.79493 + (((tickAnim - 5) / 5) * (7.75534-(10.79493)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -106.12542 + (((tickAnim - 10) / 6) * (-35.6532-(-106.12542)));
            yy = 3.38317 + (((tickAnim - 10) / 6) * (3.38317-(3.38317)));
            zz = 7.75534 + (((tickAnim - 10) / 6) * (7.75534-(7.75534)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -35.6532 + (((tickAnim - 16) / 4) * (-54.19457-(-35.6532)));
            yy = 3.38317 + (((tickAnim - 16) / 4) * (7.72295-(3.38317)));
            zz = 7.75534 + (((tickAnim - 16) / 4) * (23.02749-(7.75534)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.07046 + (((tickAnim - 0) / 10) * (29.82046-(0.07046)));
            yy = -9.08541 + (((tickAnim - 0) / 10) * (-9.08541-(-9.08541)));
            zz = 7.39602 + (((tickAnim - 0) / 10) * (7.39602-(7.39602)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 29.82046 + (((tickAnim - 10) / 10) * (0.07046-(29.82046)));
            yy = -9.08541 + (((tickAnim - 10) / 10) * (-9.08541-(-9.08541)));
            zz = 7.39602 + (((tickAnim - 10) / 10) * (7.39602-(7.39602)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries1, rightPrimaries1.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries1.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.37259 + (((tickAnim - 0) / 10) * (38.12259-(10.37259)));
            yy = -8.63398 + (((tickAnim - 0) / 10) * (-8.63398-(-8.63398)));
            zz = 2.29153 + (((tickAnim - 0) / 10) * (2.29153-(2.29153)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 38.12259 + (((tickAnim - 10) / 6) * (14.70593-(38.12259)));
            yy = -8.63398 + (((tickAnim - 10) / 6) * (-8.63398-(-8.63398)));
            zz = 2.29153 + (((tickAnim - 10) / 6) * (2.29153-(2.29153)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 14.70593 + (((tickAnim - 16) / 4) * (10.37259-(14.70593)));
            yy = -8.63398 + (((tickAnim - 16) / 4) * (-8.63398-(-8.63398)));
            zz = 2.29153 + (((tickAnim - 16) / 4) * (2.29153-(2.29153)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries2, rightPrimaries2.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries2.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 33.15949 + (((tickAnim - 0) / 10) * (59.40949-(33.15949)));
            yy = -11.01718 + (((tickAnim - 0) / 10) * (-11.01718-(-11.01718)));
            zz = 8.22692 + (((tickAnim - 0) / 10) * (8.22692-(8.22692)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 59.40949 + (((tickAnim - 10) / 6) * (18.82616-(59.40949)));
            yy = -11.01718 + (((tickAnim - 10) / 6) * (-11.01718-(-11.01718)));
            zz = 8.22692 + (((tickAnim - 10) / 6) * (8.22692-(8.22692)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 18.82616 + (((tickAnim - 16) / 4) * (33.15949-(18.82616)));
            yy = -11.01718 + (((tickAnim - 16) / 4) * (-11.01718-(-11.01718)));
            zz = 8.22692 + (((tickAnim - 16) / 4) * (8.22692-(8.22692)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries3, rightPrimaries3.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries3.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-90))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*-0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*0.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 0) / 8) * (-21.81-(37.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -21.81 + (((tickAnim - 8) / 2) * (-17.25-(-21.81)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -17.25 + (((tickAnim - 10) / 10) * (37.5-(-17.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.75 + (((tickAnim - 0) / 5) * (12.94-(11.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.94 + (((tickAnim - 5) / 5) * (-27-(12.94)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27 + (((tickAnim - 10) / 10) * (11.75-(-27)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 8) / 5) * (0-(0.65)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -38.5 + (((tickAnim - 5) / 1) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -38.5 + (((tickAnim - 6) / 4) * (13-(-38.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 13 + (((tickAnim - 10) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.105-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.105 + (((tickAnim - 3) / 2) * (0.9-(1.105)));
            zz = 0.1 + (((tickAnim - 3) / 2) * (0.15-(0.1)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 5) / 1) * (0.9-(0.9)));
            zz = 0.15 + (((tickAnim - 5) / 1) * (0.15-(0.15)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 6) / 4) * (0-(0.9)));
            zz = 0.15 + (((tickAnim - 6) / 4) * (0-(0.15)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 36.25 + (((tickAnim - 0) / 2) * (86.33-(36.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 86.33 + (((tickAnim - 2) / 3) * (86.75-(86.33)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 86.75 + (((tickAnim - 5) / 1) * (86.75-(86.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 86.75 + (((tickAnim - 6) / 4) * (50-(86.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 50 + (((tickAnim - 10) / 3) * (4.25-(50)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.25 + (((tickAnim - 13) / 7) * (36.25-(4.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.325-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 10) / 3) * (0.975-(-0.2)));
            zz = 0.325 + (((tickAnim - 10) / 3) * (0.5-(0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.975 + (((tickAnim - 13) / 7) * (0-(0.975)));
            zz = 0.5 + (((tickAnim - 13) / 7) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 65.68175 + (((tickAnim - 0) / 10) * (0-(65.68175)));
            yy = -5.31545 + (((tickAnim - 0) / 10) * (0-(-5.31545)));
            zz = 1.56892 + (((tickAnim - 0) / 10) * (0-(1.56892)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (65.68175-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (-5.31545-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (1.56892-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(xx), rightclaw.rotateAngleY + (float) Math.toRadians(yy), rightclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -17.25 + (((tickAnim - 0) / 10) * (37.5-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 37.5 + (((tickAnim - 10) / 8) * (-21.81-(37.5)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.81 + (((tickAnim - 18) / 2) * (-17.25-(-21.81)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27 + (((tickAnim - 0) / 10) * (11.75-(-27)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.75 + (((tickAnim - 10) / 5) * (12.94-(11.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 12.94 + (((tickAnim - 15) / 5) * (-27-(12.94)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 2) * (0-(0.65)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13 + (((tickAnim - 0) / 10) * (0-(13)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -38.5 + (((tickAnim - 15) / 1) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -38.5 + (((tickAnim - 16) / 4) * (13-(-38.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.105-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.1-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.105 + (((tickAnim - 13) / 2) * (0.9-(1.105)));
            zz = 0.1 + (((tickAnim - 13) / 2) * (0.15-(0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 15) / 1) * (0.9-(0.9)));
            zz = 0.15 + (((tickAnim - 15) / 1) * (0.15-(0.15)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 16) / 4) * (0-(0.9)));
            zz = 0.15 + (((tickAnim - 16) / 4) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 50 + (((tickAnim - 0) / 3) * (4.25-(50)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 4.25 + (((tickAnim - 3) / 7) * (36.25-(4.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 36.25 + (((tickAnim - 10) / 2) * (86.33-(36.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 86.33 + (((tickAnim - 12) / 3) * (86.75-(86.33)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 86.75 + (((tickAnim - 15) / 1) * (86.75-(86.75)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 1) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 86.75 + (((tickAnim - 16) / 4) * (50-(86.75)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 3) * (0.975-(-0.2)));
            zz = 0.325 + (((tickAnim - 0) / 3) * (0.5-(0.325)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = 0.975 + (((tickAnim - 3) / 17) * (-0.2-(0.975)));
            zz = 0.5 + (((tickAnim - 3) / 17) * (0.325-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (65.68175-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5.31545-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.56892-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 65.68175 + (((tickAnim - 10) / 10) * (0-(65.68175)));
            yy = -5.31545 + (((tickAnim - 10) / 10) * (0-(-5.31545)));
            zz = 1.56892 + (((tickAnim - 10) / 10) * (0-(1.56892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-80))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-180))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*-4), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-300))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-500))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-550))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*4), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-200))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-1));


        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-90))*7), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-3));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*-0.8);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*0.8);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 37.5 + (((tickAnim - 0) / 4) * (-21.81-(37.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -21.81 + (((tickAnim - 4) / 1) * (-17.25-(-21.81)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -17.25 + (((tickAnim - 5) / 5) * (37.5-(-17.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 11.75 + (((tickAnim - 0) / 3) * (12.94-(11.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 12.94 + (((tickAnim - 3) / 2) * (-27-(12.94)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -27 + (((tickAnim - 5) / 5) * (11.75-(-27)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0.65-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.65 + (((tickAnim - 4) / 3) * (0-(0.65)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -38.5 + (((tickAnim - 3) / 0) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -38.5 + (((tickAnim - 3) / 2) * (13-(-38.5)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13 + (((tickAnim - 5) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.105-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.105 + (((tickAnim - 2) / 1) * (0.9-(1.105)));
            zz = 0.1 + (((tickAnim - 2) / 1) * (0.15-(0.1)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.9 + (((tickAnim - 3) / 0) * (0.9-(0.9)));
            zz = 0.15 + (((tickAnim - 3) / 0) * (0.15-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 3) / 2) * (0-(0.9)));
            zz = 0.15 + (((tickAnim - 3) / 2) * (0-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 36.25 + (((tickAnim - 0) / 1) * (86.33-(36.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 86.33 + (((tickAnim - 1) / 2) * (86.75-(86.33)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 86.75 + (((tickAnim - 3) / 0) * (86.75-(86.75)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 86.75 + (((tickAnim - 3) / 2) * (50-(86.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 50 + (((tickAnim - 5) / 2) * (4.25-(50)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.25 + (((tickAnim - 7) / 3) * (36.25-(4.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.325-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 5) / 2) * (0.975-(-0.2)));
            zz = 0.325 + (((tickAnim - 5) / 2) * (0.5-(0.325)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.975 + (((tickAnim - 7) / 3) * (0-(0.975)));
            zz = 0.5 + (((tickAnim - 7) / 3) * (0-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 65.68175 + (((tickAnim - 0) / 5) * (0-(65.68175)));
            yy = -5.31545 + (((tickAnim - 0) / 5) * (0-(-5.31545)));
            zz = 1.56892 + (((tickAnim - 0) / 5) * (0-(1.56892)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (65.68175-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (-5.31545-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1.56892-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(xx), rightclaw.rotateAngleY + (float) Math.toRadians(yy), rightclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.25 + (((tickAnim - 0) / 5) * (37.5-(-17.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 37.5 + (((tickAnim - 5) / 4) * (-21.81-(37.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -21.81 + (((tickAnim - 9) / 1) * (-17.25-(-21.81)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27 + (((tickAnim - 0) / 5) * (11.75-(-27)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.75 + (((tickAnim - 5) / 3) * (12.94-(11.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 12.94 + (((tickAnim - 8) / 2) * (-27-(12.94)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 0) / 1) * (0-(0.65)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 13 + (((tickAnim - 0) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-38.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -38.5 + (((tickAnim - 8) / 0) * (-38.5-(-38.5)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -38.5 + (((tickAnim - 8) / 2) * (13-(-38.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (1.105-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0.1-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.105 + (((tickAnim - 7) / 1) * (0.9-(1.105)));
            zz = 0.1 + (((tickAnim - 7) / 1) * (0.15-(0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.9 + (((tickAnim - 8) / 0) * (0.9-(0.9)));
            zz = 0.15 + (((tickAnim - 8) / 0) * (0.15-(0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 8) / 2) * (0-(0.9)));
            zz = 0.15 + (((tickAnim - 8) / 2) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 50 + (((tickAnim - 0) / 2) * (4.25-(50)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 4.25 + (((tickAnim - 2) / 3) * (36.25-(4.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 36.25 + (((tickAnim - 5) / 1) * (86.33-(36.25)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 86.33 + (((tickAnim - 6) / 2) * (86.75-(86.33)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 86.75 + (((tickAnim - 8) / 0) * (86.75-(86.75)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 86.75 + (((tickAnim - 8) / 2) * (50-(86.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 2) * (0.975-(-0.2)));
            zz = 0.325 + (((tickAnim - 0) / 2) * (0.5-(0.325)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 0.975 + (((tickAnim - 2) / 8) * (-0.2-(0.975)));
            zz = 0.5 + (((tickAnim - 2) / 8) * (0.325-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (65.68175-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5.31545-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.56892-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 65.68175 + (((tickAnim - 5) / 5) * (0-(65.68175)));
            yy = -5.31545 + (((tickAnim - 5) / 5) * (0-(-5.31545)));
            zz = 1.56892 + (((tickAnim - 5) / 5) * (0-(1.56892)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-80))*2), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-180))*3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*7), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*-7), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*0.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*7), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-3));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(17.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-300))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-350))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(-12.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-450))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-13.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-500))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-550))*4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*4), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-1));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-1));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-150))*4), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-1));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-200))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-1));


        this.leftTertials.setScale((float)1,(float)0,(float)1);


        this.leftSecondariesToHide.setScale((float)1,(float)0,(float)1);


        this.rightTertials.setScale((float)1,(float)0,(float)1);


        this.rightSecondariesToHide.setScale((float)1,(float)0,(float)1);

    }

    public void animGliding(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicroraptor entity = (EntityPrehistoricFloraMicroraptor) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-9 + (((tickAnim - 0) / 75) * (-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*4 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*4)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 75) / 15) * (-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 90) / 30) * (-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-9-(-20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1 + (((tickAnim - 0) / 75) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-80))*-1.5 + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-80))*-1.5)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5 + (((tickAnim - 75) / 15) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1 + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5 + (((tickAnim - 90) / 30) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-80))*-1.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-1)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 43.6378-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9 + (((tickAnim - 0) / 75) * (40.90007-(43.6378-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9)));
            yy = 0.53063 + (((tickAnim - 0) / 75) * (0.53063-(0.53063)));
            zz = 3.78589 + (((tickAnim - 0) / 75) * (3.78589-(3.78589)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 40.90007 + (((tickAnim - 75) / 15) * (40.90007-(40.90007)));
            yy = 0.53063 + (((tickAnim - 75) / 15) * (0.53063-(0.53063)));
            zz = 3.78589 + (((tickAnim - 75) / 15) * (3.78589-(3.78589)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 40.90007 + (((tickAnim - 90) / 30) * (43.6378-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9-(40.90007)));
            yy = 0.53063 + (((tickAnim - 90) / 30) * (0.53063-(0.53063)));
            zz = 3.78589 + (((tickAnim - 90) / 30) * (3.78589-(3.78589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13 + (((tickAnim - 0) / 75) * (-18.25-(-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -18.25 + (((tickAnim - 75) / 15) * (-18.25-(-18.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -18.25 + (((tickAnim - 90) / 30) * (-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13-(-18.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13 + (((tickAnim - 0) / 75) * (3.25-(-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 3.25 + (((tickAnim - 75) / 15) * (3.25-(3.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 3.25 + (((tickAnim - 90) / 30) * (-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13-(3.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 79 + (((tickAnim - 0) / 75) * (80-(79)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 80 + (((tickAnim - 75) / 15) * (80-(80)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 80 + (((tickAnim - 90) / 30) * (79-(80)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 67.75 + (((tickAnim - 0) / 75) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 67.75 + (((tickAnim - 75) / 15) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 67.75 + (((tickAnim - 90) / 30) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightclaw, rightclaw.rotateAngleX + (float) Math.toRadians(xx), rightclaw.rotateAngleY + (float) Math.toRadians(yy), rightclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 41.1604-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9 + (((tickAnim - 0) / 75) * (40.90007-(41.1604-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9)));
            yy = 0.53063 + (((tickAnim - 0) / 75) * (0.53063-(0.53063)));
            zz = -3.78589 + (((tickAnim - 0) / 75) * (-3.78589-(-3.78589)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 40.90007 + (((tickAnim - 75) / 15) * (40.90007-(40.90007)));
            yy = 0.53063 + (((tickAnim - 75) / 15) * (0.53063-(0.53063)));
            zz = -3.78589 + (((tickAnim - 75) / 15) * (-3.78589-(-3.78589)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 40.90007 + (((tickAnim - 90) / 30) * (41.1604-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9-(40.90007)));
            yy = 0.53063 + (((tickAnim - 90) / 30) * (0.53063-(0.53063)));
            zz = -3.78589 + (((tickAnim - 90) / 30) * (-3.78589-(-3.78589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13 + (((tickAnim - 0) / 75) * (-18.25-(-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -18.25 + (((tickAnim - 75) / 15) * (-18.25-(-18.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -18.25 + (((tickAnim - 90) / 30) * (-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-13-(-18.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13 + (((tickAnim - 0) / 75) * (3.25-(-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 3.25 + (((tickAnim - 75) / 15) * (3.25-(3.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 3.25 + (((tickAnim - 90) / 30) * (-14.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-13-(3.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 82.25 + (((tickAnim - 0) / 75) * (76-(82.25)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 76 + (((tickAnim - 75) / 15) * (76-(76)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 76 + (((tickAnim - 90) / 30) * (82.25-(76)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 67.75 + (((tickAnim - 0) / 75) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 67.75 + (((tickAnim - 75) / 15) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 67.75 + (((tickAnim - 90) / 30) * (67.75-(67.75)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftclaw, leftclaw.rotateAngleX + (float) Math.toRadians(xx), leftclaw.rotateAngleY + (float) Math.toRadians(yy), leftclaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-4 + (((tickAnim - 0) / 75) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-4)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2 + (((tickAnim - 0) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4 + (((tickAnim - 75) / 15) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2 + (((tickAnim - 75) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4 + (((tickAnim - 90) / 30) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-4-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-4)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2 + (((tickAnim - 90) / 30) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-10 + (((tickAnim - 0) / 75) * (14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5-(14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-10)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5 + (((tickAnim - 75) / 15) * (14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5-(14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5 + (((tickAnim - 90) / 30) * (14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-10-(14.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-90))*-5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-15 + (((tickAnim - 0) / 75) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-15)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7 + (((tickAnim - 75) / 15) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7 + (((tickAnim - 90) / 30) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-15-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-150))*-7)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-200))*-19 + (((tickAnim - 0) / 75) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-200))*-19)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10 + (((tickAnim - 75) / 15) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10 + (((tickAnim - 90) / 30) * (13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-200))*-19-(13-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5-200))*-10)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9 + (((tickAnim - 0) / 75) * (7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2-(7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2 + (((tickAnim - 75) / 15) * (7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2-(7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2 + (((tickAnim - 90) / 30) * (7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*9-(7.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*2)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-80))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-9 + (((tickAnim - 0) / 75) * (11.5-(11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2 + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 11.5 + (((tickAnim - 75) / 15) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2 + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 11.5 + (((tickAnim - 90) / 30) * (11.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-100))*-9-(11.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2 + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-200))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*9 + (((tickAnim - 0) / 75) * (20.5-(20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)) + (((tickAnim - 0) / 75) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)))));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 20.5 + (((tickAnim - 75) / 15) * (20.5-(20.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)) + (((tickAnim - 75) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)))));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 20.5 + (((tickAnim - 90) / 30) * (20.5-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*9-(20.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)) + (((tickAnim - 90) / 30) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230))-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-230)))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-250))*9 + (((tickAnim - 0) / 75) * (21-(21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-250))*9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 21 + (((tickAnim - 75) / 15) * (21-(21)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 21 + (((tickAnim - 90) / 30) * (21-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-250))*9-(21)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-350))*9 + (((tickAnim - 0) / 75) * (-21.25-(-21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-350))*9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -21.25 + (((tickAnim - 75) / 15) * (-21.25-(-21.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -21.25 + (((tickAnim - 90) / 30) * (-21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-350))*9-(-21.25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(-0.1);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0.15);



        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-400))*9 + (((tickAnim - 0) / 75) * (-18.25-(-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-400))*9)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -18.25 + (((tickAnim - 75) / 15) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -18.25 + (((tickAnim - 90) / 30) * (-18.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-400))*9-(-18.25)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));









        if (tickAnim >= 75 && tickAnim < 90) {
            xx = -78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 75) / 15) * (-78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(-78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = -1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 75) / 15) * (-1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            zz = -60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 75) / 15) * (-60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
        }





        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = -11 + (((tickAnim - 0) / 75) * (-11-(-11)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = -11 + (((tickAnim - 75) / 15) * (-11-(-11)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = -11 + (((tickAnim - 90) / 30) * (-11-(-11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftTertials, leftTertials.rotateAngleX + (float) Math.toRadians(xx), leftTertials.rotateAngleY + (float) Math.toRadians(yy), leftTertials.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 117.55205 + (((tickAnim - 0) / 75) * (117.55205-(117.55205)));
            yy = 4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25 + (((tickAnim - 0) / 75) * (4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25)));
            zz = 1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25 + (((tickAnim - 0) / 75) * (1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5-(1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 117.55205 + (((tickAnim - 75) / 15) * (117.55205-(117.55205)));
            yy = 4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 75) / 15) * (4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
            zz = 1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5 + (((tickAnim - 75) / 15) * (1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5-(1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 117.55205 + (((tickAnim - 90) / 30) * (117.55205-(117.55205)));
            yy = 4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 90) / 30) * (4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25-(4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
            zz = 1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5 + (((tickAnim - 90) / 30) * (1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*-25-(1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -41.40361 + (((tickAnim - 0) / 75) * (-41.40361-(-41.40361)));
            yy = 5.47362 + (((tickAnim - 0) / 75) * (5.47362-(5.47362)));
            zz = -0.54676 + (((tickAnim - 0) / 75) * (-0.54676-(-0.54676)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -41.40361 + (((tickAnim - 75) / 15) * (-41.40361-(-41.40361)));
            yy = 5.47362 + (((tickAnim - 75) / 15) * (5.47362-(5.47362)));
            zz = -0.54676 + (((tickAnim - 75) / 15) * (-0.54676-(-0.54676)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -41.40361 + (((tickAnim - 90) / 30) * (-41.40361-(-41.40361)));
            yy = 5.47362 + (((tickAnim - 90) / 30) * (5.47362-(5.47362)));
            zz = -0.54676 + (((tickAnim - 90) / 30) * (-0.54676-(-0.54676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftSecondaries, leftSecondaries.rotateAngleX + (float) Math.toRadians(xx), leftSecondaries.rotateAngleY + (float) Math.toRadians(yy), leftSecondaries.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -108.29718 + (((tickAnim - 0) / 75) * (-108.29718-(-108.29718)));
            yy = 8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*-25 + (((tickAnim - 0) / 75) * (8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*-25)));
            zz = 5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-25 + (((tickAnim - 0) / 75) * (5.2306-(5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-25)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -108.29718 + (((tickAnim - 75) / 15) * (-108.29718-(-108.29718)));
            yy = 8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 75) / 15) * (8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5-(8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 5.2306 + (((tickAnim - 75) / 15) * (5.2306-(5.2306)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -108.29718 + (((tickAnim - 90) / 30) * (-108.29718-(-108.29718)));
            yy = 8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5 + (((tickAnim - 90) / 30) * (8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*-25-(8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*-5)));
            zz = 5.2306 + (((tickAnim - 90) / 30) * (5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*-25-(5.2306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries1, leftPrimaries1.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries1.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (28.98764-(28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = 0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -2.69955 + (((tickAnim - 0) / 75) * (-2.69955-(-2.69955)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 28.98764 + (((tickAnim - 75) / 15) * (28.98764-(28.98764)));
            yy = 0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -2.69955 + (((tickAnim - 75) / 15) * (-2.69955-(-2.69955)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 28.98764 + (((tickAnim - 90) / 30) * (28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(28.98764)));
            yy = 0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -2.69955 + (((tickAnim - 90) / 30) * (-2.69955-(-2.69955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries2, leftPrimaries2.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries2.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (48.23086-(48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = 3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -9.75821 + (((tickAnim - 0) / 75) * (-9.75821-(-9.75821)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 48.23086 + (((tickAnim - 75) / 15) * (48.23086-(48.23086)));
            yy = 3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -9.75821 + (((tickAnim - 75) / 15) * (-9.75821-(-9.75821)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 48.23086 + (((tickAnim - 90) / 30) * (48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(48.23086)));
            yy = 3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -9.75821 + (((tickAnim - 90) / 30) * (-9.75821-(-9.75821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftPrimaries3, leftPrimaries3.rotateAngleX + (float) Math.toRadians(xx), leftPrimaries3.rotateAngleY + (float) Math.toRadians(yy), leftPrimaries3.rotateAngleZ + (float) Math.toRadians(zz));









        if (tickAnim >= 75 && tickAnim < 90) {
            xx = -78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 75) / 15) * (-78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(-78.5394-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = -1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5 + (((tickAnim - 75) / 15) * (-1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5-(-1.0776-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-5)));
            zz = 60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5 + (((tickAnim - 75) / 15) * (60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5-(60.7381+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*5)));
        }





        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 11 + (((tickAnim - 0) / 75) * (11-(11)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 11 + (((tickAnim - 75) / 15) * (11-(11)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 11 + (((tickAnim - 90) / 30) * (11-(11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightTertials, rightTertials.rotateAngleX + (float) Math.toRadians(xx), rightTertials.rotateAngleY + (float) Math.toRadians(yy), rightTertials.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 117.55205 + (((tickAnim - 0) / 75) * (117.55205-(117.55205)));
            yy = -4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25 + (((tickAnim - 0) / 75) * (-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25)));
            zz = -1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25 + (((tickAnim - 0) / 75) * (-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 117.55205 + (((tickAnim - 75) / 15) * (117.55205-(117.55205)));
            yy = -4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 75) / 15) * (-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
            zz = -1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 75) / 15) * (-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5-(-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 117.55205 + (((tickAnim - 90) / 30) * (117.55205-(117.55205)));
            yy = -4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 90) / 30) * (-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25-(-4.2793332387-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
            zz = -1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5 + (((tickAnim - 90) / 30) * (-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-50))*25-(-1.3931681763+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-80))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -41.40361 + (((tickAnim - 0) / 75) * (-41.40361-(-41.40361)));
            yy = -5.47362 + (((tickAnim - 0) / 75) * (-5.47362-(-5.47362)));
            zz = 0.54676 + (((tickAnim - 0) / 75) * (0.54676-(0.54676)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -41.40361 + (((tickAnim - 75) / 15) * (-41.40361-(-41.40361)));
            yy = -5.47362 + (((tickAnim - 75) / 15) * (-5.47362-(-5.47362)));
            zz = 0.54676 + (((tickAnim - 75) / 15) * (0.54676-(0.54676)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -41.40361 + (((tickAnim - 90) / 30) * (-41.40361-(-41.40361)));
            yy = -5.47362 + (((tickAnim - 90) / 30) * (-5.47362-(-5.47362)));
            zz = 0.54676 + (((tickAnim - 90) / 30) * (0.54676-(0.54676)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightSecondaries, rightSecondaries.rotateAngleX + (float) Math.toRadians(xx), rightSecondaries.rotateAngleY + (float) Math.toRadians(yy), rightSecondaries.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = -108.29718 + (((tickAnim - 0) / 75) * (-108.29718-(-108.29718)));
            yy = -8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*25 + (((tickAnim - 0) / 75) * (-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*25)));
            zz = -5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*25 + (((tickAnim - 0) / 75) * (-5.2306-(-5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*25)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = -108.29718 + (((tickAnim - 75) / 15) * (-108.29718-(-108.29718)));
            yy = -8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 75) / 15) * (-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5-(-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = -5.2306 + (((tickAnim - 75) / 15) * (-5.2306-(-5.2306)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = -108.29718 + (((tickAnim - 90) / 30) * (-108.29718-(-108.29718)));
            yy = -8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5 + (((tickAnim - 90) / 30) * (-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3+50))*25-(-8.2972932517-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*5)));
            zz = -5.2306 + (((tickAnim - 90) / 30) * (-5.2306029939+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3-150))*25-(-5.2306)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (21.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(21.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries1, rightPrimaries1.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries1.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (28.98764-(28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = -0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 0) / 75) * (0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(-0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 2.69955 + (((tickAnim - 0) / 75) * (-2.69955-(2.69955)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 28.98764 + (((tickAnim - 75) / 15) * (28.98764-(28.98764)));
            yy = 0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -2.69955 + (((tickAnim - 75) / 15) * (-2.69955-(-2.69955)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 28.98764 + (((tickAnim - 90) / 30) * (28.9876407246-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(28.98764)));
            yy = 0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (-0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(0.5245306221+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = -2.69955 + (((tickAnim - 90) / 30) * (2.69955-(-2.69955)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries2, rightPrimaries2.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries2.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25 + (((tickAnim - 0) / 75) * (48.23086-(48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25)));
            yy = -3.15215 + (((tickAnim - 0) / 75) * (-3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(-3.15215)));
            zz = 9.75821 + (((tickAnim - 0) / 75) * (9.75821-(9.75821)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 48.23086 + (((tickAnim - 75) / 15) * (48.23086-(48.23086)));
            yy = -3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 75) / 15) * (-3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160))-(-3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 9.75821 + (((tickAnim - 75) / 15) * (9.75821-(9.75821)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 48.23086 + (((tickAnim - 90) / 30) * (48.2308561937-Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.3))*-25-(48.23086)));
            yy = -3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)) + (((tickAnim - 90) / 30) * (-3.15215-(-3.1521460885+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360-160)))));
            zz = 9.75821 + (((tickAnim - 90) / 30) * (9.75821-(9.75821)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightPrimaries3, rightPrimaries3.rotateAngleX + (float) Math.toRadians(xx), rightPrimaries3.rotateAngleY + (float) Math.toRadians(yy), rightPrimaries3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 75) {
            xx = 15.5 + (((tickAnim - 0) / 75) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 0) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 75) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 15.5 + (((tickAnim - 75) / 15) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 120) {
            xx = 15.5 + (((tickAnim - 90) / 30) * (15.5-(15.5)));
            yy = 0 + (((tickAnim - 90) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
