package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraSelenopeltis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelSelenopeltis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Selenopeltis;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer CEPHALONTOP;
    private final AdvancedModelRenderer CEPHALONLEFTTOP1;
    private final AdvancedModelRenderer CEPHALONLEFTTOP2;
    private final AdvancedModelRenderer CEPHALONRIGHTTOP1;
    private final AdvancedModelRenderer CEPHALONRIGHTTOP2;
    private final AdvancedModelRenderer CEPHALONLEFT1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer CEPHALONLEFTSPINE;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer CEPHALONLEFT2;
    private final AdvancedModelRenderer CEPHALONLEFT3;
    private final AdvancedModelRenderer CEPHALONRIGHT1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer CEPHALONRIGHTSPINE;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer CEPHALONRIGHT2;
    private final AdvancedModelRenderer CEPHALONRIGHT3;
    private final AdvancedModelRenderer leftAntenna;
    private final AdvancedModelRenderer rightAntenna;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer SCUTESLEFT1;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer SCUTESRIGHT1;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer SPINESLEFT1;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer SPINESRIGHT1;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer leftLeg4;
    private final AdvancedModelRenderer rightLeg4;
    private final AdvancedModelRenderer leftLeg5;
    private final AdvancedModelRenderer rightLeg5;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer SCUTESLEFT2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer SCUTESRIGHT2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer SPINESLEFT2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer SPINESRIGHT2;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leftLeg6;
    private final AdvancedModelRenderer rightLeg6;
    private final AdvancedModelRenderer leftLeg7;
    private final AdvancedModelRenderer rightLeg7;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer SCUTESLEFT3;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer SCUTESRIGHT3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer SPINESLEFT3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer SPINESRIGHT3;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer leftLeg8;
    private final AdvancedModelRenderer rightLeg8;
    private final AdvancedModelRenderer leftLeg9;
    private final AdvancedModelRenderer rightLeg9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer SCUTESLEFT4;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer SCUTESRIGHT4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer SPINESLEFT4;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer SPINESRIGHT4;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer SPINESLEFT5;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer SPINESRIGHT5;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer leftLeg10;
    private final AdvancedModelRenderer rightLeg10;

    public ModelSelenopeltis() {
        this.textureWidth = 43;
        this.textureHeight = 38;

        this.Selenopeltis = new AdvancedModelRenderer(this);
        this.Selenopeltis.setRotationPoint(0.0F, 22.25F, -4.75F);
        this.setRotateAngle(Selenopeltis, 0.0873F, 0.0F, 0.0F);
        this.Selenopeltis.cubeList.add(new ModelBox(Selenopeltis, 0, 21, -2.5F, -0.15F, -3.0F, 5, 1, 3, 0.02F, false));
        this.Selenopeltis.cubeList.add(new ModelBox(Selenopeltis, 17, 16, -2.5F, 0.2F, -3.0F, 5, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.7F, 1.0F, -1.75F);
        this.Selenopeltis.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 21, -0.5F, -1.1F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.7F, 1.0F, -1.75F);
        this.Selenopeltis.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.7854F, -0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 21, -0.5F, -1.1F, -0.5F, 1, 1, 1, 0.0F, false));

        this.CEPHALONTOP = new AdvancedModelRenderer(this);
        this.CEPHALONTOP.setRotationPoint(0.0F, -0.15F, -2.5F);
        this.Selenopeltis.addChild(CEPHALONTOP);
        this.setRotateAngle(CEPHALONTOP, 0.1745F, 0.0F, 0.0F);
        this.CEPHALONTOP.cubeList.add(new ModelBox(CEPHALONTOP, 31, 14, -2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));
        this.CEPHALONTOP.cubeList.add(new ModelBox(CEPHALONTOP, 12, 26, -1.0F, 0.0F, 2.0F, 2, 1, 1, 0.0F, false));

        this.CEPHALONLEFTTOP1 = new AdvancedModelRenderer(this);
        this.CEPHALONLEFTTOP1.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.CEPHALONTOP.addChild(CEPHALONLEFTTOP1);
        this.setRotateAngle(CEPHALONLEFTTOP1, 0.0F, 0.2618F, 0.0F);
        this.CEPHALONLEFTTOP1.cubeList.add(new ModelBox(CEPHALONLEFTTOP1, 24, 31, -0.5F, 0.05F, 0.0F, 1, 0, 4, 0.0F, false));

        this.CEPHALONLEFTTOP2 = new AdvancedModelRenderer(this);
        this.CEPHALONLEFTTOP2.setRotationPoint(0.0F, 0.05F, 4.0F);
        this.CEPHALONLEFTTOP1.addChild(CEPHALONLEFTTOP2);
        this.setRotateAngle(CEPHALONLEFTTOP2, -0.1309F, 0.0F, 0.0F);
        this.CEPHALONLEFTTOP2.cubeList.add(new ModelBox(CEPHALONLEFTTOP2, 10, 32, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.CEPHALONRIGHTTOP1 = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHTTOP1.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.CEPHALONTOP.addChild(CEPHALONRIGHTTOP1);
        this.setRotateAngle(CEPHALONRIGHTTOP1, 0.0F, -0.2618F, 0.0F);
        this.CEPHALONRIGHTTOP1.cubeList.add(new ModelBox(CEPHALONRIGHTTOP1, 24, 31, -0.5F, 0.05F, 0.0F, 1, 0, 4, 0.0F, true));

        this.CEPHALONRIGHTTOP2 = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHTTOP2.setRotationPoint(0.0F, 0.05F, 4.0F);
        this.CEPHALONRIGHTTOP1.addChild(CEPHALONRIGHTTOP2);
        this.setRotateAngle(CEPHALONRIGHTTOP2, -0.1309F, 0.0F, 0.0F);
        this.CEPHALONRIGHTTOP2.cubeList.add(new ModelBox(CEPHALONRIGHTTOP2, 10, 32, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, true));

        this.CEPHALONLEFT1 = new AdvancedModelRenderer(this);
        this.CEPHALONLEFT1.setRotationPoint(1.0F, 0.9F, -0.25F);
        this.Selenopeltis.addChild(CEPHALONLEFT1);
        this.setRotateAngle(CEPHALONLEFT1, 0.0F, -0.1309F, 0.0873F);
        this.CEPHALONLEFT1.cubeList.add(new ModelBox(CEPHALONLEFT1, 17, 21, 0.0F, -1.0F, -3.25F, 4, 1, 3, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.CEPHALONLEFT1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 36, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.CEPHALONLEFTSPINE = new AdvancedModelRenderer(this);
        this.CEPHALONLEFTSPINE.setRotationPoint(3.85F, -1.0F, -1.5F);
        this.CEPHALONLEFT1.addChild(CEPHALONLEFTSPINE);
        this.setRotateAngle(CEPHALONLEFTSPINE, -0.0475F, -0.346F, 0.1392F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.CEPHALONLEFTSPINE.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 12, 1.25F, 0.0F, -0.1F, 7, 0, 1, 0.0F, false));

        this.CEPHALONLEFT2 = new AdvancedModelRenderer(this);
        this.CEPHALONLEFT2.setRotationPoint(3.0F, 0.0F, -3.25F);
        this.CEPHALONLEFT1.addChild(CEPHALONLEFT2);
        this.setRotateAngle(CEPHALONLEFT2, 0.0F, -0.829F, 0.0F);
        this.CEPHALONLEFT2.cubeList.add(new ModelBox(CEPHALONLEFT2, 8, 36, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.CEPHALONLEFT3 = new AdvancedModelRenderer(this);
        this.CEPHALONLEFT3.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.CEPHALONLEFT2.addChild(CEPHALONLEFT3);
        this.setRotateAngle(CEPHALONLEFT3, 0.0F, -0.48F, 0.0F);
        this.CEPHALONLEFT3.cubeList.add(new ModelBox(CEPHALONLEFT3, 36, 0, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));
        this.CEPHALONLEFT3.cubeList.add(new ModelBox(CEPHALONLEFT3, 34, 35, 0.35F, -1.0F, 0.0F, 1, 1, 1, -0.02F, false));

        this.CEPHALONRIGHT1 = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHT1.setRotationPoint(-1.0F, 0.9F, -0.25F);
        this.Selenopeltis.addChild(CEPHALONRIGHT1);
        this.setRotateAngle(CEPHALONRIGHT1, 0.0F, 0.1309F, -0.0873F);
        this.CEPHALONRIGHT1.cubeList.add(new ModelBox(CEPHALONRIGHT1, 17, 21, -4.0F, -1.0F, -3.25F, 4, 1, 3, 0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -3.25F);
        this.CEPHALONRIGHT1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 36, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.CEPHALONRIGHTSPINE = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHTSPINE.setRotationPoint(-3.85F, -1.0F, -1.5F);
        this.CEPHALONRIGHT1.addChild(CEPHALONRIGHTSPINE);
        this.setRotateAngle(CEPHALONRIGHTSPINE, -0.0475F, 0.346F, -0.1392F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.CEPHALONRIGHTSPINE.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 12, -8.25F, 0.0F, -0.1F, 7, 0, 1, 0.0F, true));

        this.CEPHALONRIGHT2 = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHT2.setRotationPoint(-3.0F, 0.0F, -3.25F);
        this.CEPHALONRIGHT1.addChild(CEPHALONRIGHT2);
        this.setRotateAngle(CEPHALONRIGHT2, 0.0F, 0.829F, 0.0F);
        this.CEPHALONRIGHT2.cubeList.add(new ModelBox(CEPHALONRIGHT2, 8, 36, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.CEPHALONRIGHT3 = new AdvancedModelRenderer(this);
        this.CEPHALONRIGHT3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.CEPHALONRIGHT2.addChild(CEPHALONRIGHT3);
        this.setRotateAngle(CEPHALONRIGHT3, 0.0F, 0.48F, 0.0F);
        this.CEPHALONRIGHT3.cubeList.add(new ModelBox(CEPHALONRIGHT3, 36, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));
        this.CEPHALONRIGHT3.cubeList.add(new ModelBox(CEPHALONRIGHT3, 34, 35, -1.35F, -1.0F, 0.0F, 1, 1, 1, -0.02F, true));

        this.leftAntenna = new AdvancedModelRenderer(this);
        this.leftAntenna.setRotationPoint(0.75F, 1.25F, -2.0F);
        this.Selenopeltis.addChild(leftAntenna);
        this.leftAntenna.cubeList.add(new ModelBox(leftAntenna, 0, 16, 0.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, false));

        this.rightAntenna = new AdvancedModelRenderer(this);
        this.rightAntenna.setRotationPoint(-0.75F, 1.25F, -2.0F);
        this.Selenopeltis.addChild(rightAntenna);
        this.rightAntenna.cubeList.add(new ModelBox(rightAntenna, 0, 16, -4.0F, 0.0F, -4.0F, 4, 0, 4, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(1.0F, 1.0F, -2.25F);
        this.Selenopeltis.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.0F, 0.0F, 0.1745F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-1.0F, 1.0F, -2.25F);
        this.Selenopeltis.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.0F, 0.0F, -0.1745F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(1.0F, 1.0F, -0.75F);
        this.Selenopeltis.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, 0.0F, 0.2182F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-1.0F, 1.0F, -0.75F);
        this.Selenopeltis.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.0F, -0.2182F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Selenopeltis.addChild(body1);
        this.setRotateAngle(body1, -0.1309F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 0, 9, -2.0F, 0.0F, -0.25F, 4, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.5F, 0.25F);
        this.body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 26, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.SCUTESLEFT1 = new AdvancedModelRenderer(this);
        this.SCUTESLEFT1.setRotationPoint(0.0F, 0.1F, 4.75F);
        this.body1.addChild(SCUTESLEFT1);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESLEFT1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.0873F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 36, 0.749F, -0.0891F, -4.9998F, 1, 1, 1, -0.01F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 36, 0.749F, -0.0891F, -2.9998F, 1, 1, 1, -0.01F, false));

        this.SCUTESRIGHT1 = new AdvancedModelRenderer(this);
        this.SCUTESRIGHT1.setRotationPoint(0.0F, 0.1F, 4.75F);
        this.body1.addChild(SCUTESRIGHT1);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESRIGHT1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.0873F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 36, -1.749F, -0.0891F, -4.9998F, 1, 1, 1, -0.01F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 36, -1.749F, -0.0891F, -2.9998F, 1, 1, 1, -0.01F, true));

        this.SPINESLEFT1 = new AdvancedModelRenderer(this);
        this.SPINESLEFT1.setRotationPoint(2.0F, 0.5F, 1.75F);
        this.body1.addChild(SPINESLEFT1);
        this.setRotateAngle(SPINESLEFT1, 0.0F, 0.0F, 0.1309F);
        this.SPINESLEFT1.cubeList.add(new ModelBox(SPINESLEFT1, 12, 10, -0.5F, -0.06F, -3.0F, 3, 0, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.0F, 0.05F, -1.5F);
        this.SPINESLEFT1.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 31, 0.0F, -0.06F, -0.5F, 5, 0, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(2.0F, 0.05F, 0.25F);
        this.SPINESLEFT1.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0641F, -0.9585F, -0.0759F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, -0.04F, -0.5F, 13, 0, 3, 0.0F, false));

        this.SPINESRIGHT1 = new AdvancedModelRenderer(this);
        this.SPINESRIGHT1.setRotationPoint(-2.0F, 0.5F, 1.75F);
        this.body1.addChild(SPINESRIGHT1);
        this.setRotateAngle(SPINESRIGHT1, 0.0F, 0.0F, -0.1309F);
        this.SPINESRIGHT1.cubeList.add(new ModelBox(SPINESRIGHT1, 12, 10, -2.5F, -0.06F, -3.0F, 3, 0, 5, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-2.0F, 0.05F, -1.5F);
        this.SPINESRIGHT1.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 31, -5.0F, -0.06F, -0.5F, 5, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, 0.05F, 0.25F);
        this.SPINESRIGHT1.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0641F, 0.9585F, 0.0759F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -13.0F, -0.04F, -0.5F, 13, 0, 3, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(1.0F, 1.0F, 0.75F);
        this.body1.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, 0.0F, 0.2182F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-1.0F, 1.0F, 0.75F);
        this.body1.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.0F, -0.2182F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRenderer(this);
        this.leftLeg4.setRotationPoint(1.0F, 1.0F, 2.25F);
        this.body1.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.0F, 0.0F, 0.2182F);
        this.leftLeg4.cubeList.add(new ModelBox(leftLeg4, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRenderer(this);
        this.rightLeg4.setRotationPoint(-1.0F, 1.0F, 2.25F);
        this.body1.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.0F, 0.0F, -0.2182F);
        this.rightLeg4.cubeList.add(new ModelBox(rightLeg4, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg5 = new AdvancedModelRenderer(this);
        this.leftLeg5.setRotationPoint(1.0F, 1.0F, 3.75F);
        this.body1.addChild(leftLeg5);
        this.setRotateAngle(leftLeg5, 0.0F, 0.0F, 0.2182F);
        this.leftLeg5.cubeList.add(new ModelBox(leftLeg5, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg5 = new AdvancedModelRenderer(this);
        this.rightLeg5.setRotationPoint(-1.0F, 1.0F, 3.75F);
        this.body1.addChild(rightLeg5);
        this.setRotateAngle(rightLeg5, 0.0F, 0.0F, -0.2182F);
        this.rightLeg5.cubeList.add(new ModelBox(rightLeg5, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.75F);
        this.body1.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 26, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 18, -1.0F, 0.0F, 4.0F, 2, 1, 3, 0.01F, false));

        this.SCUTESLEFT2 = new AdvancedModelRenderer(this);
        this.SCUTESLEFT2.setRotationPoint(-0.05F, 0.1F, 1.0F);
        this.body2.addChild(SCUTESLEFT2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESLEFT2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.0873F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 36, 0.499F, -0.0891F, 1.0002F, 1, 1, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.05F, 0.0F, 0.0F);
        this.SCUTESLEFT2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.0873F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 36, 0.749F, -0.0891F, -0.9998F, 1, 1, 1, -0.01F, false));

        this.SCUTESRIGHT2 = new AdvancedModelRenderer(this);
        this.SCUTESRIGHT2.setRotationPoint(0.05F, 0.1F, 1.0F);
        this.body2.addChild(SCUTESRIGHT2);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESRIGHT2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, 0.0873F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 36, -1.499F, -0.0891F, 1.0002F, 1, 1, 1, -0.01F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.05F, 0.0F, 0.0F);
        this.SCUTESRIGHT2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0873F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 25, 36, -1.749F, -0.0891F, -0.9998F, 1, 1, 1, -0.01F, true));

        this.SPINESLEFT2 = new AdvancedModelRenderer(this);
        this.SPINESLEFT2.setRotationPoint(2.0F, 0.5F, 1.5F);
        this.body2.addChild(SPINESLEFT2);
        this.setRotateAngle(SPINESLEFT2, 0.0F, 0.0F, 0.1309F);
        this.SPINESLEFT2.cubeList.add(new ModelBox(SPINESLEFT2, 24, 7, -0.75F, 0.0F, -2.5F, 3, 0, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.0F, 0.05F, -1.75F);
        this.SPINESLEFT2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0684F, -1.0021F, -0.0811F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.25F, 0.02F, -0.25F, 13, 0, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.85F, 0.05F, -0.75F);
        this.SPINESLEFT2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0754F, -1.0456F, -0.0871F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.75F, 0.12F, 0.15F, 13, 0, 3, 0.0F, false));

        this.SPINESRIGHT2 = new AdvancedModelRenderer(this);
        this.SPINESRIGHT2.setRotationPoint(-2.0F, 0.5F, 1.5F);
        this.body2.addChild(SPINESRIGHT2);
        this.setRotateAngle(SPINESRIGHT2, 0.0F, 0.0F, -0.1309F);
        this.SPINESRIGHT2.cubeList.add(new ModelBox(SPINESRIGHT2, 24, 7, -2.25F, 0.0F, -2.5F, 3, 0, 4, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.0F, 0.05F, -1.75F);
        this.SPINESRIGHT2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0684F, 1.0021F, 0.0811F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -13.25F, 0.02F, -0.25F, 13, 0, 3, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.85F, 0.05F, -0.75F);
        this.SPINESRIGHT2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0754F, 1.0456F, 0.0871F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -13.75F, 0.12F, 0.15F, 13, 0, 3, 0.0F, true));

        this.leftLeg6 = new AdvancedModelRenderer(this);
        this.leftLeg6.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.body2.addChild(leftLeg6);
        this.setRotateAngle(leftLeg6, 0.0F, 0.0F, 0.1745F);
        this.leftLeg6.cubeList.add(new ModelBox(leftLeg6, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg6 = new AdvancedModelRenderer(this);
        this.rightLeg6.setRotationPoint(-1.0F, 1.0F, 1.5F);
        this.body2.addChild(rightLeg6);
        this.setRotateAngle(rightLeg6, 0.0F, 0.0F, -0.1745F);
        this.rightLeg6.cubeList.add(new ModelBox(rightLeg6, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg7 = new AdvancedModelRenderer(this);
        this.leftLeg7.setRotationPoint(0.75F, 1.0F, 3.0F);
        this.body2.addChild(leftLeg7);
        this.setRotateAngle(leftLeg7, 0.0F, 0.0F, 0.1745F);
        this.leftLeg7.cubeList.add(new ModelBox(leftLeg7, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg7 = new AdvancedModelRenderer(this);
        this.rightLeg7.setRotationPoint(-0.75F, 1.0F, 3.0F);
        this.body2.addChild(rightLeg7);
        this.setRotateAngle(rightLeg7, 0.0F, 0.0F, -0.1745F);
        this.rightLeg7.cubeList.add(new ModelBox(rightLeg7, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 28, 26, -1.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.5F, -6.5F);
        this.body3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0436F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 29, 0, -0.5F, 0.0F, 7.0F, 1, 1, 4, -0.01F, false));

        this.SCUTESLEFT3 = new AdvancedModelRenderer(this);
        this.SCUTESLEFT3.setRotationPoint(-0.05F, 0.1F, -2.0F);
        this.body3.addChild(SCUTESLEFT3);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESLEFT3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, -0.0873F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 36, 0.399F, -0.0891F, 3.0002F, 1, 1, 1, -0.01F, false));

        this.SCUTESRIGHT3 = new AdvancedModelRenderer(this);
        this.SCUTESRIGHT3.setRotationPoint(0.05F, 0.1F, -2.0F);
        this.body3.addChild(SCUTESRIGHT3);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESRIGHT3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0F, 0.0873F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 36, -1.399F, -0.0891F, 3.0002F, 1, 1, 1, -0.01F, true));

        this.SPINESLEFT3 = new AdvancedModelRenderer(this);
        this.SPINESLEFT3.setRotationPoint(1.5F, 0.5F, 1.0F);
        this.body3.addChild(SPINESLEFT3);
        this.setRotateAngle(SPINESLEFT3, 0.0F, 0.0F, 0.1309F);
        this.SPINESLEFT3.cubeList.add(new ModelBox(SPINESLEFT3, 0, 31, -0.5F, 0.0F, -2.0F, 3, 0, 3, 0.0F, false));
        this.SPINESLEFT3.cubeList.add(new ModelBox(SPINESLEFT3, 0, 35, -0.75F, 0.0F, 1.0F, 3, 0, 1, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.85F, 0.05F, 1.0F);
        this.SPINESLEFT3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1075F, -1.1845F, -0.116F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 4, 0.0F, 0.02F, -0.5F, 12, 0, 2, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(2.1F, 0.05F, -0.25F);
        this.SPINESLEFT3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0854F, -1.0977F, -0.0959F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 0, 0.0F, 0.01F, -0.5F, 13, 0, 3, 0.0F, false));

        this.SPINESRIGHT3 = new AdvancedModelRenderer(this);
        this.SPINESRIGHT3.setRotationPoint(-1.5F, 0.5F, 1.0F);
        this.body3.addChild(SPINESRIGHT3);
        this.setRotateAngle(SPINESRIGHT3, 0.0F, 0.0F, -0.1309F);
        this.SPINESRIGHT3.cubeList.add(new ModelBox(SPINESRIGHT3, 0, 31, -2.5F, 0.0F, -2.0F, 3, 0, 3, 0.0F, true));
        this.SPINESRIGHT3.cubeList.add(new ModelBox(SPINESRIGHT3, 0, 35, -2.25F, 0.0F, 1.0F, 3, 0, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.85F, 0.05F, 1.0F);
        this.SPINESRIGHT3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1075F, 1.1845F, 0.116F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 4, -12.0F, 0.02F, -0.5F, 12, 0, 2, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-2.1F, 0.05F, -0.25F);
        this.SPINESRIGHT3.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0854F, 1.0977F, 0.0959F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -13.0F, 0.01F, -0.5F, 13, 0, 3, 0.0F, true));

        this.leftLeg8 = new AdvancedModelRenderer(this);
        this.leftLeg8.setRotationPoint(0.5F, 1.0F, 1.5F);
        this.body3.addChild(leftLeg8);
        this.setRotateAngle(leftLeg8, 0.0F, 0.0F, 0.1309F);
        this.leftLeg8.cubeList.add(new ModelBox(leftLeg8, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg8 = new AdvancedModelRenderer(this);
        this.rightLeg8.setRotationPoint(-0.5F, 1.0F, 1.5F);
        this.body3.addChild(rightLeg8);
        this.setRotateAngle(rightLeg8, 0.0F, 0.0F, -0.1309F);
        this.rightLeg8.cubeList.add(new ModelBox(rightLeg8, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.leftLeg9 = new AdvancedModelRenderer(this);
        this.leftLeg9.setRotationPoint(0.25F, 1.0F, 3.0F);
        this.body3.addChild(leftLeg9);
        this.setRotateAngle(leftLeg9, 0.0F, 0.0F, 0.1309F);
        this.leftLeg9.cubeList.add(new ModelBox(leftLeg9, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg9 = new AdvancedModelRenderer(this);
        this.rightLeg9.setRotationPoint(-0.25F, 1.0F, 3.0F);
        this.body3.addChild(rightLeg9);
        this.setRotateAngle(rightLeg9, 0.0F, 0.0F, -0.1309F);
        this.rightLeg9.cubeList.add(new ModelBox(rightLeg9, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 32, 23, -1.5F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 13, 16, -1.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 35, 6, -1.0F, 0.5F, 2.0F, 2, 0, 1, 0.0F, false));

        this.SCUTESLEFT4 = new AdvancedModelRenderer(this);
        this.SCUTESLEFT4.setRotationPoint(-0.05F, 0.1F, -5.0F);
        this.body4.addChild(SCUTESLEFT4);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESLEFT4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0F, -0.0873F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 25, 36, 0.149F, -0.0891F, 5.0002F, 1, 1, 1, -0.01F, false));

        this.SCUTESRIGHT4 = new AdvancedModelRenderer(this);
        this.SCUTESRIGHT4.setRotationPoint(0.05F, 0.1F, -5.0F);
        this.body4.addChild(SCUTESRIGHT4);


        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SCUTESRIGHT4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, 0.0F, 0.0873F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 36, -1.149F, -0.0891F, 5.0002F, 1, 1, 1, -0.01F, true));

        this.SPINESLEFT4 = new AdvancedModelRenderer(this);
        this.SPINESLEFT4.setRotationPoint(1.5F, 0.5F, 0.5F);
        this.body4.addChild(SPINESLEFT4);
        this.setRotateAngle(SPINESLEFT4, 0.0F, 0.0F, 0.1309F);
        this.SPINESLEFT4.cubeList.add(new ModelBox(SPINESLEFT4, 17, 34, -0.25F, 0.07F, -1.5F, 2, 0, 2, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(1.45F, 0.05F, -0.75F);
        this.SPINESLEFT4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.1671F, -1.3141F, -0.1726F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 7, 0.0F, 0.08F, -0.5F, 11, 0, 1, 0.0F, false));

        this.SPINESRIGHT4 = new AdvancedModelRenderer(this);
        this.SPINESRIGHT4.setRotationPoint(-1.5F, 0.5F, 0.5F);
        this.body4.addChild(SPINESRIGHT4);
        this.setRotateAngle(SPINESRIGHT4, 0.0F, 0.0F, -0.1309F);
        this.SPINESRIGHT4.cubeList.add(new ModelBox(SPINESRIGHT4, 17, 34, -1.75F, 0.07F, -1.5F, 2, 0, 2, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.45F, 0.05F, -0.75F);
        this.SPINESRIGHT4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.1671F, 1.3141F, 0.1726F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 7, -11.0F, 0.08F, -0.5F, 11, 0, 1, 0.0F, true));

        this.SPINESLEFT5 = new AdvancedModelRenderer(this);
        this.SPINESLEFT5.setRotationPoint(1.0F, 0.5F, 1.5F);
        this.body4.addChild(SPINESLEFT5);
        this.setRotateAngle(SPINESLEFT5, 0.0F, 0.0F, 0.1309F);
        this.SPINESLEFT5.cubeList.add(new ModelBox(SPINESLEFT5, 35, 8, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));
        this.SPINESLEFT5.cubeList.add(new ModelBox(SPINESLEFT5, 0, 37, 0.0F, 0.05F, 0.25F, 1, 0, 1, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.55F, 0.05F, 1.0F);
        this.SPINESLEFT5.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, -1.5359F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 26, 0.0F, 0.05F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.55F, 0.05F, -0.75F);
        this.SPINESLEFT5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -1.405F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 16, 32, 0.0F, 0.03F, -0.25F, 4, 0, 1, 0.0F, false));

        this.SPINESRIGHT5 = new AdvancedModelRenderer(this);
        this.SPINESRIGHT5.setRotationPoint(-1.0F, 0.5F, 1.5F);
        this.body4.addChild(SPINESRIGHT5);
        this.setRotateAngle(SPINESRIGHT5, 0.0F, 0.0F, -0.1309F);
        this.SPINESRIGHT5.cubeList.add(new ModelBox(SPINESRIGHT5, 35, 8, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));
        this.SPINESRIGHT5.cubeList.add(new ModelBox(SPINESRIGHT5, 0, 37, -1.0F, 0.05F, 0.25F, 1, 0, 1, 0.0F, true));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-0.55F, 0.05F, 1.0F);
        this.SPINESRIGHT5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, 1.5359F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 24, 26, -2.0F, 0.05F, -0.5F, 2, 0, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.55F, 0.05F, -0.75F);
        this.SPINESRIGHT5.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 1.405F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 32, -4.0F, 0.03F, -0.25F, 4, 0, 1, 0.0F, true));

        this.leftLeg10 = new AdvancedModelRenderer(this);
        this.leftLeg10.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.body4.addChild(leftLeg10);
        this.setRotateAngle(leftLeg10, 0.0F, 0.0F, 0.0873F);
        this.leftLeg10.cubeList.add(new ModelBox(leftLeg10, 31, 33, 0.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, false));

        this.rightLeg10 = new AdvancedModelRenderer(this);
        this.rightLeg10.setRotationPoint(0.0F, 1.0F, 1.5F);
        this.body4.addChild(rightLeg10);
        this.setRotateAngle(rightLeg10, 0.0F, 0.0F, -0.0873F);
        this.rightLeg10.cubeList.add(new ModelBox(rightLeg10, 31, 33, -3.0F, 0.0F, -0.5F, 3, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Selenopeltis.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Selenopeltis, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1F, 0.0F);
        this.Selenopeltis.offsetZ = -0.03F;
        this.Selenopeltis.offsetY = 0.1F;
        this.Selenopeltis.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Selenopeltis.offsetY = -2.0F;
        this.Selenopeltis.offsetX = -1.338F;
        this.Selenopeltis.rotateAngleY = (float)Math.toRadians(200);
        this.Selenopeltis.rotateAngleX = (float)Math.toRadians(8);
        this.Selenopeltis.rotateAngleZ = (float)Math.toRadians(-8);
        this.Selenopeltis.scaleChildren = true;
        float scaler = 1.63F;
        this.Selenopeltis.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Selenopeltis, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.Selenopeltis.render(f);
        //Reset rotations, positions and sizing:
        this.Selenopeltis.setScale(1.0F, 1.0F, 1.0F);
        this.Selenopeltis.scaleChildren = false;
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
        this.resetToDefaultPose();
        //this.Selenopeltis.offsetY = 1.05F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftLeg1, this.leftLeg2, this.leftLeg3, this.leftLeg4, this.leftLeg5, this.leftLeg6, this.leftLeg7, this.leftLeg8, this.leftLeg9, this.leftLeg10};
        AdvancedModelRenderer[] legsR = {this.rightLeg1, this.rightLeg2, this.rightLeg3, this.rightLeg4, this.rightLeg5, this.rightLeg6, this.rightLeg7, this.rightLeg8, this.rightLeg9, this.rightLeg10};
        AdvancedModelRenderer[] bodyF = {this.body1,this.body2,this.body3,this.body4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraSelenopeltis) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftLeg1, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightLeg1, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg5, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg5, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg6, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg6, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg7, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg7, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg8, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg8, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg9, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg9, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftLeg10, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightLeg10, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
                this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 0.5F);
                this.chainWave(bodyF, 0.1F, 0.0f, -3, f2, 0F);
            }
            this.bob(Selenopeltis, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftLeg1, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightLeg1, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftLeg2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg5, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg5, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg6, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg6, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg7, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg7, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg8, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg8, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg9, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg9, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftLeg10, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightLeg10, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.05F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.07f, -3, f2, 0.3F);
            this.bob(Selenopeltis, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(leftAntenna, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(rightAntenna, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
