package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStolokrosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStolokrosuchus extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg2;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontrightleg;
    private final AdvancedModelRenderer frontrightleg2;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;

    private ModelAnimator animator;

    public ModelStolokrosuchus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 12.5621F, 8.9913F);
        this.main.cubeList.add(new ModelBox(main, 27, 0, -3.0F, -1.6121F, -2.9913F, 6, 6, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5871F, 0.0087F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 26, -2.5F, -0.8F, -3.0F, 5, 2, 6, -0.001F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(3.0F, 0.5162F, 1.2774F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.5672F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 40, 69, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(1.0F, 5.0F, -2.0F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.829F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 70, 73, -2.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 7.5133F, 1.452F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.2618F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 67, 53, -2.5F, 0.0F, -2.5F, 3, 1, 3, 0.004F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 86, 44, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.0F, 0.5162F, 1.2774F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.5672F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 40, 69, -1.5F, -1.0F, -2.0F, 3, 6, 4, 0.0F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-1.0F, 5.0F, -2.0F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.829F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 70, 73, 0.0F, 0.0F, 0.0F, 2, 8, 3, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 7.5133F, 1.452F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.2618F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 67, 53, -0.5F, 0.0F, -2.5F, 3, 1, 3, 0.004F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 86, 44, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.3121F, 2.0087F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 27, 26, -2.5F, -0.75F, 0.0F, 5, 5, 6, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.0F, 3.0F);
        this.tail.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 58, -2.0F, -0.65F, -3.0F, 4, 1, 6, -0.003F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 5.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 28, -2.0F, -0.75F, 0.0F, 4, 4, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 58, -1.5F, -1.7F, 0.0F, 3, 1, 7, -0.002F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0191F, 5.9459F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.2618F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 40, -1.5F, -0.75F, 0.0F, 3, 4, 7, -0.003F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 67, -1.0F, -0.2F, 0.0F, 2, 1, 7, -0.005F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 52, -1.0F, -0.75F, 0.0F, 2, 3, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 55, 73, 0.6F, -1.55F, 0.0F, 0, 1, 7, -0.003F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 55, 73, -0.6F, -1.55F, 0.0F, 0, 1, 7, -0.003F, true));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 52, 0, -0.5F, -0.75F, 0.0F, 1, 2, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 67, 35, 0.4F, -1.5F, 0.0F, 0, 1, 8, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 67, 35, -0.4F, -1.5F, 0.0F, 0, 1, 8, 0.0F, true));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.1552F, 7.7805F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 46, 38, -0.5F, -0.109F, -0.7108F, 1, 1, 9, -0.002F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 40, 58, 0.25F, -0.609F, -0.7108F, 0, 1, 9, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 40, 58, -0.25F, -0.609F, -0.7108F, 0, 1, 9, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.0621F, -1.9913F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.75F, -6.0F, 7, 7, 6, 0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.75F, -3.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 49, -2.5F, -1.0F, -3.0F, 5, 2, 6, -0.003F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.0375F, -5.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -3.5F, -1.7125F, -6.0F, 7, 7, 6, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.7875F, -3.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 49, -2.5F, -1.0F, -3.0F, 5, 2, 6, -0.001F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0789F, -4.9942F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 27, 13, -3.0F, -1.5414F, -6.0058F, 6, 6, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.4586F, -3.1942F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0785F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 11, -2.0F, -1.0F, -3.0F, 4, 2, 6, -0.003F, false));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(2.75F, 3.5117F, -3.7944F);
        this.body3.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.4363F, 0.0F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 81, 74, -1.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRenderer(this);
        this.frontleftleg2.setRotationPoint(1.0F, 3.0867F, 0.3389F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, -0.7418F, 0.0F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 71, 85, -2.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(0.0F, 4.5504F, 0.0056F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.288F, 0.0F, 0.0F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 52, 20, -2.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.frontrightleg = new AdvancedModelRenderer(this);
        this.frontrightleg.setRotationPoint(-2.75F, 3.5117F, -3.7944F);
        this.body3.addChild(frontrightleg);
        this.setRotateAngle(frontrightleg, 0.4363F, 0.0F, 0.0F);
        this.frontrightleg.cubeList.add(new ModelBox(frontrightleg, 81, 74, -1.5F, -1.0F, -1.5F, 3, 5, 3, 0.0F, true));

        this.frontrightleg2 = new AdvancedModelRenderer(this);
        this.frontrightleg2.setRotationPoint(-1.0F, 3.0867F, 0.3389F);
        this.frontrightleg.addChild(frontrightleg2);
        this.setRotateAngle(frontrightleg2, -0.7418F, 0.0F, 0.0F);
        this.frontrightleg2.cubeList.add(new ModelBox(frontrightleg2, 71, 85, 0.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F, true));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(0.0F, 4.5504F, 0.0056F);
        this.frontrightleg2.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, 0.288F, 0.0F, 0.0F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 52, 20, -0.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.6496F, -5.1941F);
        this.body3.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 23, 38, -2.5F, -1.841F, -5.3117F, 5, 4, 6, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -2.116F, -2.5617F);
        this.neck.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 0, -2.5F, -0.5F, -2.5F, 4, 1, 5, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.159F, -5.3117F);
        this.neck.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 67, 45, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.02F, -1.7906F, -4.8317F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 15, 83, -0.48F, 0.1608F, -14.3118F, 1, 1, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 59, 66, -2.48F, 0.8496F, -4.4799F, 5, 1, 5, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 87, 1.42F, 0.2246F, -4.3799F, 1, 1, 4, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 87, -2.38F, 0.2246F, -4.3799F, 1, 1, 4, 0.003F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 74, -0.98F, 0.8496F, -9.4799F, 2, 1, 5, 0.006F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 76, -0.98F, 0.8496F, -14.4799F, 2, 1, 5, 0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 63, -0.73F, 0.8496F, -15.9799F, 2, 1, 2, -0.003F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 88, 0.77F, 1.3496F, -12.6049F, 0, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 88, -0.73F, 1.3496F, -12.6049F, 0, 1, 3, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 30, 76, -1.23F, 0.8496F, -15.9799F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.48F, 0.0996F, -13.9799F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 30, -0.5F, -0.125F, -2.125F, 2, 1, 2, -0.003F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.005F, 1.3496F, -15.4799F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 28, -1.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 28, 1.05F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.17F, 1.0996F, -14.1049F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.5236F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 31, -1.0F, 0.0F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 31, 0.7F, 0.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.23F, 1.5996F, -6.1049F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 30, -0.3F, -0.5F, -2.5F, 0, 1, 5, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.27F, 1.5996F, -6.1049F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.3054F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 30, 0.3F, -0.5F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.48F, 1.3496F, -4.4799F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 80, 60, 0.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.52F, 1.3496F, -4.4799F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3054F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 80, 60, -2.0F, -0.5F, -5.0F, 2, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.48F, 0.0234F, -6.2898F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 30, 80, -0.5F, 0.0F, -3.15F, 2, 1, 5, -0.003F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.48F, -0.2205F, -4.568F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 9, 63, -0.5F, 0.025F, -2.0F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.98F, -0.117F, -4.991F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 81, 83, -0.5F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.48F, -0.7681F, -2.0469F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0262F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 45, 82, -1.5F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.1524F, 1.9118F, 0.5128F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 67, -2.6324F, -0.0622F, -4.9928F, 5, 1, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 81, 67, -1.6324F, -2.0622F, -4.2428F, 3, 2, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 80, 53, -1.1324F, -0.0622F, -9.9928F, 2, 1, 5, 0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 73, 14, -1.1324F, -0.0622F, -15.9928F, 2, 1, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.6324F, 0.4378F, -4.9928F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.3054F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 84, 37, 0.25F, -0.75F, -5.0F, 0, 1, 5, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 81, 0.0F, -0.5F, -5.0F, 2, 1, 5, -0.003F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.8824F, 0.1878F, -12.9928F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 85, 0.0F, -0.725F, -2.5F, 0, 1, 5, 0.0F, true));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 60, 85, 1.5F, -0.725F, -2.5F, 0, 1, 5, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.6324F, 0.4416F, -4.9056F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0829F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 73, 22, -0.5F, 0.0F, -6.0F, 2, 1, 6, -0.003F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.6324F, 1.4378F, -5.0428F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0873F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 73, 7, -1.5F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(2.3676F, 0.4378F, -4.9928F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.3054F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 84, 37, -0.25F, -0.75F, -5.0F, 0, 1, 5, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 81, -2.0F, -0.5F, -5.0F, 2, 1, 5, -0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.02F, -0.0504F, -2.5049F);
        this.head.addChild(eye);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.eye.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, -0.2182F, 0.2182F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 86, 49, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.eye.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.2182F, -0.2182F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 86, 49, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));


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
        this.main.offsetY = -0.2F;
        this.main.offsetX = -0.02F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 0.6F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.offsetY = -0.2F;
        this.main.render(0.01F);
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

        EntityPrehistoricFloraStolokrosuchus entityStolokrosuchus = (EntityPrehistoricFloraStolokrosuchus) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        entityStolokrosuchus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityStolokrosuchus.getAnimation() == entityStolokrosuchus.LAY_ANIMATION || entityStolokrosuchus.getAnimation() == entityStolokrosuchus.STAND_ANIMATION) {
            this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
            this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);

        }
        else {
            if (!entityStolokrosuchus.isReallyInWater()) {

                if (f3 == 0.0F || !entityStolokrosuchus.getIsMoving()) {
                    if (entityStolokrosuchus.getAnimation() != entityStolokrosuchus.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityStolokrosuchus.getIsFast()) { //Running


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
//        this.eye.setScale(1, 1, 1);

        EntityPrehistoricFloraStolokrosuchus ee = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) {
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


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
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animBask(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 10) / 10) * (0-(3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.99796-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.5473-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.39388-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.99796 + (((tickAnim - 10) / 10) * (0-(4.99796)));
            yy = -1.5473 + (((tickAnim - 10) / 10) * (0-(-1.5473)));
            zz = -2.39388 + (((tickAnim - 10) / 10) * (0-(-2.39388)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (4.73587-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-3.28248-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.79062-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.73587 + (((tickAnim - 10) / 10) * (0-(4.73587)));
            yy = -3.28248 + (((tickAnim - 10) / 10) * (0-(-3.28248)));
            zz = -5.79062 + (((tickAnim - 10) / 10) * (0-(-5.79062)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -9.5 + (((tickAnim - 10) / 10) * (0-(-9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-25.95613-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (13.05197-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (6.93134-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25.95613 + (((tickAnim - 10) / 10) * (0-(-25.95613)));
            yy = 13.05197 + (((tickAnim - 10) / 10) * (0-(13.05197)));
            zz = 6.93134 + (((tickAnim - 10) / 10) * (0-(6.93134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.40109-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.68407-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (4.22005-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.40109 + (((tickAnim - 10) / 10) * (0-(14.40109)));
            yy = -2.68407 + (((tickAnim - 10) / 10) * (0-(-2.68407)));
            zz = 4.22005 + (((tickAnim - 10) / 10) * (0-(4.22005)));
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
            zz = 0 + (((tickAnim - 0) / 10) * (22.75-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 22.75 + (((tickAnim - 10) / 10) * (0-(22.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-37.97987-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.93988-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-16.85134-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -37.97987 + (((tickAnim - 10) / 10) * (0-(-37.97987)));
            yy = 3.93988 + (((tickAnim - 10) / 10) * (0-(3.93988)));
            zz = -16.85134 + (((tickAnim - 10) / 10) * (0-(-16.85134)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25.41205-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.00938-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-3.34723-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 25.41205 + (((tickAnim - 10) / 10) * (0-(25.41205)));
            yy = 3.00938 + (((tickAnim - 10) / 10) * (0-(3.00938)));
            zz = -3.34723 + (((tickAnim - 10) / 10) * (0-(-3.34723)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.125-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0.68707-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.99965-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-9.37768-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.68707 + (((tickAnim - 10) / 3) * (7.70804-(0.68707)));
            yy = 4.99965 + (((tickAnim - 10) / 3) * (3.3331-(4.99965)));
            zz = -9.37768 + (((tickAnim - 10) / 3) * (-6.25179-(-9.37768)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.70804 + (((tickAnim - 13) / 7) * (0-(7.70804)));
            yy = 3.3331 + (((tickAnim - 13) / 7) * (0-(3.3331)));
            zz = -6.25179 + (((tickAnim - 13) / 7) * (0-(-6.25179)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.27955-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (6.73135-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.50255-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.27955 + (((tickAnim - 10) / 3) * (7.39696-(-7.27955)));
            yy = 6.73135 + (((tickAnim - 10) / 3) * (4.48757-(6.73135)));
            zz = -0.50255 + (((tickAnim - 10) / 3) * (-0.33503-(-0.50255)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.39696 + (((tickAnim - 13) / 7) * (0-(7.39696)));
            yy = 4.48757 + (((tickAnim - 13) / 7) * (0-(4.48757)));
            zz = -0.33503 + (((tickAnim - 13) / 7) * (0-(-0.33503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 14.25 + (((tickAnim - 10) / 3) * (0-(14.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 35.5 + (((tickAnim - 18) / 17) * (-6.25-(35.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.25 + (((tickAnim - 35) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 14.25 + (((tickAnim - 18) / 8) * (-8.62-(14.25)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = -8.62 + (((tickAnim - 26) / 9) * (-24.25-(-8.62)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -24.25 + (((tickAnim - 35) / 15) * (0-(-24.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (1.875-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-0.125-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 1.875 + (((tickAnim - 26) / 5) * (1.63-(1.875)));
            zz = -0.125 + (((tickAnim - 26) / 5) * (-0.06-(-0.125)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.63 + (((tickAnim - 31) / 4) * (0-(1.63)));
            zz = -0.06 + (((tickAnim - 31) / 4) * (0-(-0.06)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (12.14-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 12.14 + (((tickAnim - 7) / 11) * (64-(12.14)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 64 + (((tickAnim - 18) / 8) * (54.25-(64)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 54.25 + (((tickAnim - 26) / 9) * (28.25-(54.25)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 28.25 + (((tickAnim - 35) / 15) * (0-(28.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.6-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = -0.35 + (((tickAnim - 7) / 5) * (0.505-(-0.35)));
            zz = 0.6 + (((tickAnim - 7) / 5) * (1.02-(0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.505 + (((tickAnim - 12) / 6) * (0.825-(0.505)));
            zz = 1.02 + (((tickAnim - 12) / 6) * (0.425-(1.02)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.825 + (((tickAnim - 18) / 4) * (1.87-(0.825)));
            zz = 0.425 + (((tickAnim - 18) / 4) * (0.68-(0.425)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            yy = 1.87 + (((tickAnim - 22) / 4) * (2.385-(1.87)));
            zz = 0.68 + (((tickAnim - 22) / 4) * (0.21-(0.68)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 26) / 5) * (0-(0)));
            yy = 2.385 + (((tickAnim - 26) / 5) * (1.435-(2.385)));
            zz = 0.21 + (((tickAnim - 26) / 5) * (0.09-(0.21)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            yy = 1.435 + (((tickAnim - 31) / 4) * (0-(1.435)));
            zz = 0.09 + (((tickAnim - 31) / 4) * (0-(0.09)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-31.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -31.5 + (((tickAnim - 7) / 11) * (19.75-(-31.5)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 19.75 + (((tickAnim - 18) / 8) * (1.63-(19.75)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 1.63 + (((tickAnim - 26) / 9) * (0-(1.63)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0.96-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0.96 + (((tickAnim - 12) / 6) * (-0.425-(0.96)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0.05-(0)));
            zz = -0.425 + (((tickAnim - 18) / 8) * (0.84-(-0.425)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0.05 + (((tickAnim - 26) / 9) * (0-(0.05)));
            zz = 0.84 + (((tickAnim - 26) / 9) * (0-(0.84)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.15-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -3.15 + (((tickAnim - 20) / 10) * (-3.15-(-3.15)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3.15 + (((tickAnim - 30) / 20) * (0-(-3.15)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 20) / 10) * (-16-(-16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 30) / 20) * (0-(-16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.75 + (((tickAnim - 20) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 30) / 20) * (0-(30.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 20) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -16 + (((tickAnim - 20) / 10) * (-16-(-16)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 30) / 20) * (0-(-16)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 30.75 + (((tickAnim - 20) / 10) * (30.75-(30.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 30) / 20) * (0-(30.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -6.75 + (((tickAnim - 20) / 10) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 30) / 20) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.825 + (((tickAnim - 20) / 10) * (0.825-(0.825)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.825 + (((tickAnim - 30) / 20) * (0-(0.825)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 13.75 + (((tickAnim - 20) / 10) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 13.75 + (((tickAnim - 30) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 6.5 + (((tickAnim - 20) / 10) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 6.5 + (((tickAnim - 30) / 7) * (3.33-(6.5)));
            yy = 0 + (((tickAnim - 30) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 7) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 3.33 + (((tickAnim - 37) / 13) * (0-(3.33)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.58-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -2.58 + (((tickAnim - 7) / 13) * (-0.25-(-2.58)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -0.25 + (((tickAnim - 20) / 10) * (-0.25-(-0.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -0.25 + (((tickAnim - 30) / 20) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -5.5 + (((tickAnim - 20) / 10) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -5.5 + (((tickAnim - 30) / 20) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 20) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 30) / 20) * (0-(18.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.5 + (((tickAnim - 20) / 10) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 30) / 20) * (0-(10.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 18.75 + (((tickAnim - 20) / 10) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 30) / 20) * (0-(18.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -21.5 + (((tickAnim - 20) / 10) * (-21.5-(-21.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -21.5 + (((tickAnim - 30) / 20) * (0-(-21.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.5 + (((tickAnim - 20) / 10) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 30) / 20) * (0-(10.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 7.5 + (((tickAnim - 20) / 10) * (7.5-(7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 7.5 + (((tickAnim - 30) / 20) * (0-(7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animBask(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 640;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (-9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*3 + (((tickAnim - 44) / 36) * (-2.25-(-9.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+70))*3)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -2.25 + (((tickAnim - 80) / 75) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -2.25 + (((tickAnim - 155) / 245) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -2.25 + (((tickAnim - 400) / 100) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -2.25 + (((tickAnim - 500) / 100) * (-2.25-(-2.25)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -2.25 + (((tickAnim - 600) / 18) * (-12.47-(-2.25)));
            yy = 0 + (((tickAnim - 600) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 18) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = -12.47 + (((tickAnim - 618) / 22) * (0-(-12.47)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (-5.1-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            yy = -5.1 + (((tickAnim - 44) / 36) * (-6.5-(-5.1)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = -6.5 + (((tickAnim - 80) / 75) * (-6.5-(-6.5)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = -6.5 + (((tickAnim - 155) / 245) * (-6.5-(-6.5)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = -6.5 + (((tickAnim - 400) / 100) * (-6.5-(-6.5)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = -6.5 + (((tickAnim - 500) / 100) * (-6.5-(-6.5)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 600) / 40) * (0-(0)));
            yy = -6.5 + (((tickAnim - 600) / 40) * (0-(-6.5)));
            zz = 0 + (((tickAnim - 600) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (15.91248-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-2.82916-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-32.86296-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 15.91248 + (((tickAnim - 23) / 21) * (43.40867-(15.91248)));
            yy = -2.82916 + (((tickAnim - 23) / 21) * (-2.73842-(-2.82916)));
            zz = -32.86296 + (((tickAnim - 23) / 21) * (-48.99644-(-32.86296)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 43.40867 + (((tickAnim - 44) / 36) * (45.0545-(43.40867)));
            yy = -2.73842 + (((tickAnim - 44) / 36) * (-9.93375-(-2.73842)));
            zz = -48.99644 + (((tickAnim - 44) / 36) * (-55.27854-(-48.99644)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 45.0545 + (((tickAnim - 80) / 75) * (45.0545-(45.0545)));
            yy = -9.93375 + (((tickAnim - 80) / 75) * (-9.93375-(-9.93375)));
            zz = -55.27854 + (((tickAnim - 80) / 75) * (-55.27854-(-55.27854)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 45.0545 + (((tickAnim - 155) / 245) * (45.0545-(45.0545)));
            yy = -9.93375 + (((tickAnim - 155) / 245) * (-9.93375-(-9.93375)));
            zz = -55.27854 + (((tickAnim - 155) / 245) * (-55.27854-(-55.27854)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 45.0545 + (((tickAnim - 400) / 100) * (45.0545-(45.0545)));
            yy = -9.93375 + (((tickAnim - 400) / 100) * (-9.93375-(-9.93375)));
            zz = -55.27854 + (((tickAnim - 400) / 100) * (-55.27854-(-55.27854)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 45.0545 + (((tickAnim - 500) / 100) * (45.0545-(45.0545)));
            yy = -9.93375 + (((tickAnim - 500) / 100) * (-9.93375-(-9.93375)));
            zz = -55.27854 + (((tickAnim - 500) / 100) * (-55.27854-(-55.27854)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = 45.0545 + (((tickAnim - 600) / 18) * (53.53085-(45.0545)));
            yy = -9.93375 + (((tickAnim - 600) / 18) * (-21.90088-(-9.93375)));
            zz = -55.27854 + (((tickAnim - 600) / 18) * (-55.72879-(-55.27854)));
        }
        else if (tickAnim >= 618 && tickAnim < 625) {
            xx = 53.53085 + (((tickAnim - 618) / 7) * (53.53085-(53.53085)));
            yy = -21.90088 + (((tickAnim - 618) / 7) * (-21.90088-(-21.90088)));
            zz = -55.72879 + (((tickAnim - 618) / 7) * (-55.72879-(-55.72879)));
        }
        else if (tickAnim >= 625 && tickAnim < 640) {
            xx = 53.53085 + (((tickAnim - 625) / 15) * (0-(53.53085)));
            yy = -21.90088 + (((tickAnim - 625) / 15) * (0-(-21.90088)));
            zz = -55.72879 + (((tickAnim - 625) / 15) * (0-(-55.72879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.96-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0.96 + (((tickAnim - 13) / 31) * (10.84763-(0.96)));
            yy = 0 + (((tickAnim - 13) / 31) * (5.32611-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (-3.27506-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 10.84763 + (((tickAnim - 44) / 36) * (-9.48746-(10.84763)));
            yy = 5.32611 + (((tickAnim - 44) / 36) * (11.25571-(5.32611)));
            zz = -3.27506 + (((tickAnim - 44) / 36) * (-10.77938-(-3.27506)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -9.48746 + (((tickAnim - 80) / 75) * (-9.48746-(-9.48746)));
            yy = 11.25571 + (((tickAnim - 80) / 75) * (11.25571-(11.25571)));
            zz = -10.77938 + (((tickAnim - 80) / 75) * (-10.77938-(-10.77938)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -9.48746 + (((tickAnim - 155) / 245) * (-9.48746-(-9.48746)));
            yy = 11.25571 + (((tickAnim - 155) / 245) * (11.25571-(11.25571)));
            zz = -10.77938 + (((tickAnim - 155) / 245) * (-10.77938-(-10.77938)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -9.48746 + (((tickAnim - 400) / 100) * (-9.48746-(-9.48746)));
            yy = 11.25571 + (((tickAnim - 400) / 100) * (11.25571-(11.25571)));
            zz = -10.77938 + (((tickAnim - 400) / 100) * (-10.77938-(-10.77938)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -9.48746 + (((tickAnim - 500) / 100) * (-9.48746-(-9.48746)));
            yy = 11.25571 + (((tickAnim - 500) / 100) * (11.25571-(11.25571)));
            zz = -10.77938 + (((tickAnim - 500) / 100) * (-10.77938-(-10.77938)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -9.48746 + (((tickAnim - 600) / 18) * (-19.16306-(-9.48746)));
            yy = 11.25571 + (((tickAnim - 600) / 18) * (11.93876-(11.25571)));
            zz = -10.77938 + (((tickAnim - 600) / 18) * (-6.65958-(-10.77938)));
        }
        else if (tickAnim >= 618 && tickAnim < 625) {
            xx = -19.16306 + (((tickAnim - 618) / 7) * (-19.16306-(-19.16306)));
            yy = 11.93876 + (((tickAnim - 618) / 7) * (11.93876-(11.93876)));
            zz = -6.65958 + (((tickAnim - 618) / 7) * (-6.65958-(-6.65958)));
        }
        else if (tickAnim >= 625 && tickAnim < 633) {
            xx = -19.16306 + (((tickAnim - 625) / 8) * (24.16847-(-19.16306)));
            yy = 11.93876 + (((tickAnim - 625) / 8) * (5.96938-(11.93876)));
            zz = -6.65958 + (((tickAnim - 625) / 8) * (-3.32979-(-6.65958)));
        }
        else if (tickAnim >= 633 && tickAnim < 640) {
            xx = 24.16847 + (((tickAnim - 633) / 7) * (0-(24.16847)));
            yy = 5.96938 + (((tickAnim - 633) / 7) * (0-(5.96938)));
            zz = -3.32979 + (((tickAnim - 633) / 7) * (0-(-3.32979)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(0);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(0);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.09237-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.53153-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (22.79888-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.09237 + (((tickAnim - 8) / 10) * (13.69427-(12.09237)));
            yy = 0.53153 + (((tickAnim - 8) / 10) * (0.60188-(0.53153)));
            zz = 22.79888 + (((tickAnim - 8) / 10) * (28.48223-(22.79888)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 13.69427 + (((tickAnim - 18) / 26) * (1.50672-(13.69427)));
            yy = 0.60188 + (((tickAnim - 18) / 26) * (1.06423-(0.60188)));
            zz = 28.48223 + (((tickAnim - 18) / 26) * (65.82998-(28.48223)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 1.50672 + (((tickAnim - 44) / 36) * (-3.9771-(1.50672)));
            yy = 1.06423 + (((tickAnim - 44) / 36) * (-34.55478-(1.06423)));
            zz = 65.82998 + (((tickAnim - 44) / 36) * (86.44211-(65.82998)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -3.9771 + (((tickAnim - 80) / 75) * (-3.9771-(-3.9771)));
            yy = -34.55478 + (((tickAnim - 80) / 75) * (-34.55478-(-34.55478)));
            zz = 86.44211 + (((tickAnim - 80) / 75) * (86.44211-(86.44211)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -3.9771 + (((tickAnim - 155) / 245) * (-3.9771-(-3.9771)));
            yy = -34.55478 + (((tickAnim - 155) / 245) * (-34.55478-(-34.55478)));
            zz = 86.44211 + (((tickAnim - 155) / 245) * (86.44211-(86.44211)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -3.9771 + (((tickAnim - 400) / 100) * (-3.9771-(-3.9771)));
            yy = -34.55478 + (((tickAnim - 400) / 100) * (-34.55478-(-34.55478)));
            zz = 86.44211 + (((tickAnim - 400) / 100) * (86.44211-(86.44211)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -3.9771 + (((tickAnim - 500) / 100) * (-3.9771-(-3.9771)));
            yy = -34.55478 + (((tickAnim - 500) / 100) * (-34.55478-(-34.55478)));
            zz = 86.44211 + (((tickAnim - 500) / 100) * (86.44211-(86.44211)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -3.9771 + (((tickAnim - 600) / 18) * (5.36693-(-3.9771)));
            yy = -34.55478 + (((tickAnim - 600) / 18) * (-15.77266-(-34.55478)));
            zz = 86.44211 + (((tickAnim - 600) / 18) * (56.00655-(86.44211)));
        }
        else if (tickAnim >= 618 && tickAnim < 625) {
            xx = 5.36693 + (((tickAnim - 618) / 7) * (68.29449-(5.36693)));
            yy = -15.77266 + (((tickAnim - 618) / 7) * (10.53912-(-15.77266)));
            zz = 56.00655 + (((tickAnim - 618) / 7) * (50.93044-(56.00655)));
        }
        else if (tickAnim >= 625 && tickAnim < 633) {
            xx = 68.29449 + (((tickAnim - 625) / 8) * (72-(68.29449)));
            yy = 10.53912 + (((tickAnim - 625) / 8) * (0-(10.53912)));
            zz = 50.93044 + (((tickAnim - 625) / 8) * (0-(50.93044)));
        }
        else if (tickAnim >= 633 && tickAnim < 637) {
            xx = 72 + (((tickAnim - 633) / 4) * (48-(72)));
            yy = 0 + (((tickAnim - 633) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 633) / 4) * (0-(0)));
        }
        else if (tickAnim >= 637 && tickAnim < 640) {
            xx = 48 + (((tickAnim - 637) / 3) * (0-(48)));
            yy = 0 + (((tickAnim - 637) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 637) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.715-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 18) / 26) * (0-(0)));
            yy = 0.825 + (((tickAnim - 18) / 26) * (0-(0.825)));
            zz = 0.715 + (((tickAnim - 18) / 26) * (0.3-(0.715)));
        }
        else if (tickAnim >= 44 && tickAnim < 633) {
            xx = 0 + (((tickAnim - 44) / 589) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 589) * (1.55-(0)));
            zz = 0.3 + (((tickAnim - 44) / 589) * (0-(0.3)));
        }
        else if (tickAnim >= 633 && tickAnim < 637) {
            xx = 0 + (((tickAnim - 633) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 633) / 4) * (3.17-(1.55)));
            zz = 0 + (((tickAnim - 633) / 4) * (0.7-(0)));
        }
        else if (tickAnim >= 637 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 637) / 3) * (0-(0)));
            yy = 3.17 + (((tickAnim - 637) / 3) * (0-(3.17)));
            zz = 0.7 + (((tickAnim - 637) / 3) * (0-(0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -17.25 + (((tickAnim - 8) / 5) * (-17.15-(-17.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = -17.15 + (((tickAnim - 13) / 31) * (-14.75-(-17.15)));
            yy = 0 + (((tickAnim - 13) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -14.75 + (((tickAnim - 44) / 36) * (-5.25-(-14.75)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -5.25 + (((tickAnim - 80) / 75) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -5.25 + (((tickAnim - 155) / 245) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -5.25 + (((tickAnim - 400) / 100) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -5.25 + (((tickAnim - 500) / 100) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -5.25 + (((tickAnim - 600) / 18) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 600) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 18) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 625) {
            xx = 0 + (((tickAnim - 618) / 7) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 618) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 7) * (0-(0)));
        }
        else if (tickAnim >= 625 && tickAnim < 633) {
            xx = -61.25 + (((tickAnim - 625) / 8) * (21.13-(-61.25)));
            yy = 0 + (((tickAnim - 625) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 625) / 8) * (0-(0)));
        }
        else if (tickAnim >= 633 && tickAnim < 640) {
            xx = 21.13 + (((tickAnim - 633) / 7) * (0-(21.13)));
            yy = 0 + (((tickAnim - 633) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 633) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 0) / 618) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 618) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 618) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 625) {
            xx = 0 + (((tickAnim - 618) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 7) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 618) / 7) * (0.3-(0)));
        }
        else if (tickAnim >= 625 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 625) / 15) * (0-(0)));
            yy = -0.325 + (((tickAnim - 625) / 15) * (0-(-0.325)));
            zz = 0.3 + (((tickAnim - 625) / 15) * (0-(0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (15.91248-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.82916-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (32.86296-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 44) {
            xx = 15.91248 + (((tickAnim - 23) / 21) * (43.40867-(15.91248)));
            yy = 2.82916 + (((tickAnim - 23) / 21) * (2.73842-(2.82916)));
            zz = 32.86296 + (((tickAnim - 23) / 21) * (48.99644-(32.86296)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 43.40867 + (((tickAnim - 44) / 36) * (45.0545-(43.40867)));
            yy = 2.73842 + (((tickAnim - 44) / 36) * (9.93375-(2.73842)));
            zz = 48.99644 + (((tickAnim - 44) / 36) * (55.27854-(48.99644)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 45.0545 + (((tickAnim - 80) / 75) * (45.0545-(45.0545)));
            yy = 9.93375 + (((tickAnim - 80) / 75) * (9.93375-(9.93375)));
            zz = 55.27854 + (((tickAnim - 80) / 75) * (55.27854-(55.27854)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 45.0545 + (((tickAnim - 155) / 245) * (45.0545-(45.0545)));
            yy = 9.93375 + (((tickAnim - 155) / 245) * (9.93375-(9.93375)));
            zz = 55.27854 + (((tickAnim - 155) / 245) * (55.27854-(55.27854)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 45.0545 + (((tickAnim - 400) / 100) * (45.0545-(45.0545)));
            yy = 9.93375 + (((tickAnim - 400) / 100) * (9.93375-(9.93375)));
            zz = 55.27854 + (((tickAnim - 400) / 100) * (55.27854-(55.27854)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 45.0545 + (((tickAnim - 500) / 100) * (45.0545-(45.0545)));
            yy = 9.93375 + (((tickAnim - 500) / 100) * (9.93375-(9.93375)));
            zz = 55.27854 + (((tickAnim - 500) / 100) * (55.27854-(55.27854)));
        }
        else if (tickAnim >= 600 && tickAnim < 609) {
            xx = 45.0545 + (((tickAnim - 600) / 9) * (-22.09775-(45.0545)));
            yy = 9.93375 + (((tickAnim - 600) / 9) * (4.96688-(9.93375)));
            zz = 55.27854 + (((tickAnim - 600) / 9) * (27.63927-(55.27854)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = -22.09775 + (((tickAnim - 609) / 9) * (-7.75-(-22.09775)));
            yy = 4.96688 + (((tickAnim - 609) / 9) * (0-(4.96688)));
            zz = 27.63927 + (((tickAnim - 609) / 9) * (0-(27.63927)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = -7.75 + (((tickAnim - 618) / 22) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.96-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0.96 + (((tickAnim - 13) / 31) * (10.84763-(0.96)));
            yy = 0 + (((tickAnim - 13) / 31) * (-5.32611-(0)));
            zz = 0 + (((tickAnim - 13) / 31) * (3.27506-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 10.84763 + (((tickAnim - 44) / 36) * (-9.48746-(10.84763)));
            yy = -5.32611 + (((tickAnim - 44) / 36) * (-11.25571-(-5.32611)));
            zz = 3.27506 + (((tickAnim - 44) / 36) * (10.77938-(3.27506)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -9.48746 + (((tickAnim - 80) / 75) * (-9.48746-(-9.48746)));
            yy = -11.25571 + (((tickAnim - 80) / 75) * (-11.25571-(-11.25571)));
            zz = 10.77938 + (((tickAnim - 80) / 75) * (10.77938-(10.77938)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -9.48746 + (((tickAnim - 155) / 245) * (-9.48746-(-9.48746)));
            yy = -11.25571 + (((tickAnim - 155) / 245) * (-11.25571-(-11.25571)));
            zz = 10.77938 + (((tickAnim - 155) / 245) * (10.77938-(10.77938)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -9.48746 + (((tickAnim - 400) / 100) * (-9.48746-(-9.48746)));
            yy = -11.25571 + (((tickAnim - 400) / 100) * (-11.25571-(-11.25571)));
            zz = 10.77938 + (((tickAnim - 400) / 100) * (10.77938-(10.77938)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -9.48746 + (((tickAnim - 500) / 100) * (-9.48746-(-9.48746)));
            yy = -11.25571 + (((tickAnim - 500) / 100) * (-11.25571-(-11.25571)));
            zz = 10.77938 + (((tickAnim - 500) / 100) * (10.77938-(10.77938)));
        }
        else if (tickAnim >= 600 && tickAnim < 609) {
            xx = -9.48746 + (((tickAnim - 600) / 9) * (38.88127-(-9.48746)));
            yy = -11.25571 + (((tickAnim - 600) / 9) * (-5.62786-(-11.25571)));
            zz = 10.77938 + (((tickAnim - 600) / 9) * (5.38969-(10.77938)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = 38.88127 + (((tickAnim - 609) / 9) * (29.75-(38.88127)));
            yy = -5.62786 + (((tickAnim - 609) / 9) * (0-(-5.62786)));
            zz = 5.38969 + (((tickAnim - 609) / 9) * (0-(5.38969)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 29.75 + (((tickAnim - 618) / 22) * (0-(29.75)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.005-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.025-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 13) / 31) * (0-(0)));
            yy = 0.005 + (((tickAnim - 13) / 31) * (-0.15-(0.005)));
            zz = 0.025 + (((tickAnim - 13) / 31) * (0.1-(0.025)));
        }
        else if (tickAnim >= 44 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 44) / 456) * (0-(0)));
            yy = -0.15 + (((tickAnim - 44) / 456) * (-0.15-(-0.15)));
            zz = 0.1 + (((tickAnim - 44) / 456) * (0.1-(0.1)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = -0.15 + (((tickAnim - 500) / 100) * (-0.15-(-0.15)));
            zz = 0.1 + (((tickAnim - 500) / 100) * (0.1-(0.1)));
        }
        else if (tickAnim >= 600 && tickAnim < 609) {
            xx = 0 + (((tickAnim - 600) / 9) * (0-(0)));
            yy = -0.15 + (((tickAnim - 600) / 9) * (-0.08-(-0.15)));
            zz = 0.1 + (((tickAnim - 600) / 9) * (-0.025-(0.1)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 609) / 9) * (0-(0)));
            yy = -0.08 + (((tickAnim - 609) / 9) * (0-(-0.08)));
            zz = -0.025 + (((tickAnim - 609) / 9) * (0-(-0.025)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.09237-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.53153-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-22.79888-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 12.09237 + (((tickAnim - 8) / 10) * (13.1567-(12.09237)));
            yy = -0.53153 + (((tickAnim - 8) / 10) * (-1.93855-(-0.53153)));
            zz = -22.79888 + (((tickAnim - 8) / 10) * (-30.50742-(-22.79888)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 13.1567 + (((tickAnim - 18) / 26) * (1.50672-(13.1567)));
            yy = -1.93855 + (((tickAnim - 18) / 26) * (-1.06423-(-1.93855)));
            zz = -30.50742 + (((tickAnim - 18) / 26) * (-65.82998-(-30.50742)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 1.50672 + (((tickAnim - 44) / 36) * (-8.4771-(1.50672)));
            yy = -1.06423 + (((tickAnim - 44) / 36) * (34.55478-(-1.06423)));
            zz = -65.82998 + (((tickAnim - 44) / 36) * (-86.44211-(-65.82998)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -8.4771 + (((tickAnim - 80) / 75) * (-8.4771-(-8.4771)));
            yy = 34.55478 + (((tickAnim - 80) / 75) * (34.55478-(34.55478)));
            zz = -86.44211 + (((tickAnim - 80) / 75) * (-86.44211-(-86.44211)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -8.4771 + (((tickAnim - 155) / 245) * (-8.4771-(-8.4771)));
            yy = 34.55478 + (((tickAnim - 155) / 245) * (34.55478-(34.55478)));
            zz = -86.44211 + (((tickAnim - 155) / 245) * (-86.44211-(-86.44211)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -8.4771 + (((tickAnim - 400) / 100) * (-8.4771-(-8.4771)));
            yy = 34.55478 + (((tickAnim - 400) / 100) * (34.55478-(34.55478)));
            zz = -86.44211 + (((tickAnim - 400) / 100) * (-86.44211-(-86.44211)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -8.4771 + (((tickAnim - 500) / 100) * (-8.4771-(-8.4771)));
            yy = 34.55478 + (((tickAnim - 500) / 100) * (34.55478-(34.55478)));
            zz = -86.44211 + (((tickAnim - 500) / 100) * (-86.44211-(-86.44211)));
        }
        else if (tickAnim >= 600 && tickAnim < 609) {
            xx = -8.4771 + (((tickAnim - 600) / 9) * (10.62675-(-8.4771)));
            yy = 34.55478 + (((tickAnim - 600) / 9) * (27.05615-(34.55478)));
            zz = -86.44211 + (((tickAnim - 600) / 9) * (-11.91109-(-86.44211)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = 10.62675 + (((tickAnim - 609) / 9) * (-10-(10.62675)));
            yy = 27.05615 + (((tickAnim - 609) / 9) * (0-(27.05615)));
            zz = -11.91109 + (((tickAnim - 609) / 9) * (0-(-11.91109)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = -10 + (((tickAnim - 618) / 22) * (0-(-10)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.715-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 18) / 26) * (0-(0)));
            yy = 0.825 + (((tickAnim - 18) / 26) * (0-(0.825)));
            zz = 0.715 + (((tickAnim - 18) / 26) * (1.05-(0.715)));
        }
        else if (tickAnim >= 44 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 44) / 556) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 556) * (0-(0)));
            zz = 1.05 + (((tickAnim - 44) / 556) * (0-(1.05)));
        }
        else if (tickAnim >= 600 && tickAnim < 605) {
            xx = 0 + (((tickAnim - 600) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 5) * (1.675-(0)));
            zz = 0 + (((tickAnim - 600) / 5) * (0.3-(0)));
        }
        else if (tickAnim >= 605 && tickAnim < 609) {
            xx = 0 + (((tickAnim - 605) / 4) * (0-(0)));
            yy = 1.675 + (((tickAnim - 605) / 4) * (1.74-(1.675)));
            zz = 0.3 + (((tickAnim - 605) / 4) * (0.59-(0.3)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 609) / 9) * (0-(0)));
            yy = 1.74 + (((tickAnim - 609) / 9) * (1.075-(1.74)));
            zz = 0.59 + (((tickAnim - 609) / 9) * (0.34-(0.59)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            yy = 1.075 + (((tickAnim - 618) / 22) * (0-(1.075)));
            zz = 0.34 + (((tickAnim - 618) / 22) * (0-(0.34)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 44) {
            xx = -18.25 + (((tickAnim - 8) / 36) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 8) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 36) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -14.75 + (((tickAnim - 44) / 36) * (0-(-14.75)));
            yy = 0 + (((tickAnim - 44) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 609) {
            xx = 0 + (((tickAnim - 600) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 600) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 9) * (0-(0)));
        }
        else if (tickAnim >= 609 && tickAnim < 618) {
            xx = 12 + (((tickAnim - 609) / 9) * (0-(12)));
            yy = 0 + (((tickAnim - 609) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 609) / 9) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 0) / 640) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 640) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 640) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (6.45-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -0.5 + (((tickAnim - 80) / 20) * (-0.50899-(-0.5)));
            yy = 6.45 + (((tickAnim - 80) / 20) * (7.49654-(6.45)));
            zz = 0 + (((tickAnim - 80) / 20) * (-0.0725-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 500) {
            xx = -0.50899 + (((tickAnim - 100) / 400) * (-0.50899-(-0.50899)));
            yy = 7.49654 + (((tickAnim - 100) / 400) * (7.49654-(7.49654)));
            zz = -0.0725 + (((tickAnim - 100) / 400) * (-0.0725-(-0.0725)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -0.50899 + (((tickAnim - 500) / 100) * (-0.50899-(-0.50899)));
            yy = 7.49654 + (((tickAnim - 500) / 100) * (7.49654-(7.49654)));
            zz = -0.0725 + (((tickAnim - 500) / 100) * (-0.0725-(-0.0725)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = -0.50899 + (((tickAnim - 600) / 40) * (0-(-0.50899)));
            yy = 7.49654 + (((tickAnim - 600) / 40) * (0-(7.49654)));
            zz = -0.0725 + (((tickAnim - 600) / 40) * (0-(-0.0725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (8.79-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = 8.79 + (((tickAnim - 44) / 15) * (2.71374-(8.79)));
            yy = 0 + (((tickAnim - 44) / 15) * (3.34727-(0)));
            zz = 0 + (((tickAnim - 44) / 15) * (-0.10294-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 2.71374 + (((tickAnim - 59) / 21) * (3.23281-(2.71374)));
            yy = 3.34727 + (((tickAnim - 59) / 21) * (7.99624-(3.34727)));
            zz = -0.10294 + (((tickAnim - 59) / 21) * (-0.24591-(-0.10294)));
        }
        else if (tickAnim >= 80 && tickAnim < 500) {
            xx = 3.23281 + (((tickAnim - 80) / 420) * (3.23281-(3.23281)));
            yy = 7.99624 + (((tickAnim - 80) / 420) * (7.99624-(7.99624)));
            zz = -0.24591 + (((tickAnim - 80) / 420) * (-0.24591-(-0.24591)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 3.23281 + (((tickAnim - 500) / 100) * (3.23281-(3.23281)));
            yy = 7.99624 + (((tickAnim - 500) / 100) * (7.99624-(7.99624)));
            zz = -0.24591 + (((tickAnim - 500) / 100) * (-0.24591-(-0.24591)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 3.23281 + (((tickAnim - 600) / 40) * (0-(3.23281)));
            yy = 7.99624 + (((tickAnim - 600) / 40) * (0-(7.99624)));
            zz = -0.24591 + (((tickAnim - 600) / 40) * (0-(-0.24591)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 75) {
            xx = 16.75 + (((tickAnim - 44) / 31) * (18.02566-(16.75)));
            yy = 0 + (((tickAnim - 44) / 31) * (7.39438-(0)));
            zz = 0 + (((tickAnim - 44) / 31) * (0.3359-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 18.02566 + (((tickAnim - 75) / 5) * (18.28819-(18.02566)));
            yy = 7.39438 + (((tickAnim - 75) / 5) * (8.73582-(7.39438)));
            zz = 0.3359 + (((tickAnim - 75) / 5) * (0.49994-(0.3359)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 18.28819 + (((tickAnim - 80) / 20) * (18.35669-(18.28819)));
            yy = 8.73582 + (((tickAnim - 80) / 20) * (11.75117-(8.73582)));
            zz = 0.49994 + (((tickAnim - 80) / 20) * (0.84-(0.49994)));
        }
        else if (tickAnim >= 100 && tickAnim < 500) {
            xx = 18.35669 + (((tickAnim - 100) / 400) * (18.35669-(18.35669)));
            yy = 11.75117 + (((tickAnim - 100) / 400) * (11.75117-(11.75117)));
            zz = 0.84 + (((tickAnim - 100) / 400) * (0.84-(0.84)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 18.35669 + (((tickAnim - 500) / 100) * (18.35669-(18.35669)));
            yy = 11.75117 + (((tickAnim - 500) / 100) * (11.75117-(11.75117)));
            zz = 0.84 + (((tickAnim - 500) / 100) * (0.84-(0.84)));
        }
        else if (tickAnim >= 600 && tickAnim < 615) {
            xx = 18.35669 + (((tickAnim - 600) / 15) * (18.97293-(18.35669)));
            yy = 11.75117 + (((tickAnim - 600) / 15) * (7.34448-(11.75117)));
            zz = 0.84 + (((tickAnim - 600) / 15) * (0.525-(0.84)));
        }
        else if (tickAnim >= 615 && tickAnim < 618) {
            xx = 18.97293 + (((tickAnim - 615) / 3) * (22.1932-(18.97293)));
            yy = 7.34448 + (((tickAnim - 615) / 3) * (6.36522-(7.34448)));
            zz = 0.525 + (((tickAnim - 615) / 3) * (0.455-(0.525)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 22.1932 + (((tickAnim - 618) / 22) * (0-(22.1932)));
            yy = 6.36522 + (((tickAnim - 618) / 22) * (0-(6.36522)));
            zz = 0.455 + (((tickAnim - 618) / 22) * (0-(0.455)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (6.09-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 6.09 + (((tickAnim - 34) / 10) * (4.75-(6.09)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 75) {
            xx = 4.75 + (((tickAnim - 44) / 31) * (1.37891-(4.75)));
            yy = 0 + (((tickAnim - 44) / 31) * (13.88203-(0)));
            zz = 0 + (((tickAnim - 44) / 31) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = 1.37891 + (((tickAnim - 75) / 5) * (0-(1.37891)));
            yy = 13.88203 + (((tickAnim - 75) / 5) * (15.75-(13.88203)));
            zz = 0 + (((tickAnim - 75) / 5) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            yy = 15.75 + (((tickAnim - 80) / 20) * (17-(15.75)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 100) / 400) * (0-(0)));
            yy = 17 + (((tickAnim - 100) / 400) * (17-(17)));
            zz = 0 + (((tickAnim - 100) / 400) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 17 + (((tickAnim - 500) / 100) * (17-(17)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 615) {
            xx = 0 + (((tickAnim - 600) / 15) * (6-(0)));
            yy = 17 + (((tickAnim - 600) / 15) * (10.625-(17)));
            zz = 0 + (((tickAnim - 600) / 15) * (0-(0)));
        }
        else if (tickAnim >= 615 && tickAnim < 640) {
            xx = 6 + (((tickAnim - 615) / 25) * (0-(6)));
            yy = 10.625 + (((tickAnim - 615) / 25) * (0-(10.625)));
            zz = 0 + (((tickAnim - 615) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -2.25 + (((tickAnim - 44) / 16) * (1.25355-(-2.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (-5.92572-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-0.02583-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 1.25355 + (((tickAnim - 60) / 20) * (-4.2396-(1.25355)));
            yy = -5.92572 + (((tickAnim - 60) / 20) * (16.24984-(-5.92572)));
            zz = -0.02583 + (((tickAnim - 60) / 20) * (0.07287-(-0.02583)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -4.2396 + (((tickAnim - 80) / 20) * (-4.25855-(-4.2396)));
            yy = 16.24984 + (((tickAnim - 80) / 20) * (18.24891-(16.24984)));
            zz = 0.07287 + (((tickAnim - 80) / 20) * (0.00895-(0.07287)));
        }
        else if (tickAnim >= 100 && tickAnim < 500) {
            xx = -4.25855 + (((tickAnim - 100) / 400) * (-4.25855-(-4.25855)));
            yy = 18.24891 + (((tickAnim - 100) / 400) * (18.24891-(18.24891)));
            zz = 0.00895 + (((tickAnim - 100) / 400) * (0.00895-(0.00895)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -4.25855 + (((tickAnim - 500) / 100) * (-4.25855-(-4.25855)));
            yy = 18.24891 + (((tickAnim - 500) / 100) * (18.24891-(18.24891)));
            zz = 0.00895 + (((tickAnim - 500) / 100) * (0.00895-(0.00895)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = -4.25855 + (((tickAnim - 600) / 40) * (0-(-4.25855)));
            yy = 18.24891 + (((tickAnim - 600) / 40) * (0-(18.24891)));
            zz = 0.00895 + (((tickAnim - 600) / 40) * (0-(0.00895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -14.25 + (((tickAnim - 44) / 16) * (-14.20507-(-14.25)));
            yy = 0 + (((tickAnim - 44) / 16) * (-18.19368-(0)));
            zz = 0 + (((tickAnim - 44) / 16) * (-0.24748-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -14.20507 + (((tickAnim - 60) / 15) * (-14.15515-(-14.20507)));
            yy = -18.19368 + (((tickAnim - 60) / 15) * (-9.68905-(-18.19368)));
            zz = -0.24748 + (((tickAnim - 60) / 15) * (-0.29663-(-0.24748)));
        }
        else if (tickAnim >= 75 && tickAnim < 80) {
            xx = -14.15515 + (((tickAnim - 75) / 5) * (-14.24552-(-14.15515)));
            yy = -9.68905 + (((tickAnim - 75) / 5) * (-6.24946-(-9.68905)));
            zz = -0.29663 + (((tickAnim - 75) / 5) * (-0.08214-(-0.29663)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -14.24552 + (((tickAnim - 80) / 20) * (-14.24839-(-14.24552)));
            yy = -6.24946 + (((tickAnim - 80) / 20) * (3.74968-(-6.24946)));
            zz = -0.08214 + (((tickAnim - 80) / 20) * (0.04916-(-0.08214)));
        }
        else if (tickAnim >= 100 && tickAnim < 500) {
            xx = -14.24839 + (((tickAnim - 100) / 400) * (-14.24839-(-14.24839)));
            yy = 3.74968 + (((tickAnim - 100) / 400) * (3.74968-(3.74968)));
            zz = 0.04916 + (((tickAnim - 100) / 400) * (0.04916-(0.04916)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -14.24839 + (((tickAnim - 500) / 100) * (-14.24839-(-14.24839)));
            yy = 3.74968 + (((tickAnim - 500) / 100) * (3.74968-(3.74968)));
            zz = 0.04916 + (((tickAnim - 500) / 100) * (0.04916-(0.04916)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -14.24839 + (((tickAnim - 600) / 18) * (-9.96788-(-14.24839)));
            yy = 3.74968 + (((tickAnim - 600) / 18) * (2.03108-(3.74968)));
            zz = 0.04916 + (((tickAnim - 600) / 18) * (0.02663-(0.04916)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = -9.96788 + (((tickAnim - 618) / 22) * (0-(-9.96788)));
            yy = 2.03108 + (((tickAnim - 618) / 22) * (0-(2.03108)));
            zz = 0.02663 + (((tickAnim - 618) / 22) * (0-(0.02663)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 3.25 + (((tickAnim - 80) / 75) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 3.25 + (((tickAnim - 155) / 245) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 3.25 + (((tickAnim - 400) / 100) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 3.25 + (((tickAnim - 500) / 100) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 3.25 + (((tickAnim - 600) / 40) * (0-(3.25)));
            yy = 0 + (((tickAnim - 600) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01 + (((tickAnim - 80) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01 + (((tickAnim - 155) / 245) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01 + (((tickAnim - 400) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01 + (((tickAnim - 500) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 2.75 + (((tickAnim - 80) / 75) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 2.75 + (((tickAnim - 155) / 245) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 2.75 + (((tickAnim - 400) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 2.75 + (((tickAnim - 500) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 2.75 + (((tickAnim - 600) / 40) * (0-(2.75)));
            yy = 0 + (((tickAnim - 600) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01 + (((tickAnim - 80) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01 + (((tickAnim - 155) / 245) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01 + (((tickAnim - 400) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01 + (((tickAnim - 500) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-50))*0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(xx);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(yy);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 0) / 80) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 80) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 2.75 + (((tickAnim - 80) / 75) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 2.75 + (((tickAnim - 155) / 245) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 2.75 + (((tickAnim - 400) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 2.75 + (((tickAnim - 500) / 100) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 2.75 + (((tickAnim - 600) / 40) * (0-(2.75)));
            yy = 0 + (((tickAnim - 600) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*0.01 + (((tickAnim - 80) / 75) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*0.01)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01 + (((tickAnim - 155) / 245) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01 + (((tickAnim - 400) / 100) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01 + (((tickAnim - 500) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-100))*-0.01)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(xx);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(yy);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-23.52273-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 6.75 + (((tickAnim - 20) / 24) * (0-(6.75)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = -23.52273 + (((tickAnim - 20) / 24) * (-56.25-(-23.52273)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (1.58229-(0)));
            yy = 0 + (((tickAnim - 44) / 36) * (-8.34468-(0)));
            zz = -56.25 + (((tickAnim - 44) / 36) * (-97.25621-(-56.25)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 1.58229 + (((tickAnim - 80) / 75) * (1.58229-(1.58229)));
            yy = -8.34468 + (((tickAnim - 80) / 75) * (-8.34468-(-8.34468)));
            zz = -97.25621 + (((tickAnim - 80) / 75) * (-97.25621-(-97.25621)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 1.58229 + (((tickAnim - 155) / 245) * (1.58229-(1.58229)));
            yy = -8.34468 + (((tickAnim - 155) / 245) * (-8.34468-(-8.34468)));
            zz = -97.25621 + (((tickAnim - 155) / 245) * (-97.25621-(-97.25621)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 1.58229 + (((tickAnim - 400) / 100) * (1.58229-(1.58229)));
            yy = -8.34468 + (((tickAnim - 400) / 100) * (-8.34468-(-8.34468)));
            zz = -97.25621 + (((tickAnim - 400) / 100) * (-97.25621-(-97.25621)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 1.58229 + (((tickAnim - 500) / 100) * (1.58229-(1.58229)));
            yy = -8.34468 + (((tickAnim - 500) / 100) * (-8.34468-(-8.34468)));
            zz = -97.25621 + (((tickAnim - 500) / 100) * (-97.25621-(-97.25621)));
        }
        else if (tickAnim >= 600 && tickAnim < 607) {
            xx = 1.58229 + (((tickAnim - 600) / 7) * (1.58082-(1.58229)));
            yy = -8.34468 + (((tickAnim - 600) / 7) * (-12.71327-(-8.34468)));
            zz = -97.25621 + (((tickAnim - 600) / 7) * (-63.66288-(-97.25621)));
        }
        else if (tickAnim >= 607 && tickAnim < 613) {
            xx = 1.58082 + (((tickAnim - 607) / 6) * (36.5-(1.58082)));
            yy = -12.71327 + (((tickAnim - 607) / 6) * (0-(-12.71327)));
            zz = -63.66288 + (((tickAnim - 607) / 6) * (0-(-63.66288)));
        }
        else if (tickAnim >= 613 && tickAnim < 618) {
            xx = 36.5 + (((tickAnim - 613) / 5) * (18.27-(36.5)));
            yy = 0 + (((tickAnim - 613) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 613) / 5) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 18.27 + (((tickAnim - 618) / 22) * (0-(18.27)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontleftleg.rotationPointX = this.frontleftleg.rotationPointX + (float)(0);
        this.frontleftleg.rotationPointY = this.frontleftleg.rotationPointY - (float)(0);
        this.frontleftleg.rotationPointZ = this.frontleftleg.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17.68826-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (6.46894-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (14.06962-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -17.68826 + (((tickAnim - 20) / 24) * (-9.05181-(-17.68826)));
            yy = 6.46894 + (((tickAnim - 20) / 24) * (7.15525-(6.46894)));
            zz = 14.06962 + (((tickAnim - 20) / 24) * (27.26658-(14.06962)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -9.05181 + (((tickAnim - 44) / 36) * (-24.71936-(-9.05181)));
            yy = 7.15525 + (((tickAnim - 44) / 36) * (-29.4895-(7.15525)));
            zz = 27.26658 + (((tickAnim - 44) / 36) * (82.23059-(27.26658)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -24.71936 + (((tickAnim - 80) / 75) * (-24.71936-(-24.71936)));
            yy = -29.4895 + (((tickAnim - 80) / 75) * (-29.4895-(-29.4895)));
            zz = 82.23059 + (((tickAnim - 80) / 75) * (82.23059-(82.23059)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -24.71936 + (((tickAnim - 155) / 245) * (-24.71936-(-24.71936)));
            yy = -29.4895 + (((tickAnim - 155) / 245) * (-29.4895-(-29.4895)));
            zz = 82.23059 + (((tickAnim - 155) / 245) * (82.23059-(82.23059)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -24.71936 + (((tickAnim - 400) / 100) * (-24.71936-(-24.71936)));
            yy = -29.4895 + (((tickAnim - 400) / 100) * (-29.4895-(-29.4895)));
            zz = 82.23059 + (((tickAnim - 400) / 100) * (82.23059-(82.23059)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -24.71936 + (((tickAnim - 500) / 100) * (-24.71936-(-24.71936)));
            yy = -29.4895 + (((tickAnim - 500) / 100) * (-29.4895-(-29.4895)));
            zz = 82.23059 + (((tickAnim - 500) / 100) * (82.23059-(82.23059)));
        }
        else if (tickAnim >= 600 && tickAnim < 607) {
            xx = -24.71936 + (((tickAnim - 600) / 7) * (-41.52559-(-24.71936)));
            yy = -29.4895 + (((tickAnim - 600) / 7) * (-27.86921-(-29.4895)));
            zz = 82.23059 + (((tickAnim - 600) / 7) * (54.77857-(82.23059)));
        }
        else if (tickAnim >= 607 && tickAnim < 610) {
            xx = -41.52559 + (((tickAnim - 607) / 3) * (-54.5128-(-41.52559)));
            yy = -27.86921 + (((tickAnim - 607) / 3) * (-13.93461-(-27.86921)));
            zz = 54.77857 + (((tickAnim - 607) / 3) * (27.38928-(54.77857)));
        }
        else if (tickAnim >= 610 && tickAnim < 613) {
            xx = -54.5128 + (((tickAnim - 610) / 3) * (-41.5-(-54.5128)));
            yy = -13.93461 + (((tickAnim - 610) / 3) * (0-(-13.93461)));
            zz = 27.38928 + (((tickAnim - 610) / 3) * (0-(27.38928)));
        }
        else if (tickAnim >= 613 && tickAnim < 618) {
            xx = -41.5 + (((tickAnim - 613) / 5) * (-12.55-(-41.5)));
            yy = 0 + (((tickAnim - 613) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 613) / 5) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = -12.55 + (((tickAnim - 618) / 22) * (0-(-12.55)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0.35 + (((tickAnim - 44) / 36) * (-0.4-(0.35)));
            yy = -0.725 + (((tickAnim - 44) / 36) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -0.4 + (((tickAnim - 80) / 75) * (-0.4-(-0.4)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -0.4 + (((tickAnim - 155) / 245) * (-0.4-(-0.4)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -0.4 + (((tickAnim - 400) / 100) * (-0.4-(-0.4)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -0.4 + (((tickAnim - 500) / 100) * (-0.4-(-0.4)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 607) {
            xx = -0.4 + (((tickAnim - 600) / 7) * (-0.48-(-0.4)));
            yy = 0 + (((tickAnim - 600) / 7) * (0.4-(0)));
            zz = 0 + (((tickAnim - 600) / 7) * (0-(0)));
        }
        else if (tickAnim >= 607 && tickAnim < 613) {
            xx = -0.48 + (((tickAnim - 607) / 6) * (0-(-0.48)));
            yy = 0.4 + (((tickAnim - 607) / 6) * (0.725-(0.4)));
            zz = 0 + (((tickAnim - 607) / 6) * (0-(0)));
        }
        else if (tickAnim >= 613 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 613) / 27) * (0-(0)));
            yy = 0.725 + (((tickAnim - 613) / 27) * (0-(0.725)));
            zz = 0 + (((tickAnim - 613) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.47143-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-3.57412-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (10.91707-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 24.47143 + (((tickAnim - 20) / 24) * (16.73795-(24.47143)));
            yy = -3.57412 + (((tickAnim - 20) / 24) * (-10.98118-(-3.57412)));
            zz = 10.91707 + (((tickAnim - 20) / 24) * (27.98019-(10.91707)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 16.73795 + (((tickAnim - 44) / 36) * (53.73016-(16.73795)));
            yy = -10.98118 + (((tickAnim - 44) / 36) * (-2.21041-(-10.98118)));
            zz = 27.98019 + (((tickAnim - 44) / 36) * (22.95949-(27.98019)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 53.73016 + (((tickAnim - 80) / 75) * (53.73016-(53.73016)));
            yy = -2.21041 + (((tickAnim - 80) / 75) * (-2.21041-(-2.21041)));
            zz = 22.95949 + (((tickAnim - 80) / 75) * (22.95949-(22.95949)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 53.73016 + (((tickAnim - 155) / 245) * (53.73016-(53.73016)));
            yy = -2.21041 + (((tickAnim - 155) / 245) * (-2.21041-(-2.21041)));
            zz = 22.95949 + (((tickAnim - 155) / 245) * (22.95949-(22.95949)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 53.73016 + (((tickAnim - 400) / 100) * (53.73016-(53.73016)));
            yy = -2.21041 + (((tickAnim - 400) / 100) * (-2.21041-(-2.21041)));
            zz = 22.95949 + (((tickAnim - 400) / 100) * (22.95949-(22.95949)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 53.73016 + (((tickAnim - 500) / 100) * (53.73016-(53.73016)));
            yy = -2.21041 + (((tickAnim - 500) / 100) * (-2.21041-(-2.21041)));
            zz = 22.95949 + (((tickAnim - 500) / 100) * (22.95949-(22.95949)));
        }
        else if (tickAnim >= 600 && tickAnim < 607) {
            xx = 53.73016 + (((tickAnim - 600) / 7) * (83.26371-(53.73016)));
            yy = -2.21041 + (((tickAnim - 600) / 7) * (-1.00473-(-2.21041)));
            zz = 22.95949 + (((tickAnim - 600) / 7) * (10.43613-(22.95949)));
        }
        else if (tickAnim >= 607 && tickAnim < 610) {
            xx = 83.26371 + (((tickAnim - 607) / 3) * (70.50685-(83.26371)));
            yy = -1.00473 + (((tickAnim - 607) / 3) * (-0.50237-(-1.00473)));
            zz = 10.43613 + (((tickAnim - 607) / 3) * (5.21807-(10.43613)));
        }
        else if (tickAnim >= 610 && tickAnim < 613) {
            xx = 70.50685 + (((tickAnim - 610) / 3) * (10.25-(70.50685)));
            yy = -0.50237 + (((tickAnim - 610) / 3) * (0-(-0.50237)));
            zz = 5.21807 + (((tickAnim - 610) / 3) * (0-(5.21807)));
        }
        else if (tickAnim >= 613 && tickAnim < 618) {
            xx = 10.25 + (((tickAnim - 613) / 5) * (3.43-(10.25)));
            yy = 0 + (((tickAnim - 613) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 613) / 5) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 3.43 + (((tickAnim - 618) / 22) * (0-(3.43)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 22) * (-0.075-(0.525)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 35) / 9) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 15) * (-0.525-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = -0.525 + (((tickAnim - 59) / 21) * (0-(-0.525)));
        }
        else if (tickAnim >= 80 && tickAnim < 600) {
            xx = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 520) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 520) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 607) {
            xx = 0 + (((tickAnim - 600) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 600) / 7) * (0.8-(0)));
            zz = 0 + (((tickAnim - 600) / 7) * (-0.475-(0)));
        }
        else if (tickAnim >= 607 && tickAnim < 610) {
            xx = 0 + (((tickAnim - 607) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 607) / 3) * (1.55-(0.8)));
            zz = -0.475 + (((tickAnim - 607) / 3) * (-0.54-(-0.475)));
        }
        else if (tickAnim >= 610 && tickAnim < 613) {
            xx = 0 + (((tickAnim - 610) / 3) * (0-(0)));
            yy = 1.55 + (((tickAnim - 610) / 3) * (0-(1.55)));
            zz = -0.54 + (((tickAnim - 610) / 3) * (0-(-0.54)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (23.52273-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 6.75 + (((tickAnim - 20) / 24) * (0-(6.75)));
            yy = 0 + (((tickAnim - 20) / 24) * (0-(0)));
            zz = 23.52273 + (((tickAnim - 20) / 24) * (56.25-(23.52273)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 44) / 36) * (1.58229-(0)));
            yy = 0 + (((tickAnim - 44) / 36) * (8.34468-(0)));
            zz = 56.25 + (((tickAnim - 44) / 36) * (97.25621-(56.25)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 1.58229 + (((tickAnim - 80) / 75) * (1.58229-(1.58229)));
            yy = 8.34468 + (((tickAnim - 80) / 75) * (8.34468-(8.34468)));
            zz = 97.25621 + (((tickAnim - 80) / 75) * (97.25621-(97.25621)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 1.58229 + (((tickAnim - 155) / 245) * (1.58229-(1.58229)));
            yy = 8.34468 + (((tickAnim - 155) / 245) * (8.34468-(8.34468)));
            zz = 97.25621 + (((tickAnim - 155) / 245) * (97.25621-(97.25621)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 1.58229 + (((tickAnim - 400) / 100) * (1.58229-(1.58229)));
            yy = 8.34468 + (((tickAnim - 400) / 100) * (8.34468-(8.34468)));
            zz = 97.25621 + (((tickAnim - 400) / 100) * (97.25621-(97.25621)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 1.58229 + (((tickAnim - 500) / 100) * (1.58229-(1.58229)));
            yy = 8.34468 + (((tickAnim - 500) / 100) * (8.34468-(8.34468)));
            zz = 97.25621 + (((tickAnim - 500) / 100) * (97.25621-(97.25621)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = 1.58229 + (((tickAnim - 600) / 18) * (0-(1.58229)));
            yy = 8.34468 + (((tickAnim - 600) / 18) * (0-(8.34468)));
            zz = 97.25621 + (((tickAnim - 600) / 18) * (38.75-(97.25621)));
        }
        else if (tickAnim >= 618 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 618) / 9) * (6-(0)));
            yy = 0 + (((tickAnim - 618) / 9) * (0-(0)));
            zz = 38.75 + (((tickAnim - 618) / 9) * (0-(38.75)));
        }
        else if (tickAnim >= 627 && tickAnim < 640) {
            xx = 6 + (((tickAnim - 627) / 13) * (0-(6)));
            yy = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-17.68826-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-6.46894-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-14.06962-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = -17.68826 + (((tickAnim - 20) / 24) * (-9.05181-(-17.68826)));
            yy = -6.46894 + (((tickAnim - 20) / 24) * (-7.15525-(-6.46894)));
            zz = -14.06962 + (((tickAnim - 20) / 24) * (-27.26658-(-14.06962)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -9.05181 + (((tickAnim - 44) / 36) * (-24.71936-(-9.05181)));
            yy = -7.15525 + (((tickAnim - 44) / 36) * (29.4895-(-7.15525)));
            zz = -27.26658 + (((tickAnim - 44) / 36) * (-82.23059-(-27.26658)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = -24.71936 + (((tickAnim - 80) / 75) * (-24.71936-(-24.71936)));
            yy = 29.4895 + (((tickAnim - 80) / 75) * (29.4895-(29.4895)));
            zz = -82.23059 + (((tickAnim - 80) / 75) * (-82.23059-(-82.23059)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -24.71936 + (((tickAnim - 155) / 245) * (-24.71936-(-24.71936)));
            yy = 29.4895 + (((tickAnim - 155) / 245) * (29.4895-(29.4895)));
            zz = -82.23059 + (((tickAnim - 155) / 245) * (-82.23059-(-82.23059)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -24.71936 + (((tickAnim - 400) / 100) * (-24.71936-(-24.71936)));
            yy = 29.4895 + (((tickAnim - 400) / 100) * (29.4895-(29.4895)));
            zz = -82.23059 + (((tickAnim - 400) / 100) * (-82.23059-(-82.23059)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = -24.71936 + (((tickAnim - 500) / 100) * (-24.71936-(-24.71936)));
            yy = 29.4895 + (((tickAnim - 500) / 100) * (29.4895-(29.4895)));
            zz = -82.23059 + (((tickAnim - 500) / 100) * (-82.23059-(-82.23059)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -24.71936 + (((tickAnim - 600) / 18) * (16.73106-(-24.71936)));
            yy = 29.4895 + (((tickAnim - 600) / 18) * (5.58042-(29.4895)));
            zz = -82.23059 + (((tickAnim - 600) / 18) * (-6.1162-(-82.23059)));
        }
        else if (tickAnim >= 618 && tickAnim < 623) {
            xx = 16.73106 + (((tickAnim - 618) / 5) * (-24.88447-(16.73106)));
            yy = 5.58042 + (((tickAnim - 618) / 5) * (2.79021-(5.58042)));
            zz = -6.1162 + (((tickAnim - 618) / 5) * (-3.0581-(-6.1162)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = -24.88447 + (((tickAnim - 623) / 4) * (0-(-24.88447)));
            yy = 2.79021 + (((tickAnim - 623) / 4) * (0-(2.79021)));
            zz = -3.0581 + (((tickAnim - 623) / 4) * (0-(-3.0581)));
        }
        else if (tickAnim >= 627 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (-0.35-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = -0.35 + (((tickAnim - 44) / 36) * (0.4-(-0.35)));
            yy = -0.725 + (((tickAnim - 44) / 36) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 44) / 36) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0.4 + (((tickAnim - 80) / 75) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0.4 + (((tickAnim - 155) / 245) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0.4 + (((tickAnim - 400) / 100) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 0.4 + (((tickAnim - 500) / 100) * (0.4-(0.4)));
            yy = 0 + (((tickAnim - 500) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 100) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = 0.4 + (((tickAnim - 600) / 18) * (0-(0.4)));
            yy = 0 + (((tickAnim - 600) / 18) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 600) / 18) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 627) {
            xx = 0 + (((tickAnim - 618) / 9) * (0-(0)));
            yy = -0.5 + (((tickAnim - 618) / 9) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 618) / 9) * (0-(0)));
        }
        else if (tickAnim >= 627 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.47143-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (3.57412-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-10.91707-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 44) {
            xx = 24.47143 + (((tickAnim - 20) / 24) * (16.73795-(24.47143)));
            yy = 3.57412 + (((tickAnim - 20) / 24) * (10.98118-(3.57412)));
            zz = -10.91707 + (((tickAnim - 20) / 24) * (-27.98019-(-10.91707)));
        }
        else if (tickAnim >= 44 && tickAnim < 80) {
            xx = 16.73795 + (((tickAnim - 44) / 36) * (53.73016-(16.73795)));
            yy = 10.98118 + (((tickAnim - 44) / 36) * (2.21041-(10.98118)));
            zz = -27.98019 + (((tickAnim - 44) / 36) * (-22.95949-(-27.98019)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 53.73016 + (((tickAnim - 80) / 75) * (53.73016-(53.73016)));
            yy = 2.21041 + (((tickAnim - 80) / 75) * (2.21041-(2.21041)));
            zz = -22.95949 + (((tickAnim - 80) / 75) * (-22.95949-(-22.95949)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 53.73016 + (((tickAnim - 155) / 245) * (53.73016-(53.73016)));
            yy = 2.21041 + (((tickAnim - 155) / 245) * (2.21041-(2.21041)));
            zz = -22.95949 + (((tickAnim - 155) / 245) * (-22.95949-(-22.95949)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 53.73016 + (((tickAnim - 400) / 100) * (53.73016-(53.73016)));
            yy = 2.21041 + (((tickAnim - 400) / 100) * (2.21041-(2.21041)));
            zz = -22.95949 + (((tickAnim - 400) / 100) * (-22.95949-(-22.95949)));
        }
        else if (tickAnim >= 500 && tickAnim < 600) {
            xx = 53.73016 + (((tickAnim - 500) / 100) * (53.73016-(53.73016)));
            yy = 2.21041 + (((tickAnim - 500) / 100) * (2.21041-(2.21041)));
            zz = -22.95949 + (((tickAnim - 500) / 100) * (-22.95949-(-22.95949)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = 53.73016 + (((tickAnim - 600) / 18) * (-1.06569-(53.73016)));
            yy = 2.21041 + (((tickAnim - 600) / 18) * (-5.5434-(2.21041)));
            zz = -22.95949 + (((tickAnim - 600) / 18) * (-33.88596-(-22.95949)));
        }
        else if (tickAnim >= 618 && tickAnim < 623) {
            xx = -1.06569 + (((tickAnim - 618) / 5) * (60.21715-(-1.06569)));
            yy = -5.5434 + (((tickAnim - 618) / 5) * (-2.7717-(-5.5434)));
            zz = -33.88596 + (((tickAnim - 618) / 5) * (-16.94298-(-33.88596)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 60.21715 + (((tickAnim - 623) / 4) * (0-(60.21715)));
            yy = -2.7717 + (((tickAnim - 623) / 4) * (0-(-2.7717)));
            zz = -16.94298 + (((tickAnim - 623) / 4) * (0-(-16.94298)));
        }
        else if (tickAnim >= 627 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 627) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            yy = 0.525 + (((tickAnim - 13) / 22) * (-0.075-(0.525)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = -0.075 + (((tickAnim - 35) / 9) * (0-(-0.075)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 15) * (-0.525-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 59) / 21) * (0-(0)));
            zz = -0.525 + (((tickAnim - 59) / 21) * (0-(-0.525)));
        }
        else if (tickAnim >= 80 && tickAnim < 618) {
            xx = 0 + (((tickAnim - 80) / 538) * (0.225-(0)));
            yy = 0 + (((tickAnim - 80) / 538) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 80) / 538) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 623) {
            xx = 0.225 + (((tickAnim - 618) / 5) * (0.11-(0.225)));
            yy = -0.375 + (((tickAnim - 618) / 5) * (0.905-(-0.375)));
            zz = 0 + (((tickAnim - 618) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 623 && tickAnim < 627) {
            xx = 0.11 + (((tickAnim - 623) / 4) * (0-(0.11)));
            yy = 0.905 + (((tickAnim - 623) / 4) * (0.525-(0.905)));
            zz = -0.3 + (((tickAnim - 623) / 4) * (0-(-0.3)));
        }
        else if (tickAnim >= 627 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 627) / 13) * (0-(0)));
            yy = 0.525 + (((tickAnim - 627) / 13) * (0-(0.525)));
            zz = 0 + (((tickAnim - 627) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 44) / 13) * (-8.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-15-(0)));
            yy = 0 + (((tickAnim - 44) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 13) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 67) {
            xx = -8.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-15 + (((tickAnim - 57) / 10) * (18.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-15-(-8.69+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60+50))*-15)));
            yy = 0 + (((tickAnim - 57) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 10) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 80) {
            xx = 18.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-15 + (((tickAnim - 67) / 13) * (9.5-(18.41+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-15)));
            yy = 0 + (((tickAnim - 67) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 13) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 9.5 + (((tickAnim - 80) / 75) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 75) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 9.5 + (((tickAnim - 155) / 245) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 9.5 + (((tickAnim - 400) / 100) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 520) {
            xx = 9.5 + (((tickAnim - 500) / 20) * (9.5-(9.5)));
            yy = 0 + (((tickAnim - 500) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 20) * (0-(0)));
        }
        else if (tickAnim >= 520 && tickAnim < 538) {
            xx = 9.5 + (((tickAnim - 520) / 18) * (1.175-(9.5)));
            yy = 0 + (((tickAnim - 520) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 520) / 18) * (0-(0)));
        }
        else if (tickAnim >= 538 && tickAnim < 560) {
            xx = 1.175 + (((tickAnim - 538) / 22) * (-4.75-(1.175)));
            yy = 0 + (((tickAnim - 538) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 538) / 22) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -4.75 + (((tickAnim - 560) / 40) * (-8-(-4.75)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 618) {
            xx = -8 + (((tickAnim - 600) / 18) * (4.92-(-8)));
            yy = 0 + (((tickAnim - 600) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 18) * (0-(0)));
        }
        else if (tickAnim >= 618 && tickAnim < 640) {
            xx = 4.92 + (((tickAnim - 618) / 22) * (0-(4.92)));
            yy = 0 + (((tickAnim - 618) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 618) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 44) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 13) * (0.125-(0)));
            zz = 0 + (((tickAnim - 44) / 13) * (-0.2-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 57) / 23) * (0-(0)));
            yy = 0.125 + (((tickAnim - 57) / 23) * (0.125-(0.125)));
            zz = -0.2 + (((tickAnim - 57) / 23) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01-(-0.2)));
        }
        else if (tickAnim >= 80 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 80) / 75) * (0-(0)));
            yy = 0.125 + (((tickAnim - 80) / 75) * (0.125-(0.125)));
            zz = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01 + (((tickAnim - 80) / 75) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = 0.125 + (((tickAnim - 155) / 245) * (0.125-(0.125)));
            zz = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01 + (((tickAnim - 155) / 245) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = 0.125 + (((tickAnim - 400) / 100) * (0.125-(0.125)));
            zz = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01 + (((tickAnim - 400) / 100) * (-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01)));
        }
        else if (tickAnim >= 500 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 500) / 20) * (0-(0)));
            yy = 0.125 + (((tickAnim - 500) / 20) * (0.125-(0.125)));
            zz = -0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01 + (((tickAnim - 500) / 20) * (-0.2-(-0.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-150))*0.01)));
        }
        else if (tickAnim >= 520 && tickAnim < 560) {
            xx = 0 + (((tickAnim - 520) / 40) * (0-(0)));
            yy = 0.125 + (((tickAnim - 520) / 40) * (0.13-(0.125)));
            zz = -0.2 + (((tickAnim - 520) / 40) * (0.075-(-0.2)));
        }
        else if (tickAnim >= 560 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 560) / 80) * (0-(0)));
            yy = 0.13 + (((tickAnim - 560) / 80) * (0-(0.13)));
            zz = 0.075 + (((tickAnim - 560) / 80) * (0-(0.075)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 57) {
            xx = 6.5 + (((tickAnim - 44) / 13) * (9.71-(6.5)));
            yy = 0 + (((tickAnim - 44) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 13) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 61) {
            xx = 9.71 + (((tickAnim - 57) / 4) * (6.61-(9.71)));
            yy = 0 + (((tickAnim - 57) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 4) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 67) {
            xx = 6.61 + (((tickAnim - 61) / 6) * (-4.13-(6.61)));
            yy = 0 + (((tickAnim - 61) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 6) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = -4.13 + (((tickAnim - 67) / 6) * (-9.69-(-4.13)));
            yy = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 6) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -9.69 + (((tickAnim - 73) / 7) * (-11.5-(-9.69)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 118) {
            xx = -11.5 + (((tickAnim - 80) / 38) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 80) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 38) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 119) {
            xx = -11.5 + (((tickAnim - 118) / 1) * (-14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5-(-11.5)));
            yy = 0 + (((tickAnim - 118) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 1) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 155) {
            xx = -14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5 + (((tickAnim - 119) / 36) * (-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05-(-14.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+50))*5)));
            yy = 0 + (((tickAnim - 119) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 36) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = -29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05 + (((tickAnim - 155) / 245) * (-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05-(-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = -29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05 + (((tickAnim - 400) / 100) * (-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05-(-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 520) {
            xx = -29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05 + (((tickAnim - 500) / 20) * (-29.5-(-29.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-200))*0.05)));
            yy = 0 + (((tickAnim - 500) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 20) * (0-(0)));
        }
        else if (tickAnim >= 520 && tickAnim < 538) {
            xx = -29.5 + (((tickAnim - 520) / 18) * (-14.525-(-29.5)));
            yy = 0 + (((tickAnim - 520) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 520) / 18) * (0-(0)));
        }
        else if (tickAnim >= 538 && tickAnim < 560) {
            xx = -14.525 + (((tickAnim - 538) / 22) * (-1.825-(-14.525)));
            yy = 0 + (((tickAnim - 538) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 538) / 22) * (0-(0)));
        }
        else if (tickAnim >= 560 && tickAnim < 600) {
            xx = -1.825 + (((tickAnim - 560) / 40) * (5.25-(-1.825)));
            yy = 0 + (((tickAnim - 560) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 560) / 40) * (0-(0)));
        }
        else if (tickAnim >= 600 && tickAnim < 640) {
            xx = 5.25 + (((tickAnim - 600) / 40) * (0-(5.25)));
            yy = 0 + (((tickAnim - 600) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 600) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 44) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 44) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 44) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 13) * (-0.1-(0)));
            zz = 0 + (((tickAnim - 44) / 13) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 119) {
            xx = 0 + (((tickAnim - 57) / 62) * (0-(0)));
            yy = -0.1 + (((tickAnim - 57) / 62) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 57) / 62) * (0-(0)));
        }
        else if (tickAnim >= 119 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 119) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 119) / 36) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 119) / 36) * (0.35-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            yy = -0.175 + (((tickAnim - 155) / 245) * (-0.175-(-0.175)));
            zz = 0.35 + (((tickAnim - 155) / 245) * (0.35-(0.35)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            yy = -0.175 + (((tickAnim - 400) / 100) * (-0.175-(-0.175)));
            zz = 0.35 + (((tickAnim - 400) / 100) * (0.35-(0.35)));
        }
        else if (tickAnim >= 500 && tickAnim < 520) {
            xx = 0 + (((tickAnim - 500) / 20) * (0-(0)));
            yy = -0.175 + (((tickAnim - 500) / 20) * (-0.175-(-0.175)));
            zz = 0.35 + (((tickAnim - 500) / 20) * (0.35-(0.35)));
        }
        else if (tickAnim >= 520 && tickAnim < 640) {
            xx = 0 + (((tickAnim - 520) / 120) * (0-(0)));
            yy = -0.175 + (((tickAnim - 520) / 120) * (0-(-0.175)));
            zz = 0.35 + (((tickAnim - 520) / 120) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 119 && tickAnim < 155) {
            xx = 0 + (((tickAnim - 119) / 36) * (18.75-(0)));
            yy = 0 + (((tickAnim - 119) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 119) / 36) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 18.75 + (((tickAnim - 155) / 245) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 155) / 245) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 245) * (0-(0)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 18.75 + (((tickAnim - 400) / 100) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 400) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 400) / 100) * (0-(0)));
        }
        else if (tickAnim >= 500 && tickAnim < 520) {
            xx = 18.75 + (((tickAnim - 500) / 20) * (18.75-(18.75)));
            yy = 0 + (((tickAnim - 500) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 500) / 20) * (0-(0)));
        }
        else if (tickAnim >= 520 && tickAnim < 532) {
            xx = 18.75 + (((tickAnim - 520) / 12) * (0-(18.75)));
            yy = 0 + (((tickAnim - 520) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 520) / 12) * (0-(0)));
        }
        else if (tickAnim >= 532 && tickAnim < 538) {
            xx = 0 + (((tickAnim - 532) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 532) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 532) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 100 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 100) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 100) / 10) * (-0.025-(1)));
            zz = 1 + (((tickAnim - 100) / 10) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 112) {
            xx = 1 + (((tickAnim - 110) / 2) * (1-(1)));
            yy = -0.025 + (((tickAnim - 110) / 2) * (-0.025-(-0.025)));
            zz = 1 + (((tickAnim - 110) / 2) * (1-(1)));
        }
        else if (tickAnim >= 112 && tickAnim < 121) {
            xx = 1 + (((tickAnim - 112) / 9) * (1-(1)));
            yy = -0.025 + (((tickAnim - 112) / 9) * (1-(-0.025)));
            zz = 1 + (((tickAnim - 112) / 9) * (1-(1)));
        }
        else if (tickAnim >= 121 && tickAnim < 155) {
            xx = 1 + (((tickAnim - 121) / 34) * (1-(1)));
            yy = 1 + (((tickAnim - 121) / 34) * (0.055-(1)));
            zz = 1 + (((tickAnim - 121) / 34) * (1-(1)));
        }
        else if (tickAnim >= 155 && tickAnim < 400) {
            xx = 1 + (((tickAnim - 155) / 245) * (1-(1)));
            yy = 0.055 + (((tickAnim - 155) / 245) * (0.055-(0.055)));
            zz = 1 + (((tickAnim - 155) / 245) * (1-(1)));
        }
        else if (tickAnim >= 400 && tickAnim < 500) {
            xx = 1 + (((tickAnim - 400) / 100) * (1-(1)));
            yy = 0.055 + (((tickAnim - 400) / 100) * (0.055-(0.055)));
            zz = 1 + (((tickAnim - 400) / 100) * (1-(1)));
        }
        else if (tickAnim >= 500 && tickAnim < 514) {
            xx = 1 + (((tickAnim - 500) / 14) * (1-(1)));
            yy = 0.055 + (((tickAnim - 500) / 14) * (0.3625-(0.055)));
            zz = 1 + (((tickAnim - 500) / 14) * (1-(1)));
        }
        else if (tickAnim >= 514 && tickAnim < 520) {
            xx = 1 + (((tickAnim - 514) / 6) * (1-(1)));
            yy = 0.3625 + (((tickAnim - 514) / 6) * (0.255-(0.3625)));
            zz = 1 + (((tickAnim - 514) / 6) * (1-(1)));
        }
        else if (tickAnim >= 520 && tickAnim < 526) {
            xx = 1 + (((tickAnim - 520) / 6) * (1-(1)));
            yy = 0.255 + (((tickAnim - 520) / 6) * (1-(0.255)));
            zz = 1 + (((tickAnim - 520) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -3.75 + (((tickAnim - 18) / 17) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 18) / 17) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 12.75 + (((tickAnim - 10) / 8) * (22.5-(12.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 22.5 + (((tickAnim - 18) / 9) * (0-(22.5)));
            yy = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (1.875-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.3125-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 1.875 + (((tickAnim - 2) / 3) * (-5.25-(1.875)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = -1.3125 + (((tickAnim - 2) / 3) * (-5.25-(-1.3125)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -5.25 + (((tickAnim - 5) / 7) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = -5.25 + (((tickAnim - 5) / 7) * (0-(-5.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-6.63401-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (-2.97995-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.84108-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -6.63401 + (((tickAnim - 2) / 3) * (-8.75333-(-6.63401)));
            yy = -2.97995 + (((tickAnim - 2) / 3) * (1.99079-(-2.97995)));
            zz = -1.84108 + (((tickAnim - 2) / 3) * (-8.94177-(-1.84108)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.75333 + (((tickAnim - 5) / 3) * (7.75-(-8.75333)));
            yy = 1.99079 + (((tickAnim - 5) / 3) * (0-(1.99079)));
            zz = -8.94177 + (((tickAnim - 5) / 3) * (0-(-8.94177)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 7.75 + (((tickAnim - 8) / 4) * (0-(7.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25 + (((tickAnim - 5) / 3) * (0-(25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 34;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 29.235 + (((tickAnim - 0) / 8) * (7.92158-(29.235)));
            yy = -5.49113 + (((tickAnim - 0) / 8) * (-6.83457-(-5.49113)));
            zz = 0.31277 + (((tickAnim - 0) / 8) * (-2.5777-(0.31277)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 7.92158 + (((tickAnim - 8) / 6) * (-11-(7.92158)));
            yy = -6.83457 + (((tickAnim - 8) / 6) * (0-(-6.83457)));
            zz = -2.5777 + (((tickAnim - 8) / 6) * (0-(-2.5777)));
        }
        else if (tickAnim >= 14 && tickAnim < 34) {
            xx = -11 + (((tickAnim - 14) / 20) * (29.235-(-11)));
            yy = 0 + (((tickAnim - 14) / 20) * (-5.49113-(0)));
            zz = 0 + (((tickAnim - 14) / 20) * (0.31277-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.75 + (((tickAnim - 0) / 8) * (-22.6-(17.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -22.6 + (((tickAnim - 8) / 6) * (-18.25-(-22.6)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 34) {
            xx = -18.25 + (((tickAnim - 14) / 20) * (17.75-(-18.25)));
            yy = 0 + (((tickAnim - 14) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.075-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 2.075 + (((tickAnim - 8) / 6) * (0-(2.075)));
            zz = -0.15 + (((tickAnim - 8) / 6) * (0-(-0.15)));
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
            xx = 48.5 + (((tickAnim - 0) / 3) * (105.15-(48.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 105.15 + (((tickAnim - 3) / 5) * (46.71-(105.15)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 46.71 + (((tickAnim - 8) / 5) * (18-(46.71)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 18 + (((tickAnim - 13) / 1) * (29-(18)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 29 + (((tickAnim - 14) / 5) * (9.82-(29)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 9.82 + (((tickAnim - 19) / 15) * (48.5-(9.82)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 3) * (1.49-(0.3)));
            zz = 0.425 + (((tickAnim - 0) / 3) * (-0.23-(0.425)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 3) / 2) * (1.5-(1.49)));
            zz = -0.23 + (((tickAnim - 3) / 2) * (0.46-(-0.23)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 3) * (1.355-(1.5)));
            zz = 0.46 + (((tickAnim - 5) / 3) * (0.84-(0.46)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.355 + (((tickAnim - 8) / 5) * (0-(1.355)));
            zz = 0.84 + (((tickAnim - 8) / 5) * (0-(0.84)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 14) / 3) * (0.33-(-0.15)));
            zz = 0 + (((tickAnim - 14) / 3) * (0.06-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 17) / 2) * (0.455-(0.33)));
            zz = 0.06 + (((tickAnim - 17) / 2) * (0.12-(0.06)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.455 + (((tickAnim - 19) / 4) * (0.81-(0.455)));
            zz = 0.12 + (((tickAnim - 19) / 4) * (0.44-(0.12)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.81 + (((tickAnim - 23) / 3) * (0.36-(0.81)));
            zz = 0.44 + (((tickAnim - 23) / 3) * (0.86-(0.44)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 0.36 + (((tickAnim - 26) / 8) * (0.3-(0.36)));
            zz = 0.86 + (((tickAnim - 26) / 8) * (0.425-(0.86)));
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
            xx = -29.5 + (((tickAnim - 0) / 3) * (8.43-(-29.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 8.43 + (((tickAnim - 3) / 2) * (1.32-(8.43)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 14) {
            xx = 1.32 + (((tickAnim - 5) / 9) * (0-(1.32)));
            yy = 0 + (((tickAnim - 5) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 9) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 19) / 7) * (-41.02-(0)));
            yy = 0 + (((tickAnim - 19) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 7) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -41.02 + (((tickAnim - 26) / 8) * (-29.5-(-41.02)));
            yy = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 0) / 5) * (0.005-(-0.125)));
            zz = 0.275 + (((tickAnim - 0) / 5) * (1.27-(0.275)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.005 + (((tickAnim - 5) / 8) * (0-(0.005)));
            zz = 1.27 + (((tickAnim - 5) / 8) * (0-(1.27)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0.275-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -2.75 + (((tickAnim - 0) / 17) * (29.235-(-2.75)));
            yy = 0 + (((tickAnim - 0) / 17) * (5.49113-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.31277-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 29.235 + (((tickAnim - 17) / 7) * (7.92158-(29.235)));
            yy = 5.49113 + (((tickAnim - 17) / 7) * (6.83457-(5.49113)));
            zz = 0.31277 + (((tickAnim - 17) / 7) * (2.5777-(0.31277)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 7.92158 + (((tickAnim - 24) / 6) * (-11-(7.92158)));
            yy = 6.83457 + (((tickAnim - 24) / 6) * (0-(6.83457)));
            zz = 2.5777 + (((tickAnim - 24) / 6) * (0-(2.5777)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -11 + (((tickAnim - 30) / 4) * (-2.75-(-11)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -14.75 + (((tickAnim - 0) / 17) * (17.75-(-14.75)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = 17.75 + (((tickAnim - 17) / 7) * (-22.6-(17.75)));
            yy = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -22.6 + (((tickAnim - 24) / 6) * (-18.25-(-22.6)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -18.25 + (((tickAnim - 30) / 4) * (-14.75-(-18.25)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 17 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 17) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 7) * (2.075-(0)));
            zz = 0 + (((tickAnim - 17) / 7) * (-0.15-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 2.075 + (((tickAnim - 24) / 6) * (0-(2.075)));
            zz = -0.15 + (((tickAnim - 24) / 6) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.75 + (((tickAnim - 0) / 5) * (-1.5-(18.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.5 + (((tickAnim - 5) / 4) * (20.11-(-1.5)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 20.11 + (((tickAnim - 9) / 8) * (48.5-(20.11)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 48.5 + (((tickAnim - 17) / 3) * (105.15-(48.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 105.15 + (((tickAnim - 20) / 4) * (46.71-(105.15)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 46.71 + (((tickAnim - 24) / 4) * (18-(46.71)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 18 + (((tickAnim - 28) / 2) * (29-(18)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 29 + (((tickAnim - 30) / 4) * (18.75-(29)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (0.325-(0.55)));
            zz = 0.8 + (((tickAnim - 0) / 3) * (0.89-(0.8)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 3) / 2) * (0.25-(0.325)));
            zz = 0.89 + (((tickAnim - 3) / 2) * (0.375-(0.89)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 4) * (0.455-(0.25)));
            zz = 0.375 + (((tickAnim - 5) / 4) * (0.69-(0.375)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.455 + (((tickAnim - 9) / 4) * (1.05-(0.455)));
            zz = 0.69 + (((tickAnim - 9) / 4) * (0.835-(0.69)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.05 + (((tickAnim - 13) / 4) * (0.3-(1.05)));
            zz = 0.835 + (((tickAnim - 13) / 4) * (0.425-(0.835)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 17) / 3) * (1.49-(0.3)));
            zz = 0.425 + (((tickAnim - 17) / 3) * (-0.23-(0.425)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 1.49 + (((tickAnim - 20) / 2) * (1.5-(1.49)));
            zz = -0.23 + (((tickAnim - 20) / 2) * (0.46-(-0.23)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 22) / 2) * (1.355-(1.5)));
            zz = 0.46 + (((tickAnim - 22) / 2) * (0.84-(0.46)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            yy = 1.355 + (((tickAnim - 24) / 4) * (0-(1.355)));
            zz = 0.84 + (((tickAnim - 24) / 4) * (0-(0.84)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0.5-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = -0.025 + (((tickAnim - 30) / 4) * (0.55-(-0.025)));
            zz = 0.5 + (((tickAnim - 30) / 4) * (0.8-(0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (-36.1-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = -36.1 + (((tickAnim - 9) / 8) * (-29.5-(-36.1)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -29.5 + (((tickAnim - 17) / 3) * (8.43-(-29.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 8.43 + (((tickAnim - 20) / 2) * (1.32-(8.43)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 1.32 + (((tickAnim - 22) / 8) * (0-(1.32)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 5) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 12) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 5) / 12) * (0.275-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -0.125 + (((tickAnim - 17) / 5) * (0.005-(-0.125)));
            zz = 0.275 + (((tickAnim - 17) / 5) * (1.27-(0.275)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.005 + (((tickAnim - 22) / 6) * (0-(0.005)));
            zz = 1.27 + (((tickAnim - 22) / 6) * (0-(1.27)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -32 + (((tickAnim - 0) / 19) * (38.32844-(-32)));
            yy = 0 + (((tickAnim - 0) / 19) * (-6.26142-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (3.13588-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 38.32844 + (((tickAnim - 19) / 8) * (-0.05799-(38.32844)));
            yy = -6.26142 + (((tickAnim - 19) / 8) * (8.45816-(-6.26142)));
            zz = 3.13588 + (((tickAnim - 19) / 8) * (-13.03483-(3.13588)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -0.05799 + (((tickAnim - 27) / 7) * (-32-(-0.05799)));
            yy = 8.45816 + (((tickAnim - 27) / 7) * (0-(8.45816)));
            zz = -13.03483 + (((tickAnim - 27) / 7) * (0-(-13.03483)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 17.75 + (((tickAnim - 0) / 19) * (7.25-(17.75)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-7.75-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 7.25 + (((tickAnim - 19) / 8) * (-39.19118-(7.25)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = -7.75 + (((tickAnim - 19) / 8) * (3.64706-(-7.75)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -39.19118 + (((tickAnim - 27) / 7) * (17.75-(-39.19118)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 3.64706 + (((tickAnim - 27) / 7) * (0-(3.64706)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15 + (((tickAnim - 0) / 5) * (2.0059-(15)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.39681-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.18535-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 2.0059 + (((tickAnim - 5) / 5) * (-18.99712-(2.0059)));
            yy = -0.39681 + (((tickAnim - 5) / 5) * (0.11991-(-0.39681)));
            zz = 1.18535 + (((tickAnim - 5) / 5) * (2.74739-(1.18535)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -18.99712 + (((tickAnim - 10) / 9) * (82.5-(-18.99712)));
            yy = 0.11991 + (((tickAnim - 10) / 9) * (0-(0.11991)));
            zz = 2.74739 + (((tickAnim - 10) / 9) * (0-(2.74739)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 82.5 + (((tickAnim - 19) / 8) * (85.76-(82.5)));
            yy = 0 + (((tickAnim - 19) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 8) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 85.76 + (((tickAnim - 27) / 4) * (28.35885-(85.76)));
            yy = 0 + (((tickAnim - 27) / 4) * (1.05553-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (-1.04981-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 28.35885 + (((tickAnim - 31) / 3) * (15-(28.35885)));
            yy = 1.05553 + (((tickAnim - 31) / 3) * (0-(1.05553)));
            zz = -1.04981 + (((tickAnim - 31) / 3) * (0-(-1.04981)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 5) / 5) * (-0.1-(0.275)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.1 + (((tickAnim - 10) / 5) * (0.635-(-0.1)));
            zz = 0 + (((tickAnim - 10) / 5) * (-0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0.635 + (((tickAnim - 15) / 4) * (0.425-(0.635)));
            zz = -0.25 + (((tickAnim - 15) / 4) * (-0.5-(-0.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 19) / 4) * (1.365-(0.425)));
            zz = -0.5 + (((tickAnim - 19) / 4) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            yy = 1.365 + (((tickAnim - 23) / 4) * (0.9-(1.365)));
            zz = -0.5 + (((tickAnim - 23) / 4) * (-0.49-(-0.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 27) / 4) * (0-(0.9)));
            zz = -0.49 + (((tickAnim - 27) / 4) * (0-(-0.49)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 38.32844 + (((tickAnim - 0) / 8) * (-0.05799-(38.32844)));
            yy = -6.26142 + (((tickAnim - 0) / 8) * (-8.45816-(-6.26142)));
            zz = 3.13588 + (((tickAnim - 0) / 8) * (13.03483-(3.13588)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -0.05799 + (((tickAnim - 8) / 9) * (-32-(-0.05799)));
            yy = -8.45816 + (((tickAnim - 8) / 9) * (0-(-8.45816)));
            zz = 13.03483 + (((tickAnim - 8) / 9) * (0-(13.03483)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = -32 + (((tickAnim - 17) / 17) * (38.32844-(-32)));
            yy = 0 + (((tickAnim - 17) / 17) * (-6.26142-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (3.13588-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 0) / 8) * (-39.19118-(7.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = -7.75 + (((tickAnim - 0) / 8) * (-3.64706-(-7.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -39.19118 + (((tickAnim - 8) / 9) * (17.75-(-39.19118)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = -3.64706 + (((tickAnim - 8) / 9) * (0-(-3.64706)));
        }
        else if (tickAnim >= 17 && tickAnim < 34) {
            xx = 17.75 + (((tickAnim - 17) / 17) * (7.25-(17.75)));
            yy = 0 + (((tickAnim - 17) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 17) * (-7.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 82.5 + (((tickAnim - 0) / 8) * (85.76-(82.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 85.76 + (((tickAnim - 8) / 6) * (28.35885-(85.76)));
            yy = 0 + (((tickAnim - 8) / 6) * (1.05553-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (-1.04981-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 28.35885 + (((tickAnim - 14) / 3) * (15-(28.35885)));
            yy = 1.05553 + (((tickAnim - 14) / 3) * (0-(1.05553)));
            zz = -1.04981 + (((tickAnim - 14) / 3) * (0-(-1.04981)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 15 + (((tickAnim - 17) / 4) * (2.0059-(15)));
            yy = 0 + (((tickAnim - 17) / 4) * (-0.39681-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (1.18535-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 2.0059 + (((tickAnim - 21) / 5) * (-18.99712-(2.0059)));
            yy = -0.39681 + (((tickAnim - 21) / 5) * (0.11991-(-0.39681)));
            zz = 1.18535 + (((tickAnim - 21) / 5) * (2.74739-(1.18535)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -18.99712 + (((tickAnim - 26) / 8) * (82.5-(-18.99712)));
            yy = 0.11991 + (((tickAnim - 26) / 8) * (0-(0.11991)));
            zz = 2.74739 + (((tickAnim - 26) / 8) * (0-(2.74739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 3) * (1.365-(0.425)));
            zz = -0.5 + (((tickAnim - 0) / 3) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.365 + (((tickAnim - 3) / 5) * (0.9-(1.365)));
            zz = -0.5 + (((tickAnim - 3) / 5) * (-0.49-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 8) / 6) * (0-(0.9)));
            zz = -0.49 + (((tickAnim - 8) / 6) * (0-(-0.49)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 4) * (0.275-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 21) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 21) / 5) * (-0.1-(0.275)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            yy = -0.1 + (((tickAnim - 26) / 3) * (0.635-(-0.1)));
            zz = 0 + (((tickAnim - 26) / 3) * (-0.25-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 29) / 5) * (0-(0)));
            yy = 0.635 + (((tickAnim - 29) / 5) * (0.425-(0.635)));
            zz = -0.25 + (((tickAnim - 29) / 5) * (-0.5-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-50))*-1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-80))*1));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211))*0.1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-70))*0.15);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-50))*-0.4);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-50))*0.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-80))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-50))*0.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-120))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-100))*0.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-180))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-150))*0.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*-7), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-180))*2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(23+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-200))*-0.5), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-200))*-10), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-180))*2));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-9.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-250))*-0.5), tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-250))*-12), tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-180))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-50))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))*1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-100))*-1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*1));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-100))*1), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-240))*4), body3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-200))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-250))*-4), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211/0.5-230))*-1), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211+90))*1), head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*1));
        
    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 34;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(85.1604285587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211))*1), backLeftLeg.rotateAngleY + (float) Math.toRadians(-18.0118), backLeftLeg.rotateAngleZ + (float) Math.toRadians(-57.57876));
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(-14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))), backLeftLeg2.rotateAngleY + (float) Math.toRadians(0), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(85.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*2), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*2), backLeftLeg4.rotateAngleY + (float) Math.toRadians(0), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(85.1604285587+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211))*-1), backRightLeg.rotateAngleY + (float) Math.toRadians(18.0118), backRightLeg.rotateAngleZ + (float) Math.toRadians(57.57876));
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(-14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))*-1), backRightLeg2.rotateAngleY + (float) Math.toRadians(0), backRightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(85.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-2), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(21+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*-2), backRightLeg4.rotateAngleY + (float) Math.toRadians(0), backRightLeg4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*0.5), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(18), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-200))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-17.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-350))*20), tail6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(51.15069), frontleftleg.rotateAngleY + (float) Math.toRadians(20.4123), frontleftleg.rotateAngleZ + (float) Math.toRadians(-8.50523));
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(33.10858), frontleftleg2.rotateAngleY + (float) Math.toRadians(1.43871), frontleftleg2.rotateAngleZ + (float) Math.toRadians(8.63182));
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(6.75998), frontleftleg3.rotateAngleY + (float) Math.toRadians(-81.6643), frontleftleg3.rotateAngleZ + (float) Math.toRadians(76.92643));
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(-0.575);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(0);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(0.95);
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(51.15069), frontrightleg.rotateAngleY + (float) Math.toRadians(-20.4123), frontrightleg.rotateAngleZ + (float) Math.toRadians(8.50523));
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(33.10858), frontrightleg2.rotateAngleY + (float) Math.toRadians(-1.43871), frontrightleg2.rotateAngleZ + (float) Math.toRadians(-8.63182));
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(6.75998), frontrightleg3.rotateAngleY + (float) Math.toRadians(81.6643), frontrightleg3.rotateAngleZ + (float) Math.toRadians(-76.92643));
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(0.575);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(0);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(0.95);
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-50))*0.7), main.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*1), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-250))*10), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-300))*15), tail5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-100))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-150))*-0.5), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-200))*1), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*211-250))*0.5), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStolokrosuchus entity = (EntityPrehistoricFloraStolokrosuchus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+80))*8), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-90))*-1.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+20))*1.5);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -11.2504 + (((tickAnim - 0) / 6) * (52.35721-(-11.2504)));
            yy = -16.86139 + (((tickAnim - 0) / 6) * (-6.91503-(-16.86139)));
            zz = -2.79395 + (((tickAnim - 0) / 6) * (-7.09285-(-2.79395)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 52.35721 + (((tickAnim - 6) / 7) * (-17.036-(52.35721)));
            yy = -6.91503 + (((tickAnim - 6) / 7) * (-14.3748-(-6.91503)));
            zz = -7.09285 + (((tickAnim - 6) / 7) * (-3.86868-(-7.09285)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -17.036 + (((tickAnim - 13) / 1) * (-11.2504-(-17.036)));
            yy = -14.3748 + (((tickAnim - 13) / 1) * (-16.86139-(-14.3748)));
            zz = -3.86868 + (((tickAnim - 13) / 1) * (-2.79395-(-3.86868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27.26635 + (((tickAnim - 0) / 6) * (18.25-(-27.26635)));
            yy = 1.13984 + (((tickAnim - 0) / 6) * (0-(1.13984)));
            zz = -1.64351 + (((tickAnim - 0) / 6) * (0-(-1.64351)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 18.25 + (((tickAnim - 6) / 3) * (-21.25817-(18.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.56992-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.82176-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -21.25817 + (((tickAnim - 9) / 5) * (-27.26635-(-21.25817)));
            yy = 0.56992 + (((tickAnim - 9) / 5) * (1.13984-(0.56992)));
            zz = -0.82176 + (((tickAnim - 9) / 5) * (-1.64351-(-0.82176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 6) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (2.65-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 2.65 + (((tickAnim - 9) / 5) * (-0.1-(2.65)));
            zz = -0.225 + (((tickAnim - 9) / 5) * (0-(-0.225)));
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
            xx = 48.75 + (((tickAnim - 0) / 3) * (-5.25-(48.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.25 + (((tickAnim - 3) / 3) * (49.5-(-5.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 3) * (0-(5)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 49.5 + (((tickAnim - 6) / 3) * (57.75-(49.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 57.75 + (((tickAnim - 9) / 5) * (48.75-(57.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 3) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 6) / 2) * (1.955-(0.65)));
            zz = 0.45 + (((tickAnim - 6) / 2) * (0.99-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.955 + (((tickAnim - 8) / 1) * (1.3-(1.955)));
            zz = 0.99 + (((tickAnim - 8) / 1) * (0.23-(0.99)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 9) / 5) * (-0.25-(1.3)));
            zz = 0.23 + (((tickAnim - 9) / 5) * (0-(0.23)));
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
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-41.61-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -41.61 + (((tickAnim - 5) / 1) * (34.75-(-41.61)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34.75 + (((tickAnim - 6) / 2) * (0-(34.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 3) * (0-(-0.15)));
            zz = 0.225 + (((tickAnim - 5) / 3) * (0.75-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0.75 + (((tickAnim - 8) / 6) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -11.2504 + (((tickAnim - 0) / 6) * (52.35721-(-11.2504)));
            yy = 16.86139 + (((tickAnim - 0) / 6) * (6.91503-(16.86139)));
            zz = 2.79395 + (((tickAnim - 0) / 6) * (7.09285-(2.79395)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 52.35721 + (((tickAnim - 6) / 7) * (-17.036-(52.35721)));
            yy = 6.91503 + (((tickAnim - 6) / 7) * (14.3748-(6.91503)));
            zz = 7.09285 + (((tickAnim - 6) / 7) * (3.86868-(7.09285)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -17.036 + (((tickAnim - 13) / 1) * (-11.2504-(-17.036)));
            yy = 14.3748 + (((tickAnim - 13) / 1) * (16.86139-(14.3748)));
            zz = 3.86868 + (((tickAnim - 13) / 1) * (2.79395-(3.86868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27.26635 + (((tickAnim - 0) / 6) * (18.25-(-27.26635)));
            yy = 1.13984 + (((tickAnim - 0) / 6) * (0-(1.13984)));
            zz = -1.64351 + (((tickAnim - 0) / 6) * (0-(-1.64351)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 18.25 + (((tickAnim - 6) / 3) * (-21.25817-(18.25)));
            yy = 0 + (((tickAnim - 6) / 3) * (0.56992-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.82176-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = -21.25817 + (((tickAnim - 9) / 5) * (-27.26635-(-21.25817)));
            yy = 0.56992 + (((tickAnim - 9) / 5) * (1.13984-(0.56992)));
            zz = -0.82176 + (((tickAnim - 9) / 5) * (-1.64351-(-0.82176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 0) / 6) * (0-(-0.1)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (2.65-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (-0.225-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 2.65 + (((tickAnim - 9) / 5) * (-0.1-(2.65)));
            zz = -0.225 + (((tickAnim - 9) / 5) * (0-(-0.225)));
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
            xx = 48.75 + (((tickAnim - 0) / 3) * (-5.25-(48.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -5.25 + (((tickAnim - 3) / 3) * (49.5-(-5.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 3) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 49.5 + (((tickAnim - 6) / 3) * (57.75-(49.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 57.75 + (((tickAnim - 9) / 5) * (48.75-(57.75)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 3) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0.45-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 6) / 2) * (1.955-(0.65)));
            zz = 0.45 + (((tickAnim - 6) / 2) * (0.99-(0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.955 + (((tickAnim - 8) / 1) * (1.3-(1.955)));
            zz = 0.99 + (((tickAnim - 8) / 1) * (0.23-(0.99)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 1.3 + (((tickAnim - 9) / 5) * (-0.25-(1.3)));
            zz = 0.23 + (((tickAnim - 9) / 5) * (0-(0.23)));
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
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-41.61-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -41.61 + (((tickAnim - 5) / 1) * (34.75-(-41.61)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 34.75 + (((tickAnim - 6) / 2) * (0-(34.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
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
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 3) * (0-(-0.15)));
            zz = 0.225 + (((tickAnim - 5) / 3) * (0.75-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0.75 + (((tickAnim - 8) / 6) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(4.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+120))*-5), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+150))*-8), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(6.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+250))*8), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+250))*3), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+300))*6), tail5.rotateAngleY + (float) Math.toRadians(0), tail5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507+350))*-9), tail6.rotateAngleY + (float) Math.toRadians(0), tail6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507))*-8), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-50))*-8), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-100))*8), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.64487 + (((tickAnim - 0) / 3) * (2.80209-(39.64487)));
            yy = 5.87841 + (((tickAnim - 0) / 3) * (14.46821-(5.87841)));
            zz = -2.78189 + (((tickAnim - 0) / 3) * (-21.856-(-2.78189)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.80209 + (((tickAnim - 3) / 3) * (-34.14632-(2.80209)));
            yy = 14.46821 + (((tickAnim - 3) / 3) * (-1.06951-(14.46821)));
            zz = -21.856 + (((tickAnim - 3) / 3) * (-0.3854-(-21.856)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -34.14632 + (((tickAnim - 6) / 8) * (39.64487-(-34.14632)));
            yy = -1.06951 + (((tickAnim - 6) / 8) * (5.87841-(-1.06951)));
            zz = -0.3854 + (((tickAnim - 6) / 8) * (-2.78189-(-0.3854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.11121 + (((tickAnim - 0) / 3) * (-39.3194-(20.11121)));
            yy = 6.43715 + (((tickAnim - 0) / 3) * (3.21858-(6.43715)));
            zz = 15.22477 + (((tickAnim - 0) / 3) * (7.61239-(15.22477)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -39.3194 + (((tickAnim - 3) / 3) * (30.5-(-39.3194)));
            yy = 3.21858 + (((tickAnim - 3) / 3) * (0-(3.21858)));
            zz = 7.61239 + (((tickAnim - 3) / 3) * (0-(7.61239)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 30.5 + (((tickAnim - 6) / 8) * (20.11121-(30.5)));
            yy = 0 + (((tickAnim - 6) / 8) * (6.43715-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (15.22477-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg2, frontleftleg2.rotateAngleX + (float) Math.toRadians(xx), frontleftleg2.rotateAngleY + (float) Math.toRadians(yy), frontleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.725 + (((tickAnim - 6) / 3) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg2.rotationPointX = this.frontleftleg2.rotationPointX + (float)(xx);
        this.frontleftleg2.rotationPointY = this.frontleftleg2.rotationPointY - (float)(yy);
        this.frontleftleg2.rotationPointZ = this.frontleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 98.5 + (((tickAnim - 0) / 3) * (93.13-(98.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 93.13 + (((tickAnim - 3) / 3) * (48.75-(93.13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 48.75 + (((tickAnim - 6) / 2) * (-6.75-(48.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -6.75 + (((tickAnim - 8) / 1) * (-26.95273-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.00081-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (-5.40845-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -26.95273 + (((tickAnim - 9) / 4) * (70.75-(-26.95273)));
            yy = -1.00081 + (((tickAnim - 9) / 4) * (0-(-1.00081)));
            zz = -5.40845 + (((tickAnim - 9) / 4) * (0-(-5.40845)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 70.75 + (((tickAnim - 13) / 1) * (98.5-(70.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.155-(0)));
            zz = -0.55 + (((tickAnim - 0) / 2) * (-0.58-(-0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.155 + (((tickAnim - 2) / 1) * (0.85-(1.155)));
            zz = -0.58 + (((tickAnim - 2) / 1) * (-0.605-(-0.58)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 3) * (0-(0.85)));
            zz = -0.605 + (((tickAnim - 3) / 3) * (-0.55-(-0.605)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (1.25-(0)));
            zz = -0.55 + (((tickAnim - 6) / 3) * (0-(-0.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 1.25 + (((tickAnim - 9) / 4) * (1.825-(1.25)));
            zz = 0 + (((tickAnim - 9) / 4) * (-0.31-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.825 + (((tickAnim - 13) / 1) * (0-(1.825)));
            zz = -0.31 + (((tickAnim - 13) / 1) * (-0.55-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg3.rotationPointX = this.frontleftleg3.rotationPointX + (float)(xx);
        this.frontleftleg3.rotationPointY = this.frontleftleg3.rotationPointY - (float)(yy);
        this.frontleftleg3.rotationPointZ = this.frontleftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 39.64487 + (((tickAnim - 0) / 3) * (2.80209-(39.64487)));
            yy = -5.87841 + (((tickAnim - 0) / 3) * (-14.46821-(-5.87841)));
            zz = 2.78189 + (((tickAnim - 0) / 3) * (21.856-(2.78189)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 2.80209 + (((tickAnim - 3) / 3) * (-38.75-(2.80209)));
            yy = -14.46821 + (((tickAnim - 3) / 3) * (0-(-14.46821)));
            zz = 21.856 + (((tickAnim - 3) / 3) * (0-(21.856)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -38.75 + (((tickAnim - 6) / 8) * (39.64487-(-38.75)));
            yy = 0 + (((tickAnim - 6) / 8) * (-5.87841-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (2.78189-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg, frontrightleg.rotateAngleX + (float) Math.toRadians(xx), frontrightleg.rotateAngleY + (float) Math.toRadians(yy), frontrightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 20.11121 + (((tickAnim - 0) / 3) * (-39.3194-(20.11121)));
            yy = -6.43715 + (((tickAnim - 0) / 3) * (-3.21858-(-6.43715)));
            zz = -15.22477 + (((tickAnim - 0) / 3) * (-7.61239-(-15.22477)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -39.3194 + (((tickAnim - 3) / 3) * (33.75-(-39.3194)));
            yy = -3.21858 + (((tickAnim - 3) / 3) * (0-(-3.21858)));
            zz = -7.61239 + (((tickAnim - 3) / 3) * (0-(-7.61239)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 33.75 + (((tickAnim - 6) / 8) * (20.11121-(33.75)));
            yy = 0 + (((tickAnim - 6) / 8) * (-6.43715-(0)));
            zz = 0 + (((tickAnim - 6) / 8) * (-15.22477-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg2, frontrightleg2.rotateAngleX + (float) Math.toRadians(xx), frontrightleg2.rotateAngleY + (float) Math.toRadians(yy), frontrightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -0.775 + (((tickAnim - 6) / 3) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg2.rotationPointX = this.frontrightleg2.rotationPointX + (float)(xx);
        this.frontrightleg2.rotationPointY = this.frontrightleg2.rotationPointY - (float)(yy);
        this.frontrightleg2.rotationPointZ = this.frontrightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 98.5 + (((tickAnim - 0) / 3) * (93.13-(98.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 93.13 + (((tickAnim - 3) / 3) * (37.5-(93.13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 6) / 2) * (-16.00154-(37.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (-0.03923-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (4.49983-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.00154 + (((tickAnim - 8) / 2) * (-43.18-(-16.00154)));
            yy = -0.03923 + (((tickAnim - 8) / 2) * (0-(-0.03923)));
            zz = 4.49983 + (((tickAnim - 8) / 2) * (0-(4.49983)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -43.18 + (((tickAnim - 10) / 3) * (70.75-(-43.18)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 70.75 + (((tickAnim - 13) / 1) * (98.5-(70.75)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg3, frontrightleg3.rotateAngleX + (float) Math.toRadians(xx), frontrightleg3.rotateAngleY + (float) Math.toRadians(yy), frontrightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.275-(0)));
            zz = -0.55 + (((tickAnim - 0) / 2) * (-0.58-(-0.55)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.275 + (((tickAnim - 2) / 1) * (0.85-(1.275)));
            zz = -0.58 + (((tickAnim - 2) / 1) * (-0.605-(-0.58)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.85 + (((tickAnim - 3) / 3) * (0-(0.85)));
            zz = -0.605 + (((tickAnim - 3) / 3) * (0-(-0.605)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.825-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 5) * (1.825-(0.825)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.31-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 1.825 + (((tickAnim - 13) / 1) * (0-(1.825)));
            zz = -0.31 + (((tickAnim - 13) / 1) * (-0.55-(-0.31)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg3.rotationPointX = this.frontrightleg3.rotationPointX + (float)(xx);
        this.frontrightleg3.rotationPointY = this.frontrightleg3.rotationPointY - (float)(yy);
        this.frontrightleg3.rotationPointZ = this.frontrightleg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-200))*-9), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*507-250))*-6), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStolokrosuchus e = (EntityPrehistoricFloraStolokrosuchus) entity;
        animator.update(entity);


    }
}
