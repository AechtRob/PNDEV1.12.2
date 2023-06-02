package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProganochelys;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProganochelys extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer frontlegleft1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontlegleft2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontlegleft3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer frontlegright1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer frontlegright2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer frontlegright3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer backlegleft1;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer backlegleft2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer backlegleft3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backlegright1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backlegright2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backlegright3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer lowerjaw;

    private ModelAnimator animator;

    public ModelProganochelys() {
        this.textureWidth = 79;
        this.textureHeight = 70;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.5F, 20.5F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 29, 22, -6.0F, -1.0F, -4.5F, 11, 2, 10, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 40, 5.25F, -3.25F, -7.5F, 2, 1, 16, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 34, -8.25F, -3.25F, -7.5F, 2, 1, 16, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 51, 1.6158F, -4.3797F, -9.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 52, 5, -6.3842F, -4.3797F, -9.0F, 4, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 44, -6.75F, -3.75F, 8.5F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 29, 34, 1.75F, -3.75F, 8.5F, 4, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 22, -4.0F, -2.0F, -7.0F, 7, 3, 15, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -6.0F, -8.0F, 13, 5, 17, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -4.0F, 8.25F);
        this.body.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 7, -2.5F, -0.5F, -0.75F, 5, 4, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.25F, 2.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 0, -2.0F, -0.25F, -0.25F, 4, 3, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 8, 12, 0.0F, -1.25F, -0.25F, 0, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, -0.25F, 1.75F);
        this.tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5236F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -0.15F, -0.65F, -2.0F, 0, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -0.25F, 1.75F);
        this.tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 12, 0.15F, -0.65F, -2.0F, 0, 1, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.75F, 3.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 43, 11, -1.5F, -1.0F, -0.25F, 3, 2, 4, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 20, 46, 0.0F, -2.0F, -0.25F, 0, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, -1.0F, -0.25F);
        this.tail3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.9599F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 44, -0.5F, -0.65F, 0.0F, 0, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, -1.0F, -0.25F);
        this.tail3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.9599F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 46, 0.5F, -0.65F, 0.0F, 0, 2, 4, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.5F, 3.65F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 5, -1.0F, -0.5F, 0.0F, 2, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 27, 0.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 24, 22, -2.0F, 0.0F, 0.0F, 2, 0, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 9, 0.0F, -1.5F, 0.0F, 0, 1, 5, 0.0F, false));

        this.frontlegleft1 = new AdvancedModelRenderer(this);
        this.frontlegleft1.setRotationPoint(2.5867F, -1.0325F, -6.0F);
        this.body.addChild(frontlegleft1);
        this.setRotateAngle(frontlegleft1, 0.0F, 0.5236F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.4133F, -0.2175F, 0.0F);
        this.frontlegleft1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6545F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 39, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontlegleft2 = new AdvancedModelRenderer(this);
        this.frontlegleft2.setRotationPoint(3.2874F, 1.5438F, 0.0F);
        this.frontlegleft1.addChild(frontlegleft2);
        this.setRotateAngle(frontlegleft2, 0.0F, -0.5236F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontlegleft2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 53, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontlegleft3 = new AdvancedModelRenderer(this);
        this.frontlegleft3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontlegleft2.addChild(frontlegleft3);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontlegleft3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 53, 7, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.frontlegright1 = new AdvancedModelRenderer(this);
        this.frontlegright1.setRotationPoint(-3.5867F, -1.0325F, -6.0F);
        this.body.addChild(frontlegright1);
        this.setRotateAngle(frontlegright1, 0.0F, -0.5236F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.4133F, -0.2175F, 0.0F);
        this.frontlegright1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6545F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 46, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.frontlegright2 = new AdvancedModelRenderer(this);
        this.frontlegright2.setRotationPoint(-3.2874F, 1.5438F, 0.0F);
        this.frontlegright1.addChild(frontlegright2);
        this.setRotateAngle(frontlegright2, 0.0F, 0.5236F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.frontlegright2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 52, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.frontlegright3 = new AdvancedModelRenderer(this);
        this.frontlegright3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontlegright2.addChild(frontlegright3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.frontlegright3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 51, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.backlegleft1 = new AdvancedModelRenderer(this);
        this.backlegleft1.setRotationPoint(2.5867F, -0.7825F, 7.0F);
        this.body.addChild(backlegleft1);
        this.setRotateAngle(backlegleft1, 0.0F, -0.5672F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.4133F, -0.4675F, 0.0F);
        this.backlegleft1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.6545F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 34, 0.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.backlegleft2 = new AdvancedModelRenderer(this);
        this.backlegleft2.setRotationPoint(3.2874F, 1.2938F, 0.0F);
        this.backlegleft1.addChild(backlegleft2);
        this.setRotateAngle(backlegleft2, 0.0F, 0.3491F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backlegleft2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 55, 0, -1.75F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backlegleft3 = new AdvancedModelRenderer(this);
        this.backlegleft3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backlegleft2.addChild(backlegleft3);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backlegleft3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 51, 0.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.backlegright1 = new AdvancedModelRenderer(this);
        this.backlegright1.setRotationPoint(-3.5867F, -0.7825F, 7.0F);
        this.body.addChild(backlegright1);
        this.setRotateAngle(backlegright1, 0.0F, 0.5672F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4133F, -0.4675F, 0.0F);
        this.backlegright1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.6545F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 45, -4.0F, -1.0F, -1.5F, 4, 2, 3, 0.0F, false));

        this.backlegright2 = new AdvancedModelRenderer(this);
        this.backlegright2.setRotationPoint(-3.2874F, 1.2938F, 0.0F);
        this.backlegright1.addChild(backlegright2);
        this.setRotateAngle(backlegright2, 0.0F, -0.3491F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.75F, 0.0F);
        this.backlegright2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 51, -0.25F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backlegright3 = new AdvancedModelRenderer(this);
        this.backlegright3.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.backlegright2.addChild(backlegright3);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.backlegright3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -1.5708F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 41, -1.25F, -1.5F, -3.0F, 1, 3, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.25F, -7.75F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 22, -2.0F, -1.5F, -3.75F, 3, 3, 4, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 33, 19, 0.0F, -2.25F, -2.75F, 0, 3, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 9, 26, -1.0F, -2.25F, -2.75F, 0, 3, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 3.0F, -1.25F);
        this.neck.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 29, -1.0F, -2.5F, -2.5F, 2, 2, 5, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.5F, -0.3335F, -2.7091F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 40, -2.0F, -0.6665F, -4.0409F, 4, 2, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 43, 0, -2.0F, -1.1665F, -4.0409F, 4, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 51, -1.5F, -0.6665F, -4.7909F, 3, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.4829F, -5.2205F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 57, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.4165F, -3.7909F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 48, 47, -1.5F, 0.0F, -2.25F, 3, 1, 2, -0.01F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 1.3335F, -1.1659F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 8, 51, -1.5F, 0.0F, -3.875F, 3, 1, 1, 0.005F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 20, 40, -2.0F, 0.0F, -2.875F, 4, 1, 4, 0.01F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 26, 51, -1.5F, -1.0F, -1.625F, 3, 1, 2, -0.001F, false));

//        this.setRotateAngle(frontlegleft1, frontlegleft1.rotateAngleX + (float)Math.toRadians(-3.94817), frontlegleft1.rotateAngleY + (float)Math.toRadians(15.03973), frontlegleft1.rotateAngleZ + (float)Math.toRadians(-39.88622));
//        this.setRotateAngle(frontlegleft2, frontlegleft2.rotateAngleX + (float)Math.toRadians(37.26601), frontlegleft2.rotateAngleY + (float)Math.toRadians(-15.5544), frontlegleft2.rotateAngleZ + (float)Math.toRadians(1.65994));
//        this.setRotateAngle(frontlegleft3, frontlegleft3.rotateAngleX + (float)Math.toRadians(-28.13333), frontlegleft3.rotateAngleY + (float)Math.toRadians(-0.93243), frontlegleft3.rotateAngleZ + (float)Math.toRadians(41.44671));
//        this.setRotateAngle(frontlegright1, frontlegright1.rotateAngleX + (float)Math.toRadians(-3.94817), frontlegright1.rotateAngleY + (float)Math.toRadians(-15.03973), frontlegright1.rotateAngleZ + (float)Math.toRadians(39.88622));
//        this.setRotateAngle(frontlegright2, frontlegright2.rotateAngleX + (float)Math.toRadians(37.26601), frontlegright2.rotateAngleY + (float)Math.toRadians(15.5544), frontlegright2.rotateAngleZ + (float)Math.toRadians(-1.65994));
//        this.setRotateAngle(frontlegright3, frontlegright3.rotateAngleX + (float)Math.toRadians(-28.13333), frontlegright3.rotateAngleY + (float)Math.toRadians(0.93243), frontlegright3.rotateAngleZ + (float)Math.toRadians(-41.44671));
//        this.setRotateAngle(backlegleft1, backlegleft1.rotateAngleX + (float)Math.toRadians(32.70538), backlegleft1.rotateAngleY + (float)Math.toRadians(20.10446), backlegleft1.rotateAngleZ + (float)Math.toRadians(-31.35831));
//        this.setRotateAngle(backlegleft2, backlegleft2.rotateAngleX + (float)Math.toRadians(18.38), backlegleft2.rotateAngleY + (float)Math.toRadians(-13.98), backlegleft2.rotateAngleZ + (float)Math.toRadians(32.14));
//        this.setRotateAngle(backlegleft3, backlegleft3.rotateAngleX + (float)Math.toRadians(-52.53039), backlegleft3.rotateAngleY + (float)Math.toRadians(-35.2604), backlegleft3.rotateAngleZ + (float)Math.toRadians(33.85172));
//        this.setRotateAngle(backlegright1, backlegright1.rotateAngleX + (float)Math.toRadians(32.70538), backlegright1.rotateAngleY + (float)Math.toRadians(-20.10446), backlegright1.rotateAngleZ + (float)Math.toRadians(31.35831));
//        this.setRotateAngle(backlegright2, backlegright2.rotateAngleX + (float)Math.toRadians(18.38), backlegright2.rotateAngleY + (float)Math.toRadians(13.98), backlegright2.rotateAngleZ + (float)Math.toRadians(-32.14));
//        this.setRotateAngle(backlegright3, backlegright3.rotateAngleX + (float)Math.toRadians(-52.53039), backlegright3.rotateAngleY + (float)Math.toRadians(35.2604), backlegright3.rotateAngleZ + (float)Math.toRadians(-33.85172));
//        this.body.offsetY = (float)Math.toRadians(9F);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.body.rotateAngleX = (float) Math.toRadians(90);
        this.body.offsetY = -0.2F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(backlegleft1, 0.0F, -0.5672F, 0.0F);
        this.setRotateAngle(backlegleft2, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(backlegright1, 0.0F, 0.5672F, 0.0F);
        this.setRotateAngle(backlegright2, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.5236F);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -1.5708F);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 1.5708F);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -1.5708F);
        this.setRotateAngle(cube_r17, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.9599F);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.9599F);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6545F);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 1.5708F);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6545F);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -1.5708F);
        this.setRotateAngle(frontlegleft1, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(frontlegleft2, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(frontlegright1, 0.0F, -0.5236F, 0.0F);
        this.setRotateAngle(frontlegright2, 0.0F, 0.5236F, 0.0F);
        this.setRotateAngle(head, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1309F, -0.3927F, 0.0F);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.2618F, 0.0F, 0.0F);

        this.body.offsetY = -0.105F;
        this.body.render(0.01F);
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

        EntityPrehistoricFloraProganochelys entityProganochelys = (EntityPrehistoricFloraProganochelys) e;

        if (entityProganochelys.getAnimation() == entityProganochelys.HIDE_ANIMATION) {
            return;
        }

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};

        if (entityProganochelys.getAnimation() == entityProganochelys.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityProganochelys.isReallyInWater()) {

                if (f3 == 0.0F || !entityProganochelys.getIsMoving()) {
                    if (entityProganochelys.getAnimation() != entityProganochelys.EAT_ANIMATION
                        && entityProganochelys.getAnimation() != entityProganochelys.DRINK_ANIMATION
                        && entityProganochelys.getAnimation() != entityProganochelys.HIDE_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityProganochelys.getIsFast()) { //Running


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

        EntityPrehistoricFloraProganochelys ee = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        if (ee.getAnimation() != ee.HIDE_ANIMATION) {
            if (!ee.isReallyInWater()) {
                if (ee.getIsMoving()) {
                    if (ee.getIsFast()) { //Running
                        animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    } else { //Walking
                        animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                    }
                }
            } else {
                //Swimming pose:
                if (!ee.getIsMoving()) { //static in water
                    //
                } else {
                    //moving in water
                    //
                }
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.HIDE_ANIMATION) { //The hiding and unhiding anim
            animHide(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

    }

    public void animHide(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        int animCycle = 155;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 0D) / 120D) * (0D-(0D)));
            yy = -2.5D + (((tickAnim - 0D) / 120D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 0D) / 120D) * (0D-(0D)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 0D + (((tickAnim - 120D) / 35D) * (0D-(0D)));
            yy = -2.5D + (((tickAnim - 120D) / 35D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 120D) / 35D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 5D + (((tickAnim - 0D) / 20D) * (5D-(5D)));
            yy = -2.5D + (((tickAnim - 0D) / 20D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 0D) / 20D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 5D + (((tickAnim - 20D) / 100D) * (5D-(5D)));
            yy = -2.5D + (((tickAnim - 20D) / 100D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 20D) / 100D) * (0D-(0D)));
        }
        else if (tickAnim >= 120 && tickAnim < 155) {
            xx = 5D + (((tickAnim - 120D) / 35D) * (5D-(5D)));
            yy = -2.5D + (((tickAnim - 120D) / 35D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 120D) / 35D) * (0D-(0D)));
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 5D + (((tickAnim - 0D) / 4D) * (1.61578D-(5D)));
            yy = -2.5D + (((tickAnim - 0D) / 4D) * (-49.5654D-(-2.5D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (-4.44219D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 20) {
            xx = 1.61578D + (((tickAnim - 4D) / 16D) * (0.33569D-(1.61578D)));
            yy = -49.5654D + (((tickAnim - 4D) / 16D) * (-54.46503D-(-49.5654D)));
            zz = -4.44219D + (((tickAnim - 4D) / 16D) * (-2.81959D-(-4.44219D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0.33569D + (((tickAnim - 20D) / 100D) * (0.33569D-(0.33569D)));
            yy = -54.46503D + (((tickAnim - 20D) / 100D) * (-54.46503D-(-54.46503D)));
            zz = -2.81959D + (((tickAnim - 20D) / 100D) * (-2.81959D-(-2.81959D)));
        }
        else if (tickAnim >= 120 && tickAnim < 145) {
            xx = 0.33569D + (((tickAnim - 120D) / 25D) * (4.66691D-(0.33569D)));
            yy = -54.46503D + (((tickAnim - 120D) / 25D) * (4.95426D-(-54.46503D)));
            zz = -2.81959D + (((tickAnim - 120D) / 25D) * (4.9378D-(-2.81959D)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 4.66691D + (((tickAnim - 145D) / 5D) * (4.44148D-(4.66691D)));
            yy = 4.95426D + (((tickAnim - 145D) / 5D) * (-13.63874D-(4.95426D)));
            zz = 4.9378D + (((tickAnim - 145D) / 5D) * (0.54269D-(4.9378D)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = 4.44148D + (((tickAnim - 150D) / 5D) * (5D-(4.44148D)));
            yy = -13.63874D + (((tickAnim - 150D) / 5D) * (-2.5D-(-13.63874D)));
            zz = 0.54269D + (((tickAnim - 150D) / 5D) * (0D-(0.54269D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5.02626D + (((tickAnim - 0D) / 8D) * (4.51167D-(5.02626D)));
            yy = -7.32962D + (((tickAnim - 0D) / 8D) * (-34.79984D-(-7.32962D)));
            zz = -1.29649D + (((tickAnim - 0D) / 8D) * (0.09424D-(-1.29649D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 4.51167D + (((tickAnim - 8D) / 12D) * (4.30617D-(4.51167D)));
            yy = -34.79984D + (((tickAnim - 8D) / 12D) * (-39.79258D-(-34.79984D)));
            zz = 0.09424D + (((tickAnim - 8D) / 12D) * (0.43306D-(0.09424D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 4.30617D + (((tickAnim - 20D) / 100D) * (4.30617D-(4.30617D)));
            yy = -39.79258D + (((tickAnim - 20D) / 100D) * (-39.79258D-(-39.79258D)));
            zz = 0.43306D + (((tickAnim - 20D) / 100D) * (0.43306D-(0.43306D)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 4.30617D + (((tickAnim - 120D) / 15D) * (5.20536D-(4.30617D)));
            yy = -39.79258D + (((tickAnim - 120D) / 15D) * (-16.76297D-(-39.79258D)));
            zz = 0.43306D + (((tickAnim - 120D) / 15D) * (2.58702D-(0.43306D)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 5.20536D + (((tickAnim - 135D) / 10D) * (7.68964D-(5.20536D)));
            yy = -16.76297D + (((tickAnim - 135D) / 10D) * (6.93751D-(-16.76297D)));
            zz = 2.58702D + (((tickAnim - 135D) / 10D) * (8.42848D-(2.58702D)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 7.68964D + (((tickAnim - 145D) / 5D) * (8.48863D-(7.68964D)));
            yy = 6.93751D + (((tickAnim - 145D) / 5D) * (20.29022D-(6.93751D)));
            zz = 8.42848D + (((tickAnim - 145D) / 5D) * (8.71408D-(8.42848D)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = 8.48863D + (((tickAnim - 150D) / 5D) * (5.02626D-(8.48863D)));
            yy = 20.29022D + (((tickAnim - 150D) / 5D) * (-7.32962D-(20.29022D)));
            zz = 8.71408D + (((tickAnim - 150D) / 5D) * (-1.29649D-(8.71408D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 4.97747D + (((tickAnim - 0D) / 13D) * (7.14431D-(4.97747D)));
            yy = -7.26937D + (((tickAnim - 0D) / 13D) * (-25.96101D-(-7.26937D)));
            zz = -1.49939D + (((tickAnim - 0D) / 13D) * (-8.96701D-(-1.49939D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 7.14431D + (((tickAnim - 13D) / 7D) * (8.18094D-(7.14431D)));
            yy = -25.96101D + (((tickAnim - 13D) / 7D) * (-30.57558D-(-25.96101D)));
            zz = -8.96701D + (((tickAnim - 13D) / 7D) * (-11.15384D-(-8.96701D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 8.18094D + (((tickAnim - 20D) / 100D) * (8.18094D-(8.18094D)));
            yy = -30.57558D + (((tickAnim - 20D) / 100D) * (-30.57558D-(-30.57558D)));
            zz = -11.15384D + (((tickAnim - 20D) / 100D) * (-11.15384D-(-11.15384D)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 8.18094D + (((tickAnim - 120D) / 15D) * (3.8359D-(8.18094D)));
            yy = -30.57558D + (((tickAnim - 120D) / 15D) * (-30.86277D-(-30.57558D)));
            zz = -11.15384D + (((tickAnim - 120D) / 15D) * (-8.0283D-(-11.15384D)));
        }
        else if (tickAnim >= 135 && tickAnim < 145) {
            xx = 3.8359D + (((tickAnim - 135D) / 10D) * (3.02218D-(3.8359D)));
            yy = -30.86277D + (((tickAnim - 135D) / 10D) * (-2.24666D-(-30.86277D)));
            zz = -8.0283D + (((tickAnim - 135D) / 10D) * (0.63983D-(-8.0283D)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = 3.02218D + (((tickAnim - 145D) / 5D) * (7.82805D-(3.02218D)));
            yy = -2.24666D + (((tickAnim - 145D) / 5D) * (18.8053D-(-2.24666D)));
            zz = 0.63983D + (((tickAnim - 145D) / 5D) * (7.71137D-(0.63983D)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = 7.82805D + (((tickAnim - 150D) / 5D) * (4.97747D-(7.82805D)));
            yy = 18.8053D + (((tickAnim - 150D) / 5D) * (-7.26937D-(18.8053D)));
            zz = 7.71137D + (((tickAnim - 150D) / 5D) * (-1.49939D-(7.71137D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.94817D + (((tickAnim - 0D) / 3D) * (47.07117D-(-3.94817D)));
            yy = 15.03973D + (((tickAnim - 0D) / 3D) * (0.873D-(15.03973D)));
            zz = -39.88622D + (((tickAnim - 0D) / 3D) * (-23.95232D-(-39.88622D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 47.07117D + (((tickAnim - 3D) / 2D) * (46.33083D-(47.07117D)));
            yy = 0.873D + (((tickAnim - 3D) / 2D) * (-6.21037D-(0.873D)));
            zz = -23.95232D + (((tickAnim - 3D) / 2D) * (-15.98538D-(-23.95232D)));
        }
        else if (tickAnim >= 5 && tickAnim < 127) {
            xx = 46.33083D + (((tickAnim - 5D) / 122D) * (46.33D-(46.33083D)));
            yy = -6.21037D + (((tickAnim - 5D) / 122D) * (-6.21D-(-6.21037D)));
            zz = -15.98538D + (((tickAnim - 5D) / 122D) * (-15.99D-(-15.98538D)));
        }
        else if (tickAnim >= 127 && tickAnim < 133) {
            xx = 46.33D + (((tickAnim - 127D) / 6D) * (46.33083D-(46.33D)));
            yy = -6.21D + (((tickAnim - 127D) / 6D) * (-6.21037D-(-6.21D)));
            zz = -15.99D + (((tickAnim - 127D) / 6D) * (-15.98538D-(-15.99D)));
        }
        else if (tickAnim >= 133 && tickAnim < 148) {
            xx = 46.33083D + (((tickAnim - 133D) / 15D) * (-25.61497D-(46.33083D)));
            yy = -6.21037D + (((tickAnim - 133D) / 15D) * (8.89488D-(-6.21037D)));
            zz = -15.98538D + (((tickAnim - 133D) / 15D) * (-83.37629D-(-15.98538D)));
        }
        else if (tickAnim >= 148 && tickAnim < 153) {
            xx = -25.61497D + (((tickAnim - 148D) / 5D) * (-3.94817D-(-25.61497D)));
            yy = 8.89488D + (((tickAnim - 148D) / 5D) * (15.03973D-(8.89488D)));
            zz = -83.37629D + (((tickAnim - 148D) / 5D) * (-39.88622D-(-83.37629D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontlegleft1, frontlegleft1.rotateAngleX + (float) Math.toRadians(xx), frontlegleft1.rotateAngleY + (float) Math.toRadians(yy), frontlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37.26601D + (((tickAnim - 0D) / 5D) * (29.66473D-(37.26601D)));
            yy = -15.5544D + (((tickAnim - 0D) / 5D) * (-3.35746D-(-15.5544D)));
            zz = 1.65994D + (((tickAnim - 0D) / 5D) * (-11.50469D-(1.65994D)));
        }
        else if (tickAnim >= 5 && tickAnim < 127) {
            xx = 29.66473D + (((tickAnim - 5D) / 122D) * (30.79D-(29.66473D)));
            yy = -3.35746D + (((tickAnim - 5D) / 122D) * (-5.6D-(-3.35746D)));
            zz = -11.50469D + (((tickAnim - 5D) / 122D) * (-7.66D-(-11.50469D)));
        }
        else if (tickAnim >= 127 && tickAnim < 132) {
            xx = 30.79D + (((tickAnim - 127D) / 5D) * (30.78614D-(30.79D)));
            yy = -5.6D + (((tickAnim - 127D) / 5D) * (-5.59928D-(-5.6D)));
            zz = -7.66D + (((tickAnim - 127D) / 5D) * (-7.66033D-(-7.66D)));
        }
        else if (tickAnim >= 132 && tickAnim < 152) {
            xx = 30.78614D + (((tickAnim - 132D) / 20D) * (37.26601D-(30.78614D)));
            yy = -5.59928D + (((tickAnim - 132D) / 20D) * (-15.5544D-(-5.59928D)));
            zz = -7.66033D + (((tickAnim - 132D) / 20D) * (1.65994D-(-7.66033D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontlegleft2, frontlegleft2.rotateAngleX + (float) Math.toRadians(xx), frontlegleft2.rotateAngleY + (float) Math.toRadians(yy), frontlegleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -28.13333D + (((tickAnim - 0D) / 3D) * (-37.39559D-(-28.13333D)));
            yy = -0.93243D + (((tickAnim - 0D) / 3D) * (-1.22918D-(-0.93243D)));
            zz = 41.44671D + (((tickAnim - 0D) / 3D) * (28.24599D-(41.44671D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.39559D + (((tickAnim - 3D) / 2D) * (111.72329D-(-37.39559D)));
            yy = -1.22918D + (((tickAnim - 3D) / 2D) * (-1.37755D-(-1.22918D)));
            zz = 28.24599D + (((tickAnim - 3D) / 2D) * (21.64563D-(28.24599D)));
        }
        else if (tickAnim >= 5 && tickAnim < 127) {
            xx = 111.72329D + (((tickAnim - 5D) / 122D) * (111.72D-(111.72329D)));
            yy = -1.37755D + (((tickAnim - 5D) / 122D) * (-1.38D-(-1.37755D)));
            zz = 21.64563D + (((tickAnim - 5D) / 122D) * (21.65D-(21.64563D)));
        }
        else if (tickAnim >= 127 && tickAnim < 130) {
            xx = 111.72D + (((tickAnim - 127D) / 3D) * (111.72329D-(111.72D)));
            yy = -1.38D + (((tickAnim - 127D) / 3D) * (-1.37755D-(-1.38D)));
            zz = 21.65D + (((tickAnim - 127D) / 3D) * (21.64563D-(21.65D)));
        }
        else if (tickAnim >= 130 && tickAnim < 147) {
            xx = 111.72329D + (((tickAnim - 130D) / 17D) * (110.14026D-(111.72329D)));
            yy = -1.37755D + (((tickAnim - 130D) / 17D) * (-1.1179D-(-1.37755D)));
            zz = 21.64563D + (((tickAnim - 130D) / 17D) * (33.19626D-(21.64563D)));
        }
        else if (tickAnim >= 147 && tickAnim < 150) {
            xx = 110.14026D + (((tickAnim - 147D) / 3D) * (-28.13333D-(110.14026D)));
            yy = -1.1179D + (((tickAnim - 147D) / 3D) * (-0.93243D-(-1.1179D)));
            zz = 33.19626D + (((tickAnim - 147D) / 3D) * (41.44671D-(33.19626D)));
        }
        else if (tickAnim >= 150 && tickAnim < 153) {
            xx = -28.13333D + (((tickAnim - 150D) / 3D) * (-35.63333D-(-28.13333D)));
            yy = -0.93243D + (((tickAnim - 150D) / 3D) * (-0.93243D-(-0.93243D)));
            zz = 41.44671D + (((tickAnim - 150D) / 3D) * (41.44671D-(41.44671D)));
        }
        else if (tickAnim >= 153 && tickAnim < 155) {
            xx = -35.63333D + (((tickAnim - 153D) / 2D) * (-28.13333D-(-35.63333D)));
            yy = -0.93243D + (((tickAnim - 153D) / 2D) * (-0.93243D-(-0.93243D)));
            zz = 41.44671D + (((tickAnim - 153D) / 2D) * (41.44671D-(41.44671D)));
        }
        this.setRotateAngle(frontlegleft3, frontlegleft3.rotateAngleX + (float) Math.toRadians(xx), frontlegleft3.rotateAngleY + (float) Math.toRadians(yy), frontlegleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.94817D + (((tickAnim - 0D) / 3D) * (47.07117D-(-3.94817D)));
            yy = -15.03973D + (((tickAnim - 0D) / 3D) * (-0.873D-(-15.03973D)));
            zz = 39.88622D + (((tickAnim - 0D) / 3D) * (23.95232D-(39.88622D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 47.07117D + (((tickAnim - 3D) / 2D) * (46.33083D-(47.07117D)));
            yy = -0.873D + (((tickAnim - 3D) / 2D) * (6.21037D-(-0.873D)));
            zz = 23.95232D + (((tickAnim - 3D) / 2D) * (15.98538D-(23.95232D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 46.33083D + (((tickAnim - 5D) / 115D) * (46.33D-(46.33083D)));
            yy = 6.21037D + (((tickAnim - 5D) / 115D) * (6.21D-(6.21037D)));
            zz = 15.98538D + (((tickAnim - 5D) / 115D) * (15.99D-(15.98538D)));
        }
        else if (tickAnim >= 120 && tickAnim < 127) {
            xx = 46.33D + (((tickAnim - 120D) / 7D) * (46.33083D-(46.33D)));
            yy = 6.21D + (((tickAnim - 120D) / 7D) * (6.21037D-(6.21D)));
            zz = 15.99D + (((tickAnim - 120D) / 7D) * (15.98538D-(15.99D)));
        }
        else if (tickAnim >= 127 && tickAnim < 142) {
            xx = 46.33083D + (((tickAnim - 127D) / 15D) * (-25.61497D-(46.33083D)));
            yy = 6.21037D + (((tickAnim - 127D) / 15D) * (-8.89488D-(6.21037D)));
            zz = 15.98538D + (((tickAnim - 127D) / 15D) * (83.37629D-(15.98538D)));
        }
        else if (tickAnim >= 142 && tickAnim < 147) {
            xx = -25.61497D + (((tickAnim - 142D) / 5D) * (-3.94817D-(-25.61497D)));
            yy = -8.89488D + (((tickAnim - 142D) / 5D) * (-15.03973D-(-8.89488D)));
            zz = 83.37629D + (((tickAnim - 142D) / 5D) * (39.88622D-(83.37629D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontlegright1, frontlegright1.rotateAngleX + (float) Math.toRadians(xx), frontlegright1.rotateAngleY + (float) Math.toRadians(yy), frontlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 37.26601D + (((tickAnim - 0D) / 5D) * (30.78614D-(37.26601D)));
            yy = 15.5544D + (((tickAnim - 0D) / 5D) * (5.59928D-(15.5544D)));
            zz = -1.65994D + (((tickAnim - 0D) / 5D) * (7.66033D-(-1.65994D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 30.78614D + (((tickAnim - 5D) / 115D) * (30.79D-(30.78614D)));
            yy = 5.59928D + (((tickAnim - 5D) / 115D) * (5.6D-(5.59928D)));
            zz = 7.66033D + (((tickAnim - 5D) / 115D) * (7.66D-(7.66033D)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 30.79D + (((tickAnim - 120D) / 5D) * (30.78614D-(30.79D)));
            yy = 5.6D + (((tickAnim - 120D) / 5D) * (5.59928D-(5.6D)));
            zz = 7.66D + (((tickAnim - 120D) / 5D) * (7.66033D-(7.66D)));
        }
        else if (tickAnim >= 125 && tickAnim < 145) {
            xx = 30.78614D + (((tickAnim - 125D) / 20D) * (37.26601D-(30.78614D)));
            yy = 5.59928D + (((tickAnim - 125D) / 20D) * (15.5544D-(5.59928D)));
            zz = 7.66033D + (((tickAnim - 125D) / 20D) * (-1.65994D-(7.66033D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontlegright2, frontlegright2.rotateAngleX + (float) Math.toRadians(xx), frontlegright2.rotateAngleY + (float) Math.toRadians(yy), frontlegright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -28.13333D + (((tickAnim - 0D) / 3D) * (-37.39559D-(-28.13333D)));
            yy = 0.93243D + (((tickAnim - 0D) / 3D) * (1.22918D-(0.93243D)));
            zz = -41.44671D + (((tickAnim - 0D) / 3D) * (-28.24599D-(-41.44671D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.39559D + (((tickAnim - 3D) / 2D) * (111.72329D-(-37.39559D)));
            yy = 1.22918D + (((tickAnim - 3D) / 2D) * (1.37755D-(1.22918D)));
            zz = -28.24599D + (((tickAnim - 3D) / 2D) * (-21.64563D-(-28.24599D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 111.72329D + (((tickAnim - 5D) / 115D) * (111.72D-(111.72329D)));
            yy = 1.37755D + (((tickAnim - 5D) / 115D) * (1.38D-(1.37755D)));
            zz = -21.64563D + (((tickAnim - 5D) / 115D) * (-21.65D-(-21.64563D)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = 111.72D + (((tickAnim - 120D) / 3D) * (111.72329D-(111.72D)));
            yy = 1.38D + (((tickAnim - 120D) / 3D) * (1.37755D-(1.38D)));
            zz = -21.65D + (((tickAnim - 120D) / 3D) * (-21.64563D-(-21.65D)));
        }
        else if (tickAnim >= 123 && tickAnim < 140) {
            xx = 111.72329D + (((tickAnim - 123D) / 17D) * (110.14026D-(111.72329D)));
            yy = 1.37755D + (((tickAnim - 123D) / 17D) * (1.1179D-(1.37755D)));
            zz = -21.64563D + (((tickAnim - 123D) / 17D) * (-33.19626D-(-21.64563D)));
        }
        else if (tickAnim >= 140 && tickAnim < 143) {
            xx = 110.14026D + (((tickAnim - 140D) / 3D) * (-28.13333D-(110.14026D)));
            yy = 1.1179D + (((tickAnim - 140D) / 3D) * (0.93243D-(1.1179D)));
            zz = -33.19626D + (((tickAnim - 140D) / 3D) * (-41.44671D-(-33.19626D)));
        }
        else if (tickAnim >= 143 && tickAnim < 147) {
            xx = -28.13333D + (((tickAnim - 143D) / 4D) * (-35.63333D-(-28.13333D)));
            yy = 0.93243D + (((tickAnim - 143D) / 4D) * (0.93243D-(0.93243D)));
            zz = -41.44671D + (((tickAnim - 143D) / 4D) * (-41.44671D-(-41.44671D)));
        }
        else if (tickAnim >= 147 && tickAnim < 148) {
            xx = -35.63333D + (((tickAnim - 147D) / 1D) * (-28.13333D-(-35.63333D)));
            yy = 0.93243D + (((tickAnim - 147D) / 1D) * (0.93243D-(0.93243D)));
            zz = -41.44671D + (((tickAnim - 147D) / 1D) * (-41.44671D-(-41.44671D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontlegright3, frontlegright3.rotateAngleX + (float) Math.toRadians(xx), frontlegright3.rotateAngleY + (float) Math.toRadians(yy), frontlegright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.70538D + (((tickAnim - 0D) / 5D) * (60.08407D-(32.70538D)));
            yy = 20.10446D + (((tickAnim - 0D) / 5D) * (79.79583D-(20.10446D)));
            zz = -31.35831D + (((tickAnim - 0D) / 5D) * (-21.14131D-(-31.35831D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 60.08407D + (((tickAnim - 5D) / 115D) * (60.08407D-(60.08407D)));
            yy = 79.79583D + (((tickAnim - 5D) / 115D) * (79.79583D-(79.79583D)));
            zz = -21.14131D + (((tickAnim - 5D) / 115D) * (-21.14131D-(-21.14131D)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 60.08407D + (((tickAnim - 120D) / 15D) * (60.08407D-(60.08407D)));
            yy = 79.79583D + (((tickAnim - 120D) / 15D) * (79.79583D-(79.79583D)));
            zz = -21.14131D + (((tickAnim - 120D) / 15D) * (-21.14131D-(-21.14131D)));
        }
        else if (tickAnim >= 135 && tickAnim < 146) {
            xx = 60.08407D + (((tickAnim - 135D) / 11D) * (32.70538D-(60.08407D)));
            yy = 79.79583D + (((tickAnim - 135D) / 11D) * (20.10446D-(79.79583D)));
            zz = -21.14131D + (((tickAnim - 135D) / 11D) * (-31.35831D-(-21.14131D)));
        }
        else if (tickAnim >= 146 && tickAnim < 155) {
            xx = 32.70538D + (((tickAnim - 146D) / 9D) * (32.70538D-(32.70538D)));
            yy = 20.10446D + (((tickAnim - 146D) / 9D) * (20.10446D-(20.10446D)));
            zz = -31.35831D + (((tickAnim - 146D) / 9D) * (-31.35831D-(-31.35831D)));
        }
        this.setRotateAngle(backlegleft1, backlegleft1.rotateAngleX + (float) Math.toRadians(xx), backlegleft1.rotateAngleY + (float) Math.toRadians(yy), backlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.38D + (((tickAnim - 0D) / 5D) * (2.74724D-(18.38D)));
            yy = -13.98D + (((tickAnim - 0D) / 5D) * (-27.73135D-(-13.98D)));
            zz = 32.14D + (((tickAnim - 0D) / 5D) * (72.45634D-(32.14D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 2.74724D + (((tickAnim - 5D) / 115D) * (2.74724D-(2.74724D)));
            yy = -27.73135D + (((tickAnim - 5D) / 115D) * (-27.73135D-(-27.73135D)));
            zz = 72.45634D + (((tickAnim - 5D) / 115D) * (72.45634D-(72.45634D)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 2.74724D + (((tickAnim - 120D) / 12D) * (2.74724D-(2.74724D)));
            yy = -27.73135D + (((tickAnim - 120D) / 12D) * (-27.73135D-(-27.73135D)));
            zz = 72.45634D + (((tickAnim - 120D) / 12D) * (72.45634D-(72.45634D)));
        }
        else if (tickAnim >= 132 && tickAnim < 143) {
            xx = 2.74724D + (((tickAnim - 132D) / 11D) * (18.38D-(2.74724D)));
            yy = -27.73135D + (((tickAnim - 132D) / 11D) * (-13.98D-(-27.73135D)));
            zz = 72.45634D + (((tickAnim - 132D) / 11D) * (32.14D-(72.45634D)));
        }
        else if (tickAnim >= 143 && tickAnim < 155) {
            xx = 18.38D + (((tickAnim - 143D) / 12D) * (18.38D-(18.38D)));
            yy = -13.98D + (((tickAnim - 143D) / 12D) * (-13.98D-(-13.98D)));
            zz = 32.14D + (((tickAnim - 143D) / 12D) * (32.14D-(32.14D)));
        }
        this.setRotateAngle(backlegleft2, backlegleft2.rotateAngleX + (float) Math.toRadians(xx), backlegleft2.rotateAngleY + (float) Math.toRadians(yy), backlegleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -52.53039D + (((tickAnim - 0D) / 5D) * (-70.99959D-(-52.53039D)));
            yy = -35.2604D + (((tickAnim - 0D) / 5D) * (-49.62189D-(-35.2604D)));
            zz = 33.85172D + (((tickAnim - 0D) / 5D) * (27.92836D-(33.85172D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = -70.99959D + (((tickAnim - 5D) / 115D) * (-70.99959D-(-70.99959D)));
            yy = -49.62189D + (((tickAnim - 5D) / 115D) * (-49.62189D-(-49.62189D)));
            zz = 27.92836D + (((tickAnim - 5D) / 115D) * (27.92836D-(27.92836D)));
        }
        else if (tickAnim >= 120 && tickAnim < 128) {
            xx = -70.99959D + (((tickAnim - 120D) / 8D) * (-70.99959D-(-70.99959D)));
            yy = -49.62189D + (((tickAnim - 120D) / 8D) * (-49.62189D-(-49.62189D)));
            zz = 27.92836D + (((tickAnim - 120D) / 8D) * (27.92836D-(27.92836D)));
        }
        else if (tickAnim >= 128 && tickAnim < 139) {
            xx = -70.99959D + (((tickAnim - 128D) / 11D) * (-67.53039D-(-70.99959D)));
            yy = -49.62189D + (((tickAnim - 128D) / 11D) * (-35.2604D-(-49.62189D)));
            zz = 27.92836D + (((tickAnim - 128D) / 11D) * (33.85172D-(27.92836D)));
        }
        else if (tickAnim >= 139 && tickAnim < 146) {
            xx = -67.53039D + (((tickAnim - 139D) / 7D) * (-52.53039D-(-67.53039D)));
            yy = -35.2604D + (((tickAnim - 139D) / 7D) * (-35.2604D-(-35.2604D)));
            zz = 33.85172D + (((tickAnim - 139D) / 7D) * (33.85172D-(33.85172D)));
        }
        else if (tickAnim >= 146 && tickAnim < 155) {
            xx = -52.53039D + (((tickAnim - 146D) / 9D) * (-52.53039D-(-52.53039D)));
            yy = -35.2604D + (((tickAnim - 146D) / 9D) * (-35.2604D-(-35.2604D)));
            zz = 33.85172D + (((tickAnim - 146D) / 9D) * (33.85172D-(33.85172D)));
        }
        this.setRotateAngle(backlegleft3, backlegleft3.rotateAngleX + (float) Math.toRadians(xx), backlegleft3.rotateAngleY + (float) Math.toRadians(yy), backlegleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 32.70538D + (((tickAnim - 0D) / 5D) * (60.08407D-(32.70538D)));
            yy = -20.10446D + (((tickAnim - 0D) / 5D) * (-79.79583D-(-20.10446D)));
            zz = 31.35831D + (((tickAnim - 0D) / 5D) * (21.14131D-(31.35831D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 60.08407D + (((tickAnim - 5D) / 115D) * (60.08407D-(60.08407D)));
            yy = -79.79583D + (((tickAnim - 5D) / 115D) * (-79.79583D-(-79.79583D)));
            zz = 21.14131D + (((tickAnim - 5D) / 115D) * (21.14131D-(21.14131D)));
        }
        else if (tickAnim >= 120 && tickAnim < 130) {
            xx = 60.08407D + (((tickAnim - 120D) / 10D) * (60.08407D-(60.08407D)));
            yy = -79.79583D + (((tickAnim - 120D) / 10D) * (-79.79583D-(-79.79583D)));
            zz = 21.14131D + (((tickAnim - 120D) / 10D) * (21.14131D-(21.14131D)));
        }
        else if (tickAnim >= 130 && tickAnim < 141) {
            xx = 60.08407D + (((tickAnim - 130D) / 11D) * (32.70538D-(60.08407D)));
            yy = -79.79583D + (((tickAnim - 130D) / 11D) * (-20.10446D-(-79.79583D)));
            zz = 21.14131D + (((tickAnim - 130D) / 11D) * (31.35831D-(21.14131D)));
        }
        else if (tickAnim >= 141 && tickAnim < 155) {
            xx = 32.70538D + (((tickAnim - 141D) / 14D) * (32.70538D-(32.70538D)));
            yy = -20.10446D + (((tickAnim - 141D) / 14D) * (-20.10446D-(-20.10446D)));
            zz = 31.35831D + (((tickAnim - 141D) / 14D) * (31.35831D-(31.35831D)));
        }
        this.setRotateAngle(backlegright1, backlegright1.rotateAngleX + (float) Math.toRadians(xx), backlegright1.rotateAngleY + (float) Math.toRadians(yy), backlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 18.38D + (((tickAnim - 0D) / 5D) * (2.74724D-(18.38D)));
            yy = 13.98D + (((tickAnim - 0D) / 5D) * (27.73135D-(13.98D)));
            zz = -32.14D + (((tickAnim - 0D) / 5D) * (-72.45634D-(-32.14D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = 2.74724D + (((tickAnim - 5D) / 115D) * (2.74724D-(2.74724D)));
            yy = 27.73135D + (((tickAnim - 5D) / 115D) * (27.73135D-(27.73135D)));
            zz = -72.45634D + (((tickAnim - 5D) / 115D) * (-72.45634D-(-72.45634D)));
        }
        else if (tickAnim >= 120 && tickAnim < 127) {
            xx = 2.74724D + (((tickAnim - 120D) / 7D) * (2.74724D-(2.74724D)));
            yy = 27.73135D + (((tickAnim - 120D) / 7D) * (27.73135D-(27.73135D)));
            zz = -72.45634D + (((tickAnim - 120D) / 7D) * (-72.45634D-(-72.45634D)));
        }
        else if (tickAnim >= 127 && tickAnim < 138) {
            xx = 2.74724D + (((tickAnim - 127D) / 11D) * (18.38D-(2.74724D)));
            yy = 27.73135D + (((tickAnim - 127D) / 11D) * (13.98D-(27.73135D)));
            zz = -72.45634D + (((tickAnim - 127D) / 11D) * (-32.14D-(-72.45634D)));
        }
        else if (tickAnim >= 138 && tickAnim < 155) {
            xx = 18.38D + (((tickAnim - 138D) / 17D) * (18.38D-(18.38D)));
            yy = 13.98D + (((tickAnim - 138D) / 17D) * (13.98D-(13.98D)));
            zz = -32.14D + (((tickAnim - 138D) / 17D) * (-32.14D-(-32.14D)));
        }
        this.setRotateAngle(backlegright2, backlegright2.rotateAngleX + (float) Math.toRadians(xx), backlegright2.rotateAngleY + (float) Math.toRadians(yy), backlegright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -52.53039D + (((tickAnim - 0D) / 5D) * (-70.99959D-(-52.53039D)));
            yy = 35.2604D + (((tickAnim - 0D) / 5D) * (49.62189D-(35.2604D)));
            zz = -33.85172D + (((tickAnim - 0D) / 5D) * (-27.92836D-(-33.85172D)));
        }
        else if (tickAnim >= 5 && tickAnim < 120) {
            xx = -70.99959D + (((tickAnim - 5D) / 115D) * (-70.99959D-(-70.99959D)));
            yy = 49.62189D + (((tickAnim - 5D) / 115D) * (49.62189D-(49.62189D)));
            zz = -27.92836D + (((tickAnim - 5D) / 115D) * (-27.92836D-(-27.92836D)));
        }
        else if (tickAnim >= 120 && tickAnim < 123) {
            xx = -70.99959D + (((tickAnim - 120D) / 3D) * (-70.99959D-(-70.99959D)));
            yy = 49.62189D + (((tickAnim - 120D) / 3D) * (49.62189D-(49.62189D)));
            zz = -27.92836D + (((tickAnim - 120D) / 3D) * (-27.92836D-(-27.92836D)));
        }
        else if (tickAnim >= 123 && tickAnim < 134) {
            xx = -70.99959D + (((tickAnim - 123D) / 11D) * (-67.53039D-(-70.99959D)));
            yy = 49.62189D + (((tickAnim - 123D) / 11D) * (35.2604D-(49.62189D)));
            zz = -27.92836D + (((tickAnim - 123D) / 11D) * (-33.85172D-(-27.92836D)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = -67.53039D + (((tickAnim - 134D) / 7D) * (-52.53039D-(-67.53039D)));
            yy = 35.2604D + (((tickAnim - 134D) / 7D) * (35.2604D-(35.2604D)));
            zz = -33.85172D + (((tickAnim - 134D) / 7D) * (-33.85172D-(-33.85172D)));
        }
        else if (tickAnim >= 141 && tickAnim < 155) {
            xx = -52.53039D + (((tickAnim - 141D) / 14D) * (-52.53039D-(-52.53039D)));
            yy = 35.2604D + (((tickAnim - 141D) / 14D) * (35.2604D-(35.2604D)));
            zz = -33.85172D + (((tickAnim - 141D) / 14D) * (-33.85172D-(-33.85172D)));
        }
        this.setRotateAngle(backlegright3, backlegright3.rotateAngleX + (float) Math.toRadians(xx), backlegright3.rotateAngleY + (float) Math.toRadians(yy), backlegright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (-15.51203D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (29.41532D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (-25.95389D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 20) {
            xx = -15.51203D + (((tickAnim - 4D) / 16D) * (-16.36452D-(-15.51203D)));
            yy = 29.41532D + (((tickAnim - 4D) / 16D) * (34.22348D-(29.41532D)));
            zz = -25.95389D + (((tickAnim - 4D) / 16D) * (-27.56928D-(-25.95389D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = -16.36452D + (((tickAnim - 20D) / 100D) * (-16.36452D-(-16.36452D)));
            yy = 34.22348D + (((tickAnim - 20D) / 100D) * (34.22348D-(34.22348D)));
            zz = -27.56928D + (((tickAnim - 20D) / 100D) * (-27.56928D-(-27.56928D)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = -16.36452D + (((tickAnim - 120D) / 15D) * (-5.66935D-(-16.36452D)));
            yy = 34.22348D + (((tickAnim - 120D) / 15D) * (16.23503D-(34.22348D)));
            zz = -27.56928D + (((tickAnim - 120D) / 15D) * (-2.05415D-(-27.56928D)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = -5.66935D + (((tickAnim - 135D) / 13D) * (-5.35952D-(-5.66935D)));
            yy = 16.23503D + (((tickAnim - 135D) / 13D) * (5.21972D-(16.23503D)));
            zz = -2.05415D + (((tickAnim - 135D) / 13D) * (-0.53749D-(-2.05415D)));
        }
        else if (tickAnim >= 148 && tickAnim < 155) {
            xx = -5.35952D + (((tickAnim - 148D) / 7D) * (0D-(-5.35952D)));
            yy = 5.21972D + (((tickAnim - 148D) / 7D) * (0D-(5.21972D)));
            zz = -0.53749D + (((tickAnim - 148D) / 7D) * (0D-(-0.53749D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (6.12771D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (54.73616D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (8.54967D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 6.12771D + (((tickAnim - 8D) / 12D) * (0D-(6.12771D)));
            yy = 54.73616D + (((tickAnim - 8D) / 12D) * (42.5D-(54.73616D)));
            zz = 8.54967D + (((tickAnim - 8D) / 12D) * (0D-(8.54967D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0D + (((tickAnim - 20D) / 100D) * (0D-(0D)));
            yy = 42.5D + (((tickAnim - 20D) / 100D) * (42.5D-(42.5D)));
            zz = 0D + (((tickAnim - 20D) / 100D) * (0D-(0D)));
        }
        else if (tickAnim >= 120 && tickAnim < 128) {
            xx = 0D + (((tickAnim - 120D) / 8D) * (0D-(0D)));
            yy = 42.5D + (((tickAnim - 120D) / 8D) * (-11.51D-(42.5D)));
            zz = 0D + (((tickAnim - 120D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 128 && tickAnim < 135) {
            xx = 0D + (((tickAnim - 128D) / 7D) * (12.99239D-(0D)));
            yy = -11.51D + (((tickAnim - 128D) / 7D) * (-19.98164D-(-11.51D)));
            zz = 0D + (((tickAnim - 128D) / 7D) * (-2.29474D-(0D)));
        }
        else if (tickAnim >= 135 && tickAnim < 148) {
            xx = 12.99239D + (((tickAnim - 135D) / 13D) * (6.66238D-(12.99239D)));
            yy = -19.98164D + (((tickAnim - 135D) / 13D) * (-7.85125D-(-19.98164D)));
            zz = -2.29474D + (((tickAnim - 135D) / 13D) * (-0.86792D-(-2.29474D)));
        }
        else if (tickAnim >= 148 && tickAnim < 155) {
            xx = 6.66238D + (((tickAnim - 148D) / 7D) * (0D-(6.66238D)));
            yy = -7.85125D + (((tickAnim - 148D) / 7D) * (0D-(-7.85125D)));
            zz = -0.86792D + (((tickAnim - 148D) / 7D) * (0D-(-0.86792D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 8D) / 5D) * (36.5D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 36.5D + (((tickAnim - 13D) / 7D) * (31.5D-(36.5D)));
            yy = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 31.5D + (((tickAnim - 20D) / 100D) * (31.5D-(31.5D)));
            yy = 0D + (((tickAnim - 20D) / 100D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 100D) * (0D-(0D)));
        }
        else if (tickAnim >= 120 && tickAnim < 132) {
            xx = 31.5D + (((tickAnim - 120D) / 12D) * (0D-(31.5D)));
            yy = 0D + (((tickAnim - 120D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 120D) / 12D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-25.91607D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (2.11021D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (-16.03189D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = -25.91607D + (((tickAnim - 6D) / 5D) * (-10.20855D-(-25.91607D)));
            yy = 2.11021D + (((tickAnim - 6D) / 5D) * (5.40976D-(2.11021D)));
            zz = -16.03189D + (((tickAnim - 6D) / 5D) * (-24.7207D-(-16.03189D)));
        }
        else if (tickAnim >= 11 && tickAnim < 18) {
            xx = -10.20855D + (((tickAnim - 11D) / 7D) * (5.28775D-(-10.20855D)));
            yy = 5.40976D + (((tickAnim - 11D) / 7D) * (5.79735D-(5.40976D)));
            zz = -24.7207D + (((tickAnim - 11D) / 7D) * (-24.99651D-(-24.7207D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 5.28775D + (((tickAnim - 18D) / 3D) * (8.44619D-(5.28775D)));
            yy = 5.79735D + (((tickAnim - 18D) / 3D) * (13.16925D-(5.79735D)));
            zz = -24.99651D + (((tickAnim - 18D) / 3D) * (-25.09866D-(-24.99651D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 8.44619D + (((tickAnim - 21D) / 2D) * (3.3997D-(8.44619D)));
            yy = 13.16925D + (((tickAnim - 21D) / 2D) * (11.10394D-(13.16925D)));
            zz = -25.09866D + (((tickAnim - 21D) / 2D) * (-13.38289D-(-25.09866D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 3.3997D + (((tickAnim - 23D) / 4D) * (-22.15567D-(3.3997D)));
            yy = 11.10394D + (((tickAnim - 23D) / 4D) * (2.66255D-(11.10394D)));
            zz = -13.38289D + (((tickAnim - 23D) / 4D) * (-9.21013D-(-13.38289D)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -22.15567D + (((tickAnim - 27D) / 7D) * (-4.15D-(-22.15567D)));
            yy = 2.66255D + (((tickAnim - 27D) / 7D) * (0.5D-(2.66255D)));
            zz = -9.21013D + (((tickAnim - 27D) / 7D) * (-1.73D-(-9.21013D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -4.15D + (((tickAnim - 34D) / 6D) * (0D-(-4.15D)));
            yy = 0.5D + (((tickAnim - 34D) / 6D) * (0D-(0.5D)));
            zz = -1.73D + (((tickAnim - 34D) / 6D) * (0D-(-1.73D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (36.37345D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (-7.12331D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (-0.43652D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 11) {
            xx = 36.37345D + (((tickAnim - 6D) / 5D) * (11.64952D-(36.37345D)));
            yy = -7.12331D + (((tickAnim - 6D) / 5D) * (-8.87772D-(-7.12331D)));
            zz = -0.43652D + (((tickAnim - 6D) / 5D) * (-9.58098D-(-0.43652D)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 11.64952D + (((tickAnim - 11D) / 3D) * (-0.65004D-(11.64952D)));
            yy = -8.87772D + (((tickAnim - 11D) / 3D) * (-4.35098D-(-8.87772D)));
            zz = -9.58098D + (((tickAnim - 11D) / 3D) * (-24.6947D-(-9.58098D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.65004D + (((tickAnim - 14D) / 4D) * (6.11937D-(-0.65004D)));
            yy = -4.35098D + (((tickAnim - 14D) / 4D) * (-6.00784D-(-4.35098D)));
            zz = -24.6947D + (((tickAnim - 14D) / 4D) * (-24.44267D-(-24.6947D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 6.11937D + (((tickAnim - 18D) / 3D) * (0.51434D-(6.11937D)));
            yy = -6.00784D + (((tickAnim - 18D) / 3D) * (-5.869D-(-6.00784D)));
            zz = -24.44267D + (((tickAnim - 18D) / 3D) * (-10.00685D-(-24.44267D)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.51434D + (((tickAnim - 21D) / 6D) * (47.29232D-(0.51434D)));
            yy = -5.869D + (((tickAnim - 21D) / 6D) * (-3.88687D-(-5.869D)));
            zz = -10.00685D + (((tickAnim - 21D) / 6D) * (-4.94866D-(-10.00685D)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 47.29232D + (((tickAnim - 27D) / 7D) * (8.87D-(47.29232D)));
            yy = -3.88687D + (((tickAnim - 27D) / 7D) * (-0.73D-(-3.88687D)));
            zz = -4.94866D + (((tickAnim - 27D) / 7D) * (-0.93D-(-4.94866D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 8.87D + (((tickAnim - 34D) / 6D) * (0D-(8.87D)));
            yy = -0.73D + (((tickAnim - 34D) / 6D) * (0D-(-0.73D)));
            zz = -0.93D + (((tickAnim - 34D) / 6D) * (0D-(-0.93D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0D + (((tickAnim - 0D) / 11D) * (32.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 32.5D + (((tickAnim - 11D) / 6D) * (27.5D-(32.5D)));
            yy = 0D + (((tickAnim - 11D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 27.5D + (((tickAnim - 17D) / 1D) * (-2.5D-(27.5D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 18D) / 22D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 18D) / 22D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 22D) * (0D-(0D)));
        }
        this.setRotateAngle(lowerjaw, lowerjaw.rotateAngleX + (float) Math.toRadians(xx), lowerjaw.rotateAngleY + (float) Math.toRadians(yy), lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.61D + (((tickAnim - 0D) / 1D) * (-1.29621D-(0.61D)));
            yy = 0.72D + (((tickAnim - 0D) / 1D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 0D) / 1D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -1.29621D + (((tickAnim - 1D) / 3D) * (1.1962D-(-1.29621D)));
            yy = -0.1743D + (((tickAnim - 1D) / 3D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 1D) / 3D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 1.1962D + (((tickAnim - 4D) / 2D) * (-1.29621D-(1.1962D)));
            yy = -2.49391D + (((tickAnim - 4D) / 2D) * (0.17434D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 4D) / 2D) * (2.49392D-(0.1745D)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -1.29621D + (((tickAnim - 6D) / 3D) * (1.1962D-(-1.29621D)));
            yy = 0.17434D + (((tickAnim - 6D) / 3D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 6D) / 3D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 1.1962D + (((tickAnim - 9D) / 1D) * (0.61D-(1.1962D)));
            yy = 2.49391D + (((tickAnim - 9D) / 1D) * (0.72D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 9D) / 1D) * (-1.72D-(-0.1745D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -1.02D + (((tickAnim - 0D) / 2D) * (-0.9D-(-1.02D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 2D) / 2D) * (0D-(0D)));
            yy = -0.9D + (((tickAnim - 2D) / 2D) * (-1.1D-(-0.9D)));
            zz = 0D + (((tickAnim - 2D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            yy = -1.1D + (((tickAnim - 4D) / 4D) * (-0.9D-(-1.1D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
            yy = -0.9D + (((tickAnim - 8D) / 1D) * (-1.1D-(-0.9D)));
            zz = 0D + (((tickAnim - 8D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
            yy = -1.1D + (((tickAnim - 9D) / 1D) * (-1.02D-(-1.1D)));
            zz = 0D + (((tickAnim - 9D) / 1D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 74.45543D + (((tickAnim - 0D) / 1D) * (-2.79818D-(74.45543D)));
            yy = 37.25128D + (((tickAnim - 0D) / 1D) * (61.39198D-(37.25128D)));
            zz = -5.14384D + (((tickAnim - 0D) / 1D) * (27.16407D-(-5.14384D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -2.79818D + (((tickAnim - 1D) / 2D) * (-28.67889D-(-2.79818D)));
            yy = 61.39198D + (((tickAnim - 1D) / 2D) * (19.49162D-(61.39198D)));
            zz = 27.16407D + (((tickAnim - 1D) / 2D) * (20.3333D-(27.16407D)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -28.67889D + (((tickAnim - 3D) / 0D) * (-54.82105D-(-28.67889D)));
            yy = 19.49162D + (((tickAnim - 3D) / 0D) * (19.58925D-(19.49162D)));
            zz = 20.3333D + (((tickAnim - 3D) / 0D) * (18.59323D-(20.3333D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -54.82105D + (((tickAnim - 3D) / 2D) * (-22.926D-(-54.82105D)));
            yy = 19.58925D + (((tickAnim - 3D) / 2D) * (-13.62569D-(19.58925D)));
            zz = 18.59323D + (((tickAnim - 3D) / 2D) * (18.69107D-(18.59323D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.926D + (((tickAnim - 5D) / 5D) * (74.45543D-(-22.926D)));
            yy = -13.62569D + (((tickAnim - 5D) / 5D) * (37.25128D-(-13.62569D)));
            zz = 18.69107D + (((tickAnim - 5D) / 5D) * (-5.14384D-(18.69107D)));
        }
        this.setRotateAngle(frontlegright1, frontlegright1.rotateAngleX + (float) Math.toRadians(xx), frontlegright1.rotateAngleY + (float) Math.toRadians(yy), frontlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 71.6956D + (((tickAnim - 0D) / 1D) * (28.76662D-(71.6956D)));
            yy = -0.7599D + (((tickAnim - 0D) / 1D) * (4.2508D-(-0.7599D)));
            zz = -16.3214D + (((tickAnim - 0D) / 1D) * (-33.6352D-(-16.3214D)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 28.76662D + (((tickAnim - 1D) / 2D) * (-26.72912D-(28.76662D)));
            yy = 4.2508D + (((tickAnim - 1D) / 2D) * (33.4803D-(4.2508D)));
            zz = -33.6352D + (((tickAnim - 1D) / 2D) * (-27.5856D-(-33.6352D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -26.72912D + (((tickAnim - 3D) / 2D) * (-26.52206D-(-26.72912D)));
            yy = 33.4803D + (((tickAnim - 3D) / 2D) * (57.47D-(33.4803D)));
            zz = -27.5856D + (((tickAnim - 3D) / 2D) * (-18.6908D-(-27.5856D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -26.52206D + (((tickAnim - 5D) / 5D) * (71.6956D-(-26.52206D)));
            yy = 57.47D + (((tickAnim - 5D) / 5D) * (-0.7599D-(57.47D)));
            zz = -18.6908D + (((tickAnim - 5D) / 5D) * (-16.3214D-(-18.6908D)));
        }
        this.setRotateAngle(backlegleft1, backlegleft1.rotateAngleX + (float) Math.toRadians(xx), backlegleft1.rotateAngleY + (float) Math.toRadians(yy), backlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.52206D + (((tickAnim - 0D) / 5D) * (71.6956D-(-26.52206D)));
            yy = -57.47004D + (((tickAnim - 0D) / 5D) * (0.75986D-(-57.47004D)));
            zz = 18.69081D + (((tickAnim - 0D) / 5D) * (16.32144D-(18.69081D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 71.6956D + (((tickAnim - 5D) / 1D) * (28.76662D-(71.6956D)));
            yy = 0.75986D + (((tickAnim - 5D) / 1D) * (-4.25081D-(0.75986D)));
            zz = 16.32144D + (((tickAnim - 5D) / 1D) * (33.63517D-(16.32144D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 28.76662D + (((tickAnim - 6D) / 2D) * (-26.72912D-(28.76662D)));
            yy = -4.25081D + (((tickAnim - 6D) / 2D) * (-33.48027D-(-4.25081D)));
            zz = 33.63517D + (((tickAnim - 6D) / 2D) * (27.58558D-(33.63517D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -26.72912D + (((tickAnim - 8D) / 2D) * (-26.52206D-(-26.72912D)));
            yy = -33.48027D + (((tickAnim - 8D) / 2D) * (-57.47004D-(-33.48027D)));
            zz = 27.58558D + (((tickAnim - 8D) / 2D) * (18.69081D-(27.58558D)));
        }
        this.setRotateAngle(backlegright1, backlegright1.rotateAngleX + (float) Math.toRadians(xx), backlegright1.rotateAngleY + (float) Math.toRadians(yy), backlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -2.79D + (((tickAnim - 0D) / 1D) * (-4.69621D-(-2.79D)));
            yy = -0.72D + (((tickAnim - 0D) / 1D) * (0.17434D-(-0.72D)));
            zz = 1.72D + (((tickAnim - 0D) / 1D) * (2.49392D-(1.72D)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -4.69621D + (((tickAnim - 1D) / 3D) * (-2.2038D-(-4.69621D)));
            yy = 0.17434D + (((tickAnim - 1D) / 3D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 1D) / 3D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = -2.2038D + (((tickAnim - 4D) / 1D) * (-2.79D-(-2.2038D)));
            yy = 2.49391D + (((tickAnim - 4D) / 1D) * (0.72D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 4D) / 1D) * (-1.72D-(-0.1745D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -2.79D + (((tickAnim - 5D) / 1D) * (-4.69621D-(-2.79D)));
            yy = 0.72D + (((tickAnim - 5D) / 1D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 5D) / 1D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -4.69621D + (((tickAnim - 6D) / 3D) * (-2.2038D-(-4.69621D)));
            yy = -0.1743D + (((tickAnim - 6D) / 3D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 6D) / 3D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -2.2038D + (((tickAnim - 9D) / 1D) * (-2.79D-(-2.2038D)));
            yy = -2.49391D + (((tickAnim - 9D) / 1D) * (-0.72D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 9D) / 1D) * (1.72D-(0.1745D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.94D + (((tickAnim - 0D) / 2D) * (8.79987D-(6.94D)));
            yy = -0.12D + (((tickAnim - 0D) / 2D) * (0.87471D-(-0.12D)));
            zz = 2.24D + (((tickAnim - 0D) / 2D) * (1.61415D-(2.24D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.79987D + (((tickAnim - 2D) / 1D) * (6.29389D-(8.79987D)));
            yy = 0.87471D + (((tickAnim - 2D) / 1D) * (2.47972D-(0.87471D)));
            zz = 1.61415D + (((tickAnim - 2D) / 1D) * (-0.28372D-(1.61415D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 6.29389D + (((tickAnim - 3D) / 1D) * (5.74026D-(6.29389D)));
            yy = 2.47972D + (((tickAnim - 3D) / 1D) * (1.82525D-(2.47972D)));
            zz = -0.28372D + (((tickAnim - 3D) / 1D) * (-0.85255D-(-0.28372D)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 5.74026D + (((tickAnim - 4D) / 1D) * (5.71102D-(5.74026D)));
            yy = 1.82525D + (((tickAnim - 4D) / 1D) * (0.64279D-(1.82525D)));
            zz = -0.85255D + (((tickAnim - 4D) / 1D) * (-1.7485D-(-0.85255D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 5.71102D + (((tickAnim - 5D) / 1D) * (8.80135D-(5.71102D)));
            yy = 0.64279D + (((tickAnim - 5D) / 1D) * (-0.06377D-(0.64279D)));
            zz = -1.7485D + (((tickAnim - 5D) / 1D) * (-2.50398D-(-1.7485D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.80135D + (((tickAnim - 6D) / 2D) * (6.29389D-(8.80135D)));
            yy = -0.06377D + (((tickAnim - 6D) / 2D) * (-2.47972D-(-0.06377D)));
            zz = -2.50398D + (((tickAnim - 6D) / 2D) * (0.28372D-(-2.50398D)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 6.29389D + (((tickAnim - 8D) / 1D) * (5.74026D-(6.29389D)));
            yy = -2.47972D + (((tickAnim - 8D) / 1D) * (-1.82524D-(-2.47972D)));
            zz = 0.28372D + (((tickAnim - 8D) / 1D) * (0.85255D-(0.28372D)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 5.74026D + (((tickAnim - 9D) / 1D) * (6.94D-(5.74026D)));
            yy = -1.82524D + (((tickAnim - 9D) / 1D) * (-0.12D-(-1.82524D)));
            zz = 0.85255D + (((tickAnim - 9D) / 1D) * (2.24D-(0.85255D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5+30))*1), tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+60))*1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5))*2), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5+30))*2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5-30))*3), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5))*3), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*720/0.5-60))*1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/10D)*0.5D)*360/0.5-30))*4), tail4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -22.926D + (((tickAnim - 0D) / 5D) * (74.45543D-(-22.926D)));
            yy = 13.6257D + (((tickAnim - 0D) / 5D) * (-37.2513D-(13.6257D)));
            zz = -18.6911D + (((tickAnim - 0D) / 5D) * (5.1438D-(-18.6911D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 74.45543D + (((tickAnim - 5D) / 1D) * (-2.79818D-(74.45543D)));
            yy = -37.2513D + (((tickAnim - 5D) / 1D) * (-61.392D-(-37.2513D)));
            zz = 5.1438D + (((tickAnim - 5D) / 1D) * (-27.1641D-(5.1438D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -2.79818D + (((tickAnim - 6D) / 2D) * (-28.67889D-(-2.79818D)));
            yy = -61.392D + (((tickAnim - 6D) / 2D) * (-19.4916D-(-61.392D)));
            zz = -27.1641D + (((tickAnim - 6D) / 2D) * (-20.3333D-(-27.1641D)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -28.67889D + (((tickAnim - 8D) / 0D) * (-54.82105D-(-28.67889D)));
            yy = -19.4916D + (((tickAnim - 8D) / 0D) * (-19.5893D-(-19.4916D)));
            zz = -20.3333D + (((tickAnim - 8D) / 0D) * (-18.5932D-(-20.3333D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -54.82105D + (((tickAnim - 8D) / 2D) * (-22.926D-(-54.82105D)));
            yy = -19.5893D + (((tickAnim - 8D) / 2D) * (13.6257D-(-19.5893D)));
            zz = -18.5932D + (((tickAnim - 8D) / 2D) * (-18.6911D-(-18.5932D)));
        }
        this.setRotateAngle(frontlegleft1, frontlegleft1.rotateAngleX + (float) Math.toRadians(xx), frontlegleft1.rotateAngleY + (float) Math.toRadians(yy), frontlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -47.73212D + (((tickAnim - 0D) / 1D) * (29.7499D-(-47.73212D)));
            yy = -17.46013D + (((tickAnim - 0D) / 1D) * (-7.04506D-(-17.46013D)));
            zz = -14.41086D + (((tickAnim - 0D) / 1D) * (-11.88867D-(-14.41086D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 29.7499D + (((tickAnim - 1D) / 4D) * (14.87739D-(29.7499D)));
            yy = -7.04506D + (((tickAnim - 1D) / 4D) * (1.93597D-(-7.04506D)));
            zz = -11.88867D + (((tickAnim - 1D) / 4D) * (-7.24721D-(-11.88867D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 14.87739D + (((tickAnim - 5D) / 5D) * (-47.73212D-(14.87739D)));
            yy = 1.93597D + (((tickAnim - 5D) / 5D) * (-17.46013D-(1.93597D)));
            zz = -7.24721D + (((tickAnim - 5D) / 5D) * (-14.41086D-(-7.24721D)));
        }
        this.setRotateAngle(frontlegright3, frontlegright3.rotateAngleX + (float) Math.toRadians(xx), frontlegright3.rotateAngleY + (float) Math.toRadians(yy), frontlegright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.59049D + (((tickAnim - 0D) / 3D) * (-22.7629D-(17.59049D)));
            yy = 45.08695D + (((tickAnim - 0D) / 3D) * (6.06854D-(45.08695D)));
            zz = -7.94916D + (((tickAnim - 0D) / 3D) * (-13.76905D-(-7.94916D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -22.7629D + (((tickAnim - 3D) / 2D) * (-27.05661D-(-22.7629D)));
            yy = 6.06854D + (((tickAnim - 3D) / 2D) * (11.32434D-(6.06854D)));
            zz = -13.76905D + (((tickAnim - 3D) / 2D) * (-16.41883D-(-13.76905D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -27.05661D + (((tickAnim - 5D) / 5D) * (17.59049D-(-27.05661D)));
            yy = 11.32434D + (((tickAnim - 5D) / 5D) * (45.08695D-(11.32434D)));
            zz = -16.41883D + (((tickAnim - 5D) / 5D) * (-7.94916D-(-16.41883D)));
        }
        this.setRotateAngle(backlegright3, backlegright3.rotateAngleX + (float) Math.toRadians(xx), backlegright3.rotateAngleY + (float) Math.toRadians(yy), backlegright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14.87739D + (((tickAnim - 0D) / 5D) * (-47.73212D-(14.87739D)));
            yy = -1.936D + (((tickAnim - 0D) / 5D) * (17.4601D-(-1.936D)));
            zz = 7.2472D + (((tickAnim - 0D) / 5D) * (14.4109D-(7.2472D)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -47.73212D + (((tickAnim - 5D) / 1D) * (29.7499D-(-47.73212D)));
            yy = 17.4601D + (((tickAnim - 5D) / 1D) * (7.0451D-(17.4601D)));
            zz = 14.4109D + (((tickAnim - 5D) / 1D) * (11.8887D-(14.4109D)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 29.7499D + (((tickAnim - 6D) / 4D) * (14.87739D-(29.7499D)));
            yy = 7.0451D + (((tickAnim - 6D) / 4D) * (-1.936D-(7.0451D)));
            zz = 11.8887D + (((tickAnim - 6D) / 4D) * (7.2472D-(11.8887D)));
        }
        this.setRotateAngle(frontlegleft3, frontlegleft3.rotateAngleX + (float) Math.toRadians(xx), frontlegleft3.rotateAngleY + (float) Math.toRadians(yy), frontlegleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.05661D + (((tickAnim - 0D) / 5D) * (17.59049D-(-27.05661D)));
            yy = -11.3243D + (((tickAnim - 0D) / 5D) * (-45.087D-(-11.3243D)));
            zz = 16.4188D + (((tickAnim - 0D) / 5D) * (7.9492D-(16.4188D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 17.59049D + (((tickAnim - 5D) / 3D) * (-22.7629D-(17.59049D)));
            yy = -45.087D + (((tickAnim - 5D) / 3D) * (-6.0685D-(-45.087D)));
            zz = 7.9492D + (((tickAnim - 5D) / 3D) * (13.7691D-(7.9492D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.7629D + (((tickAnim - 8D) / 2D) * (-27.05661D-(-22.7629D)));
            yy = -6.0685D + (((tickAnim - 8D) / 2D) * (-11.3243D-(-6.0685D)));
            zz = 13.7691D + (((tickAnim - 8D) / 2D) * (16.4188D-(13.7691D)));
        }
        this.setRotateAngle(backlegleft3, backlegleft3.rotateAngleX + (float) Math.toRadians(xx), backlegleft3.rotateAngleY + (float) Math.toRadians(yy), backlegleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraProganochelys entity = (EntityPrehistoricFloraProganochelys) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.79D + (((tickAnim - 0D) / 3D) * (-4.69621D-(-2.79D)));
            yy = 0.72D + (((tickAnim - 0D) / 3D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 0D) / 3D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -4.69621D + (((tickAnim - 3D) / 12D) * (-2.2038D-(-4.69621D)));
            yy = -0.1743D + (((tickAnim - 3D) / 12D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 3D) / 12D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -2.2038D + (((tickAnim - 15D) / 2D) * (-0.25767D-(-2.2038D)));
            yy = -2.49391D + (((tickAnim - 15D) / 2D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 15D) / 2D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = -0.25767D + (((tickAnim - 17D) / 6D) * (-4.69621D-(-0.25767D)));
            yy = -1.90096D + (((tickAnim - 17D) / 6D) * (0.17434D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 17D) / 6D) * (2.49392D-(0.68993D)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -4.69621D + (((tickAnim - 23D) / 12D) * (-2.2038D-(-4.69621D)));
            yy = 0.17434D + (((tickAnim - 23D) / 12D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 23D) / 12D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -2.2038D + (((tickAnim - 35D) / 2D) * (-0.25767D-(-2.2038D)));
            yy = 2.49391D + (((tickAnim - 35D) / 2D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 35D) / 2D) * (-0.68992D-(-0.1745D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.25767D + (((tickAnim - 37D) / 3D) * (-2.79D-(-0.25767D)));
            yy = 1.90097D + (((tickAnim - 37D) / 3D) * (0.72D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 37D) / 3D) * (-1.72D-(-0.68992D)));
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
            yy = -1.02D + (((tickAnim - 0D) / 8D) * (-0.9D-(-1.02D)));
            zz = 0D + (((tickAnim - 0D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 8D) / 7D) * (0D-(0D)));
            yy = -0.9D + (((tickAnim - 8D) / 7D) * (-1.1D-(-0.9D)));
            zz = 0D + (((tickAnim - 8D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 15D) / 13D) * (0D-(0D)));
            yy = -1.1D + (((tickAnim - 15D) / 13D) * (-0.9D-(-1.1D)));
            zz = 0D + (((tickAnim - 15D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 28D) / 7D) * (0D-(0D)));
            yy = -0.9D + (((tickAnim - 28D) / 7D) * (-1.1D-(-0.9D)));
            zz = 0D + (((tickAnim - 28D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            yy = -1.1D + (((tickAnim - 35D) / 5D) * (-1.02D-(-1.1D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.body.offsetX = (float) Math.toRadians(xx);
        this.body.offsetY = (float) Math.toRadians(yy);
        this.body.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 50.26815D + (((tickAnim - 0D) / 5D) * (6.42436D-(50.26815D)));
            yy = 45.36239D + (((tickAnim - 0D) / 5D) * (44.04056D-(45.36239D)));
            zz = 1.70522D + (((tickAnim - 0D) / 5D) * (35.13921D-(1.70522D)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 6.42436D + (((tickAnim - 5D) / 4D) * (-36.31405D-(6.42436D)));
            yy = 44.04056D + (((tickAnim - 5D) / 4D) * (30.56642D-(44.04056D)));
            zz = 35.13921D + (((tickAnim - 5D) / 4D) * (24.87739D-(35.13921D)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -36.31405D + (((tickAnim - 9D) / 3D) * (-41.8222D-(-36.31405D)));
            yy = 30.56642D + (((tickAnim - 9D) / 3D) * (2.61752D-(30.56642D)));
            zz = 24.87739D + (((tickAnim - 9D) / 3D) * (18.7191D-(24.87739D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -41.8222D + (((tickAnim - 12D) / 2D) * (-31.75489D-(-41.8222D)));
            yy = 2.61752D + (((tickAnim - 12D) / 2D) * (-17.87626D-(2.61752D)));
            zz = 18.7191D + (((tickAnim - 12D) / 2D) * (12.58663D-(18.7191D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -31.75489D + (((tickAnim - 14D) / 1D) * (-19.10558D-(-31.75489D)));
            yy = -17.87626D + (((tickAnim - 14D) / 1D) * (-20.17698D-(-17.87626D)));
            zz = 12.58663D + (((tickAnim - 14D) / 1D) * (4.68529D-(12.58663D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -19.10558D + (((tickAnim - 15D) / 2D) * (-19.31953D-(-19.10558D)));
            yy = -20.17698D + (((tickAnim - 15D) / 2D) * (-19.14694D-(-20.17698D)));
            zz = 4.68529D + (((tickAnim - 15D) / 2D) * (9.33611D-(4.68529D)));
        }
        else if (tickAnim >= 17 && tickAnim < 28) {
            xx = -19.31953D + (((tickAnim - 17D) / 11D) * (0.07528D-(-19.31953D)));
            yy = -19.14694D + (((tickAnim - 17D) / 11D) * (11.63956D-(-19.14694D)));
            zz = 9.33611D + (((tickAnim - 17D) / 11D) * (0.41965D-(9.33611D)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0.07528D + (((tickAnim - 28D) / 6D) * (24.87312D-(0.07528D)));
            yy = 11.63956D + (((tickAnim - 28D) / 6D) * (28.27512D-(11.63956D)));
            zz = 0.41965D + (((tickAnim - 28D) / 6D) * (11.06384D-(0.41965D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 24.87312D + (((tickAnim - 34D) / 6D) * (50.26815D-(24.87312D)));
            yy = 28.27512D + (((tickAnim - 34D) / 6D) * (45.36239D-(28.27512D)));
            zz = 11.06384D + (((tickAnim - 34D) / 6D) * (1.70522D-(11.06384D)));
        }
        this.setRotateAngle(frontlegright1, frontlegright1.rotateAngleX + (float) Math.toRadians(xx), frontlegright1.rotateAngleY + (float) Math.toRadians(yy), frontlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.17D + (((tickAnim - 0D) / 3D) * (37.20513D-(30.17D)));
            yy = 0.46D + (((tickAnim - 0D) / 3D) * (-7.9831D-(0.46D)));
            zz = -26.87D + (((tickAnim - 0D) / 3D) * (-25.09189D-(-26.87D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 37.20513D + (((tickAnim - 3D) / 2D) * (43.55505D-(37.20513D)));
            yy = -7.9831D + (((tickAnim - 3D) / 2D) * (-14.80212D-(-7.9831D)));
            zz = -25.09189D + (((tickAnim - 3D) / 2D) * (-35.16743D-(-25.09189D)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 43.55505D + (((tickAnim - 5D) / 8D) * (28.33754D-(43.55505D)));
            yy = -14.80212D + (((tickAnim - 5D) / 8D) * (48.99081D-(-14.80212D)));
            zz = -35.16743D + (((tickAnim - 5D) / 8D) * (-31.49863D-(-35.16743D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 28.33754D + (((tickAnim - 13D) / 7D) * (-28.61394D-(28.33754D)));
            yy = 48.99081D + (((tickAnim - 13D) / 7D) * (69.09225D-(48.99081D)));
            zz = -31.49863D + (((tickAnim - 13D) / 7D) * (-16.7756D-(-31.49863D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = -28.61394D + (((tickAnim - 20D) / 8D) * (-4.83824D-(-28.61394D)));
            yy = 69.09225D + (((tickAnim - 20D) / 8D) * (41.60189D-(69.09225D)));
            zz = -16.7756D + (((tickAnim - 20D) / 8D) * (-29.30841D-(-16.7756D)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = -4.83824D + (((tickAnim - 28D) / 10D) * (25.48134D-(-4.83824D)));
            yy = 41.60189D + (((tickAnim - 28D) / 10D) * (6.08213D-(41.60189D)));
            zz = -29.30841D + (((tickAnim - 28D) / 10D) * (-28.05725D-(-29.30841D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 25.48134D + (((tickAnim - 38D) / 2D) * (30.17D-(25.48134D)));
            yy = 6.08213D + (((tickAnim - 38D) / 2D) * (0.46D-(6.08213D)));
            zz = -28.05725D + (((tickAnim - 38D) / 2D) * (-26.87D-(-28.05725D)));
        }
        this.setRotateAngle(backlegleft1, backlegleft1.rotateAngleX + (float) Math.toRadians(xx), backlegleft1.rotateAngleY + (float) Math.toRadians(yy), backlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -28.78826D + (((tickAnim - 0D) / 8D) * (-4.79669D-(-28.78826D)));
            yy = -69.30104D + (((tickAnim - 0D) / 8D) * (-41.27759D-(-69.30104D)));
            zz = 21.87346D + (((tickAnim - 0D) / 8D) * (24.31265D-(21.87346D)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -4.79669D + (((tickAnim - 8D) / 10D) * (25.32333D-(-4.79669D)));
            yy = -41.27759D + (((tickAnim - 8D) / 10D) * (-5.66809D-(-41.27759D)));
            zz = 24.31265D + (((tickAnim - 8D) / 10D) * (15.49407D-(24.31265D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 25.32333D + (((tickAnim - 18D) / 5D) * (37.20513D-(25.32333D)));
            yy = -5.66809D + (((tickAnim - 18D) / 5D) * (7.9831D-(-5.66809D)));
            zz = 15.49407D + (((tickAnim - 18D) / 5D) * (25.09189D-(15.49407D)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 37.20513D + (((tickAnim - 23D) / 2D) * (36.03098D-(37.20513D)));
            yy = 7.9831D + (((tickAnim - 23D) / 2D) * (17.04773D-(7.9831D)));
            zz = 25.09189D + (((tickAnim - 23D) / 2D) * (25.22482D-(25.09189D)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 36.03098D + (((tickAnim - 25D) / 8D) * (28.33754D-(36.03098D)));
            yy = 17.04773D + (((tickAnim - 25D) / 8D) * (-48.99081D-(17.04773D)));
            zz = 25.22482D + (((tickAnim - 25D) / 8D) * (31.49863D-(25.22482D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 28.33754D + (((tickAnim - 33D) / 7D) * (-28.78826D-(28.33754D)));
            yy = -48.99081D + (((tickAnim - 33D) / 7D) * (-69.30104D-(-48.99081D)));
            zz = 31.49863D + (((tickAnim - 33D) / 7D) * (21.87346D-(31.49863D)));
        }
        this.setRotateAngle(backlegright1, backlegright1.rotateAngleX + (float) Math.toRadians(xx), backlegright1.rotateAngleY + (float) Math.toRadians(yy), backlegright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -2.79D + (((tickAnim - 0D) / 3D) * (-4.69621D-(-2.79D)));
            yy = -0.72D + (((tickAnim - 0D) / 3D) * (0.17434D-(-0.72D)));
            zz = 1.72D + (((tickAnim - 0D) / 3D) * (2.49392D-(1.72D)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -4.69621D + (((tickAnim - 3D) / 12D) * (-2.2038D-(-4.69621D)));
            yy = 0.17434D + (((tickAnim - 3D) / 12D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 3D) / 12D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -2.2038D + (((tickAnim - 15D) / 2D) * (-0.25767D-(-2.2038D)));
            yy = 2.49391D + (((tickAnim - 15D) / 2D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 15D) / 2D) * (-0.68992D-(-0.1745D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -0.25767D + (((tickAnim - 17D) / 3D) * (-2.79D-(-0.25767D)));
            yy = 1.90097D + (((tickAnim - 17D) / 3D) * (0.72D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 17D) / 3D) * (-1.72D-(-0.68992D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -2.79D + (((tickAnim - 20D) / 3D) * (-4.69621D-(-2.79D)));
            yy = 0.72D + (((tickAnim - 20D) / 3D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 20D) / 3D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = -4.69621D + (((tickAnim - 23D) / 12D) * (-2.2038D-(-4.69621D)));
            yy = -0.1743D + (((tickAnim - 23D) / 12D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 23D) / 12D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -2.2038D + (((tickAnim - 35D) / 2D) * (-0.25767D-(-2.2038D)));
            yy = -2.49391D + (((tickAnim - 35D) / 2D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 35D) / 2D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -0.25767D + (((tickAnim - 37D) / 3D) * (-2.79D-(-0.25767D)));
            yy = -1.90096D + (((tickAnim - 37D) / 3D) * (-0.72D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 37D) / 3D) * (1.72D-(0.68993D)));
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.94D + (((tickAnim - 0D) / 1D) * (6.30379D-(6.94D)));
            yy = -0.12D + (((tickAnim - 0D) / 1D) * (0.17434D-(-0.12D)));
            zz = 2.24D + (((tickAnim - 0D) / 1D) * (2.49392D-(2.24D)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 6.30379D + (((tickAnim - 1D) / 4D) * (8.79987D-(6.30379D)));
            yy = 0.17434D + (((tickAnim - 1D) / 4D) * (0.87471D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 1D) / 4D) * (1.61415D-(2.49392D)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 8.79987D + (((tickAnim - 5D) / 8D) * (6.29389D-(8.79987D)));
            yy = 0.87471D + (((tickAnim - 5D) / 8D) * (2.47972D-(0.87471D)));
            zz = 1.61415D + (((tickAnim - 5D) / 8D) * (-0.28372D-(1.61415D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.29389D + (((tickAnim - 13D) / 2D) * (5.74026D-(6.29389D)));
            yy = 2.47972D + (((tickAnim - 13D) / 2D) * (1.82525D-(2.47972D)));
            zz = -0.28372D + (((tickAnim - 13D) / 2D) * (-0.85255D-(-0.28372D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 5.74026D + (((tickAnim - 15D) / 2D) * (0.726D-(5.74026D)));
            yy = 1.82525D + (((tickAnim - 15D) / 2D) * (1.11529D-(1.82525D)));
            zz = -0.85255D + (((tickAnim - 15D) / 2D) * (-1.40283D-(-0.85255D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.726D + (((tickAnim - 17D) / 1D) * (5.71102D-(0.726D)));
            yy = 1.11529D + (((tickAnim - 17D) / 1D) * (0.64279D-(1.11529D)));
            zz = -1.40283D + (((tickAnim - 17D) / 1D) * (-1.7485D-(-1.40283D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.71102D + (((tickAnim - 18D) / 2D) * (6.94D-(5.71102D)));
            yy = 0.64279D + (((tickAnim - 18D) / 2D) * (0.12D-(0.64279D)));
            zz = -1.7485D + (((tickAnim - 18D) / 2D) * (-2.24D-(-1.7485D)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 6.94D + (((tickAnim - 20D) / 1D) * (8.80135D-(6.94D)));
            yy = 0.12D + (((tickAnim - 20D) / 1D) * (-0.06377D-(0.12D)));
            zz = -2.24D + (((tickAnim - 20D) / 1D) * (-2.50398D-(-2.24D)));
        }
        else if (tickAnim >= 21 && tickAnim < 33) {
            xx = 8.80135D + (((tickAnim - 21D) / 12D) * (6.29389D-(8.80135D)));
            yy = -0.06377D + (((tickAnim - 21D) / 12D) * (-2.47972D-(-0.06377D)));
            zz = -2.50398D + (((tickAnim - 21D) / 12D) * (0.28372D-(-2.50398D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.29389D + (((tickAnim - 33D) / 2D) * (5.74026D-(6.29389D)));
            yy = -2.47972D + (((tickAnim - 33D) / 2D) * (-1.82524D-(-2.47972D)));
            zz = 0.28372D + (((tickAnim - 33D) / 2D) * (0.85255D-(0.28372D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 5.74026D + (((tickAnim - 35D) / 2D) * (1.14052D-(5.74026D)));
            yy = -1.82524D + (((tickAnim - 35D) / 2D) * (-1.13674D-(-1.82524D)));
            zz = 0.85255D + (((tickAnim - 35D) / 2D) * (1.41927D-(0.85255D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 1.14052D + (((tickAnim - 37D) / 3D) * (6.94D-(1.14052D)));
            yy = -1.13674D + (((tickAnim - 37D) / 3D) * (-0.12D-(-1.13674D)));
            zz = 1.41927D + (((tickAnim - 37D) / 3D) * (2.24D-(1.41927D)));
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.18D + (((tickAnim - 0D) / 2D) * (0.91D-(2.18D)));
            yy = 1.31D + (((tickAnim - 0D) / 2D) * (0.72D-(1.31D)));
            zz = -1.2D + (((tickAnim - 0D) / 2D) * (-1.72D-(-1.2D)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0.91D + (((tickAnim - 2D) / 2D) * (-0.99621D-(0.91D)));
            yy = 0.72D + (((tickAnim - 2D) / 2D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 2D) / 2D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 4 && tickAnim < 17) {
            xx = -0.99621D + (((tickAnim - 4D) / 13D) * (1.4962D-(-0.99621D)));
            yy = -0.1743D + (((tickAnim - 4D) / 13D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 4D) / 13D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 1.4962D + (((tickAnim - 17D) / 1D) * (3.44233D-(1.4962D)));
            yy = -2.49391D + (((tickAnim - 17D) / 1D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 17D) / 1D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 3.44233D + (((tickAnim - 18D) / 6D) * (-0.99621D-(3.44233D)));
            yy = -1.90096D + (((tickAnim - 18D) / 6D) * (0.17434D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 18D) / 6D) * (2.49392D-(0.68993D)));
        }
        else if (tickAnim >= 24 && tickAnim < 37) {
            xx = -0.99621D + (((tickAnim - 24D) / 13D) * (1.4962D-(-0.99621D)));
            yy = 0.17434D + (((tickAnim - 24D) / 13D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 24D) / 13D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 1.4962D + (((tickAnim - 37D) / 1D) * (3.44233D-(1.4962D)));
            yy = 2.49391D + (((tickAnim - 37D) / 1D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 37D) / 1D) * (-0.68992D-(-0.1745D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 3.44233D + (((tickAnim - 38D) / 2D) * (2.18D-(3.44233D)));
            yy = 1.90097D + (((tickAnim - 38D) / 2D) * (1.31D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 38D) / 2D) * (-1.2D-(-0.68992D)));
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.94233D + (((tickAnim - 0D) / 3D) * (1.41D-(3.94233D)));
            yy = 1.90097D + (((tickAnim - 0D) / 3D) * (0.72D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 0D) / 3D) * (-1.72D-(-0.68992D)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 1.41D + (((tickAnim - 3D) / 3D) * (-0.49621D-(1.41D)));
            yy = 0.72D + (((tickAnim - 3D) / 3D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 3D) / 3D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -0.49621D + (((tickAnim - 6D) / 12D) * (1.9962D-(-0.49621D)));
            yy = -0.1743D + (((tickAnim - 6D) / 12D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 6D) / 12D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 1.9962D + (((tickAnim - 18D) / 2D) * (3.94233D-(1.9962D)));
            yy = -2.49391D + (((tickAnim - 18D) / 2D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 18D) / 2D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 3.94233D + (((tickAnim - 20D) / 6D) * (-0.49621D-(3.94233D)));
            yy = -1.90096D + (((tickAnim - 20D) / 6D) * (0.17434D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 20D) / 6D) * (2.49392D-(0.68993D)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -0.49621D + (((tickAnim - 26D) / 12D) * (1.9962D-(-0.49621D)));
            yy = 0.17434D + (((tickAnim - 26D) / 12D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 26D) / 12D) * (-0.1745D-(2.49392D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.9962D + (((tickAnim - 38D) / 2D) * (3.94233D-(1.9962D)));
            yy = 2.49391D + (((tickAnim - 38D) / 2D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 38D) / 2D) * (-0.68992D-(-0.1745D)));
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.7962D + (((tickAnim - 0D) / 2D) * (13.74233D-(11.7962D)));
            yy = 2.49391D + (((tickAnim - 0D) / 2D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 0D) / 2D) * (-0.68992D-(-0.1745D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 13.74233D + (((tickAnim - 2D) / 3D) * (11.21D-(13.74233D)));
            yy = 1.90097D + (((tickAnim - 2D) / 3D) * (0.72D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 2D) / 3D) * (-1.72D-(-0.68992D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11.21D + (((tickAnim - 5D) / 3D) * (9.30379D-(11.21D)));
            yy = 0.72D + (((tickAnim - 5D) / 3D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 5D) / 3D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 9.30379D + (((tickAnim - 8D) / 12D) * (11.7962D-(9.30379D)));
            yy = -0.1743D + (((tickAnim - 8D) / 12D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 8D) / 12D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 11.7962D + (((tickAnim - 20D) / 2D) * (13.74233D-(11.7962D)));
            yy = -2.49391D + (((tickAnim - 20D) / 2D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 20D) / 2D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 13.74233D + (((tickAnim - 22D) / 6D) * (9.30379D-(13.74233D)));
            yy = -1.90096D + (((tickAnim - 22D) / 6D) * (0.17434D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 22D) / 6D) * (2.49392D-(0.68993D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 9.30379D + (((tickAnim - 28D) / 12D) * (11.7962D-(9.30379D)));
            yy = 0.17434D + (((tickAnim - 28D) / 12D) * (2.49391D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 28D) / 12D) * (-0.1745D-(2.49392D)));
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.16D + (((tickAnim - 0D) / 2D) * (2.4962D-(2.16D)));
            yy = 2.18D + (((tickAnim - 0D) / 2D) * (2.49391D-(2.18D)));
            zz = 0.18D + (((tickAnim - 0D) / 2D) * (-0.1745D-(0.18D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 2.4962D + (((tickAnim - 2D) / 1D) * (4.44233D-(2.4962D)));
            yy = 2.49391D + (((tickAnim - 2D) / 1D) * (1.90097D-(2.49391D)));
            zz = -0.1745D + (((tickAnim - 2D) / 1D) * (-0.68992D-(-0.1745D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.44233D + (((tickAnim - 3D) / 4D) * (1.91D-(4.44233D)));
            yy = 1.90097D + (((tickAnim - 3D) / 4D) * (0.72D-(1.90097D)));
            zz = -0.68992D + (((tickAnim - 3D) / 4D) * (-1.72D-(-0.68992D)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 1.91D + (((tickAnim - 7D) / 2D) * (0.00379D-(1.91D)));
            yy = 0.72D + (((tickAnim - 7D) / 2D) * (-0.1743D-(0.72D)));
            zz = -1.72D + (((tickAnim - 7D) / 2D) * (-2.4939D-(-1.72D)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 0.00379D + (((tickAnim - 9D) / 13D) * (2.4962D-(0.00379D)));
            yy = -0.1743D + (((tickAnim - 9D) / 13D) * (-2.49391D-(-0.1743D)));
            zz = -2.4939D + (((tickAnim - 9D) / 13D) * (0.1745D-(-2.4939D)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 2.4962D + (((tickAnim - 22D) / 1D) * (4.44233D-(2.4962D)));
            yy = -2.49391D + (((tickAnim - 22D) / 1D) * (-1.90096D-(-2.49391D)));
            zz = 0.1745D + (((tickAnim - 22D) / 1D) * (0.68993D-(0.1745D)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = 4.44233D + (((tickAnim - 23D) / 6D) * (0.00379D-(4.44233D)));
            yy = -1.90096D + (((tickAnim - 23D) / 6D) * (0.17434D-(-1.90096D)));
            zz = 0.68993D + (((tickAnim - 23D) / 6D) * (2.49392D-(0.68993D)));
        }
        else if (tickAnim >= 29 && tickAnim < 40) {
            xx = 0.00379D + (((tickAnim - 29D) / 11D) * (2.16D-(0.00379D)));
            yy = 0.17434D + (((tickAnim - 29D) / 11D) * (2.18D-(0.17434D)));
            zz = 2.49392D + (((tickAnim - 29D) / 11D) * (0.18D-(2.49392D)));
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 37.59926D + (((tickAnim - 0D) / 8D) * (62.88981D-(37.59926D)));
            yy = -12.45093D + (((tickAnim - 0D) / 8D) * (-28.58103D-(-12.45093D)));
            zz = 25.93845D + (((tickAnim - 0D) / 8D) * (6.4424D-(25.93845D)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 62.88981D + (((tickAnim - 8D) / 7D) * (11.36451D-(62.88981D)));
            yy = -28.58103D + (((tickAnim - 8D) / 7D) * (17.15022D-(-28.58103D)));
            zz = 6.4424D + (((tickAnim - 8D) / 7D) * (40.7449D-(6.4424D)));
        }
        else if (tickAnim >= 15 && tickAnim < 28) {
            xx = 11.36451D + (((tickAnim - 15D) / 13D) * (37.26601D-(11.36451D)));
            yy = 17.15022D + (((tickAnim - 15D) / 13D) * (15.5544D-(17.15022D)));
            zz = 40.7449D + (((tickAnim - 15D) / 13D) * (-1.65994D-(40.7449D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 37.26601D + (((tickAnim - 28D) / 12D) * (37.59926D-(37.26601D)));
            yy = 15.5544D + (((tickAnim - 28D) / 12D) * (-12.45093D-(15.5544D)));
            zz = -1.65994D + (((tickAnim - 28D) / 12D) * (25.93845D-(-1.65994D)));
        }
        this.setRotateAngle(frontlegright2, frontlegright2.rotateAngleX + (float) Math.toRadians(xx), frontlegright2.rotateAngleY + (float) Math.toRadians(yy), frontlegright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 45.65148D + (((tickAnim - 0D) / 6D) * (40.27314D-(45.65148D)));
            yy = -2.63581D + (((tickAnim - 0D) / 6D) * (18.48238D-(-2.63581D)));
            zz = -37.45997D + (((tickAnim - 0D) / 6D) * (11.89389D-(-37.45997D)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 40.27314D + (((tickAnim - 6D) / 8D) * (22.12876D-(40.27314D)));
            yy = 18.48238D + (((tickAnim - 6D) / 8D) * (8.35541D-(18.48238D)));
            zz = 11.89389D + (((tickAnim - 6D) / 8D) * (-11.17444D-(11.89389D)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 22.12876D + (((tickAnim - 14D) / 1D) * (31.89964D-(22.12876D)));
            yy = 8.35541D + (((tickAnim - 14D) / 1D) * (9.17513D-(8.35541D)));
            zz = -11.17444D + (((tickAnim - 14D) / 1D) * (-12.64359D-(-11.17444D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 31.89964D + (((tickAnim - 15D) / 2D) * (26.39222D-(31.89964D)));
            yy = 9.17513D + (((tickAnim - 15D) / 2D) * (10.80055D-(9.17513D)));
            zz = -12.64359D + (((tickAnim - 15D) / 2D) * (-15.59783D-(-12.64359D)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 26.39222D + (((tickAnim - 17D) / 5D) * (-0.21278D-(26.39222D)));
            yy = 10.80055D + (((tickAnim - 17D) / 5D) * (0.49214D-(10.80055D)));
            zz = -15.59783D + (((tickAnim - 17D) / 5D) * (-11.84626D-(-15.59783D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.21278D + (((tickAnim - 22D) / 3D) * (-12.35547D-(-0.21278D)));
            yy = 0.49214D + (((tickAnim - 22D) / 3D) * (-6.46072D-(0.49214D)));
            zz = -11.84626D + (((tickAnim - 22D) / 3D) * (-3.73409D-(-11.84626D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -12.35547D + (((tickAnim - 25D) / 3D) * (-31.99347D-(-12.35547D)));
            yy = -6.46072D + (((tickAnim - 25D) / 3D) * (-11.82612D-(-6.46072D)));
            zz = -3.73409D + (((tickAnim - 25D) / 3D) * (9.15618D-(-3.73409D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -31.99347D + (((tickAnim - 28D) / 12D) * (45.65148D-(-31.99347D)));
            yy = -11.82612D + (((tickAnim - 28D) / 12D) * (-2.63581D-(-11.82612D)));
            zz = 9.15618D + (((tickAnim - 28D) / 12D) * (-37.45997D-(9.15618D)));
        }
        this.setRotateAngle(frontlegright3, frontlegright3.rotateAngleX + (float) Math.toRadians(xx), frontlegright3.rotateAngleY + (float) Math.toRadians(yy), frontlegright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -13.35D + (((tickAnim - 0D) / 8D) * (0.07528D-(-13.35D)));
            yy = 9.67D + (((tickAnim - 0D) / 8D) * (-11.63956D-(9.67D)));
            zz = -6.59D + (((tickAnim - 0D) / 8D) * (-0.41965D-(-6.59D)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0.07528D + (((tickAnim - 8D) / 6D) * (24.87312D-(0.07528D)));
            yy = -11.63956D + (((tickAnim - 8D) / 6D) * (-28.27512D-(-11.63956D)));
            zz = -0.41965D + (((tickAnim - 8D) / 6D) * (-11.06384D-(-0.41965D)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 24.87312D + (((tickAnim - 14D) / 6D) * (50.26815D-(24.87312D)));
            yy = -28.27512D + (((tickAnim - 14D) / 6D) * (-45.36239D-(-28.27512D)));
            zz = -11.06384D + (((tickAnim - 14D) / 6D) * (-1.70522D-(-11.06384D)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 50.26815D + (((tickAnim - 20D) / 5D) * (6.42436D-(50.26815D)));
            yy = -45.36239D + (((tickAnim - 20D) / 5D) * (-44.04056D-(-45.36239D)));
            zz = -1.70522D + (((tickAnim - 20D) / 5D) * (-35.13921D-(-1.70522D)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 6.42436D + (((tickAnim - 25D) / 4D) * (-36.31405D-(6.42436D)));
            yy = -44.04056D + (((tickAnim - 25D) / 4D) * (-30.56642D-(-44.04056D)));
            zz = -35.13921D + (((tickAnim - 25D) / 4D) * (-24.87739D-(-35.13921D)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -36.31405D + (((tickAnim - 29D) / 3D) * (-41.8222D-(-36.31405D)));
            yy = -30.56642D + (((tickAnim - 29D) / 3D) * (-2.61752D-(-30.56642D)));
            zz = -24.87739D + (((tickAnim - 29D) / 3D) * (-18.7191D-(-24.87739D)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = -41.8222D + (((tickAnim - 32D) / 2D) * (-31.75489D-(-41.8222D)));
            yy = -2.61752D + (((tickAnim - 32D) / 2D) * (17.87626D-(-2.61752D)));
            zz = -18.7191D + (((tickAnim - 32D) / 2D) * (-12.58663D-(-18.7191D)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -31.75489D + (((tickAnim - 34D) / 1D) * (-19.10558D-(-31.75489D)));
            yy = 17.87626D + (((tickAnim - 34D) / 1D) * (20.17698D-(17.87626D)));
            zz = -12.58663D + (((tickAnim - 34D) / 1D) * (-4.68529D-(-12.58663D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = -19.10558D + (((tickAnim - 35D) / 2D) * (-19.31953D-(-19.10558D)));
            yy = 20.17698D + (((tickAnim - 35D) / 2D) * (19.14694D-(20.17698D)));
            zz = -4.68529D + (((tickAnim - 35D) / 2D) * (-9.33611D-(-4.68529D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -19.31953D + (((tickAnim - 37D) / 3D) * (-13.35D-(-19.31953D)));
            yy = 19.14694D + (((tickAnim - 37D) / 3D) * (9.67D-(19.14694D)));
            zz = -9.33611D + (((tickAnim - 37D) / 3D) * (-6.59D-(-9.33611D)));
        }
        this.setRotateAngle(frontlegleft1, frontlegleft1.rotateAngleX + (float) Math.toRadians(xx), frontlegleft1.rotateAngleY + (float) Math.toRadians(yy), frontlegleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 21.73D + (((tickAnim - 0D) / 8D) * (37.26601D-(21.73D)));
            yy = -16.51D + (((tickAnim - 0D) / 8D) * (-15.5544D-(-16.51D)));
            zz = -23.78D + (((tickAnim - 0D) / 8D) * (1.65994D-(-23.78D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 37.26601D + (((tickAnim - 8D) / 12D) * (37.59926D-(37.26601D)));
            yy = -15.5544D + (((tickAnim - 8D) / 12D) * (12.45093D-(-15.5544D)));
            zz = 1.65994D + (((tickAnim - 8D) / 12D) * (-25.93845D-(1.65994D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 37.59926D + (((tickAnim - 20D) / 8D) * (62.88981D-(37.59926D)));
            yy = 12.45093D + (((tickAnim - 20D) / 8D) * (28.58103D-(12.45093D)));
            zz = -25.93845D + (((tickAnim - 20D) / 8D) * (-6.4424D-(-25.93845D)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 62.88981D + (((tickAnim - 28D) / 7D) * (11.36451D-(62.88981D)));
            yy = 28.58103D + (((tickAnim - 28D) / 7D) * (-17.15022D-(28.58103D)));
            zz = -6.4424D + (((tickAnim - 28D) / 7D) * (-40.7449D-(-6.4424D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 11.36451D + (((tickAnim - 35D) / 5D) * (21.73D-(11.36451D)));
            yy = -17.15022D + (((tickAnim - 35D) / 5D) * (-16.51D-(-17.15022D)));
            zz = -40.7449D + (((tickAnim - 35D) / 5D) * (-23.78D-(-40.7449D)));
        }
        this.setRotateAngle(frontlegleft2, frontlegleft2.rotateAngleX + (float) Math.toRadians(xx), frontlegleft2.rotateAngleY + (float) Math.toRadians(yy), frontlegleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.66D + (((tickAnim - 0D) / 2D) * (-0.21278D-(8.66D)));
            yy = -3.93D + (((tickAnim - 0D) / 2D) * (-0.49214D-(-3.93D)));
            zz = 13.1D + (((tickAnim - 0D) / 2D) * (11.84626D-(13.1D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -0.21278D + (((tickAnim - 2D) / 3D) * (-12.35547D-(-0.21278D)));
            yy = -0.49214D + (((tickAnim - 2D) / 3D) * (6.46072D-(-0.49214D)));
            zz = 11.84626D + (((tickAnim - 2D) / 3D) * (3.73409D-(11.84626D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.35547D + (((tickAnim - 5D) / 3D) * (-31.99347D-(-12.35547D)));
            yy = 6.46072D + (((tickAnim - 5D) / 3D) * (11.82612D-(6.46072D)));
            zz = 3.73409D + (((tickAnim - 5D) / 3D) * (-9.15618D-(3.73409D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -31.99347D + (((tickAnim - 8D) / 12D) * (45.65148D-(-31.99347D)));
            yy = 11.82612D + (((tickAnim - 8D) / 12D) * (2.63581D-(11.82612D)));
            zz = -9.15618D + (((tickAnim - 8D) / 12D) * (37.45997D-(-9.15618D)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 45.65148D + (((tickAnim - 20D) / 6D) * (40.27314D-(45.65148D)));
            yy = 2.63581D + (((tickAnim - 20D) / 6D) * (-18.48238D-(2.63581D)));
            zz = 37.45997D + (((tickAnim - 20D) / 6D) * (-11.89389D-(37.45997D)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 40.27314D + (((tickAnim - 26D) / 8D) * (22.12876D-(40.27314D)));
            yy = -18.48238D + (((tickAnim - 26D) / 8D) * (-8.35541D-(-18.48238D)));
            zz = -11.89389D + (((tickAnim - 26D) / 8D) * (11.17444D-(-11.89389D)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 22.12876D + (((tickAnim - 34D) / 1D) * (31.89964D-(22.12876D)));
            yy = -8.35541D + (((tickAnim - 34D) / 1D) * (-9.17513D-(-8.35541D)));
            zz = 11.17444D + (((tickAnim - 34D) / 1D) * (12.64359D-(11.17444D)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 31.89964D + (((tickAnim - 35D) / 2D) * (26.39222D-(31.89964D)));
            yy = -9.17513D + (((tickAnim - 35D) / 2D) * (-10.80055D-(-9.17513D)));
            zz = 12.64359D + (((tickAnim - 35D) / 2D) * (15.59783D-(12.64359D)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 26.39222D + (((tickAnim - 37D) / 3D) * (8.66D-(26.39222D)));
            yy = -10.80055D + (((tickAnim - 37D) / 3D) * (-3.93D-(-10.80055D)));
            zz = 15.59783D + (((tickAnim - 37D) / 3D) * (13.1D-(15.59783D)));
        }
        this.setRotateAngle(frontlegleft3, frontlegleft3.rotateAngleX + (float) Math.toRadians(xx), frontlegleft3.rotateAngleY + (float) Math.toRadians(yy), frontlegleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 19.31D + (((tickAnim - 0D) / 5D) * (19.12056D-(19.31D)));
            yy = -6.97D + (((tickAnim - 0D) / 5D) * (-1.77754D-(-6.97D)));
            zz = 9.55D + (((tickAnim - 0D) / 5D) * (-7.5536D-(9.55D)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 19.12056D + (((tickAnim - 5D) / 8D) * (4.76722D-(19.12056D)));
            yy = -1.77754D + (((tickAnim - 5D) / 8D) * (-21.64715D-(-1.77754D)));
            zz = -7.5536D + (((tickAnim - 5D) / 8D) * (-11.66126D-(-7.5536D)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.76722D + (((tickAnim - 13D) / 7D) * (1.57999D-(4.76722D)));
            yy = -21.64715D + (((tickAnim - 13D) / 7D) * (-3.22222D-(-21.64715D)));
            zz = -11.66126D + (((tickAnim - 13D) / 7D) * (-10.66306D-(-11.66126D)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 1.57999D + (((tickAnim - 20D) / 13D) * (19.58472D-(1.57999D)));
            yy = -3.22222D + (((tickAnim - 20D) / 13D) * (-14.75183D-(-3.22222D)));
            zz = -10.66306D + (((tickAnim - 20D) / 13D) * (35.20077D-(-10.66306D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 19.58472D + (((tickAnim - 33D) / 7D) * (19.31D-(19.58472D)));
            yy = -14.75183D + (((tickAnim - 33D) / 7D) * (-6.97D-(-14.75183D)));
            zz = 35.20077D + (((tickAnim - 33D) / 7D) * (9.55D-(35.20077D)));
        }
        this.setRotateAngle(backlegleft2, backlegleft2.rotateAngleX + (float) Math.toRadians(xx), backlegleft2.rotateAngleY + (float) Math.toRadians(yy), backlegleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -42.41D + (((tickAnim - 0D) / 2D) * (-42.94777D-(-42.41D)));
            yy = -51.08D + (((tickAnim - 0D) / 2D) * (-45.60784D-(-51.08D)));
            zz = 47.25D + (((tickAnim - 0D) / 2D) * (44.94329D-(47.25D)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = -42.94777D + (((tickAnim - 2D) / 3D) * (-32.35087D-(-42.94777D)));
            yy = -45.60784D + (((tickAnim - 2D) / 3D) * (-26.18583D-(-45.60784D)));
            zz = 44.94329D + (((tickAnim - 2D) / 3D) * (55.28963D-(44.94329D)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -32.35087D + (((tickAnim - 5D) / 8D) * (45.52371D-(-32.35087D)));
            yy = -26.18583D + (((tickAnim - 5D) / 8D) * (-55.4861D-(-26.18583D)));
            zz = 55.28963D + (((tickAnim - 5D) / 8D) * (3.4574D-(55.28963D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 45.52371D + (((tickAnim - 13D) / 3D) * (44.58389D-(45.52371D)));
            yy = -55.4861D + (((tickAnim - 13D) / 3D) * (-67.63129D-(-55.4861D)));
            zz = 3.4574D + (((tickAnim - 13D) / 3D) * (-17.5214D-(3.4574D)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 44.58389D + (((tickAnim - 16D) / 4D) * (68.64407D-(44.58389D)));
            yy = -67.63129D + (((tickAnim - 16D) / 4D) * (-79.77649D-(-67.63129D)));
            zz = -17.5214D + (((tickAnim - 16D) / 4D) * (-38.5002D-(-17.5214D)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 68.64407D + (((tickAnim - 20D) / 8D) * (-7.71136D-(68.64407D)));
            yy = -79.77649D + (((tickAnim - 20D) / 8D) * (-73.87621D-(-79.77649D)));
            zz = -38.5002D + (((tickAnim - 20D) / 8D) * (17.83177D-(-38.5002D)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = -7.71136D + (((tickAnim - 28D) / 5D) * (-51.64892D-(-7.71136D)));
            yy = -73.87621D + (((tickAnim - 28D) / 5D) * (-69.91435D-(-73.87621D)));
            zz = 17.83177D + (((tickAnim - 28D) / 5D) * (42.57975D-(17.83177D)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -51.64892D + (((tickAnim - 33D) / 5D) * (-41.87354D-(-51.64892D)));
            yy = -69.91435D + (((tickAnim - 33D) / 5D) * (-56.55594D-(-69.91435D)));
            zz = 42.57975D + (((tickAnim - 33D) / 5D) * (49.54885D-(42.57975D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -41.87354D + (((tickAnim - 38D) / 2D) * (-42.41D-(-41.87354D)));
            yy = -56.55594D + (((tickAnim - 38D) / 2D) * (-51.08D-(-56.55594D)));
            zz = 49.54885D + (((tickAnim - 38D) / 2D) * (47.25D-(49.54885D)));
        }
        this.setRotateAngle(backlegleft3, backlegleft3.rotateAngleX + (float) Math.toRadians(xx), backlegleft3.rotateAngleY + (float) Math.toRadians(yy), backlegleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 1.57999D + (((tickAnim - 0D) / 13D) * (19.58472D-(1.57999D)));
            yy = 3.22222D + (((tickAnim - 0D) / 13D) * (14.75183D-(3.22222D)));
            zz = 10.66306D + (((tickAnim - 0D) / 13D) * (-35.20077D-(10.66306D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 19.58472D + (((tickAnim - 13D) / 5D) * (12.00992D-(19.58472D)));
            yy = 14.75183D + (((tickAnim - 13D) / 5D) * (13.00498D-(14.75183D)));
            zz = -35.20077D + (((tickAnim - 13D) / 5D) * (-1.66766D-(-35.20077D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 12.00992D + (((tickAnim - 18D) / 7D) * (19.12056D-(12.00992D)));
            yy = 13.00498D + (((tickAnim - 18D) / 7D) * (1.77754D-(13.00498D)));
            zz = -1.66766D + (((tickAnim - 18D) / 7D) * (7.5536D-(-1.66766D)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 19.12056D + (((tickAnim - 25D) / 8D) * (4.76722D-(19.12056D)));
            yy = 1.77754D + (((tickAnim - 25D) / 8D) * (21.64715D-(1.77754D)));
            zz = 7.5536D + (((tickAnim - 25D) / 8D) * (11.66126D-(7.5536D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 4.76722D + (((tickAnim - 33D) / 7D) * (1.57999D-(4.76722D)));
            yy = 21.64715D + (((tickAnim - 33D) / 7D) * (3.22222D-(21.64715D)));
            zz = 11.66126D + (((tickAnim - 33D) / 7D) * (10.66306D-(11.66126D)));
        }
        this.setRotateAngle(backlegright2, backlegright2.rotateAngleX + (float) Math.toRadians(xx), backlegright2.rotateAngleY + (float) Math.toRadians(yy), backlegright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 67.29612D + (((tickAnim - 0D) / 8D) * (-26.07105D-(67.29612D)));
            yy = 81.50283D + (((tickAnim - 0D) / 8D) * (72.86511D-(81.50283D)));
            zz = 34.61263D + (((tickAnim - 0D) / 8D) * (-32.89263D-(34.61263D)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -26.07105D + (((tickAnim - 8D) / 5D) * (-65.74536D-(-26.07105D)));
            yy = 72.86511D + (((tickAnim - 8D) / 5D) * (67.89357D-(72.86511D)));
            zz = -32.89263D + (((tickAnim - 8D) / 5D) * (-47.28416D-(-32.89263D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -65.74536D + (((tickAnim - 13D) / 5D) * (-52.13911D-(-65.74536D)));
            yy = 67.89357D + (((tickAnim - 13D) / 5D) * (51.66244D-(67.89357D)));
            zz = -47.28416D + (((tickAnim - 13D) / 5D) * (-57.25265D-(-47.28416D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -52.13911D + (((tickAnim - 18D) / 4D) * (-60.80822D-(-52.13911D)));
            yy = 51.66244D + (((tickAnim - 18D) / 4D) * (48.83592D-(51.66244D)));
            zz = -57.25265D + (((tickAnim - 18D) / 4D) * (-73.79598D-(-57.25265D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -60.80822D + (((tickAnim - 22D) / 3D) * (-70.97013D-(-60.80822D)));
            yy = 48.83592D + (((tickAnim - 22D) / 3D) * (50.94143D-(48.83592D)));
            zz = -73.79598D + (((tickAnim - 22D) / 3D) * (-85.75133D-(-73.79598D)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -70.97013D + (((tickAnim - 25D) / 8D) * (45.52371D-(-70.97013D)));
            yy = 50.94143D + (((tickAnim - 25D) / 8D) * (55.4861D-(50.94143D)));
            zz = -85.75133D + (((tickAnim - 25D) / 8D) * (-3.4574D-(-85.75133D)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 45.52371D + (((tickAnim - 33D) / 3D) * (44.58389D-(45.52371D)));
            yy = 55.4861D + (((tickAnim - 33D) / 3D) * (67.63129D-(55.4861D)));
            zz = -3.4574D + (((tickAnim - 33D) / 3D) * (17.5214D-(-3.4574D)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 44.58389D + (((tickAnim - 36D) / 4D) * (67.29612D-(44.58389D)));
            yy = 67.63129D + (((tickAnim - 36D) / 4D) * (81.50283D-(67.63129D)));
            zz = 17.5214D + (((tickAnim - 36D) / 4D) * (34.61263D-(17.5214D)));
        }
        this.setRotateAngle(backlegright3, backlegright3.rotateAngleX + (float) Math.toRadians(xx), backlegright3.rotateAngleY + (float) Math.toRadians(yy), backlegright3.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProganochelys e = (EntityPrehistoricFloraProganochelys) entity;
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
