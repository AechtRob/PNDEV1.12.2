package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeogracilidens;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaeogracilidens extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;

    private ModelAnimator animator;

    public ModelArchaeogracilidens() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 33, 12, -3.0F, -2.6F, -12.0F, 6, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 33, 0, -3.0F, -1.6F, -18.375F, 6, 4, 7, 0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.8518F, 1.0514F, -21.7504F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, -0.3054F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 33, 0.0F, -0.975F, -0.925F, 1, 1, 1, -0.003F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.9042F, -0.941F, -21.5841F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, -0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 73, 38, 0.0F, 0.0F, -1.075F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.8017F, 1.0514F, -21.7504F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0867F, -0.2837F, -0.002F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 70, 62, -0.05F, -2.0F, -0.075F, 2, 2, 4, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.8518F, 1.0514F, -21.7504F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 27, 33, -1.0F, -0.975F, -0.925F, 1, 1, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.4506F, -0.1298F, -21.6926F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0439F, -0.3229F, -0.0008F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 39, 73, -0.425F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.4506F, -0.1298F, -21.6926F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0439F, 0.3229F, 0.0008F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 73, -0.575F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.9042F, -0.941F, -21.5841F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.3054F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 73, 38, -1.0F, 0.0F, -1.075F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.8688F, 1.043F, -21.5562F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5027F, -0.2643F, -0.0124F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 72, -0.75F, -1.75F, 1.5F, 0, 2, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 26, 73, -0.75F, -1.7F, -0.25F, 0, 2, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 70, 69, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.8688F, 1.043F, -21.5562F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5027F, 0.2643F, 0.0124F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 26, 73, 0.75F, -1.7F, -0.25F, 0, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 66, 72, 0.75F, -1.75F, 1.5F, 0, 2, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 69, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.8017F, 1.0514F, -21.7504F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0867F, 0.2837F, 0.002F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 62, -1.95F, -2.0F, -0.075F, 2, 2, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 1.1471F, -21.5641F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4931F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 67, -0.5F, -1.05F, -0.125F, 3, 1, 4, -0.006F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 0.986F, -22.6006F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 73, 36, -0.5F, -0.7F, 0.5F, 3, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 73, -0.5F, -1.0F, 0.0F, 3, 1, 2, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.4124F, -23.4197F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6109F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 72, -0.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -1.2113F, -21.8823F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3491F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 73, 8, -0.5F, 0.0F, -2.0F, 3, 1, 2, 0.003F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.0771F, -17.9772F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 65, -1.5F, 0.0F, -4.0F, 3, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -2.6F, -12.0F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 56, -2.5F, 0.0F, -6.0F, 4, 2, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 3.0959F, -18.3928F);
        this.main.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 60, 8, -2.0F, -2.025F, -1.0F, 5, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.0F, 3.4F, -12.0F);
        this.main.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 46, -1.5F, -2.05F, -6.4F, 5, 2, 7, 0.003F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(3.0F, 2.4F, -12.0F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.3054F);
        this.frontLeftFin.cubeList.add(new ModelBox(frontLeftFin, 0, 24, 0.0F, 0.0F, -1.0F, 8, 0, 8, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-3.0F, 2.4F, -12.0F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.3054F);
        this.frontRightFin.cubeList.add(new ModelBox(frontRightFin, 0, 24, -8.0F, 0.0F, -1.0F, 8, 0, 8, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.2133F, -18.4672F);
        this.main.addChild(jaw);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.75F, 0.7027F, -1.4967F);
        this.jaw.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3054F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 40, 63, -0.75F, -1.725F, -2.6F, 3, 1, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-1.25F, -1.0971F, -3.1311F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.5305F, -0.2079F, 0.0666F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 73, 41, -0.3F, -0.5F, 0.0F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(1.25F, -1.0971F, -3.1311F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.5305F, 0.2079F, -0.0666F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 73, 41, 0.3F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.5F, -0.3238F, -4.0041F);
        this.jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.2974F, -0.2411F, 0.0778F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 72, 0.0F, -1.025F, 0.0F, 1, 1, 4, -0.006F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, -0.3238F, -4.0041F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.2974F, 0.2411F, -0.0778F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 72, -1.0F, -1.025F, 0.0F, 1, 1, 4, -0.006F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.3238F, -4.0041F);
        this.jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.2793F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 69, 46, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0751F, 0.0806F, -6.7235F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 33, -2.5751F, -2.0806F, -0.0265F, 5, 4, 8, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.4249F, -2.6806F, 0.7235F);
        this.body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0393F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 27, 36, -2.5F, 0.025F, -0.3F, 4, 1, 8, -0.003F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.5751F, 3.3194F, 0.2235F);
        this.body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0873F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 33, 25, -1.5F, -2.0F, 0.025F, 4, 2, 8, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.2252F, 0.1189F, 7.4806F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 25, 46, -2.3002F, -1.6994F, -0.0071F, 4, 3, 7, 0.003F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.3002F, 2.5469F, 0.2144F);
        this.tail.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 52, 36, -0.5F, -2.0F, 0.0F, 3, 2, 7, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.3002F, -2.5016F, 0.1866F);
        this.tail.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0742F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 56, -0.5F, 0.0F, 0.025F, 3, 1, 7, -0.003F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.1998F, 1.5469F, 1.7144F);
        this.tail.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0F, 0.0F, 0.829F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 58, 21, -0.5F, 0.0F, -1.0F, 5, 0, 5, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.8002F, 1.5469F, 1.7144F);
        this.tail.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0F, 0.0F, -0.829F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 58, 21, -4.5F, 0.0F, -1.0F, 5, 0, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(-0.299F, -0.7043F, 6.574F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 69, 52, -0.0012F, -5.1286F, 0.9433F, 0, 4, 5, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 48, 46, -1.5012F, -0.4951F, -0.0811F, 3, 2, 7, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.0012F, -1.2286F, 2.9433F);
        this.tail2.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.2051F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 30, 67, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.5012F, -1.3156F, 0.0947F);
        this.tail2.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0305F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 58, 12, -0.5F, 0.0F, -0.15F, 2, 1, 7, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0012F, 2.0542F, 4.0695F);
        this.tail2.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 40, 57, 1.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-0.5012F, 2.4028F, 0.0847F);
        this.tail2.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0873F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 21, 57, -0.5F, -2.025F, 0.0F, 2, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0071F, 0.5695F, 6.5085F);
        this.tail2.addChild(tail3);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5083F, 0.7479F, 5.7771F);
        this.tail3.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0829F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 60, 0, -0.5F, -1.0F, -6.0F, 2, 1, 6, -0.006F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.5083F, -1.6147F, -0.0897F);
        this.tail3.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0611F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 27, -0.5F, 0.0F, 0.0F, 2, 2, 6, -0.003F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.3049F, -1.0647F, 5.4103F);
        this.tail3.addChild(tail4);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-0.3265F, -2.4855F, 4.5623F);
        this.tail4.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.3316F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 40, 65, -0.5F, 0.0F, 0.0F, 1, 1, 6, -0.003F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.8265F, 1.782F, -0.1055F);
        this.tail4.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.3752F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 0, 0.5F, -2.5F, -2.0F, 0, 7, 16, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.3265F, 1.782F, -0.1055F);
        this.tail4.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.4189F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 65, -0.5F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

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

        this.main.offsetZ = -0.0F;
        this.main.offsetY = -0.28F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {

        this.main.offsetZ = -0.1F;
        this.main.offsetY = -0.05F;
        this.main.offsetX = -0.03F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.5F;
        this.main.offsetX = 0.35F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
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

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraArchaeogracilidens ee = (EntityPrehistoricFloraArchaeogracilidens) entitylivingbaseIn;

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }


        
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeogracilidens entity = (EntityPrehistoricFloraArchaeogracilidens) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*0.8));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*9), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*18), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftFin, frontLeftFin.rotateAngleX + (float) Math.toRadians(0), frontLeftFin.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), frontLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*2));


        this.setRotateAngle(backLeftFin, backLeftFin.rotateAngleX + (float) Math.toRadians(0), backLeftFin.rotateAngleY + (float) Math.toRadians(0), backLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*1.8));


        this.setRotateAngle(backRightFin, backRightFin.rotateAngleX + (float) Math.toRadians(0), backRightFin.rotateAngleY + (float) Math.toRadians(0), backRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*1.8));


        this.setRotateAngle(frontRightFin, frontRightFin.rotateAngleX + (float) Math.toRadians(0), frontRightFin.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*2), frontRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*2));
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeogracilidens entity = (EntityPrehistoricFloraArchaeogracilidens) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*0.8));
        this.main.rotationPointX = this.main.rotationPointX + (float)(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*8), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*12), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*29), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftFin, frontLeftFin.rotateAngleX + (float) Math.toRadians(0), frontLeftFin.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2), frontLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*2));


        this.setRotateAngle(backLeftFin, backLeftFin.rotateAngleX + (float) Math.toRadians(0), backLeftFin.rotateAngleY + (float) Math.toRadians(0), backLeftFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1.8));


        this.setRotateAngle(backRightFin, backRightFin.rotateAngleX + (float) Math.toRadians(0), backRightFin.rotateAngleY + (float) Math.toRadians(0), backRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1.8));


        this.setRotateAngle(frontRightFin, frontRightFin.rotateAngleX + (float) Math.toRadians(0), frontRightFin.rotateAngleY + (float) Math.toRadians(-0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*2), frontRightFin.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*2));
    }


    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraArchaeogracilidens entity = (EntityPrehistoricFloraArchaeogracilidens) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 45.5 + (((tickAnim - 5) / 5) * (0-(45.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*3), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(3.75-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*4), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(4-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-300))*5), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(1-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-350))*6), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        this.main.offsetY = 0.26F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraArchaeogracilidens ee = (EntityPrehistoricFloraArchaeogracilidens) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            //this.main.rotateAngleZ = (float) Math.toRadians(90);
            //this.main.offsetY = -0.2F;
           // this.bob(main, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

