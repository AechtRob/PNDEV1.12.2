package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraProteroctopus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelProteroctopus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended Arm;
    private final AdvancedModelRendererExtended Arms;
    private final AdvancedModelRendererExtended Armss;
    private final AdvancedModelRendererExtended Arm5;
    private final AdvancedModelRendererExtended Arms5;
    private final AdvancedModelRendererExtended Armss2;
    private final AdvancedModelRendererExtended Arm2;
    private final AdvancedModelRendererExtended Arms2;
    private final AdvancedModelRendererExtended Arm6;
    private final AdvancedModelRendererExtended Arms6;
    private final AdvancedModelRendererExtended Arm3;
    private final AdvancedModelRendererExtended Arms3;
    private final AdvancedModelRendererExtended Arm7;
    private final AdvancedModelRendererExtended Arms7;
    private final AdvancedModelRendererExtended Arm4;
    private final AdvancedModelRendererExtended Arms4;
    private final AdvancedModelRendererExtended Arm8;
    private final AdvancedModelRendererExtended Arms8;
    private final AdvancedModelRendererExtended siphon;
    private final AdvancedModelRendererExtended mantle;
    private final AdvancedModelRendererExtended mantle2;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended FinR;
    private final AdvancedModelRendererExtended FinL;
    private ModelAnimator animator;


    public ModelProteroctopus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0F, 16.0F, -3.0F);
        this.setRotateAngle(Body, 0.6981F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -2.85F, 0.75F, -2.0F, 1, 1, 1, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, 1.85F, 0.75F, -2.0F, 1, 1, 1, 0.0F, true));
        this.Body.cubeList.add(new ModelBox(Body, 22, 28, -2.5F, -0.25F, -3.0F, 5, 4, 3, 0.0F, false));

        this.Arm = new AdvancedModelRendererExtended(this);
        this.Arm.setRotationPoint(-0.5F, 0.75F, -3.0F);
        this.Body.addChild(Arm);
        this.setRotateAngle(Arm, -0.0436F, 0.48F, 0.1309F);
        this.Arm.cubeList.add(new ModelBox(Arm, 21, 20, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));

        this.Arms = new AdvancedModelRendererExtended(this);
        this.Arms.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm.addChild(Arms);
        this.setRotateAngle(Arms, 0.0F, 0.6981F, -0.1309F);
        this.Arms.cubeList.add(new ModelBox(Arms, 18, 3, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.Armss = new AdvancedModelRendererExtended(this);
        this.Armss.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Arms.addChild(Armss);
        this.setRotateAngle(Armss, 0.1309F, 0.6981F, -0.1309F);
        this.Armss.cubeList.add(new ModelBox(Armss, 10, 12, -0.5F, -0.5F, -7.9F, 1, 1, 8, -0.01F, false));

        this.Arm5 = new AdvancedModelRendererExtended(this);
        this.Arm5.setRotationPoint(0.5F, 0.75F, -3.0F);
        this.Body.addChild(Arm5);
        this.setRotateAngle(Arm5, -0.0436F, -0.48F, -0.1309F);
        this.Arm5.cubeList.add(new ModelBox(Arm5, 21, 20, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));

        this.Arms5 = new AdvancedModelRendererExtended(this);
        this.Arms5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm5.addChild(Arms5);
        this.setRotateAngle(Arms5, 0.0F, -0.6981F, 0.1309F);
        this.Arms5.cubeList.add(new ModelBox(Arms5, 18, 3, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, true));

        this.Armss2 = new AdvancedModelRendererExtended(this);
        this.Armss2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.Arms5.addChild(Armss2);
        this.setRotateAngle(Armss2, 0.1309F, -0.6981F, 0.1309F);
        this.Armss2.cubeList.add(new ModelBox(Armss2, 10, 12, -0.5F, -0.5F, -7.9F, 1, 1, 8, -0.01F, true));

        this.Arm2 = new AdvancedModelRendererExtended(this);
        this.Arm2.setRotationPoint(-1.25F, 1.5F, -2.9F);
        this.Body.addChild(Arm2);
        this.setRotateAngle(Arm2, 0.2618F, 0.829F, 0.0F);
        this.Arm2.cubeList.add(new ModelBox(Arm2, 9, 21, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));

        this.Arms2 = new AdvancedModelRendererExtended(this);
        this.Arms2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm2.addChild(Arms2);
        this.setRotateAngle(Arms2, 0.6109F, 0.6981F, 0.7854F);
        this.Arms2.cubeList.add(new ModelBox(Arms2, 0, 11, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, false));

        this.Arm6 = new AdvancedModelRendererExtended(this);
        this.Arm6.setRotationPoint(1.25F, 1.5F, -2.9F);
        this.Body.addChild(Arm6);
        this.setRotateAngle(Arm6, 0.2618F, -0.829F, 0.0F);
        this.Arm6.cubeList.add(new ModelBox(Arm6, 9, 21, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));

        this.Arms6 = new AdvancedModelRendererExtended(this);
        this.Arms6.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm6.addChild(Arms6);
        this.setRotateAngle(Arms6, 0.6109F, -0.6981F, -0.7854F);
        this.Arms6.cubeList.add(new ModelBox(Arms6, 0, 11, -0.5F, -0.5F, -8.0F, 1, 1, 8, 0.0F, true));

        this.Arm3 = new AdvancedModelRendererExtended(this);
        this.Arm3.setRotationPoint(-1.5F, 2.5F, -2.9F);
        this.Body.addChild(Arm3);
        this.setRotateAngle(Arm3, 0.5672F, 1.4835F, -0.0873F);
        this.Arm3.cubeList.add(new ModelBox(Arm3, 20, 12, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, false));

        this.Arms3 = new AdvancedModelRendererExtended(this);
        this.Arms3.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm3.addChild(Arms3);
        this.setRotateAngle(Arms3, 0.4363F, 0.5236F, 0.7854F);
        this.Arms3.cubeList.add(new ModelBox(Arms3, 0, 20, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, false));

        this.Arm7 = new AdvancedModelRendererExtended(this);
        this.Arm7.setRotationPoint(1.5F, 2.5F, -2.9F);
        this.Body.addChild(Arm7);
        this.setRotateAngle(Arm7, 0.5672F, -1.4835F, 0.0873F);
        this.Arm7.cubeList.add(new ModelBox(Arm7, 20, 12, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.01F, true));

        this.Arms7 = new AdvancedModelRendererExtended(this);
        this.Arms7.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Arm7.addChild(Arms7);
        this.setRotateAngle(Arms7, 0.4363F, -0.5236F, -0.7854F);
        this.Arms7.cubeList.add(new ModelBox(Arms7, 0, 20, -0.5F, -0.5F, -7.0F, 1, 1, 7, 0.0F, true));

        this.Arm4 = new AdvancedModelRendererExtended(this);
        this.Arm4.setRotationPoint(-0.5F, 3.25F, -2.9F);
        this.Body.addChild(Arm4);
        this.setRotateAngle(Arm4, 1.8326F, -0.0873F, 0.2618F);
        this.Arm4.cubeList.add(new ModelBox(Arm4, 29, 12, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.01F, false));

        this.Arms4 = new AdvancedModelRendererExtended(this);
        this.Arms4.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Arm4.addChild(Arms4);
        this.setRotateAngle(Arms4, 0.6109F, 0.2618F, 0.2618F);
        this.Arms4.cubeList.add(new ModelBox(Arms4, 10, 29, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, false));

        this.Arm8 = new AdvancedModelRendererExtended(this);
        this.Arm8.setRotationPoint(0.5F, 3.25F, -2.9F);
        this.Body.addChild(Arm8);
        this.setRotateAngle(Arm8, 1.8326F, 0.0873F, -0.2618F);
        this.Arm8.cubeList.add(new ModelBox(Arm8, 29, 12, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.01F, true));

        this.Arms8 = new AdvancedModelRendererExtended(this);
        this.Arms8.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Arm8.addChild(Arms8);
        this.setRotateAngle(Arms8, 0.6109F, -0.2618F, -0.2618F);
        this.Arms8.cubeList.add(new ModelBox(Arms8, 10, 29, -0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F, true));

        this.siphon = new AdvancedModelRendererExtended(this);
        this.siphon.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.Body.addChild(siphon);
        this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 11, -0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F, false));

        this.mantle = new AdvancedModelRendererExtended(this);
        this.mantle.setRotationPoint(0.0F, -0.25F, -0.1F);
        this.Body.addChild(mantle);
        this.setRotateAngle(mantle, -0.3491F, 0.0F, 0.0F);
        this.mantle.cubeList.add(new ModelBox(mantle, 0, 0, -3.5F, -0.25F, 0.0F, 7, 5, 6, 0.0F, false));

        this.mantle2 = new AdvancedModelRendererExtended(this);
        this.mantle2.setRotationPoint(0.0F, 0.2F, 6.5F);
        this.mantle.addChild(mantle2);
        this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
        this.mantle2.cubeList.add(new ModelBox(mantle2, 28, 0, -2.0F, 0.0F, -1.0F, 4, 3, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(2.0F, 3.0F, 3.0F);
        this.mantle2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2793F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 20, -1.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, true));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-2.0F, 3.0F, 3.0F);
        this.mantle2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2793F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 20, 0.0F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 3.0F, 3.0F);
        this.mantle2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, -2.0F, -2.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.FinR = new AdvancedModelRendererExtended(this);
        this.FinR.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.mantle2.addChild(FinR);
        this.setRotateAngle(FinR, 0.0F, -0.0436F, 0.2182F);
        this.FinR.cubeList.add(new ModelBox(FinR, 14, 21, -5.0F, 0.0F, -2.0F, 5, 0, 4, 0.0F, false));

        this.FinL = new AdvancedModelRendererExtended(this);
        this.FinL.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.mantle2.addChild(FinL);
        this.setRotateAngle(FinL, 0.0F, 0.0436F, -0.2182F);
        this.FinL.cubeList.add(new ModelBox(FinL, 14, 21, 0.0F, 0.0F, -2.0F, 5, 0, 4, 0.0F, true));

        //Swim pose is the default:
        this.Body.rotateAngleY = (float) Math.toRadians(180);
        this.Body.rotateAngleX = (float) Math.toRadians(0);
        this.setRotateAngle(Arm, -0.0873F, 0.0436F, 0.0F);
        this.setRotateAngle(Arm2, 0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Arm3, 0.1309F, 0.0873F, 0.0F);
        this.setRotateAngle(Arm4, 0.2182F, 0.0873F, 0.0F);
        this.setRotateAngle(Arm5, -0.0873F, -0.0436F, 0.0F);
        this.setRotateAngle(Arm6, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Arm7, 0.1309F, -0.0873F, 0.0F);
        this.setRotateAngle(Arm8, 0.2182F, -0.0873F, 0.0F);
        this.setRotateAngle(Arms, 0, 0, 0);
        this.setRotateAngle(Arms2, 0, 0, 0);
        this.setRotateAngle(Armss, 0, 0, 0);
        this.setRotateAngle(Armss2, 0, 0, 0);
        this.setRotateAngle(Arms3, 0, 0, 0);
        this.setRotateAngle(Arms4, 0, 0, 0);
        this.setRotateAngle(Arms5, 0, 0, 0);
        this.setRotateAngle(Arms6, 0, 0, 0);
        this.setRotateAngle(Arms7, 0, 0, 0);
        this.setRotateAngle(Arms8, 0, 0, 0);
        this.setRotateAngle(cube_r1, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(FinL, 0.0F, -0.0436F, 0.2182F);
        this.setRotateAngle(FinR, 0.0F, 0.0436F, -0.2182F);
        this.setRotateAngle(mantle, -0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);

        updateDefaultPose();
        animator = ModelAnimator.create();

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Arm, -0.0436F, 0.48F, 0.1309F);
        this.setRotateAngle(Arm2, 0.2618F, 0.829F, 0.0F);
        this.setRotateAngle(Arm3, 0.5672F, 1.4835F, -0.0873F);
        this.setRotateAngle(Arm4, 1.8326F, -0.0873F, 0.2618F);
        this.setRotateAngle(Arm5, -0.0436F, -0.48F, -0.1309F);
        this.setRotateAngle(Arm6, 0.2618F, -0.829F, 0.0F);
        this.setRotateAngle(Arm7, 0.5672F, -1.4835F, 0.0873F);
        this.setRotateAngle(Arm8, 1.8326F, 0.0873F, -0.2618F);
        this.setRotateAngle(Arms, 0.0F, 0.6981F, -0.1309F);
        this.setRotateAngle(Arms2, 0.6109F, 0.6981F, 0.7854F);
        this.setRotateAngle(Arms3, 0.4363F, 0.5236F, 0.7854F);
        this.setRotateAngle(Arms4, 0.6109F, 0.2618F, 0.2618F);
        this.setRotateAngle(Arms5, 0.0F, -0.6981F, 0.1309F);
        this.setRotateAngle(Arms6, 0.6109F, -0.6981F, -0.7854F);
        this.setRotateAngle(Arms7, 0.4363F, -0.5236F, -0.7854F);
        this.setRotateAngle(Arms8, 0.6109F, -0.2618F, -0.2618F);
        this.setRotateAngle(Armss, 0.1309F, 0.6981F, -0.1309F);
        this.setRotateAngle(Armss2, 0.1309F, -0.6981F, 0.1309F);
        this.setRotateAngle(Body, 0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(FinL, 0.0F, 0.0436F, -0.2182F);
        this.setRotateAngle(FinR, 0.0F, -0.0436F, 0.2182F);
        this.setRotateAngle(mantle, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);
        this.Body.offsetY = 0.15F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Body, 0.1F, 0.5F, 0.4F);
        this.setRotateAngle(mantle, 0F, 0F, .0F);
        this.setRotateAngle(Arm, -0.0873F, 0.0873F, 0.0F);
        this.setRotateAngle(Arm2, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Arm3, 0.0436F, 0.0873F, 0.0F);
        this.setRotateAngle(Arm4, 0.0873F, 0.0436F, 0.0F);
        this.setRotateAngle(Arm5, -0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Arm6, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Arm7, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Arm8, 0.0873F, -0.0436F, 0.0F);
        this.setRotateAngle(Arms, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Arms2, 0.0F, -0.1745F, 0.0F);
        this.setRotateAngle(Arms3, -0.0436F, -0.1309F, 0.0F);
        this.setRotateAngle(Arms4, -0.0873F, -0.0436F, 0.0F);
        this.setRotateAngle(Arms5, 0.0873F, 0.0436F, 0.0F);
        this.setRotateAngle(Arms6, 0.0F, 0.1745F, 0.0F);
        this.setRotateAngle(Arms7, -0.0436F, 0.1309F, 0.0F);
        this.setRotateAngle(Arms8, -0.0873F, 0.0436F, 0.0F);
        this.setRotateAngle(Armss, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Armss2, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(FinL, 0.0F, 0.0436F, -0.2182F);
        this.setRotateAngle(FinR, 0.0F, -0.0436F, 0.2182F);
        this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);
        this.Body.offsetY = 0.15F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {

        this.setRotateAngle(Arm4, 2.5307F, -0.6981F, 0.1309F);
        this.setRotateAngle(Arm8, 2.5307F, 0.6981F, -0.1309F);
        this.setRotateAngle(Arms4, 0.2618F, 0.2618F, 0.0F);
        this.setRotateAngle(Arms8, 0.2618F, -0.2618F, 0.0F);
        this.setRotateAngle(Arm, 0.1309F, 0.3927F, 0.1309F);
        this.setRotateAngle(Arm2, 0.1745F, 0.829F, 0.0F);
        this.setRotateAngle(Arm3, 0.3927F, 1.7453F, 0.0F);
        this.setRotateAngle(Arm5, 0.1309F, -0.3927F, -0.1309F);
        this.setRotateAngle(Arm6, 0.1745F, -0.829F, 0.0F);
        this.setRotateAngle(Arm7, 0.3927F, -1.7453F, 0.0F);
        this.setRotateAngle(Arms, -0.3491F, 0.7418F, -0.48F);
        this.setRotateAngle(Arms2, 0.829F, 0.3927F, 1.2654F);
        this.setRotateAngle(Arms3, 0.3491F, 0.2618F, 1.2217F);
        this.setRotateAngle(Arms5, -0.3491F, -0.7418F, 0.48F);
        this.setRotateAngle(Arms6, 0.829F, -0.3927F, -1.2654F);
        this.setRotateAngle(Arms7, 0.3491F, -0.2618F, -1.2217F);
        this.setRotateAngle(Armss, -0.0436F, 0.6981F, -0.1309F);
        this.setRotateAngle(Armss2, -0.0436F, -0.6981F, 0.1309F);
        this.setRotateAngle(Body, 1.9199F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, -0.2793F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.2793F, 0.0F);
        this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(FinL, 0.0F, 0.0436F, -0.2182F);
        this.setRotateAngle(FinR, 0.0F, -0.0436F, 0.2182F);
        this.setRotateAngle(mantle, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);
        this.Body.offsetY = -0.2F;
        this.Body.offsetZ = -0.025F;
        this.Body.render(0.01F);
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
        //this.Body.offsetY = -0.5F;

        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] tent1 = {this.Arm, this.Arms, this.Armss};
        AdvancedModelRendererExtended[] tent2 = {this.Arm5, this.Arms5, this.Armss2};
        AdvancedModelRendererExtended[] t1 = {this.Arm2, this.Arms2};
        AdvancedModelRendererExtended[] t2 = {this.Arm3, this.Arms3};
        AdvancedModelRendererExtended[] t3 = {this.Arm4, this.Arms4};
        AdvancedModelRendererExtended[] t4 = {this.Arm6, this.Arms6};
        AdvancedModelRendererExtended[] t5 = {this.Arm7, this.Arms7};
        AdvancedModelRendererExtended[] t6 = {this.Arm8, this.Arms8};
        EntityPrehistoricFloraProteroctopus prot = (EntityPrehistoricFloraProteroctopus) e;

        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        if (prot.isReallySwimming()) {

            prot.tailBuffer.applyChainSwingBuffer(tent1);
            prot.tailBuffer.applyChainSwingBuffer(tent2);
            prot.tailBuffer.applyChainSwingBuffer(t1);
            prot.tailBuffer.applyChainSwingBuffer(t2);
            prot.tailBuffer.applyChainSwingBuffer(t3);
            prot.tailBuffer.applyChainSwingBuffer(t4);
            prot.tailBuffer.applyChainSwingBuffer(t5);
            prot.tailBuffer.applyChainSwingBuffer(t6);
            //Left:
            //
            //this.chainWave(t5, speed, 0.25F, -2, f2, 0.5F);
            this.chainSwing(tent1, speed, -0.2F, -2, f2, 0.5F);
            //Left lower middle:
            this.chainSwing(t1, speed, -0.2F, -2, f2, 0.5F);
            //Left upper top:
            this.chainSwing(t2, speed, -0.2F, -2, f2, 0.5F);
            this.chainSwing(t3, speed, -0.1F, -2, f2, 0.5F);

            //Right:
            //Right lower bottom:
            //this.chainWave(t4, speed, 0.25F, -2, f2, 0.5F);
            this.chainSwing(t5, speed, 0.2F, -2, f2, 0.5F);
            //Right upper middle:
            this.chainSwing(t6, speed, 0.2F, -2, f2, 0.5F);
            //Right upper top:
            this.chainSwing(t4, speed, 0.2F, -2, f2, 0.5F);
            this.chainSwing(tent2, speed, 0.1F, -2, f2, 0.5F);

            if (e.isInWater()) {
                float bobSpeed = 0.1F;
                this.bob(Body, bobSpeed, 0.8F, false, f2, 2);
                this.Body.offsetZ = this.moveBoxExtended(speed, 0.35F, false, 1F, f2, 1);
            } else {
                this.Body.rotateAngleZ = (float) Math.toRadians(90);
            }
        } else {

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraProteroctopus ee = (EntityPrehistoricFloraProteroctopus) entitylivingbaseIn;
            //Swimming pose:

        if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) {
            //Walk pose:
            this.setRotateAngle(Arm, -0.0436F, 0.48F, 0.1309F);
            this.setRotateAngle(Arm2, 0.2618F, 0.829F, 0.0F);
            this.setRotateAngle(Arm3, 0.5672F, 1.4835F, -0.0873F);
            this.setRotateAngle(Arm4, 1.8326F, -0.0873F, 0.2618F);
            this.setRotateAngle(Arm5, -0.0436F, -0.48F, -0.1309F);
            this.setRotateAngle(Arm6, 0.2618F, -0.829F, 0.0F);
            this.setRotateAngle(Arm7, 0.5672F, -1.4835F, 0.0873F);
            this.setRotateAngle(Arm8, 1.8326F, 0.0873F, -0.2618F);
            this.setRotateAngle(Arms, 0.0F, 0.6981F, -0.1309F);
            this.setRotateAngle(Arms2, 0.6109F, 0.6981F, 0.7854F);
            this.setRotateAngle(Arms3, 0.4363F, 0.5236F, 0.7854F);
            this.setRotateAngle(Arms4, 0.6109F, 0.2618F, 0.2618F);
            this.setRotateAngle(Arms5, 0.0F, -0.6981F, 0.1309F);
            this.setRotateAngle(Arms6, 0.6109F, -0.6981F, -0.7854F);
            this.setRotateAngle(Arms7, 0.4363F, -0.5236F, -0.7854F);
            this.setRotateAngle(Arms8, 0.6109F, -0.2618F, -0.2618F);
            this.setRotateAngle(Armss, 0.1309F, 0.6981F, -0.1309F);
            this.setRotateAngle(Armss2, 0.1309F, -0.6981F, 0.1309F);
            this.setRotateAngle(Body, 0.6981F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0F, -0.2793F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, 0.2793F, 0.0F);
            this.setRotateAngle(cube_r3, 0.48F, 0.0F, 0.0F);
            this.setRotateAngle(FinL, 0.0F, 0.0436F, -0.2182F);
            this.setRotateAngle(FinR, 0.0F, -0.0436F, 0.2182F);
            this.setRotateAngle(mantle, -0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(mantle2, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(siphon, 0.0436F, 0.0F, 0.0F);
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraProteroctopus entity = (EntityPrehistoricFloraProteroctopus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 0D) / 40D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-5) + (((tickAnim - 0D) / 40D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-5D)));
            zz = 0D + (((tickAnim - 0D) / 40D) * (0D-(0D)));
        }
        this.setRotateAngle(Arm, Arm.rotateAngleX + (float) Math.toRadians(xx), Arm.rotateAngleY + (float) Math.toRadians(yy), Arm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -10D + (((tickAnim - 0D) / 19D) * (-2.5D-(-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 0D) / 19D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 0D) / 19D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 19D) / 21D) * (-10D-(-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-10) + (((tickAnim - 19D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-10D)));
            zz = 0D + (((tickAnim - 19D) / 21D) * (0D-(0D)));
        }
        this.setRotateAngle(Arms, Arms.rotateAngleX + (float) Math.toRadians(xx), Arms.rotateAngleY + (float) Math.toRadians(yy), Arms.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -8.43823D + (((tickAnim - 0D) / 19D) * (-16.6D-(-8.43823D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-2.5721) + (((tickAnim - 0D) / 19D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-2.5721D)));
            zz = -1.39893D + (((tickAnim - 0D) / 19D) * (0D-(-1.39893D)));
        }
        else if (tickAnim >= 19 && tickAnim < 40) {
            xx = -16.6D + (((tickAnim - 19D) / 21D) * (-8.43823D-(-16.6D)));
            yy = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 19D) / 21D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-2.5721D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 19D) / 21D) * (-1.39893D-(0D)));
        }
        this.setRotateAngle(Armss, Armss.rotateAngleX + (float) Math.toRadians(xx), Armss.rotateAngleY + (float) Math.toRadians(yy), Armss.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Arm5, Arm5.rotateAngleX + (float) Math.toRadians(0), Arm5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-90))*-10), Arm5.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -15D + (((tickAnim - 0D) / 19D) * (-2.5D-(-15D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 0D) / 19D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 0D) / 19D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 33) {
            xx = -2.5D + (((tickAnim - 19D) / 14D) * (-15.5D-(-2.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 19D) / 14D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 19D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15.5D + (((tickAnim - 33D) / 7D) * (-15D-(-15.5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 33D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Arms5, Arms5.rotateAngleX + (float) Math.toRadians(xx), Arms5.rotateAngleY + (float) Math.toRadians(yy), Arms5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -15D + (((tickAnim - 0D) / 19D) * (5D-(-15D)));
            yy = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 0D) / 19D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 0D) / 19D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 5D + (((tickAnim - 19D) / 9D) * (-16.6D-(5D)));
            yy = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 19D) / 9D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 19D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = -16.6D + (((tickAnim - 28D) / 12D) * (-15D-(-16.6D)));
            yy = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15) + (((tickAnim - 28D) / 12D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180))*-15D)));
            zz = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Armss2, Armss2.rotateAngleX + (float) Math.toRadians(xx), Armss2.rotateAngleY + (float) Math.toRadians(yy), Armss2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Arm2, Arm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+90))*-10), Arm2.rotateAngleY + (float) Math.toRadians(0), Arm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms2, Arms2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+90))*-10), Arms2.rotateAngleY + (float) Math.toRadians(0), Arms2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arm6, Arm6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-10), Arm6.rotateAngleY + (float) Math.toRadians(0), Arm6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms6, Arms6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-10), Arms6.rotateAngleY + (float) Math.toRadians(0), Arms6.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arm3, Arm3.rotateAngleX + (float) Math.toRadians(0), Arm3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-10), Arm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms3, Arms3.rotateAngleX + (float) Math.toRadians(0), Arms3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-10), Arms3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arm7, Arm7.rotateAngleX + (float) Math.toRadians(0), Arm7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+90))*-10), Arm7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms7, Arms7.rotateAngleX + (float) Math.toRadians(0), Arms7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+90))*-10), Arms7.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arm4, Arm4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*6), Arm4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-20), Arm4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms4, Arms4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*3), Arms4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180+90))*-10), Arms4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arm8, Arm8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-6), Arm8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-20), Arm8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Arms8, Arms8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-3), Arms8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180-90))*-10), Arms8.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(FinR, FinR.rotateAngleX + (float) Math.toRadians(0), FinR.rotateAngleY + (float) Math.toRadians(0), FinR.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*5));


        this.setRotateAngle(FinL, FinL.rotateAngleX + (float) Math.toRadians(0), FinL.rotateAngleY + (float) Math.toRadians(0), FinL.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/40D)*2D)*180))*-5));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraProteroctopus e = (EntityPrehistoricFloraProteroctopus) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length
        animator.rotate(Arm, ((-0.0873F)-(-0.0436F)), ((0.0436F)-(0.48F)),((0.0F)-(0.1309F)));
        animator.rotate(Arm2, ((0.0436F)-(0.2618F)), ((0.0873F)-(0.829F)),((0.0F)-(0.0F)));
        animator.rotate(Arm3, ((0.1309F)-(0.5672F)), ((0.0873F)-(1.4835F)),((0.0F)-(-0.0873F)));
        animator.rotate(Arm4, ((0.2182F)-(1.8326F)), ((0.0873F)-(-0.0873F)),((0.0F)-(0.2618F)));
        animator.rotate(Arm5, ((-0.0873F)-(-0.0436F)), ((-0.0436F)-(-0.48F)),((0.0F)-(-0.1309F)));
        animator.rotate(Arm6, ((0.0436F)-(0.2618F)), ((-0.0873F)-(-0.829F)),((0.0F)-(0.0F)));
        animator.rotate(Arm7, ((0.1309F)-(0.5672F)), ((-0.0873F)-(-1.4835F)),((0.0F)-(0.0873F)));
        animator.rotate(Arm8, ((0.2182F)-(1.8326F)), ((-0.0873F)-(0.0873F)),((0.0F)-(-0.2618F)));
        animator.rotate(Arms, ((0)-(0.0F)), ((0)-(0.6981F)),((0)-(-0.1309F)));
        animator.rotate(Armss2, ((0)-(0.6109F)), ((0)-(0.6981F)),((0)-(0.7854F)));
        animator.rotate(Arms3, ((0)-(0.4363F)), ((0)-(0.5236F)),((0)-(0.7854F)));
        animator.rotate(Arms4, ((0)-(0.6109F)), ((0)-(0.2618F)),((0)-(0.2618F)));
        animator.rotate(Arms5, ((0)-(0.0F)), ((0)-(-0.6981F)),((0)-(0.1309F)));
        animator.rotate(Arms6, ((0)-(0.6109F)), ((0)-(-0.6981F)),((0)-(-0.7854F)));
        animator.rotate(Arms7, ((0)-(0.4363F)), ((0)-(-0.5236F)),((0)-(-0.7854F)));
        animator.rotate(Arms8, ((0)-(0.6109F)), ((0)-(-0.2618F)),((0)-(-0.2618F)));
        animator.rotate(Armss, ((0)-(0.1309F)), ((0)-(0.6981F)),((0)-(-0.1309F)));
        animator.rotate(Arms2, ((0)-(0.1309F)), ((0)-(-0.6981F)),((0)-(0.1309F)));
        animator.rotate(Body, ((0)-(0.6981F)), (((float)Math.toRadians(180))-(0.0F)),((0)-(0.0F)));
        animator.rotate(cube_r1, ((0.0F)-(0.0F)), ((0.2793F)-(-0.2793F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r2, ((0.0F)-(0.0F)), ((-0.2793F)-(0.2793F)),((0.0F)-(0.0F)));
        animator.rotate(cube_r3, ((0.48F)-(0.48F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(FinL, ((0.0F)-(0.0F)), ((-0.0436F)-(0.0436F)),((0.2182F)-(-0.2182F)));
        animator.rotate(FinR, ((0.0F)-(0.0F)), ((0.0436F)-(-0.0436F)),((-0.2182F)-(0.2182F)));
        animator.rotate(mantle, ((-0.0873F)-(-0.3491F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(mantle2, ((-0.3054F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(siphon, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length
        animator.rotate(Arm, -((-0.0873F)-(-0.0436F)), -((0.0436F)-(0.48F)),-((0.0F)-(0.1309F)));
        animator.rotate(Arm2, -((0.0436F)-(0.2618F)), -((0.0873F)-(0.829F)),-((0.0F)-(0.0F)));
        animator.rotate(Arm3, -((0.1309F)-(0.5672F)), -((0.0873F)-(1.4835F)),-((0.0F)-(-0.0873F)));
        animator.rotate(Arm4, -((0.2182F)-(1.8326F)), -((0.0873F)-(-0.0873F)),-((0.0F)-(0.2618F)));
        animator.rotate(Arm5, -((-0.0873F)-(-0.0436F)), -((-0.0436F)-(-0.48F)),-((0.0F)-(-0.1309F)));
        animator.rotate(Arm6, -((0.0436F)-(0.2618F)), -((-0.0873F)-(-0.829F)),-((0.0F)-(0.0F)));
        animator.rotate(Arm7, -((0.1309F)-(0.5672F)), -((-0.0873F)-(-1.4835F)),-((0.0F)-(0.0873F)));
        animator.rotate(Arm8, -((0.2182F)-(1.8326F)), -((-0.0873F)-(0.0873F)),-((0.0F)-(-0.2618F)));
        animator.rotate(Arms, -((0)-(0.0F)), -((0)-(0.6981F)),-((0)-(-0.1309F)));
        animator.rotate(Armss2, -((0)-(0.6109F)), -((0)-(0.6981F)),-((0)-(0.7854F)));
        animator.rotate(Arms3, -((0)-(0.4363F)), -((0)-(0.5236F)),-((0)-(0.7854F)));
        animator.rotate(Arms4, -((0)-(0.6109F)), -((0)-(0.2618F)),-((0)-(0.2618F)));
        animator.rotate(Arms5, -((0)-(0.0F)), -((0)-(-0.6981F)),-((0)-(0.1309F)));
        animator.rotate(Arms6, -((0)-(0.6109F)), -((0)-(-0.6981F)),-((0)-(-0.7854F)));
        animator.rotate(Arms7, -((0)-(0.4363F)), -((0)-(-0.5236F)),-((0)-(-0.7854F)));
        animator.rotate(Arms8, -((0)-(0.6109F)), -((0)-(-0.2618F)),-((0)-(-0.2618F)));
        animator.rotate(Armss, -((0)-(0.1309F)), -((0)-(0.6981F)),-((0)-(-0.1309F)));
        animator.rotate(Arms2, -((0)-(0.1309F)), -((0)-(-0.6981F)),-((0)-(0.1309F)));
        animator.rotate(Body, -((0)-(0.6981F)), -(((float)Math.toRadians(180))-(0.0F)),-((0)-(0.0F)));
        animator.rotate(cube_r1, -((0.0F)-(0.0F)), -((0.2793F)-(-0.2793F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r2, -((0.0F)-(0.0F)), -((-0.2793F)-(0.2793F)),-((0.0F)-(0.0F)));
        animator.rotate(cube_r3, -((0.48F)-(0.48F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(FinL, -((0.0F)-(0.0F)), -((-0.0436F)-(0.0436F)),-((0.2182F)-(-0.2182F)));
        animator.rotate(FinR, -((0.0F)-(0.0F)), -((0.0436F)-(-0.0436F)),-((-0.2182F)-(0.2182F)));
        animator.rotate(mantle, -((-0.0873F)-(-0.3491F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(mantle2, -((-0.3054F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(siphon, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }

}
