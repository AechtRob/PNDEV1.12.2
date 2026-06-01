package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEpoidesuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelEpoidesuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer eyes;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
   

    private ModelAnimator animator;

    public ModelEpoidesuchus() {
        this.textureWidth = 86;
        this.textureHeight = 86;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 10.5621F, 7.9913F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.6121F, -2.9913F, 6, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5871F, 0.0087F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 37, -2.5F, -0.8F, -3.0F, 5, 2, 6, -0.001F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.0F, 1.2002F, 1.1568F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3491F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 50, 0, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0024F, 5.2399F, -2.0195F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.5953F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 19, 64, -1.0F, 0.075F, 0.0F, 2, 8, 3, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 7.4493F, 1.1468F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2443F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 67, 33, -1.5F, 0.0F, -1.5F, 3, 1, 3, 0.004F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 67, 38, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.0F, 1.2002F, 1.1568F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3491F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 50, 0, -1.5F, -1.0F, -2.0F, 3, 7, 4, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.0024F, 5.2399F, -2.0195F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.5953F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 19, 64, -1.0F, 0.075F, 0.0F, 2, 8, 3, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 7.4493F, 1.1468F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2443F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 67, 33, -1.5F, 0.0F, -1.5F, 3, 1, 3, 0.004F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 67, 38, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3121F, 2.0087F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 26, -2.5F, -0.75F, 0.0F, 5, 5, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 35, -2.0F, -0.65F, -3.0F, 4, 1, 6, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 38, -2.0F, -0.75F, 0.0F, 4, 4, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 50, 12, -1.5F, -1.7F, 0.0F, 3, 1, 6, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0191F, 4.9459F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 21, 46, -1.5F, -0.75F, 0.0F, 3, 4, 6, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 57, 54, -1.0F, -0.2F, 0.0F, 2, 1, 6, -0.005F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 40, 54, -1.0F, -0.85F, 0.0F, 2, 3, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.9016F, 0.5178F);
        this.tail4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0916F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 64, -0.5F, -0.5F, -0.5F, 1, 1, 6, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 61, 43, -0.5F, -0.75F, 0.0F, 1, 2, 6, 0.003F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(-0.0944F, -0.475F, 4.85F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 0, 65, -0.4113F, -0.0106F, -0.0058F, 1, 1, 6, -0.002F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0621F, -1.9913F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 13, -3.5F, 0.25F, -5.0F, 7, 7, 5, 0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.25F, -3.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 46, -2.5F, -1.0F, -2.0F, 5, 2, 5, -0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5375F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 25, 0, -3.5F, 0.7875F, -5.0F, 7, 7, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.7125F, -2.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 49, -2.5F, -1.0F, -3.0F, 5, 2, 5, -0.001F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 1.5789F, -4.2442F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 25, 13, -3.0F, -0.5414F, -5.7558F, 6, 6, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.4586F, -2.9442F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0785F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 26, -2.0F, -1.0F, -3.0F, 4, 2, 6, -0.003F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.75F, 3.5777F, -3.6651F);
        this.body3.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.3491F, 0.0F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 57, 62, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(0.0F, 5.7267F, 1.4796F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.5672F, 0.0F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 45, 64, -1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 5.3288F, -1.0521F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.2225F, 0.0F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 50, 20, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.75F, 3.5777F, -3.6651F);
        this.body3.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.3491F, 0.0F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 57, 62, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(0.0F, 5.7267F, 1.4796F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.5672F, 0.0F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 45, 64, -1.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 5.3288F, -1.0521F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.2225F, 0.0F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 50, 20, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.6496F, -5.0441F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 23, 26, -2.5F, -0.841F, -5.2117F, 5, 4, 6, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.116F, -2.4617F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 19, 57, -2.5F, -0.5F, -2.5F, 4, 1, 5, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 4.7625F, -0.2931F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 57, -2.0F, -2.0F, -5.0F, 4, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.1041F, -1.3595F, -4.828F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0175F, 0.0F, 0.0F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.3959F, 0.0646F, -1.9987F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 77, -0.5F, 0.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.3959F, 0.3256F, -3.9816F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 76, 48, -0.5F, 0.0F, 0.025F, 2, 1, 2, -0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.3959F, 0.3256F, -3.9816F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 77, 73, -0.5F, 0.0F, -1.975F, 2, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.1041F, 1.0995F, -7.3917F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1178F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 80, 4, -0.5F, 0.05F, 0.3F, 1, 1, 2, 0.006F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.1041F, 2.169F, -10.3541F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0742F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 80, 12, -0.65F, -1.0F, -2.0F, 1, 1, 1, -0.003F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 11, 73, -0.325F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 56, 43, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.4576F, 2.4294F, -6.3848F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0262F, -0.0873F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 78, -0.4F, -0.6F, -1.2F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.9872F, 2.5712F, -6.0685F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1134F, -0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 64, 0.05F, -0.55F, -2.875F, 0, 1, 1, 0.0F, true));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 73, 0.0F, -1.0F, -2.875F, 1, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5369F, 2.1323F, -10.068F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1099F, -0.0916F, 0.0392F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 65, 8, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.0459F, 1.2971F, -11.2921F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.1F, -0.0087F, 0.0868F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 65, -0.175F, 0.2F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.2541F, 1.2971F, -11.2921F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1F, 0.0087F, -0.0868F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 65, 0.175F, 0.2F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.1041F, 1.2436F, -9.7939F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0175F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 69, 14, -0.5F, -0.1F, -0.6F, 1, 1, 4, 0.003F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.1041F, 1.4801F, -6.8053F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.1047F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 74, 52, -0.5F, -0.025F, -2.95F, 1, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.1041F, 2.5079F, -6.0116F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0131F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 77, -1.0F, -0.975F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.1041F, 2.4716F, -6.9359F);
        this.head.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0393F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 51, 43, -0.5F, -1.025F, 0.075F, 1, 1, 1, 0.009F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.1041F, 2.5979F, -4.2862F);
        this.head.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1134F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 67, 27, -1.0F, -1.025F, 0.175F, 2, 1, 4, 0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.7452F, 2.1323F, -10.068F);
        this.head.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1099F, 0.0916F, -0.0392F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 65, 8, 0.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-2.1317F, 0.2561F, -1.6005F);
        this.head.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.058F, -0.2091F, 0.0065F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 50, 73, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.5081F, 2.5712F, -3.114F);
        this.head.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1828F, -0.3463F, -0.0321F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 41, 73, 0.0F, -2.0F, 0.0F, 2, 2, 2, 0.006F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.5081F, 2.0712F, -3.114F);
        this.head.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.1745F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 59, 73, 0.0F, -0.5F, -2.95F, 1, 1, 3, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.7373F, 1.238F, -8.9251F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0175F, -0.0873F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 80, 0, 0.0F, 0.01F, -1.875F, 1, 1, 2, -0.003F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.9455F, 1.238F, -8.9251F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0175F, 0.0873F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 80, 0, -1.0F, 0.01F, -1.875F, 1, 1, 2, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.1955F, 2.5712F, -6.0685F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.1134F, 0.0873F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 64, -0.05F, -0.55F, -2.875F, 0, 1, 1, 0.0F, false));
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 68, 73, -1.0F, -1.0F, -2.875F, 1, 1, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.6659F, 2.4294F, -6.3848F);
        this.head.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0262F, 0.0873F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 56, 78, 0.4F, -0.6F, -1.2F, 0, 1, 3, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.5247F, 1.462F, -3.0201F);
        this.head.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.199F, -0.1945F, 0.1046F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 69, 8, 0.025F, -0.875F, -3.9F, 1, 1, 4, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(1.733F, 1.462F, -3.0201F);
        this.head.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.199F, 0.1945F, -0.1046F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 69, 8, -1.025F, -0.875F, -3.9F, 1, 1, 4, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.7164F, 2.0712F, -3.114F);
        this.head.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, 0.1745F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 59, 73, -1.0F, -0.5F, -2.95F, 1, 1, 3, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(2.34F, 0.2561F, -1.6005F);
        this.head.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.058F, 0.2091F, -0.0065F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 50, 73, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.003F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.7164F, 2.5712F, -3.114F);
        this.head.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.1828F, 0.3463F, 0.0321F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 41, 73, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.006F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1041F, 2.5712F, -0.3392F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 70, 68, -1.5F, 0.0F, -1.6F, 3, 2, 2, -0.006F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 38, 78, -1.0F, 0.0F, -3.575F, 2, 1, 2, -0.003F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 2.736F, -1.4321F);
        this.jaw.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.1047F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 73, -1.5F, -2.0F, 0.0F, 3, 2, 2, 0.003F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 1.8637F, -2.95F);
        this.jaw.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.4931F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 30, 72, -1.5F, -1.95F, -0.25F, 3, 2, 2, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, 1.3675F, -4.6803F);
        this.jaw.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.2793F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 47, 78, -0.5F, -1.0F, -0.2F, 2, 1, 2, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 0.7438F, -7.6147F);
        this.jaw.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.2094F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 76, 43, -0.5F, -1.0F, 0.0F, 1, 1, 3, -0.006F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-1.0972F, 0.8691F, -5.4791F);
        this.jaw.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0951F, -0.1094F, -0.0063F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 63, 78, 0.1F, -1.55F, -1.2F, 0, 1, 3, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 70, 78, 0.1F, -1.55F, -4.55F, 0, 1, 3, 0.0F, true));
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 11, 76, 0.0F, -1.0F, -3.0F, 1, 1, 3, -0.006F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(-0.5549F, -0.5762F, -10.6619F);
        this.jaw.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.2534F, -0.0733F, -0.1033F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 54, 67, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(-0.3F, -0.5944F, -11.158F);
        this.jaw.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.7069F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 68, 0.0F, -0.975F, -0.925F, 0, 1, 1, 0.0F, true));
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 15, 68, 0.6F, -0.975F, -0.925F, 0, 1, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.5549F, -0.5762F, -10.6619F);
        this.jaw.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.2534F, 0.0733F, 0.1033F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 54, 67, 0.0F, -0.8F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.5F, 0.8626F, -6.647F);
        this.jaw.addChild(cube_r46);
        this.setRotateAngle(cube_r46, -0.1222F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 65, 0, -1.0F, -1.0F, -5.375F, 1, 1, 6, -0.003F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(-0.5F, 1.0F, -3.5F);
        this.jaw.addChild(cube_r47);
        this.setRotateAngle(cube_r47, -0.0436F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 70, 62, 0.0F, -1.0F, -3.125F, 1, 1, 4, -0.009F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-1.4043F, 0.0F, -2.8255F);
        this.jaw.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.1091F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 78, 0.0F, -1.8F, 0.0F, 0, 2, 3, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(1.4043F, 0.0F, -2.8255F);
        this.jaw.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.1091F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 78, 0.0F, -1.8F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-2.2591F, 0.0842F, -1.1233F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.0884F, -0.2354F, 0.0055F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 15, 0.0F, -0.45F, 0.15F, 1, 1, 1, -0.01F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(-1.6273F, 0.4924F, -2.6893F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.1843F, -0.3678F, -0.0363F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 80, 8, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(-1.1253F, 1.0F, -2.5157F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.0436F, -0.1745F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 74, 57, -0.5F, -1.0F, -3.0F, 1, 1, 3, -0.006F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.5787F, 0.5816F, -8.4199F);
        this.jaw.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1104F, -0.08F, 0.0217F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 20, 76, -0.175F, -1.0F, -2.975F, 1, 1, 3, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(2.2591F, 0.0842F, -1.1233F);
        this.jaw.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0884F, 0.2354F, -0.0055F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 80, 15, -1.0F, -0.45F, 0.15F, 1, 1, 1, -0.01F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.5787F, 0.5816F, -8.4199F);
        this.jaw.addChild(cube_r55);
        this.setRotateAngle(cube_r55, -0.1104F, 0.08F, -0.0217F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 20, 76, -0.825F, -1.0F, -2.975F, 1, 1, 3, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(1.0972F, 0.8691F, -5.4791F);
        this.jaw.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0951F, 0.1094F, 0.0063F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 70, 78, -0.1F, -1.55F, -4.55F, 0, 1, 3, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 63, 78, -0.1F, -1.55F, -1.2F, 0, 1, 3, 0.0F, false));
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 11, 76, -1.0F, -1.0F, -3.0F, 1, 1, 3, -0.006F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(1.1253F, 1.0F, -2.5157F);
        this.jaw.addChild(cube_r57);
        this.setRotateAngle(cube_r57, -0.0436F, 0.1745F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 74, 57, -0.5F, -1.0F, -3.0F, 1, 1, 3, -0.006F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(1.6273F, 0.4924F, -2.6893F);
        this.jaw.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.1843F, 0.3678F, 0.0363F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 80, 8, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.eyes = new AdvancedModelRenderer(this);
        this.eyes.setRotationPoint(0.1041F, 0.662F, -3.0127F);
        this.head.addChild(eyes);


        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.18F, 0.0115F, 0.0335F);
        this.eyes.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.1517F, -0.4634F, 0.1722F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 46, 43, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(1.18F, 0.0115F, 0.0335F);
        this.eyes.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1517F, 0.4634F, -0.1722F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 46, 43, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.20F;
        this.main.offsetX = 0.075F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(212);
        this.main.rotateAngleX = (float)Math.toRadians(22);
        this.main.rotateAngleZ = (float)Math.toRadians(-12);
        this.main.scaleChildren = true;
        float scaler = 0.4F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
       
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraEpoidesuchus proteros = (EntityPrehistoricFloraEpoidesuchus) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEpoidesuchus ee = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 10) / 10) * (0-(-4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -4.75 + (((tickAnim - 30) / 10) * (0-(-4.75)));
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
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 46.75 + (((tickAnim - 10) / 10) * (0-(46.75)));
            yy = 22.25 + (((tickAnim - 10) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (46.75-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (22.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 46.75 + (((tickAnim - 30) / 10) * (-16.75-(46.75)));
            yy = 22.25 + (((tickAnim - 30) / 10) * (0-(22.25)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 40) / 10) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.5858 + (((tickAnim - 10) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 10) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 10) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -36.5 + (((tickAnim - 15) / 5) * (0-(-36.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.5858-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-3.0824-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (13.8509-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -0.5858 + (((tickAnim - 30) / 5) * (-36.5-(-0.5858)));
            yy = -3.0824 + (((tickAnim - 30) / 5) * (0-(-3.0824)));
            zz = 13.8509 + (((tickAnim - 30) / 5) * (0-(13.8509)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -36.5 + (((tickAnim - 35) / 5) * (6.5-(-36.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 40) / 10) * (0-(6.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 25.587 + (((tickAnim - 10) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 75.5 + (((tickAnim - 15) / 5) * (0-(75.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (25.587-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 25.587 + (((tickAnim - 30) / 5) * (75.5-(25.587)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 75.5 + (((tickAnim - 35) / 5) * (12-(75.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 40) / 10) * (0-(12)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 15) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 15) / 5) * (0-(-0.95)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0.525-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-0.95-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 35) / 5) * (0-(0.525)));
            zz = -0.95 + (((tickAnim - 35) / 5) * (0-(-0.95)));
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
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 10) / 10) * (0-(4.75)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (4.75-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 4.75 + (((tickAnim - 30) / 10) * (0-(4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 10) / 10) * (0-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 10 + (((tickAnim - 30) / 10) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.6587-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.2295-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -0.0219 + (((tickAnim - 10) / 10) * (0-(-0.0219)));
            yy = -1.6587 + (((tickAnim - 10) / 10) * (0-(-1.6587)));
            zz = -5.2295 + (((tickAnim - 10) / 10) * (0-(-5.2295)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-0.0219-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-1.6587-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (-5.2295-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -0.0219 + (((tickAnim - 30) / 10) * (0-(-0.0219)));
            yy = -1.6587 + (((tickAnim - 30) / 10) * (0-(-1.6587)));
            zz = -5.2295 + (((tickAnim - 30) / 10) * (0-(-5.2295)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -12.5 + (((tickAnim - 19) / 12) * (-12.5-(-12.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 31) / 19) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.225-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.425-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            yy = -2.225 + (((tickAnim - 19) / 12) * (-2.225-(-2.225)));
            zz = 0.425 + (((tickAnim - 19) / 12) * (0.425-(0.425)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            yy = -2.225 + (((tickAnim - 31) / 19) * (0-(-2.225)));
            zz = 0.425 + (((tickAnim - 31) / 19) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -1.25 + (((tickAnim - 19) / 12) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -1.25 + (((tickAnim - 31) / 19) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 31.25 + (((tickAnim - 19) / 12) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 31.25 + (((tickAnim - 31) / 19) * (0-(31.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -18 + (((tickAnim - 19) / 12) * (-18-(-18)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 31) / 19) * (0-(-18)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 11.75 + (((tickAnim - 19) / 12) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 31) / 19) * (0-(11.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 10.75 + (((tickAnim - 19) / 12) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 10.75 + (((tickAnim - 31) / 19) * (0-(10.75)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 3 + (((tickAnim - 19) / 12) * (3-(3)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 31) / 19) * (0-(3)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 5 + (((tickAnim - 19) / 12) * (5-(5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 31) / 19) * (0-(5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 4.5 + (((tickAnim - 19) / 12) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 31) / 19) * (0-(4.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 4.25 + (((tickAnim - 19) / 12) * (4.25-(4.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 31) / 19) * (0-(4.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 4.5 + (((tickAnim - 19) / 12) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 31) / 19) * (0-(4.5)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -1.25 + (((tickAnim - 19) / 12) * (-1.25-(-1.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -1.25 + (((tickAnim - 31) / 19) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 31.25 + (((tickAnim - 19) / 12) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = 31.25 + (((tickAnim - 31) / 19) * (0-(31.25)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = -18 + (((tickAnim - 19) / 12) * (-18-(-18)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 50) {
            xx = -18 + (((tickAnim - 31) / 19) * (0-(-18)));
            yy = 0 + (((tickAnim - 31) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 70;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*2 + (((tickAnim - 0) / 30) * (1-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*2)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 30) / 25) * (-2.2494-(1)));
            yy = 0 + (((tickAnim - 30) / 25) * (-1.9996-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (-0.0349-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 71) {
            xx = -2.2494 + (((tickAnim - 55) / 16) * (0-(-2.2494)));
            yy = -1.9996 + (((tickAnim - 55) / 16) * (0-(-1.9996)));
            zz = -0.0349 + (((tickAnim - 55) / 16) * (0-(-0.0349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3 + (((tickAnim - 0) / 30) * (-4.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*80))*-3)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = -4.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 30) / 25) * (-7-(-4.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            yy = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 30) / 25) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 71) {
            xx = -7 + (((tickAnim - 55) / 16) * (0-(-7)));
            yy = 0 + (((tickAnim - 55) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 13.5 + (((tickAnim - 15) / 15) * (18.75-(13.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 55) {
            xx = 18.75 + (((tickAnim - 30) / 25) * (28.5-(18.75)));
            yy = 0 + (((tickAnim - 30) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 25) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 71) {
            xx = 28.5 + (((tickAnim - 55) / 16) * (0-(28.5)));
            yy = 0 + (((tickAnim - 55) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.8748-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.5169-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.7841-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0.8748 + (((tickAnim - 3) / 4) * (7.1875-(0.8748)));
            yy = 0.5169 + (((tickAnim - 3) / 4) * (0-(0.5169)));
            zz = 0.7841 + (((tickAnim - 3) / 4) * (-1.0625-(0.7841)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.1875 + (((tickAnim - 7) / 3) * (9.75-(7.1875)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -1.0625 + (((tickAnim - 7) / 3) * (-4.25-(-1.0625)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 9.75 + (((tickAnim - 10) / 4) * (-4.4063-(9.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = -4.25 + (((tickAnim - 10) / 4) * (-3.7188-(-4.25)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = -4.4063 + (((tickAnim - 14) / 7) * (-4.9063-(-4.4063)));
            yy = 0 + (((tickAnim - 14) / 7) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 14) / 7) * (-3.7188-(-3.7188)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -4.9063 + (((tickAnim - 21) / 6) * (-4.3125-(-4.9063)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = -3.7188 + (((tickAnim - 21) / 6) * (-3.1875-(-3.7188)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -4.3125 + (((tickAnim - 27) / 4) * (0-(-4.3125)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = -3.1875 + (((tickAnim - 27) / 4) * (0-(-3.1875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.9689-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.5076-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-13.6432-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 4.9689 + (((tickAnim - 7) / 3) * (26.7825-(4.9689)));
            yy = -0.5076 + (((tickAnim - 7) / 3) * (-3.6297-(-0.5076)));
            zz = -13.6432 + (((tickAnim - 7) / 3) * (-5.3979-(-13.6432)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 26.7825 + (((tickAnim - 10) / 4) * (-12.7269-(26.7825)));
            yy = -3.6297 + (((tickAnim - 10) / 4) * (0.772-(-3.6297)));
            zz = -5.3979 + (((tickAnim - 10) / 4) * (3.4139-(-5.3979)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.7269 + (((tickAnim - 14) / 4) * (1.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 14) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 14) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 1.5 + (((tickAnim - 18) / 3) * (4-(1.5)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 21) / 3) * (-12.7269-(4)));
            yy = 0 + (((tickAnim - 21) / 3) * (0.772-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (3.4139-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -12.7269 + (((tickAnim - 24) / 4) * (7.5-(-12.7269)));
            yy = 0.772 + (((tickAnim - 24) / 4) * (0-(0.772)));
            zz = 3.4139 + (((tickAnim - 24) / 4) * (0-(3.4139)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (0-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 21 + (((tickAnim - 7) / 3) * (0-(21)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 14) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 29.25 + (((tickAnim - 24) / 4) * (0-(29.25)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (31.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 31.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 7) / 8) * (0-(31.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80 + (((tickAnim - 7) / 2) * (-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150-(-24.575-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*80)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150 + (((tickAnim - 9) / 6) * (0-(-123.675-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-150))*150)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.925-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0.925 + (((tickAnim - 7) / 8) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (41.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 41.25 + (((tickAnim - 7) / 2) * (0-(41.25)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

        this.jaw.rotationPointX = this.jaw.rotationPointX + (float)(0);
        this.jaw.rotationPointY = this.jaw.rotationPointY - (float)(0);
        this.jaw.rotationPointZ = this.jaw.rotationPointZ + (float)(0);

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 78;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 25) * (1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10 + (((tickAnim - 25) / 36) * (8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15-(1.875-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-10)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15 + (((tickAnim - 61) / 17) * (0-(8-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+50))*15)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 78) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7 + (((tickAnim - 0) / 78) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*7)));
            yy = 0 + (((tickAnim - 0) / 78) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 78) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 25) {
            xx = 21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20 + (((tickAnim - 9) / 16) * (26.175-(21.025-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+100))*20)));
            yy = 0 + (((tickAnim - 9) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 16) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 61) {
            xx = 26.175 + (((tickAnim - 25) / 36) * (60.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50-(26.175)));
            yy = 0 + (((tickAnim - 25) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 36) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 78) {
            xx = 60.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50 + (((tickAnim - 61) / 17) * (0-(60.65-Math.sin((Math.PI/180)*(((double)tickAnim/20)*20+160))*-50)));
            yy = 0 + (((tickAnim - 61) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 30) / 5) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 35) / 43) * (0-(0)));
            yy = 0.275 + (((tickAnim - 35) / 43) * (0-(0.275)));
            zz = 0 + (((tickAnim - 35) / 43) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.eyes.rotationPointX = this.eyes.rotationPointX + (float)(xx);
        this.eyes.rotationPointY = this.eyes.rotationPointY - (float)(yy);
        this.eyes.rotationPointZ = this.eyes.rotationPointZ + (float)(zz);


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 17) * (1-(1)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 17) / 13) * (1-(1)));
            yy = 1 + (((tickAnim - 17) / 13) * (0.0025-(1)));
            zz = 1 + (((tickAnim - 17) / 13) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 30) / 5) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 30) / 5) * (0.0025-(0.0025)));
            zz = 1 + (((tickAnim - 30) / 5) * (1-(1)));
        }
        else if (tickAnim >= 35 && tickAnim < 78) {
            xx = 1 + (((tickAnim - 35) / 43) * (1-(1)));
            yy = 0.0025 + (((tickAnim - 35) / 43) * (1-(0.0025)));
            zz = 1 + (((tickAnim - 35) / 43) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyes.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(70.1202), backLeftLeg.rotateAngleY + (float) Math.toRadians(-4.2756), backLeftLeg.rotateAngleZ + (float) Math.toRadians(-32.1056));


        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1), backLeftLeg2.rotateAngleY + (float) Math.toRadians(0), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(0);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(-0.175);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(64.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-1), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(19.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*-1), backLeftLeg4.rotateAngleY + (float) Math.toRadians(0), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(0);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(0);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(9.25), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(2.75), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*4), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(15), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*8), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*12), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*10), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-13.25), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-350))*13), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+50))*0.3), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+100))*0.3), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(53.1117), frontleftleg.rotateAngleY + (float) Math.toRadians(15.584), frontleftleg.rotateAngleZ + (float) Math.toRadians(-4.6629));


        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(16.75), frontleftleg2.rotateAngleY + (float) Math.toRadians(0), frontleftleg2.rotateAngleZ + (float) Math.toRadians(12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1));


        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(98.6187-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*-1), frontleftleg3.rotateAngleY + (float) Math.toRadians(-51.0211), frontleftleg3.rotateAngleZ + (float) Math.toRadians(-16.9178));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+150))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206+200))*1), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(53.1117), frontrightleg.rotateAngleY + (float) Math.toRadians(-15.584), frontrightleg.rotateAngleZ + (float) Math.toRadians(4.6629));


        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(16.75), frontrightleg2.rotateAngleY + (float) Math.toRadians(0), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-12+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206))*1));


        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(98.6187-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*1), frontrightleg3.rotateAngleY + (float) Math.toRadians(51.0211), frontrightleg3.rotateAngleZ + (float) Math.toRadians(16.9178));


        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(70.1202), backRightLeg.rotateAngleY + (float) Math.toRadians(4.2756), backRightLeg.rotateAngleZ + (float) Math.toRadians(32.1056));


        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(3.25-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*1), backRightLeg2.rotateAngleY + (float) Math.toRadians(0), backRightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(0);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(-0.175);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(64.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*1), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(19.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*1), backRightLeg4.rotateAngleY + (float) Math.toRadians(0), backRightLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(0);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(0);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(-0.2);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-30))*1), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5))*-0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-70))*0.2);



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 1.9 + (((tickAnim - 0) / 17) * (34-(1.9)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 34 + (((tickAnim - 17) / 6) * (125.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*150-(34)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 125.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*150 + (((tickAnim - 23) / 10) * (-3.25-(125.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*150)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 10) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -3.25 + (((tickAnim - 33) / 2) * (1.9-(-3.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -15.275 + (((tickAnim - 0) / 16) * (7.25-(-15.275)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 7.25 + (((tickAnim - 16) / 5) * (-47.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100-(7.25)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = -47.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100 + (((tickAnim - 21) / 12) * (-19.25-(-47.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-100)));
            yy = 0 + (((tickAnim - 21) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 12) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -19.25 + (((tickAnim - 33) / 2) * (-15.275-(-19.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = -0.675 + (((tickAnim - 21) / 1) * (-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.8-(-0.675)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 22) / 11) * (0-(0)));
            yy = -0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.8 + (((tickAnim - 22) / 11) * (0-(-0.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*0.8)));
            zz = 0 + (((tickAnim - 22) / 11) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.5 + (((tickAnim - 0) / 5) * (-3.64-(14.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = -3.64 + (((tickAnim - 5) / 11) * (37-(-3.64)));
            yy = 0 + (((tickAnim - 5) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 11) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 37 + (((tickAnim - 16) / 4) * (-23.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-80-(37)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -23.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-80 + (((tickAnim - 20) / 13) * (23.25-(-23.975-Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-80)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 23.25 + (((tickAnim - 33) / 2) * (14.5-(23.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0.375 + (((tickAnim - 0) / 16) * (0-(0.375)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 16) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 17) * (0.35-(0)));
            zz = 0 + (((tickAnim - 16) / 17) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0.35 + (((tickAnim - 33) / 2) * (0.375-(0.35)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (-24.13-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -24.13 + (((tickAnim - 8) / 8) * (-24-(-24.13)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -24 + (((tickAnim - 16) / 4) * (-17.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*30-(-24)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -17.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*30 + (((tickAnim - 20) / 12) * (0-(-17.1-Math.sin((Math.PI/180)*(((double)tickAnim/20)*250))*30)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.025-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.025 + (((tickAnim - 23) / 3) * (0.02-(0.025)));
            zz = -0.5 + (((tickAnim - 23) / 3) * (-0.45-(-0.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0.02 + (((tickAnim - 26) / 6) * (0-(0.02)));
            zz = -0.45 + (((tickAnim - 26) / 6) * (0-(-0.45)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-50))*-1), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-100))*1), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-150))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*2), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-200))*6), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-200))*6));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*4), tail5.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-250))*9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-250))*9));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-300))*7), tail6.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-300))*12), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-300))*12));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*1), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-30))*-1.2), body2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-100))*-1.5), body3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -8.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50 + (((tickAnim - 0) / 6) * (-26-(-8.75-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*50)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 24) {
            xx = -26 + (((tickAnim - 6) / 18) * (28.25-(-26)));
            yy = 0 + (((tickAnim - 6) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 18) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 28.25 + (((tickAnim - 24) / 11) * (83.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-20))*100-(28.25)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 145.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*250 + (((tickAnim - 0) / 6) * (7-(145.05-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50+50))*250)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 24) {
            xx = 7 + (((tickAnim - 6) / 18) * (7-(7)));
            yy = 0 + (((tickAnim - 6) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 18) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 24) / 11) * (203.475-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250-(7)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.4 + (((tickAnim - 0) / 6) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 6) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 18) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 11) * (-0.4-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 86.75 + (((tickAnim - 0) / 6) * (18.75-(86.75)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 18.75 + (((tickAnim - 6) / 4) * (7.43-(18.75)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 7.43 + (((tickAnim - 10) / 6) * (-7.91-(7.43)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -7.91 + (((tickAnim - 16) / 8) * (61.5-(-7.91)));
            yy = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 61.5 + (((tickAnim - 24) / 4) * (110.71-(61.5)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 110.71 + (((tickAnim - 28) / 7) * (86.75-(110.71)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.15 + (((tickAnim - 6) / 4) * (0.32-(0.15)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0.32 + (((tickAnim - 10) / 6) * (0.1-(0.32)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 0.1 + (((tickAnim - 16) / 8) * (0.175-(0.1)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 0.175 + (((tickAnim - 24) / 4) * (0.405-(0.175)));
            zz = 0 + (((tickAnim - 24) / 4) * (-0.35-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            yy = 0.405 + (((tickAnim - 28) / 3) * (0.74-(0.405)));
            zz = -0.35 + (((tickAnim - 28) / 3) * (-0.53-(-0.35)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0.74 + (((tickAnim - 31) / 4) * (0-(0.74)));
            zz = -0.53 + (((tickAnim - 31) / 4) * (0-(-0.53)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*-1), neck.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5-50))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*-1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.55 + (((tickAnim - 0) / 8) * (28.25-(5.55)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 28.25 + (((tickAnim - 8) / 9) * (59.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100-(28.25)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 59.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100 + (((tickAnim - 17) / 7) * (-26-(59.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*100)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = -26 + (((tickAnim - 24) / 11) * (5.55-(-26)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 0) / 8) * (7-(6.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 7 + (((tickAnim - 8) / 10) * (62.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150-(7)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 62.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150 + (((tickAnim - 18) / 6) * (7-(62.375-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*150)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 7 + (((tickAnim - 24) / 11) * (6.25-(7)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -12.25 + (((tickAnim - 0) / 6) * (5.89-(-12.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 5.89 + (((tickAnim - 6) / 6) * (99.46-(5.89)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 99.46 + (((tickAnim - 12) / 6) * (86.75-(99.46)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 86.75 + (((tickAnim - 18) / 6) * (19.5-(86.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 19.5 + (((tickAnim - 24) / 11) * (-12.25-(19.5)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 6) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (1.105-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (-0.35-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.105 + (((tickAnim - 12) / 2) * (0.99-(1.105)));
            zz = -0.35 + (((tickAnim - 12) / 2) * (-0.53-(-0.35)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0.99 + (((tickAnim - 14) / 2) * (0.74-(0.99)));
            zz = -0.53 + (((tickAnim - 14) / 2) * (-0.53-(-0.53)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0.74 + (((tickAnim - 16) / 2) * (0-(0.74)));
            zz = -0.53 + (((tickAnim - 16) / 2) * (0-(-0.53)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 6) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.075 + (((tickAnim - 24) / 11) * (-0.1-(-0.075)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 24.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*70 + (((tickAnim - 0) / 12) * (-7.75-(24.25-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*70)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 31) {
            xx = -7.75 + (((tickAnim - 12) / 19) * (34-(-7.75)));
            yy = 0 + (((tickAnim - 12) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 19) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 34 + (((tickAnim - 31) / 4) * (306.225-Math.sin((Math.PI/180)*(((double)tickAnim/20)*40))*300-(34)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 35.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-30 + (((tickAnim - 0) / 12) * (-16.75-(35.2-Math.sin((Math.PI/180)*(((double)tickAnim/20)*200))*-30)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 31) {
            xx = -16.75 + (((tickAnim - 12) / 19) * (7.25-(-16.75)));
            yy = 0 + (((tickAnim - 12) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 19) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 31) / 4) * (35.175-(7.25)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.8 + (((tickAnim - 0) / 12) * (0-(-0.675+Math.sin((Math.PI/180)*(((double)tickAnim/20)*350))*-0.8)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 12) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 19) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 4) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 25.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250 + (((tickAnim - 0) / 12) * (23.25-(25.55-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*250)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 23.25 + (((tickAnim - 12) / 9) * (-4.97-(23.25)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -4.97 + (((tickAnim - 21) / 10) * (37-(-4.97)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 37 + (((tickAnim - 31) / 4) * (25.525-(37)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.445-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.445 + (((tickAnim - 8) / 4) * (-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4-(0.445)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = -1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4 + (((tickAnim - 12) / 9) * (0.275-(-1.95+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*4)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 21) / 14) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 14) * (0-(0.275)));
            zz = 0 + (((tickAnim - 21) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-20 + (((tickAnim - 0) / 12) * (0-(-0-Math.sin((Math.PI/180)*(((double)tickAnim/20)*450))*-20)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 9) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 21) / 3) * (-26.25-(0)));
            yy = 0 + (((tickAnim - 21) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 3) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 31) {
            xx = -26.25 + (((tickAnim - 24) / 7) * (-24-(-26.25)));
            yy = 0 + (((tickAnim - 24) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 7) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -24 + (((tickAnim - 31) / 4) * (0-(-24)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            yy = 0.025 + (((tickAnim - 3) / 9) * (0-(0.025)));
            zz = -0.5 + (((tickAnim - 3) / 9) * (0-(-0.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 12) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 12) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 12) / 12) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            yy = -0.075 + (((tickAnim - 24) / 11) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEpoidesuchus entity = (EntityPrehistoricFloraEpoidesuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*9), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*1.5);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.4128 + (((tickAnim - 0) / 8) * (25.25-(-6.4128)));
            yy = -16.2925 + (((tickAnim - 0) / 8) * (0-(-16.2925)));
            zz = -2.3022 + (((tickAnim - 0) / 8) * (0-(-2.3022)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 25.25 + (((tickAnim - 8) / 4) * (179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400-(25.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (-8.3591-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-2.1863-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400 + (((tickAnim - 12) / 3) * (-6.4128-(179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400)));
            yy = -8.3591 + (((tickAnim - 12) / 3) * (-16.2925-(-8.3591)));
            zz = -2.1863 + (((tickAnim - 12) / 3) * (-2.3022-(-2.1863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13.25 + (((tickAnim - 0) / 3) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.75 + (((tickAnim - 8) / 4) * (43.47-(27.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 43.47 + (((tickAnim - 12) / 3) * (-13.25-(43.47)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 3) * (-0.45-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 3) / 5) * (-0.7-(-0.45)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.7 + (((tickAnim - 8) / 7) * (-0.625-(-0.7)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.2318 + (((tickAnim - 0) / 3) * (-2.9268-(28.2318)));
            yy = 0.5727 + (((tickAnim - 0) / 3) * (0.3182-(0.5727)));
            zz = 0.5889 + (((tickAnim - 0) / 3) * (0.3272-(0.5889)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.9268 + (((tickAnim - 3) / 3) * (48.9293-(-2.9268)));
            yy = 0.3182 + (((tickAnim - 3) / 3) * (0.1273-(0.3182)));
            zz = 0.3272 + (((tickAnim - 3) / 3) * (0.1309-(0.3272)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 48.9293 + (((tickAnim - 6) / 2) * (33.5-(48.9293)));
            yy = 0.1273 + (((tickAnim - 6) / 2) * (0-(0.1273)));
            zz = 0.1309 + (((tickAnim - 6) / 2) * (0-(0.1309)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 33.5 + (((tickAnim - 8) / 4) * (-13.9268-(33.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0.3182-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0.3272-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -13.9268 + (((tickAnim - 12) / 3) * (28.2318-(-13.9268)));
            yy = 0.3182 + (((tickAnim - 12) / 3) * (0.5727-(0.3182)));
            zz = 0.3272 + (((tickAnim - 12) / 3) * (0.5889-(0.3272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 8) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -33.25 + (((tickAnim - 4) / 2) * (-62.5-(-33.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -62.5 + (((tickAnim - 6) / 2) * (0-(-62.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 28 + (((tickAnim - 12) / 3) * (0-(28)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 2) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -0.425 + (((tickAnim - 12) / 3) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*9), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*9), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*9), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*9), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(10.5-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*9), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*-9), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*3), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*9), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.325);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.1873 + (((tickAnim - 0) / 3) * (0-(43.1873)));
            yy = -3.6695 + (((tickAnim - 0) / 3) * (0-(-3.6695)));
            zz = 2.1255 + (((tickAnim - 0) / 3) * (-46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200-(2.1255)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200 + (((tickAnim - 3) / 4) * (0-(-46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*200)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 7) / 8) * (43.1873-(-85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 7) / 8) * (-3.6695-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (2.1255-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-41.125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 13.25 + (((tickAnim - 0) / 3) * (-6.625-(13.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -41.125 + (((tickAnim - 3) / 4) * (9.75-(-41.125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -6.625 + (((tickAnim - 3) / 4) * (0-(-6.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 9.75 + (((tickAnim - 7) / 2) * (-32.925-(9.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (3.975-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -32.925 + (((tickAnim - 9) / 6) * (0-(-32.925)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 3.975 + (((tickAnim - 9) / 6) * (13.25-(3.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99.5 + (((tickAnim - 0) / 3) * (112.12-(99.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 112.12 + (((tickAnim - 3) / 4) * (23.5-(112.12)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 23.5 + (((tickAnim - 7) / 2) * (23.5167-(23.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-4.05-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23.5167 + (((tickAnim - 9) / 2) * (12-(23.5167)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = -4.05 + (((tickAnim - 9) / 2) * (-6.75-(-4.05)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 11) / 4) * (113-(12)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -6.75 + (((tickAnim - 11) / 4) * (0-(-6.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.52-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.52 + (((tickAnim - 2) / 1) * (0.745-(0.52)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.745 + (((tickAnim - 3) / 4) * (0.05-(0.745)));
            zz = -0.35 + (((tickAnim - 3) / 4) * (0-(-0.35)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 1) * (0.665-(0.05)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 8) / 1) * (0-(0.665)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*8), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 35.1671 + (((tickAnim - 0) / 3) * (0-(35.1671)));
            yy = 3.6961 + (((tickAnim - 0) / 3) * (0-(3.6961)));
            zz = -2.5686 + (((tickAnim - 0) / 3) * (46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(-2.5686)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 3) / 4) * (0-(46.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200 + (((tickAnim - 7) / 8) * (35.1671-(-85.6-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-200)));
            yy = 0 + (((tickAnim - 7) / 8) * (3.6961-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (-2.5686-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-41.125-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -13.25 + (((tickAnim - 0) / 3) * (-6.625-(-13.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -41.125 + (((tickAnim - 3) / 4) * (9.75-(-41.125)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = -6.625 + (((tickAnim - 3) / 4) * (0-(-6.625)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 9.75 + (((tickAnim - 7) / 2) * (-32.925-(9.75)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (-3.975-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -32.925 + (((tickAnim - 9) / 6) * (0-(-32.925)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = -3.975 + (((tickAnim - 9) / 6) * (-13.25-(-3.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 99.5 + (((tickAnim - 0) / 3) * (112.12-(99.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 112.12 + (((tickAnim - 3) / 4) * (23.5-(112.12)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 23.5 + (((tickAnim - 7) / 2) * (23.5167-(23.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (4.05-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 23.5167 + (((tickAnim - 9) / 2) * (12-(23.5167)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 4.05 + (((tickAnim - 9) / 2) * (6.75-(4.05)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 12 + (((tickAnim - 11) / 4) * (99.5-(12)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 6.75 + (((tickAnim - 11) / 4) * (0-(6.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.52-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.52 + (((tickAnim - 2) / 1) * (0.745-(0.52)));
            zz = 0 + (((tickAnim - 2) / 1) * (-0.35-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.745 + (((tickAnim - 3) / 4) * (0.05-(0.745)));
            zz = -0.35 + (((tickAnim - 3) / 4) * (0-(-0.35)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.05 + (((tickAnim - 7) / 1) * (0.665-(0.05)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.665 + (((tickAnim - 8) / 1) * (0-(0.665)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -6.4128 + (((tickAnim - 0) / 8) * (25.25-(-6.4128)));
            yy = 16.2925 + (((tickAnim - 0) / 8) * (0-(16.2925)));
            zz = 2.3022 + (((tickAnim - 0) / 8) * (0-(2.3022)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 25.25 + (((tickAnim - 8) / 4) * (179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400-(25.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (8.3591-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (2.1863-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400 + (((tickAnim - 12) / 3) * (-6.4128-(179.4488-Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*400)));
            yy = 8.3591 + (((tickAnim - 12) / 3) * (16.2925-(8.3591)));
            zz = 2.1863 + (((tickAnim - 12) / 3) * (2.3022-(2.1863)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -13.25 + (((tickAnim - 0) / 3) * (0-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (27.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.75 + (((tickAnim - 8) / 4) * (43.47-(27.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 43.47 + (((tickAnim - 12) / 3) * (-13.25-(43.47)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.625 + (((tickAnim - 0) / 3) * (-0.45-(-0.625)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 3) / 5) * (-0.7-(-0.45)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.7 + (((tickAnim - 8) / 7) * (-0.625-(-0.7)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 28.2318 + (((tickAnim - 0) / 3) * (-2.9268-(28.2318)));
            yy = -0.5727 + (((tickAnim - 0) / 3) * (-0.3182-(-0.5727)));
            zz = -0.5889 + (((tickAnim - 0) / 3) * (-0.3272-(-0.5889)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -2.9268 + (((tickAnim - 3) / 3) * (48.9293-(-2.9268)));
            yy = -0.3182 + (((tickAnim - 3) / 3) * (-0.1273-(-0.3182)));
            zz = -0.3272 + (((tickAnim - 3) / 3) * (-0.1309-(-0.3272)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 48.9293 + (((tickAnim - 6) / 2) * (33.5-(48.9293)));
            yy = -0.1273 + (((tickAnim - 6) / 2) * (0-(-0.1273)));
            zz = -0.1309 + (((tickAnim - 6) / 2) * (0-(-0.1309)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 33.5 + (((tickAnim - 8) / 4) * (-13.9268-(33.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (-0.3182-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.3272-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -13.9268 + (((tickAnim - 12) / 3) * (28.2318-(-13.9268)));
            yy = -0.3182 + (((tickAnim - 12) / 3) * (-0.5727-(-0.3182)));
            zz = -0.3272 + (((tickAnim - 12) / 3) * (-0.5889-(-0.3272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 8) * (0-(-0.175)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (-33.25-(0)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -33.25 + (((tickAnim - 4) / 2) * (-62.5-(-33.25)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -62.5 + (((tickAnim - 6) / 2) * (0-(-62.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 28 + (((tickAnim - 12) / 3) * (0-(28)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.75-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 2) * (0-(-0.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-0.425-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -0.425 + (((tickAnim - 12) / 3) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);


    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEpoidesuchus e = (EntityPrehistoricFloraEpoidesuchus) entity;
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
