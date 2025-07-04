package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMacropenaeus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer base;
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
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;
    private final AdvancedModelRenderer antennaright2;
    private final AdvancedModelRenderer antennaleft2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pleopodright;
    private final AdvancedModelRenderer pleopodleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer pleopodright2;
    private final AdvancedModelRenderer pleopodleft2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer pleopodright3;
    private final AdvancedModelRenderer pleopodleft3;
    private final AdvancedModelRenderer pleopodright4;
    private final AdvancedModelRenderer pleopodleft4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer pleopodright5;
    private final AdvancedModelRenderer pleopodleft5;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;



    public ModelMacropenaeus() {

        this.textureWidth = 40;
        this.textureHeight = 40;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 17.6F, -1.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.075F, -0.2F);
        this.base.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 24, 0.0F, 1.0F, -5.75F, 0, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.125F, 0.3F);
        this.base.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 35, -1.0F, 1.5F, -4.0F, 2, 1, 1, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.3F, -4.35F);
        this.base.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 31, 0.0F, -0.25F, -1.0F, 0, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.2F, 0.775F, -5.3F);
        this.base.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, -0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 34, 0.0F, 0.75F, -1.0F, 1, 0, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.2F, 0.775F, -5.3F);
        this.base.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 34, -1.0F, 0.75F, -1.0F, 1, 0, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.3F, -4.35F);
        this.base.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 31, 0.0F, -0.25F, -1.0F, 0, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.3F, -0.5F);
        this.base.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 34, -1.0F, 0.0F, -4.0F, 2, 2, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.95F, -0.55F);
        this.base.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 30, -1.0F, 1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.85F, 2.4F);
        this.base.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 35, -1.0F, 0.0F, -4.0F, 2, 3, 1, 0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.375F, 0.7F);
        this.base.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0873F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 19, -1.0F, 0.0F, -4.0F, 2, 2, 3, 0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.5F, 2.025F, -2.55F);
        this.base.addChild(legright);
        this.setRotateAngle(legright, -0.0873F, 0.0873F, 0.0F);
        this.legright.cubeList.add(new ModelBox(legright, 10, 19, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.5F, 2.025F, -2.55F);
        this.base.addChild(legleft);
        this.setRotateAngle(legleft, -0.0873F, -0.0873F, 0.0F);
        this.legleft.cubeList.add(new ModelBox(legleft, 10, 19, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.6F, 2.025F, -2.3F);
        this.base.addChild(legright2);
        this.setRotateAngle(legright2, 0.0436F, 0.3491F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 20, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.6F, 2.025F, -2.3F);
        this.base.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0436F, -0.3491F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 20, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.6F, 2.025F, -1.95F);
        this.base.addChild(legright3);
        this.setRotateAngle(legright3, 0.1309F, 0.5236F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.6F, 2.025F, -1.95F);
        this.base.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.1309F, -0.5236F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-0.6F, 2.025F, -1.6F);
        this.base.addChild(legright4);
        this.setRotateAngle(legright4, 0.1745F, 0.8727F, 0.0F);
        this.legright4.cubeList.add(new ModelBox(legright4, 10, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(0.6F, 2.025F, -1.6F);
        this.base.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.1745F, -0.8727F, 0.0F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 10, 11, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-0.6F, 2.025F, -1.25F);
        this.base.addChild(legright5);
        this.setRotateAngle(legright5, 0.2618F, 1.2217F, 0.0F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 19, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(0.6F, 2.025F, -1.25F);
        this.base.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.2618F, -1.2217F, 0.0F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 19, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.25F, 1.05F, -3.95F);
        this.base.addChild(antennaright);
        this.setRotateAngle(antennaright, -0.0873F, 0.1745F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 20, 24, 0.0F, -1.5F, -3.4F, 0, 2, 4, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.25F, 1.05F, -3.95F);
        this.base.addChild(antennaleft);
        this.setRotateAngle(antennaleft, -0.0873F, -0.1745F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 20, 24, 0.0F, -1.5F, -3.4F, 0, 2, 4, 0.0F, true));

        this.antennaright2 = new AdvancedModelRenderer(this);
        this.antennaright2.setRotationPoint(0.0F, 1.45F, -3.95F);
        this.base.addChild(antennaright2);
        this.setRotateAngle(antennaright2, -0.1745F, 0.3054F, 0.0F);
        this.antennaright2.cubeList.add(new ModelBox(antennaright2, 0, 0, -9.0F, 0.0F, -5.4F, 9, 0, 11, 0.0F, false));

        this.antennaleft2 = new AdvancedModelRenderer(this);
        this.antennaleft2.setRotationPoint(0.0F, 1.45F, -3.95F);
        this.base.addChild(antennaleft2);
        this.setRotateAngle(antennaleft2, -0.1745F, -0.3054F, 0.0F);
        this.antennaleft2.cubeList.add(new ModelBox(antennaleft2, 0, 0, 0.0F, 0.0F, -5.4F, 9, 0, 11, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.375F, -0.3F);
        this.base.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 28, 29, -1.0F, -0.5F, -0.1F, 2, 3, 2, -0.01F, false));

        this.pleopodright = new AdvancedModelRenderer(this);
        this.pleopodright.setRotationPoint(0.0F, 2.3F, 1.2F);
        this.body.addChild(pleopodright);
        this.setRotateAngle(pleopodright, 0.1745F, 0.2182F, 0.1745F);
        this.pleopodright.cubeList.add(new ModelBox(pleopodright, 36, 26, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodleft = new AdvancedModelRenderer(this);
        this.pleopodleft.setRotationPoint(0.0F, 2.3F, 1.2F);
        this.body.addChild(pleopodleft);
        this.setRotateAngle(pleopodleft, 0.1745F, -0.2182F, -0.1745F);
        this.pleopodleft.cubeList.add(new ModelBox(pleopodleft, 36, 26, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.9F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 30, 11, -1.0F, -0.5F, -0.1F, 2, 3, 2, 0.01F, false));

        this.pleopodright2 = new AdvancedModelRenderer(this);
        this.pleopodright2.setRotationPoint(0.0F, 2.3F, 0.5F);
        this.body2.addChild(pleopodright2);
        this.setRotateAngle(pleopodright2, 0.1745F, 0.2182F, 0.1745F);
        this.pleopodright2.cubeList.add(new ModelBox(pleopodright2, 36, 28, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodleft2 = new AdvancedModelRenderer(this);
        this.pleopodleft2.setRotationPoint(0.0F, 2.3F, 0.5F);
        this.body2.addChild(pleopodleft2);
        this.setRotateAngle(pleopodleft2, 0.1745F, -0.2182F, -0.1745F);
        this.pleopodleft2.cubeList.add(new ModelBox(pleopodleft2, 36, 28, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 1.75F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, -0.3054F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 30, 20, -1.0F, -0.5F, -0.1F, 2, 2, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 24, 34, -1.0F, 1.15F, -0.1F, 2, 1, 2, -0.005F, false));

        this.pleopodright3 = new AdvancedModelRenderer(this);
        this.pleopodright3.setRotationPoint(0.0F, 2.1F, 0.5F);
        this.body3.addChild(pleopodright3);
        this.setRotateAngle(pleopodright3, 0.1745F, 0.2182F, 0.1745F);
        this.pleopodright3.cubeList.add(new ModelBox(pleopodright3, 12, 35, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodleft3 = new AdvancedModelRenderer(this);
        this.pleopodleft3.setRotationPoint(0.0F, 2.1F, 0.5F);
        this.body3.addChild(pleopodleft3);
        this.setRotateAngle(pleopodleft3, 0.1745F, -0.2182F, -0.1745F);
        this.pleopodleft3.cubeList.add(new ModelBox(pleopodleft3, 12, 35, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.pleopodright4 = new AdvancedModelRenderer(this);
        this.pleopodright4.setRotationPoint(0.0F, 2.1F, 1.25F);
        this.body3.addChild(pleopodright4);
        this.setRotateAngle(pleopodright4, 0.1745F, 0.2182F, 0.1745F);
        this.pleopodright4.cubeList.add(new ModelBox(pleopodright4, 14, 35, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodleft4 = new AdvancedModelRenderer(this);
        this.pleopodleft4.setRotationPoint(0.0F, 2.1F, 1.25F);
        this.body3.addChild(pleopodleft4);
        this.setRotateAngle(pleopodleft4, 0.1745F, -0.2182F, -0.1745F);
        this.pleopodleft4.cubeList.add(new ModelBox(pleopodleft4, 14, 35, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.1F, 1.5F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, -0.3054F, 0.0F, 0.0F);
        this.body4.cubeList.add(new ModelBox(body4, 0, 31, -1.0F, -0.5F, -0.1F, 2, 2, 2, -0.01F, false));

        this.pleopodright5 = new AdvancedModelRenderer(this);
        this.pleopodright5.setRotationPoint(0.0F, 1.25F, 1.25F);
        this.body4.addChild(pleopodright5);
        this.setRotateAngle(pleopodright5, 0.1745F, 0.2182F, 0.1745F);
        this.pleopodright5.cubeList.add(new ModelBox(pleopodright5, 36, 24, -1.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, false));

        this.pleopodleft5 = new AdvancedModelRenderer(this);
        this.pleopodleft5.setRotationPoint(0.0F, 1.25F, 1.25F);
        this.body4.addChild(pleopodleft5);
        this.setRotateAngle(pleopodleft5, 0.1745F, -0.2182F, -0.1745F);
        this.pleopodleft5.cubeList.add(new ModelBox(pleopodleft5, 36, 24, 0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.2618F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 8, 31, -1.0F, -0.5F, -0.1F, 2, 2, 2, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.25F, 0.0F, 1.75F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.6109F, 0.0436F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 27, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.25F, 0.0F, 1.75F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.4363F, 0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 27, 0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.25F, 0.0F, 1.75F);
        this.body5.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.4363F, -0.6109F, -0.0436F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 27, -1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.25F, 0.0F, 1.75F);
        this.body5.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4363F, -0.3054F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 27, -1.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.75F, 2.0F);
        this.body5.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 30, 16, -0.5F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.base.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(base, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.1F, 0.0F, 0.0F);
        this.base.offsetZ = -0.0F;
        this.base.offsetY = -0.0F;
        this.base.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.base.offsetY = -7.0F;
        this.base.offsetX = 0.1F;
        this.base.rotateAngleY = (float) Math.toRadians(210);
        this.base.rotateAngleX = (float) Math.toRadians(8);
        this.base.rotateAngleZ = (float) Math.toRadians(-4);
        this.base.scaleChildren = true;
        float scaler = 10F;
        this.base.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(base, 0.5F, 3.7F, 0.0F);
        this.setRotateAngle(body, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body3, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body4, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body5, -0.1F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.base.render(f);
        //Reset rotations, positions and sizing:
        this.base.setScale(1.0F, 1.0F, 1.0F);
        this.base.scaleChildren = false;
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
        //this.bone.offsetY = 1.25F;

        AdvancedModelRenderer[] Tail = {this.body, this.body2, this.body3, this.body4, this.body5};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.4F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.swing(antennaleft, 0.3F, -0.2F, true, 0f, 0.2f, f2, 1F);
            this.swing(antennaright, 0.3F, 0.2F, true, 0f, -0.2f, f2, 1F);



            this.swing(antennaleft2, 0.3F, 0.15F, false, -2f, 0f, f2, 1F);
            this.swing(antennaright2, 0.3F, 0.15F, false, 2f, 0f, f2, 1F);

            float tailVdegree = 0.03F;
            float speedLeg = 1.2F;
            float degreeLeg = 0.45F;
            float degreeFront = (float) Math.toRadians(27.5);

            if(e.isInWater()) {
                this.chainWave(Tail, speed * 0.65F, tailVdegree, -2, f2, 1);
                this.walk(legleft, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.walk(legright, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.walk(legleft2, speedLeg, -degreeLeg, false, 0.5F, -0.5F, f2, 0.7F);
                this.walk(legright2, speedLeg, degreeLeg, false, 0.5F, 0.5F, f2, 0.7F);
                this.walk(legleft3, speedLeg, -degreeLeg, false, 1.0F, -0.5F, f2, 0.7F);
                this.walk(legright3, speedLeg, degreeLeg, false, 1.0F, 0.5F, f2, 0.7F);

                this.walk(legleft4, speedLeg, -degreeLeg, false, 1.5F, -0.5F, f2, 0.7F);
                this.walk(legright4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.walk(legleft5, speedLeg, -degreeLeg, false, 2.0F, -0.5F, f2, 0.7F);
                this.walk(legright5, speedLeg, degreeLeg, false, 2.0F, 0.5F, f2, 0.7F);


                this.swing(legleft, speedLeg, -degreeLeg, false, 0, -0.5F, f2, 0.7F);
                this.swing(legright, speedLeg, degreeLeg, false, 0, 0.5F, f2, 0.7F);
                this.swing(legleft2, speedLeg * 0.5F, -degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.swing(legright2, speedLeg * 0.5F, degreeFront, false, 3F, 0.5F, f2, 0.7F);
                this.swing(legleft3, speedLeg * 0.5F, -degreeFront, false, 3.0F, 0.5F, f2, 0.7F);
                this.swing(legright3, speedLeg * 0.5F, degreeFront, false, 0.5F, 0.5F, f2, 0.7F);
                this.swing(legleft4, speedLeg, -degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legright4, speedLeg, degreeLeg, false, 1.5F, 0.5F, f2, 0.7F);
                this.swing(legleft5, speedLeg, -degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);
                this.swing(legright5, speedLeg, degreeLeg, false, 2.5F, 0.5F, f2, 0.7F);

                this.walk(pleopodleft, speedLeg, -degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodright, speedLeg, degreeLeg, false, 3.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodleft2, speedLeg, -degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodright2, speedLeg, degreeLeg, false, 4.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodleft3, speedLeg, -degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodright3, speedLeg, degreeLeg, false, 4.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodleft4, speedLeg, -degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodright4, speedLeg, degreeLeg, false, 5.0F, 0.5F, f2, 0.7F);
                this.walk(pleopodleft5, speedLeg, -degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
                this.walk(pleopodright5, speedLeg, degreeLeg, false, 5.5F, 0.5F, f2, 0.7F);
            } else {

            }

            if (!e.isInWater()) {
                //this.bone.offsetY = 1.25F;
                this.base.rotateAngleZ = (float)Math.toRadians(90);
                this.antennaleft2.rotateAngleZ = (float)Math.toRadians(90);
                this.antennaright2.rotateAngleZ = -(float)Math.toRadians(90);
            }
            else {
                if (f3 == 0.0F) {
                    this.bob(base, -speed, 0.3F, false, f2, 2);
                }
                else
                {
                    this.bob(base, -speed, 1F, false, f2, 2);
                }
            }
        }
    }
}
