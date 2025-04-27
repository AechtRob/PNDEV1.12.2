package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelDevonobius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legleft9;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer legright10;
    private final AdvancedModelRenderer legleft10;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer legright11;
    private final AdvancedModelRenderer legleft11;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer legright12;
    private final AdvancedModelRenderer legleft12;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer legright13;
    private final AdvancedModelRenderer legleft13;
    private final AdvancedModelRenderer body14;
    private final AdvancedModelRenderer legright14;
    private final AdvancedModelRenderer legleft14;
    private final AdvancedModelRenderer taillegright;
    private final AdvancedModelRenderer taillegleft;

    public ModelDevonobius() {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 22.75F, -6.5F);
        this.body1.cubeList.add(new ModelBox(body1, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 6, -0.5F, -0.5F, -1.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 6, -0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -0.5F, -0.25F, -2.0F, 1, 0, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3491F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -0.5F, -0.25F, -2.0F, 1, 0, 2, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(0.0F, 0.5F, 6.5F);
        this.head.addChild(antennaright);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.antennaright.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.3927F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.1F, -0.5F, -3.0F, 0, 1, 3, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.0F, 0.5F, 6.5F);
        this.head.addChild(antennaleft);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.antennaleft.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3054F, -0.3927F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.1F, -0.5F, -3.0F, 0, 1, 3, 0.0F, true));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body1.addChild(legright1);
        this.setRotateAngle(legright1, -0.1745F, -0.3491F, -0.3491F);
        this.legright1.cubeList.add(new ModelBox(legright1, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body1.addChild(legleft1);
        this.setRotateAngle(legleft1, -0.1745F, 0.3491F, 0.3491F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body2.addChild(legright2);
        this.setRotateAngle(legright2, -0.1745F, -0.2618F, -0.3491F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body2.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.1745F, 0.2618F, 0.3491F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body3.addChild(legright3);
        this.setRotateAngle(legright3, -0.1745F, -0.1745F, -0.3491F);
        this.legright3.cubeList.add(new ModelBox(legright3, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body3.addChild(legleft3);
        this.setRotateAngle(legleft3, -0.1745F, 0.1745F, 0.3491F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body4.addChild(legright4);
        this.setRotateAngle(legright4, -0.1745F, -0.0873F, -0.3491F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body4.addChild(legleft4);
        this.setRotateAngle(legleft4, -0.1745F, 0.0873F, 0.3491F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body5.addChild(legright5);
        this.setRotateAngle(legright5, -0.1745F, 0.0F, -0.3491F);
        this.legright5.cubeList.add(new ModelBox(legright5, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body5.addChild(legleft5);
        this.setRotateAngle(legleft5, -0.1745F, 0.0F, 0.3491F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body6.addChild(legright6);
        this.setRotateAngle(legright6, -0.1745F, 0.0F, -0.3491F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body6.addChild(legleft6);
        this.setRotateAngle(legleft6, -0.1745F, 0.0F, 0.3491F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body7.addChild(legright7);
        this.setRotateAngle(legright7, -0.1745F, 0.0F, -0.3491F);
        this.legright7.cubeList.add(new ModelBox(legright7, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body7.addChild(legleft7);
        this.setRotateAngle(legleft7, -0.1745F, 0.0F, 0.3491F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body8.addChild(legright8);
        this.setRotateAngle(legright8, -0.1745F, 0.0F, -0.3491F);
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body8.addChild(legleft8);
        this.setRotateAngle(legleft8, -0.1745F, 0.0F, 0.3491F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body9.addChild(legright9);
        this.setRotateAngle(legright9, -0.1745F, 0.0873F, -0.3491F);
        this.legright9.cubeList.add(new ModelBox(legright9, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body9.addChild(legleft9);
        this.setRotateAngle(legleft9, -0.1745F, -0.0873F, 0.3491F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright10 = new AdvancedModelRenderer(this);
        this.legright10.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body10.addChild(legright10);
        this.setRotateAngle(legright10, -0.1745F, 0.1745F, -0.3491F);
        this.legright10.cubeList.add(new ModelBox(legright10, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft10 = new AdvancedModelRenderer(this);
        this.legleft10.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body10.addChild(legleft10);
        this.setRotateAngle(legleft10, -0.1745F, -0.1745F, 0.3491F);
        this.legleft10.cubeList.add(new ModelBox(legleft10, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright11 = new AdvancedModelRenderer(this);
        this.legright11.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body11.addChild(legright11);
        this.setRotateAngle(legright11, -0.1745F, 0.2618F, -0.3491F);
        this.legright11.cubeList.add(new ModelBox(legright11, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft11 = new AdvancedModelRenderer(this);
        this.legleft11.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body11.addChild(legleft11);
        this.setRotateAngle(legleft11, -0.1745F, -0.2618F, 0.3491F);
        this.legleft11.cubeList.add(new ModelBox(legleft11, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright12 = new AdvancedModelRenderer(this);
        this.legright12.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body12.addChild(legright12);
        this.setRotateAngle(legright12, -0.1745F, 0.3491F, -0.3491F);
        this.legright12.cubeList.add(new ModelBox(legright12, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft12 = new AdvancedModelRenderer(this);
        this.legleft12.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body12.addChild(legleft12);
        this.setRotateAngle(legleft12, -0.1745F, -0.3491F, 0.3491F);
        this.legleft12.cubeList.add(new ModelBox(legleft12, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body12.addChild(body13);
        this.body13.cubeList.add(new ModelBox(body13, 5, 1, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));

        this.legright13 = new AdvancedModelRenderer(this);
        this.legright13.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body13.addChild(legright13);
        this.setRotateAngle(legright13, -0.1745F, 0.4363F, -0.3491F);
        this.legright13.cubeList.add(new ModelBox(legright13, 6, 0, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft13 = new AdvancedModelRenderer(this);
        this.legleft13.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body13.addChild(legleft13);
        this.setRotateAngle(legleft13, -0.1745F, -0.4363F, 0.3491F);
        this.legleft13.cubeList.add(new ModelBox(legleft13, 6, 0, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.body14 = new AdvancedModelRenderer(this);
        this.body14.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body13.addChild(body14);
        this.body14.cubeList.add(new ModelBox(body14, 4, 4, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.01F, false));

        this.legright14 = new AdvancedModelRenderer(this);
        this.legright14.setRotationPoint(-0.5F, 0.25F, 0.5F);
        this.body14.addChild(legright14);
        this.setRotateAngle(legright14, -0.1745F, 0.5236F, -0.3491F);
        this.legright14.cubeList.add(new ModelBox(legright14, 0, 2, -2.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, false));

        this.legleft14 = new AdvancedModelRenderer(this);
        this.legleft14.setRotationPoint(0.5F, 0.25F, 0.5F);
        this.body14.addChild(legleft14);
        this.setRotateAngle(legleft14, -0.1745F, -0.5236F, 0.3491F);
        this.legleft14.cubeList.add(new ModelBox(legleft14, 0, 2, 0.0F, -0.5F, 0.0F, 2, 1, 0, 0.0F, true));

        this.taillegright = new AdvancedModelRenderer(this);
        this.taillegright.setRotationPoint(-0.25F, 0.25F, 1.0F);
        this.body14.addChild(taillegright);
        this.setRotateAngle(taillegright, 0.0873F, 1.0472F, 0.4363F);
        this.taillegright.cubeList.add(new ModelBox(taillegright, 0, 0, -3.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, false));

        this.taillegleft = new AdvancedModelRenderer(this);
        this.taillegleft.setRotationPoint(0.25F, 0.25F, 1.0F);
        this.body14.addChild(taillegleft);
        this.setRotateAngle(taillegleft, 0.0873F, -1.0472F, -0.4363F);
        this.taillegleft.cubeList.add(new ModelBox(taillegleft, 0, 0, 0.0F, -0.5F, 0.0F, 3, 2, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body1.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.body1.offsetZ = -0.080F;
        this.body1.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        //super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.body1.offsetY = 0.0F;

        AdvancedModelRenderer[] legsL = {this.legleft1, this.legleft2, this.legleft3, this.legleft4, this.legleft5, this.legleft6, this.legleft7, this.legleft8, this.legleft9, this.legleft10, this.legleft11, this.legleft12, this.legleft13, this.legleft14};
        AdvancedModelRenderer[] legsR = {this.legright1, this.legright2, this.legright3, this.legright4, this.legright5, this.legright6, this.legright7, this.legright8, this.legright9, this.legright10, this.legright11, this.legright12, this.legright13, this.legright14};
        AdvancedModelRenderer[] BodyFull = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};

        AdvancedModelRenderer[] Body1 = {this.body1, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body2 = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body3 = {this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body4 = {this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body5 = {this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body6 = {this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body7 = {this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body8 = {this.body8, this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body9 = {this.body9, this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body10 = {this.body10, this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body11 = {this.body11, this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body12 = {this.body12, this.body13, this.body14};
        AdvancedModelRenderer[] Body13 = {this.body13, this.body14};
        AdvancedModelRenderer[] Body14 = {this.body14};

        EntityPrehistoricFloraMyriapod Pneumodesmus = (EntityPrehistoricFloraMyriapod) e;
        if (f3 == 0.0F || !Pneumodesmus.getIsMoving()) { //Not moving
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            return;
        }

        AdvancedModelRenderer[] bodySegments = new AdvancedModelRenderer[]{
                body1, body2, body3, body4, body5, body6, body7, body8, body9, body10, body11, body12, body13, body14 };
        Pneumodesmus.myriapodBuffer.applyChainSwingBuffer(false, bodySegments);

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.head.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.4;
            this.body4.rotateAngleY += f3 / (180F / (float) Math.PI) * 0.3;
            if (((EntityPrehistoricFloraMyriapod) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                //this.chainSwing(BodyHead, 0.2F, 0.3F, -3, f2, 1);
                //this.walk(head, 0.2F, 0.3F, false,0.3F, 0.5F, f2, 1);

                this.chainSwing(Body1, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body2, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body3, 0.3F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body4, 0.3F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body5, 0.2F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body6, 0.2F, 0.015F, -3, f2, 0.5F);
                this.chainSwing(Body7, 0.15F, -0.015F, -3, f2, 0.5F);
                this.chainSwing(Body8, 0.15F, 0.016F, -3, f2, 0.5F);
                this.chainSwing(Body9, 0.15F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body10, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body11, 0.10F, -0.016F, -3, f2, 0.5F);
                this.chainSwing(Body12, 0.10F, -0.016F, -3, f2, 0.5F);

                this.flap(legleft1, 0.7F, -0.5F, false, 0.0F, -0.5F, f2, 0.3F);
                this.flap(legright1, 0.7F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(legleft2, 0.7F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(legright2, 0.7F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
                this.flap(legleft3, 0.7F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
                this.flap(legright3, 0.7F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
                this.flap(legleft4, 0.7F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
                this.flap(legright4, 0.7F, 0.5F, false, 7.0F, 0.5F, f2, 0.3F);
                this.flap(legleft5, 0.7F, -0.5F, false, 8.0F, -0.5F, f2, 0.3F);
                this.flap(legright5, 0.7F, 0.5F, false, 9.0F, 0.5F, f2, 0.3F);
                this.flap(legleft6, 0.7F, -0.5F, false, 10.0F, -0.5F, f2, 0.3F);
                this.flap(legright6, 0.7F, 0.5F, false, 11.0F, 0.5F, f2, 0.3F);
                this.flap(legleft7, 0.7F, -0.5F, false, 12.0F, -0.5F, f2, 0.3F);
                this.flap(legright7, 0.7F, 0.5F, false, 13.0F, 0.5F, f2, 0.3F);
                this.flap(legleft8, 0.7F, -0.5F, false, 14.0F, -0.5F, f2, 0.3F);
                this.flap(legright8, 0.7F, 0.5F, false, 15.0F, 0.5F, f2, 0.3F);
                this.flap(legleft9, 0.7F, -0.5F, false, 16.0F, -0.5F, f2, 0.3F);
                this.flap(legright9, 0.7F, 0.5F, false, 17.0F, 0.5F, f2, 0.3F);
                this.flap(legleft10, 0.7F, -0.5F, false, 18.0F, -0.5F, f2, 0.3F);
                this.flap(legright10, 0.7F, 0.5F, false, 19.0F, 0.5F, f2, 0.3F);
                this.flap(legleft11, 0.7F, -0.5F, false, 20.0F, -0.5F, f2, 0.3F);
                this.flap(legright11, 0.7F, 0.5F, false, 21.0F, 0.5F, f2, 0.3F);
                this.flap(legleft12, 0.7F, -0.5F, false, 22.0F, -0.5F, f2, 0.3F);
                this.flap(legright12, 0.7F, 0.5F, false, 23.0F, 0.5F, f2, 0.3F);
                this.flap(legleft13, 0.7F, -0.5F, false, 24.0F, -0.5F, f2, 0.3F);
                this.flap(legright13, 0.7F, 0.5F, false, 25.0F, 0.5F, f2, 0.3F);
                this.flap(legleft14, 0.7F, -0.5F, false, 26.0F, -0.5F, f2, 0.3F);
                this.flap(legright14, 0.7F, 0.5F, false, 27.0F, 0.5F, f2, 0.3F);
            }
        }
    }
}
