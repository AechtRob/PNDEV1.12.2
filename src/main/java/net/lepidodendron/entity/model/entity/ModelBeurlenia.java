package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBeurlenia;
import net.lepidodendron.entity.EntityPrehistoricFloraEpoidesuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelBeurlenia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legleft3_1;
    private final AdvancedModelRenderer legleft3_2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legleft3_4;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legright3_1;
    private final AdvancedModelRenderer legright3_2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer legright3_4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft2;
    private final AdvancedModelRenderer antennaright2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer gillleft;
    private final AdvancedModelRenderer gillright;
    private final AdvancedModelRenderer gillleft2;
    private final AdvancedModelRenderer gillright2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer gillleft3;
    private final AdvancedModelRenderer gillright3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer gillleft4;
    private final AdvancedModelRenderer gillright4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer gillleft5;
    private final AdvancedModelRenderer gillright5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r12;

    private ModelAnimator animator;


    public ModelBeurlenia() {
        this.textureWidth = 56;
        this.textureHeight = 53;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 21.5F, 0.5F);
        this.body.cubeList.add(new ModelBox(body, 14, 39, -1.5F, -4.0F, -2.0F, 3, 3, 3, 0.03F, false));
        this.body.cubeList.add(new ModelBox(body, 28, 38, -1.5F, -1.0F, -3.0F, 3, 1, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -2.5F, -3.45F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 24, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -2.5F, -3.45F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0873F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 24, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -3.975F, -2.45F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.096F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 34, -1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.25F, -2.25F, -3.5F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, -0.1309F, 0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 45, 0.0F, 0.0F, -3.0F, 1, 0, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -4.0F, -2.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 44, -2.0F, 0.0F, -2.0F, 3, 3, 2, 0.01F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.5F, -0.75F, -2.5F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, -0.1745F, 0.0873F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 42, 47, 0.0F, -0.5F, -3.25F, 0, 2, 3, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.5F, -0.75F, -2.5F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, -0.1745F, -0.0873F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 42, 47, 0.0F, -0.5F, -3.25F, 0, 2, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.5F, -0.5F, -2.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.1745F, -0.4363F, -0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 36, 43, 0.0F, 0.0F, -2.5F, 0, 3, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.5F, -0.5F, -2.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, -0.1745F, 0.4363F, 0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, 36, 43, 0.0F, 0.0F, -2.5F, 0, 3, 3, 0.0F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.6F, 0.0F, -1.2F);
        this.body.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.6416F, 0.899F, 0.0973F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 44, 19, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legleft3_1 = new AdvancedModelRenderer(this);
        this.legleft3_1.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.legleft3.addChild(legleft3_1);
        this.setRotateAngle(legleft3_1, 0.0F, -0.7854F, 0.0F);
        this.legleft3_1.cubeList.add(new ModelBox(legleft3_1, 10, 48, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, false));

        this.legleft3_2 = new AdvancedModelRenderer(this);
        this.legleft3_2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.legleft3_1.addChild(legleft3_2);
        this.setRotateAngle(legleft3_2, 0.0F, 0.3927F, 0.0F);
        this.legleft3_2.cubeList.add(new ModelBox(legleft3_2, 16, 48, -1.0F, -0.5F, -1.0F, 1, 1, 1, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.legleft3_2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 34, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.legleft3_4 = new AdvancedModelRenderer(this);
        this.legleft3_4.setRotationPoint(-1.0F, 0.0F, -1.0F);
        this.legleft3_2.addChild(legleft3_4);
        this.legleft3_4.cubeList.add(new ModelBox(legleft3_4, 26, 39, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.6F, 0.0F, -1.2F);
        this.body.addChild(legright3);
        this.setRotateAngle(legright3, 0.6416F, -0.899F, -0.0973F);
        this.legright3.cubeList.add(new ModelBox(legright3, 44, 19, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legright3_1 = new AdvancedModelRenderer(this);
        this.legright3_1.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.legright3.addChild(legright3_1);
        this.setRotateAngle(legright3_1, 0.0F, 0.7854F, 0.0F);
        this.legright3_1.cubeList.add(new ModelBox(legright3_1, 10, 48, -0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F, true));

        this.legright3_2 = new AdvancedModelRenderer(this);
        this.legright3_2.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.legright3_1.addChild(legright3_2);
        this.setRotateAngle(legright3_2, 0.0F, -0.3927F, 0.0F);
        this.legright3_2.cubeList.add(new ModelBox(legright3_2, 16, 48, 0.0F, -0.5F, -1.0F, 1, 1, 1, 0.01F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.legright3_2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3927F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 34, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.legright3_4 = new AdvancedModelRenderer(this);
        this.legright3_4.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.legright3_2.addChild(legright3_4);
        this.legright3_4.cubeList.add(new ModelBox(legright3_4, 26, 39, 0.0F, -0.5F, -1.0F, 0, 1, 1, 0.0F, true));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.5665F, 0.0F, -0.5509F);
        this.body.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, -1.0472F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 28, 29, 0.001F, -0.5F, -6.0F, 0, 3, 6, 0.0F, false));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.5665F, 0.0F, -0.5509F);
        this.body.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, 1.0472F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 28, 29, -0.001F, -0.5F, -6.0F, 0, 3, 6, 0.0F, true));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.6004F, 0.0F, -0.0292F);
        this.body.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, -1.5272F, 0.0F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 29, 0.001F, -0.5F, -7.0F, 0, 3, 7, 0.0F, false));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.6004F, 0.0F, -0.0292F);
        this.body.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, 1.5272F, 0.0F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 29, -0.001F, -0.5F, -7.0F, 0, 3, 7, 0.0F, true));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(0.6472F, 0.0F, 0.6457F);
        this.body.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, -2.3562F, 0.0F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 14, 29, 0.001F, -0.5F, -7.0F, 0, 3, 7, 0.0F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-0.6472F, 0.0F, 0.6457F);
        this.body.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 2.3562F, 0.0F);
        this.legright6.cubeList.add(new ModelBox(legright6, 14, 29, -0.001F, -0.5F, -7.0F, 0, 3, 7, 0.0F, true));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.5F, -2.25F, -3.5F);
        this.body.addChild(antennaleft);
        this.setRotateAngle(antennaleft, 0.0F, -0.3491F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, -7, 23, -0.5F, 0.0F, -10.0F, 5, 0, 10, 0.0F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.5F, -2.25F, -3.5F);
        this.body.addChild(antennaright);
        this.setRotateAngle(antennaright, 0.0F, 0.3491F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, -7, 23, -4.5F, 0.0F, -10.0F, 5, 0, 10, 0.0F, true));

        this.antennaleft2 = new AdvancedModelRenderer(this);
        this.antennaleft2.setRotationPoint(0.5F, -2.0F, -3.5F);
        this.body.addChild(antennaleft2);
        this.setRotateAngle(antennaleft2, 0.2618F, -0.1745F, 0.0F);
        this.antennaleft2.cubeList.add(new ModelBox(antennaleft2, -8, 2, -0.5F, 0.0F, -6.0F, 10, 0, 19, 0.0F, false));

        this.antennaright2 = new AdvancedModelRenderer(this);
        this.antennaright2.setRotationPoint(-0.5F, -2.0F, -3.5F);
        this.body.addChild(antennaright2);
        this.setRotateAngle(antennaright2, 0.2618F, 0.1745F, 0.0F);
        this.antennaright2.cubeList.add(new ModelBox(antennaright2, -8, 2, -9.5F, 0.0F, -6.0F, 10, 0, 19, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -3.9F, 1.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 30, 19, -1.5F, 0.0F, -1.0F, 3, 3, 4, 0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 39, -1.5F, 2.75F, -1.0F, 3, 1, 4, 0.0F, false));

        this.gillleft = new AdvancedModelRenderer(this);
        this.gillleft.setRotationPoint(0.5F, 3.75F, 0.5F);
        this.body2.addChild(gillleft);
        this.setRotateAngle(gillleft, 0.0F, -0.1745F, -0.1745F);
        this.gillleft.cubeList.add(new ModelBox(gillleft, 10, 44, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillright = new AdvancedModelRenderer(this);
        this.gillright.setRotationPoint(-0.5F, 3.75F, 0.5F);
        this.body2.addChild(gillright);
        this.setRotateAngle(gillright, 0.0F, 0.1745F, 0.1745F);
        this.gillright.cubeList.add(new ModelBox(gillright, 10, 44, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.gillleft2 = new AdvancedModelRenderer(this);
        this.gillleft2.setRotationPoint(0.5F, 3.75F, 1.75F);
        this.body2.addChild(gillleft2);
        this.setRotateAngle(gillleft2, 0.0F, -0.1745F, -0.1745F);
        this.gillleft2.cubeList.add(new ModelBox(gillleft2, 12, 44, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, false));

        this.gillright2 = new AdvancedModelRenderer(this);
        this.gillright2.setRotationPoint(-0.5F, 3.75F, 1.75F);
        this.body2.addChild(gillright2);
        this.setRotateAngle(gillright2, 0.0F, 0.1745F, 0.1745F);
        this.gillright2.cubeList.add(new ModelBox(gillright2, 12, 44, -0.5F, 0.0F, 0.0F, 1, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.15F, 3.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 42, 39, -1.5F, 0.0F, 0.0F, 3, 3, 2, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 30, 26, -1.5F, 2.5F, 0.0F, 3, 1, 2, -0.02F, false));

        this.gillleft3 = new AdvancedModelRenderer(this);
        this.gillleft3.setRotationPoint(0.5F, 3.35F, 0.75F);
        this.body3.addChild(gillleft3);
        this.setRotateAngle(gillleft3, 0.0F, -0.1745F, -0.1745F);
        this.gillleft3.cubeList.add(new ModelBox(gillleft3, 40, 36, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillright3 = new AdvancedModelRenderer(this);
        this.gillright3.setRotationPoint(-0.5F, 3.35F, 0.75F);
        this.body3.addChild(gillright3);
        this.setRotateAngle(gillright3, 0.0F, 0.1745F, 0.1745F);
        this.gillright3.cubeList.add(new ModelBox(gillright3, 40, 36, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.15F, 1.9F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.1745F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 26, 43, -1.5F, 0.0F, 0.0F, 3, 3, 2, -0.03F, false));

        this.gillleft4 = new AdvancedModelRenderer(this);
        this.gillleft4.setRotationPoint(0.5F, 2.95F, 0.85F);
        this.body4.addChild(gillleft4);
        this.setRotateAngle(gillleft4, 0.0F, -0.1745F, -0.1745F);
        this.gillleft4.cubeList.add(new ModelBox(gillleft4, 26, 41, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillright4 = new AdvancedModelRenderer(this);
        this.gillright4.setRotationPoint(-0.5F, 2.95F, 0.85F);
        this.body4.addChild(gillright4);
        this.setRotateAngle(gillright4, 0.0F, 0.1745F, 0.1745F);
        this.gillright4.cubeList.add(new ModelBox(gillright4, 26, 41, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.25F, 1.9F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.1745F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 44, 20, -1.0F, 0.0F, -0.5F, 2, 2, 2, 0.01F, false));

        this.gillleft5 = new AdvancedModelRenderer(this);
        this.gillleft5.setRotationPoint(0.4F, 1.7F, 0.7F);
        this.body5.addChild(gillleft5);
        this.setRotateAngle(gillleft5, 0.0F, -0.1745F, -0.1745F);
        this.gillleft5.cubeList.add(new ModelBox(gillleft5, 20, 48, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.gillright5 = new AdvancedModelRenderer(this);
        this.gillright5.setRotationPoint(-0.4F, 1.7F, 0.7F);
        this.body5.addChild(gillright5);
        this.setRotateAngle(gillright5, 0.0F, 0.1745F, 0.1745F);
        this.gillright5.cubeList.add(new ModelBox(gillright5, 20, 48, -0.5F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.25F, 1.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, -0.0873F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 42, 44, -1.0F, 0.0F, -0.5F, 2, 1, 2, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.2F, 1.25F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.2618F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.2F, 0.0F);
        this.body7.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 45, -0.5F, 0.0F, 0.0F, 1, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.body7.addChild(bone);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5672F, 0.3491F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 30, -0.5F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.body7.addChild(bone3);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5672F, -0.3491F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 30, -1.5F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.25F, 0.05F, -0.1F);
        this.body7.addChild(bone2);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.5672F, 0.829F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 26, -0.5F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(-0.25F, 0.05F, -0.1F);
        this.body7.addChild(bone4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, -0.829F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 26, -1.5F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.bone.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticDisplayCase(float f) {
        this.bone.offsetZ = 0.030F;
        this.bone.render(0.01f);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.6F;
        this.bone.offsetX = -1.0F;
        this.bone.offsetZ = 2.0F;
        this.bone.rotateAngleY = (float)Math.toRadians(200);
        this.bone.rotateAngleX = (float)Math.toRadians(8);
        this.bone.rotateAngleZ = (float)Math.toRadians(-8);
        this.bone.scaleChildren = true;
        float scaler = 4.0F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
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
        //this.resetToDefaultPose();
       // this.body.offsetY = 0.4F;
        //this.carapace.offsetY = -0.2F;
        //this.carapace.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.body, this.body2, this.body3, this.body4, this.body6};
        AdvancedModelRenderer[] fishTail = {this.body4, this.body6};



        //mouthparts:
        //this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
        //this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;
        float tailHdegree = 0.0F;
        float paddleVdegree = 0.05F;
        float paddleHdegree = 0.4F;
        float tailSwing = 0.50F;

        EntityPrehistoricFloraBeurlenia slimon = (EntityPrehistoricFloraBeurlenia) e;

        this.bone.offsetZ = 0.1F;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
                this.chainSwing(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
                this.chainWave(fishTail, speed, 0.05F, -0.6F, f2, 0.6F);
            }

            //this.chainSwing(fishfinL, speed, -paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinL, speed, paddleVdegree, -3, f2, 2);
            //this.chainSwing(fishfinR, speed, paddleHdegree, -3, f2, 1);
            //this.chainWave(fishfinR, speed, paddleVdegree, -3, f2, 2);

            //pincers:
            //this.swing(cheliceraL, 0.3F, -0.1F, false, 0, -0.1F, f2, 0.6F);
            //this.swing(cheliceraR, 0.3F, 0.1F, false, 0, 0.1F, f2, 0.6F);

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);

                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBeurlenia ee = (EntityPrehistoricFloraBeurlenia) entitylivingbaseIn;
        //Swimming pose:

        if (ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                //Walk pose:
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
            else { //in water but not moving:
                if (ee.getAnimation() != ee.UNSWIM_ANIMATION && ee.getAnimation() != ee.SWIM_ANIMATION) {
                    //Walk static pose:
                    animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                }
            }
        } else {
            animBeach(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
    }
    

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraBeurlenia entity = (EntityPrehistoricFloraBeurlenia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-0))*2), body.rotateAngleY + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+60))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*2));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-115))*2), legleft3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-145))*4), legleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*2), legright3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*4), legright3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.83 + (((tickAnim - 0) / 5) * (-3.2945-(0.83)));
            yy = -0.15 + (((tickAnim - 0) / 5) * (-16.83111-(-0.15)));
            zz = 0.78 + (((tickAnim - 0) / 5) * (-3.79181-(0.78)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -3.2945 + (((tickAnim - 5) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 5) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 5) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 1.05027 + (((tickAnim - 10) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 10) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 10) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 4.95152 + (((tickAnim - 15) / 10) * (-3.2945-(4.95152)));
            yy = 16.52155 + (((tickAnim - 15) / 10) * (-16.83111-(16.52155)));
            zz = 5.34502 + (((tickAnim - 15) / 10) * (-3.79181-(5.34502)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -3.2945 + (((tickAnim - 25) / 5) * (1.05027-(-3.2945)));
            yy = -16.83111 + (((tickAnim - 25) / 5) * (4.29822-(-16.83111)));
            zz = -3.79181 + (((tickAnim - 25) / 5) * (-21.22451-(-3.79181)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 1.05027 + (((tickAnim - 30) / 5) * (4.95152-(1.05027)));
            yy = 4.29822 + (((tickAnim - 30) / 5) * (16.52155-(4.29822)));
            zz = -21.22451 + (((tickAnim - 30) / 5) * (5.34502-(-21.22451)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 4.95152 + (((tickAnim - 35) / 5) * (0.83-(4.95152)));
            yy = 16.52155 + (((tickAnim - 35) / 5) * (-0.15-(16.52155)));
            zz = 5.34502 + (((tickAnim - 35) / 5) * (0.78-(5.34502)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 2.35 + (((tickAnim - 0) / 3) * (4.95152-(2.35)));
            yy = -8.37 + (((tickAnim - 0) / 3) * (-16.52155-(-8.37)));
            zz = 12.37 + (((tickAnim - 0) / 3) * (-5.34502-(12.37)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 4.95152 + (((tickAnim - 3) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 3) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 3) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.2945 + (((tickAnim - 13) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 13) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 13) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 1.05027 + (((tickAnim - 18) / 5) * (4.95152-(1.05027)));
            yy = -4.29822 + (((tickAnim - 18) / 5) * (-16.52155-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 18) / 5) * (-5.34502-(21.22451)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 4.95152 + (((tickAnim - 23) / 10) * (-3.2945-(4.95152)));
            yy = -16.52155 + (((tickAnim - 23) / 10) * (16.83111-(-16.52155)));
            zz = -5.34502 + (((tickAnim - 23) / 10) * (3.79181-(-5.34502)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -3.2945 + (((tickAnim - 33) / 5) * (1.05027-(-3.2945)));
            yy = 16.83111 + (((tickAnim - 33) / 5) * (-4.29822-(16.83111)));
            zz = 3.79181 + (((tickAnim - 33) / 5) * (21.22451-(3.79181)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 1.05027 + (((tickAnim - 38) / 2) * (2.35-(1.05027)));
            yy = -4.29822 + (((tickAnim - 38) / 2) * (-8.37-(-4.29822)));
            zz = 21.22451 + (((tickAnim - 38) / 2) * (12.37-(21.22451)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.91 + (((tickAnim - 0) / 3) * (-1.8573-(-3.91)));
            yy = 8.52 + (((tickAnim - 0) / 3) * (16.79985-(8.52)));
            zz = -13.22 + (((tickAnim - 0) / 3) * (3.64399-(-13.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = -1.8573 + (((tickAnim - 3) / 10) * (-7.87129-(-1.8573)));
            yy = 16.79985 + (((tickAnim - 3) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 3) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.87129 + (((tickAnim - 13) / 5) * (-4.92954-(-7.87129)));
            yy = -16.96639 + (((tickAnim - 13) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 13) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -4.92954 + (((tickAnim - 18) / 5) * (-1.8573-(-4.92954)));
            yy = 4.37439 + (((tickAnim - 18) / 5) * (16.79985-(4.37439)));
            zz = -21.65911 + (((tickAnim - 18) / 5) * (3.64399-(-21.65911)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -1.8573 + (((tickAnim - 23) / 10) * (-7.87129-(-1.8573)));
            yy = 16.79985 + (((tickAnim - 23) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 23) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -7.87129 + (((tickAnim - 33) / 5) * (-4.92954-(-7.87129)));
            yy = -16.96639 + (((tickAnim - 33) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 33) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -4.92954 + (((tickAnim - 38) / 2) * (-3.91-(-4.92954)));
            yy = 4.37439 + (((tickAnim - 38) / 2) * (8.52-(4.37439)));
            zz = -21.65911 + (((tickAnim - 38) / 2) * (-13.22-(-21.65911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -5.87 + (((tickAnim - 0) / 2) * (-6.87129-(-5.87)));
            yy = 11.34 + (((tickAnim - 0) / 2) * (16.96639-(11.34)));
            zz = 1.77 + (((tickAnim - 0) / 2) * (2.85264-(1.77)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -6.87129 + (((tickAnim - 2) / 5) * (-3.92954-(-6.87129)));
            yy = 16.96639 + (((tickAnim - 2) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 2) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -3.92954 + (((tickAnim - 7) / 5) * (-0.8573-(-3.92954)));
            yy = -4.37439 + (((tickAnim - 7) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 7) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -0.8573 + (((tickAnim - 12) / 10) * (-6.87129-(-0.8573)));
            yy = -16.79985 + (((tickAnim - 12) / 10) * (16.96639-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 12) / 10) * (2.85264-(-3.64399)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -6.87129 + (((tickAnim - 22) / 5) * (-3.92954-(-6.87129)));
            yy = 16.96639 + (((tickAnim - 22) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 22) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -3.92954 + (((tickAnim - 27) / 5) * (-0.8573-(-3.92954)));
            yy = -4.37439 + (((tickAnim - 27) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 27) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.8573 + (((tickAnim - 32) / 8) * (-5.87-(-0.8573)));
            yy = -16.79985 + (((tickAnim - 32) / 8) * (11.34-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 32) / 8) * (1.77-(-3.64399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -8.53 + (((tickAnim - 0) / 7) * (-14.86371-(-8.53)));
            yy = 5.49 + (((tickAnim - 0) / 7) * (-16.67917-(5.49)));
            zz = 1.14 + (((tickAnim - 0) / 7) * (-0.73038-(1.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -14.86371 + (((tickAnim - 7) / 5) * (-9.81376-(-14.86371)));
            yy = -16.67917 + (((tickAnim - 7) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 7) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -9.81376 + (((tickAnim - 12) / 5) * (-5.36212-(-9.81376)));
            yy = 4.39691 + (((tickAnim - 12) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 12) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = -5.36212 + (((tickAnim - 17) / 10) * (-14.86371-(-5.36212)));
            yy = 16.57347 + (((tickAnim - 17) / 10) * (-16.67917-(16.57347)));
            zz = 2.07666 + (((tickAnim - 17) / 10) * (-0.73038-(2.07666)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -14.86371 + (((tickAnim - 27) / 5) * (-9.81376-(-14.86371)));
            yy = -16.67917 + (((tickAnim - 27) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 27) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -9.81376 + (((tickAnim - 32) / 5) * (-5.36212-(-9.81376)));
            yy = 4.39691 + (((tickAnim - 32) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 32) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -5.36212 + (((tickAnim - 37) / 3) * (-8.53-(-5.36212)));
            yy = 16.57347 + (((tickAnim - 37) / 3) * (5.49-(16.57347)));
            zz = 2.07666 + (((tickAnim - 37) / 3) * (1.14-(2.07666)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.31376 + (((tickAnim - 0) / 5) * (-5.86212-(-10.31376)));
            yy = -4.39691 + (((tickAnim - 0) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 0) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -5.86212 + (((tickAnim - 5) / 10) * (-15.36371-(-5.86212)));
            yy = -16.57347 + (((tickAnim - 5) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 5) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -15.36371 + (((tickAnim - 15) / 5) * (-10.31376-(-15.36371)));
            yy = 16.67917 + (((tickAnim - 15) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 15) / 5) * (21.50803-(0.73038)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10.31376 + (((tickAnim - 20) / 5) * (-5.86212-(-10.31376)));
            yy = -4.39691 + (((tickAnim - 20) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 20) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -5.86212 + (((tickAnim - 25) / 10) * (-15.36371-(-5.86212)));
            yy = -16.57347 + (((tickAnim - 25) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 25) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -15.36371 + (((tickAnim - 35) / 5) * (-10.31376-(-15.36371)));
            yy = 16.67917 + (((tickAnim - 35) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 35) / 5) * (21.50803-(0.73038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*2.5), antennaleft.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*2.5), antennaleft.rotateAngleZ + (float) Math.toRadians(-20));


        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), antennaright.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+125))*2.5), antennaright.rotateAngleZ + (float) Math.toRadians(20));


        this.setRotateAngle(antennaleft2, antennaleft2.rotateAngleX + (float) Math.toRadians(0), antennaleft2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), antennaleft2.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*5));


        this.setRotateAngle(antennaright2, antennaright2.rotateAngleX + (float) Math.toRadians(0), antennaright2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+145))*2.5), antennaright2.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+115))*5));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(12.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft, gillleft.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), gillleft.rotateAngleY + (float) Math.toRadians(0), gillleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright, gillright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), gillright.rotateAngleY + (float) Math.toRadians(0), gillright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft2, gillleft2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), gillleft2.rotateAngleY + (float) Math.toRadians(0), gillleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright2, gillright2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), gillright2.rotateAngleY + (float) Math.toRadians(0), gillright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft3, gillleft3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*2))*20), gillleft3.rotateAngleY + (float) Math.toRadians(0), gillleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright3, gillright3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*2))*20), gillright3.rotateAngleY + (float) Math.toRadians(0), gillright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft4, gillleft4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*3))*20), gillleft4.rotateAngleY + (float) Math.toRadians(0), gillleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright4, gillright4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*3))*20), gillright4.rotateAngleY + (float) Math.toRadians(0), gillright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft5, gillleft5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*4))*20), gillleft5.rotateAngleY + (float) Math.toRadians(0), gillleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright5, gillright5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60*4))*20), gillright5.rotateAngleY + (float) Math.toRadians(0), gillright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(5), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(-17.5), body6.rotateAngleY + (float) Math.toRadians(0), body6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), legleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), legright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), legleft2.rotateAngleZ + (float) Math.toRadians(10));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25))*20), legright2.rotateAngleZ + (float) Math.toRadians(-10));
        
        
    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraBeurlenia entity = (EntityPrehistoricFloraBeurlenia) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), legleft2.rotateAngleZ + (float) Math.toRadians(10));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*2.5), antennaleft.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25+45))*2.5), antennaleft.rotateAngleZ + (float) Math.toRadians(-20));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(7.5), body2.rotateAngleY + (float) Math.toRadians(0), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-60))*20), legleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), legright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25))*20), legright2.rotateAngleZ + (float) Math.toRadians(-10));


        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(-45), legleft4.rotateAngleY + (float) Math.toRadians(0), legleft4.rotateAngleZ + (float) Math.toRadians(57.5));


        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(-45), legright4.rotateAngleY + (float) Math.toRadians(0), legright4.rotateAngleZ + (float) Math.toRadians(-57.5));


        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(84.61735), legleft5.rotateAngleY + (float) Math.toRadians(25.19136), legleft5.rotateAngleZ + (float) Math.toRadians(-83.22893));


        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(84.61735), legright5.rotateAngleY + (float) Math.toRadians(-25.19136), legright5.rotateAngleZ + (float) Math.toRadians(83.22893));


        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(148.35665), legleft6.rotateAngleY + (float) Math.toRadians(101.8538), legleft6.rotateAngleZ + (float) Math.toRadians(-140.4886));


        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(148.35665), legright6.rotateAngleY + (float) Math.toRadians(-101.8538), legright6.rotateAngleZ + (float) Math.toRadians(140.4886));


        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25-115))*2.5), antennaright.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+125))*2.5), antennaright.rotateAngleZ + (float) Math.toRadians(20));


        this.setRotateAngle(antennaleft2, antennaleft2.rotateAngleX + (float) Math.toRadians(0), antennaleft2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaleft2.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-115))*5));


        this.setRotateAngle(antennaright2, antennaright2.rotateAngleX + (float) Math.toRadians(0), antennaright2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+145))*2.5), antennaright2.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25+115))*5));


        this.setRotateAngle(gillleft, gillleft.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25))*20), gillleft.rotateAngleY + (float) Math.toRadians(0), gillleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright, gillright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25))*20), gillright.rotateAngleY + (float) Math.toRadians(0), gillright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft2, gillleft2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-30))*20), gillleft2.rotateAngleY + (float) Math.toRadians(0), gillleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright2, gillright2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-30))*20), gillright2.rotateAngleY + (float) Math.toRadians(0), gillright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft3, gillleft3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), gillleft3.rotateAngleY + (float) Math.toRadians(0), gillleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright3, gillright3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-60))*20), gillright3.rotateAngleY + (float) Math.toRadians(0), gillright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft4, gillleft4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*20), gillleft4.rotateAngleY + (float) Math.toRadians(0), gillleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright4, gillright4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-90))*20), gillright4.rotateAngleY + (float) Math.toRadians(0), gillright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft5, gillleft5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-120))*20), gillleft5.rotateAngleY + (float) Math.toRadians(0), gillleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright5, gillright5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45/0.25-120))*20), gillright5.rotateAngleY + (float) Math.toRadians(0), gillright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(-2), body6.rotateAngleY + (float) Math.toRadians(0), body6.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animBeach(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraBeurlenia entity = (EntityPrehistoricFloraBeurlenia) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 45 + (((tickAnim - 0) / 19) * (45-(45)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 90 + (((tickAnim - 0) / 19) * (90-(90)));
        }
        else if (tickAnim >= 19 && tickAnim < 24) {
            xx = 45 + (((tickAnim - 19) / 5) * (-73.59008-(45)));
            yy = 0 + (((tickAnim - 19) / 5) * (18.52482-(0)));
            zz = 90 + (((tickAnim - 19) / 5) * (-11.12266-(90)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -73.59008 + (((tickAnim - 24) / 4) * (17.5-(-73.59008)));
            yy = 18.52482 + (((tickAnim - 24) / 4) * (0-(18.52482)));
            zz = -11.12266 + (((tickAnim - 24) / 4) * (-92.5-(-11.12266)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 17.5 + (((tickAnim - 28) / 2) * (22.5-(17.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = -92.5 + (((tickAnim - 28) / 2) * (-92.5-(-92.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 22.5 + (((tickAnim - 30) / 19) * (22.5-(22.5)));
            yy = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            zz = -92.5 + (((tickAnim - 30) / 19) * (-92.5-(-92.5)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 22.5 + (((tickAnim - 49) / 4) * (-34.96584-(22.5)));
            yy = 0 + (((tickAnim - 49) / 4) * (18.26428-(0)));
            zz = -92.5 + (((tickAnim - 49) / 4) * (35.65377-(-92.5)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -34.96584 + (((tickAnim - 53) / 5) * (50-(-34.96584)));
            yy = 18.26428 + (((tickAnim - 53) / 5) * (0-(18.26428)));
            zz = 35.65377 + (((tickAnim - 53) / 5) * (90-(35.65377)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 50 + (((tickAnim - 58) / 2) * (45-(50)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 90 + (((tickAnim - 58) / 2) * (90-(90)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 5 + (((tickAnim - 0) / 19) * (5-(5)));
            yy = -0.9 + (((tickAnim - 0) / 19) * (-0.9-(-0.9)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 5 + (((tickAnim - 19) / 3) * (0.43-(5)));
            yy = -0.9 + (((tickAnim - 19) / 3) * (12.97-(-0.9)));
            zz = 0 + (((tickAnim - 19) / 3) * (0.28-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 0.43 + (((tickAnim - 22) / 2) * (-4.14-(0.43)));
            yy = 12.97 + (((tickAnim - 22) / 2) * (13.94-(12.97)));
            zz = 0.28 + (((tickAnim - 22) / 2) * (0.57-(0.28)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -4.14 + (((tickAnim - 24) / 4) * (-4-(-4.14)));
            yy = 13.94 + (((tickAnim - 24) / 4) * (-0.6-(13.94)));
            zz = 0.57 + (((tickAnim - 24) / 4) * (2-(0.57)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -4 + (((tickAnim - 28) / 1) * (-4.5-(-4)));
            yy = -0.6 + (((tickAnim - 28) / 1) * (0.4-(-0.6)));
            zz = 2 + (((tickAnim - 28) / 1) * (2-(2)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = -4.5 + (((tickAnim - 29) / 1) * (-5-(-4.5)));
            yy = 0.4 + (((tickAnim - 29) / 1) * (-0.6-(0.4)));
            zz = 2 + (((tickAnim - 29) / 1) * (2-(2)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = -5 + (((tickAnim - 30) / 19) * (-5-(-5)));
            yy = -0.6 + (((tickAnim - 30) / 19) * (-0.6-(-0.6)));
            zz = 2 + (((tickAnim - 30) / 19) * (2-(2)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -5 + (((tickAnim - 49) / 3) * (0-(-5)));
            yy = -0.6 + (((tickAnim - 49) / 3) * (16.66-(-0.6)));
            zz = 2 + (((tickAnim - 49) / 3) * (0-(2)));
        }
        else if (tickAnim >= 52 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 52) / 6) * (4.5-(0)));
            yy = 16.66 + (((tickAnim - 52) / 6) * (-0.9-(16.66)));
            zz = 0 + (((tickAnim - 52) / 6) * (0.2-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 4.5 + (((tickAnim - 58) / 2) * (5-(4.5)));
            yy = -0.9 + (((tickAnim - 58) / 2) * (-0.9-(-0.9)));
            zz = 0.2 + (((tickAnim - 58) / 2) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-44.66841), legleft3.rotateAngleY + (float) Math.toRadians(12.71777), legleft3.rotateAngleZ + (float) Math.toRadians(-84.20366));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-44.66841), legright3.rotateAngleY + (float) Math.toRadians(-12.71777), legright3.rotateAngleZ + (float) Math.toRadians(84.20366));


        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(0), legleft4.rotateAngleY + (float) Math.toRadians(62.5), legleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(0), legright4.rotateAngleY + (float) Math.toRadians(-60), legright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(0), legleft5.rotateAngleY + (float) Math.toRadians(87.5), legleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(0), legright5.rotateAngleY + (float) Math.toRadians(-87.5), legright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(0), legleft6.rotateAngleY + (float) Math.toRadians(125), legleft6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(0), legright6.rotateAngleY + (float) Math.toRadians(-125), legright6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(-4.70247), antennaleft.rotateAngleY + (float) Math.toRadians(17.43833), antennaleft.rotateAngleZ + (float) Math.toRadians(-69.0033));


        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(-4.70247), antennaright.rotateAngleY + (float) Math.toRadians(-17.43833), antennaright.rotateAngleZ + (float) Math.toRadians(69.0033));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -19.5 + (((tickAnim - 0) / 19) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = -90 + (((tickAnim - 0) / 19) * (-90-(-90)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -19.5 + (((tickAnim - 19) / 2) * (-28.17691-(-19.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (27.30665-(0)));
            zz = -90 + (((tickAnim - 19) / 2) * (-19.43674-(-90)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -28.17691 + (((tickAnim - 21) / 1) * (-70.37677-(-28.17691)));
            yy = 27.30665 + (((tickAnim - 21) / 1) * (25.89702-(27.30665)));
            zz = -19.43674 + (((tickAnim - 21) / 1) * (-31.51189-(-19.43674)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -70.37677 + (((tickAnim - 22) / 2) * (-16.97591-(-70.37677)));
            yy = 25.89702 + (((tickAnim - 22) / 2) * (21.66792-(25.89702)));
            zz = -31.51189 + (((tickAnim - 22) / 2) * (-67.73926-(-31.51189)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = -16.97591 + (((tickAnim - 24) / 2) * (48.31443-(-16.97591)));
            yy = 21.66792 + (((tickAnim - 24) / 2) * (13.00068-(21.66792)));
            zz = -67.73926 + (((tickAnim - 24) / 2) * (-76.64363-(-67.73926)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 48.31443 + (((tickAnim - 26) / 2) * (-22.5-(48.31443)));
            yy = 13.00068 + (((tickAnim - 26) / 2) * (0-(13.00068)));
            zz = -76.64363 + (((tickAnim - 26) / 2) * (-90-(-76.64363)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -22.5 + (((tickAnim - 28) / 1) * (-34.17978-(-22.5)));
            yy = 0 + (((tickAnim - 28) / 1) * (3.9477-(0)));
            zz = -90 + (((tickAnim - 28) / 1) * (-78.01948-(-90)));
        }
        else if (tickAnim >= 29 && tickAnim < 37) {
            xx = -34.17978 + (((tickAnim - 29) / 8) * (-22.5-(-34.17978)));
            yy = 3.9477 + (((tickAnim - 29) / 8) * (0-(3.9477)));
            zz = -78.01948 + (((tickAnim - 29) / 8) * (-90-(-78.01948)));
        }
        else if (tickAnim >= 37 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 37) / 12) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 37) / 12) * (0-(0)));
            zz = -90 + (((tickAnim - 37) / 12) * (-90-(-90)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -22.5 + (((tickAnim - 49) / 3) * (32.09896-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 3) * (5.62239-(0)));
            zz = -90 + (((tickAnim - 49) / 3) * (-154.42143-(-90)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 32.09896 + (((tickAnim - 52) / 3) * (-63.04403-(32.09896)));
            yy = 5.62239 + (((tickAnim - 52) / 3) * (0.45008-(5.62239)));
            zz = -154.42143 + (((tickAnim - 52) / 3) * (-94.01577-(-154.42143)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = -63.04403 + (((tickAnim - 55) / 2) * (-10.86532-(-63.04403)));
            yy = 0.45008 + (((tickAnim - 55) / 2) * (21.17199-(0.45008)));
            zz = -94.01577 + (((tickAnim - 55) / 2) * (-61.31373-(-94.01577)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = -10.86532 + (((tickAnim - 57) / 1) * (-1.34745-(-10.86532)));
            yy = 21.17199 + (((tickAnim - 57) / 1) * (13.69241-(21.17199)));
            zz = -61.31373 + (((tickAnim - 57) / 1) * (-100.27879-(-61.31373)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -1.34745 + (((tickAnim - 58) / 2) * (-19.5-(-1.34745)));
            yy = 13.69241 + (((tickAnim - 58) / 2) * (0-(13.69241)));
            zz = -100.27879 + (((tickAnim - 58) / 2) * (-90-(-100.27879)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaleft2, antennaleft2.rotateAngleX + (float) Math.toRadians(xx), antennaleft2.rotateAngleY + (float) Math.toRadians(yy), antennaleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.56025 + (((tickAnim - 0) / 19) * (-22.56025-(-22.56025)));
            yy = -22.31085 + (((tickAnim - 0) / 19) * (-22.31085-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 0) / 19) * (92.93057-(92.93057)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -22.56025 + (((tickAnim - 19) / 2) * (-3.81292-(-22.56025)));
            yy = -22.31085 + (((tickAnim - 19) / 2) * (-21.16181-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 19) / 2) * (127.88254-(92.93057)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -3.81292 + (((tickAnim - 21) / 1) * (45.73262-(-3.81292)));
            yy = -21.16181 + (((tickAnim - 21) / 1) * (-18.83504-(-21.16181)));
            zz = 127.88254 + (((tickAnim - 21) / 1) * (107.14959-(127.88254)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 45.73262 + (((tickAnim - 22) / 2) * (14.36994-(45.73262)));
            yy = -18.83504 + (((tickAnim - 22) / 2) * (-11.85436-(-18.83504)));
            zz = 107.14959 + (((tickAnim - 22) / 2) * (44.94742-(107.14959)));
        }
        else if (tickAnim >= 24 && tickAnim < 26) {
            xx = 14.36994 + (((tickAnim - 24) / 2) * (-67.90225-(14.36994)));
            yy = -11.85436 + (((tickAnim - 24) / 2) * (-16.03699-(-11.85436)));
            zz = 44.94742 + (((tickAnim - 24) / 2) * (64.14083-(44.94742)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = -67.90225 + (((tickAnim - 26) / 2) * (-20.06025-(-67.90225)));
            yy = -16.03699 + (((tickAnim - 26) / 2) * (-22.31085-(-16.03699)));
            zz = 64.14083 + (((tickAnim - 26) / 2) * (92.93057-(64.14083)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -20.06025 + (((tickAnim - 28) / 1) * (-2.31026-(-20.06025)));
            yy = -22.31085 + (((tickAnim - 28) / 1) * (-22.31085-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 28) / 1) * (92.93057-(92.93057)));
        }
        else if (tickAnim >= 29 && tickAnim < 31) {
            xx = -2.31026 + (((tickAnim - 29) / 2) * (-19.31025-(-2.31026)));
            yy = -22.31085 + (((tickAnim - 29) / 2) * (-22.31085-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 29) / 2) * (92.93057-(92.93057)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = -19.31025 + (((tickAnim - 31) / 6) * (-20.06025-(-19.31025)));
            yy = -22.31085 + (((tickAnim - 31) / 6) * (-22.31085-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 31) / 6) * (92.93057-(92.93057)));
        }
        else if (tickAnim >= 37 && tickAnim < 49) {
            xx = -20.06025 + (((tickAnim - 37) / 12) * (-20.06025-(-20.06025)));
            yy = -22.31085 + (((tickAnim - 37) / 12) * (-22.31085-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 37) / 12) * (92.93057-(92.93057)));
        }
        else if (tickAnim >= 49 && tickAnim < 52) {
            xx = -20.06025 + (((tickAnim - 49) / 3) * (-69.35547-(-20.06025)));
            yy = -22.31085 + (((tickAnim - 49) / 3) * (-5.05601-(-22.31085)));
            zz = 92.93057 + (((tickAnim - 49) / 3) * (72.91462-(92.93057)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -69.35547 + (((tickAnim - 52) / 3) * (13.07873-(-69.35547)));
            yy = -5.05601 + (((tickAnim - 52) / 3) * (-25.16165-(-5.05601)));
            zz = 72.91462 + (((tickAnim - 52) / 3) * (86.66231-(72.91462)));
        }
        else if (tickAnim >= 55 && tickAnim < 57) {
            xx = 13.07873 + (((tickAnim - 55) / 2) * (-26.21664-(13.07873)));
            yy = -25.16165 + (((tickAnim - 55) / 2) * (-45.9185-(-25.16165)));
            zz = 86.66231 + (((tickAnim - 55) / 2) * (100.85527-(86.66231)));
        }
        else if (tickAnim >= 57 && tickAnim < 58) {
            xx = -26.21664 + (((tickAnim - 57) / 1) * (-36.85519-(-26.21664)));
            yy = -45.9185 + (((tickAnim - 57) / 1) * (-34.32558-(-45.9185)));
            zz = 100.85527 + (((tickAnim - 57) / 1) * (73.61155-(100.85527)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -36.85519 + (((tickAnim - 58) / 2) * (-22.56025-(-36.85519)));
            yy = -34.32558 + (((tickAnim - 58) / 2) * (-22.31085-(-34.32558)));
            zz = 73.61155 + (((tickAnim - 58) / 2) * (92.93057-(73.61155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(antennaright2, antennaright2.rotateAngleX + (float) Math.toRadians(xx), antennaright2.rotateAngleY + (float) Math.toRadians(yy), antennaright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -27.5 + (((tickAnim - 0) / 19) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -27.5 + (((tickAnim - 19) / 2) * (-7.5-(-27.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 21) / 6) * (-27.5-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 49) {
            xx = -27.5 + (((tickAnim - 27) / 22) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 27) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 22) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 49) / 1) * (-7.5-(-27.5)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -7.5 + (((tickAnim - 50) / 6) * (-27.5-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));

        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(-0.4);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.25);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.5 + (((tickAnim - 0) / 19) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -22.5 + (((tickAnim - 19) / 2) * (-7.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -7.5 + (((tickAnim - 21) / 6) * (-22.5-(-7.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 27) / 22) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 27) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 22) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 49) / 1) * (-7.5-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = -7.5 + (((tickAnim - 50) / 6) * (-22.5-(-7.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.5 + (((tickAnim - 0) / 19) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -22.5 + (((tickAnim - 19) / 2) * (5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 5 + (((tickAnim - 21) / 6) * (-22.5-(5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 27) / 22) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 27) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 22) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 49) / 1) * (5-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 5 + (((tickAnim - 50) / 6) * (-22.5-(5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.5 + (((tickAnim - 0) / 19) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -22.5 + (((tickAnim - 19) / 2) * (25-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 25 + (((tickAnim - 21) / 6) * (-22.5-(25)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 27) / 22) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 27) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 22) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 49) / 1) * (25-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 25 + (((tickAnim - 50) / 6) * (-22.5-(25)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));

        this.body5.rotationPointX = this.body5.rotationPointX + (float)(0);
        this.body5.rotationPointY = this.body5.rotationPointY - (float)(-0.075);
        this.body5.rotationPointZ = this.body5.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -22.5 + (((tickAnim - 0) / 19) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 21) {
            xx = -22.5 + (((tickAnim - 19) / 2) * (32.5-(-22.5)));
            yy = 0 + (((tickAnim - 19) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 2) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 32.5 + (((tickAnim - 21) / 6) * (-22.5-(32.5)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 49) {
            xx = -22.5 + (((tickAnim - 27) / 22) * (-22.5-(-22.5)));
            yy = 0 + (((tickAnim - 27) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 22) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 50) {
            xx = -22.5 + (((tickAnim - 49) / 1) * (32.5-(-22.5)));
            yy = 0 + (((tickAnim - 49) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 1) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 56) {
            xx = 32.5 + (((tickAnim - 50) / 6) * (-22.5-(32.5)));
            yy = 0 + (((tickAnim - 50) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(xx), body6.rotateAngleY + (float) Math.toRadians(yy), body6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 52.5 + (((tickAnim - 0) / 19) * (52.5-(52.5)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 52.5 + (((tickAnim - 19) / 4) * (0-(52.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (52.5-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            yy = 52.5 + (((tickAnim - 30) / 19) * (52.5-(52.5)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 52.5 + (((tickAnim - 49) / 4) * (0-(52.5)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (52.5-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone4, bone4.rotateAngleX + (float) Math.toRadians(xx), bone4.rotateAngleY + (float) Math.toRadians(yy), bone4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -32.5 + (((tickAnim - 0) / 19) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -32.5 + (((tickAnim - 19) / 4) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            yy = -32.5 + (((tickAnim - 30) / 19) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = -32.5 + (((tickAnim - 49) / 4) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = -52.5 + (((tickAnim - 0) / 19) * (-52.5-(-52.5)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = -52.5 + (((tickAnim - 19) / 4) * (0-(-52.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (-52.5-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            yy = -52.5 + (((tickAnim - 30) / 19) * (-52.5-(-52.5)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = -52.5 + (((tickAnim - 49) / 4) * (0-(-52.5)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (-52.5-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone2, bone2.rotateAngleX + (float) Math.toRadians(xx), bone2.rotateAngleY + (float) Math.toRadians(yy), bone2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 32.5 + (((tickAnim - 0) / 19) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 32.5 + (((tickAnim - 19) / 4) * (0-(32.5)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (32.5-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            yy = 32.5 + (((tickAnim - 30) / 19) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 32.5 + (((tickAnim - 49) / 4) * (0-(32.5)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (32.5-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone3, bone3.rotateAngleX + (float) Math.toRadians(xx), bone3.rotateAngleY + (float) Math.toRadians(yy), bone3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 19) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(xx), body7.rotateAngleY + (float) Math.toRadians(yy), body7.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBeurlenia entity = (EntityPrehistoricFloraBeurlenia) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = -10 + (((tickAnim - 0) / 7) * (-4.58231-(-10)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.54424-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.03387-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -4.58231 + (((tickAnim - 7) / 6) * (-3.29908-(-4.58231)));
            yy = -0.54424 + (((tickAnim - 7) / 6) * (-0.73586-(-0.54424)));
            zz = -2.03387 + (((tickAnim - 7) / 6) * (1.17898-(-2.03387)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -3.29908 + (((tickAnim - 13) / 3) * (-2.44548-(-3.29908)));
            yy = -0.73586 + (((tickAnim - 13) / 3) * (-1.29256-(-0.73586)));
            zz = 1.17898 + (((tickAnim - 13) / 3) * (-4.83045-(1.17898)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = -2.44548 + (((tickAnim - 16) / 5) * (-3.9171-(-2.44548)));
            yy = -1.29256 + (((tickAnim - 16) / 5) * (-0.18721-(-1.29256)));
            zz = -4.83045 + (((tickAnim - 16) / 5) * (-0.17579-(-4.83045)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -3.9171 + (((tickAnim - 21) / 5) * (-9.40323-(-3.9171)));
            yy = -0.18721 + (((tickAnim - 21) / 5) * (0.75491-(-0.18721)));
            zz = -0.17579 + (((tickAnim - 21) / 5) * (3.4923-(-0.17579)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = -9.40323 + (((tickAnim - 26) / 7) * (-6.52938-(-9.40323)));
            yy = 0.75491 + (((tickAnim - 26) / 7) * (0.48609-(0.75491)));
            zz = 3.4923 + (((tickAnim - 26) / 7) * (2.37123-(3.4923)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -6.52938 + (((tickAnim - 33) / 5) * (-7.52892-(-6.52938)));
            yy = 0.48609 + (((tickAnim - 33) / 5) * (0.01976-(0.48609)));
            zz = 2.37123 + (((tickAnim - 33) / 5) * (-0.78474-(2.37123)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -7.52892 + (((tickAnim - 38) / 5) * (-8.51587-(-7.52892)));
            yy = 0.01976 + (((tickAnim - 38) / 5) * (0.15996-(0.01976)));
            zz = -0.78474 + (((tickAnim - 38) / 5) * (0.51813-(-0.78474)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -8.51587 + (((tickAnim - 43) / 7) * (-10-(-8.51587)));
            yy = 0.15996 + (((tickAnim - 43) / 7) * (0-(0.15996)));
            zz = 0.51813 + (((tickAnim - 43) / 7) * (0-(0.51813)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-0.92-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = -0.25 + (((tickAnim - 9) / 4) * (0.1-(-0.25)));
            zz = -0.92 + (((tickAnim - 9) / 4) * (-1.84-(-0.92)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 7) * (0-(0.1)));
            zz = -1.84 + (((tickAnim - 13) / 7) * (-2-(-1.84)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = -2 + (((tickAnim - 20) / 13) * (-1.5-(-2)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = -1.5 + (((tickAnim - 33) / 7) * (-0.5-(-1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 40) / 10) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25-60))*20), legleft2.rotateAngleZ + (float) Math.toRadians(10));


        this.setRotateAngle(antennaleft, antennaleft.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25+115))*2.5), antennaleft.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72/0.25+45))*2.5), antennaleft.rotateAngleZ + (float) Math.toRadians(-20));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 7.5 + (((tickAnim - 0) / 13) * (17.5-(7.5)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 36) {
            xx = 17.5 + (((tickAnim - 13) / 23) * (8.86-(17.5)));
            yy = 0 + (((tickAnim - 13) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 23) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 8.86 + (((tickAnim - 36) / 14) * (7.5-(8.86)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72/0.25-60))*20), legleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*5), legleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.25))*20), legright.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*5), legright2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25))*20), legright2.rotateAngleZ + (float) Math.toRadians(-10));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -45 + (((tickAnim - 0) / 7) * (-55.83459-(-45)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.35692-(0)));
            zz = 57.5 + (((tickAnim - 0) / 7) * (64.99777-(57.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -55.83459 + (((tickAnim - 7) / 3) * (-43.78684-(-55.83459)));
            yy = -0.35692 + (((tickAnim - 7) / 3) * (11.58733-(-0.35692)));
            zz = 64.99777 + (((tickAnim - 7) / 3) * (47.70187-(64.99777)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -43.78684 + (((tickAnim - 10) / 3) * (-17.25136-(-43.78684)));
            yy = 11.58733 + (((tickAnim - 10) / 3) * (20.54534-(11.58733)));
            zz = 47.70187 + (((tickAnim - 10) / 3) * (34.7302-(47.70187)));
        }
        else if (tickAnim >= 13 && tickAnim < 32) {
            xx = -17.25136 + (((tickAnim - 13) / 19) * (-19.75109-(-17.25136)));
            yy = 20.54534 + (((tickAnim - 13) / 19) * (18.09882-(20.54534)));
            zz = 34.7302 + (((tickAnim - 13) / 19) * (39.32655-(34.7302)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -19.75109 + (((tickAnim - 32) / 5) * (-50.41997-(-19.75109)));
            yy = 18.09882 + (((tickAnim - 32) / 5) * (8.16114-(18.09882)));
            zz = 39.32655 + (((tickAnim - 32) / 5) * (54.4113-(39.32655)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = -50.41997 + (((tickAnim - 37) / 4) * (-57.64403-(-50.41997)));
            yy = 8.16114 + (((tickAnim - 37) / 4) * (-0.12027-(8.16114)));
            zz = 54.4113 + (((tickAnim - 37) / 4) * (66.98194-(54.4113)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -57.64403 + (((tickAnim - 41) / 9) * (-45-(-57.64403)));
            yy = -0.12027 + (((tickAnim - 41) / 9) * (0-(-0.12027)));
            zz = 66.98194 + (((tickAnim - 41) / 9) * (57.5-(66.98194)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -45 + (((tickAnim - 0) / 5) * (-55.83459-(-45)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.35692-(0)));
            zz = -57.5 + (((tickAnim - 0) / 5) * (-64.99777-(-57.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -55.83459 + (((tickAnim - 5) / 3) * (-43.78684-(-55.83459)));
            yy = 0.35692 + (((tickAnim - 5) / 3) * (-11.58733-(0.35692)));
            zz = -64.99777 + (((tickAnim - 5) / 3) * (-47.70187-(-64.99777)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -43.78684 + (((tickAnim - 8) / 3) * (-17.14838-(-43.78684)));
            yy = -11.58733 + (((tickAnim - 8) / 3) * (-20.6267-(-11.58733)));
            zz = -47.70187 + (((tickAnim - 8) / 3) * (-32.91853-(-47.70187)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -17.14838 + (((tickAnim - 11) / 2) * (-25.48709-(-17.14838)));
            yy = -20.6267 + (((tickAnim - 11) / 2) * (-13.28987-(-20.6267)));
            zz = -32.91853 + (((tickAnim - 11) / 2) * (-40.30606-(-32.91853)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -25.48709 + (((tickAnim - 13) / 7) * (-27.27999-(-25.48709)));
            yy = -13.28987 + (((tickAnim - 13) / 7) * (-11.83631-(-13.28987)));
            zz = -40.30606 + (((tickAnim - 13) / 7) * (-40.81074-(-40.30606)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -27.27999 + (((tickAnim - 20) / 13) * (-21.99308-(-27.27999)));
            yy = -11.83631 + (((tickAnim - 20) / 13) * (-16.13438-(-11.83631)));
            zz = -40.81074 + (((tickAnim - 20) / 13) * (-44.8513-(-40.81074)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -21.99308 + (((tickAnim - 33) / 5) * (-12.48463-(-21.99308)));
            yy = -16.13438 + (((tickAnim - 33) / 5) * (-25.29021-(-16.13438)));
            zz = -44.8513 + (((tickAnim - 33) / 5) * (-36.02424-(-44.8513)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -12.48463 + (((tickAnim - 38) / 5) * (-63.91981-(-12.48463)));
            yy = -25.29021 + (((tickAnim - 38) / 5) * (-3.57345-(-25.29021)));
            zz = -36.02424 + (((tickAnim - 38) / 5) * (-77.41904-(-36.02424)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -63.91981 + (((tickAnim - 43) / 7) * (-45-(-63.91981)));
            yy = -3.57345 + (((tickAnim - 43) / 7) * (0-(-3.57345)));
            zz = -77.41904 + (((tickAnim - 43) / 7) * (-57.5-(-77.41904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 84.61735 + (((tickAnim - 0) / 3) * (54.26711-(84.61735)));
            yy = 25.19136 + (((tickAnim - 0) / 3) * (32.26459-(25.19136)));
            zz = -83.22893 + (((tickAnim - 0) / 3) * (-59.09348-(-83.22893)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 54.26711 + (((tickAnim - 3) / 4) * (31.41727-(54.26711)));
            yy = 32.26459 + (((tickAnim - 3) / 4) * (39.33767-(32.26459)));
            zz = -59.09348 + (((tickAnim - 3) / 4) * (-34.95852-(-59.09348)));
        }
        else if (tickAnim >= 7 && tickAnim < 21) {
            xx = 31.41727 + (((tickAnim - 7) / 14) * (52.09717-(31.41727)));
            yy = 39.33767 + (((tickAnim - 7) / 14) * (37.39916-(39.33767)));
            zz = -34.95852 + (((tickAnim - 7) / 14) * (-55.47479-(-34.95852)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 52.09717 + (((tickAnim - 21) / 5) * (79.97558-(52.09717)));
            yy = 37.39916 + (((tickAnim - 21) / 5) * (32.1925-(37.39916)));
            zz = -55.47479 + (((tickAnim - 21) / 5) * (-82.38951-(-55.47479)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 79.97558 + (((tickAnim - 26) / 4) * (103.70758-(79.97558)));
            yy = 32.1925 + (((tickAnim - 26) / 4) * (27.85362-(32.1925)));
            zz = -82.38951 + (((tickAnim - 26) / 4) * (-104.81845-(-82.38951)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 103.70758 + (((tickAnim - 30) / 20) * (84.61735-(103.70758)));
            yy = 27.85362 + (((tickAnim - 30) / 20) * (25.19136-(27.85362)));
            zz = -104.81845 + (((tickAnim - 30) / 20) * (-83.22893-(-104.81845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 84.61735 + (((tickAnim - 0) / 11) * (103.77924-(84.61735)));
            yy = -25.19136 + (((tickAnim - 0) / 11) * (-25.5578-(-25.19136)));
            zz = 83.22893 + (((tickAnim - 0) / 11) * (101.52724-(83.22893)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 103.77924 + (((tickAnim - 11) / 4) * (54.26711-(103.77924)));
            yy = -25.5578 + (((tickAnim - 11) / 4) * (-32.26459-(-25.5578)));
            zz = 101.52724 + (((tickAnim - 11) / 4) * (59.09348-(101.52724)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 54.26711 + (((tickAnim - 15) / 4) * (40.00394-(54.26711)));
            yy = -32.26459 + (((tickAnim - 15) / 4) * (-32.25107-(-32.26459)));
            zz = 59.09348 + (((tickAnim - 15) / 4) * (44.5038-(59.09348)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 40.00394 + (((tickAnim - 19) / 8) * (44.9351-(40.00394)));
            yy = -32.25107 + (((tickAnim - 19) / 8) * (-40.60064-(-32.25107)));
            zz = 44.5038 + (((tickAnim - 19) / 8) * (43.11736-(44.5038)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 44.9351 + (((tickAnim - 27) / 5) * (79.97558-(44.9351)));
            yy = -40.60064 + (((tickAnim - 27) / 5) * (-32.1925-(-40.60064)));
            zz = 43.11736 + (((tickAnim - 27) / 5) * (82.38951-(43.11736)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 79.97558 + (((tickAnim - 32) / 4) * (99.81026-(79.97558)));
            yy = -32.1925 + (((tickAnim - 32) / 4) * (-27.38561-(-32.1925)));
            zz = 82.38951 + (((tickAnim - 32) / 4) * (97.41345-(82.38951)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 99.81026 + (((tickAnim - 36) / 14) * (84.61735-(99.81026)));
            yy = -27.38561 + (((tickAnim - 36) / 14) * (-25.19136-(-27.38561)));
            zz = 97.41345 + (((tickAnim - 36) / 14) * (83.22893-(97.41345)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 148.35665 + (((tickAnim - 0) / 7) * (158.92118-(148.35665)));
            yy = 101.8538 + (((tickAnim - 0) / 7) * (108.04128-(101.8538)));
            zz = -140.4886 + (((tickAnim - 0) / 7) * (-141.73655-(-140.4886)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 158.92118 + (((tickAnim - 7) / 3) * (134.31979-(158.92118)));
            yy = 108.04128 + (((tickAnim - 7) / 3) * (93.26057-(108.04128)));
            zz = -141.73655 + (((tickAnim - 7) / 3) * (-128.72258-(-141.73655)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 134.31979 + (((tickAnim - 10) / 3) * (133.36896-(134.31979)));
            yy = 93.26057 + (((tickAnim - 10) / 3) * (82.17527-(93.26057)));
            zz = -128.72258 + (((tickAnim - 10) / 3) * (-118.9623-(-128.72258)));
        }
        else if (tickAnim >= 13 && tickAnim < 33) {
            xx = 133.36896 + (((tickAnim - 13) / 20) * (124.57654-(133.36896)));
            yy = 82.17527 + (((tickAnim - 13) / 20) * (87.10786-(82.17527)));
            zz = -118.9623 + (((tickAnim - 13) / 20) * (-117.2229-(-118.9623)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 124.57654 + (((tickAnim - 33) / 5) * (127.13151-(124.57654)));
            yy = 87.10786 + (((tickAnim - 33) / 5) * (96.96987-(87.10786)));
            zz = -117.2229 + (((tickAnim - 33) / 5) * (-130.00811-(-117.2229)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 127.13151 + (((tickAnim - 38) / 4) * (154.68648-(127.13151)));
            yy = 96.96987 + (((tickAnim - 38) / 4) * (106.83188-(96.96987)));
            zz = -130.00811 + (((tickAnim - 38) / 4) * (-142.79331-(-130.00811)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 154.68648 + (((tickAnim - 42) / 8) * (148.35665-(154.68648)));
            yy = 106.83188 + (((tickAnim - 42) / 8) * (101.8538-(106.83188)));
            zz = -142.79331 + (((tickAnim - 42) / 8) * (-140.4886-(-142.79331)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 148.35665 + (((tickAnim - 0) / 4) * (134.31979-(148.35665)));
            yy = -101.8538 + (((tickAnim - 0) / 4) * (-93.26057-(-101.8538)));
            zz = 140.4886 + (((tickAnim - 0) / 4) * (128.72258-(140.4886)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 134.31979 + (((tickAnim - 4) / 4) * (131.99603-(134.31979)));
            yy = -93.26057 + (((tickAnim - 4) / 4) * (-81.75487-(-93.26057)));
            zz = 128.72258 + (((tickAnim - 4) / 4) * (129.82961-(128.72258)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 131.99603 + (((tickAnim - 8) / 5) * (142.80314-(131.99603)));
            yy = -81.75487 + (((tickAnim - 8) / 5) * (-89.95025-(-81.75487)));
            zz = 129.82961 + (((tickAnim - 8) / 5) * (131.73607-(129.82961)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 142.80314 + (((tickAnim - 13) / 13) * (139.09964-(142.80314)));
            yy = -89.95025 + (((tickAnim - 13) / 13) * (-91.75792-(-89.95025)));
            zz = 131.73607 + (((tickAnim - 13) / 13) * (129.57952-(131.73607)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 139.09964 + (((tickAnim - 26) / 7) * (133.30164-(139.09964)));
            yy = -91.75792 + (((tickAnim - 26) / 7) * (-90.21709-(-91.75792)));
            zz = 129.57952 + (((tickAnim - 26) / 7) * (122.98373-(129.57952)));
        }
        else if (tickAnim >= 33 && tickAnim < 39) {
            xx = 133.30164 + (((tickAnim - 33) / 6) * (122.2953-(133.30164)));
            yy = -90.21709 + (((tickAnim - 33) / 6) * (-86.36396-(-90.21709)));
            zz = 122.98373 + (((tickAnim - 33) / 6) * (116.80138-(122.98373)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = 122.2953 + (((tickAnim - 39) / 4) * (127.13151-(122.2953)));
            yy = -86.36396 + (((tickAnim - 39) / 4) * (-96.96987-(-86.36396)));
            zz = 116.80138 + (((tickAnim - 39) / 4) * (130.00811-(116.80138)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 127.13151 + (((tickAnim - 43) / 5) * (151.53253-(127.13151)));
            yy = -96.96987 + (((tickAnim - 43) / 5) * (-103.33207-(-96.96987)));
            zz = 130.00811 + (((tickAnim - 43) / 5) * (143.51761-(130.00811)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 151.53253 + (((tickAnim - 48) / 2) * (148.35665-(151.53253)));
            yy = -103.33207 + (((tickAnim - 48) / 2) * (-101.8538-(-103.33207)));
            zz = 143.51761 + (((tickAnim - 48) / 2) * (140.4886-(143.51761)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(antennaright, antennaright.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25-115))*2.5), antennaright.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72/0.25+125))*2.5), antennaright.rotateAngleZ + (float) Math.toRadians(20));


        this.setRotateAngle(antennaleft2, antennaleft2.rotateAngleX + (float) Math.toRadians(0), antennaleft2.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72/0.25+60))*10), antennaleft2.rotateAngleZ + (float) Math.toRadians(-20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25-115))*5));


        this.setRotateAngle(antennaright2, antennaright2.rotateAngleX + (float) Math.toRadians(0), antennaright2.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*72/0.25-60))*10), antennaright2.rotateAngleZ + (float) Math.toRadians(20-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*36/0.25+115))*5));


        this.setRotateAngle(gillleft, gillleft.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-30))*20), gillleft.rotateAngleY + (float) Math.toRadians(0), gillleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright, gillright.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25))*20), gillright.rotateAngleY + (float) Math.toRadians(0), gillright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft2, gillleft2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-30*2))*20), gillleft2.rotateAngleY + (float) Math.toRadians(0), gillleft2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright2, gillright2.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-30))*20), gillright2.rotateAngleY + (float) Math.toRadians(0), gillright2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft3, gillleft3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-90))*20), gillleft3.rotateAngleY + (float) Math.toRadians(0), gillleft3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright3, gillright3.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-60))*20), gillright3.rotateAngleY + (float) Math.toRadians(0), gillright3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft4, gillleft4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-120))*20), gillleft4.rotateAngleY + (float) Math.toRadians(0), gillleft4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright4, gillright4.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-90))*20), gillright4.rotateAngleY + (float) Math.toRadians(0), gillright4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillleft5, gillleft5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-150))*20), gillleft5.rotateAngleY + (float) Math.toRadians(0), gillleft5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(gillright5, gillright5.rotateAngleX + (float) Math.toRadians(30+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.25-120))*20), gillright5.rotateAngleY + (float) Math.toRadians(0), gillright5.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(-2), body6.rotateAngleY + (float) Math.toRadians(0), body6.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (24.51121-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (6.05552-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (7.24454-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 24.51121 + (((tickAnim - 6) / 3) * (32.45326-(24.51121)));
            yy = 6.05552 + (((tickAnim - 6) / 3) * (7.73688-(6.05552)));
            zz = 7.24454 + (((tickAnim - 6) / 3) * (9.83769-(7.24454)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 32.45326 + (((tickAnim - 9) / 3) * (-31.18261-(32.45326)));
            yy = 7.73688 + (((tickAnim - 9) / 3) * (7.89312-(7.73688)));
            zz = 9.83769 + (((tickAnim - 9) / 3) * (-16.19133-(9.83769)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -31.18261 + (((tickAnim - 12) / 5) * (18.93608-(-31.18261)));
            yy = 7.89312 + (((tickAnim - 12) / 5) * (8.43632-(7.89312)));
            zz = -16.19133 + (((tickAnim - 12) / 5) * (6.24806-(-16.19133)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 18.93608 + (((tickAnim - 17) / 2) * (50.77402-(18.93608)));
            yy = 8.43632 + (((tickAnim - 17) / 2) * (11.2244-(8.43632)));
            zz = 6.24806 + (((tickAnim - 17) / 2) * (33.48484-(6.24806)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 50.77402 + (((tickAnim - 19) / 4) * (41.21087-(50.77402)));
            yy = 11.2244 + (((tickAnim - 19) / 4) * (8.24852-(11.2244)));
            zz = 33.48484 + (((tickAnim - 19) / 4) * (11.70063-(33.48484)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 41.21087 + (((tickAnim - 23) / 3) * (45.82726-(41.21087)));
            yy = 8.24852 + (((tickAnim - 23) / 3) * (10.42003-(8.24852)));
            zz = 11.70063 + (((tickAnim - 23) / 3) * (17.85077-(11.70063)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 45.82726 + (((tickAnim - 26) / 3) * (-0.5928-(45.82726)));
            yy = 10.42003 + (((tickAnim - 26) / 3) * (8.84191-(10.42003)));
            zz = 17.85077 + (((tickAnim - 26) / 3) * (18.11589-(17.85077)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = -0.5928 + (((tickAnim - 29) / 21) * (0-(-0.5928)));
            yy = 8.84191 + (((tickAnim - 29) / 21) * (0-(8.84191)));
            zz = 18.11589 + (((tickAnim - 29) / 21) * (0-(18.11589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (45-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 45 + (((tickAnim - 12) / 5) * (0-(45)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 17) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 12) * (67.5-(0)));
            zz = 0 + (((tickAnim - 17) / 12) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = 67.5 + (((tickAnim - 29) / 21) * (0-(67.5)));
            zz = 0 + (((tickAnim - 29) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3_1, legleft3_1.rotateAngleX + (float) Math.toRadians(xx), legleft3_1.rotateAngleY + (float) Math.toRadians(yy), legleft3_1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (37.5-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 37.5 + (((tickAnim - 12) / 5) * (0-(37.5)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 17) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 12) * (37.5-(0)));
            zz = 0 + (((tickAnim - 17) / 12) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 29) / 21) * (0-(0)));
            yy = 37.5 + (((tickAnim - 29) / 21) * (0-(37.5)));
            zz = 0 + (((tickAnim - 29) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3_2, legleft3_2.rotateAngleX + (float) Math.toRadians(xx), legleft3_2.rotateAngleY + (float) Math.toRadians(yy), legleft3_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (24.51121-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-6.05552-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-7.24454-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 24.51121 + (((tickAnim - 11) / 3) * (32.45326-(24.51121)));
            yy = -6.05552 + (((tickAnim - 11) / 3) * (-7.73688-(-6.05552)));
            zz = -7.24454 + (((tickAnim - 11) / 3) * (-9.83769-(-7.24454)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 32.45326 + (((tickAnim - 14) / 3) * (-31.18261-(32.45326)));
            yy = -7.73688 + (((tickAnim - 14) / 3) * (-7.89312-(-7.73688)));
            zz = -9.83769 + (((tickAnim - 14) / 3) * (16.19133-(-9.83769)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -31.18261 + (((tickAnim - 17) / 5) * (18.93608-(-31.18261)));
            yy = -7.89312 + (((tickAnim - 17) / 5) * (-8.43632-(-7.89312)));
            zz = 16.19133 + (((tickAnim - 17) / 5) * (-6.24806-(16.19133)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 18.93608 + (((tickAnim - 22) / 2) * (50.77402-(18.93608)));
            yy = -8.43632 + (((tickAnim - 22) / 2) * (-11.2244-(-8.43632)));
            zz = -6.24806 + (((tickAnim - 22) / 2) * (-33.48484-(-6.24806)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 50.77402 + (((tickAnim - 24) / 4) * (41.21087-(50.77402)));
            yy = -11.2244 + (((tickAnim - 24) / 4) * (-8.24852-(-11.2244)));
            zz = -33.48484 + (((tickAnim - 24) / 4) * (-11.70063-(-33.48484)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 41.21087 + (((tickAnim - 28) / 3) * (45.82726-(41.21087)));
            yy = -8.24852 + (((tickAnim - 28) / 3) * (-10.42003-(-8.24852)));
            zz = -11.70063 + (((tickAnim - 28) / 3) * (-17.85077-(-11.70063)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 45.82726 + (((tickAnim - 31) / 3) * (-0.5928-(45.82726)));
            yy = -10.42003 + (((tickAnim - 31) / 3) * (-8.84191-(-10.42003)));
            zz = -17.85077 + (((tickAnim - 31) / 3) * (-18.11589-(-17.85077)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = -0.5928 + (((tickAnim - 34) / 16) * (0-(-0.5928)));
            yy = -8.84191 + (((tickAnim - 34) / 16) * (0-(-8.84191)));
            zz = -18.11589 + (((tickAnim - 34) / 16) * (0-(-18.11589)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -45 + (((tickAnim - 17) / 5) * (0-(-45)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 22) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 12) * (-67.5-(0)));
            zz = 0 + (((tickAnim - 22) / 12) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -67.5 + (((tickAnim - 34) / 16) * (0-(-67.5)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3_1, legright3_1.rotateAngleX + (float) Math.toRadians(xx), legright3_1.rotateAngleY + (float) Math.toRadians(yy), legright3_1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-37.5-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = -37.5 + (((tickAnim - 17) / 5) * (0-(-37.5)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 22) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 12) * (-37.5-(0)));
            zz = 0 + (((tickAnim - 22) / 12) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = -37.5 + (((tickAnim - 34) / 16) * (0-(-37.5)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3_2, legright3_2.rotateAngleX + (float) Math.toRadians(xx), legright3_2.rotateAngleY + (float) Math.toRadians(yy), legright3_2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 50) {
            xx = -12.5 + (((tickAnim - 21) / 29) * (0-(-12.5)));
            yy = 0 + (((tickAnim - 21) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(xx), body5.rotateAngleY + (float) Math.toRadians(yy), body5.rotateAngleZ + (float) Math.toRadians(zz));
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBeurlenia e = (EntityPrehistoricFloraBeurlenia) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
