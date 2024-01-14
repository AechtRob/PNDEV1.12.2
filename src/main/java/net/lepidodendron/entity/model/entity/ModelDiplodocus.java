package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplodocus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDiplodocus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tail9;
    private final AdvancedModelRenderer tail10;
    private final AdvancedModelRenderer tail11;
    private final AdvancedModelRenderer tail12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer rightLeg4;

    private ModelAnimator animator;

    public ModelDiplodocus() {
        this.textureWidth = 512;
        this.textureHeight = 512;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, -27.5F, 1.0F);


        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, -2.0F, 25.0F);
        this.root.addChild(hip);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 51.0F, -2.0F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 46, -14.0F, -55.25F, -6.0F, 28, 27, 26, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -6.0F, -2.0F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 141, 9, 0.5F, -14.75F, -14.25F, 0, 5, 27, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 134, -11.0F, -9.75F, -17.25F, 23, 22, 30, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 1.5F, 11.0F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.3491F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 72, -9.0F, -10.0F, -3.0F, 18, 26, 35, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 246, 19, 0.0F, -15.0F, -1.0F, 0, 5, 33, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -5.0F, 32.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 61, 253, 0.0F, -9.0F, 0.0F, 0, 5, 32, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 107, 151, -7.0F, -4.0F, -3.0F, 14, 19, 35, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 32.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1265F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 171, 174, -5.0F, -3.0F, -3.0F, 10, 14, 35, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 94, 259, 0.0F, -7.0F, 0.0F, 0, 4, 32, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 32.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1745F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 187, -4.5F, -2.0F, -3.0F, 9, 11, 35, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 257, 87, 0.0F, -6.0F, 0.0F, 0, 4, 32, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 2.0F, 32.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 191, 224, -4.0F, -3.0F, -2.0F, 8, 9, 18, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 107, 151, 0.0F, -7.0F, 0.0F, 0, 4, 16, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0436F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 202, 266, -3.5F, -2.0F, -2.0F, 7, 7, 18, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 227, 186, 0.0F, -6.0F, 0.0F, 0, 4, 16, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, 0.5F, 16.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0436F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 169, 0, -3.0F, -1.5F, -2.0F, 6, 5, 18, 0.0F, false));
        this.tail7.cubeList.add(new ModelBox(tail7, 0, 187, 0.0F, -5.5F, 0.0F, 0, 4, 16, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(-1.0F, 0.5F, 16.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.0436F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 54, 187, -1.0F, -1.5F, -2.0F, 4, 4, 18, -0.01F, false));
        this.tail8.cubeList.add(new ModelBox(tail8, 198, 52, 1.0F, -4.5F, 0.0F, 0, 3, 16, -0.01F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(1.0F, 0.25F, 15.0F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.0873F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 72, 0.0F, -4.25F, 0.0F, 0, 3, 17, 0.0F, false));
        this.tail9.cubeList.add(new ModelBox(tail9, 159, 271, -1.5F, -1.25F, 0.0F, 3, 3, 17, 0.0F, false));

        this.tail10 = new AdvancedModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 0.25F, 17.0F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.1745F, 0.0F, 0.0F);
        this.tail10.cubeList.add(new ModelBox(tail10, 164, 102, -1.0F, -1.0F, -1.0F, 2, 2, 17, 0.0F, false));
        this.tail10.cubeList.add(new ModelBox(tail10, 184, 276, 0.0F, -3.0F, 0.0F, 0, 2, 16, 0.0F, false));

        this.tail11 = new AdvancedModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.2182F, 0.0F, 0.0F);
        this.tail11.cubeList.add(new ModelBox(tail11, 43, 234, -0.5F, -0.5F, -1.0F, 1, 1, 14, 0.0F, false));
        this.tail11.cubeList.add(new ModelBox(tail11, 215, 52, 0.0F, -2.5F, 0.0F, 0, 2, 13, 0.0F, false));

        this.tail12 = new AdvancedModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.3927F, 0.0F, 0.0F);
        this.tail12.cubeList.add(new ModelBox(tail12, 136, 0, -0.5F, -0.5F, -0.25F, 1, 1, 14, -0.01F, false));
        this.tail12.cubeList.add(new ModelBox(tail12, 105, 0, 0.0F, -1.45F, -0.25F, 0, 1, 14, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -12.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -17.0F, -10.8F, -33.0F, 34, 35, 36, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -19.9F, -27.3F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 105, 0, 1.0F, -9.0F, -2.0F, 0, 5, 30, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 104, -13.0F, -4.0F, -2.0F, 28, 16, 30, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(-0.5F, -0.2F, -31.35F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 20.0F, -12.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.0908F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 202, 78, -10.0F, -18.0F, -21.0F, 21, 18, 22, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.3F, 41.35F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 89, 206, -13.0F, 4.6F, -46.0F, 27, 33, 13, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -6.5F, 0.25F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0436F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 72, 0.0F, -21.5043F, -8.0653F, 0, 5, 11, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 247, 161, -9.5F, -16.5043F, -8.0653F, 19, 27, 13, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -17.0F, -8.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1745F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 198, 0, -7.5F, -5.0F, -21.0F, 16, 27, 24, 0.0F, false));
        this.neck1.cubeList.add(new ModelBox(neck1, 224, 52, 0.5F, -10.0F, -21.0F, 0, 5, 20, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 1.5F, -21.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 171, 119, -5.5F, -6.0F, -26.0F, 12, 22, 32, 0.0F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 228, 119, 0.5F, -11.0F, -26.0F, 0, 5, 26, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.5F, -26.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.1745F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 141, 224, -4.5F, -5.0F, -26.0F, 10, 17, 29, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 260, 125, 0.5F, -9.0F, -26.0F, 0, 4, 26, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -1.5F, -26.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.0873F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 220, 224, -3.0F, -3.0F, -26.0F, 7, 12, 29, 0.0F, false));
        this.neck4.cubeList.add(new ModelBox(neck4, 72, 74, 0.5F, -6.0F, -26.0F, 0, 3, 26, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, 0.5F, -26.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.2182F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 267, 58, -2.0F, -3.0F, -13.0F, 5, 9, 15, 0.0F, false));
        this.neck5.cubeList.add(new ModelBox(neck5, 0, 134, 0.5F, -6.0F, -13.0F, 0, 3, 13, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.2182F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 136, 16, -1.5F, -1.5F, -6.0F, 4, 6, 7, -0.03F, false));
        this.neck6.cubeList.add(new ModelBox(neck6, 24, 0, 0.5F, -3.45F, -5.0F, 0, 2, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.95F, -5.35F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 81, -1.05F, -1.4493F, -7.6463F, 3, 1, 4, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.05F, -1.8226F, -2.1937F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.7418F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 72, -0.05F, -2.85F, -6.784F, 1, 1, 7, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.7854F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 78, -1.05F, -2.5127F, -3.8066F, 3, 3, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 151, -2.0F, -1.9151F, -1.7159F, 5, 5, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.7701F, -1.4684F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 77, -0.775F, 2.0553F, -7.5067F, 2, 1, 1, -0.03F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 14, 28, -1.05F, 0.5553F, -7.7567F, 3, 2, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 28, -1.525F, 0.5553F, -6.7567F, 4, 2, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.3299F, 0.2316F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0066F, 0.0056F, 0.0074F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.1417F, 0.6194F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 84, 72, -1.5F, 1.3F, -4.45F, 4, 3, 2, -0.02F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 72, -1.95F, 1.1218F, -3.391F, 4, 2, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.1417F, 0.6194F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 96, 151, -1.975F, 1.0F, -4.451F, 4, 2, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.1417F, 0.6194F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.2618F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 89, -1.5F, 1.0F, -8.7394F, 4, 2, 8, -0.01F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 80, -1.0F, 0.5F, -9.5F, 3, 1, 1, -0.04F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 72, -1.0F, 1.0F, -9.7394F, 3, 2, 2, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 2.7083F, -5.9806F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -0.05F, 0.0F);
        this.throat.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0175F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 28, -1.5F, -1.9604F, -0.166F, 3, 2, 5, -0.01F, false));

        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, -2.375F, 4.225F);
        this.throat.addChild(throat2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.325F, -4.225F);
        this.throat2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2356F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 151, -1.5F, -3.7602F, 3.5922F, 3, 3, 6, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(12.0F, 17.725F, -5.75F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0873F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 253, 266, -4.0F, -3.0F, -4.0F, 10, 17, 9, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.1745F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 0, 0, -3.0F, -3.0F, -2.0F, 8, 20, 7, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0873F, 0.0F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 93, -3.5F, -1.0F, -2.5F, 9, 6, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-4.5F, 2.0F, 0.0F);
        this.leftArm3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 7, 0.5122F, -1.5058F, -0.4294F, 1, 4, 1, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-11.0F, 17.7F, -5.75F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0873F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 253, 266, -6.0F, -3.0F, -4.0F, 10, 17, 9, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.1745F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 0, 0, -5.0F, -3.0F, -2.0F, 8, 20, 7, 0.0F, true));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 17.0F, 1.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0873F, 0.0F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 93, -5.5F, -1.0F, -2.5F, 9, 6, 6, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(4.5F, 2.0F, 0.0F);
        this.rightArm3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, -0.3491F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 7, -1.5122F, -1.5058F, -0.4294F, 1, 4, 1, 0.0F, true));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(13.5F, 3.75F, -1.75F);
        this.hip.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.0436F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 234, -6.0F, -6.0F, -10.0F, 12, 33, 18, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 27.0F, -5.0F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.1309F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 264, 202, -4.5F, -5.0F, -2.0F, 9, 25, 11, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.0873F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 255, 0, -5.5F, -1.0F, -6.5F, 11, 5, 12, 0.01F, false));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.leftLeg3.addChild(leftLeg4);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 105, 16, -5.5F, -5.0F, -3.0F, 11, 5, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-13.5F, 3.75F, -1.75F);
        this.hip.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.0436F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 234, -6.0F, -6.0F, -10.0F, 12, 33, 18, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 27.0F, -5.0F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.1309F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 264, 202, -4.5F, -5.0F, -2.0F, 9, 25, 11, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.0F, 19.0F, 4.0F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.0873F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 255, 0, -5.5F, -1.0F, -6.5F, 11, 5, 12, 0.01F, true));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(0.0F, 4.0F, -6.5F);
        this.rightLeg3.addChild(rightLeg4);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 105, 16, -5.5F, -5.0F, -3.0F, 11, 5, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.neck1.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(neck1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, -0.05F, 0.05F);
        this.setRotateAngle(neck3, -0.1F, -0.05F, 0.05F);
        this.setRotateAngle(neck4, 0.2F, 0.0F, -0.05F);
        this.setRotateAngle(neck5, 0.3F, 0.0F, -0.05F);
        this.setRotateAngle(neck5, 0.3F, 0.0F, 0.1F);
        this.setRotateAngle(head, 0.3F, 0.0F, 0.2F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.neck1.offsetY = 0.1F;
        this.neck1.offsetX = 0.0F;
        this.neck1.offsetZ = 0.1F;
        this.neck1.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.01F, -0.02F);
        this.setRotateAngle(neck2, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck3, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck4, 0.05F, -0.05F, -0.02F);
        this.setRotateAngle(neck5, 0.35F, -0.06F, -0.02F);
        this.setRotateAngle(neck6, 0.7F, -0.07F, -0.03F);
        this.setRotateAngle(head, 0.6F, -0.08F, -0.03F);
        this.setRotateAngle(tail1, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.15F, -0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail8, -0.01F, -0.15F, 0.0F);
        this.setRotateAngle(tail9, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail10, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail11, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail12, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(leftArm, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.38F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, 0.0F);
        this.hip.offsetY = -0.38F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.50F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(100);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.6F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.2F, 0.01F, -0.02F);
        this.setRotateAngle(neck2, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck3, -0.25F, -0.01F, -0.01F);
        this.setRotateAngle(neck4, 0.05F, -0.05F, -0.02F);
        this.setRotateAngle(neck5, 0.35F, -0.06F, -0.02F);
        this.setRotateAngle(neck6, 0.7F, -0.07F, -0.03F);
        this.setRotateAngle(head, 0.6F, -0.08F, -0.03F);
        this.setRotateAngle(tail1, -0.15F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.2F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.15F, -0.05F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail7, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail8, -0.01F, -0.15F, 0.0F);
        this.setRotateAngle(tail9, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail10, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail11, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(tail12, 0.0F, -0.15F, 0.0F);
        this.setRotateAngle(leftArm, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(leftArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightArm3, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg2, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg3, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg2, 0.38F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg3, 0.02F, 0.0F, 0.0F);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraDiplodocus diplo = (EntityPrehistoricFloraDiplodocus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = diplo.getJuvenile();

        if (isBaby) {
            this.neck5.scaleChildren = true;
            this.neck6.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.neck6.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1F, 1, 1F);
            this.neck6.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11, this.tail12};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        diplo.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = diplo.getTravelSpeed()/2;

            if (!diplo.isInWater()) {

                if (f3 == 0.0F || !diplo.getIsMoving()) {
                    if (diplo.getAnimation() != diplo.EAT_ANIMATION
                        && diplo.getAnimation() != diplo.DRINK_ANIMATION
                        && diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                        this.chainFlap(Neck, 0.05F, 0.05F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    if (diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                        this.chainFlap(Tail, (0.15F * 0.1F), 0.1F, 0.2F, f2, 1F);
                        this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.35F, 0.12F, f2, 1F);
                        this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.35F, 0F, f2, 1F);
                    }
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
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDiplodocus ee = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The drink anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 274;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 189) {
            xx = 6.5 + (((tickAnim - 60) / 129) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 60) / 129) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 129) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 219) {
            xx = 6.5 + (((tickAnim - 189) / 30) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 189) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 30) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 270) {
            xx = 6.5 + (((tickAnim - 219) / 51) * (0-(6.5)));
            yy = 0 + (((tickAnim - 219) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 51) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 0) / 270) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 270) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 270) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 10.5 + (((tickAnim - 71) / 13) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 13) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 133) {
            xx = 10.5 + (((tickAnim - 84) / 49) * (8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8-(10.5)));
            yy = 0 + (((tickAnim - 84) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 49) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8 + (((tickAnim - 133) / 43) * (10.5-(8+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.8)));
            yy = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 10.5 + (((tickAnim - 176) / 13) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 274) {
            xx = 10.5 + (((tickAnim - 189) / 85) * (0-(10.5)));
            yy = 0 + (((tickAnim - 189) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 85) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (2.45-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            zz = 2.45 + (((tickAnim - 71) / 13) * (2.45-(2.45)));
        }
        else if (tickAnim >= 84 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 84) / 92) * (0-(0)));
            yy = 0 + (((tickAnim - 84) / 92) * (0-(0)));
            zz = 2.45 + (((tickAnim - 84) / 92) * (2.45-(2.45)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 2.45 + (((tickAnim - 176) / 13) * (2.45-(2.45)));
        }
        else if (tickAnim >= 189 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 189) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 189) / 81) * (0-(0)));
            zz = 2.45 + (((tickAnim - 189) / 81) * (0-(2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (16.68-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 84) {
            xx = 16.68 + (((tickAnim - 74) / 10) * (18.39-(16.68)));
            yy = 0 + (((tickAnim - 74) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 10) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 121) {
            xx = 18.39 + (((tickAnim - 84) / 37) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5-(18.39)));
            yy = 0 + (((tickAnim - 84) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 37) * (0-(0)));
        }
        else if (tickAnim >= 121 && tickAnim < 176) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5 + (((tickAnim - 121) / 55) * (15.93-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135-120))*0.5)));
            yy = 0 + (((tickAnim - 121) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 121) / 55) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 15.93 + (((tickAnim - 176) / 11) * (17.39-(15.93)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 274) {
            xx = 17.39 + (((tickAnim - 187) / 87) * (0-(17.39)));
            yy = 0 + (((tickAnim - 187) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 87) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 74) / 11) * (14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 124) {
            xx = 14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 85) / 39) * (7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(14.425+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0 + (((tickAnim - 85) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 39) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 176) {
            xx = 7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 124) / 52) * (15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(7.4+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
            yy = 0 + (((tickAnim - 124) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 52) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 176) / 13) * (17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(15.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 201) {
            xx = 17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 189) / 12) * (13.25-(17.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 189) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 12) * (0-(0)));
        }
        else if (tickAnim >= 201 && tickAnim < 274) {
            xx = 13.25 + (((tickAnim - 201) / 73) * (0-(13.25)));
            yy = 0 + (((tickAnim - 201) / 73) * (0-(0)));
            zz = 0 + (((tickAnim - 201) / 73) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 0) / 74) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 74) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 74) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = 12 + (((tickAnim - 74) / 11) * (12.25-(12)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 128) {
            xx = 12.25 + (((tickAnim - 85) / 43) * (4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(12.25)));
            yy = 0 + (((tickAnim - 85) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 43) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 176) {
            xx = 4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 128) / 48) * (12-(4.715+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            yy = 0 + (((tickAnim - 128) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 48) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 12 + (((tickAnim - 176) / 11) * (12.25-(12)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 213) {
            xx = 12.25 + (((tickAnim - 187) / 26) * (3.32-(12.25)));
            yy = 0 + (((tickAnim - 187) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 26) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 274) {
            xx = 3.32 + (((tickAnim - 213) / 61) * (0-(3.32)));
            yy = 0 + (((tickAnim - 213) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 61) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 74) {
            xx = 5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 49) / 25) * (-4.5-(5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = 0 + (((tickAnim - 49) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 25) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 85) {
            xx = -4.5 + (((tickAnim - 74) / 11) * (-6.75-(-4.5)));
            yy = 0 + (((tickAnim - 74) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 11) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 107) {
            xx = -6.75 + (((tickAnim - 85) / 22) * (-11.58-(-6.75)));
            yy = 0 + (((tickAnim - 85) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 22) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 148) {
            xx = -11.58 + (((tickAnim - 107) / 41) * (0.15-(-11.58)));
            yy = 0 + (((tickAnim - 107) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 41) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 163) {
            xx = 0.15 + (((tickAnim - 148) / 15) * (1.15-(0.15)));
            yy = 0 + (((tickAnim - 148) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 15) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 176) {
            xx = 1.15 + (((tickAnim - 163) / 13) * (-3.5-(1.15)));
            yy = 0 + (((tickAnim - 163) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 13) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 186) {
            xx = -3.5 + (((tickAnim - 176) / 10) * (-5.75-(-3.5)));
            yy = 0 + (((tickAnim - 176) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 10) * (0-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 215) {
            xx = -5.75 + (((tickAnim - 186) / 29) * (-10.56-(-5.75)));
            yy = 0 + (((tickAnim - 186) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 186) / 29) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 274) {
            xx = -10.56 + (((tickAnim - 215) / 59) * (0-(-10.56)));
            yy = 0 + (((tickAnim - 215) / 59) * (0-(0)));
            zz = 0 + (((tickAnim - 215) / 59) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 74) {
            xx = 6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5 + (((tickAnim - 49) / 25) * (-7.5-(6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5)));
            yy = 0 + (((tickAnim - 49) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 25) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 84) {
            xx = -7.5 + (((tickAnim - 74) / 10) * (-12.25331-(-7.5)));
            yy = 0 + (((tickAnim - 74) / 10) * (-0.14124-(0)));
            zz = 0 + (((tickAnim - 74) / 10) * (-0.63325-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 100) {
            xx = -12.25331 + (((tickAnim - 84) / 16) * (-18.66072-(-12.25331)));
            yy = -0.14124 + (((tickAnim - 84) / 16) * (-0.02855-(-0.14124)));
            zz = -0.63325 + (((tickAnim - 84) / 16) * (-0.128-(-0.63325)));
        }
        else if (tickAnim >= 100 && tickAnim < 159) {
            xx = -18.66072 + (((tickAnim - 100) / 59) * (-1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3-(-18.66072)));
            yy = -0.02855 + (((tickAnim - 100) / 59) * (0-(-0.02855)));
            zz = -0.128 + (((tickAnim - 100) / 59) * (0-(-0.128)));
        }
        else if (tickAnim >= 159 && tickAnim < 186) {
            xx = -1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3 + (((tickAnim - 159) / 27) * (-12.25331-(-1.99+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-150))*3)));
            yy = 0 + (((tickAnim - 159) / 27) * (-0.14124-(0)));
            zz = 0 + (((tickAnim - 159) / 27) * (-0.63325-(0)));
        }
        else if (tickAnim >= 186 && tickAnim < 204) {
            xx = -12.25331 + (((tickAnim - 186) / 18) * (-14.58583-(-12.25331)));
            yy = -0.14124 + (((tickAnim - 186) / 18) * (-0.0963-(-0.14124)));
            zz = -0.63325 + (((tickAnim - 186) / 18) * (-0.43175-(-0.63325)));
        }
        else if (tickAnim >= 204 && tickAnim < 274) {
            xx = -14.58583 + (((tickAnim - 204) / 70) * (0-(-14.58583)));
            yy = -0.0963 + (((tickAnim - 204) / 70) * (0-(-0.0963)));
            zz = -0.43175 + (((tickAnim - 204) / 70) * (0-(-0.43175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 67) {
            xx = 10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 54) / 13) * (3-(10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 54) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 13) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 102) {
            xx = 3 + (((tickAnim - 67) / 35) * (-7.93-(3)));
            yy = 0 + (((tickAnim - 67) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 35) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 157) {
            xx = -7.93 + (((tickAnim - 102) / 55) * (8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(-7.93)));
            yy = 0 + (((tickAnim - 102) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 102) / 55) * (0-(0)));
        }
        else if (tickAnim >= 157 && tickAnim < 177) {
            xx = 8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 157) / 20) * (-4-(8.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 157) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 157) / 20) * (0-(0)));
        }
        else if (tickAnim >= 177 && tickAnim < 205) {
            xx = -4 + (((tickAnim - 177) / 28) * (-16.92-(-4)));
            yy = 0 + (((tickAnim - 177) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 177) / 28) * (0-(0)));
        }
        else if (tickAnim >= 205 && tickAnim < 270) {
            xx = -16.92 + (((tickAnim - 205) / 65) * (0-(-16.92)));
            yy = 0 + (((tickAnim - 205) / 65) * (0-(0)));
            zz = 0 + (((tickAnim - 205) / 65) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 106) {
            xx = -18 + (((tickAnim - 60) / 46) * (-19.25-(-18)));
            yy = 0 + (((tickAnim - 60) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 46) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 129) {
            xx = -19.25 + (((tickAnim - 106) / 23) * (-8.18-(-19.25)));
            yy = 0 + (((tickAnim - 106) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 23) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 168) {
            xx = -8.18 + (((tickAnim - 129) / 39) * (-18-(-8.18)));
            yy = 0 + (((tickAnim - 129) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 39) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 224) {
            xx = -18 + (((tickAnim - 168) / 56) * (-16.67-(-18)));
            yy = 0 + (((tickAnim - 168) / 56) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 56) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 274) {
            xx = -16.67 + (((tickAnim - 224) / 50) * (0-(-16.67)));
            yy = 0 + (((tickAnim - 224) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 83) {
            xx = 0 + (((tickAnim - 49) / 34) * (14.75-(0)));
            yy = 0 + (((tickAnim - 49) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 34) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = 14.75 + (((tickAnim - 83) / 20) * (0-(14.75)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 20) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 103) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 60) * (0-(0)));
        }
        else if (tickAnim >= 163 && tickAnim < 178) {
            xx = 0 + (((tickAnim - 163) / 15) * (15.75-(0)));
            yy = 0 + (((tickAnim - 163) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 163) / 15) * (0-(0)));
        }
        else if (tickAnim >= 178 && tickAnim < 198) {
            xx = 15.75 + (((tickAnim - 178) / 20) * (0-(15.75)));
            yy = 0 + (((tickAnim - 178) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 178) / 20) * (0-(0)));
        }
        else if (tickAnim >= 198 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 198) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 198) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 198) / 70) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 110) {
            xx = -8.25 + (((tickAnim - 60) / 50) * (1.5-(-8.25)));
            yy = 0 + (((tickAnim - 60) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 50) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 1.5 + (((tickAnim - 110) / 8) * (-1.19-(1.5)));
            yy = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 123) {
            xx = -1.19 + (((tickAnim - 118) / 5) * (1.7-(-1.19)));
            yy = 0 + (((tickAnim - 118) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 5) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 149) {
            xx = 1.7 + (((tickAnim - 123) / 26) * (6.68-(1.7)));
            yy = 0 + (((tickAnim - 123) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 26) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 154) {
            xx = 6.68 + (((tickAnim - 149) / 5) * (8.25-(6.68)));
            yy = 0 + (((tickAnim - 149) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 5) * (0-(0)));
        }
        else if (tickAnim >= 154 && tickAnim < 166) {
            xx = 8.25 + (((tickAnim - 154) / 12) * (4.56-(8.25)));
            yy = 0 + (((tickAnim - 154) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 154) / 12) * (0-(0)));
        }
        else if (tickAnim >= 166 && tickAnim < 181) {
            xx = 4.56 + (((tickAnim - 166) / 15) * (-2.15-(4.56)));
            yy = 0 + (((tickAnim - 166) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 166) / 15) * (0-(0)));
        }
        else if (tickAnim >= 181 && tickAnim < 204) {
            xx = -2.15 + (((tickAnim - 181) / 23) * (0-(-2.15)));
            yy = 0 + (((tickAnim - 181) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 181) / 23) * (0-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 204) / 16) * (4.01-(0)));
            yy = 0 + (((tickAnim - 204) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 204) / 16) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 242) {
            xx = 4.01 + (((tickAnim - 220) / 22) * (0-(4.01)));
            yy = 0 + (((tickAnim - 220) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 22) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 242) / 7) * (-3.44-(0)));
            yy = 0 + (((tickAnim - 242) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 242) / 7) * (0-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 268) {
            xx = -3.44 + (((tickAnim - 249) / 19) * (0-(-3.44)));
            yy = 0 + (((tickAnim - 249) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 249) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (1.375-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0.625 + (((tickAnim - 60) / 16) * (0.1-(0.625)));
            zz = 1.375 + (((tickAnim - 60) / 16) * (0-(1.375)));
        }
        else if (tickAnim >= 76 && tickAnim < 110) {
            xx = 0 + (((tickAnim - 76) / 34) * (0-(0)));
            yy = 0.1 + (((tickAnim - 76) / 34) * (0-(0.1)));
            zz = 0 + (((tickAnim - 76) / 34) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 110) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 110) / 8) * (0.3-(0)));
            zz = 0 + (((tickAnim - 110) / 8) * (0.875-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 154) {
            xx = 0 + (((tickAnim - 118) / 36) * (0-(0)));
            yy = 0.3 + (((tickAnim - 118) / 36) * (0-(0.3)));
            zz = 0.875 + (((tickAnim - 118) / 36) * (0-(0.875)));
        }
        else if (tickAnim >= 154 && tickAnim < 204) {
            xx = 0 + (((tickAnim - 154) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 154) / 50) * (0.625-(0)));
            zz = 0 + (((tickAnim - 154) / 50) * (1.375-(0)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 0 + (((tickAnim - 204) / 16) * (0-(0)));
            yy = 0.625 + (((tickAnim - 204) / 16) * (0.1-(0.625)));
            zz = 1.375 + (((tickAnim - 204) / 16) * (0.325-(1.375)));
        }
        else if (tickAnim >= 220 && tickAnim < 234) {
            xx = 0 + (((tickAnim - 220) / 14) * (0-(0)));
            yy = 0.1 + (((tickAnim - 220) / 14) * (0.155-(0.1)));
            zz = 0.325 + (((tickAnim - 220) / 14) * (0-(0.325)));
        }
        else if (tickAnim >= 234 && tickAnim < 242) {
            xx = 0 + (((tickAnim - 234) / 8) * (0-(0)));
            yy = 0.155 + (((tickAnim - 234) / 8) * (0-(0.155)));
            zz = 0 + (((tickAnim - 234) / 8) * (0-(0)));
        }
        else if (tickAnim >= 242 && tickAnim < 249) {
            xx = 0 + (((tickAnim - 242) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 242) / 7) * (0.3-(0)));
            zz = 0 + (((tickAnim - 242) / 7) * (0.875-(0)));
        }
        else if (tickAnim >= 249 && tickAnim < 268) {
            xx = 0 + (((tickAnim - 249) / 19) * (0-(0)));
            yy = 0.3 + (((tickAnim - 249) / 19) * (0-(0.3)));
            zz = 0.875 + (((tickAnim - 249) / 19) * (0-(0.875)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);


        if (tickAnim >= 60 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 16) * (1-(1)));
        }
        else if (tickAnim >= 76 && tickAnim < 110) {
            xx = 1 + (((tickAnim - 76) / 34) * (1-(1)));
            yy = 1 + (((tickAnim - 76) / 34) * (1-(1)));
            zz = 1 + (((tickAnim - 76) / 34) * (1-(1)));
        }
        else if (tickAnim >= 110 && tickAnim < 154) {
            xx = 1 + (((tickAnim - 110) / 44) * (1-(1)));
            yy = 1 + (((tickAnim - 110) / 44) * (1-(1)));
            zz = 1 + (((tickAnim - 110) / 44) * (1-(1)));
        }
        else if (tickAnim >= 154 && tickAnim < 204) {
            xx = 1 + (((tickAnim - 154) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 154) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 154) / 50) * (1-(1)));
        }
        else if (tickAnim >= 204 && tickAnim < 220) {
            xx = 1 + (((tickAnim - 204) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 204) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 204) / 16) * (1-(1)));
        }
        else if (tickAnim >= 220 && tickAnim < 242) {
            xx = 1 + (((tickAnim - 220) / 22) * (1-(1)));
            yy = 1 + (((tickAnim - 220) / 22) * (1-(1)));
            zz = 1 + (((tickAnim - 220) / 22) * (1-(1)));
        }
        else if (tickAnim >= 242 && tickAnim < 268) {
            xx = 1 + (((tickAnim - 242) / 26) * (1-(1)));
            yy = 1 + (((tickAnim - 242) / 26) * (1-(1)));
            zz = 1 + (((tickAnim - 242) / 26) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 14.5 + (((tickAnim - 60) / 16) * (7.07-(14.5)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 83) {
            xx = 7.07 + (((tickAnim - 76) / 7) * (12.9-(7.07)));
            yy = 0 + (((tickAnim - 76) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 7) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = 12.9 + (((tickAnim - 83) / 20) * (10.73-(12.9)));
            yy = 0 + (((tickAnim - 83) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 20) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 118) {
            xx = 10.73 + (((tickAnim - 103) / 15) * (11-(10.73)));
            yy = 0 + (((tickAnim - 103) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 15) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 143) {
            xx = 11 + (((tickAnim - 118) / 25) * (0-(11)));
            yy = 0 + (((tickAnim - 118) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 25) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 143) / 50) * (14.5-(0)));
            yy = 0 + (((tickAnim - 143) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 50) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 208) {
            xx = 14.5 + (((tickAnim - 193) / 15) * (7.07-(14.5)));
            yy = 0 + (((tickAnim - 193) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 15) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 238) {
            xx = 7.07 + (((tickAnim - 208) / 30) * (11-(7.07)));
            yy = 0 + (((tickAnim - 208) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 208) / 30) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 256) {
            xx = 11 + (((tickAnim - 238) / 18) * (0-(11)));
            yy = 0 + (((tickAnim - 238) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 16) * (0.075-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0.075 + (((tickAnim - 76) / 27) * (0.09-(0.075)));
            zz = 0 + (((tickAnim - 76) / 27) * (0.12-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 103) / 15) * (0-(0)));
            yy = 0.09 + (((tickAnim - 103) / 15) * (-0.12-(0.09)));
            zz = 0.12 + (((tickAnim - 103) / 15) * (0.25-(0.12)));
        }
        else if (tickAnim >= 118 && tickAnim < 143) {
            xx = 0 + (((tickAnim - 118) / 25) * (0-(0)));
            yy = -0.12 + (((tickAnim - 118) / 25) * (0-(-0.12)));
            zz = 0.25 + (((tickAnim - 118) / 25) * (0-(0.25)));
        }
        else if (tickAnim >= 143 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 143) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 143) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 143) / 50) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 208) {
            xx = 0 + (((tickAnim - 193) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 15) * (0-(0)));
        }
        else if (tickAnim >= 208 && tickAnim < 223) {
            xx = 0 + (((tickAnim - 208) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 208) / 15) * (0.09-(0)));
            zz = 0 + (((tickAnim - 208) / 15) * (0.12-(0)));
        }
        else if (tickAnim >= 223 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 223) / 15) * (0-(0)));
            yy = 0.09 + (((tickAnim - 223) / 15) * (-0.12-(0.09)));
            zz = 0.12 + (((tickAnim - 223) / 15) * (0.25-(0.12)));
        }
        else if (tickAnim >= 238 && tickAnim < 256) {
            xx = 0 + (((tickAnim - 238) / 18) * (0-(0)));
            yy = -0.12 + (((tickAnim - 238) / 18) * (0-(-0.12)));
            zz = 0.25 + (((tickAnim - 238) / 18) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(xx);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(yy);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(zz);


        if (tickAnim >= 60 && tickAnim < 76) {
            xx = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            yy = 1 + (((tickAnim - 60) / 16) * (1-(1)));
            zz = 1 + (((tickAnim - 60) / 16) * (1-(1)));
        }
        else if (tickAnim >= 76 && tickAnim < 118) {
            xx = 1 + (((tickAnim - 76) / 42) * (1-(1)));
            yy = 1 + (((tickAnim - 76) / 42) * (1-(1)));
            zz = 1 + (((tickAnim - 76) / 42) * (1-(1)));
        }
        else if (tickAnim >= 118 && tickAnim < 143) {
            xx = 1 + (((tickAnim - 118) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 118) / 25) * (1-(1)));
            zz = 1 + (((tickAnim - 118) / 25) * (1-(1)));
        }
        else if (tickAnim >= 143 && tickAnim < 193) {
            xx = 1 + (((tickAnim - 143) / 50) * (1-(1)));
            yy = 1 + (((tickAnim - 143) / 50) * (1-(1)));
            zz = 1 + (((tickAnim - 143) / 50) * (1-(1)));
        }
        else if (tickAnim >= 193 && tickAnim < 208) {
            xx = 1 + (((tickAnim - 193) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 193) / 15) * (1-(1)));
            zz = 1 + (((tickAnim - 193) / 15) * (1-(1)));
        }
        else if (tickAnim >= 208 && tickAnim < 238) {
            xx = 1 + (((tickAnim - 208) / 30) * (1-(1)));
            yy = 1 + (((tickAnim - 208) / 30) * (1-(1)));
            zz = 1 + (((tickAnim - 208) / 30) * (1-(1)));
        }
        else if (tickAnim >= 238 && tickAnim < 256) {
            xx = 1 + (((tickAnim - 238) / 18) * (1-(1)));
            yy = 1 + (((tickAnim - 238) / 18) * (1-(1)));
            zz = 1 + (((tickAnim - 238) / 18) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.95888-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.0067-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.95888 + (((tickAnim - 10) / 10) * (-7.98202-(-4.95888)));
            yy = 0.0067 + (((tickAnim - 10) / 10) * (1.03001-(0.0067)));
            zz = -12 + (((tickAnim - 10) / 10) * (-14.4995-(-12)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -7.98202 + (((tickAnim - 20) / 51) * (-30.23202-(-7.98202)));
            yy = 1.03001 + (((tickAnim - 20) / 51) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 20) / 51) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = -30.23202 + (((tickAnim - 71) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 13) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 71) / 13) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 84 && tickAnim < 118) {
            xx = -30.23202 + (((tickAnim - 84) / 34) * (-24.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 84) / 34) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 84) / 34) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 118 && tickAnim < 130) {
            xx = -24.23202 + (((tickAnim - 118) / 12) * (-24.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 118) / 12) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 118) / 12) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 130 && tickAnim < 176) {
            xx = -24.23202 + (((tickAnim - 130) / 46) * (-30.23202-(-24.23202)));
            yy = 1.03001 + (((tickAnim - 130) / 46) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 130) / 46) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = -30.23202 + (((tickAnim - 176) / 13) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 176) / 13) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 176) / 13) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = -30.23202 + (((tickAnim - 189) / 33) * (-16.2048-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 189) / 33) * (1.27693-(1.03001)));
            zz = -14.4995 + (((tickAnim - 189) / 33) * (-12.44603-(-14.4995)));
        }
        else if (tickAnim >= 222 && tickAnim < 247) {
            xx = -16.2048 + (((tickAnim - 222) / 25) * (-10.75-(-16.2048)));
            yy = 1.27693 + (((tickAnim - 222) / 25) * (0-(1.27693)));
            zz = -12.44603 + (((tickAnim - 222) / 25) * (0-(-12.44603)));
        }
        else if (tickAnim >= 247 && tickAnim < 274) {
            xx = -10.75 + (((tickAnim - 247) / 27) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 247) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.39-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.39 + (((tickAnim - 10) / 10) * (-0.2-(4.39)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 22) / 1) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.445 + (((tickAnim - 25) / 2) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            yy = -0.2 + (((tickAnim - 27) / 44) * (1.675-(-0.2)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 71) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 13) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 133) {
            xx = 0 + (((tickAnim - 84) / 49) * (0-(0)));
            yy = 1.675 + (((tickAnim - 84) / 49) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 84) / 49) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            yy = 1.675 + (((tickAnim - 133) / 43) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            yy = 1.675 + (((tickAnim - 176) / 13) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            yy = 1.675 + (((tickAnim - 189) / 33) * (2.125-(1.675)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 2.125 + (((tickAnim - 222) / 13) * (5.77-(2.125)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 235) / 12) * (0-(0)));
            yy = 5.77 + (((tickAnim - 235) / 12) * (0.6-(5.77)));
            zz = 0 + (((tickAnim - 235) / 12) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 247) / 1) * (0-(0)));
            yy = 0.6 + (((tickAnim - 247) / 1) * (0.985-(0.6)));
            zz = 0 + (((tickAnim - 247) / 1) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 250) {
            xx = 0 + (((tickAnim - 248) / 2) * (0-(0)));
            yy = 0.985 + (((tickAnim - 248) / 2) * (1.175-(0.985)));
            zz = 0 + (((tickAnim - 248) / 2) * (0-(0)));
        }
        else if (tickAnim >= 250 && tickAnim < 252) {
            xx = 0 + (((tickAnim - 250) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 250) / 2) * (0.985-(1.175)));
            zz = 0 + (((tickAnim - 250) / 2) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 253) {
            xx = 0 + (((tickAnim - 252) / 1) * (0-(0)));
            yy = 0.985 + (((tickAnim - 252) / 1) * (1.175-(0.985)));
            zz = 0 + (((tickAnim - 252) / 1) * (0-(0)));
        }
        else if (tickAnim >= 253 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 253) / 17) * (0-(0)));
            yy = 1.175 + (((tickAnim - 253) / 17) * (0-(1.175)));
            zz = 0 + (((tickAnim - 253) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.7246-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3737-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.56938-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.7246 + (((tickAnim - 10) / 10) * (-9.25-(5.7246)));
            yy = 0.3737 + (((tickAnim - 10) / 10) * (0-(0.3737)));
            zz = 7.56938 + (((tickAnim - 10) / 10) * (15.5-(7.56938)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 20) / 51) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 15.5 + (((tickAnim - 20) / 51) * (15.5-(15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 222) {
            xx = -5.75 + (((tickAnim - 71) / 151) * (-10.95655-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 151) * (-1.31781-(0)));
            zz = 15.5 + (((tickAnim - 71) / 151) * (11.72298-(15.5)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = -10.95655 + (((tickAnim - 222) / 13) * (0-(-10.95655)));
            yy = -1.31781 + (((tickAnim - 222) / 13) * (0-(-1.31781)));
            zz = 11.72298 + (((tickAnim - 222) / 13) * (0-(11.72298)));
        }
        else if (tickAnim >= 235 && tickAnim < 274) {
            xx = 0 + (((tickAnim - 235) / 39) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 71) / 151) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 151) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 151) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 235) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.46-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.46 + (((tickAnim - 10) / 6) * (0-(22.46)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 10.75 + (((tickAnim - 20) / 51) * (17.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 118) {
            xx = 17.75 + (((tickAnim - 71) / 47) * (15.53-(17.75)));
            yy = 0 + (((tickAnim - 71) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 47) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 133) {
            xx = 15.53 + (((tickAnim - 118) / 15) * (15.53-(15.53)));
            yy = 0 + (((tickAnim - 118) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 15) * (0-(0)));
        }
        else if (tickAnim >= 133 && tickAnim < 176) {
            xx = 15.53 + (((tickAnim - 133) / 43) * (18.54-(15.53)));
            yy = 0 + (((tickAnim - 133) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 133) / 43) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 189) {
            xx = 18.54 + (((tickAnim - 176) / 13) * (18.54-(18.54)));
            yy = 0 + (((tickAnim - 176) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 13) * (0-(0)));
        }
        else if (tickAnim >= 189 && tickAnim < 222) {
            xx = 18.54 + (((tickAnim - 189) / 33) * (12.5-(18.54)));
            yy = 0 + (((tickAnim - 189) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 189) / 33) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 12.5 + (((tickAnim - 222) / 13) * (29.28-(12.5)));
            yy = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 241) {
            xx = 29.28 + (((tickAnim - 235) / 6) * (0-(29.28)));
            yy = 0 + (((tickAnim - 235) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 6) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 241) / 6) * (6-(0)));
            yy = 0 + (((tickAnim - 241) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 6) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 274) {
            xx = 6 + (((tickAnim - 247) / 27) * (0-(6)));
            yy = 0 + (((tickAnim - 247) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 222) {
            xx = 0 + (((tickAnim - 20) / 202) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 202) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 202) * (0-(0)));
        }
        else if (tickAnim >= 222 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 222) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 222) / 13) * (0.55-(0)));
            zz = 0 + (((tickAnim - 222) / 13) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 247) {
            xx = 0 + (((tickAnim - 235) / 12) * (0-(0)));
            yy = 0.55 + (((tickAnim - 235) / 12) * (0-(0.55)));
            zz = 0 + (((tickAnim - 235) / 12) * (0-(0)));
        }
        else if (tickAnim >= 247 && tickAnim < 270) {
            xx = 0 + (((tickAnim - 247) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 247) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 247) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 140;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 6.5 + (((tickAnim - 71) / 14) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 6.5 + (((tickAnim - 85) / 55) * (0-(6.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 10.5 + (((tickAnim - 71) / 14) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 10.5 + (((tickAnim - 85) / 55) * (0-(10.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (2.45-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 2.45 + (((tickAnim - 71) / 14) * (2.45-(2.45)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 2.45 + (((tickAnim - 85) / 55) * (0-(2.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 0) / 67) * (15.43-(0)));
            yy = 0 + (((tickAnim - 0) / 67) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 67) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 85) {
            xx = 15.43 + (((tickAnim - 67) / 18) * (15.43-(15.43)));
            yy = 0 + (((tickAnim - 67) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 18) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 15.43 + (((tickAnim - 85) / 55) * (0-(15.43)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 0) / 68) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 68) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 85) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 68) / 17) * (13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 68) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 17) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1 + (((tickAnim - 85) / 55) * (0-(13.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*1)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 12 + (((tickAnim - 71) / 14) * (12-(12)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 12 + (((tickAnim - 85) / 55) * (0-(12)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1 + (((tickAnim - 49) / 22) * (-4.5-(5.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*1)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -4.5 + (((tickAnim - 71) / 14) * (-4.5-(-4.5)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -4.5 + (((tickAnim - 85) / 55) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5 + (((tickAnim - 49) / 22) * (-7.5-(6.26+Math.sin((Math.PI/180)*(((double)tickAnim/20)*130-120))*5)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 76) {
            xx = -7.5 + (((tickAnim - 71) / 5) * (-7.53456-(-7.5)));
            yy = 0 + (((tickAnim - 71) / 5) * (0.56977-(0)));
            zz = 0 + (((tickAnim - 71) / 5) * (-6.52907-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 85) {
            xx = -7.53456 + (((tickAnim - 76) / 9) * (-7.5-(-7.53456)));
            yy = 0.56977 + (((tickAnim - 76) / 9) * (0-(0.56977)));
            zz = -6.52907 + (((tickAnim - 76) / 9) * (0-(-6.52907)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -7.5 + (((tickAnim - 85) / 55) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 71) {
            xx = 10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3 + (((tickAnim - 54) / 17) * (3-(10.03+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-3)));
            yy = 0 + (((tickAnim - 54) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 17) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 3 + (((tickAnim - 71) / 7) * (-5.25-(3)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 85) {
            xx = -5.25 + (((tickAnim - 78) / 7) * (3-(-5.25)));
            yy = 0 + (((tickAnim - 78) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 7) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 3 + (((tickAnim - 85) / 55) * (0-(3)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-18-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -18 + (((tickAnim - 60) / 80) * (0-(-18)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 0) / 49) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 49) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 71) {
            xx = 7.5 + (((tickAnim - 49) / 22) * (0-(7.5)));
            yy = 0 + (((tickAnim - 49) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 22) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 71) / 7) * (21.33-(0)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 83) {
            xx = 21.33 + (((tickAnim - 78) / 5) * (0-(21.33)));
            yy = 0 + (((tickAnim - 78) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 5) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 83) / 57) * (0-(0)));
            yy = 0 + (((tickAnim - 83) / 57) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 57) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 0) / 71) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 71) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 71) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 78) {
            xx = 6 + (((tickAnim - 71) / 7) * (5.5-(6)));
            yy = 0 + (((tickAnim - 71) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 7) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 140) {
            xx = 5.5 + (((tickAnim - 78) / 62) * (0-(5.5)));
            yy = 0 + (((tickAnim - 78) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 78) / 62) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat.rotationPointX = this.throat.rotationPointX + (float)(0);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(0);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat2, throat2.rotateAngleX + (float) Math.toRadians(xx), throat2.rotateAngleY + (float) Math.toRadians(yy), throat2.rotateAngleZ + (float) Math.toRadians(zz));

        this.throat2.rotationPointX = this.throat2.rotationPointX + (float)(0);
        this.throat2.rotationPointY = this.throat2.rotationPointY - (float)(0);
        this.throat2.rotationPointZ = this.throat2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.95888-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.0067-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-12-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -4.95888 + (((tickAnim - 10) / 10) * (-7.98202-(-4.95888)));
            yy = 0.0067 + (((tickAnim - 10) / 10) * (1.03001-(0.0067)));
            zz = -12 + (((tickAnim - 10) / 10) * (-14.4995-(-12)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -7.98202 + (((tickAnim - 20) / 51) * (-30.23202-(-7.98202)));
            yy = 1.03001 + (((tickAnim - 20) / 51) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 20) / 51) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -30.23202 + (((tickAnim - 71) / 14) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 14) * (1.03001-(1.03001)));
            zz = -14.4995 + (((tickAnim - 71) / 14) * (-14.4995-(-14.4995)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -30.23202 + (((tickAnim - 85) / 55) * (0-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 85) / 55) * (0-(1.03001)));
            zz = -14.4995 + (((tickAnim - 85) / 55) * (0-(-14.4995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.39-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 4.39 + (((tickAnim - 10) / 10) * (-0.2-(4.39)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 20) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.445 + (((tickAnim - 22) / 1) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 2) * (-0.445-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.445 + (((tickAnim - 25) / 2) * (-0.2-(-0.445)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 27) / 44) * (0-(0)));
            yy = -0.2 + (((tickAnim - 27) / 44) * (1.675-(-0.2)));
            zz = 0 + (((tickAnim - 27) / 44) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 14) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 55) * (0-(1.675)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.7246-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.3737-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (7.56938-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.7246 + (((tickAnim - 10) / 10) * (-9.25-(5.7246)));
            yy = 0.3737 + (((tickAnim - 10) / 10) * (0-(0.3737)));
            zz = 7.56938 + (((tickAnim - 10) / 10) * (15.5-(7.56938)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 20) / 51) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 15.5 + (((tickAnim - 20) / 51) * (15.5-(15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 71) / 14) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 15.5 + (((tickAnim - 71) / 14) * (15.5-(15.5)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 85) / 55) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 15.5 + (((tickAnim - 85) / 55) * (0-(15.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.46-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.46 + (((tickAnim - 10) / 6) * (0-(22.46)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (10.75-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 71) {
            xx = 10.75 + (((tickAnim - 20) / 51) * (17.75-(10.75)));
            yy = 0 + (((tickAnim - 20) / 51) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 51) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 71) / 14) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 17.75 + (((tickAnim - 85) / 55) * (0-(17.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-9.91667-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (5.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 43) {
            xx = -9.91667 + (((tickAnim - 20) / 23) * (-14.5-(-9.91667)));
            yy = 0 + (((tickAnim - 20) / 23) * (0-(0)));
            zz = 5.5 + (((tickAnim - 20) / 23) * (16.5-(5.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -14.5 + (((tickAnim - 43) / 28) * (-30.23202-(-14.5)));
            yy = 0 + (((tickAnim - 43) / 28) * (1.03001-(0)));
            zz = 16.5 + (((tickAnim - 43) / 28) * (14.4995-(16.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -30.23202 + (((tickAnim - 71) / 14) * (-30.23202-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 71) / 14) * (1.03001-(1.03001)));
            zz = 14.4995 + (((tickAnim - 71) / 14) * (14.4995-(14.4995)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -30.23202 + (((tickAnim - 85) / 55) * (0-(-30.23202)));
            yy = 1.03001 + (((tickAnim - 85) / 55) * (0-(1.03001)));
            zz = 14.4995 + (((tickAnim - 85) / 55) * (0-(14.4995)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 12) * (7.375-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            yy = 7.375 + (((tickAnim - 32) / 11) * (0.475-(7.375)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 43) / 1) * (0-(0)));
            yy = 0.475 + (((tickAnim - 43) / 1) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 43) / 1) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 44) / 2) * (0-(0)));
            yy = 0.255 + (((tickAnim - 44) / 2) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 44) / 2) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 0.475 + (((tickAnim - 46) / 2) * (0.255-(0.475)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 48) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 48) / 1) * (0.475-(0.255)));
            zz = 0 + (((tickAnim - 48) / 1) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 49) / 11) * (0-(0)));
            yy = 0.475 + (((tickAnim - 49) / 11) * (2.055-(0.475)));
            zz = 0 + (((tickAnim - 49) / 11) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 71) {
            xx = 0 + (((tickAnim - 60) / 11) * (0-(0)));
            yy = 2.055 + (((tickAnim - 60) / 11) * (1.675-(2.055)));
            zz = 0 + (((tickAnim - 60) / 11) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            yy = 1.675 + (((tickAnim - 71) / 14) * (1.675-(1.675)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            yy = 1.675 + (((tickAnim - 85) / 55) * (0-(1.675)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.08333-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5.16667-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = -3.08333 + (((tickAnim - 20) / 12) * (-2.13194-(-3.08333)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = -5.16667 + (((tickAnim - 20) / 12) * (-8.18056-(-5.16667)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = -2.13194 + (((tickAnim - 32) / 11) * (-9.25-(-2.13194)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = -8.18056 + (((tickAnim - 32) / 11) * (-15.5-(-8.18056)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = -9.25 + (((tickAnim - 43) / 28) * (-5.75-(-9.25)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = -15.5 + (((tickAnim - 43) / 28) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = -5.75 + (((tickAnim - 71) / 14) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = -15.5 + (((tickAnim - 71) / 14) * (-15.5-(-15.5)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 85) / 55) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = -15.5 + (((tickAnim - 85) / 55) * (0-(-15.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));

        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(0);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(0);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (5.92-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 32) {
            xx = 5.92 + (((tickAnim - 20) / 12) * (17.12-(5.92)));
            yy = 0 + (((tickAnim - 20) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 12) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 17.12 + (((tickAnim - 32) / 11) * (9.75-(17.12)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 71) {
            xx = 9.75 + (((tickAnim - 43) / 28) * (17.75-(9.75)));
            yy = 0 + (((tickAnim - 43) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 28) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 85) {
            xx = 17.75 + (((tickAnim - 71) / 14) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 71) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 14) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 140) {
            xx = 17.75 + (((tickAnim - 85) / 55) * (0-(17.75)));
            yy = 0 + (((tickAnim - 85) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 55) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1 + (((tickAnim - 60) / 80) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/2.5+125))*1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5+125))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-1.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-2.8)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*-3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4 + (((tickAnim - 60) / 80) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*135/1.5))*4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 0) / 0) * (-(0)));
            yy = 0 + (((tickAnim - 0) / 0) * (-(0)));
            zz = 0 + (((tickAnim - 0) / 0) * (-(0)));
        }

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.75 + (((tickAnim - 20) / 10) * (-1.75-(-1.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.75 + (((tickAnim - 30) / 20) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-4.8-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -4.8 + (((tickAnim - 20) / 10) * (-4.8-(-4.8)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -4.8 + (((tickAnim - 30) / 20) * (0-(-4.8)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.9 + (((tickAnim - 20) / 10) * (2.9-(2.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.9 + (((tickAnim - 30) / 20) * (0-(2.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (1.25-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 30) / 20) * (0-(1.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.9-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 2.9 + (((tickAnim - 20) / 10) * (2.9-(2.9)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 2.9 + (((tickAnim - 30) / 20) * (0-(2.9)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.11313-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-12.77132-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5122-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.11313 + (((tickAnim - 20) / 10) * (0.11313-(0.11313)));
            yy = -12.77132 + (((tickAnim - 20) / 10) * (-12.77132-(-12.77132)));
            zz = -0.5122 + (((tickAnim - 20) / 10) * (-0.5122-(-0.5122)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.11313 + (((tickAnim - 30) / 20) * (0-(0.11313)));
            yy = -12.77132 + (((tickAnim - 30) / 20) * (0-(-12.77132)));
            zz = -0.5122 + (((tickAnim - 30) / 20) * (0-(-0.5122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 20) / 10) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 30) / 20) * (0-(24.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 10) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 20) * (0-(0.625)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0.11313-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (12.7713-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-0.5122-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0.11313 + (((tickAnim - 20) / 10) * (0.11313-(0.11313)));
            yy = 12.7713 + (((tickAnim - 20) / 10) * (12.7713-(12.7713)));
            zz = -0.5122 + (((tickAnim - 20) / 10) * (-0.5122-(-0.5122)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.11313 + (((tickAnim - 30) / 20) * (0-(0.11313)));
            yy = 12.7713 + (((tickAnim - 30) / 20) * (0-(12.7713)));
            zz = -0.5122 + (((tickAnim - 30) / 20) * (0-(-0.5122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (24.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 24.25 + (((tickAnim - 20) / 10) * (24.25-(24.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 24.25 + (((tickAnim - 30) / 20) * (0-(24.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0.625 + (((tickAnim - 20) / 10) * (0.625-(0.625)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0.625 + (((tickAnim - 30) / 20) * (0-(0.625)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 12 + (((tickAnim - 25) / 8) * (0-(12)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (-7-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -7 + (((tickAnim - 40) / 10) * (0-(-7)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (1.6-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 1.6 + (((tickAnim - 33) / 7) * (0-(1.6)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 8.75 + (((tickAnim - 25) / 8) * (2.13-(8.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.13 + (((tickAnim - 33) / 7) * (-5-(2.13)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 40) / 10) * (0-(-5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (2.325-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 2.325 + (((tickAnim - 33) / 7) * (0-(2.325)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 14.25 + (((tickAnim - 25) / 8) * (17.5-(14.25)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 17.5 + (((tickAnim - 33) / 7) * (11.25-(17.5)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 40) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -25.75 + (((tickAnim - 25) / 8) * (7-(-25.75)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 33) / 7) * (0-(7)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
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
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0.925-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0.925 + (((tickAnim - 33) / 7) * (0-(0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);

    }
    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 175;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5 + (((tickAnim - 22) / 33) * (-4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3-(0.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*0.5)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3 + (((tickAnim - 55) / 81) * (-4.5-(-4.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -4.5 + (((tickAnim - 136) / 39) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (1.25-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (-0.725-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.25 + (((tickAnim - 55) / 81) * (0-(1.25)));
            yy = -0.725 + (((tickAnim - 55) / 81) * (-0.725-(-0.725)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            yy = -0.725 + (((tickAnim - 136) / 39) * (0-(-0.725)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -6.75 + (((tickAnim - 55) / 81) * (-6.75-(-6.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 55) / 81) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -6.75 + (((tickAnim - 136) / 39) * (0-(-6.75)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5 + (((tickAnim - 136) / 39) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*0.5)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -3.25 + (((tickAnim - 55) / 81) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -3.25 + (((tickAnim - 136) / 39) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (1.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.75 + (((tickAnim - 55) / 81) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 1.75 + (((tickAnim - 136) / 39) * (0-(1.75)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (1.5-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.5 + (((tickAnim - 55) / 81) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 1.5 + (((tickAnim - 136) / 39) * (0-(1.5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 136) / 13) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = -3.5 + (((tickAnim - 149) / 26) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 149) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (-1-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -1 + (((tickAnim - 55) / 81) * (-1-(-1)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -1 + (((tickAnim - 136) / 39) * (0-(-1)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (4-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 4 + (((tickAnim - 55) / 81) * (4-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 55) / 81) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 4 + (((tickAnim - 136) / 39) * (0-(4)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1 + (((tickAnim - 136) / 39) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-150))*1)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (3-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 3 + (((tickAnim - 55) / 81) * (3-(3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 55) / 81) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 3 + (((tickAnim - 136) / 13) * (-3.43248-(3)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1 + (((tickAnim - 136) / 13) * (0.55997-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*1)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = -3.43248 + (((tickAnim - 149) / 26) * (0-(-3.43248)));
            yy = 0.55997 + (((tickAnim - 149) / 26) * (0-(0.55997)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (2.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 2.75 + (((tickAnim - 55) / 81) * (5-(2.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2 + (((tickAnim - 55) / 81) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 5 + (((tickAnim - 136) / 13) * (-0.23387-(5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2 + (((tickAnim - 136) / 13) * (-0.14223-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-180))*2)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 175) {
            xx = -0.23387 + (((tickAnim - 149) / 26) * (0-(-0.23387)));
            yy = -0.14223 + (((tickAnim - 149) / 26) * (0-(-0.14223)));
            zz = 0 + (((tickAnim - 149) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (10.75-(0)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 10.75 + (((tickAnim - 55) / 81) * (10.75-(10.75)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 10.75 + (((tickAnim - 136) / 13) * (11.64-(10.75)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 11.64 + (((tickAnim - 149) / 7) * (1.64-(11.64)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 1.64 + (((tickAnim - 156) / 19) * (0-(1.64)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 22) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 20) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (12.5-(0)));
            yy = 0 + (((tickAnim - 42) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 12.5 + (((tickAnim - 55) / 81) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 12.5 + (((tickAnim - 136) / 13) * (18.55-(12.5)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 18.55 + (((tickAnim - 149) / 7) * (7.26-(18.55)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 7.26 + (((tickAnim - 156) / 19) * (0-(7.26)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 22) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 22) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 44) / 11) * (23-(0)));
            yy = 0 + (((tickAnim - 44) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 11) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 23 + (((tickAnim - 55) / 81) * (21.25-(23)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 149) {
            xx = 21.25 + (((tickAnim - 136) / 13) * (28.36-(21.25)));
            yy = 0 + (((tickAnim - 136) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 13) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 28.36 + (((tickAnim - 149) / 7) * (30.29-(28.36)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 175) {
            xx = 30.29 + (((tickAnim - 156) / 19) * (0-(30.29)));
            yy = 0 + (((tickAnim - 156) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.925-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.925 + (((tickAnim - 22) / 33) * (-4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3-(0.925)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = -4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3 + (((tickAnim - 55) / 81) * (-5-(-4.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = -5 + (((tickAnim - 136) / 39) * (0-(-5)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));

        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0.525-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0.525 + (((tickAnim - 22) / 33) * (1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3-(0.525)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3 + (((tickAnim - 55) / 81) * (0.25-(1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-0.3)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 175) {
            xx = 0.25 + (((tickAnim - 136) / 39) * (0-(0.25)));
            yy = 0 + (((tickAnim - 136) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 175) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 175) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.38885-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-3.72472-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2 + (((tickAnim - 22) / 33) * (-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(3.9601+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-20))*-2)));
            yy = -0.38885 + (((tickAnim - 22) / 33) * (0-(-0.38885)));
            zz = -3.72472 + (((tickAnim - 22) / 33) * (-0.75-(-3.72472)));
        }
        else if (tickAnim >= 55 && tickAnim < 75) {
            xx = -0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 55) / 20) * (-1.75-(-0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 55) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 55) / 20) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = -1.75 + (((tickAnim - 75) / 24) * (-3-(-1.75)));
            yy = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            zz = -0.75 + (((tickAnim - 75) / 24) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 99 && tickAnim < 113) {
            xx = -3 + (((tickAnim - 99) / 14) * (-5-(-3)));
            yy = 0 + (((tickAnim - 99) / 14) * (0-(0)));
            zz = -0.75 + (((tickAnim - 99) / 14) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 113 && tickAnim < 159) {
            xx = -5 + (((tickAnim - 113) / 46) * (-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3-(-5)));
            yy = 0 + (((tickAnim - 113) / 46) * (0-(0)));
            zz = -0.75 + (((tickAnim - 113) / 46) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 159 && tickAnim < 175) {
            xx = -2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3 + (((tickAnim - 159) / 16) * (0-(-2.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*3)));
            yy = 0 + (((tickAnim - 159) / 16) * (0-(0)));
            zz = -0.75 + (((tickAnim - 159) / 16) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0.95);



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.48805-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.56221-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-2.436-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 65) {
            xx = -0.48805 + (((tickAnim - 22) / 43) * (-1.49892-(-0.48805)));
            yy = -0.56221 + (((tickAnim - 22) / 43) * (-0.16871-(-0.56221)));
            zz = -2.436 + (((tickAnim - 22) / 43) * (-0.73078-(-2.436)));
        }
        else if (tickAnim >= 65 && tickAnim < 75) {
            xx = -1.49892 + (((tickAnim - 65) / 10) * (-0.69892-(-1.49892)));
            yy = -0.16871 + (((tickAnim - 65) / 10) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 65) / 10) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -0.69892 + (((tickAnim - 75) / 30) * (-2.99892-(-0.69892)));
            yy = -0.16871 + (((tickAnim - 75) / 30) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 75) / 30) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 105 && tickAnim < 133) {
            xx = -2.99892 + (((tickAnim - 105) / 28) * (-1.49892-(-2.99892)));
            yy = -0.16871 + (((tickAnim - 105) / 28) * (-0.16871-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 105) / 28) * (-0.73078-(-0.73078)));
        }
        else if (tickAnim >= 133 && tickAnim < 175) {
            xx = -1.49892 + (((tickAnim - 133) / 42) * (0-(-1.49892)));
            yy = -0.16871 + (((tickAnim - 133) / 42) * (0-(-0.16871)));
            zz = -0.73078 + (((tickAnim - 133) / 42) * (0-(-0.73078)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-0.71394-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-0.88501-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-4.66701-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = -0.71394 + (((tickAnim - 22) / 29) * (-3.2491-(-0.71394)));
            yy = -0.88501 + (((tickAnim - 22) / 29) * (-0.13989-(-0.88501)));
            zz = -4.66701 + (((tickAnim - 22) / 29) * (-0.73684-(-4.66701)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -3.2491 + (((tickAnim - 51) / 32) * (-4.4991-(-3.2491)));
            yy = -0.13989 + (((tickAnim - 51) / 32) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 51) / 32) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 83 && tickAnim < 103) {
            xx = -4.4991 + (((tickAnim - 83) / 20) * (-5.7491-(-4.4991)));
            yy = -0.13989 + (((tickAnim - 83) / 20) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 83) / 20) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 103 && tickAnim < 118) {
            xx = -5.7491 + (((tickAnim - 103) / 15) * (-3.2491-(-5.7491)));
            yy = -0.13989 + (((tickAnim - 103) / 15) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 103) / 15) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 118 && tickAnim < 146) {
            xx = -3.2491 + (((tickAnim - 118) / 28) * (-4.4991-(-3.2491)));
            yy = -0.13989 + (((tickAnim - 118) / 28) * (-0.13989-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 118) / 28) * (-0.73684-(-0.73684)));
        }
        else if (tickAnim >= 146 && tickAnim < 175) {
            xx = -4.4991 + (((tickAnim - 146) / 29) * (0-(-4.4991)));
            yy = -0.13989 + (((tickAnim - 146) / 29) * (0-(-0.13989)));
            zz = -0.73684 + (((tickAnim - 146) / 29) * (0-(-0.73684)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-1.01673-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.36571-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-5.23728-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 42) {
            xx = -1.01673 + (((tickAnim - 22) / 20) * (-8.25-(-1.01673)));
            yy = 0.36571 + (((tickAnim - 22) / 20) * (0-(0.36571)));
            zz = -5.23728 + (((tickAnim - 22) / 20) * (0-(-5.23728)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -8.25 + (((tickAnim - 42) / 9) * (-7.5-(-8.25)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -7.5 + (((tickAnim - 51) / 32) * (-6.5-(-7.5)));
            yy = 0 + (((tickAnim - 51) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 32) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 107) {
            xx = -6.5 + (((tickAnim - 83) / 24) * (-8.25-(-6.5)));
            yy = 0 + (((tickAnim - 83) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 24) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -8.25 + (((tickAnim - 107) / 6) * (-8.5-(-8.25)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 148) {
            xx = -8.5 + (((tickAnim - 113) / 35) * (-6.5-(-8.5)));
            yy = 0 + (((tickAnim - 113) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 35) * (0-(0)));
        }
        else if (tickAnim >= 148 && tickAnim < 175) {
            xx = -6.5 + (((tickAnim - 148) / 27) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 148) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 148) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-7-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 22) / 29) * (-14.77-(0)));
            yy = 0 + (((tickAnim - 22) / 29) * (0-(0)));
            zz = -7 + (((tickAnim - 22) / 29) * (0-(-7)));
        }
        else if (tickAnim >= 51 && tickAnim < 83) {
            xx = -14.77 + (((tickAnim - 51) / 32) * (5-(-14.77)));
            yy = 0 + (((tickAnim - 51) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 32) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 107) {
            xx = 5 + (((tickAnim - 83) / 24) * (-11.25-(5)));
            yy = 0 + (((tickAnim - 83) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 24) * (0-(0)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -11.25 + (((tickAnim - 107) / 6) * (-14.77-(-11.25)));
            yy = 0 + (((tickAnim - 107) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 107) / 6) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 120) {
            xx = -14.77 + (((tickAnim - 113) / 7) * (-9.54-(-14.77)));
            yy = 0 + (((tickAnim - 113) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 7) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 127) {
            xx = -9.54 + (((tickAnim - 120) / 7) * (-3-(-9.54)));
            yy = 0 + (((tickAnim - 120) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 7) * (0-(0)));
        }
        else if (tickAnim >= 127 && tickAnim < 147) {
            xx = -3 + (((tickAnim - 127) / 20) * (5-(-3)));
            yy = 0 + (((tickAnim - 127) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 20) * (0-(0)));
        }
        else if (tickAnim >= 147 && tickAnim < 175) {
            xx = 5 + (((tickAnim - 147) / 28) * (0-(5)));
            yy = 0 + (((tickAnim - 147) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 147) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 51) {
            xx = -7.5 + (((tickAnim - 22) / 29) * (-13.77793-(-7.5)));
            yy = 0 + (((tickAnim - 22) / 29) * (0.15585-(0)));
            zz = 0 + (((tickAnim - 22) / 29) * (-2.74558-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 84) {
            xx = -13.77793 + (((tickAnim - 51) / 33) * (5.45877-(-13.77793)));
            yy = 0.15585 + (((tickAnim - 51) / 33) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 51) / 33) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 84 && tickAnim < 107) {
            xx = 5.45877 + (((tickAnim - 84) / 23) * (-9.25373-(5.45877)));
            yy = 0.15585 + (((tickAnim - 84) / 23) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 84) / 23) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 107 && tickAnim < 113) {
            xx = -9.25373 + (((tickAnim - 107) / 6) * (-13.77793-(-9.25373)));
            yy = 0.15585 + (((tickAnim - 107) / 6) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 107) / 6) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 113 && tickAnim < 154) {
            xx = -13.77793 + (((tickAnim - 113) / 41) * (5.45877-(-13.77793)));
            yy = 0.15585 + (((tickAnim - 113) / 41) * (0.15585-(0.15585)));
            zz = -2.74558 + (((tickAnim - 113) / 41) * (-2.74558-(-2.74558)));
        }
        else if (tickAnim >= 154 && tickAnim < 175) {
            xx = 5.45877 + (((tickAnim - 154) / 21) * (0-(5.45877)));
            yy = 0.15585 + (((tickAnim - 154) / 21) * (0-(0.15585)));
            zz = -2.74558 + (((tickAnim - 154) / 21) * (0-(-2.74558)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 39) {
            xx = -11.75 + (((tickAnim - 22) / 17) * (-14.28-(-11.75)));
            yy = 0 + (((tickAnim - 22) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 17) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 58) {
            xx = -14.28 + (((tickAnim - 39) / 19) * (-14.28-(-14.28)));
            yy = 0 + (((tickAnim - 39) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 19) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 89) {
            xx = -14.28 + (((tickAnim - 58) / 31) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3-(-14.28)));
            yy = 0 + (((tickAnim - 58) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 31) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 112) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3 + (((tickAnim - 89) / 23) * (-15.28-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1-90))*3)));
            yy = 0 + (((tickAnim - 89) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 23) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 175) {
            xx = -15.28 + (((tickAnim - 112) / 63) * (0-(-15.28)));
            yy = 0 + (((tickAnim - 112) / 63) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 63) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 38 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 38) / 13) * (13.5-(0)));
            yy = 0 + (((tickAnim - 38) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 13) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 63) {
            xx = 13.5 + (((tickAnim - 51) / 12) * (0-(13.5)));
            yy = 0 + (((tickAnim - 51) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 12) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 63) / 37) * (-1-(0)));
            yy = 0 + (((tickAnim - 63) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 37) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 113) {
            xx = -1 + (((tickAnim - 100) / 13) * (12.5-(-1)));
            yy = 0 + (((tickAnim - 100) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 13) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 12.5 + (((tickAnim - 113) / 11) * (-1-(12.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 58) {
            xx = 4.75 + (((tickAnim - 22) / 36) * (9.25-(4.75)));
            yy = 0 + (((tickAnim - 22) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 36) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 126) {
            xx = 9.25 + (((tickAnim - 58) / 68) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 68) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 175) {
            xx = 9.25 + (((tickAnim - 126) / 49) * (0-(9.25)));
            yy = 0 + (((tickAnim - 126) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 49) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 58 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 68) * (0-(0)));
            zz = 0.425 + (((tickAnim - 58) / 68) * (0.425-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.throat.rotationPointX = this.throat.rotationPointX + (float)(xx);
        this.throat.rotationPointY = this.throat.rotationPointY - (float)(yy);
        this.throat.rotationPointZ = this.throat.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 3.25 + (((tickAnim - 22) / 33) * (14.25-(3.25)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 14.25 + (((tickAnim - 55) / 81) * (14.25-(14.25)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 14.25 + (((tickAnim - 136) / 22) * (11.38-(14.25)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 11.38 + (((tickAnim - 158) / 17) * (0-(11.38)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            yy = 0.575 + (((tickAnim - 22) / 33) * (0-(0.575)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (-4.025-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            yy = -4.025 + (((tickAnim - 158) / 17) * (0-(-4.025)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 55) {
            xx = -12 + (((tickAnim - 22) / 33) * (0-(-12)));
            yy = 0 + (((tickAnim - 22) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 33) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 136) {
            xx = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 81) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 81) * (0-(0)));
        }
        else if (tickAnim >= 136 && tickAnim < 158) {
            xx = 0 + (((tickAnim - 136) / 22) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 136) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 136) / 22) * (0-(0)));
        }
        else if (tickAnim >= 158 && tickAnim < 175) {
            xx = -11.5 + (((tickAnim - 158) / 17) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 158) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 158) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 0) {
            xx = 0 + (((tickAnim - 22) / -22) * (-(0)));
            yy = 0 + (((tickAnim - 22) / -22) * (-(0)));
            zz = 0 + (((tickAnim - 22) / -22) * (-(0)));
        }

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (2.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1 + (((tickAnim - 20) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            zz = 2.5 + (((tickAnim - 20) / 100) * (0-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3 + (((tickAnim - 20) / 100) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-3)));
            yy = 0 + (((tickAnim - 20) / 100) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 100) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 86) {
            xx = 0 + (((tickAnim - 20) / 66) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 66) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 66) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 86) / 34) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 86) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 34) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 20 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 20) / 61) * (-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2-(0)));
            yy = 0 + (((tickAnim - 20) / 61) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 61) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 120) {
            xx = -3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2 + (((tickAnim - 81) / 39) * (0-(-3.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*-2)));
            yy = 0 + (((tickAnim - 81) / 39) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 39) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 120) {
            xx = -1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8 + (((tickAnim - 33) / 87) * (0-(-1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120/1.5-90))*8)));
            yy = 0 + (((tickAnim - 33) / 87) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 87) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 5.25 + (((tickAnim - 30) / 23) * (20.95-(5.25)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 23) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 88) {
            xx = 20.95 + (((tickAnim - 53) / 35) * (0-(20.95)));
            yy = 0 + (((tickAnim - 53) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 35) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 88) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 88) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 53) {
            xx = 1 + (((tickAnim - 30) / 23) * (1.2125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1-(1)));
            yy = 1 + (((tickAnim - 30) / 23) * (1.1625-(1)));
            zz = 1 + (((tickAnim - 30) / 23) * (1-(1)));
        }
        else if (tickAnim >= 53 && tickAnim < 77) {
            xx = 1.2125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1 + (((tickAnim - 53) / 24) * (1-(1.2125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*0.1)));
            yy = 1.1625 + (((tickAnim - 53) / 24) * (1-(1.1625)));
            zz = 1 + (((tickAnim - 53) / 24) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2-(0)));
            yy = 0.025 + (((tickAnim - 0) / 10) * (-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3-(0.025)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2 + (((tickAnim - 10) / 10) * (0-(1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*-2)));
            yy = -1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3 + (((tickAnim - 10) / 10) * (0.025-(-1.925+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-20))*3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));

        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.5 + (((tickAnim - 5) / 5) * (3-(1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 10) / 10) * (0-(3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.5 + (((tickAnim - 5) / 5) * (-3.5-(-1.5)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3.5 + (((tickAnim - 10) / 10) * (0-(-3.5)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 5) / 5) * (-4.25-(-2)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -4.25 + (((tickAnim - 10) / 10) * (0-(-4.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = -1.25 + (((tickAnim - 5) / 5) * (-3-(-1.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 10) / 10) * (0-(-3)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 2.25 + (((tickAnim - 5) / 5) * (0-(2.25)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-0.67-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.67 + (((tickAnim - 14) / 6) * (0-(-0.67)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 3) / 7) * (-2.75-(2)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.75 + (((tickAnim - 10) / 4) * (-3.1-(-2.75)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.1 + (((tickAnim - 14) / 6) * (0-(-3.1)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (3.25-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 3.25 + (((tickAnim - 3) / 7) * (-2.5-(3.25)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 10) / 4) * (-3.75-(-2.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -3.75 + (((tickAnim - 14) / 6) * (0-(-3.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.75 + (((tickAnim - 3) / 7) * (-1-(0.75)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -1 + (((tickAnim - 10) / 4) * (-1.75-(-1)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -1.75 + (((tickAnim - 14) / 6) * (0-(-1.75)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.5 + (((tickAnim - 9) / 11) * (0-(0.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(0);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(0);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 1.75 + (((tickAnim - 9) / 11) * (0-(1.75)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 2.5 + (((tickAnim - 9) / 11) * (0-(2.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-6.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -6.25 + (((tickAnim - 9) / 11) * (0-(-6.25)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 5.5 + (((tickAnim - 9) / 11) * (0-(5.5)));
            yy = -4.5 + (((tickAnim - 9) / 11) * (0-(-4.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.5 + (((tickAnim - 5) / 8) * (11-(4.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 11 + (((tickAnim - 13) / 7) * (0-(11)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.50107-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.0412-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 13.50107 + (((tickAnim - 5) / 8) * (-36.77887-(13.50107)));
            yy = -0.0412 + (((tickAnim - 5) / 8) * (-12.54388-(-0.0412)));
            zz = -27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3 + (((tickAnim - 5) / 8) * (2.18366-(-27.8061+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-10))*3)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -36.77887 + (((tickAnim - 13) / 7) * (0-(-36.77887)));
            yy = -12.54388 + (((tickAnim - 13) / 7) * (0-(-12.54388)));
            zz = 2.18366 + (((tickAnim - 13) / 7) * (0-(2.18366)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.675-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.675 + (((tickAnim - 8) / 5) * (2.675-(2.675)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2.675 + (((tickAnim - 13) / 7) * (0-(2.675)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-18.21853-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.77546-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (9.93468-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -18.21853 + (((tickAnim - 5) / 8) * (-22.03309-(-18.21853)));
            yy = -19.77546 + (((tickAnim - 5) / 8) * (-7.65226-(-19.77546)));
            zz = 9.93468 + (((tickAnim - 5) / 8) * (23.89096-(9.93468)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -22.03309 + (((tickAnim - 13) / 7) * (0-(-22.03309)));
            yy = -7.65226 + (((tickAnim - 13) / 7) * (0-(-7.65226)));
            zz = 23.89096 + (((tickAnim - 13) / 7) * (0-(23.89096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (26.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-5.10417-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 4) / 4) * (35.56426-(26.75)));
            yy = -5.10417 + (((tickAnim - 4) / 4) * (-12.76035-(-5.10417)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.69638-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.56426 + (((tickAnim - 8) / 5) * (-1.48451-(35.56426)));
            yy = -12.76035 + (((tickAnim - 8) / 5) * (-16.81566-(-12.76035)));
            zz = 0.69638 + (((tickAnim - 8) / 5) * (10.34377-(0.69638)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.48451 + (((tickAnim - 13) / 7) * (0-(-1.48451)));
            yy = -16.81566 + (((tickAnim - 13) / 7) * (0-(-16.81566)));
            zz = 10.34377 + (((tickAnim - 13) / 7) * (0-(10.34377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0.825-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.825 + (((tickAnim - 8) / 12) * (0-(0.825)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.74271-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.33702-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.02281-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2.74271 + (((tickAnim - 10) / 10) * (0-(2.74271)));
            yy = -0.33702 + (((tickAnim - 10) / 10) * (0-(-0.33702)));
            zz = -1.02281 + (((tickAnim - 10) / 10) * (0-(-1.02281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 10) * (0-(-0.05)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
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
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.875-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.875 + (((tickAnim - 10) / 10) * (0-(-0.875)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-5.75-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = -5.75 + (((tickAnim - 9) / 11) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 34) {
            xx = -13.25 + (((tickAnim - 0) / 34) * (21.7-(-13.25)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 21.7 + (((tickAnim - 34) / 9) * (3.08-(21.7)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 3.08 + (((tickAnim - 43) / 7) * (-13.25-(3.08)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 34) * (-2.67-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = -2.67 + (((tickAnim - 34) / 9) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.5 + (((tickAnim - 43) / 7) * (-1.15-(0.5)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 43) {
            xx = 3.75 + (((tickAnim - 0) / 43) * (-19.16-(3.75)));
            yy = 0 + (((tickAnim - 0) / 43) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 43) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -19.16 + (((tickAnim - 43) / 7) * (3.75-(-19.16)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = -1.3 + (((tickAnim - 0) / 27) * (0.505-(-1.3)));
            zz = 0 + (((tickAnim - 0) / 27) * (0.15-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            yy = 0.505 + (((tickAnim - 27) / 16) * (0.255-(0.505)));
            zz = 0.15 + (((tickAnim - 27) / 16) * (0-(0.15)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0.255 + (((tickAnim - 43) / 7) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 7.25 + (((tickAnim - 0) / 27) * (-3.93-(7.25)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = -3.93 + (((tickAnim - 27) / 7) * (-0.85-(-3.93)));
            yy = 0 + (((tickAnim - 27) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -0.85 + (((tickAnim - 34) / 9) * (38.68-(-0.85)));
            yy = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 38.68 + (((tickAnim - 43) / 3) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = -1.96 + (((tickAnim - 46) / 4) * (7.25-(-1.96)));
            yy = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 34) / 9) * (0-(0)));
            yy = 0.35 + (((tickAnim - 34) / 9) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 34) / 9) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 43) / 3) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 46) / 4) * (0-(0)));
            yy = -0.215 + (((tickAnim - 46) / 4) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 46) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6.75 + (((tickAnim - 0) / 13) * (21.7-(6.75)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 21.7 + (((tickAnim - 13) / 9) * (3.08-(21.7)));
            yy = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 3.08 + (((tickAnim - 22) / 6) * (-13.25-(3.08)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -13.25 + (((tickAnim - 28) / 22) * (6.75-(-13.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.725 + (((tickAnim - 0) / 13) * (-2.67-(-1.725)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = -2.67 + (((tickAnim - 13) / 9) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 13) / 9) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 22) / 6) * (-1.175-(0.5)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.175 + (((tickAnim - 28) / 22) * (-1.725-(-1.175)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-19.16-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -19.16 + (((tickAnim - 22) / 6) * (3.75-(-19.16)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.75 + (((tickAnim - 28) / 22) * (0-(3.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 1.025 + (((tickAnim - 0) / 22) * (0.255-(1.025)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.255 + (((tickAnim - 22) / 6) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -1.3 + (((tickAnim - 28) / 22) * (1.025-(-1.3)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -4.5 + (((tickAnim - 0) / 13) * (-0.85-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = -0.85 + (((tickAnim - 13) / 8) * (38.68-(-0.85)));
            yy = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 38.68 + (((tickAnim - 21) / 4) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -1.96 + (((tickAnim - 25) / 3) * (7.25-(-1.96)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 28) / 22) * (-4.5-(7.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 13) * (0.35-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 13) / 8) * (0-(0)));
            yy = 0.35 + (((tickAnim - 13) / 8) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 13) / 8) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.95 + (((tickAnim - 21) / 4) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 25) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 22) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = -4 + (((tickAnim - 0) / 26) * (8.25-(-4)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 8.25 + (((tickAnim - 26) / 7) * (-3.5-(8.25)));
            yy = 0 + (((tickAnim - 26) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.5 + (((tickAnim - 33) / 5) * (-8-(-3.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 33) / 5) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 38) / 12) * (-4-(-8)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 26) / 7) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-0.15)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 33) / 5) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 4.75 + (((tickAnim - 0) / 26) * (17-(4.75)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 17 + (((tickAnim - 26) / 6) * (11.05-(17)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 11.05 + (((tickAnim - 32) / 6) * (1.25-(11.05)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 38) / 12) * (4.75-(1.25)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -1.425 + (((tickAnim - 0) / 18) * (-2.575-(-1.425)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -2.575 + (((tickAnim - 18) / 8) * (-3.475-(-2.575)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = -3.475 + (((tickAnim - 26) / 6) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-3.475)));
            zz = 0 + (((tickAnim - 26) / 6) * (-1.025-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 32) / 6) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 32) / 6) * (0-(-1.025)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = -1.55 + (((tickAnim - 38) / 12) * (-1.425-(-1.55)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-13.88-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -13.88 + (((tickAnim - 18) / 8) * (-4.25-(-13.88)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -4.25 + (((tickAnim - 26) / 6) * (14.02-(-4.25)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 14.02 + (((tickAnim - 32) / 5) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -0.37 + (((tickAnim - 37) / 1) * (6.75-(-0.37)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 38) / 12) * (0-(6.75)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (1.53-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (-0.1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 1.53 + (((tickAnim - 26) / 2) * (1.78-(1.53)));
            zz = -0.1 + (((tickAnim - 26) / 2) * (0-(-0.1)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (0-(0)));
            yy = 1.78 + (((tickAnim - 28) / 4) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 28) / 4) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 2.205 + (((tickAnim - 32) / 6) * (0-(2.205)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.25 + (((tickAnim - 0) / 8) * (-3.5-(8.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -3.5 + (((tickAnim - 8) / 7) * (-8-(-3.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 8) / 7) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = -8 + (((tickAnim - 15) / 35) * (8.25-(-8)));
            yy = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 8) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 8) / 7) * (0-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 15) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 35) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 15) / 35) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 17.5 + (((tickAnim - 0) / 8) * (11.05-(17.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 11.05 + (((tickAnim - 8) / 7) * (1.25-(11.05)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 1.25 + (((tickAnim - 15) / 27) * (14.15-(1.25)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 14.15 + (((tickAnim - 42) / 8) * (17.5-(14.15)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -2 + (((tickAnim - 0) / 8) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-2)));
            zz = 0 + (((tickAnim - 0) / 8) * (-1.025-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 8) / 7) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 8) / 7) * (0-(-1.025)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = -1.55 + (((tickAnim - 15) / 27) * (-2.78-(-1.55)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -2.78 + (((tickAnim - 42) / 8) * (-2-(-2.78)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.25 + (((tickAnim - 0) / 8) * (14.02-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 14.02 + (((tickAnim - 8) / 5) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.37 + (((tickAnim - 13) / 2) * (6.75-(-0.37)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 6.75 + (((tickAnim - 15) / 27) * (-19.27-(6.75)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -19.27 + (((tickAnim - 42) / 8) * (-0.25-(-19.27)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 5) * (1.78-(0.125)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.78 + (((tickAnim - 5) / 3) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.205 + (((tickAnim - 8) / 7) * (0-(2.205)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 27) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = -0.07 + (((tickAnim - 42) / 8) * (0.125-(-0.07)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -19.5 + (((tickAnim - 26) / 6) * (4.36-(-19.5)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 4.36 + (((tickAnim - 32) / 2) * (2-(4.36)));
            yy = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 37) {
            xx = 2 + (((tickAnim - 34) / 3) * (-8.25-(2)));
            yy = 0 + (((tickAnim - 34) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 3) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -8.25 + (((tickAnim - 37) / 1) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 6) * (0.425-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0.425 + (((tickAnim - 32) / 5) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -20.25 + (((tickAnim - 0) / 8) * (4.36-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 4.36 + (((tickAnim - 8) / 1) * (2-(4.36)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 9) / 3) * (-8.25-(2)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 12) / 3) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 27) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.425-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0.425 + (((tickAnim - 8) / 4) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-150))*0.215), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), hip.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(-0.225);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-150))*0.45), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5+115))*1.3));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.78), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*0.3), chest.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-1.7));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.385), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-1.5), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5))*-0.259), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75-120))*-1.8), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.95-15))*-1.9), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.95-15))*1.5), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.4), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*1.3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.6), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*1.4), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.85));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*3.5), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*2.8), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*3.85));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*5.8), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-4.85));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75))*7.8), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*7), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-4.85));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*432/1.5-30))*15), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*9), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*5.85));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.1), neck1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.2), neck1.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*-0.3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*0.3), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*0.6));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck3.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/0.75+65))*0.285), neck4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*216/1.5))*-0.2), neck4.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+150))*1.2));

        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1 + (((tickAnim - 0) / 10) * (1.0475-(1)));
            yy = 1 + (((tickAnim - 0) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 0) / 10) * (1-(1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 1.0475 + (((tickAnim - 10) / 10) * (1-(1.0475)));
            yy = 1 + (((tickAnim - 10) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            yy = 1 + (((tickAnim - 20) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 20) / 10) * (1-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 30) / 10) * (1.0475-(1)));
            yy = 1 + (((tickAnim - 30) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 30) / 10) * (1-(1)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.0475 + (((tickAnim - 40) / 10) * (1-(1.0475)));
            yy = 1 + (((tickAnim - 40) / 10) * (1-(1)));
            zz = 1 + (((tickAnim - 40) / 10) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDiplodocus entity = (EntityPrehistoricFloraDiplodocus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -19.5 + (((tickAnim - 0) / 21) * (24.95-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 24.95 + (((tickAnim - 21) / 4) * (3.08-(24.95)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 3.08 + (((tickAnim - 25) / 5) * (-19.5-(3.08)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.15 + (((tickAnim - 0) / 2) * (-1.595-(-1.15)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -1.595 + (((tickAnim - 2) / 1) * (-1.15-(-1.595)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -1.15 + (((tickAnim - 3) / 2) * (-1.595-(-1.15)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -1.595 + (((tickAnim - 5) / 2) * (-1.15-(-1.595)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 7) / 14) * (0-(0)));
            yy = -1.15 + (((tickAnim - 7) / 14) * (-2.67-(-1.15)));
            zz = 0 + (((tickAnim - 7) / 14) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = -2.67 + (((tickAnim - 21) / 4) * (0.5-(-2.67)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.5 + (((tickAnim - 25) / 5) * (-1.15-(0.5)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 3.75 + (((tickAnim - 0) / 21) * (-10.76-(3.75)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -10.76 + (((tickAnim - 21) / 4) * (-28.66-(-10.76)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -28.66 + (((tickAnim - 25) / 5) * (3.75-(-28.66)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -1.3 + (((tickAnim - 0) / 17) * (0.505-(-1.3)));
            zz = 0 + (((tickAnim - 0) / 17) * (0.15-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = 0.505 + (((tickAnim - 17) / 8) * (0.255-(0.505)));
            zz = 0.15 + (((tickAnim - 17) / 8) * (0-(0.15)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.255 + (((tickAnim - 25) / 5) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 13.75 + (((tickAnim - 0) / 17) * (-3.93-(13.75)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -3.93 + (((tickAnim - 17) / 4) * (1.15-(-3.93)));
            yy = 0 + (((tickAnim - 17) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 4) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 1.15 + (((tickAnim - 21) / 4) * (38.68-(1.15)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 38.68 + (((tickAnim - 25) / 2) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -1.96 + (((tickAnim - 27) / 3) * (13.75-(-1.96)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 21) / 4) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = 0.95 + (((tickAnim - 25) / 2) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 27) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 0) / 8) * (32.7-(5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 32.7 + (((tickAnim - 8) / 5) * (3.08-(32.7)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 3.08 + (((tickAnim - 13) / 5) * (-21.75-(3.08)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -21.75 + (((tickAnim - 18) / 12) * (5-(-21.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -1.725 + (((tickAnim - 0) / 8) * (-3.295-(-1.725)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = -3.295 + (((tickAnim - 8) / 5) * (2-(-3.295)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 5) * (-1.175-(2)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -1.175 + (((tickAnim - 18) / 1) * (-1.625-(-1.175)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            yy = -1.625 + (((tickAnim - 19) / 2) * (-1.175-(-1.625)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = -1.175 + (((tickAnim - 21) / 2) * (-1.625-(-1.175)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -1.625 + (((tickAnim - 23) / 1) * (-1.175-(-1.625)));
            zz = 0 + (((tickAnim - 23) / 1) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -1.175 + (((tickAnim - 24) / 6) * (-1.725-(-1.175)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -1.5 + (((tickAnim - 0) / 8) * (-16.33-(-1.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -16.33 + (((tickAnim - 8) / 4) * (-26.16-(-16.33)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -26.16 + (((tickAnim - 12) / 6) * (10.25-(-26.16)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 18) / 12) * (-1.5-(10.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 1.025 + (((tickAnim - 0) / 12) * (0.255-(1.025)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0.255 + (((tickAnim - 12) / 6) * (-1.3-(0.255)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -1.3 + (((tickAnim - 18) / 12) * (1.025-(-1.3)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 0) / 8) * (-13.85-(-4.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -13.85 + (((tickAnim - 8) / 4) * (38.68-(-13.85)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 38.68 + (((tickAnim - 12) / 3) * (-1.96-(38.68)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -1.96 + (((tickAnim - 15) / 3) * (14-(-1.96)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 14 + (((tickAnim - 18) / 12) * (-4.5-(14)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 8) * (0.35-(-0.15)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.35 + (((tickAnim - 8) / 4) * (0.95-(0.35)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.95 + (((tickAnim - 12) / 3) * (-0.215-(0.95)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.215 + (((tickAnim - 15) / 3) * (0-(-0.215)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 12) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = -8.25 + (((tickAnim - 0) / 16) * (19-(-8.25)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 19 + (((tickAnim - 16) / 3) * (-6.75-(19)));
            yy = 0 + (((tickAnim - 16) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -6.75 + (((tickAnim - 19) / 4) * (-21.25-(-6.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 19) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -21.25 + (((tickAnim - 23) / 7) * (-8.25-(-21.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 2) * (-0.37-(-1.125)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.37 + (((tickAnim - 2) / 1) * (0-(-0.37)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 3) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 13) * (-1.275-(0)));
            zz = 0 + (((tickAnim - 3) / 13) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -1.275 + (((tickAnim - 16) / 3) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-1.275)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 19) / 4) * (-2.85-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = -2.85 + (((tickAnim - 23) / 2) * (-2.48-(-2.85)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -2.48 + (((tickAnim - 25) / 2) * (-1.15-(-2.48)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -1.15 + (((tickAnim - 27) / 1) * (-1.255-(-1.15)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = -1.255 + (((tickAnim - 28) / 2) * (-1.125-(-1.255)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 3.75 + (((tickAnim - 0) / 16) * (16.25-(3.75)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 16.25 + (((tickAnim - 16) / 3) * (11.05-(16.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 11.05 + (((tickAnim - 19) / 4) * (2.25-(11.05)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 23) / 7) * (3.75-(2.25)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = -1.55 + (((tickAnim - 0) / 11) * (-2.575-(-1.55)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = -2.575 + (((tickAnim - 11) / 5) * (-3.475-(-2.575)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -3.475 + (((tickAnim - 16) / 3) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-3.475)));
            zz = 0 + (((tickAnim - 16) / 3) * (-1.025-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 19) / 4) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 19) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -1.55 + (((tickAnim - 23) / 7) * (-1.55-(-1.55)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 5.5 + (((tickAnim - 0) / 11) * (-18.63-(5.5)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -18.63 + (((tickAnim - 11) / 5) * (-4.25-(-18.63)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -4.25 + (((tickAnim - 16) / 3) * (14.02-(-4.25)));
            yy = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 14.02 + (((tickAnim - 19) / 4) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -0.37 + (((tickAnim - 23) / 0) * (18.5-(-0.37)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 18.5 + (((tickAnim - 23) / 7) * (5.5-(18.5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (1.53-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (-0.1-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 1.53 + (((tickAnim - 16) / 1) * (1.78-(1.53)));
            zz = -0.1 + (((tickAnim - 16) / 1) * (0-(-0.1)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 17) / 2) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 2.205 + (((tickAnim - 19) / 4) * (0-(2.205)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 14 + (((tickAnim - 0) / 5) * (-11.75-(14)));
            yy = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -11.75 + (((tickAnim - 5) / 4) * (-22.25-(-11.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5 + (((tickAnim - 5) / 4) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*1.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 30) {
            xx = -22.25 + (((tickAnim - 9) / 21) * (14-(-22.25)));
            yy = 0 + (((tickAnim - 9) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -2.975 + (((tickAnim - 0) / 5) * (1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5-(-2.975)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5 + (((tickAnim - 5) / 4) * (-2.6-(1.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-20))*0.5)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = -2.6 + (((tickAnim - 9) / 2) * (-2.44-(-2.6)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -2.44 + (((tickAnim - 11) / 2) * (-0.925-(-2.44)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -0.925 + (((tickAnim - 13) / 1) * (-1.115-(-0.925)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = -1.115 + (((tickAnim - 14) / 2) * (-0.15-(-1.115)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 16) / 7) * (-0.3-(-0.15)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 23) / 7) * (-2.975-(-0.3)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.25 + (((tickAnim - 0) / 5) * (11.05-(29.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 11.05 + (((tickAnim - 5) / 4) * (3.5-(11.05)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 3.5 + (((tickAnim - 9) / 17) * (14.15-(3.5)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 14.15 + (((tickAnim - 26) / 4) * (29.25-(14.15)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -2 + (((tickAnim - 0) / 5) * (0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250))-(-2)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)) + (((tickAnim - 5) / 4) * (-1.55-(0.185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*250-250)))));
            zz = -1.025 + (((tickAnim - 5) / 4) * (0-(-1.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = -1.55 + (((tickAnim - 9) / 17) * (-2.78-(-1.55)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -2.78 + (((tickAnim - 26) / 4) * (-2-(-2.78)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.25 + (((tickAnim - 0) / 5) * (14.02-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 14.02 + (((tickAnim - 5) / 3) * (-0.37-(14.02)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.37 + (((tickAnim - 8) / 1) * (18.5-(-0.37)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 18.5 + (((tickAnim - 9) / 17) * (-19.27-(18.5)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -19.27 + (((tickAnim - 26) / 4) * (-0.25-(-19.27)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 3) * (1.78-(0.125)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.78 + (((tickAnim - 3) / 2) * (2.205-(1.78)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 2.205 + (((tickAnim - 5) / 4) * (0-(2.205)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 17) * (-0.07-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = -0.07 + (((tickAnim - 26) / 4) * (0.125-(-0.07)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (-10.25-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10.25 + (((tickAnim - 18) / 3) * (4.36-(-10.25)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 4.36 + (((tickAnim - 21) / 2) * (-10-(4.36)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 2) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 23) / 0) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 0) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.425-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 2) * (0-(0)));
            zz = 0.425 + (((tickAnim - 21) / 2) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg4.rotationPointX = this.leftLeg4.rotationPointX + (float)(xx);
        this.leftLeg4.rotationPointY = this.leftLeg4.rotationPointY - (float)(yy);
        this.leftLeg4.rotationPointZ = this.leftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -20.25 + (((tickAnim - 0) / 6) * (9.36-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 9.36 + (((tickAnim - 6) / 2) * (-7.75-(9.36)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -7.75 + (((tickAnim - 8) / 1) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 17) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-20.25-(0)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 1.1 + (((tickAnim - 6) / 3) * (0-(1.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg4.rotationPointX = this.rightLeg4.rotationPointX + (float)(xx);
        this.rightLeg4.rotationPointY = this.rightLeg4.rotationPointY - (float)(yy);
        this.rightLeg4.rotationPointZ = this.rightLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-150))*0.895), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.9), hip.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(-0.225+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.2);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*0.369);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.2), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+115))*1.3));

        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.8), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5))*-0.6), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.85));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-120))*-3), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*1.85));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.95-15))*-2), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.8), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*1.85));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75-15))*2), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.2), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.85));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1.3), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.4), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.85));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*1.4), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*4.8), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.85));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*3.5), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*2.8), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*3.85));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*5.8), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4.85));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75))*7.8), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*7), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-4.85));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(-1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/1.5-30))*15), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*9), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*5.85));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*0.5), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.5), neck1.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(6+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.2), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.6), neck2.rotateAngleZ + (float) Math.toRadians(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*0.4), neck3.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*-1.8));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.75+65))*-0.285), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5))*-1.5), neck4.rotateAngleZ + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1.5+150))*1.2));

        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 6.75 + (((tickAnim - 0) / 7) * (9.75-(6.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 7) / 6) * (6.75-(9.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 6.75 + (((tickAnim - 13) / 5) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 6.75 + (((tickAnim - 18) / 6) * (12.25-(6.75)));
            yy = 0 + (((tickAnim - 18) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 6) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 12.25 + (((tickAnim - 24) / 6) * (6.75-(12.25)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(-6.75), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 0) / 7) * (1.1875-(1)));
            yy = 1 + (((tickAnim - 0) / 7) * (1.3375-(1)));
            zz = 1 + (((tickAnim - 0) / 7) * (1-(1)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 1.1875 + (((tickAnim - 7) / 6) * (1-(1.1875)));
            yy = 1.3375 + (((tickAnim - 7) / 6) * (1-(1.3375)));
            zz = 1 + (((tickAnim - 7) / 6) * (1-(1)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            yy = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            zz = 1 + (((tickAnim - 13) / 5) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 1 + (((tickAnim - 18) / 6) * (1.1875-(1)));
            yy = 1 + (((tickAnim - 18) / 6) * (1.3375-(1)));
            zz = 1 + (((tickAnim - 18) / 6) * (1-(1)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 1.1875 + (((tickAnim - 24) / 6) * (1-(1.1875)));
            yy = 1.3375 + (((tickAnim - 24) / 6) * (1-(1.3375)));
            zz = 1 + (((tickAnim - 24) / 6) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.throat2.setScale((float)xx, (float)yy, (float)zz);


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiplodocus e = (EntityPrehistoricFloraDiplodocus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
