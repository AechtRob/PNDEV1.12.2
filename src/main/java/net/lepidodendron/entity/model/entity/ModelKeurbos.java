package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelKeurbos extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer finleft;
    private final AdvancedModelRenderer finright;
    private final AdvancedModelRenderer finleft2;
    private final AdvancedModelRenderer finright2;
    private final AdvancedModelRenderer finleft3;
    private final AdvancedModelRenderer finright3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer finleft4;
    private final AdvancedModelRenderer finright4;
    private final AdvancedModelRenderer finleft5;
    private final AdvancedModelRenderer finright5;
    private final AdvancedModelRenderer finleft6;
    private final AdvancedModelRenderer finright6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer finleft7;
    private final AdvancedModelRenderer finright7;
    private final AdvancedModelRenderer finleft8;
    private final AdvancedModelRenderer finright8;
    private final AdvancedModelRenderer finleft9;
    private final AdvancedModelRenderer finright9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer finleft10;
    private final AdvancedModelRenderer finright10;
    private final AdvancedModelRenderer finleft11;
    private final AdvancedModelRenderer finright11;
    private final AdvancedModelRenderer finleft12;
    private final AdvancedModelRenderer finright12;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer finleft13;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer finright13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer finleft14;
    private final AdvancedModelRenderer finright14;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer finleft15;
    private final AdvancedModelRenderer finright15;
    private final AdvancedModelRenderer finleft16;
    private final AdvancedModelRenderer finright16;
    private final AdvancedModelRenderer finleft17;
    private final AdvancedModelRenderer finright17;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;

    public ModelKeurbos() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 23.2F, -7.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 45, -1.0F, -1.25F, -0.225F, 2, 2, 3, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.3F, 0.3F, 0.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, -0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 36, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.3F, 0.3F, 0.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5236F, 0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 36, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.075F, 0.15F, -0.225F);
        this.head.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.1745F, 0.5672F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 46, 2, -2.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.075F, 0.15F, -0.225F);
        this.head.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.1745F, -0.5672F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 46, 2, 0.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.825F, 0.4F, 0.775F);
        this.head.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.1309F, -0.4363F);
        this.legright.cubeList.add(new ModelBox(legright, 46, 13, -2.5F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.825F, 0.4F, 0.775F);
        this.head.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, -0.1309F, 0.4363F);
        this.legleft.cubeList.add(new ModelBox(legleft, 46, 13, -0.5F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.825F, 0.4F, 1.525F);
        this.head.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.1745F, -0.5672F);
        this.legright2.cubeList.add(new ModelBox(legright2, 40, 35, -3.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.825F, 0.4F, 1.525F);
        this.head.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, -0.1745F, 0.5672F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 40, 35, -1.0F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.825F, 0.4F, 2.275F);
        this.head.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.3927F, -0.6545F);
        this.legright3.cubeList.add(new ModelBox(legright3, 46, 0, -3.5F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.825F, 0.4F, 2.275F);
        this.head.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.3927F, 0.6545F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 46, 0, -0.5F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.25F, 2.275F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.0F, -0.5F, 5, 1, 7, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 24, -2.0F, -0.5F, -0.495F, 4, 1, 7, 0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.325F, -1.0F, 1.5F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.4363F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 23, 0.0F, 0.0F, -1.0F, 1, 0, 6, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.325F, -1.0F, 1.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 23, -1.0F, 0.0F, -1.0F, 1, 0, 6, 0.0F, false));

        this.finleft = new AdvancedModelRenderer(this);
        this.finleft.setRotationPoint(1.825F, 0.0F, 1.75F);
        this.body.addChild(finleft);
        this.setRotateAngle(finleft, -0.2182F, -0.2618F, 0.3491F);
        this.finleft.cubeList.add(new ModelBox(finleft, 16, 35, 0.023F, 0.002F, -0.0592F, 2, 0, 1, 0.0F, true));
        this.finleft.cubeList.add(new ModelBox(finleft, 30, 23, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright = new AdvancedModelRenderer(this);
        this.finright.setRotationPoint(-1.825F, 0.0F, 1.75F);
        this.body.addChild(finright);
        this.setRotateAngle(finright, -0.2182F, 0.2618F, -0.3491F);
        this.finright.cubeList.add(new ModelBox(finright, 16, 35, -2.023F, 0.002F, -0.0592F, 2, 0, 1, 0.0F, false));
        this.finright.cubeList.add(new ModelBox(finright, 30, 23, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft2 = new AdvancedModelRenderer(this);
        this.finleft2.setRotationPoint(1.825F, 0.0F, 4.25F);
        this.body.addChild(finleft2);
        this.setRotateAngle(finleft2, -0.2182F, -0.2618F, 0.3491F);
        this.finleft2.cubeList.add(new ModelBox(finleft2, 30, 23, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));
        this.finleft2.cubeList.add(new ModelBox(finleft2, 16, 35, 0.0065F, 0.0552F, -0.0651F, 2, 0, 1, 0.0F, true));

        this.finright2 = new AdvancedModelRenderer(this);
        this.finright2.setRotationPoint(-1.825F, 0.0F, 4.25F);
        this.body.addChild(finright2);
        this.setRotateAngle(finright2, -0.2182F, 0.2618F, -0.3491F);
        this.finright2.cubeList.add(new ModelBox(finright2, 30, 23, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));
        this.finright2.cubeList.add(new ModelBox(finright2, 16, 35, -2.0065F, 0.0552F, -0.0651F, 2, 0, 1, 0.0F, false));

        this.finleft3 = new AdvancedModelRenderer(this);
        this.finleft3.setRotationPoint(1.825F, 0.0F, 5.5F);
        this.body.addChild(finleft3);
        this.setRotateAngle(finleft3, -0.2182F, -0.2618F, 0.3491F);
        this.finleft3.cubeList.add(new ModelBox(finleft3, 30, 23, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright3 = new AdvancedModelRenderer(this);
        this.finright3.setRotationPoint(-1.825F, 0.0F, 5.5F);
        this.body.addChild(finright3);
        this.setRotateAngle(finright3, -0.2182F, 0.2618F, -0.3491F);
        this.finright3.cubeList.add(new ModelBox(finright3, 30, 23, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, 6.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 8, -2.5F, -0.5F, -0.5F, 5, 1, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 0, -2.0F, 0.0F, -0.5F, 4, 1, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.325F, -0.5F, 1.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.4363F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 29, 0.0F, 0.0F, -1.0F, 1, 0, 6, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.325F, -0.5F, 1.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.4363F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 29, -1.0F, 0.0F, -1.0F, 1, 0, 6, 0.0F, false));

        this.finleft4 = new AdvancedModelRenderer(this);
        this.finleft4.setRotationPoint(1.825F, 0.5F, 1.5F);
        this.body2.addChild(finleft4);
        this.setRotateAngle(finleft4, -0.2182F, -0.2618F, 0.3491F);
        this.finleft4.cubeList.add(new ModelBox(finleft4, 30, 23, -0.1296F, 0.0974F, -0.0184F, 2, 0, 1, 0.0F, true));
        this.finleft4.cubeList.add(new ModelBox(finleft4, 16, 35, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright4 = new AdvancedModelRenderer(this);
        this.finright4.setRotationPoint(-1.825F, 0.5F, 1.5F);
        this.body2.addChild(finright4);
        this.setRotateAngle(finright4, -0.2182F, 0.2618F, -0.3491F);
        this.finright4.cubeList.add(new ModelBox(finright4, 30, 23, -1.8704F, 0.0974F, -0.0184F, 2, 0, 1, 0.0F, false));
        this.finright4.cubeList.add(new ModelBox(finright4, 16, 35, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft5 = new AdvancedModelRenderer(this);
        this.finleft5.setRotationPoint(1.825F, 0.5F, 4.0F);
        this.body2.addChild(finleft5);
        this.setRotateAngle(finleft5, -0.2182F, -0.2618F, 0.3491F);
        this.finleft5.cubeList.add(new ModelBox(finleft5, 30, 23, -0.1462F, 0.0505F, -0.0242F, 2, 0, 1, 0.0F, true));
        this.finleft5.cubeList.add(new ModelBox(finleft5, 16, 35, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright5 = new AdvancedModelRenderer(this);
        this.finright5.setRotationPoint(-1.825F, 0.5F, 4.0F);
        this.body2.addChild(finright5);
        this.setRotateAngle(finright5, -0.2182F, 0.2618F, -0.3491F);
        this.finright5.cubeList.add(new ModelBox(finright5, 30, 23, -1.8538F, 0.0505F, -0.0242F, 2, 0, 1, 0.0F, false));
        this.finright5.cubeList.add(new ModelBox(finright5, 16, 35, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft6 = new AdvancedModelRenderer(this);
        this.finleft6.setRotationPoint(1.825F, 0.5F, 5.25F);
        this.body2.addChild(finleft6);
        this.setRotateAngle(finleft6, -0.2182F, -0.2618F, 0.3491F);
        this.finleft6.cubeList.add(new ModelBox(finleft6, 16, 35, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright6 = new AdvancedModelRenderer(this);
        this.finright6.setRotationPoint(-1.825F, 0.5F, 5.25F);
        this.body2.addChild(finright6);
        this.setRotateAngle(finright6, -0.2182F, 0.2618F, -0.3491F);
        this.finright6.cubeList.add(new ModelBox(finright6, 16, 35, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 16, -2.5F, -0.5F, 0.0F, 5, 1, 7, 0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 8, -2.0F, 0.0F, 0.0F, 4, 1, 7, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(2.325F, -0.5F, 2.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.4363F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 32, 0.0F, 0.0F, -2.0F, 1, 0, 7, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.325F, -0.5F, 2.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 32, -1.0F, 0.0F, -2.0F, 1, 0, 7, 0.0F, false));

        this.finleft7 = new AdvancedModelRenderer(this);
        this.finleft7.setRotationPoint(1.825F, 0.5F, 1.75F);
        this.body3.addChild(finleft7);
        this.setRotateAngle(finleft7, -0.2182F, -0.2618F, 0.3491F);
        this.finleft7.cubeList.add(new ModelBox(finleft7, 30, 23, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));
        this.finleft7.cubeList.add(new ModelBox(finleft7, 16, 35, -0.0719F, -0.0244F, -0.0612F, 2, 0, 1, 0.0F, true));

        this.finright7 = new AdvancedModelRenderer(this);
        this.finright7.setRotationPoint(-1.825F, 0.5F, 1.75F);
        this.body3.addChild(finright7);
        this.setRotateAngle(finright7, -0.2182F, 0.2618F, -0.3491F);
        this.finright7.cubeList.add(new ModelBox(finright7, 30, 23, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));
        this.finright7.cubeList.add(new ModelBox(finright7, 16, 35, -1.9281F, -0.0244F, -0.0612F, 2, 0, 1, 0.0F, false));

        this.finleft8 = new AdvancedModelRenderer(this);
        this.finleft8.setRotationPoint(1.825F, 0.5F, 4.25F);
        this.body3.addChild(finleft8);
        this.setRotateAngle(finleft8, -0.2182F, -0.2618F, 0.3491F);
        this.finleft8.cubeList.add(new ModelBox(finleft8, 16, 35, -0.0637F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, true));
        this.finleft8.cubeList.add(new ModelBox(finleft8, 30, 23, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright8 = new AdvancedModelRenderer(this);
        this.finright8.setRotationPoint(-1.825F, 0.5F, 4.25F);
        this.body3.addChild(finright8);
        this.setRotateAngle(finright8, -0.2182F, 0.2618F, -0.3491F);
        this.finright8.cubeList.add(new ModelBox(finright8, 16, 35, -1.9363F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, false));
        this.finright8.cubeList.add(new ModelBox(finright8, 30, 23, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft9 = new AdvancedModelRenderer(this);
        this.finleft9.setRotationPoint(1.825F, 0.5F, 5.5F);
        this.body3.addChild(finleft9);
        this.setRotateAngle(finleft9, -0.2182F, -0.2618F, 0.3491F);
        this.finleft9.cubeList.add(new ModelBox(finleft9, 30, 23, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright9 = new AdvancedModelRenderer(this);
        this.finright9.setRotationPoint(-1.825F, 0.5F, 5.5F);
        this.body3.addChild(finright9);
        this.setRotateAngle(finright9, -0.2182F, 0.2618F, -0.3491F);
        this.finright9.cubeList.add(new ModelBox(finright9, 30, 23, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 24, 16, -2.0F, -0.5F, -0.5F, 4, 1, 6, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 22, 31, -1.5F, 0.0F, -0.5F, 3, 1, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.825F, -0.5F, 1.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.4363F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 45, 0.0F, 0.0F, -1.0F, 1, 0, 5, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.825F, -0.5F, 1.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.4363F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 45, -1.0F, 0.0F, -1.0F, 1, 0, 5, 0.0F, false));

        this.finleft10 = new AdvancedModelRenderer(this);
        this.finleft10.setRotationPoint(1.325F, 0.5F, 1.0F);
        this.body4.addChild(finleft10);
        this.setRotateAngle(finleft10, -0.2182F, -0.2618F, 0.3491F);
        this.finleft10.cubeList.add(new ModelBox(finleft10, 30, 23, -0.0389F, 0.0692F, -0.0495F, 2, 0, 1, 0.0F, true));
        this.finleft10.cubeList.add(new ModelBox(finleft10, 16, 35, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright10 = new AdvancedModelRenderer(this);
        this.finright10.setRotationPoint(-1.325F, 0.5F, 1.0F);
        this.body4.addChild(finright10);
        this.setRotateAngle(finright10, -0.2182F, 0.2618F, -0.3491F);
        this.finright10.cubeList.add(new ModelBox(finright10, 30, 23, -1.9611F, 0.0692F, -0.0495F, 2, 0, 1, 0.0F, false));
        this.finright10.cubeList.add(new ModelBox(finright10, 16, 35, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft11 = new AdvancedModelRenderer(this);
        this.finleft11.setRotationPoint(1.325F, 0.5F, 3.5F);
        this.body4.addChild(finleft11);
        this.setRotateAngle(finleft11, -0.2182F, -0.2618F, 0.3491F);
        this.finleft11.cubeList.add(new ModelBox(finleft11, 30, 23, -0.0637F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, true));
        this.finleft11.cubeList.add(new ModelBox(finleft11, 16, 35, -0.3235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright11 = new AdvancedModelRenderer(this);
        this.finright11.setRotationPoint(-1.325F, 0.5F, 3.5F);
        this.body4.addChild(finright11);
        this.setRotateAngle(finright11, -0.2182F, 0.2618F, -0.3491F);
        this.finright11.cubeList.add(new ModelBox(finright11, 30, 23, -1.9363F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, false));
        this.finright11.cubeList.add(new ModelBox(finright11, 16, 35, -1.6765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft12 = new AdvancedModelRenderer(this);
        this.finleft12.setRotationPoint(1.325F, 0.5F, 4.75F);
        this.body4.addChild(finleft12);
        this.setRotateAngle(finleft12, -0.2182F, -0.2618F, 0.3491F);
        this.finleft12.cubeList.add(new ModelBox(finleft12, 16, 35, -0.25F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright12 = new AdvancedModelRenderer(this);
        this.finright12.setRotationPoint(-1.325F, 0.5F, 4.75F);
        this.body4.addChild(finright12);
        this.setRotateAngle(finright12, -0.2182F, 0.2618F, -0.3491F);
        this.finright12.cubeList.add(new ModelBox(finright12, 16, 35, -1.75F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 22, 24, -1.5F, -0.475F, -0.5F, 3, 1, 6, 0.01F, false));
        this.body5.cubeList.add(new ModelBox(body5, 32, 38, -1.0F, -0.25F, -0.5F, 2, 1, 6, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.325F, -0.5F, 1.5F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.4363F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 44, 16, 0.0F, 0.1F, -2.0F, 1, 0, 6, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.325F, -0.5F, 1.5F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 16, -1.0F, 0.1F, -2.0F, 1, 0, 6, 0.0F, false));

        this.finleft13 = new AdvancedModelRenderer(this);
        this.finleft13.setRotationPoint(0.825F, 0.25F, 1.75F);
        this.body5.addChild(finleft13);
        this.setRotateAngle(finleft13, -0.2182F, -0.2618F, 0.3491F);
        this.finleft13.cubeList.add(new ModelBox(finleft13, 30, 23, -0.5735F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.6765F, 0.2613F, 1.0712F);
        this.finleft13.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 35, -0.9365F, -0.2532F, -1.1401F, 2, 0, 1, 0.0F, true));

        this.finright13 = new AdvancedModelRenderer(this);
        this.finright13.setRotationPoint(-0.825F, 0.25F, 1.75F);
        this.body5.addChild(finright13);
        this.setRotateAngle(finright13, -0.2182F, 0.2618F, -0.3491F);
        this.finright13.cubeList.add(new ModelBox(finright13, 30, 23, -1.4265F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.6765F, 0.2613F, 1.0712F);
        this.finright13.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 35, -1.0635F, -0.2532F, -1.1401F, 2, 0, 1, 0.0F, false));

        this.finleft14 = new AdvancedModelRenderer(this);
        this.finleft14.setRotationPoint(0.825F, 0.25F, 4.25F);
        this.body5.addChild(finleft14);
        this.setRotateAngle(finleft14, -0.2182F, -0.2618F, 0.3491F);
        this.finleft14.cubeList.add(new ModelBox(finleft14, 16, 35, -0.2789F, 0.0926F, -0.1157F, 2, 0, 1, 0.0F, true));
        this.finleft14.cubeList.add(new ModelBox(finleft14, 30, 23, -0.5735F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright14 = new AdvancedModelRenderer(this);
        this.finright14.setRotationPoint(-0.825F, 0.25F, 4.25F);
        this.body5.addChild(finright14);
        this.setRotateAngle(finright14, -0.2182F, 0.2618F, -0.3491F);
        this.finright14.cubeList.add(new ModelBox(finright14, 16, 35, -1.7211F, 0.0926F, -0.1157F, 2, 0, 1, 0.0F, false));
        this.finright14.cubeList.add(new ModelBox(finright14, 30, 23, -1.4265F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 5.5F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 16, 38, -1.0F, -0.45F, -0.5F, 2, 1, 6, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 39, -0.5F, -0.25F, -0.6F, 1, 1, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.825F, -0.5F, 1.5F);
        this.body6.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.4363F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 45, 0.0F, 0.1F, -2.0F, 1, 0, 6, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.825F, -0.5F, 1.5F);
        this.body6.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, -0.4363F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 45, -1.0F, 0.1F, -2.0F, 1, 0, 6, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.4F, 5.5F);
        this.body6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 23, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.finleft15 = new AdvancedModelRenderer(this);
        this.finleft15.setRotationPoint(0.325F, 0.25F, 0.75F);
        this.body6.addChild(finleft15);
        this.setRotateAngle(finleft15, -0.2182F, -0.2618F, 0.3491F);
        this.finleft15.cubeList.add(new ModelBox(finleft15, 16, 35, -0.5637F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, true));
        this.finleft15.cubeList.add(new ModelBox(finleft15, 30, 23, -0.8235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright15 = new AdvancedModelRenderer(this);
        this.finright15.setRotationPoint(-0.325F, 0.25F, 0.75F);
        this.body6.addChild(finright15);
        this.setRotateAngle(finright15, -0.2182F, 0.2618F, -0.3491F);
        this.finright15.cubeList.add(new ModelBox(finright15, 16, 35, -1.4363F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, false));
        this.finright15.cubeList.add(new ModelBox(finright15, 30, 23, -1.1765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft16 = new AdvancedModelRenderer(this);
        this.finleft16.setRotationPoint(0.325F, 0.25F, 3.25F);
        this.body6.addChild(finleft16);
        this.setRotateAngle(finleft16, -0.2182F, -0.2618F, 0.3491F);
        this.finleft16.cubeList.add(new ModelBox(finleft16, 16, 35, -0.5637F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, true));
        this.finleft16.cubeList.add(new ModelBox(finleft16, 30, 23, -0.8235F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, true));

        this.finright16 = new AdvancedModelRenderer(this);
        this.finright16.setRotationPoint(-0.325F, 0.25F, 3.25F);
        this.body6.addChild(finright16);
        this.setRotateAngle(finright16, -0.2182F, 0.2618F, -0.3491F);
        this.finright16.cubeList.add(new ModelBox(finright16, 16, 35, -1.4363F, -0.001F, -0.0583F, 2, 0, 1, 0.0F, false));
        this.finright16.cubeList.add(new ModelBox(finright16, 30, 23, -1.1765F, 0.2613F, -1.1788F, 2, 0, 1, 0.0F, false));

        this.finleft17 = new AdvancedModelRenderer(this);
        this.finleft17.setRotationPoint(0.325F, 0.25F, 4.5F);
        this.body6.addChild(finleft17);
        this.setRotateAngle(finleft17, -0.2182F, -0.2618F, 0.3491F);
        this.finleft17.cubeList.add(new ModelBox(finleft17, 30, 23, -0.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.finright17 = new AdvancedModelRenderer(this);
        this.finright17.setRotationPoint(-0.325F, 0.25F, 4.5F);
        this.body6.addChild(finright17);
        this.setRotateAngle(finright17, -0.2182F, 0.2618F, -0.3491F);
        this.finright17.cubeList.add(new ModelBox(finright17, 30, 23, -1.5F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.175F, 0.875F, -0.975F);
        this.head.addChild(carapace);
        this.setRotateAngle(carapace, 0.1309F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 46, 5, -1.175F, -2.0F, -0.025F, 2, 2, 2, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 0, 46, -1.675F, -2.0F, 1.975F, 3, 0, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.825F, 0.0F, 0.975F);
        this.carapace.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 1.0036F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 32, -2.0F, -2.0F, 0.0F, 2, 2, 1, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(1.65F, 0.0F, 1.5F);
        this.carapace.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.6545F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 9, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.01F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.0F, 0.0F, 1.5F);
        this.carapace.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.6545F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 9, 0.0F, -2.0F, 0.0F, 2, 2, 2, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.175F, 0.0F, 0.975F);
        this.carapace.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -1.0036F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 16, 32, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 );
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.1F);
        this.head.offsetX = -0.014F;
        this.head.offsetY = -0.1F;
        this.head.offsetZ = -0.02F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.0F;
        this.head.offsetX = 2.2F;
        this.head.offsetZ = 2.0F;
        this.head.rotateAngleY = (float)Math.toRadians(225);
        this.head.rotateAngleX = (float)Math.toRadians(28);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 2.8F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(head, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body5, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.3F, 0.0F);
        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.flap(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.flap(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);

            this.walk(antennaleft, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            this.walk(antennaright, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);
            float tailVdegree = 0.12F;
            float tailHdegree = 0.3F;
            this.chainWave(Tail, speed*0.5F, tailVdegree, 2, f2, 1);


            float speedLeg = 1.1F;
            float degreeLeg = 0.25F;
            this.flap(legleft, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
            this.flap(legright, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
            this.flap(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
            this.flap(legright2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
            this.flap(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
            this.flap(legright3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);
            this.flap(finleft, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
            this.flap(finright, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
            this.flap(finleft2, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
            this.flap(finright2, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);
            this.flap(finleft3, speedLeg, -degreeLeg, false, 2.5F, -0.5F, f2, 0.7F);
            this.flap(finright3, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
            this.flap(finleft4, speedLeg, -degreeLeg, false, 3.0F, -0.5F, f2, 0.7F);
            this.flap(finright4, speedLeg, degreeLeg, false, 3.0F, 0.5F, f2, 0.7F);
            this.flap(finleft5, speedLeg, -degreeLeg, false, 3.5F, -0.5F, f2, 0.7F);
            this.flap(finright5, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
            this.flap(finleft6, speedLeg, -degreeLeg, false, 4.0F, -0.5F, f2, 0.7F);
            this.flap(finright6, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
            this.flap(finleft7, speedLeg, -degreeLeg, false, 4.5F, -0.5F, f2, 0.7F);
            this.flap(finright7, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
            this.flap(finleft8, speedLeg, -degreeLeg, false, 5.0F, -0.5F, f2, 0.7F);
            this.flap(finright8, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
            this.flap(finleft9, speedLeg, -degreeLeg, false, 5.5F, -0.5F, f2, 0.7F);
            this.flap(finright9, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            this.flap(finleft10, speedLeg, -degreeLeg, false, 6.0F, -0.5F, f2, 0.7F);
            this.flap(finright10, speedLeg, degreeLeg, false, 6.0F, 0.5F, f2, 0.7F);
            this.flap(finleft11, speedLeg, -degreeLeg, false, 6.5F, -0.5F, f2, 0.7F);
            this.flap(finright11, speedLeg, degreeLeg, false, 6.5F, 0.5F, f2, 0.7F);
            this.flap(finleft12, speedLeg, -degreeLeg, false, 7.0F, -0.5F, f2, 0.7F);
            this.flap(finright12, speedLeg, degreeLeg, false, 7.0F, 0.5F, f2, 0.7F);
            this.flap(finleft13, speedLeg, -degreeLeg, false, 7.5F, -0.5F, f2, 0.7F);
            this.flap(finright13, speedLeg, degreeLeg, false, 7.5F, 0.5F, f2, 0.7F);
            this.flap(finleft14, speedLeg, -degreeLeg, false, 8.0F, -0.5F, f2, 0.7F);
            this.flap(finright14, speedLeg, degreeLeg, false, 8.0F, 0.5F, f2, 0.7F);
            this.flap(finleft15, speedLeg, -degreeLeg, false, 8.5F, -0.5F, f2, 0.7F);
            this.flap(finright15, speedLeg, degreeLeg, false, 8.5F, 0.5F, f2, 0.7F);
            this.flap(finleft16, speedLeg, -degreeLeg, false, 9.0F, -0.5F, f2, 0.7F);
            this.flap(finright16, speedLeg, degreeLeg, false, 9.0F, 0.5F, f2, 0.7F);
            this.flap(finleft17, speedLeg, -degreeLeg, false, 9.5F, -0.5F, f2, 0.7F);
            this.flap(finright17, speedLeg, degreeLeg, false, 9.5F, 0.5F, f2, 0.7F);
            if (!e.isInWater()) {
//                this.base.offsetY = 0.4F;
                this.head.rotateAngleZ = (float) Math.toRadians(90);
            }


                if (f3 == 0.0F) {
                    this.bob(head, -speed, 0.3F, false, f2, 2);

                }
                else
                {
                    this.bob(head, -speed, 1F, false, f2, 2);
                }

        }
    }
}
