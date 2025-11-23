package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMyriapod;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLatzelia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer forcipuleright;
    private final AdvancedModelRenderer forcipuleleft;
    private final AdvancedModelRenderer maxillaright;
    private final AdvancedModelRenderer maxillaleft;
    private final AdvancedModelRenderer anrennaleft;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer anrennaright;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer legright4;
    private final AdvancedModelRenderer legleft4;
    private final AdvancedModelRenderer legright5;
    private final AdvancedModelRenderer legleft5;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer legright6;
    private final AdvancedModelRenderer legleft6;
    private final AdvancedModelRenderer legright7;
    private final AdvancedModelRenderer legleft7;
    private final AdvancedModelRenderer legright8;
    private final AdvancedModelRenderer legleft8;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer legright9;
    private final AdvancedModelRenderer legleft9;
    private final AdvancedModelRenderer legright10;
    private final AdvancedModelRenderer legleft10;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer legright11;
    private final AdvancedModelRenderer legleft11;
    private final AdvancedModelRenderer legright12;
    private final AdvancedModelRenderer legleft12;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer legright13;
    private final AdvancedModelRenderer legleft13;
    private final AdvancedModelRenderer legright14;
    private final AdvancedModelRenderer legleft14;
    private final AdvancedModelRenderer ultimatelegright;
    private final AdvancedModelRenderer ultimatelegleft;

    private ModelAnimator animator;

    public ModelLatzelia() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.0F, -2.0F);
        this.body.cubeList.add(new ModelBox(body, 8, 19, -1.0F, -1.0F, -3.75F, 2, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 21, -0.5F, -1.0F, -4.5F, 1, 1, 1, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 20, -0.9F, -1.0F, -4.4F, 1, 1, 1, -0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 20, -0.1F, -1.0F, -4.4F, 1, 1, 1, -0.02F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, -0.5F, -3.25F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, -1.0036F, 0.2618F);
        this.legright.cubeList.add(new ModelBox(legright, 18, 5, -7.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, -0.5F, -3.25F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, 1.0036F, -0.2618F);
        this.legleft.cubeList.add(new ModelBox(legleft, 18, 5, 0.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, true));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.0F, -0.5F, -2.25F);
        this.body.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.6981F, 0.1745F);
        this.legright2.cubeList.add(new ModelBox(legright2, 18, 5, -7.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.0F, -0.5F, -2.25F);
        this.body.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.6981F, -0.1745F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 18, 5, 0.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, true));

        this.forcipuleright = new AdvancedModelRenderer(this);
        this.forcipuleright.setRotationPoint(-0.75F, -0.25F, -3.75F);
        this.body.addChild(forcipuleright);
        this.setRotateAngle(forcipuleright, 0.0F, 0.4363F, 0.0F);
        this.forcipuleright.cubeList.add(new ModelBox(forcipuleright, 6, 10, -0.5F, 0.0F, -1.25F, 1, 0, 2, 0.0F, false));

        this.forcipuleleft = new AdvancedModelRenderer(this);
        this.forcipuleleft.setRotationPoint(0.75F, -0.25F, -3.75F);
        this.body.addChild(forcipuleleft);
        this.setRotateAngle(forcipuleleft, 0.0F, -0.4363F, 0.0F);
        this.forcipuleleft.cubeList.add(new ModelBox(forcipuleleft, 6, 10, -0.5F, 0.0F, -1.25F, 1, 0, 2, 0.0F, true));

        this.maxillaright = new AdvancedModelRenderer(this);
        this.maxillaright.setRotationPoint(-0.25F, 0.2F, -3.0F);
        this.body.addChild(maxillaright);
        this.setRotateAngle(maxillaright, 0.0F, 0.2182F, 0.0F);
        this.maxillaright.cubeList.add(new ModelBox(maxillaright, 6, 17, 0.0F, -1.0F, -2.5F, 0, 1, 2, 0.0F, false));

        this.maxillaleft = new AdvancedModelRenderer(this);
        this.maxillaleft.setRotationPoint(0.25F, 0.2F, -3.0F);
        this.body.addChild(maxillaleft);
        this.setRotateAngle(maxillaleft, 0.0F, -0.2182F, 0.0F);
        this.maxillaleft.cubeList.add(new ModelBox(maxillaleft, 6, 17, 0.0F, -1.0F, -2.5F, 0, 1, 2, 0.0F, true));

        this.anrennaleft = new AdvancedModelRenderer(this);
        this.anrennaleft.setRotationPoint(0.25F, -0.5F, -4.5F);
        this.body.addChild(anrennaleft);
        this.setRotateAngle(anrennaleft, -0.5672F, -0.3054F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.anrennaleft.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0423F, 0.1747F, -1.4457F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -0.5F, -13.0F, 0, 6, 13, 0.0F, true));

        this.anrennaright = new AdvancedModelRenderer(this);
        this.anrennaright.setRotationPoint(-0.25F, -0.5F, -4.5F);
        this.body.addChild(anrennaright);
        this.setRotateAngle(anrennaright, -0.5672F, 0.3054F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.anrennaright.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0423F, -0.1747F, 1.4457F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -0.5F, -13.0F, 0, 6, 13, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.5F, -2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 19, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.0F, 0.0F, 0.25F);
        this.body2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, -0.3491F, 0.1396F);
        this.legright3.cubeList.add(new ModelBox(legright3, 18, 5, -7.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.0F, 0.0F, 0.25F);
        this.body2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, 0.3491F, -0.1396F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 18, 5, 0.0F, -1.5F, 0.0F, 7, 4, 0, 0.0F, true));

        this.legright4 = new AdvancedModelRenderer(this);
        this.legright4.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.body2.addChild(legright4);
        this.setRotateAngle(legright4, 0.0F, -0.2182F, 0.2443F);
        this.legright4.cubeList.add(new ModelBox(legright4, 0, 27, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft4 = new AdvancedModelRenderer(this);
        this.legleft4.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.body2.addChild(legleft4);
        this.setRotateAngle(legleft4, 0.0F, 0.2182F, -0.2443F);
        this.legleft4.cubeList.add(new ModelBox(legleft4, 0, 27, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright5 = new AdvancedModelRenderer(this);
        this.legright5.setRotationPoint(-1.0F, 0.0F, 1.75F);
        this.body2.addChild(legright5);
        this.setRotateAngle(legright5, 0.0F, -0.0873F, 0.2531F);
        this.legright5.cubeList.add(new ModelBox(legright5, 0, 27, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft5 = new AdvancedModelRenderer(this);
        this.legleft5.setRotationPoint(1.0F, 0.0F, 1.75F);
        this.body2.addChild(legleft5);
        this.setRotateAngle(legleft5, 0.0F, 0.0873F, -0.2531F);
        this.legleft5.cubeList.add(new ModelBox(legleft5, 0, 27, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 9, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.legright6 = new AdvancedModelRenderer(this);
        this.legright6.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body3.addChild(legright6);
        this.setRotateAngle(legright6, 0.0F, 0.0436F, 0.2182F);
        this.legright6.cubeList.add(new ModelBox(legright6, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft6 = new AdvancedModelRenderer(this);
        this.legleft6.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body3.addChild(legleft6);
        this.setRotateAngle(legleft6, 0.0F, -0.0436F, -0.2182F);
        this.legleft6.cubeList.add(new ModelBox(legleft6, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright7 = new AdvancedModelRenderer(this);
        this.legright7.setRotationPoint(-1.5F, 0.0F, 1.15F);
        this.body3.addChild(legright7);
        this.setRotateAngle(legright7, 0.0F, 0.1309F, 0.2182F);
        this.legright7.cubeList.add(new ModelBox(legright7, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft7 = new AdvancedModelRenderer(this);
        this.legleft7.setRotationPoint(1.5F, 0.0F, 1.15F);
        this.body3.addChild(legleft7);
        this.setRotateAngle(legleft7, 0.0F, -0.1309F, -0.2182F);
        this.legleft7.cubeList.add(new ModelBox(legleft7, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright8 = new AdvancedModelRenderer(this);
        this.legright8.setRotationPoint(-1.5F, 0.0F, 1.75F);
        this.body3.addChild(legright8);
        this.setRotateAngle(legright8, 0.0F, 0.2182F, 0.2182F);
        this.legright8.cubeList.add(new ModelBox(legright8, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft8 = new AdvancedModelRenderer(this);
        this.legleft8.setRotationPoint(1.5F, 0.0F, 1.75F);
        this.body3.addChild(legleft8);
        this.setRotateAngle(legleft8, 0.0F, -0.2182F, -0.2182F);
        this.legleft8.cubeList.add(new ModelBox(legleft8, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 10, 10, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));

        this.legright9 = new AdvancedModelRenderer(this);
        this.legright9.setRotationPoint(-1.5F, 0.0F, 0.5F);
        this.body4.addChild(legright9);
        this.setRotateAngle(legright9, 0.0F, 0.3927F, 0.2356F);
        this.legright9.cubeList.add(new ModelBox(legright9, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft9 = new AdvancedModelRenderer(this);
        this.legleft9.setRotationPoint(1.5F, 0.0F, 0.5F);
        this.body4.addChild(legleft9);
        this.setRotateAngle(legleft9, 0.0F, -0.3927F, -0.2356F);
        this.legleft9.cubeList.add(new ModelBox(legleft9, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright10 = new AdvancedModelRenderer(this);
        this.legright10.setRotationPoint(-1.5F, 0.0F, 1.45F);
        this.body4.addChild(legright10);
        this.setRotateAngle(legright10, 0.0F, 0.5236F, 0.2443F);
        this.legright10.cubeList.add(new ModelBox(legright10, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft10 = new AdvancedModelRenderer(this);
        this.legleft10.setRotationPoint(1.5F, 0.0F, 1.45F);
        this.body4.addChild(legleft10);
        this.setRotateAngle(legleft10, 0.0F, -0.5236F, -0.2443F);
        this.legleft10.cubeList.add(new ModelBox(legleft10, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 10, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.legright11 = new AdvancedModelRenderer(this);
        this.legright11.setRotationPoint(-1.5F, 0.0F, 0.35F);
        this.body5.addChild(legright11);
        this.setRotateAngle(legright11, 0.0F, 0.7418F, 0.2793F);
        this.legright11.cubeList.add(new ModelBox(legright11, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft11 = new AdvancedModelRenderer(this);
        this.legleft11.setRotationPoint(1.5F, 0.0F, 0.35F);
        this.body5.addChild(legleft11);
        this.setRotateAngle(legleft11, 0.0F, -0.7418F, -0.2793F);
        this.legleft11.cubeList.add(new ModelBox(legleft11, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright12 = new AdvancedModelRenderer(this);
        this.legright12.setRotationPoint(-1.5F, 0.0F, 1.35F);
        this.body5.addChild(legright12);
        this.setRotateAngle(legright12, 0.0F, 0.9163F, 0.3316F);
        this.legright12.cubeList.add(new ModelBox(legright12, 0, 5, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft12 = new AdvancedModelRenderer(this);
        this.legleft12.setRotationPoint(1.5F, 0.0F, 1.35F);
        this.body5.addChild(legleft12);
        this.setRotateAngle(legleft12, 0.0F, -0.9163F, -0.3316F);
        this.legleft12.cubeList.add(new ModelBox(legleft12, 0, 5, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 14, 19, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.01F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 22, -0.5F, -0.5F, 1.0F, 1, 1, 1, 0.0F, false));

        this.legright13 = new AdvancedModelRenderer(this);
        this.legright13.setRotationPoint(-1.0F, 0.0F, 0.35F);
        this.body6.addChild(legright13);
        this.setRotateAngle(legright13, 0.0F, 1.0472F, 0.4276F);
        this.legright13.cubeList.add(new ModelBox(legright13, 0, 27, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft13 = new AdvancedModelRenderer(this);
        this.legleft13.setRotationPoint(1.0F, 0.0F, 0.35F);
        this.body6.addChild(legleft13);
        this.setRotateAngle(legleft13, 0.0F, -1.0472F, -0.4276F);
        this.legleft13.cubeList.add(new ModelBox(legleft13, 0, 27, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.legright14 = new AdvancedModelRenderer(this);
        this.legright14.setRotationPoint(-1.0F, 0.0F, 0.85F);
        this.body6.addChild(legright14);
        this.setRotateAngle(legright14, 0.0F, 1.2217F, 0.5672F);
        this.legright14.cubeList.add(new ModelBox(legright14, 0, 27, -9.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, false));

        this.legleft14 = new AdvancedModelRenderer(this);
        this.legleft14.setRotationPoint(1.0F, 0.0F, 0.85F);
        this.body6.addChild(legleft14);
        this.setRotateAngle(legleft14, 0.0F, -1.2217F, -0.5672F);
        this.legleft14.cubeList.add(new ModelBox(legleft14, 0, 27, 0.0F, -1.5F, 0.0F, 9, 5, 0, 0.0F, true));

        this.ultimatelegright = new AdvancedModelRenderer(this);
        this.ultimatelegright.setRotationPoint(-0.5F, 0.0F, 1.0F);
        this.body6.addChild(ultimatelegright);
        this.setRotateAngle(ultimatelegright, 0.0F, 1.3526F, 0.6981F);
        this.ultimatelegright.cubeList.add(new ModelBox(ultimatelegright, 0, 0, -16.0F, -1.5F, 0.0F, 16, 5, 0, 0.0F, false));

        this.ultimatelegleft = new AdvancedModelRenderer(this);
        this.ultimatelegleft.setRotationPoint(0.5F, 0.0F, 1.0F);
        this.body6.addChild(ultimatelegleft);
        this.setRotateAngle(ultimatelegleft, 0.0F, -1.3526F, -0.6981F);
        this.ultimatelegleft.cubeList.add(new ModelBox(ultimatelegleft, 0, 0, 0.0F, -1.5F, 0.0F, 16, 5, 0, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.8F;
        this.body.offsetX = -1.1F;
        this.body.offsetZ = 2.0F;
        this.body.rotateAngleY = (float)Math.toRadians(120);
        this.body.rotateAngleX = (float)Math.toRadians(1);
        this.body.rotateAngleZ = (float)Math.toRadians(0);
        this.body.scaleChildren = true;
        float scaler = 4.0F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
        this.body.offsetZ = -0.020F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMyriapod ee = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;

        if (ee.getIsFast()) {
            animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if(ee.getIsMoving()){
            animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 48;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 2.35666 + (((tickAnim - 0) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 0) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 0) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -25.61151 + (((tickAnim - 5) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 5) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 5) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -10.60369 + (((tickAnim - 10) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 10) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 10) / 6) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 2.35666 + (((tickAnim - 16) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 16) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 16) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = -25.61151 + (((tickAnim - 21) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 21) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 21) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 26 && tickAnim < 32) {
            xx = -10.60369 + (((tickAnim - 26) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 26) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 26) / 6) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 2.35666 + (((tickAnim - 32) / 5) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 32) / 5) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 32) / 5) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 37 && tickAnim < 42) {
            xx = -25.61151 + (((tickAnim - 37) / 5) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 37) / 5) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 37) / 5) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -10.60369 + (((tickAnim - 42) / 6) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 42) / 6) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 42) / 6) * (-7.85952-(10.87348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -10.60369 + (((tickAnim - 0) / 8) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 0) / 8) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 0) / 8) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 2.35666 + (((tickAnim - 8) / 4) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 8) / 4) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 8) / 4) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -25.61151 + (((tickAnim - 12) / 5) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 12) / 5) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 12) / 5) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 17 && tickAnim < 24) {
            xx = -10.60369 + (((tickAnim - 17) / 7) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 17) / 7) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 17) / 7) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.35666 + (((tickAnim - 24) / 4) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 24) / 4) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 24) / 4) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -25.61151 + (((tickAnim - 28) / 4) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 28) / 4) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 28) / 4) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 32 && tickAnim < 39) {
            xx = -10.60369 + (((tickAnim - 32) / 7) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 32) / 7) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 32) / 7) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 2.35666 + (((tickAnim - 39) / 5) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 39) / 5) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 39) / 5) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -25.61151 + (((tickAnim - 44) / 4) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 44) / 4) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 44) / 4) * (-10.87348-(-31.96162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.88 + (((tickAnim - 0) / 2) * (-15.76886-(-7.88)));
            yy = 19.88 + (((tickAnim - 0) / 2) * (9.767-(19.88)));
            zz = 14.64 + (((tickAnim - 0) / 2) * (29.28473-(14.64)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 2) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 2) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 2) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 6) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 14) / 4) * (9.767-(30)));
            zz = 0 + (((tickAnim - 14) / 4) * (29.28473-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -15.76886 + (((tickAnim - 18) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 18) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 18) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 22) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 30) / 4) * (9.767-(30)));
            zz = 0 + (((tickAnim - 30) / 4) * (29.28473-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -15.76886 + (((tickAnim - 34) / 4) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 34) / 4) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 34) / 4) * (0-(29.28473)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -17.5 + (((tickAnim - 38) / 8) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (-7.88-(0)));
            yy = 30 + (((tickAnim - 46) / 2) * (19.88-(30)));
            zz = 0 + (((tickAnim - 46) / 2) * (14.64-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 5.63 + (((tickAnim - 0) / 6) * (-30-(5.63)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 6) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 6) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15.76886 + (((tickAnim - 10) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 17.5 + (((tickAnim - 14) / 8) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 22) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 22) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -15.76886 + (((tickAnim - 26) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 26) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 26) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 17.5 + (((tickAnim - 30) / 8) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 38) / 4) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 38) / 4) * (-29.28473-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -15.76886 + (((tickAnim - 42) / 4) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 42) / 4) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 42) / 4) * (0-(-29.28473)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 17.5 + (((tickAnim - 46) / 2) * (5.63-(17.5)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -7.40148 + (((tickAnim - 0) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 12) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 12) / 4) * (23.62591-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -7.40148 + (((tickAnim - 16) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 16) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 16) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 20) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 28) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 28) / 4) * (23.62591-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -7.40148 + (((tickAnim - 32) / 4) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 32) / 4) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 32) / 4) * (0-(23.62591)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 36) / 8) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 44) / 4) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 44) / 4) * (23.62591-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 4) * (-22.5-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 4) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -7.40148 + (((tickAnim - 8) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 8) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 8) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 12) / 8) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 20) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 20) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -7.40148 + (((tickAnim - 24) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 24) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 24) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 28) / 8) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 36) / 4) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 36) / 4) * (-23.62591-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = -7.40148 + (((tickAnim - 40) / 4) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 40) / 4) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 40) / 4) * (0-(-23.62591)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 44) / 4) * (-1.25-(20)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.94 + (((tickAnim - 0) / 2) * (0-(-0.94)));
            yy = -6.73 + (((tickAnim - 0) / 2) * (-20-(-6.73)));
            zz = 8.8 + (((tickAnim - 0) / 2) * (0-(8.8)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 10) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -1.88622 + (((tickAnim - 14) / 4) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 14) / 4) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 14) / 4) * (0-(17.5982)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 26) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -1.88622 + (((tickAnim - 30) / 4) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 30) / 4) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 30) / 4) * (0-(17.5982)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 34) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 42) / 4) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 42) / 4) * (17.5982-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -1.88622 + (((tickAnim - 46) / 2) * (-0.94-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 46) / 2) * (-6.73-(6.54034)));
            zz = 17.5982 + (((tickAnim - 46) / 2) * (8.8-(17.5982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -4.37 + (((tickAnim - 0) / 2) * (-12.5-(-4.37)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 2) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.88622 + (((tickAnim - 6) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 6) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 6) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 18) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -1.88622 + (((tickAnim - 22) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 22) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 22) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 26) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 34) / 4) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (-17.5982-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -1.88622 + (((tickAnim - 38) / 4) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 38) / 4) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 38) / 4) * (0-(-17.5982)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 20 + (((tickAnim - 42) / 6) * (-4.37-(20)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 8) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 12) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 12) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 12) / 4) * (0-(7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 16) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 24) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -1.15091 + (((tickAnim - 28) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 28) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 28) / 4) * (0-(7.58729)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 32) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 40) / 4) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 40) / 4) * (7.58729-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -1.15091 + (((tickAnim - 44) / 4) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 44) / 4) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 44) / 4) * (0-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 0) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1.15091 + (((tickAnim - 4) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 4) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 4) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 8) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 16) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -1.15091 + (((tickAnim - 20) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 20) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 20) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 24) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 32) / 4) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 32) / 4) * (-7.58729-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -1.15091 + (((tickAnim - 36) / 4) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 36) / 4) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 36) / 4) * (0-(-7.58729)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 40) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -11.88 + (((tickAnim - 0) / 6) * (12.5-(-11.88)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 6) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 6) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.27059 + (((tickAnim - 10) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 22) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 22) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -0.27059 + (((tickAnim - 26) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 26) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 26) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 30) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 38) / 4) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 38) / 4) * (12.50288-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = -0.27059 + (((tickAnim - 42) / 4) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 42) / 4) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 42) / 4) * (0-(12.50288)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 46) / 2) * (-11.88-(-20)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.14 + (((tickAnim - 0) / 2) * (-0.27059-(-0.14)));
            yy = -4.39 + (((tickAnim - 0) / 2) * (3.72037-(-4.39)));
            zz = -6.25 + (((tickAnim - 0) / 2) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 2) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 2) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 2) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 6) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 14) / 4) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (-12.50288-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.27059 + (((tickAnim - 18) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 18) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 18) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 22) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 30) / 4) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 30) / 4) * (-12.50288-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = -0.27059 + (((tickAnim - 34) / 4) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 34) / 4) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 34) / 4) * (0-(-12.50288)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 38) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (-0.14-(0)));
            yy = -12.5 + (((tickAnim - 46) / 2) * (-4.39-(-12.5)));
            zz = 0 + (((tickAnim - 46) / 2) * (-6.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 4) * (15-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 4) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 4) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 1.50701 + (((tickAnim - 8) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 8) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 8) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 12) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 20) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 20) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 1.50701 + (((tickAnim - 24) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 24) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 24) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 28) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 36) / 4) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 36) / 4) * (17.56274-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 1.50701 + (((tickAnim - 40) / 4) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 40) / 4) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 40) / 4) * (0-(17.56274)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 44) / 4) * (-2.5-(-20)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright7, legright7.rotateAngleX + (float) Math.toRadians(xx), legright7.rotateAngleY + (float) Math.toRadians(yy), legright7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 1.50701 + (((tickAnim - 0) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 12) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 12) / 4) * (-17.56274-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 1.50701 + (((tickAnim - 16) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 16) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 16) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 20) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 28) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 28) / 4) * (-17.56274-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 1.50701 + (((tickAnim - 32) / 4) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 32) / 4) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 32) / 4) * (0-(-17.56274)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 36) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 44) / 4) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 44) / 4) * (-17.56274-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft7, legleft7.rotateAngleX + (float) Math.toRadians(xx), legleft7.rotateAngleY + (float) Math.toRadians(yy), legleft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 4.37 + (((tickAnim - 0) / 2) * (12.5-(4.37)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 2) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 6) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 6) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 6) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 18) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2.64993 + (((tickAnim - 22) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 22) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 22) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 26) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 26) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 26) / 8) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 34) / 4) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 34) / 4) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 34) / 4) * (17.69329-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 2.64993 + (((tickAnim - 38) / 4) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 38) / 4) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 38) / 4) * (0-(17.69329)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = -20 + (((tickAnim - 42) / 6) * (4.37-(-20)));
            zz = 0 + (((tickAnim - 42) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright8, legright8.rotateAngleX + (float) Math.toRadians(xx), legright8.rotateAngleY + (float) Math.toRadians(yy), legright8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.32 + (((tickAnim - 0) / 2) * (0-(1.32)));
            yy = 12.08 + (((tickAnim - 0) / 2) * (20-(12.08)));
            zz = -8.85 + (((tickAnim - 0) / 2) * (0-(-8.85)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 2) / 8) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.64993 + (((tickAnim - 14) / 4) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 14) / 4) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 14) / 4) * (0-(-17.69329)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 26) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 26) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 2.64993 + (((tickAnim - 30) / 4) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 30) / 4) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 30) / 4) * (0-(-17.69329)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 42) / 4) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 42) / 4) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 42) / 4) * (-17.69329-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 2.64993 + (((tickAnim - 46) / 2) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 46) / 2) * (12.08-(4.15793)));
            zz = -17.69329 + (((tickAnim - 46) / 2) * (-8.85-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft8, legleft8.rotateAngleX + (float) Math.toRadians(xx), legleft8.rotateAngleY + (float) Math.toRadians(yy), legleft8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 0) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 8.08157 + (((tickAnim - 4) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 4) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 4) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 16) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 16) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 8.08157 + (((tickAnim - 20) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 20) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 20) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 24) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 32) / 4) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 32) / 4) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 32) / 4) * (16.99444-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 8.08157 + (((tickAnim - 36) / 4) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 36) / 4) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 36) / 4) * (0-(16.99444)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 40) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 40) / 8) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 40) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright9, legright9.rotateAngleX + (float) Math.toRadians(xx), legright9.rotateAngleY + (float) Math.toRadians(yy), legright9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 8) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 8) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 12) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 12) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 12) / 4) * (0-(-16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 16) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 16) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 16) / 8) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 24) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 24) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 24) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 8.08157 + (((tickAnim - 28) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 28) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 28) / 4) * (0-(-16.99444)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 32) / 8) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 40) / 4) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 40) / 4) * (-16.99444-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 8.08157 + (((tickAnim - 44) / 4) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 44) / 4) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 44) / 4) * (0-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft9, legleft9.rotateAngleX + (float) Math.toRadians(xx), legleft9.rotateAngleY + (float) Math.toRadians(yy), legleft9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.5 + (((tickAnim - 0) / 2) * (12.99301-(6.5)));
            yy = 10.25 + (((tickAnim - 0) / 2) * (5.49178-(10.25)));
            zz = 10.84 + (((tickAnim - 0) / 2) * (21.67413-(10.84)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 12.99301 + (((tickAnim - 2) / 4) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 2) / 4) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 2) / 4) * (0-(21.67413)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 6) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 6) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 6) / 8) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (12.99301-(0)));
            yy = 15 + (((tickAnim - 14) / 4) * (5.49178-(15)));
            zz = 0 + (((tickAnim - 14) / 4) * (21.67413-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 12.99301 + (((tickAnim - 18) / 4) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 18) / 4) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 18) / 4) * (0-(21.67413)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 22) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (12.99301-(0)));
            yy = 15 + (((tickAnim - 30) / 4) * (5.49178-(15)));
            zz = 0 + (((tickAnim - 30) / 4) * (21.67413-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 12.99301 + (((tickAnim - 34) / 4) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 34) / 4) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 34) / 4) * (0-(21.67413)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 38) / 8) * (15-(-20)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (6.5-(0)));
            yy = 15 + (((tickAnim - 46) / 2) * (10.25-(15)));
            zz = 0 + (((tickAnim - 46) / 2) * (10.84-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright10, legright10.rotateAngleX + (float) Math.toRadians(xx), legright10.rotateAngleY + (float) Math.toRadians(yy), legright10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 11.25 + (((tickAnim - 0) / 6) * (-15-(11.25)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 6) / 4) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 6) / 4) * (-21.67413-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 12.99301 + (((tickAnim - 10) / 4) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 10) / 4) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 10) / 4) * (0-(-21.67413)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 14) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 22) / 4) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 22) / 4) * (-21.67413-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 12.99301 + (((tickAnim - 26) / 4) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 26) / 4) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 26) / 4) * (0-(-21.67413)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 30) / 8) * (-15-(20)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 38) / 4) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 38) / 4) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 38) / 4) * (-21.67413-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 12.99301 + (((tickAnim - 42) / 4) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 42) / 4) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 42) / 4) * (0-(-21.67413)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 46) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 46) / 2) * (11.25-(20)));
            zz = 0 + (((tickAnim - 46) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft10, legleft10.rotateAngleX + (float) Math.toRadians(xx), legleft10.rotateAngleY + (float) Math.toRadians(yy), legleft10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 10.8448 + (((tickAnim - 0) / 4) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 0) / 4) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 0) / 4) * (0-(20.49807)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 8) * (10-(-20)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 12) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 12) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 12) / 4) * (20.49807-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10.8448 + (((tickAnim - 16) / 4) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 16) / 4) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 16) / 4) * (0-(20.49807)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 20) / 8) * (10-(-20)));
            zz = 0 + (((tickAnim - 20) / 8) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 28) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 28) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 28) / 4) * (20.49807-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 10.8448 + (((tickAnim - 32) / 4) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 32) / 4) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 32) / 4) * (0-(20.49807)));
        }
        else if (tickAnim >= 36 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 36) / 8) * (0-(0)));
            yy = -20 + (((tickAnim - 36) / 8) * (10-(-20)));
            zz = 0 + (((tickAnim - 36) / 8) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 44) / 4) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 44) / 4) * (20.49807-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright11, legright11.rotateAngleX + (float) Math.toRadians(xx), legright11.rotateAngleY + (float) Math.toRadians(yy), legright11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 5 + (((tickAnim - 0) / 4) * (-10-(5)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 4) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 4) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 10.8448 + (((tickAnim - 8) / 4) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 8) / 4) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 8) / 4) * (0-(-20.49807)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 12) / 8) * (-10-(20)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 20) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 20) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 10.8448 + (((tickAnim - 24) / 4) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 24) / 4) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 24) / 4) * (0-(-20.49807)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 20 + (((tickAnim - 28) / 8) * (-10-(20)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 36) / 4) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 36) / 4) * (-20.49807-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 10.8448 + (((tickAnim - 40) / 4) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 40) / 4) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 40) / 4) * (0-(-20.49807)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 44) / 4) * (5-(20)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft11, legleft11.rotateAngleX + (float) Math.toRadians(xx), legleft11.rotateAngleY + (float) Math.toRadians(yy), legleft11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 7.99 + (((tickAnim - 0) / 2) * (-1.29848-(7.99)));
            yy = -15.74 + (((tickAnim - 0) / 2) * (-22.5255-(-15.74)));
            zz = 10.25 + (((tickAnim - 0) / 2) * (-2.59763-(10.25)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = -1.29848 + (((tickAnim - 2) / 8) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 2) / 8) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 2) / 8) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 6.21535 + (((tickAnim - 10) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 10) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 10) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 17.28264 + (((tickAnim - 14) / 4) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 14) / 4) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 14) / 4) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -1.29848 + (((tickAnim - 18) / 8) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 18) / 8) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 18) / 8) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 6.21535 + (((tickAnim - 26) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 26) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 26) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 17.28264 + (((tickAnim - 30) / 4) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 30) / 4) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 30) / 4) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = -1.29848 + (((tickAnim - 34) / 8) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 34) / 8) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 34) / 8) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 6.21535 + (((tickAnim - 42) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 42) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 42) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 17.28264 + (((tickAnim - 46) / 2) * (7.99-(17.28264)));
            yy = -8.95847 + (((tickAnim - 46) / 2) * (-15.74-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 46) / 2) * (10.25-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright12, legright12.rotateAngleX + (float) Math.toRadians(xx), legright12.rotateAngleY + (float) Math.toRadians(yy), legright12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 4.34 + (((tickAnim - 0) / 2) * (6.21535-(4.34)));
            yy = -1.74 + (((tickAnim - 0) / 2) * (-9.8235-(-1.74)));
            zz = -4.61 + (((tickAnim - 0) / 2) * (-7.01082-(-4.61)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 6.21535 + (((tickAnim - 2) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 2) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 2) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 17.28264 + (((tickAnim - 6) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 6) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 6) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -1.29848 + (((tickAnim - 10) / 8) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 10) / 8) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 10) / 8) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 6.21535 + (((tickAnim - 18) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 18) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 18) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 17.28264 + (((tickAnim - 22) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 22) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 22) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 26 && tickAnim < 34) {
            xx = -1.29848 + (((tickAnim - 26) / 8) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 26) / 8) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 26) / 8) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 6.21535 + (((tickAnim - 34) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 34) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 34) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 17.28264 + (((tickAnim - 38) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 38) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 38) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = -1.29848 + (((tickAnim - 42) / 6) * (4.34-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 42) / 6) * (-1.74-(22.5255)));
            zz = 2.59763 + (((tickAnim - 42) / 6) * (-4.61-(2.59763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft12, legleft12.rotateAngleX + (float) Math.toRadians(xx), legleft12.rotateAngleY + (float) Math.toRadians(yy), legleft12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.21535 + (((tickAnim - 0) / 8) * (6.21535-(6.21535)));
            yy = 9.8235 + (((tickAnim - 0) / 8) * (9.8235-(9.8235)));
            zz = 7.01082 + (((tickAnim - 0) / 8) * (7.01082-(7.01082)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 6.21535 + (((tickAnim - 8) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 8) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 8) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 17.28264 + (((tickAnim - 12) / 4) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 12) / 4) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 12) / 4) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 16 && tickAnim < 24) {
            xx = -1.29848 + (((tickAnim - 16) / 8) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 16) / 8) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 16) / 8) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 6.21535 + (((tickAnim - 24) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 24) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 24) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = 17.28264 + (((tickAnim - 28) / 4) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 28) / 4) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 28) / 4) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -1.29848 + (((tickAnim - 32) / 8) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 32) / 8) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 32) / 8) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 6.21535 + (((tickAnim - 40) / 4) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 40) / 4) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 40) / 4) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 17.28264 + (((tickAnim - 44) / 4) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 44) / 4) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 44) / 4) * (-2.59763-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright13, legright13.rotateAngleX + (float) Math.toRadians(xx), legright13.rotateAngleY + (float) Math.toRadians(yy), legright13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.21535 + (((tickAnim - 0) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 0) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 0) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 17.28264 + (((tickAnim - 4) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 4) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 4) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = -1.29848 + (((tickAnim - 8) / 8) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 8) / 8) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 8) / 8) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 6.21535 + (((tickAnim - 16) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 16) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 16) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 17.28264 + (((tickAnim - 20) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 20) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 20) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = -1.29848 + (((tickAnim - 24) / 8) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 24) / 8) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 24) / 8) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 6.21535 + (((tickAnim - 32) / 4) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 32) / 4) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 32) / 4) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 17.28264 + (((tickAnim - 36) / 4) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 36) / 4) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 36) / 4) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 40 && tickAnim < 48) {
            xx = -1.29848 + (((tickAnim - 40) / 8) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 40) / 8) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 40) / 8) * (-7.01082-(2.59763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft13, legleft13.rotateAngleX + (float) Math.toRadians(xx), legleft13.rotateAngleY + (float) Math.toRadians(yy), legleft13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -1.27 + (((tickAnim - 0) / 6) * (21.4345-(-1.27)));
            yy = -15.02 + (((tickAnim - 0) / 6) * (1.66689-(-15.02)));
            zz = -5.05 + (((tickAnim - 0) / 6) * (14.51323-(-5.05)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 21.4345 + (((tickAnim - 6) / 4) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 6) / 4) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 6) / 4) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 26.25598 + (((tickAnim - 10) / 4) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 10) / 4) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 10) / 4) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = -8.84179 + (((tickAnim - 14) / 8) * (21.4345-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 14) / 8) * (1.66689-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 14) / 8) * (14.51323-(-11.57495)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 21.4345 + (((tickAnim - 22) / 4) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 22) / 4) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 22) / 4) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 26.25598 + (((tickAnim - 26) / 4) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 26) / 4) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 26) / 4) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -8.84179 + (((tickAnim - 30) / 8) * (21.4345-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 30) / 8) * (1.66689-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 30) / 8) * (14.51323-(-11.57495)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 21.4345 + (((tickAnim - 38) / 4) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 38) / 4) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 38) / 4) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 42 && tickAnim < 46) {
            xx = 26.25598 + (((tickAnim - 42) / 4) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 42) / 4) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 42) / 4) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = -8.84179 + (((tickAnim - 46) / 2) * (-1.27-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 46) / 2) * (-15.02-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 46) / 2) * (-5.05-(-11.57495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright14, legright14.rotateAngleX + (float) Math.toRadians(xx), legright14.rotateAngleY + (float) Math.toRadians(yy), legright14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 23.85 + (((tickAnim - 0) / 2) * (26.25598-(23.85)));
            yy = 5.68 + (((tickAnim - 0) / 2) * (13.02708-(5.68)));
            zz = -19.62 + (((tickAnim - 0) / 2) * (-24.71739-(-19.62)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 26.25598 + (((tickAnim - 2) / 4) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 2) / 4) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 2) / 4) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = -8.84179 + (((tickAnim - 6) / 8) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 6) / 8) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 6) / 8) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 21.4345 + (((tickAnim - 14) / 4) * (26.25598-(21.4345)));
            yy = -1.66689 + (((tickAnim - 14) / 4) * (13.02708-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 14) / 4) * (-24.71739-(-14.51323)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 26.25598 + (((tickAnim - 18) / 4) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 18) / 4) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 18) / 4) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -8.84179 + (((tickAnim - 22) / 8) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 22) / 8) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 22) / 8) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 21.4345 + (((tickAnim - 30) / 4) * (26.25598-(21.4345)));
            yy = -1.66689 + (((tickAnim - 30) / 4) * (13.02708-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 30) / 4) * (-24.71739-(-14.51323)));
        }
        else if (tickAnim >= 34 && tickAnim < 38) {
            xx = 26.25598 + (((tickAnim - 34) / 4) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 34) / 4) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 34) / 4) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = -8.84179 + (((tickAnim - 38) / 8) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 38) / 8) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 38) / 8) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 46 && tickAnim < 48) {
            xx = 21.4345 + (((tickAnim - 46) / 2) * (23.85-(21.4345)));
            yy = -1.66689 + (((tickAnim - 46) / 2) * (5.68-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 46) / 2) * (-19.62-(-14.51323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft14, legleft14.rotateAngleX + (float) Math.toRadians(xx), legleft14.rotateAngleY + (float) Math.toRadians(yy), legleft14.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(anrennaleft, anrennaleft.rotateAngleX + (float) Math.toRadians(-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300))+60)*10), anrennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), anrennaleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(anrennaright, anrennaright.rotateAngleX + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(300))))*10), anrennaright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), anrennaright.rotateAngleZ + (float) Math.toRadians(0));
        

    }

    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMyriapod entity = (EntityPrehistoricFloraMyriapod) entitylivingbaseIn;
        int animCycle = 19;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))-90))), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.35666 + (((tickAnim - 0) / 2) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 0) / 2) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 0) / 2) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -25.61151 + (((tickAnim - 2) / 1) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 2) / 1) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 2) / 1) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -10.60369 + (((tickAnim - 3) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 3) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 3) / 3) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 2.35666 + (((tickAnim - 6) / 2) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 6) / 2) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 6) / 2) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.61151 + (((tickAnim - 8) / 2) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 8) / 2) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 8) / 2) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10.60369 + (((tickAnim - 10) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 10) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 10) / 3) * (-7.85952-(10.87348)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 2.35666 + (((tickAnim - 13) / 1) * (-25.61151-(2.35666)));
            yy = 40.15449 + (((tickAnim - 13) / 1) * (16.35611-(40.15449)));
            zz = -7.85952 + (((tickAnim - 13) / 1) * (31.96162-(-7.85952)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -25.61151 + (((tickAnim - 14) / 2) * (-10.60369-(-25.61151)));
            yy = 16.35611 + (((tickAnim - 14) / 2) * (-19.33731-(16.35611)));
            zz = 31.96162 + (((tickAnim - 14) / 2) * (10.87348-(31.96162)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -10.60369 + (((tickAnim - 16) / 3) * (2.35666-(-10.60369)));
            yy = -19.33731 + (((tickAnim - 16) / 3) * (40.15449-(-19.33731)));
            zz = 10.87348 + (((tickAnim - 16) / 3) * (-7.85952-(10.87348)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.60369 + (((tickAnim - 0) / 3) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 0) / 3) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 0) / 3) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2.35666 + (((tickAnim - 3) / 2) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 3) / 2) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 3) / 2) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -25.61151 + (((tickAnim - 5) / 1) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 5) / 1) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 5) / 1) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -10.60369 + (((tickAnim - 6) / 4) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 6) / 4) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 6) / 4) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 2.35666 + (((tickAnim - 10) / 1) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 10) / 1) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 10) / 1) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -25.61151 + (((tickAnim - 11) / 2) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 11) / 2) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 11) / 2) * (-10.87348-(-31.96162)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -10.60369 + (((tickAnim - 13) / 3) * (2.35666-(-10.60369)));
            yy = 19.33731 + (((tickAnim - 13) / 3) * (-40.15449-(19.33731)));
            zz = -10.87348 + (((tickAnim - 13) / 3) * (7.85952-(-10.87348)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.35666 + (((tickAnim - 16) / 2) * (-25.61151-(2.35666)));
            yy = -40.15449 + (((tickAnim - 16) / 2) * (-16.35611-(-40.15449)));
            zz = 7.85952 + (((tickAnim - 16) / 2) * (-31.96162-(7.85952)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -25.61151 + (((tickAnim - 18) / 1) * (-10.60369-(-25.61151)));
            yy = -16.35611 + (((tickAnim - 18) / 1) * (19.33731-(-16.35611)));
            zz = -31.96162 + (((tickAnim - 18) / 1) * (-10.87348-(-31.96162)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -7.88 + (((tickAnim - 0) / 1) * (-15.76886-(-7.88)));
            yy = 19.88 + (((tickAnim - 0) / 1) * (9.767-(19.88)));
            zz = 14.64 + (((tickAnim - 0) / 1) * (29.28473-(14.64)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -15.76886 + (((tickAnim - 1) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 1) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 1) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -17.5 + (((tickAnim - 2) / 4) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 6) / 1) * (9.767-(30)));
            zz = 0 + (((tickAnim - 6) / 1) * (29.28473-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -15.76886 + (((tickAnim - 7) / 2) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 7) / 2) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 7) / 2) * (0-(29.28473)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -17.5 + (((tickAnim - 9) / 3) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-15.76886-(0)));
            yy = 30 + (((tickAnim - 12) / 2) * (9.767-(30)));
            zz = 0 + (((tickAnim - 12) / 2) * (29.28473-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -15.76886 + (((tickAnim - 14) / 1) * (0-(-15.76886)));
            yy = 9.767 + (((tickAnim - 14) / 1) * (-17.5-(9.767)));
            zz = 29.28473 + (((tickAnim - 14) / 1) * (0-(29.28473)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -17.5 + (((tickAnim - 15) / 3) * (30-(-17.5)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-7.88-(0)));
            yy = 30 + (((tickAnim - 18) / 1) * (19.88-(30)));
            zz = 0 + (((tickAnim - 18) / 1) * (14.64-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 5.63 + (((tickAnim - 0) / 2) * (-30-(5.63)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 2) / 2) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 2) / 2) * (-29.28473-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15.76886 + (((tickAnim - 4) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 4) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 4) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 6) / 3) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 9) / 1) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 9) / 1) * (-29.28473-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -15.76886 + (((tickAnim - 10) / 2) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 10) / 2) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 10) / 2) * (0-(-29.28473)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 17.5 + (((tickAnim - 12) / 3) * (-30-(17.5)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-15.76886-(0)));
            yy = -30 + (((tickAnim - 15) / 2) * (-9.767-(-30)));
            zz = 0 + (((tickAnim - 15) / 2) * (-29.28473-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -15.76886 + (((tickAnim - 17) / 1) * (0-(-15.76886)));
            yy = -9.767 + (((tickAnim - 17) / 1) * (17.5-(-9.767)));
            zz = -29.28473 + (((tickAnim - 17) / 1) * (0-(-29.28473)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 17.5 + (((tickAnim - 18) / 1) * (5.63-(17.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -7.40148 + (((tickAnim - 0) / 2) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 0) / 2) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 0) / 2) * (0-(23.62591)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 3) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 5) / 1) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 5) / 1) * (23.62591-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.40148 + (((tickAnim - 6) / 2) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 6) / 2) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 6) / 2) * (0-(23.62591)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 3) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 11) / 2) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 11) / 2) * (23.62591-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -7.40148 + (((tickAnim - 13) / 1) * (0-(-7.40148)));
            yy = 2.72421 + (((tickAnim - 13) / 1) * (-20-(2.72421)));
            zz = 23.62591 + (((tickAnim - 13) / 1) * (0-(23.62591)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 4) * (22.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-7.40148-(0)));
            yy = 22.5 + (((tickAnim - 18) / 1) * (2.72421-(22.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (23.62591-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -1.25 + (((tickAnim - 0) / 2) * (-22.5-(-1.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 2) / 1) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 2) / 1) * (-23.62591-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -7.40148 + (((tickAnim - 3) / 2) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 3) / 2) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 3) / 2) * (0-(-23.62591)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 3) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 8) / 2) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 8) / 2) * (-23.62591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -7.40148 + (((tickAnim - 10) / 1) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 10) / 1) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 10) / 1) * (0-(-23.62591)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 11) / 3) * (-22.5-(20)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (-7.40148-(0)));
            yy = -22.5 + (((tickAnim - 14) / 2) * (-2.72421-(-22.5)));
            zz = 0 + (((tickAnim - 14) / 2) * (-23.62591-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -7.40148 + (((tickAnim - 16) / 2) * (0-(-7.40148)));
            yy = -2.72421 + (((tickAnim - 16) / 2) * (20-(-2.72421)));
            zz = -23.62591 + (((tickAnim - 16) / 2) * (0-(-23.62591)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 1) * (-1.25-(20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.94 + (((tickAnim - 0) / 1) * (0-(-0.94)));
            yy = -6.73 + (((tickAnim - 0) / 1) * (-20-(-6.73)));
            zz = 8.8 + (((tickAnim - 0) / 1) * (0-(8.8)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 1) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 4) / 2) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 4) / 2) * (17.5982-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -1.88622 + (((tickAnim - 6) / 1) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 6) / 1) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 6) / 1) * (0-(17.5982)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 7) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 10) / 2) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (17.5982-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -1.88622 + (((tickAnim - 12) / 2) * (0-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 12) / 2) * (-20-(6.54034)));
            zz = 17.5982 + (((tickAnim - 12) / 2) * (0-(17.5982)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (-1.88622-(0)));
            yy = 12.5 + (((tickAnim - 17) / 1) * (6.54034-(12.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (17.5982-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.88622 + (((tickAnim - 18) / 1) * (-0.94-(-1.88622)));
            yy = 6.54034 + (((tickAnim - 18) / 1) * (-6.73-(6.54034)));
            zz = 17.5982 + (((tickAnim - 18) / 1) * (8.8-(17.5982)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright4, legright4.rotateAngleX + (float) Math.toRadians(xx), legright4.rotateAngleY + (float) Math.toRadians(yy), legright4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -4.37 + (((tickAnim - 0) / 1) * (-12.5-(-4.37)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 1) / 1) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (-17.5982-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -1.88622 + (((tickAnim - 2) / 2) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 2) / 2) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 2) / 2) * (0-(-17.5982)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 4) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 7) / 2) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (-17.5982-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -1.88622 + (((tickAnim - 9) / 1) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 9) / 1) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 9) / 1) * (0-(-17.5982)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (-1.88622-(0)));
            yy = -12.5 + (((tickAnim - 14) / 1) * (-6.54034-(-12.5)));
            zz = 0 + (((tickAnim - 14) / 1) * (-17.5982-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -1.88622 + (((tickAnim - 15) / 2) * (0-(-1.88622)));
            yy = -6.54034 + (((tickAnim - 15) / 2) * (20-(-6.54034)));
            zz = -17.5982 + (((tickAnim - 15) / 2) * (0-(-17.5982)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = 20 + (((tickAnim - 17) / 2) * (-4.37-(20)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft4, legleft4.rotateAngleX + (float) Math.toRadians(xx), legleft4.rotateAngleY + (float) Math.toRadians(yy), legleft4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 0) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 3) / 2) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (7.58729-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -1.15091 + (((tickAnim - 5) / 1) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 5) / 1) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 5) / 1) * (0-(7.58729)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 6) / 4) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 10) / 1) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 10) / 1) * (7.58729-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.15091 + (((tickAnim - 11) / 2) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 11) / 2) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 11) / 2) * (0-(7.58729)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 13) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (-1.15091-(0)));
            yy = 12.5 + (((tickAnim - 16) / 2) * (-3.67456-(12.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (7.58729-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -1.15091 + (((tickAnim - 18) / 1) * (0-(-1.15091)));
            yy = -3.67456 + (((tickAnim - 18) / 1) * (-20-(-3.67456)));
            zz = 7.58729 + (((tickAnim - 18) / 1) * (0-(7.58729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright5, legright5.rotateAngleX + (float) Math.toRadians(xx), legright5.rotateAngleY + (float) Math.toRadians(yy), legright5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 0) / 2) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (-7.58729-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.15091 + (((tickAnim - 2) / 1) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 2) / 1) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 2) / 1) * (0-(-7.58729)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 3) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 6) / 2) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (-7.58729-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -1.15091 + (((tickAnim - 8) / 2) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 8) / 2) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 8) / 2) * (0-(-7.58729)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 10) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (-1.15091-(0)));
            yy = -12.5 + (((tickAnim - 13) / 1) * (3.67456-(-12.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (-7.58729-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -1.15091 + (((tickAnim - 14) / 2) * (0-(-1.15091)));
            yy = 3.67456 + (((tickAnim - 14) / 2) * (20-(3.67456)));
            zz = -7.58729 + (((tickAnim - 14) / 2) * (0-(-7.58729)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 16) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft5, legleft5.rotateAngleX + (float) Math.toRadians(xx), legleft5.rotateAngleY + (float) Math.toRadians(yy), legleft5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), body3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -11.88 + (((tickAnim - 0) / 2) * (12.5-(-11.88)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 2) / 2) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 2) / 2) * (12.50288-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.27059 + (((tickAnim - 4) / 2) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 4) / 2) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 4) / 2) * (0-(12.50288)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 6) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 9) / 1) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 9) / 1) * (12.50288-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -0.27059 + (((tickAnim - 10) / 2) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 10) / 2) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 10) / 2) * (0-(12.50288)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 12) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (-0.27059-(0)));
            yy = 12.5 + (((tickAnim - 15) / 2) * (-3.72037-(12.5)));
            zz = 0 + (((tickAnim - 15) / 2) * (12.50288-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -0.27059 + (((tickAnim - 17) / 1) * (0-(-0.27059)));
            yy = -3.72037 + (((tickAnim - 17) / 1) * (-20-(-3.72037)));
            zz = 12.50288 + (((tickAnim - 17) / 1) * (0-(12.50288)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 1) * (-11.88-(-20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright6, legright6.rotateAngleX + (float) Math.toRadians(xx), legright6.rotateAngleY + (float) Math.toRadians(yy), legright6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.14 + (((tickAnim - 0) / 1) * (-0.27059-(-0.14)));
            yy = -4.39 + (((tickAnim - 0) / 1) * (3.72037-(-4.39)));
            zz = -6.25 + (((tickAnim - 0) / 1) * (-12.50288-(-6.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.27059 + (((tickAnim - 1) / 1) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 1) / 1) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 1) / 1) * (0-(-12.50288)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 6) / 1) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 6) / 1) * (-12.50288-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -0.27059 + (((tickAnim - 7) / 2) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 7) / 2) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 7) / 2) * (0-(-12.50288)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 9) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (-0.27059-(0)));
            yy = -12.5 + (((tickAnim - 12) / 2) * (3.72037-(-12.5)));
            zz = 0 + (((tickAnim - 12) / 2) * (-12.50288-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -0.27059 + (((tickAnim - 14) / 1) * (0-(-0.27059)));
            yy = 3.72037 + (((tickAnim - 14) / 1) * (20-(3.72037)));
            zz = -12.50288 + (((tickAnim - 14) / 1) * (0-(-12.50288)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 15) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (-0.14-(0)));
            yy = -12.5 + (((tickAnim - 18) / 1) * (-4.39-(-12.5)));
            zz = 0 + (((tickAnim - 18) / 1) * (-6.25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft6, legleft6.rotateAngleX + (float) Math.toRadians(xx), legleft6.rotateAngleY + (float) Math.toRadians(yy), legleft6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -2.5 + (((tickAnim - 0) / 2) * (15-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 2) / 1) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 2) / 1) * (17.56274-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.50701 + (((tickAnim - 3) / 2) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 3) / 2) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 3) / 2) * (0-(17.56274)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 5) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 8) / 2) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 8) / 2) * (17.56274-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 1.50701 + (((tickAnim - 10) / 1) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 10) / 1) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 10) / 1) * (0-(17.56274)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 11) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (1.50701-(0)));
            yy = 15 + (((tickAnim - 14) / 2) * (-2.73196-(15)));
            zz = 0 + (((tickAnim - 14) / 2) * (17.56274-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.50701 + (((tickAnim - 16) / 2) * (0-(1.50701)));
            yy = -2.73196 + (((tickAnim - 16) / 2) * (-20-(-2.73196)));
            zz = 17.56274 + (((tickAnim - 16) / 2) * (0-(17.56274)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -20 + (((tickAnim - 18) / 1) * (-2.5-(-20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright7, legright7.rotateAngleX + (float) Math.toRadians(xx), legright7.rotateAngleY + (float) Math.toRadians(yy), legright7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.50701 + (((tickAnim - 0) / 2) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 0) / 2) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 0) / 2) * (0-(-17.56274)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 2) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 5) / 1) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 5) / 1) * (-17.56274-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 1.50701 + (((tickAnim - 6) / 2) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 6) / 2) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 6) / 2) * (0-(-17.56274)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 8) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 11) / 2) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 11) / 2) * (-17.56274-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1.50701 + (((tickAnim - 13) / 1) * (0-(1.50701)));
            yy = 2.73196 + (((tickAnim - 13) / 1) * (20-(2.73196)));
            zz = -17.56274 + (((tickAnim - 13) / 1) * (0-(-17.56274)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 14) / 4) * (-15-(20)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (1.50701-(0)));
            yy = -15 + (((tickAnim - 18) / 1) * (2.73196-(-15)));
            zz = 0 + (((tickAnim - 18) / 1) * (-17.56274-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft7, legleft7.rotateAngleX + (float) Math.toRadians(xx), legleft7.rotateAngleY + (float) Math.toRadians(yy), legleft7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 4.37 + (((tickAnim - 0) / 1) * (12.5-(4.37)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 1) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 1) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 2.64993 + (((tickAnim - 2) / 2) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 2) / 2) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 2) / 2) * (0-(17.69329)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 4) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 7) / 2) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 7) / 2) * (17.69329-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 2.64993 + (((tickAnim - 9) / 1) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 9) / 1) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 9) / 1) * (0-(17.69329)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 4) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (2.64993-(0)));
            yy = 12.5 + (((tickAnim - 14) / 1) * (-4.15793-(12.5)));
            zz = 0 + (((tickAnim - 14) / 1) * (17.69329-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 2.64993 + (((tickAnim - 15) / 2) * (0-(2.64993)));
            yy = -4.15793 + (((tickAnim - 15) / 2) * (-20-(-4.15793)));
            zz = 17.69329 + (((tickAnim - 15) / 2) * (0-(17.69329)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            yy = -20 + (((tickAnim - 17) / 2) * (4.37-(-20)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright8, legright8.rotateAngleX + (float) Math.toRadians(xx), legright8.rotateAngleY + (float) Math.toRadians(yy), legright8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 1.32 + (((tickAnim - 0) / 1) * (0-(1.32)));
            yy = 12.08 + (((tickAnim - 0) / 1) * (20-(12.08)));
            zz = -8.85 + (((tickAnim - 0) / 1) * (0-(-8.85)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 1) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 1) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 1) / 3) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 4) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 4) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 2.64993 + (((tickAnim - 6) / 1) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 6) / 1) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 6) / 1) * (0-(-17.69329)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 7) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 10) / 2) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 2) * (-17.69329-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 2.64993 + (((tickAnim - 12) / 2) * (0-(2.64993)));
            yy = 4.15793 + (((tickAnim - 12) / 2) * (20-(4.15793)));
            zz = -17.69329 + (((tickAnim - 12) / 2) * (0-(-17.69329)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 14) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (2.64993-(0)));
            yy = -12.5 + (((tickAnim - 17) / 1) * (4.15793-(-12.5)));
            zz = 0 + (((tickAnim - 17) / 1) * (-17.69329-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 2.64993 + (((tickAnim - 18) / 1) * (1.32-(2.64993)));
            yy = 4.15793 + (((tickAnim - 18) / 1) * (12.08-(4.15793)));
            zz = -17.69329 + (((tickAnim - 18) / 1) * (-8.85-(-17.69329)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft8, legleft8.rotateAngleX + (float) Math.toRadians(xx), legleft8.rotateAngleY + (float) Math.toRadians(yy), legleft8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 0) / 2) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (16.99444-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.08157 + (((tickAnim - 2) / 1) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 2) / 1) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 2) / 1) * (0-(16.99444)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 3) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 6) / 2) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (16.99444-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 8.08157 + (((tickAnim - 8) / 2) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 8) / 2) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 8) / 2) * (0-(16.99444)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 10) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (8.08157-(0)));
            yy = 12.5 + (((tickAnim - 13) / 1) * (5.1843-(12.5)));
            zz = 0 + (((tickAnim - 13) / 1) * (16.99444-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 8.08157 + (((tickAnim - 14) / 2) * (0-(8.08157)));
            yy = 5.1843 + (((tickAnim - 14) / 2) * (-20-(5.1843)));
            zz = 16.99444 + (((tickAnim - 14) / 2) * (0-(16.99444)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 16) / 3) * (12.5-(-20)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright9, legright9.rotateAngleX + (float) Math.toRadians(xx), legright9.rotateAngleY + (float) Math.toRadians(yy), legright9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 0) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 3) / 2) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 3) / 2) * (-16.99444-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 8.08157 + (((tickAnim - 5) / 1) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 5) / 1) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 5) / 1) * (0-(-16.99444)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 20 + (((tickAnim - 6) / 4) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 10) / 1) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 10) / 1) * (-16.99444-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 8.08157 + (((tickAnim - 11) / 2) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 11) / 2) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 11) / 2) * (0-(-16.99444)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 13) / 3) * (-12.5-(20)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (8.08157-(0)));
            yy = -12.5 + (((tickAnim - 16) / 2) * (-5.1843-(-12.5)));
            zz = 0 + (((tickAnim - 16) / 2) * (-16.99444-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 8.08157 + (((tickAnim - 18) / 1) * (0-(8.08157)));
            yy = -5.1843 + (((tickAnim - 18) / 1) * (20-(-5.1843)));
            zz = -16.99444 + (((tickAnim - 18) / 1) * (0-(-16.99444)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft9, legleft9.rotateAngleX + (float) Math.toRadians(xx), legleft9.rotateAngleY + (float) Math.toRadians(yy), legleft9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6.5 + (((tickAnim - 0) / 1) * (12.99301-(6.5)));
            yy = 10.25 + (((tickAnim - 0) / 1) * (5.49178-(10.25)));
            zz = 10.84 + (((tickAnim - 0) / 1) * (21.67413-(10.84)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 12.99301 + (((tickAnim - 1) / 1) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 1) / 1) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 1) / 1) * (0-(21.67413)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 4) * (15-(-20)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (12.99301-(0)));
            yy = 15 + (((tickAnim - 6) / 1) * (5.49178-(15)));
            zz = 0 + (((tickAnim - 6) / 1) * (21.67413-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 12.99301 + (((tickAnim - 7) / 2) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 7) / 2) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 7) / 2) * (0-(21.67413)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 9) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (12.99301-(0)));
            yy = 15 + (((tickAnim - 12) / 2) * (5.49178-(15)));
            zz = 0 + (((tickAnim - 12) / 2) * (21.67413-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 12.99301 + (((tickAnim - 14) / 1) * (0-(12.99301)));
            yy = 5.49178 + (((tickAnim - 14) / 1) * (-20-(5.49178)));
            zz = 21.67413 + (((tickAnim - 14) / 1) * (0-(21.67413)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 15) / 3) * (15-(-20)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (6.5-(0)));
            yy = 15 + (((tickAnim - 18) / 1) * (10.25-(15)));
            zz = 0 + (((tickAnim - 18) / 1) * (10.84-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright10, legright10.rotateAngleX + (float) Math.toRadians(xx), legright10.rotateAngleY + (float) Math.toRadians(yy), legright10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 11.25 + (((tickAnim - 0) / 2) * (-15-(11.25)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 2) / 2) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 2) / 2) * (-21.67413-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 12.99301 + (((tickAnim - 4) / 2) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 4) / 2) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 4) / 2) * (0-(-21.67413)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 6) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 9) / 1) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 9) / 1) * (-21.67413-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 12.99301 + (((tickAnim - 10) / 2) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 10) / 2) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 10) / 2) * (0-(-21.67413)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 12) / 3) * (-15-(20)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 15) / 2) * (12.99301-(0)));
            yy = -15 + (((tickAnim - 15) / 2) * (-5.49178-(-15)));
            zz = 0 + (((tickAnim - 15) / 2) * (-21.67413-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 12.99301 + (((tickAnim - 17) / 1) * (0-(12.99301)));
            yy = -5.49178 + (((tickAnim - 17) / 1) * (20-(-5.49178)));
            zz = -21.67413 + (((tickAnim - 17) / 1) * (0-(-21.67413)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 1) * (11.25-(20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft10, legleft10.rotateAngleX + (float) Math.toRadians(xx), legleft10.rotateAngleY + (float) Math.toRadians(yy), legleft10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 10.8448 + (((tickAnim - 0) / 2) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 0) / 2) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 0) / 2) * (0-(20.49807)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 2) / 3) * (10-(-20)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 5) / 1) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 5) / 1) * (20.49807-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 10.8448 + (((tickAnim - 6) / 2) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 6) / 2) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 6) / 2) * (0-(20.49807)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = -20 + (((tickAnim - 8) / 3) * (10-(-20)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 11) / 2) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 11) / 2) * (20.49807-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 10.8448 + (((tickAnim - 13) / 1) * (0-(10.8448)));
            yy = -11.67406 + (((tickAnim - 13) / 1) * (-20-(-11.67406)));
            zz = 20.49807 + (((tickAnim - 13) / 1) * (0-(20.49807)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = -20 + (((tickAnim - 14) / 4) * (10-(-20)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (10.8448-(0)));
            yy = 10 + (((tickAnim - 18) / 1) * (-11.67406-(10)));
            zz = 0 + (((tickAnim - 18) / 1) * (20.49807-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright11, legright11.rotateAngleX + (float) Math.toRadians(xx), legright11.rotateAngleY + (float) Math.toRadians(yy), legright11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 5 + (((tickAnim - 0) / 2) * (-10-(5)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 2) / 1) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 2) / 1) * (-20.49807-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10.8448 + (((tickAnim - 3) / 2) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 3) / 2) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 3) / 2) * (0-(-20.49807)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 5) / 3) * (-10-(20)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 8) / 2) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 8) / 2) * (-20.49807-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 10.8448 + (((tickAnim - 10) / 1) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 10) / 1) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 10) / 1) * (0-(-20.49807)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 20 + (((tickAnim - 11) / 3) * (-10-(20)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (10.8448-(0)));
            yy = -10 + (((tickAnim - 14) / 2) * (11.67406-(-10)));
            zz = 0 + (((tickAnim - 14) / 2) * (-20.49807-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10.8448 + (((tickAnim - 16) / 2) * (0-(10.8448)));
            yy = 11.67406 + (((tickAnim - 16) / 2) * (20-(11.67406)));
            zz = -20.49807 + (((tickAnim - 16) / 2) * (0-(-20.49807)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 20 + (((tickAnim - 18) / 1) * (5-(20)));
            zz = 0 + (((tickAnim - 18) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft11, legleft11.rotateAngleX + (float) Math.toRadians(xx), legleft11.rotateAngleY + (float) Math.toRadians(yy), legleft11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 7.99 + (((tickAnim - 0) / 1) * (-1.29848-(7.99)));
            yy = -15.74 + (((tickAnim - 0) / 1) * (-22.5255-(-15.74)));
            zz = 10.25 + (((tickAnim - 0) / 1) * (-2.59763-(10.25)));
        }
        else if (tickAnim >= 1 && tickAnim < 4) {
            xx = -1.29848 + (((tickAnim - 1) / 3) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 1) / 3) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 1) / 3) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 6.21535 + (((tickAnim - 4) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 4) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 4) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 17.28264 + (((tickAnim - 6) / 1) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 6) / 1) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 6) / 1) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.29848 + (((tickAnim - 7) / 3) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 7) / 3) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 7) / 3) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 6.21535 + (((tickAnim - 10) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 10) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 10) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 17.28264 + (((tickAnim - 12) / 2) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 12) / 2) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 12) / 2) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -1.29848 + (((tickAnim - 14) / 3) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 14) / 3) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 14) / 3) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 6.21535 + (((tickAnim - 17) / 1) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 17) / 1) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 17) / 1) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 17.28264 + (((tickAnim - 18) / 1) * (7.99-(17.28264)));
            yy = -8.95847 + (((tickAnim - 18) / 1) * (-15.74-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 18) / 1) * (10.25-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright12, legright12.rotateAngleX + (float) Math.toRadians(xx), legright12.rotateAngleY + (float) Math.toRadians(yy), legright12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 4.34 + (((tickAnim - 0) / 1) * (6.21535-(4.34)));
            yy = -1.74 + (((tickAnim - 0) / 1) * (-9.8235-(-1.74)));
            zz = -4.61 + (((tickAnim - 0) / 1) * (-7.01082-(-4.61)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 6.21535 + (((tickAnim - 1) / 1) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 1) / 1) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 1) / 1) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 17.28264 + (((tickAnim - 2) / 2) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 2) / 2) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 2) / 2) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -1.29848 + (((tickAnim - 4) / 3) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 4) / 3) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 4) / 3) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 6.21535 + (((tickAnim - 7) / 2) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 7) / 2) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 7) / 2) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 17.28264 + (((tickAnim - 9) / 1) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 9) / 1) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 9) / 1) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -1.29848 + (((tickAnim - 10) / 4) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 10) / 4) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 10) / 4) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 6.21535 + (((tickAnim - 14) / 1) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 14) / 1) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 14) / 1) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 17.28264 + (((tickAnim - 15) / 2) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 15) / 2) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 15) / 2) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -1.29848 + (((tickAnim - 17) / 2) * (4.34-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 17) / 2) * (-1.74-(22.5255)));
            zz = 2.59763 + (((tickAnim - 17) / 2) * (-4.61-(2.59763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft12, legleft12.rotateAngleX + (float) Math.toRadians(xx), legleft12.rotateAngleY + (float) Math.toRadians(yy), legleft12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 6.21535 + (((tickAnim - 0) / 3) * (6.21535-(6.21535)));
            yy = 9.8235 + (((tickAnim - 0) / 3) * (9.8235-(9.8235)));
            zz = 7.01082 + (((tickAnim - 0) / 3) * (7.01082-(7.01082)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 6.21535 + (((tickAnim - 3) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 3) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 3) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 17.28264 + (((tickAnim - 5) / 1) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 5) / 1) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 5) / 1) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.29848 + (((tickAnim - 6) / 4) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 6) / 4) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 6) / 4) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 6.21535 + (((tickAnim - 10) / 1) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 10) / 1) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 10) / 1) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 17.28264 + (((tickAnim - 11) / 2) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 11) / 2) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 11) / 2) * (-2.59763-(23.10577)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -1.29848 + (((tickAnim - 13) / 3) * (6.21535-(-1.29848)));
            yy = -22.5255 + (((tickAnim - 13) / 3) * (9.8235-(-22.5255)));
            zz = -2.59763 + (((tickAnim - 13) / 3) * (7.01082-(-2.59763)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 6.21535 + (((tickAnim - 16) / 2) * (17.28264-(6.21535)));
            yy = 9.8235 + (((tickAnim - 16) / 2) * (-8.95847-(9.8235)));
            zz = 7.01082 + (((tickAnim - 16) / 2) * (23.10577-(7.01082)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 17.28264 + (((tickAnim - 18) / 1) * (-1.29848-(17.28264)));
            yy = -8.95847 + (((tickAnim - 18) / 1) * (-22.5255-(-8.95847)));
            zz = 23.10577 + (((tickAnim - 18) / 1) * (-2.59763-(23.10577)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright13, legright13.rotateAngleX + (float) Math.toRadians(xx), legright13.rotateAngleY + (float) Math.toRadians(yy), legright13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.21535 + (((tickAnim - 0) / 2) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 0) / 2) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 0) / 2) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 17.28264 + (((tickAnim - 2) / 1) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 2) / 1) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 2) / 1) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.29848 + (((tickAnim - 3) / 3) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 3) / 3) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 3) / 3) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 6.21535 + (((tickAnim - 6) / 2) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 6) / 2) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 6) / 2) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.28264 + (((tickAnim - 8) / 2) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 8) / 2) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 8) / 2) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.29848 + (((tickAnim - 10) / 3) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 10) / 3) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 10) / 3) * (-7.01082-(2.59763)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 6.21535 + (((tickAnim - 13) / 1) * (17.28264-(6.21535)));
            yy = -9.8235 + (((tickAnim - 13) / 1) * (8.95847-(-9.8235)));
            zz = -7.01082 + (((tickAnim - 13) / 1) * (-23.10577-(-7.01082)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 17.28264 + (((tickAnim - 14) / 2) * (-1.29848-(17.28264)));
            yy = 8.95847 + (((tickAnim - 14) / 2) * (22.5255-(8.95847)));
            zz = -23.10577 + (((tickAnim - 14) / 2) * (2.59763-(-23.10577)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -1.29848 + (((tickAnim - 16) / 3) * (6.21535-(-1.29848)));
            yy = 22.5255 + (((tickAnim - 16) / 3) * (-9.8235-(22.5255)));
            zz = 2.59763 + (((tickAnim - 16) / 3) * (-7.01082-(2.59763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft13, legleft13.rotateAngleX + (float) Math.toRadians(xx), legleft13.rotateAngleY + (float) Math.toRadians(yy), legleft13.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.27 + (((tickAnim - 0) / 2) * (21.4345-(-1.27)));
            yy = -15.02 + (((tickAnim - 0) / 2) * (1.66689-(-15.02)));
            zz = -5.05 + (((tickAnim - 0) / 2) * (14.51323-(-5.05)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 21.4345 + (((tickAnim - 2) / 2) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 2) / 2) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 2) / 2) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 26.25598 + (((tickAnim - 4) / 2) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 4) / 2) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 4) / 2) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -8.84179 + (((tickAnim - 6) / 3) * (21.4345-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 6) / 3) * (1.66689-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 6) / 3) * (14.51323-(-11.57495)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 21.4345 + (((tickAnim - 9) / 1) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 9) / 1) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 9) / 1) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 26.25598 + (((tickAnim - 10) / 2) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 10) / 2) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 10) / 2) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.84179 + (((tickAnim - 12) / 3) * (21.4345-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 12) / 3) * (1.66689-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 12) / 3) * (14.51323-(-11.57495)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 21.4345 + (((tickAnim - 15) / 2) * (26.25598-(21.4345)));
            yy = 1.66689 + (((tickAnim - 15) / 2) * (-13.02708-(1.66689)));
            zz = 14.51323 + (((tickAnim - 15) / 2) * (24.71739-(14.51323)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 26.25598 + (((tickAnim - 17) / 1) * (-8.84179-(26.25598)));
            yy = -13.02708 + (((tickAnim - 17) / 1) * (-20.58067-(-13.02708)));
            zz = 24.71739 + (((tickAnim - 17) / 1) * (-11.57495-(24.71739)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -8.84179 + (((tickAnim - 18) / 1) * (-1.27-(-8.84179)));
            yy = -20.58067 + (((tickAnim - 18) / 1) * (-15.02-(-20.58067)));
            zz = -11.57495 + (((tickAnim - 18) / 1) * (-5.05-(-11.57495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright14, legright14.rotateAngleX + (float) Math.toRadians(xx), legright14.rotateAngleY + (float) Math.toRadians(yy), legright14.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 23.85 + (((tickAnim - 0) / 1) * (26.25598-(23.85)));
            yy = 5.68 + (((tickAnim - 0) / 1) * (13.02708-(5.68)));
            zz = -19.62 + (((tickAnim - 0) / 1) * (-24.71739-(-19.62)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 26.25598 + (((tickAnim - 1) / 1) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 1) / 1) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 1) / 1) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -8.84179 + (((tickAnim - 2) / 4) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 2) / 4) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 2) / 4) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 21.4345 + (((tickAnim - 6) / 1) * (26.25598-(21.4345)));
            yy = -1.66689 + (((tickAnim - 6) / 1) * (13.02708-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 6) / 1) * (-24.71739-(-14.51323)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 26.25598 + (((tickAnim - 7) / 2) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 7) / 2) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 7) / 2) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -8.84179 + (((tickAnim - 9) / 3) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 9) / 3) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 9) / 3) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 21.4345 + (((tickAnim - 12) / 2) * (26.25598-(21.4345)));
            yy = -1.66689 + (((tickAnim - 12) / 2) * (13.02708-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 12) / 2) * (-24.71739-(-14.51323)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 26.25598 + (((tickAnim - 14) / 1) * (-8.84179-(26.25598)));
            yy = 13.02708 + (((tickAnim - 14) / 1) * (20.58067-(13.02708)));
            zz = -24.71739 + (((tickAnim - 14) / 1) * (11.57495-(-24.71739)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -8.84179 + (((tickAnim - 15) / 3) * (21.4345-(-8.84179)));
            yy = 20.58067 + (((tickAnim - 15) / 3) * (-1.66689-(20.58067)));
            zz = 11.57495 + (((tickAnim - 15) / 3) * (-14.51323-(11.57495)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 21.4345 + (((tickAnim - 18) / 1) * (23.85-(21.4345)));
            yy = -1.66689 + (((tickAnim - 18) / 1) * (5.68-(-1.66689)));
            zz = -14.51323 + (((tickAnim - 18) / 1) * (-19.62-(-14.51323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft14, legleft14.rotateAngleX + (float) Math.toRadians(xx), legleft14.rotateAngleY + (float) Math.toRadians(yy), legleft14.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(ultimatelegright, ultimatelegright.rotateAngleX + (float) Math.toRadians(0), ultimatelegright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), ultimatelegright.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(ultimatelegleft, ultimatelegleft.rotateAngleX + (float) Math.toRadians(0), ultimatelegleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))), ultimatelegleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(anrennaleft, anrennaleft.rotateAngleX + (float) Math.toRadians(0), anrennaleft.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2)))*3), anrennaleft.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(anrennaright, anrennaright.rotateAngleX + (float) Math.toRadians(0), anrennaright.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(376*2))))*3), anrennaright.rotateAngleZ + (float) Math.toRadians(0));
        

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.casineria.offsetY = 1.20F;

        EntityPrehistoricFloraMyriapod entityMyriapod = (EntityPrehistoricFloraMyriapod) e;


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMyriapod e = (EntityPrehistoricFloraMyriapod) entity;
        animator.update(entity);
        
    }
}
