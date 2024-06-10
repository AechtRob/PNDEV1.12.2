package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlacodus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

public class ModelPlacodus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended body1;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended upperjaw;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended lowerjaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended armR;
    private final AdvancedModelRendererExtended armR2;
    private final AdvancedModelRendererExtended armR3;
    private final AdvancedModelRendererExtended armL;
    private final AdvancedModelRendererExtended armL2;
    private final AdvancedModelRendererExtended armL3;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended legR;
    private final AdvancedModelRendererExtended legR2;
    private final AdvancedModelRendererExtended legR3;
    private final AdvancedModelRendererExtended legL;
    private final AdvancedModelRendererExtended legL2;
    private final AdvancedModelRendererExtended legL3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private ModelAnimator animator;

    public ModelPlacodus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 28.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -14.0F, -11.0F, 12, 10, 20, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 30, -0.5F, -15.0F, -11.0F, 1, 1, 20, 0.0F, false));

        this.body1 = new AdvancedModelRendererExtended(this);
        this.body1.setRotationPoint(0.0F, -9.0F, -11.0F);
        this.body.addChild(body1);
        this.setRotateAngle(body1, 0.0873F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 32, 52, -5.0F, -4.25F, -3.0F, 10, 8, 4, 0.0F, false));
        this.body1.cubeList.add(new ModelBox(body1, 0, 51, -0.5F, -5.0F, -3.0F, 1, 1, 4, -0.01F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, -1.0F, -3.0F);
        this.body1.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 62, 24, -3.0F, -3.0F, -4.75F, 6, 6, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 5, 41, -0.5F, -3.75F, -4.5F, 1, 1, 5, -0.02F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 0.5F, -4.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);


        this.upperjaw = new AdvancedModelRendererExtended(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 21, 58, -2.0F, -1.0F, -4.95F, 4, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 43, 41, -2.5F, -1.0F, -3.95F, 5, 1, 2, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 12, 13, -1.5F, -0.8F, -4.85F, 3, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 18, -2.0F, -0.8F, -3.85F, 4, 1, 1, 0.01F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 7, -2.5F, -3.0F, -2.0F, 5, 3, 3, 0.001F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0F, -2.05F);
        this.upperjaw.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0698F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 7, -2.0F, 0.0F, -3.05F, 4, 2, 2, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 30, -2.5F, 0.0F, -1.95F, 5, 2, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.125F, -5.65F);
        this.upperjaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 47, -1.5F, 0.5302F, -1.0911F, 3, 1, 2, -0.02F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.125F, -5.65F);
        this.upperjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.829F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 47, -1.5F, 0.0302F, -1.0911F, 3, 1, 2, -0.0002F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -0.925F, -6.75F);
        this.upperjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.672F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 56, -1.5F, -0.15F, -0.1F, 3, 1, 2, -0.01F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.025F, -4.95F);
        this.upperjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 55, -1.5F, -0.975F, -1.8F, 3, 1, 2, 0.001F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -1.025F, -6.95F);
        this.upperjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.7243F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 18, -0.5F, 0.5926F, -1.3152F, 1, 0, 1, 0.005F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 18, -2.0F, 0.5926F, -1.3152F, 4, 0, 1, 0.005F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.125F, -5.95F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 60, -2.0F, -0.975F, -1.0F, 4, 1, 1, -0.01F, false));

        this.lowerjaw = new AdvancedModelRendererExtended(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 59, -2.0F, 0.2F, -6.65F, 4, 1, 1, -0.015F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 44, 17, -2.0F, 0.0F, -4.95F, 4, 1, 2, -0.0001F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 0, 0, -2.5F, 0.0F, -3.75F, 5, 2, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 7, 38, -2.0F, -0.3F, -3.75F, 4, 1, 2, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 21, 51, -2.0F, -2.0F, -1.75F, 4, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -6.6F);
        this.lowerjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2487F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 56, 52, -1.5F, -0.7935F, 0.0108F, 3, 1, 3, -0.01F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.lowerjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1265F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -2.0F, -0.9417F, -3.7024F, 4, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.2F, -5.65F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2094F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 15, -1.5F, 0.0F, -0.2F, 3, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.4F, -6.65F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.576F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 60, 17, -0.5F, 0.0F, -0.7F, 1, 0, 1, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 17, -2.0F, 0.0F, -0.7F, 4, 0, 1, 0.0F, false));

        this.armR = new AdvancedModelRendererExtended(this);
        this.armR.setRotationPoint(-4.75F, 1.0F, -1.0F);
        this.body1.addChild(armR);
        this.setRotateAngle(armR, 0.48F, 0.0F, 0.6109F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 38, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, false));

        this.armR2 = new AdvancedModelRendererExtended(this);
        this.armR2.setRotationPoint(0.0F, 4.25F, 0.25F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, -0.6109F, 0.0F, 0.3491F);
        this.armR2.cubeList.add(new ModelBox(armR2, 44, 0, -1.0F, 0.0F, -1.0F, 2, 4, 3, -0.01F, false));

        this.armR3 = new AdvancedModelRendererExtended(this);
        this.armR3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.3491F, 0.0F, -0.3491F);
        this.armR3.cubeList.add(new ModelBox(armR3, 22, 30, -0.25F, 0.0F, -1.5F, 1, 4, 4, -0.01F, false));

        this.armL = new AdvancedModelRendererExtended(this);
        this.armL.setRotationPoint(4.75F, 1.0F, -1.0F);
        this.body1.addChild(armL);
        this.setRotateAngle(armL, 0.48F, 0.0F, -0.6109F);
        this.armL.cubeList.add(new ModelBox(armL, 0, 38, -1.0F, 0.0F, -1.0F, 2, 5, 3, 0.0F, true));

        this.armL2 = new AdvancedModelRendererExtended(this);
        this.armL2.setRotationPoint(0.0F, 4.25F, 0.25F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, -0.6109F, 0.0F, -0.3491F);
        this.armL2.cubeList.add(new ModelBox(armL2, 44, 0, -1.0F, 0.0F, -1.0F, 2, 4, 3, -0.01F, true));

        this.armL3 = new AdvancedModelRendererExtended(this);
        this.armL3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.3491F, 0.0F, 0.3491F);
        this.armL3.cubeList.add(new ModelBox(armL3, 22, 30, -0.75F, 0.0F, -1.5F, 1, 4, 4, -0.01F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -10.0F, 10.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 22, 38, -0.5F, -4.0F, -2.0F, 1, 1, 5, -0.01F, false));
        this.body2.cubeList.add(new ModelBox(body2, 55, 59, -4.5F, -3.25F, -2.0F, 9, 8, 5, 0.0F, false));

        this.legR = new AdvancedModelRendererExtended(this);
        this.legR.setRotationPoint(-4.0F, 2.25F, 0.0F);
        this.body2.addChild(legR);
        this.setRotateAngle(legR, 1.1345F, -0.5236F, 0.5236F);
        this.legR.cubeList.add(new ModelBox(legR, 10, 30, -1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F, false));

        this.legR2 = new AdvancedModelRendererExtended(this);
        this.legR2.setRotationPoint(0.0F, 4.5F, -0.75F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.3927F, 0.0F, -0.2182F);
        this.legR2.cubeList.add(new ModelBox(legR2, 43, 34, -1.0F, 0.0F, -1.0F, 2, 4, 3, -0.01F, false));

        this.legR3 = new AdvancedModelRendererExtended(this);
        this.legR3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, 0.0873F, 0.0F, -0.3491F);
        this.legR3.cubeList.add(new ModelBox(legR3, 0, 30, -0.25F, 0.0F, -1.5F, 1, 4, 4, -0.01F, false));

        this.legL = new AdvancedModelRendererExtended(this);
        this.legL.setRotationPoint(4.0F, 2.25F, 0.0F);
        this.body2.addChild(legL);
        this.setRotateAngle(legL, 1.1345F, 0.5236F, -0.5236F);
        this.legL.cubeList.add(new ModelBox(legL, 10, 30, -1.0F, 0.0F, -1.5F, 2, 5, 3, 0.0F, true));

        this.legL2 = new AdvancedModelRendererExtended(this);
        this.legL2.setRotationPoint(0.0F, 4.5F, -0.75F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.3927F, 0.0F, 0.2182F);
        this.legL2.cubeList.add(new ModelBox(legL2, 43, 34, -1.0F, 0.0F, -1.0F, 2, 4, 3, -0.01F, true));

        this.legL3 = new AdvancedModelRendererExtended(this);
        this.legL3.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, 0.0873F, 0.0F, 0.3491F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 30, -0.75F, 0.0F, -1.5F, 1, 4, 4, -0.01F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, 1.0F, 3.0F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 51, -2.5F, -3.25F, -1.0F, 5, 6, 11, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.5F, 10.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 44, 0, -2.0F, -2.25F, -1.0F, 4, 5, 12, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 22, 30, -1.5F, -2.0F, -1.0F, 3, 4, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.25F, 14.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 43, 34, -1.0F, -1.25F, -1.0F, 2, 3, 15, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.body2.setScale(0,0,0);
        this.body2.scaleChildren = true;
        this.setRotateAngle(body, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.1F, 0.0F, 0.2F);
        this.setRotateAngle(head, -0.1F, 0.0F, 0.2F);
        this.setRotateAngle(lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armL, 0.2F, 0.0F, -0.5F);
        this.setRotateAngle(armL2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(armL3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(armR, 0.2F, 0.0F, 0.5F);
        this.setRotateAngle(armR2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(armR3, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.2F;
        this.body.offsetZ = -0.1F;
        this.body.render(0.01F);
        this.body2.setScale(1,1,1);
        this.body2.setScale(1,1,1);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(body1, 0.1F, -0.15F, 0.0F);
        this.setRotateAngle(body2, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(neck, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(head, 0.2F, -0.3F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(legL, 1.1F, 0.3F, -0.5F);
        this.setRotateAngle(legL2, 0.0F, 0.3F, 0.5F);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(legR, 0.9F, 0.3F, 0.5F);
        this.setRotateAngle(legR2, 0.3F, 0.0F, 0.5F);
        this.setRotateAngle(legR3, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(armL, -0.2F, 0.0F, -0.5F);
        this.setRotateAngle(armL2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(armL3, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(armR, 0.3F, 0.0F, 0.5F);
        this.setRotateAngle(armR2, -0.5F, 0.0F, 0.0F);
        this.setRotateAngle(armR3, 0.3F, 0.0F, 0.0F);
        this.body.offsetY = -0.3F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRendererExtended AdvancedModelRendererExtended, float x, float y, float z) {
        AdvancedModelRendererExtended.rotateAngleX = x;
        AdvancedModelRendererExtended.rotateAngleY = y;
        AdvancedModelRendererExtended.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 0.88F;

        EntityPrehistoricFloraPlacodus Placodus = (EntityPrehistoricFloraPlacodus) e;

        //this.faceTarget(f3, f4, 5, neckbase);
        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, head);

        float speed = 0.2F;
        AdvancedModelRendererExtended[] Tail = {this.body2, this.tail, this.tail2, this.tail3, this.tail4};
        Placodus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRendererExtended[] FL = {this.armL, this.armL2, this.armL3};
        AdvancedModelRendererExtended[] FR = {this.armR, this.armR2, this.armR3};
        AdvancedModelRendererExtended[] BL = {this.legL, this.legL2, this.legL3};
        AdvancedModelRendererExtended[] BR = {this.legR, this.legR2, this.legR3};

        if (!Placodus.isReallyInWater()) {
            this.armL.rotateAngleY = -(float) Math.toRadians(14.223);
            this.armR.rotateAngleY = (float) Math.toRadians(14.223);
            this.armL.rotateAngleX = (float) Math.toRadians(20.3654);
            this.armR.rotateAngleX = -(float) Math.toRadians(-20.3654);
            this.armL.rotateAngleZ = (float) Math.toRadians(-60.1585);
            this.armR.rotateAngleZ = (float) Math.toRadians(60.1585);



            if (f3 == 0.0F || !Placodus.getIsMoving()) {
                return;
            }

            this.walk(this.armR, speed * 0.6F, 0.7F,true, -0.8F,0.6F, f2, 1F);
            this.walk(this.armL, speed * 0.6F, 0.7F,true, 0.8F,0.6F, f2, 1F);

            this.walk(this.legR, speed * 0.6F, 0.15F,true, 0.8F,0.4F, f2, 1F);
            this.walk(this.legL, speed * 0.6F, 0.15F,true, 0.8F,0.4F, f2, 1F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 0.8F, 0.12F, -3, f2, 0.8F);

        }
        else {

            if (f3 == 0.0F) {

                this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(Tail, speed * 0.8F, 0.06F, -3, f2, 0.8F);
                return;
            }

            speed = speed * 2F;
            this.swing(this.body, speed * 0.6F, 0.3F,false, 0,0, f2, 1F);
            //this.walk(this.body, speed * 0.6F, 0.3F,false, 0,0, f2, 1F);

            this.chainWaveExtended(FR, speed * 0.8F, -0.1F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.1F, 1.5, 3F, f2, 0.8F);


            this.chainWaveExtended(FR, speed * 0.8F, -0.3F, 1.5, 0, f2, 0.8F);
            this.chainWaveExtended(FL, speed * 0.8F, -0.3F, 1.5, 3F, f2, 0.8F);


            this.chainSwingExtended(FR, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);


            this.chainSwingExtended(FR, speed * 0.8F, 0.1F, -1.5, 0, f2, 0.8F);
            this.chainSwingExtended(FL, speed * 0.8F, 0.1F, -1.5, 3F, f2, 0.8F);
            this.chainFlapExtended(BR, speed * 0.8F, 0.3F, -1.5, 0, f2, 0.8F);
            this.chainFlapExtended(BL, speed * 0.8F, 0.3F, -1.5, 3F, f2, 0.8F);


            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);

        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(0), (float) Math.toRadians(25), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(10);
    }
}
