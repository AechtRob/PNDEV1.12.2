package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLufengosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLufengosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer basin;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer upperlegR;
    private final AdvancedModelRenderer lowerlegR;
    private final AdvancedModelRenderer feetR;
    private final AdvancedModelRenderer toesR;
    private final AdvancedModelRenderer upperlegL;
    private final AdvancedModelRenderer lowerlegL;
    private final AdvancedModelRenderer feetL;
    private final AdvancedModelRenderer toesL;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer upperarmR;
    private final AdvancedModelRenderer lowerarmR;
    private final AdvancedModelRenderer handR;
    private final AdvancedModelRenderer thumbclawR;
    private final AdvancedModelRenderer upperarmL;
    private final AdvancedModelRenderer lowerarmL;
    private final AdvancedModelRenderer handL;
    private final AdvancedModelRenderer thumbclawL;
    private ModelAnimator animator;

    public ModelLufengosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRenderer(this);
        this.basin.setRotationPoint(0.0F, -1.3F, 6.6F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 0, 38, -6.0F, -4.8F, -5.3F, 12, 15, 11, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.3F, 4.6F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 49, 0, -4.5F, -4.8F, -0.1F, 9, 11, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -2.1F, 9.3F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 62, -3.5F, -2.5F, -0.7F, 7, 8, 14, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 12.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 71, -2.5F, -1.8F, -0.2F, 5, 6, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 1.4F, 11.4F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 81, 76, -2.0F, -2.6F, 0.3F, 4, 4, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.5F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.1745F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 61, 71, -1.5F, -1.6F, 0.3F, 3, 3, 13, 0.0F, false));

        this.upperlegR = new AdvancedModelRenderer(this);
        this.upperlegR.setRotationPoint(-6.0F, 1.1F, -2.2F);
        this.basin.addChild(upperlegR);
        this.setRotateAngle(upperlegR, -0.5236F, 0.0F, 0.0F);
        this.upperlegR.cubeList.add(new ModelBox(upperlegR, 80, 54, -2.5F, -1.6F, -2.6F, 5, 14, 8, 0.0F, false));

        this.lowerlegR = new AdvancedModelRenderer(this);
        this.lowerlegR.setRotationPoint(0.4F, 12.0F, -1.4F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, 1.1287F, 0.0F, 0.0F);
        this.lowerlegR.cubeList.add(new ModelBox(lowerlegR, 0, 0, -2.4F, 0.0F, -0.5F, 4, 12, 5, 0.0F, false));

        this.feetR = new AdvancedModelRenderer(this);
        this.feetR.setRotationPoint(0.3F, 12.0F, 4.5F);
        this.lowerlegR.addChild(feetR);
        this.setRotateAngle(feetR, -0.81F, 0.0F, 0.0F);
        this.feetR.cubeList.add(new ModelBox(feetR, 87, 9, -2.2F, -0.3F, -4.3F, 3, 7, 4, 0.0F, false));

        this.toesR = new AdvancedModelRenderer(this);
        this.toesR.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feetR.addChild(toesR);
        this.setRotateAngle(toesR, 0.2276F, 0.0F, 0.0F);
        this.toesR.cubeList.add(new ModelBox(toesR, 77, 0, -2.7F, 0.6742F, -5.0256F, 4, 2, 7, 0.0F, false));

        this.upperlegL = new AdvancedModelRenderer(this);
        this.upperlegL.setRotationPoint(6.0F, 1.1F, -2.2F);
        this.basin.addChild(upperlegL);
        this.setRotateAngle(upperlegL, -0.5236F, 0.0F, 0.0F);
        this.upperlegL.cubeList.add(new ModelBox(upperlegL, 80, 54, -2.5F, -1.6F, -2.6F, 5, 14, 8, 0.0F, true));

        this.lowerlegL = new AdvancedModelRenderer(this);
        this.lowerlegL.setRotationPoint(-0.4F, 12.0F, -1.4F);
        this.upperlegL.addChild(lowerlegL);
        this.setRotateAngle(lowerlegL, 1.1287F, 0.0F, 0.0F);
        this.lowerlegL.cubeList.add(new ModelBox(lowerlegL, 0, 0, -1.6F, 0.0F, -0.5F, 4, 12, 5, 0.0F, true));

        this.feetL = new AdvancedModelRenderer(this);
        this.feetL.setRotationPoint(-0.3F, 12.0F, 4.5F);
        this.lowerlegL.addChild(feetL);
        this.setRotateAngle(feetL, -0.81F, 0.0F, 0.0F);
        this.feetL.cubeList.add(new ModelBox(feetL, 87, 9, -0.8F, -0.3F, -4.3F, 3, 7, 4, 0.0F, true));

        this.toesL = new AdvancedModelRenderer(this);
        this.toesL.setRotationPoint(0.0F, 5.4F, -2.5F);
        this.feetL.addChild(toesL);
        this.setRotateAngle(toesL, 0.2276F, 0.0F, 0.0F);
        this.toesL.cubeList.add(new ModelBox(toesL, 77, 0, -1.3F, 0.6742F, -5.0256F, 4, 2, 7, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.1F, -0.1F, -5.1F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.9F, -5.7F, -20.0F, 14, 17, 21, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.7F, -19.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0436F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 46, 38, -5.4F, -4.5F, -10.0F, 11, 14, 10, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.1F, -0.7F, -10.1F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2618F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 70, 21, -3.5F, -3.4F, -6.15F, 7, 8, 9, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.05F, -6.35F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2182F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 28, 84, -2.5F, -3.0F, -6.25F, 5, 6, 8, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 23, 64, -2.0F, -2.5F, -6.25F, 4, 5, 7, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.4F, -6.25F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.2618F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 35, 38, -1.5F, -1.75F, -5.0F, 3, 4, 6, -0.02F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, 0.5F, -3.5F);
        this.neck4.addChild(head2);
        this.setRotateAngle(head2, 0.4363F, 0.0F, 0.0F);
        this.head2.cubeList.add(new ModelBox(head2, 0, 69, -1.5F, -2.0F, -3.0F, 3, 2, 3, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, -2.0F, -2.8F);
        this.head2.addChild(bone3);
        this.setRotateAngle(bone3, 0.1309F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 13, 0, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.001F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 49, 4, -1.0F, 1.0F, -4.0F, 2, 1, 2, 0.002F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1F, 2.0F, -0.2F);
        this.bone3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 90, -0.9F, -0.75F, -3.725F, 2, 1, 3, -0.015F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.0F, -5.0F);
        this.bone3.addChild(bone4);
        this.setRotateAngle(bone4, 0.6545F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 0.0F, 2.8F);
        this.bone4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7025F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 64, -1.0F, 0.1708F, 2.3476F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 1.1F, 3.1F);
        this.bone4.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6773F, 0.2621F, -0.2055F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 17, -1.0F, -0.3728F, -0.4772F, 1, 1, 2, -0.02F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.1F, 3.1F);
        this.bone4.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6773F, -0.2621F, 0.2055F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 9, 17, 0.0F, -0.3728F, -0.4772F, 1, 1, 2, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 2.1F, 4.8F);
        this.bone4.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.6501F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 38, -0.5F, -0.1398F, -2.9357F, 2, 2, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 0.6F, 0.8F);
        this.bone4.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.24F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 38, -0.5F, 0.0228F, 0.8F, 2, 1, 1, -0.02F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 40, -0.5F, 0.0228F, -0.0666F, 2, 1, 1, -0.01F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(-0.1F, 0.0F, 0.0F);
        this.head2.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 17, -1.4F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 49, 0, -1.4F, -1.9F, -2.0F, 3, 2, 2, -0.01F, false));
        this.jaw2.cubeList.add(new ModelBox(jaw2, 0, 43, -1.4F, -1.9F, -2.5F, 3, 2, 2, -0.012F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.jaw2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 90, -0.9F, -0.25F, -3.4F, 2, 1, 3, -0.02F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 64, -0.9F, 0.0F, -3.45F, 2, 1, 4, -0.01F, false));

        this.upperarmR = new AdvancedModelRenderer(this);
        this.upperarmR.setRotationPoint(-5.35F, 5.85F, -6.2F);
        this.chest.addChild(upperarmR);
        this.setRotateAngle(upperarmR, 0.8727F, -0.0873F, 0.0F);
        this.upperarmR.cubeList.add(new ModelBox(upperarmR, 60, 62, -1.9F, -1.0F, -2.0F, 3, 10, 4, 0.0F, false));

        this.lowerarmR = new AdvancedModelRenderer(this);
        this.lowerarmR.setRotationPoint(-0.3F, 9.0F, 1.5F);
        this.upperarmR.addChild(lowerarmR);
        this.setRotateAngle(lowerarmR, 0.7854F, 0.0F, 0.0F);
        this.lowerarmR.cubeList.add(new ModelBox(lowerarmR, 78, 38, -1.1F, -3.0F, -5.0F, 2, 3, 5, 0.0F, false));

        this.handR = new AdvancedModelRenderer(this);
        this.handR.setRotationPoint(-1.1F, -2.275F, -4.9F);
        this.lowerarmR.addChild(handR);
        this.setRotateAngle(handR, 0.0F, -0.4363F, 0.0F);
        this.handR.cubeList.add(new ModelBox(handR, 47, 38, 0.0F, -0.75F, -3.0F, 1, 3, 3, 0.01F, false));

        this.thumbclawR = new AdvancedModelRenderer(this);
        this.thumbclawR.setRotationPoint(0.8F, -0.3F, -0.9F);
        this.handR.addChild(thumbclawR);
        this.setRotateAngle(thumbclawR, -0.3927F, 0.0F, 0.0F);
        this.thumbclawR.cubeList.add(new ModelBox(thumbclawR, 12, 17, -0.7F, -0.6F, -2.6F, 1, 1, 3, 0.0F, false));

        this.upperarmL = new AdvancedModelRenderer(this);
        this.upperarmL.setRotationPoint(5.55F, 5.85F, -6.2F);
        this.chest.addChild(upperarmL);
        this.setRotateAngle(upperarmL, 0.8727F, 0.0873F, 0.0F);
        this.upperarmL.cubeList.add(new ModelBox(upperarmL, 60, 62, -1.1F, -1.0F, -2.0F, 3, 10, 4, 0.0F, true));

        this.lowerarmL = new AdvancedModelRenderer(this);
        this.lowerarmL.setRotationPoint(0.3F, 9.0F, 1.5F);
        this.upperarmL.addChild(lowerarmL);
        this.setRotateAngle(lowerarmL, 0.7854F, 0.0F, 0.0F);
        this.lowerarmL.cubeList.add(new ModelBox(lowerarmL, 78, 38, -0.9F, -3.0F, -5.0F, 2, 3, 5, 0.0F, true));

        this.handL = new AdvancedModelRenderer(this);
        this.handL.setRotationPoint(1.1F, -2.25F, -4.9F);
        this.lowerarmL.addChild(handL);
        this.setRotateAngle(handL, 0.0F, 0.4363F, 0.0F);
        this.handL.cubeList.add(new ModelBox(handL, 47, 38, -1.0F, -0.75F, -3.0F, 1, 3, 3, 0.01F, true));

        this.thumbclawL = new AdvancedModelRenderer(this);
        this.thumbclawL.setRotationPoint(-0.8F, -0.3F, -0.9F);
        this.handL.addChild(thumbclawL);
        this.setRotateAngle(thumbclawL, -0.3927F, 0.0F, 0.0F);
        this.thumbclawL.cubeList.add(new ModelBox(thumbclawL, 12, 17, -0.3F, -0.6F, -2.6F, 1, 1, 3, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck3, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head2, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(jaw2, 0.3F, 0.0F, 0.0F);
        this.chest.offsetY = -0.02F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.25F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(basin, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.1F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(neck3, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(head2, 0.4F, 0.2F, 0.0F);
        this.setRotateAngle(jaw2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(tail2, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail5, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(upperlegL, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegL, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(feetL, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(toesL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegR, 0.95F, 0.0F, 0.0F);
        this.setRotateAngle(feetR, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(toesR, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmL, -0.1F, 0.1F, -0.3F);
        this.setRotateAngle(lowerarmL, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(handL, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(thumbclawL, -0.5F, 0.0F, 0.0F);
        this.root.offsetY = -0.1F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = 0.25F;
        this.root.offsetX = -0.3F;
        this.root.rotateAngleY = (float)Math.toRadians(160);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 0.8F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(basin, -0.05F, -0.2F, 0.0F);
        this.setRotateAngle(body, 0.15F, 0.0F, 0.0F);
        this.setRotateAngle(chest, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.1F, 0.4F, 0.0F);
        this.setRotateAngle(neck2, -0.3F, 0.4F, 0.0F);
        this.setRotateAngle(neck3, -0.3F, 0.4F, 0.0F);
        this.setRotateAngle(head2, 0.4F, 0.4F, 0.0F);
        this.setRotateAngle(jaw2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, -0.2F, -1.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, -0.5F, 0.0F);
        this.setRotateAngle(tail4, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, -0.3F, 0.0F);
        this.setRotateAngle(upperlegL, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegL, 1.3F, 0.0F, 0.0F);
        this.setRotateAngle(feetL, -1.0F, 0.0F, 0.0F);
        this.setRotateAngle(toesL, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(upperlegR, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(lowerlegR, 0.95F, 0.0F, 0.0F);
        this.setRotateAngle(feetR, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(toesR, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(upperarmL, -0.1F, 0.1F, -0.3F);
        this.setRotateAngle(lowerarmL, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(handL, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(thumbclawL, -0.5F, 0.0F, 0.0F);
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
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraLufengosaurus entityLufengosaurus = (EntityPrehistoricFloraLufengosaurus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, neck4);
        this.faceTarget(f3, f4, 12, head2);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.head2};
        AdvancedModelRenderer[] ArmL = {this.upperarmL, this.lowerarmL};
        AdvancedModelRenderer[] ArmR = {this.upperarmR, this.lowerarmR};

        entityLufengosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityLufengosaurus.getAnimation() == entityLufengosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityLufengosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityLufengosaurus.getIsMoving()) {
                    if (entityLufengosaurus.getAnimation() != entityLufengosaurus.EAT_ANIMATION
                        && entityLufengosaurus.getAnimation() != entityLufengosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityLufengosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraLufengosaurus ee = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
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
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE2_ANIMATION) { //The noise anim
            animNoise2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animStand(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) { //The noise anim
            animScratch(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The noise anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 2 + (((tickAnim - 8) / 9) * (3.5-(2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 17) / 8) * (0-(3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2 + (((tickAnim - 8) / 9) * (-3.5-(-2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 17) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 8) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 8) / 11) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.31799-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.89559-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-7.19181-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.31799 + (((tickAnim - 8) / 10) * (-5.42139-(4.31799)));
            yy = 2.89559 + (((tickAnim - 8) / 10) * (0.89095-(2.89559)));
            zz = -7.19181 + (((tickAnim - 8) / 10) * (-2.21287-(-7.19181)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.42139 + (((tickAnim - 18) / 7) * (0-(-5.42139)));
            yy = 0.89095 + (((tickAnim - 18) / 7) * (0-(0.89095)));
            zz = -2.21287 + (((tickAnim - 18) / 7) * (0-(-2.21287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 8) / 10) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.75 + (((tickAnim - 18) / 7) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.25 + (((tickAnim - 8) / 6) * (7.74-(12.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 7.74 + (((tickAnim - 14) / 5) * (0-(7.74)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw2.rotationPointX = this.jaw2.rotationPointX + (float)(xx);
        this.jaw2.rotationPointY = this.jaw2.rotationPointY - (float)(yy);
        this.jaw2.rotationPointZ = this.jaw2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.5211 + (((tickAnim - 12) / 13) * (0-(-23.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.52111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.52111 + (((tickAnim - 12) / 13) * (0-(-23.52111)));
            yy = 11.24973 + (((tickAnim - 12) / 13) * (0-(11.24973)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 54;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = -1.5 + (((tickAnim - 7) / 8) * (1.39-(-1.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 1.39 + (((tickAnim - 15) / 4) * (0-(1.39)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (-1.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = -1.25 + (((tickAnim - 40) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (1.74-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            zz = 1.74 + (((tickAnim - 48) / 6) * (0-(1.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = -0.85 + (((tickAnim - 7) / 12) * (-1.95-(-0.85)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = -1.95 + (((tickAnim - 19) / 15) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = -1.95 + (((tickAnim - 34) / 20) * (0-(-1.95)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 9) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 27) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -3 + (((tickAnim - 7) / 6) * (0-(-3)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 3 + (((tickAnim - 18) / 9) * (0-(3)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -2.75 + (((tickAnim - 43) / 11) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -2.25 + (((tickAnim - 7) / 6) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 2.25 + (((tickAnim - 18) / 9) * (0-(2.25)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (1-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 43) / 11) * (0-(1)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 7.25 + (((tickAnim - 7) / 6) * (0-(7.25)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.75-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 8.75 + (((tickAnim - 18) / 4) * (2.37508-(8.75)));
            yy = 2.75 + (((tickAnim - 18) / 4) * (-0.87493-(2.75)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.01787-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 2.37508 + (((tickAnim - 22) / 5) * (0-(2.37508)));
            yy = -0.87493 + (((tickAnim - 22) / 5) * (0-(-0.87493)));
            zz = 0.01787 + (((tickAnim - 22) / 5) * (0-(0.01787)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (-2.61181-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (-1.24437-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0.11853-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -2.61181 + (((tickAnim - 34) / 9) * (-6.2-(-2.61181)));
            yy = -1.24437 + (((tickAnim - 34) / 9) * (0-(-1.24437)));
            zz = 0.11853 + (((tickAnim - 34) / 9) * (0-(0.11853)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -6.2 + (((tickAnim - 43) / 11) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.75827-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.95519-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-5.73585-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.75827 + (((tickAnim - 4) / 3) * (11.75-(-0.75827)));
            yy = -0.95519 + (((tickAnim - 4) / 3) * (-2.75-(-0.95519)));
            zz = -5.73585 + (((tickAnim - 4) / 3) * (0-(-5.73585)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 7) / 6) * (-6.01615-(11.75)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (-5.48971-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.3368-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.01615 + (((tickAnim - 13) / 5) * (13.25-(-6.01615)));
            yy = -5.48971 + (((tickAnim - 13) / 5) * (2.75-(-5.48971)));
            zz = 0.3368 + (((tickAnim - 13) / 5) * (0-(0.3368)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 13.25 + (((tickAnim - 18) / 4) * (2.05384-(13.25)));
            yy = 2.75 + (((tickAnim - 18) / 4) * (5.95541-(2.75)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.33728-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 2.05384 + (((tickAnim - 22) / 5) * (0-(2.05384)));
            yy = 5.95541 + (((tickAnim - 22) / 5) * (0-(5.95541)));
            zz = 0.33728 + (((tickAnim - 22) / 5) * (0-(0.33728)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (-5.8037-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (-3.24738-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0.13057-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -5.8037 + (((tickAnim - 34) / 9) * (-11.4-(-5.8037)));
            yy = -3.24738 + (((tickAnim - 34) / 9) * (0-(-3.24738)));
            zz = 0.13057 + (((tickAnim - 34) / 9) * (0-(0.13057)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -11.4 + (((tickAnim - 43) / 11) * (0-(-11.4)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (15.25-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 15.25 + (((tickAnim - 14) / 5) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 15.25 + (((tickAnim - 19) / 15) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (1-(0)));
            yy = 15.25 + (((tickAnim - 34) / 11) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 1 + (((tickAnim - 45) / 4) * (0-(1)));
            yy = 15.25 + (((tickAnim - 45) / 4) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            yy = 15.25 + (((tickAnim - 49) / 5) * (0-(15.25)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 10) / 4) * (2.85-(1.45)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 2.85 + (((tickAnim - 14) / 5) * (2-(2.85)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 2 + (((tickAnim - 19) / 15) * (2-(2)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 2 + (((tickAnim - 34) / 11) * (0.7-(2)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 0.7 + (((tickAnim - 45) / 4) * (2.135-(0.7)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            yy = 2.135 + (((tickAnim - 49) / 5) * (0-(2.135)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (20.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 20.5 + (((tickAnim - 14) / 5) * (0-(20.5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (1.5-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 1.5 + (((tickAnim - 45) / 4) * (21.75-(1.5)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 21.75 + (((tickAnim - 49) / 5) * (0-(21.75)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -11.25 + (((tickAnim - 14) / 5) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (1.5-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 1.5 + (((tickAnim - 45) / 4) * (-12-(1.5)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = -12 + (((tickAnim - 49) / 5) * (0-(-12)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (7.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 7.25 + (((tickAnim - 14) / 5) * (0-(7.25)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -5.25 + (((tickAnim - 45) / 4) * (7.25-(-5.25)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 7.25 + (((tickAnim - 49) / 5) * (0-(7.25)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 8.5 + (((tickAnim - 19) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 8.5 + (((tickAnim - 34) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 13.75 + (((tickAnim - 19) / 15) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 13.75 + (((tickAnim - 34) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -0.5 + (((tickAnim - 19) / 15) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = -0.5 + (((tickAnim - 34) / 20) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (17.11-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 17.11 + (((tickAnim - 11) / 8) * (28.25-(17.11)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 28.25 + (((tickAnim - 19) / 4) * (24.99999-(28.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.00109-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 24.99999 + (((tickAnim - 23) / 4) * (23.5-(24.99999)));
            yy = 0.00109 + (((tickAnim - 23) / 4) * (0-(0.00109)));
            zz = -1.25 + (((tickAnim - 23) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 23.5 + (((tickAnim - 27) / 4) * (26.99998-(23.5)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.00131-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (1.5-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 26.99998 + (((tickAnim - 31) / 3) * (19.5-(26.99998)));
            yy = -0.00131 + (((tickAnim - 31) / 3) * (0-(-0.00131)));
            zz = 1.5 + (((tickAnim - 31) / 3) * (0-(1.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 19.5 + (((tickAnim - 34) / 20) * (0-(19.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 15.5 + (((tickAnim - 19) / 4) * (11.34486-(15.5)));
            yy = 0 + (((tickAnim - 19) / 4) * (3.87261-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-4.58639-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 11.34486 + (((tickAnim - 23) / 4) * (20.5-(11.34486)));
            yy = 3.87261 + (((tickAnim - 23) / 4) * (0-(3.87261)));
            zz = -4.58639 + (((tickAnim - 23) / 4) * (0-(-4.58639)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 20.5 + (((tickAnim - 27) / 4) * (17.50741-(20.5)));
            yy = 0 + (((tickAnim - 27) / 4) * (-4.83785-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (5.7379-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 17.50741 + (((tickAnim - 31) / 3) * (15.5-(17.50741)));
            yy = -4.83785 + (((tickAnim - 31) / 3) * (0-(-4.83785)));
            zz = 5.7379 + (((tickAnim - 31) / 3) * (0-(5.7379)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 15.5 + (((tickAnim - 34) / 20) * (0-(15.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 8.75 + (((tickAnim - 19) / 4) * (14-(8.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 14 + (((tickAnim - 23) / 4) * (12-(14)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 12 + (((tickAnim - 27) / 4) * (19-(12)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 19 + (((tickAnim - 31) / 3) * (14.5-(19)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 14.5 + (((tickAnim - 34) / 20) * (0-(14.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (20.17-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20.17 + (((tickAnim - 23) / 4) * (0-(20.17)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (20.17-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 20.17 + (((tickAnim - 31) / 3) * (0-(20.17)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (1.38885-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (14.95942-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (11.75077-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 1.38885 + (((tickAnim - 19) / 15) * (1.38885-(1.38885)));
            yy = 14.95942 + (((tickAnim - 19) / 15) * (14.95942-(14.95942)));
            zz = 11.75077 + (((tickAnim - 19) / 15) * (11.75077-(11.75077)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 1.38885 + (((tickAnim - 34) / 20) * (0-(1.38885)));
            yy = 14.95942 + (((tickAnim - 34) / 20) * (0-(14.95942)));
            zz = 11.75077 + (((tickAnim - 34) / 20) * (0-(11.75077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = -5.75 + (((tickAnim - 19) / 15) * (-5.75-(-5.75)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = -5.75 + (((tickAnim - 34) / 20) * (0-(-5.75)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -13 + (((tickAnim - 5) / 7) * (-13.25-(-13)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = -13.25 + (((tickAnim - 12) / 22) * (-13.25-(-13.25)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -13.25 + (((tickAnim - 34) / 6) * (-16.33-(-13.25)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -16.33 + (((tickAnim - 40) / 6) * (0-(-16.33)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 2.3 + (((tickAnim - 5) / 7) * (0-(2.3)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (2.025-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 2.025 + (((tickAnim - 40) / 6) * (0.875-(2.025)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0.875 + (((tickAnim - 46) / 8) * (0-(0.875)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 23 + (((tickAnim - 5) / 7) * (10-(23)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 10 + (((tickAnim - 12) / 7) * (8.25-(10)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 8.25 + (((tickAnim - 19) / 15) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 8.25 + (((tickAnim - 34) / 6) * (26.17-(8.25)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 26.17 + (((tickAnim - 40) / 5) * (0-(26.17)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -20.5 + (((tickAnim - 5) / 7) * (-4.75-(-20.5)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -4.75 + (((tickAnim - 12) / 7) * (-14.75-(-4.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -14.75 + (((tickAnim - 19) / 15) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -14.75 + (((tickAnim - 34) / 6) * (-7.08-(-14.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -7.08 + (((tickAnim - 40) / 5) * (0-(-7.08)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 6.75 + (((tickAnim - 5) / 7) * (-3.75-(6.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -3.75 + (((tickAnim - 12) / 7) * (6.5-(-3.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 6.5 + (((tickAnim - 19) / 15) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 34) / 6) * (5.5-(6.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 5.5 + (((tickAnim - 40) / 5) * (0-(5.5)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));

        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(0);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(0);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(0);


    }
    public void animScratch(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 105;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = -11.5 + (((tickAnim - 20) / 54) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = -11.5 + (((tickAnim - 74) / 31) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 74) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-8.025-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            yy = -8.025 + (((tickAnim - 20) / 54) * (-8.025-(-8.025)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 74) / 31) * (0-(0)));
            yy = -8.025 + (((tickAnim - 74) / 31) * (0-(-8.025)));
            zz = 0 + (((tickAnim - 74) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = -3.75 + (((tickAnim - 20) / 54) * (-3.75-(-3.75)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = -3.75 + (((tickAnim - 74) / 31) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 74) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = -8.5 + (((tickAnim - 20) / 54) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = -8.5 + (((tickAnim - 74) / 31) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 74) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (6.06-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 6.06 + (((tickAnim - 9) / 6) * (-4.81-(6.06)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.81 + (((tickAnim - 15) / 5) * (8.25-(-4.81)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = 8.25 + (((tickAnim - 20) / 54) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 93) {
            xx = 8.25 + (((tickAnim - 74) / 19) * (0.09-(8.25)));
            yy = 0 + (((tickAnim - 74) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 19) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = 0.09 + (((tickAnim - 93) / 12) * (0-(0.09)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.44-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15.44 + (((tickAnim - 8) / 7) * (16.63-(15.44)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 16.63 + (((tickAnim - 15) / 2) * (25.25-(16.63)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 25.25 + (((tickAnim - 17) / 1) * (28.81-(25.25)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 28.81 + (((tickAnim - 18) / 2) * (23.71-(28.81)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 23.71 + (((tickAnim - 20) / 2) * (19.5-(23.71)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 74) {
            xx = 19.5 + (((tickAnim - 22) / 52) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 22) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 52) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 19.5 + (((tickAnim - 74) / 8) * (6.51-(19.5)));
            yy = 0 + (((tickAnim - 74) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 8) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 93) {
            xx = 6.51 + (((tickAnim - 82) / 11) * (-5.26-(6.51)));
            yy = 0 + (((tickAnim - 82) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 11) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = -5.26 + (((tickAnim - 93) / 12) * (0-(-5.26)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.83-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.83 + (((tickAnim - 8) / 7) * (30.09-(23.83)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 30.09 + (((tickAnim - 15) / 2) * (16.56-(30.09)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 16.56 + (((tickAnim - 17) / 1) * (10.42-(16.56)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.42 + (((tickAnim - 18) / 2) * (29.78-(10.42)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 29.78 + (((tickAnim - 20) / 2) * (22-(29.78)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 74) {
            xx = 22 + (((tickAnim - 22) / 52) * (22-(22)));
            yy = 0 + (((tickAnim - 22) / 52) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 52) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 82) {
            xx = 22 + (((tickAnim - 74) / 8) * (20.9-(22)));
            yy = 0 + (((tickAnim - 74) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 8) * (0-(0)));
        }
        else if (tickAnim >= 82 && tickAnim < 93) {
            xx = 20.9 + (((tickAnim - 82) / 11) * (6.7-(20.9)));
            yy = 0 + (((tickAnim - 82) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 82) / 11) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 6.7 + (((tickAnim - 93) / 6) * (-3.12-(6.7)));
            yy = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 6) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = -3.12 + (((tickAnim - 99) / 6) * (0-(-3.12)));
            yy = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (-30.6053-(0)));
            yy = 0 + (((tickAnim - 15) / 6) * (14.85972-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (3.1215-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = -30.6053 + (((tickAnim - 21) / 6) * (-24.1053-(-30.6053)));
            yy = 14.85972 + (((tickAnim - 21) / 6) * (14.85972-(14.85972)));
            zz = 3.1215 + (((tickAnim - 21) / 6) * (3.1215-(3.1215)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = -24.1053 + (((tickAnim - 27) / 48) * (-24.1053-(-24.1053)));
            yy = 14.85972 + (((tickAnim - 27) / 48) * (14.85972-(14.85972)));
            zz = 3.1215 + (((tickAnim - 27) / 48) * (3.1215-(3.1215)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = -24.1053 + (((tickAnim - 75) / 18) * (-21.99913-(-24.1053)));
            yy = 14.85972 + (((tickAnim - 75) / 18) * (14.79945-(14.85972)));
            zz = 3.1215 + (((tickAnim - 75) / 18) * (1.3249-(3.1215)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = -21.99913 + (((tickAnim - 93) / 12) * (0-(-21.99913)));
            yy = 14.79945 + (((tickAnim - 93) / 12) * (0-(14.79945)));
            zz = 1.3249 + (((tickAnim - 93) / 12) * (0-(1.3249)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.75 + (((tickAnim - 8) / 7) * (1.75-(1.75)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 1.75 + (((tickAnim - 15) / 6) * (2.805-(1.75)));
            zz = 0 + (((tickAnim - 15) / 6) * (4.03-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 2.805 + (((tickAnim - 21) / 6) * (2.805-(2.805)));
            zz = 4.03 + (((tickAnim - 21) / 6) * (4.03-(4.03)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            yy = 2.805 + (((tickAnim - 27) / 48) * (2.805-(2.805)));
            zz = 4.03 + (((tickAnim - 27) / 48) * (4.03-(4.03)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            yy = 2.805 + (((tickAnim - 75) / 18) * (-1.49-(2.805)));
            zz = 4.03 + (((tickAnim - 75) / 18) * (3.085-(4.03)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            yy = -1.49 + (((tickAnim - 93) / 6) * (2.435-(-1.49)));
            zz = 3.085 + (((tickAnim - 93) / 6) * (1.42-(3.085)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            yy = 2.435 + (((tickAnim - 99) / 6) * (0-(2.435)));
            zz = 1.42 + (((tickAnim - 99) / 6) * (0-(1.42)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 7.75 + (((tickAnim - 8) / 7) * (11-(7.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 11 + (((tickAnim - 15) / 6) * (18-(11)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 18 + (((tickAnim - 21) / 6) * (8.5-(18)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 8.5 + (((tickAnim - 27) / 48) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 48) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 8.5 + (((tickAnim - 75) / 18) * (4.07-(8.5)));
            yy = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 18) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 4.07 + (((tickAnim - 93) / 6) * (17.38-(4.07)));
            yy = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 6) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = 17.38 + (((tickAnim - 99) / 6) * (0-(17.38)));
            yy = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-1.125-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 12) * (0-(0)));
            zz = -1.125 + (((tickAnim - 15) / 12) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            zz = -1.125 + (((tickAnim - 27) / 48) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = -1.125 + (((tickAnim - 75) / 30) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (20.75-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 20.75 + (((tickAnim - 15) / 6) * (0.75-(20.75)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0.75 + (((tickAnim - 21) / 6) * (23.75-(0.75)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 23.75 + (((tickAnim - 27) / 48) * (23.75-(23.75)));
            yy = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 48) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 99) {
            xx = 23.75 + (((tickAnim - 75) / 24) * (-11.79-(23.75)));
            yy = 0 + (((tickAnim - 75) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 24) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = -11.79 + (((tickAnim - 99) / 6) * (0-(-11.79)));
            yy = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (2.1-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 2.1 + (((tickAnim - 15) / 6) * (0-(2.1)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 21) / 72) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 72) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 72) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetR.rotationPointX = this.feetR.rotationPointX + (float)(xx);
        this.feetR.rotationPointY = this.feetR.rotationPointY - (float)(yy);
        this.feetR.rotationPointZ = this.feetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-21.25-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = -21.25 + (((tickAnim - 15) / 6) * (2.75-(-21.25)));
            yy = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 2.75 + (((tickAnim - 21) / 6) * (2.32-(2.75)));
            yy = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 6) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 2.32 + (((tickAnim - 27) / 48) * (2.32-(2.32)));
            yy = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 48) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 2.32 + (((tickAnim - 75) / 18) * (28.74-(2.32)));
            yy = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 18) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 28.74 + (((tickAnim - 93) / 6) * (27.36-(28.74)));
            yy = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 6) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = 27.36 + (((tickAnim - 99) / 6) * (0-(27.36)));
            yy = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0.875-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.675-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0.875 + (((tickAnim - 15) / 6) * (0.84-(0.875)));
            zz = 0.675 + (((tickAnim - 15) / 6) * (0.37-(0.675)));
        }
        else if (tickAnim >= 21 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 21) / 6) * (0-(0)));
            yy = 0.84 + (((tickAnim - 21) / 6) * (1.905-(0.84)));
            zz = 0.37 + (((tickAnim - 21) / 6) * (0.055-(0.37)));
        }
        else if (tickAnim >= 27 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 27) / 48) * (0-(0)));
            yy = 1.905 + (((tickAnim - 27) / 48) * (1.905-(1.905)));
            zz = 0.055 + (((tickAnim - 27) / 48) * (0.055-(0.055)));
        }
        else if (tickAnim >= 75 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 75) / 18) * (0-(0)));
            yy = 1.905 + (((tickAnim - 75) / 18) * (0.9-(1.905)));
            zz = 0.055 + (((tickAnim - 75) / 18) * (-0.525-(0.055)));
        }
        else if (tickAnim >= 93 && tickAnim < 99) {
            xx = 0 + (((tickAnim - 93) / 6) * (0-(0)));
            yy = 0.9 + (((tickAnim - 93) / 6) * (1.125-(0.9)));
            zz = -0.525 + (((tickAnim - 93) / 6) * (-0.24-(-0.525)));
        }
        else if (tickAnim >= 99 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 99) / 6) * (0-(0)));
            yy = 1.125 + (((tickAnim - 99) / 6) * (0-(1.125)));
            zz = -0.24 + (((tickAnim - 99) / 6) * (0-(-0.24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 74) {
            xx = 9.25 + (((tickAnim - 20) / 54) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 20) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 54) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = 9.25 + (((tickAnim - 74) / 31) * (0-(9.25)));
            yy = 0 + (((tickAnim - 74) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.5-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 18) / 37) * (21.62059-(0)));
            yy = -7.5 + (((tickAnim - 18) / 37) * (-10.92842-(-7.5)));
            zz = 0 + (((tickAnim - 18) / 37) * (-1.26056-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 74) {
            xx = 21.62059 + (((tickAnim - 55) / 19) * (21.62059-(21.62059)));
            yy = -10.92842 + (((tickAnim - 55) / 19) * (-10.92842-(-10.92842)));
            zz = -1.26056 + (((tickAnim - 55) / 19) * (-1.26056-(-1.26056)));
        }
        else if (tickAnim >= 74 && tickAnim < 105) {
            xx = 21.62059 + (((tickAnim - 74) / 31) * (0-(21.62059)));
            yy = -10.92842 + (((tickAnim - 74) / 31) * (0-(-10.92842)));
            zz = -1.26056 + (((tickAnim - 74) / 31) * (0-(-1.26056)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (1.16963-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-7.82758-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.12302-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 1.16963 + (((tickAnim - 18) / 37) * (26.92614-(1.16963)));
            yy = -7.82758 + (((tickAnim - 18) / 37) * (-12.60069-(-7.82758)));
            zz = 1.12302 + (((tickAnim - 18) / 37) * (-0.73313-(1.12302)));
        }
        else if (tickAnim >= 55 && tickAnim < 74) {
            xx = 26.92614 + (((tickAnim - 55) / 19) * (26.92614-(26.92614)));
            yy = -12.60069 + (((tickAnim - 55) / 19) * (-12.60069-(-12.60069)));
            zz = -0.73313 + (((tickAnim - 55) / 19) * (-0.73313-(-0.73313)));
        }
        else if (tickAnim >= 74 && tickAnim < 92) {
            xx = 26.92614 + (((tickAnim - 74) / 18) * (13.82135-(26.92614)));
            yy = -12.60069 + (((tickAnim - 74) / 18) * (3.77665-(-12.60069)));
            zz = -0.73313 + (((tickAnim - 74) / 18) * (-0.13986-(-0.73313)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = 13.82135 + (((tickAnim - 92) / 4) * (13.82135-(13.82135)));
            yy = 3.77665 + (((tickAnim - 92) / 4) * (3.77665-(3.77665)));
            zz = -0.13986 + (((tickAnim - 92) / 4) * (-0.13986-(-0.13986)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 13.82135 + (((tickAnim - 96) / 9) * (0-(13.82135)));
            yy = 3.77665 + (((tickAnim - 96) / 9) * (0-(3.77665)));
            zz = -0.13986 + (((tickAnim - 96) / 9) * (0-(-0.13986)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (2.04903-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-19.39592-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-6.07395-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = 2.04903 + (((tickAnim - 18) / 37) * (9.59509-(2.04903)));
            yy = -19.39592 + (((tickAnim - 18) / 37) * (-19.19205-(-19.39592)));
            zz = -6.07395 + (((tickAnim - 18) / 37) * (-3.5188-(-6.07395)));
        }
        else if (tickAnim >= 55 && tickAnim < 74) {
            xx = 9.59509 + (((tickAnim - 55) / 19) * (9.59509-(9.59509)));
            yy = -19.19205 + (((tickAnim - 55) / 19) * (-19.19205-(-19.19205)));
            zz = -3.5188 + (((tickAnim - 55) / 19) * (-3.5188-(-3.5188)));
        }
        else if (tickAnim >= 74 && tickAnim < 92) {
            xx = 9.59509 + (((tickAnim - 74) / 18) * (4.7924-(9.59509)));
            yy = -19.19205 + (((tickAnim - 74) / 18) * (2.95423-(-19.19205)));
            zz = -3.5188 + (((tickAnim - 74) / 18) * (0.41854-(-3.5188)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = 4.7924 + (((tickAnim - 92) / 4) * (-0.2076-(4.7924)));
            yy = 2.95423 + (((tickAnim - 92) / 4) * (2.95423-(2.95423)));
            zz = 0.41854 + (((tickAnim - 92) / 4) * (0.41854-(0.41854)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = -0.2076 + (((tickAnim - 96) / 9) * (0-(-0.2076)));
            yy = 2.95423 + (((tickAnim - 96) / 9) * (0-(2.95423)));
            zz = 0.41854 + (((tickAnim - 96) / 9) * (0-(0.41854)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-19-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 55) {
            xx = -15 + (((tickAnim - 18) / 37) * (0-(-15)));
            yy = -19 + (((tickAnim - 18) / 37) * (-22-(-19)));
            zz = 0 + (((tickAnim - 18) / 37) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 55) / 19) * (0-(0)));
            yy = -22 + (((tickAnim - 55) / 19) * (-22-(-22)));
            zz = 0 + (((tickAnim - 55) / 19) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 74) / 18) * (-15.25-(0)));
            yy = -22 + (((tickAnim - 74) / 18) * (12.2-(-22)));
            zz = 0 + (((tickAnim - 74) / 18) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = -15.25 + (((tickAnim - 92) / 4) * (-14.25-(-15.25)));
            yy = 12.2 + (((tickAnim - 92) / 4) * (12.2-(12.2)));
            zz = 0 + (((tickAnim - 92) / 4) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = -14.25 + (((tickAnim - 96) / 9) * (0-(-14.25)));
            yy = 12.2 + (((tickAnim - 96) / 9) * (0-(12.2)));
            zz = 0 + (((tickAnim - 96) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0.3271-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0.69384-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.65451-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0.3271 + (((tickAnim - 18) / 25) * (2.15-(0.3271)));
            yy = 0.69384 + (((tickAnim - 18) / 25) * (0-(0.69384)));
            zz = -0.65451 + (((tickAnim - 18) / 25) * (0-(-0.65451)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 2.15 + (((tickAnim - 43) / 12) * (0-(2.15)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 72) / 20) * (1.34151-(0)));
            yy = 0 + (((tickAnim - 72) / 20) * (10.97264-(0)));
            zz = 0 + (((tickAnim - 72) / 20) * (4.48598-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = 1.34151 + (((tickAnim - 92) / 4) * (1.34151-(1.34151)));
            yy = 10.97264 + (((tickAnim - 92) / 4) * (10.97264-(10.97264)));
            zz = 4.48598 + (((tickAnim - 92) / 4) * (4.48598-(4.48598)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 1.34151 + (((tickAnim - 96) / 9) * (0-(1.34151)));
            yy = 10.97264 + (((tickAnim - 96) / 9) * (0-(10.97264)));
            zz = 4.48598 + (((tickAnim - 96) / 9) * (0-(4.48598)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(xx), head2.rotateAngleY + (float) Math.toRadians(yy), head2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.175-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 25) * (0-(0)));
            zz = -0.175 + (((tickAnim - 18) / 25) * (0-(-0.175)));
        }
        else if (tickAnim >= 43 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 12) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 17) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 92) {
            xx = 0 + (((tickAnim - 72) / 20) * (0.375-(0)));
            yy = 0 + (((tickAnim - 72) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 20) * (-0.3-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 96) {
            xx = 0.375 + (((tickAnim - 92) / 4) * (0.375-(0.375)));
            yy = 0 + (((tickAnim - 92) / 4) * (0-(0)));
            zz = -0.3 + (((tickAnim - 92) / 4) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 96 && tickAnim < 105) {
            xx = 0.375 + (((tickAnim - 96) / 9) * (0-(0.375)));
            yy = 0 + (((tickAnim - 96) / 9) * (0-(0)));
            zz = -0.3 + (((tickAnim - 96) / 9) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head2.rotationPointX = this.head2.rotationPointX + (float)(xx);
        this.head2.rotationPointY = this.head2.rotationPointY - (float)(yy);
        this.head2.rotationPointZ = this.head2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-28.20291-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-18.69174-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-7.84393-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 75) {
            xx = -28.20291 + (((tickAnim - 15) / 60) * (-28.20291-(-28.20291)));
            yy = -18.69174 + (((tickAnim - 15) / 60) * (-18.69174-(-18.69174)));
            zz = -7.84393 + (((tickAnim - 15) / 60) * (-7.84393-(-7.84393)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = -28.20291 + (((tickAnim - 75) / 9) * (-49.75-(-28.20291)));
            yy = -18.69174 + (((tickAnim - 75) / 9) * (0-(-18.69174)));
            zz = -7.84393 + (((tickAnim - 75) / 9) * (0-(-7.84393)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = -49.75 + (((tickAnim - 84) / 10) * (0-(-49.75)));
            yy = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 10) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.965-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.965 + (((tickAnim - 8) / 7) * (2.875-(2.965)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 15) / 60) * (0-(0)));
            yy = 2.875 + (((tickAnim - 15) / 60) * (2.875-(2.875)));
            zz = 0 + (((tickAnim - 15) / 60) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            yy = 2.875 + (((tickAnim - 75) / 9) * (2-(2.875)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            yy = 2 + (((tickAnim - 84) / 10) * (1.95-(2)));
            zz = 0 + (((tickAnim - 84) / 10) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 1.95 + (((tickAnim - 94) / 11) * (0-(1.95)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 12.13 + (((tickAnim - 8) / 7) * (15.25-(12.13)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 15.25 + (((tickAnim - 15) / 5) * (19.5-(15.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 75) {
            xx = 19.5 + (((tickAnim - 20) / 55) * (19.5-(19.5)));
            yy = 0 + (((tickAnim - 20) / 55) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 55) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 19.5 + (((tickAnim - 75) / 9) * (40.92-(19.5)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = 40.92 + (((tickAnim - 84) / 10) * (4.75-(40.92)));
            yy = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 10) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 4.75 + (((tickAnim - 94) / 11) * (0-(4.75)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.175-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.025 + (((tickAnim - 15) / 5) * (0.42-(-0.025)));
            zz = 2.175 + (((tickAnim - 15) / 5) * (0.595-(2.175)));
        }
        else if (tickAnim >= 20 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 20) / 55) * (0-(0)));
            yy = 0.42 + (((tickAnim - 20) / 55) * (0.42-(0.42)));
            zz = 0.595 + (((tickAnim - 20) / 55) * (0.595-(0.595)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            yy = 0.42 + (((tickAnim - 75) / 9) * (0.33-(0.42)));
            zz = 0.595 + (((tickAnim - 75) / 9) * (1.835-(0.595)));
        }
        else if (tickAnim >= 84 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 84) / 10) * (0-(0)));
            yy = 0.33 + (((tickAnim - 84) / 10) * (0-(0.33)));
            zz = 1.835 + (((tickAnim - 84) / 10) * (0-(1.835)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 75) {
            xx = 17 + (((tickAnim - 15) / 60) * (17-(17)));
            yy = 0 + (((tickAnim - 15) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 60) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 84) {
            xx = 17 + (((tickAnim - 75) / 9) * (31.22-(17)));
            yy = 0 + (((tickAnim - 75) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 9) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 90) {
            xx = 31.22 + (((tickAnim - 84) / 6) * (23.06-(31.22)));
            yy = 0 + (((tickAnim - 84) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 6) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 94) {
            xx = 23.06 + (((tickAnim - 90) / 4) * (0-(23.06)));
            yy = 0 + (((tickAnim - 90) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 4) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetL.rotationPointX = this.feetL.rotationPointX + (float)(xx);
        this.feetL.rotationPointY = this.feetL.rotationPointY - (float)(yy);
        this.feetL.rotationPointZ = this.feetL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.06669-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.45422-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.6251-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -9.06669 + (((tickAnim - 8) / 7) * (6.86662-(-9.06669)));
            yy = -1.45422 + (((tickAnim - 8) / 7) * (-2.90845-(-1.45422)));
            zz = 2.6251 + (((tickAnim - 8) / 7) * (5.2502-(2.6251)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.86662 + (((tickAnim - 15) / 5) * (5.36662-(6.86662)));
            yy = -2.90845 + (((tickAnim - 15) / 5) * (-2.90845-(-2.90845)));
            zz = 5.2502 + (((tickAnim - 15) / 5) * (5.2502-(5.2502)));
        }
        else if (tickAnim >= 20 && tickAnim < 75) {
            xx = 5.36662 + (((tickAnim - 20) / 55) * (5.36662-(5.36662)));
            yy = -2.90845 + (((tickAnim - 20) / 55) * (-2.90845-(-2.90845)));
            zz = 5.2502 + (((tickAnim - 20) / 55) * (5.2502-(5.2502)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 5.36662 + (((tickAnim - 75) / 15) * (-17.5-(5.36662)));
            yy = -2.90845 + (((tickAnim - 75) / 15) * (0-(-2.90845)));
            zz = 5.2502 + (((tickAnim - 75) / 15) * (0-(5.2502)));
        }
        else if (tickAnim >= 90 && tickAnim < 94) {
            xx = -17.5 + (((tickAnim - 90) / 4) * (0.56-(-17.5)));
            yy = 0 + (((tickAnim - 90) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 4) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 98) {
            xx = 0.56 + (((tickAnim - 94) / 4) * (0-(0.56)));
            yy = 0 + (((tickAnim - 94) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 4) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 98) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 98) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 1.175 + (((tickAnim - 15) / 5) * (0.855-(1.175)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 20) / 55) * (0-(0)));
            yy = 0.855 + (((tickAnim - 20) / 55) * (0.855-(0.855)));
            zz = 0 + (((tickAnim - 20) / 55) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0.855 + (((tickAnim - 75) / 15) * (0.715-(0.855)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 90) / 4) * (0-(0)));
            yy = 0.715 + (((tickAnim - 90) / 4) * (0.21-(0.715)));
            zz = 0 + (((tickAnim - 90) / 4) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 94) / 11) * (0-(0)));
            yy = 0.21 + (((tickAnim - 94) / 11) * (0-(0.21)));
            zz = 0 + (((tickAnim - 94) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(xx);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(yy);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (-55-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = -55 + (((tickAnim - 38) / 17) * (-123.30999-(-55)));
            yy = 0 + (((tickAnim - 38) / 17) * (-6.46524-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (-1.94183-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -123.30999 + (((tickAnim - 55) / 5) * (-123.37979-(-123.30999)));
            yy = -6.46524 + (((tickAnim - 55) / 5) * (-2.86952-(-6.46524)));
            zz = -1.94183 + (((tickAnim - 55) / 5) * (-13.91567-(-1.94183)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -123.37979 + (((tickAnim - 60) / 5) * (-123.30999-(-123.37979)));
            yy = -2.86952 + (((tickAnim - 60) / 5) * (-6.46524-(-2.86952)));
            zz = -13.91567 + (((tickAnim - 60) / 5) * (-1.94183-(-13.91567)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = -123.30999 + (((tickAnim - 65) / 5) * (-123.37979-(-123.30999)));
            yy = -6.46524 + (((tickAnim - 65) / 5) * (-2.86952-(-6.46524)));
            zz = -1.94183 + (((tickAnim - 65) / 5) * (-13.91567-(-1.94183)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -123.37979 + (((tickAnim - 70) / 5) * (-123.30999-(-123.37979)));
            yy = -2.86952 + (((tickAnim - 70) / 5) * (-6.46524-(-2.86952)));
            zz = -13.91567 + (((tickAnim - 70) / 5) * (-1.94183-(-13.91567)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = -123.30999 + (((tickAnim - 75) / 30) * (0-(-123.30999)));
            yy = -6.46524 + (((tickAnim - 75) / 30) * (0-(-6.46524)));
            zz = -1.94183 + (((tickAnim - 75) / 30) * (0-(-1.94183)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -12.25 + (((tickAnim - 60) / 5) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (-12.25-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = -12.25 + (((tickAnim - 70) / 5) * (0-(-12.25)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 6) * (4.5-(0)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 4.5 + (((tickAnim - 55) / 5) * (-15-(4.5)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            yy = -15 + (((tickAnim - 60) / 5) * (0-(-15)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (-15-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            yy = -15 + (((tickAnim - 70) / 5) * (0-(-15)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 49 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 6) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (-31-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = -31 + (((tickAnim - 60) / 5) * (0-(-31)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (-31-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 75) {
            xx = -31 + (((tickAnim - 70) / 5) * (0-(-31)));
            yy = 0 + (((tickAnim - 70) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclawL, thumbclawL.rotateAngleX + (float) Math.toRadians(xx), thumbclawL.rotateAngleY + (float) Math.toRadians(yy), thumbclawL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = -1.5 + (((tickAnim - 7) / 10) * (1.39-(-1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 1.39 + (((tickAnim - 17) / 3) * (0-(1.39)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (-1.25-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = -1.25 + (((tickAnim - 44) / 5) * (0-(-1.25)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (1.74-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 1.74 + (((tickAnim - 53) / 7) * (0-(1.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.85 + (((tickAnim - 7) / 13) * (-1.95-(-0.85)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = -1.95 + (((tickAnim - 20) / 19) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = -1.95 + (((tickAnim - 39) / 21) * (0-(-1.95)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 11) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -3 + (((tickAnim - 7) / 6) * (0-(-3)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 3 + (((tickAnim - 18) / 11) * (0-(3)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 48) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -2.25 + (((tickAnim - 7) / 6) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 2.25 + (((tickAnim - 18) / 11) * (0-(2.25)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (1-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 48) / 12) * (0-(1)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 7) / 6) * (0-(4.75)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.75-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 4.75 + (((tickAnim - 18) / 6) * (2.37508-(4.75)));
            yy = 2.75 + (((tickAnim - 18) / 6) * (-0.87493-(2.75)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.01787-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 2.37508 + (((tickAnim - 24) / 5) * (0-(2.37508)));
            yy = -0.87493 + (((tickAnim - 24) / 5) * (0-(-0.87493)));
            zz = 0.01787 + (((tickAnim - 24) / 5) * (0-(0.01787)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-2.61181-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-1.24437-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0.11853-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -2.61181 + (((tickAnim - 39) / 9) * (-6.2-(-2.61181)));
            yy = -1.24437 + (((tickAnim - 39) / 9) * (0-(-1.24437)));
            zz = 0.11853 + (((tickAnim - 39) / 9) * (0-(0.11853)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -6.2 + (((tickAnim - 48) / 12) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.75827-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.95519-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-5.73585-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.75827 + (((tickAnim - 4) / 3) * (3.25-(-0.75827)));
            yy = -0.95519 + (((tickAnim - 4) / 3) * (-2.75-(-0.95519)));
            zz = -5.73585 + (((tickAnim - 4) / 3) * (0-(-5.73585)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 7) / 6) * (-6.01615-(3.25)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (-5.48971-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.3368-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.01615 + (((tickAnim - 13) / 5) * (3.25-(-6.01615)));
            yy = -5.48971 + (((tickAnim - 13) / 5) * (2.75-(-5.48971)));
            zz = 0.3368 + (((tickAnim - 13) / 5) * (0-(0.3368)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 3.25 + (((tickAnim - 18) / 6) * (2.05384-(3.25)));
            yy = 2.75 + (((tickAnim - 18) / 6) * (5.95541-(2.75)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.33728-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 2.05384 + (((tickAnim - 24) / 5) * (0-(2.05384)));
            yy = 5.95541 + (((tickAnim - 24) / 5) * (0-(5.95541)));
            zz = 0.33728 + (((tickAnim - 24) / 5) * (0-(0.33728)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-5.8037-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-3.24738-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0.13057-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -5.8037 + (((tickAnim - 39) / 9) * (-11.4-(-5.8037)));
            yy = -3.24738 + (((tickAnim - 39) / 9) * (0-(-3.24738)));
            zz = 0.13057 + (((tickAnim - 39) / 9) * (0-(0.13057)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -11.4 + (((tickAnim - 48) / 12) * (0-(-11.4)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (15.25-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 15.25 + (((tickAnim - 16) / 4) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 15.25 + (((tickAnim - 20) / 19) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (4.5-(0)));
            yy = 15.25 + (((tickAnim - 39) / 11) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 4.5 + (((tickAnim - 50) / 4) * (0-(4.5)));
            yy = 15.25 + (((tickAnim - 50) / 4) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 15.25 + (((tickAnim - 54) / 6) * (0-(15.25)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 1.45 + (((tickAnim - 11) / 5) * (2.95-(1.45)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 2.95 + (((tickAnim - 16) / 4) * (1.95-(2.95)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 1.95 + (((tickAnim - 20) / 19) * (1.95-(1.95)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 1.95 + (((tickAnim - 39) / 11) * (1.3-(1.95)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 50) / 4) * (2.135-(1.3)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 2.135 + (((tickAnim - 54) / 6) * (0-(2.135)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 8.5 + (((tickAnim - 20) / 19) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 8.5 + (((tickAnim - 39) / 21) * (0-(8.5)));
            yy = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = 13.75 + (((tickAnim - 20) / 22) * (4.1-(13.75)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 4.1 + (((tickAnim - 42) / 18) * (0-(4.1)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 6.25 + (((tickAnim - 20) / 7) * (10.75-(6.25)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 10.75 + (((tickAnim - 27) / 15) * (-16.75-(10.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -16.75 + (((tickAnim - 42) / 18) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.61-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 8.61 + (((tickAnim - 12) / 8) * (19-(8.61)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 19 + (((tickAnim - 20) / 7) * (20.75-(19)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 20.75 + (((tickAnim - 27) / 15) * (-0.25002-(20.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (-0.00131-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (1.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -0.25002 + (((tickAnim - 42) / 10) * (9.5-(-0.25002)));
            yy = -0.00131 + (((tickAnim - 42) / 10) * (0-(-0.00131)));
            zz = 1.5 + (((tickAnim - 42) / 10) * (0-(1.5)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 9.5 + (((tickAnim - 52) / 8) * (0-(9.5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 16 + (((tickAnim - 20) / 7) * (13.5-(16)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 13.5 + (((tickAnim - 27) / 15) * (-10.5-(13.5)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -10.5 + (((tickAnim - 42) / 18) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = 14 + (((tickAnim - 20) / 22) * (-10-(14)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 51) {
            xx = -10 + (((tickAnim - 42) / 9) * (2.5-(-10)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 2.5 + (((tickAnim - 51) / 9) * (0-(2.5)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (21-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 21 + (((tickAnim - 15) / 5) * (3.25-(21)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 3.25 + (((tickAnim - 20) / 19) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 39) / 11) * (-2.25-(3.25)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -2.25 + (((tickAnim - 50) / 4) * (19.5-(-2.25)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 19.5 + (((tickAnim - 54) / 6) * (0-(19.5)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -20.5 + (((tickAnim - 15) / 5) * (13.25-(-20.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 13.25 + (((tickAnim - 20) / 19) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 39) / 11) * (5.5-(13.25)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 5.5 + (((tickAnim - 50) / 4) * (-19.37-(5.5)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -19.37 + (((tickAnim - 54) / 6) * (0-(-19.37)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (7.5-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 15) / 5) * (-14.5-(7.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -14.5 + (((tickAnim - 20) / 19) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 39) / 11) * (-5.25-(-14.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -5.25 + (((tickAnim - 50) / 4) * (11.87-(-5.25)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 11.87 + (((tickAnim - 54) / 6) * (0-(11.87)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = -0.2 + (((tickAnim - 11) / 4) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0.4-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0.4 + (((tickAnim - 20) / 19) * (0.4-(0.4)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = 0.4 + (((tickAnim - 39) / 21) * (0-(0.4)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (20.17-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 20.17 + (((tickAnim - 27) / 11) * (0-(20.17)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (1.38885-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-14.9594-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-11.7508-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 1.38885 + (((tickAnim - 19) / 19) * (1.38885-(1.38885)));
            yy = -14.9594 + (((tickAnim - 19) / 19) * (-14.9594-(-14.9594)));
            zz = -11.7508 + (((tickAnim - 19) / 19) * (-11.7508-(-11.7508)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 1.38885 + (((tickAnim - 38) / 22) * (0-(1.38885)));
            yy = -14.9594 + (((tickAnim - 38) / 22) * (0-(-14.9594)));
            zz = -11.7508 + (((tickAnim - 38) / 22) * (0-(-11.7508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (5.75-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 19) / 19) * (0-(0)));
            yy = 5.75 + (((tickAnim - 19) / 19) * (5.75-(5.75)));
            zz = 0 + (((tickAnim - 19) / 19) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 5.75 + (((tickAnim - 38) / 22) * (0-(5.75)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (13.75-(0)));
            yy = -13 + (((tickAnim - 5) / 8) * (-13.25-(-13)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 13.75 + (((tickAnim - 13) / 7) * (13.75-(13.75)));
            yy = -13.25 + (((tickAnim - 13) / 7) * (-13.25-(-13.25)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 13.75 + (((tickAnim - 20) / 19) * (13.75-(13.75)));
            yy = -13.25 + (((tickAnim - 20) / 19) * (-13.25-(-13.25)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 13.75 + (((tickAnim - 39) / 5) * (0-(13.75)));
            yy = -13.25 + (((tickAnim - 39) / 5) * (-16.33-(-13.25)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            yy = -16.33 + (((tickAnim - 44) / 7) * (0-(-16.33)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 2.3 + (((tickAnim - 5) / 8) * (-0.35-(2.3)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.35 + (((tickAnim - 13) / 7) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (2.025-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            yy = 2.025 + (((tickAnim - 44) / 7) * (1.2-(2.025)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 1.2 + (((tickAnim - 51) / 9) * (0-(1.2)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 18.5 + (((tickAnim - 5) / 8) * (4.5-(18.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 4.5 + (((tickAnim - 13) / 7) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 4.5 + (((tickAnim - 20) / 19) * (4.5-(4.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 4.5 + (((tickAnim - 39) / 5) * (25.92-(4.5)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 25.92 + (((tickAnim - 44) / 6) * (0-(25.92)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -14.25 + (((tickAnim - 5) / 8) * (-14.75-(-14.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -14.75 + (((tickAnim - 13) / 7) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -14.75 + (((tickAnim - 20) / 19) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -14.75 + (((tickAnim - 39) / 5) * (-14.62376-(-14.75)));
            yy = 0 + (((tickAnim - 39) / 5) * (0.16876-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (-0.52028-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -14.62376 + (((tickAnim - 44) / 6) * (0-(-14.62376)));
            yy = 0.16876 + (((tickAnim - 44) / 6) * (0-(0.16876)));
            zz = -0.52028 + (((tickAnim - 44) / 6) * (0-(-0.52028)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 5.75 + (((tickAnim - 5) / 8) * (-2.75-(5.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -2.75 + (((tickAnim - 13) / 7) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -2.75 + (((tickAnim - 20) / 19) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -2.75 + (((tickAnim - 39) / 5) * (4.25-(-2.75)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 4.25 + (((tickAnim - 44) / 6) * (0-(4.25)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));

        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(0);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(0);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(0);


    }
    public void animStand(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 162;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -11 + (((tickAnim - 40) / 36) * (-11-(-11)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = -11 + (((tickAnim - 76) / 29) * (-5.721-(-11)));
            yy = 0 + (((tickAnim - 76) / 29) * (-2.72102-(0)));
            zz = 0 + (((tickAnim - 76) / 29) * (0.3983-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -5.721 + (((tickAnim - 105) / 29) * (-5.721-(-5.721)));
            yy = -2.72102 + (((tickAnim - 105) / 29) * (-2.72102-(-2.72102)));
            zz = 0.3983 + (((tickAnim - 105) / 29) * (0.3983-(0.3983)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -5.721 + (((tickAnim - 134) / 29) * (0-(-5.721)));
            yy = -2.72102 + (((tickAnim - 134) / 29) * (0-(-2.72102)));
            zz = 0.3983 + (((tickAnim - 134) / 29) * (0-(0.3983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4.21871-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (4.46861-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.53233-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -4.21871 + (((tickAnim - 23) / 9) * (-9.35411-(-4.21871)));
            yy = 4.46861 + (((tickAnim - 23) / 9) * (6.28915-(4.46861)));
            zz = -0.53233 + (((tickAnim - 23) / 9) * (-0.74921-(-0.53233)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -9.35411 + (((tickAnim - 32) / 8) * (-11.06572-(-9.35411)));
            yy = 6.28915 + (((tickAnim - 32) / 8) * (7.94419-(6.28915)));
            zz = -0.74921 + (((tickAnim - 32) / 8) * (-0.94637-(-0.74921)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -11.06572 + (((tickAnim - 40) / 36) * (-11.06572-(-11.06572)));
            yy = 7.94419 + (((tickAnim - 40) / 36) * (7.94419-(7.94419)));
            zz = -0.94637 + (((tickAnim - 40) / 36) * (-0.94637-(-0.94637)));
        }
        else if (tickAnim >= 76 && tickAnim < 108) {
            xx = -11.06572 + (((tickAnim - 76) / 32) * (-12.72668-(-11.06572)));
            yy = 7.94419 + (((tickAnim - 76) / 32) * (-6.05647-(7.94419)));
            zz = -0.94637 + (((tickAnim - 76) / 32) * (-2.31763-(-0.94637)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -12.72668 + (((tickAnim - 108) / 26) * (-12.72668-(-12.72668)));
            yy = -6.05647 + (((tickAnim - 108) / 26) * (-6.05647-(-6.05647)));
            zz = -2.31763 + (((tickAnim - 108) / 26) * (-2.31763-(-2.31763)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -12.72668 + (((tickAnim - 134) / 29) * (0-(-12.72668)));
            yy = -6.05647 + (((tickAnim - 134) / 29) * (0-(-6.05647)));
            zz = -2.31763 + (((tickAnim - 134) / 29) * (0-(-2.31763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-0.575-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 108) {
            xx = 0 + (((tickAnim - 40) / 68) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 68) * (0-(0)));
            zz = -0.575 + (((tickAnim - 40) / 68) * (-0.675-(-0.575)));
        }
        else if (tickAnim >= 108 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 108) / 55) * (0-(0)));
            yy = 0 + (((tickAnim - 108) / 55) * (0-(0)));
            zz = -0.675 + (((tickAnim - 108) / 55) * (0-(-0.675)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-2.57-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -2.57 + (((tickAnim - 23) / 9) * (-3.75-(-2.57)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 32) / 8) * (-6-(-3.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -6 + (((tickAnim - 40) / 36) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 108) {
            xx = -6 + (((tickAnim - 76) / 32) * (-3.36-(-6)));
            yy = 0 + (((tickAnim - 76) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 32) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -3.36 + (((tickAnim - 108) / 26) * (-3.36-(-3.36)));
            yy = 0 + (((tickAnim - 108) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 26) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -3.36 + (((tickAnim - 134) / 29) * (0-(-3.36)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.67421-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.42181-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.4883-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0.67421 + (((tickAnim - 23) / 9) * (-0.56962-(0.67421)));
            yy = 0.42181 + (((tickAnim - 23) / 9) * (0.59366-(0.42181)));
            zz = 1.4883 + (((tickAnim - 23) / 9) * (2.09464-(1.4883)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.56962 + (((tickAnim - 32) / 8) * (-7.98268-(-0.56962)));
            yy = 0.59366 + (((tickAnim - 32) / 8) * (0.74989-(0.59366)));
            zz = 2.09464 + (((tickAnim - 32) / 8) * (2.64586-(2.09464)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -7.98268 + (((tickAnim - 40) / 36) * (-7.98268-(-7.98268)));
            yy = 0.74989 + (((tickAnim - 40) / 36) * (0.74989-(0.74989)));
            zz = 2.64586 + (((tickAnim - 40) / 36) * (2.64586-(2.64586)));
        }
        else if (tickAnim >= 76 && tickAnim < 92) {
            xx = -7.98268 + (((tickAnim - 76) / 16) * (-7.00546-(-7.98268)));
            yy = 0.74989 + (((tickAnim - 76) / 16) * (-3.72912-(0.74989)));
            zz = 2.64586 + (((tickAnim - 76) / 16) * (3.34344-(2.64586)));
        }
        else if (tickAnim >= 92 && tickAnim < 108) {
            xx = -7.00546 + (((tickAnim - 92) / 16) * (-10.45397-(-7.00546)));
            yy = -3.72912 + (((tickAnim - 92) / 16) * (-5.83209-(-3.72912)));
            zz = 3.34344 + (((tickAnim - 92) / 16) * (3.24653-(3.34344)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -10.45397 + (((tickAnim - 108) / 26) * (-10.45397-(-10.45397)));
            yy = -5.83209 + (((tickAnim - 108) / 26) * (-5.83209-(-5.83209)));
            zz = 3.24653 + (((tickAnim - 108) / 26) * (3.24653-(3.24653)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -10.45397 + (((tickAnim - 134) / 29) * (0-(-10.45397)));
            yy = -5.83209 + (((tickAnim - 134) / 29) * (0-(-5.83209)));
            zz = 3.24653 + (((tickAnim - 134) / 29) * (0-(3.24653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.70736-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (3.35476-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.29934-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 7.70736 + (((tickAnim - 23) / 9) * (18.20899-(7.70736)));
            yy = 3.35476 + (((tickAnim - 23) / 9) * (4.51158-(3.35476)));
            zz = 2.29934 + (((tickAnim - 23) / 9) * (3.09221-(2.29934)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 18.20899 + (((tickAnim - 32) / 8) * (21.36045-(18.20899)));
            yy = 4.51158 + (((tickAnim - 32) / 8) * (5.55271-(4.51158)));
            zz = 3.09221 + (((tickAnim - 32) / 8) * (3.8058-(3.09221)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 21.36045 + (((tickAnim - 40) / 36) * (21.36045-(21.36045)));
            yy = 5.55271 + (((tickAnim - 40) / 36) * (5.55271-(5.55271)));
            zz = 3.8058 + (((tickAnim - 40) / 36) * (3.8058-(3.8058)));
        }
        else if (tickAnim >= 76 && tickAnim < 92) {
            xx = 21.36045 + (((tickAnim - 76) / 16) * (6.72104-(21.36045)));
            yy = 5.55271 + (((tickAnim - 76) / 16) * (4.34151-(5.55271)));
            zz = 3.8058 + (((tickAnim - 76) / 16) * (0.74685-(3.8058)));
        }
        else if (tickAnim >= 92 && tickAnim < 108) {
            xx = 6.72104 + (((tickAnim - 92) / 16) * (10.92755-(6.72104)));
            yy = 4.34151 + (((tickAnim - 92) / 16) * (-4.81674-(4.34151)));
            zz = 0.74685 + (((tickAnim - 92) / 16) * (-3.79394-(0.74685)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = 10.92755 + (((tickAnim - 108) / 26) * (10.92755-(10.92755)));
            yy = -4.81674 + (((tickAnim - 108) / 26) * (-4.81674-(-4.81674)));
            zz = -3.79394 + (((tickAnim - 108) / 26) * (-3.79394-(-3.79394)));
        }
        else if (tickAnim >= 134 && tickAnim < 152) {
            xx = 10.92755 + (((tickAnim - 134) / 18) * (-2.79028-(10.92755)));
            yy = -4.81674 + (((tickAnim - 134) / 18) * (-1.70002-(-4.81674)));
            zz = -3.79394 + (((tickAnim - 134) / 18) * (-1.33904-(-3.79394)));
        }
        else if (tickAnim >= 152 && tickAnim < 163) {
            xx = -2.79028 + (((tickAnim - 152) / 11) * (0-(-2.79028)));
            yy = -1.70002 + (((tickAnim - 152) / 11) * (0-(-1.70002)));
            zz = -1.33904 + (((tickAnim - 152) / 11) * (0-(-1.33904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (9.56848-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.31746-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.42267-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 9.56848 + (((tickAnim - 23) / 9) * (23.79763-(9.56848)));
            yy = 2.31746 + (((tickAnim - 23) / 9) * (3.11659-(2.31746)));
            zz = 1.42267 + (((tickAnim - 23) / 9) * (1.91325-(1.42267)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 23.79763 + (((tickAnim - 32) / 8) * (37.57886-(23.79763)));
            yy = 3.11659 + (((tickAnim - 32) / 8) * (3.8358-(3.11659)));
            zz = 1.91325 + (((tickAnim - 32) / 8) * (2.35476-(1.91325)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 37.57886 + (((tickAnim - 40) / 36) * (37.57886-(37.57886)));
            yy = 3.8358 + (((tickAnim - 40) / 36) * (3.8358-(3.8358)));
            zz = 2.35476 + (((tickAnim - 40) / 36) * (2.35476-(2.35476)));
        }
        else if (tickAnim >= 76 && tickAnim < 92) {
            xx = 37.57886 + (((tickAnim - 76) / 16) * (50.59194-(37.57886)));
            yy = 3.8358 + (((tickAnim - 76) / 16) * (1.12771-(3.8358)));
            zz = 2.35476 + (((tickAnim - 76) / 16) * (-2.53894-(2.35476)));
        }
        else if (tickAnim >= 92 && tickAnim < 108) {
            xx = 50.59194 + (((tickAnim - 92) / 16) * (40.35501-(50.59194)));
            yy = 1.12771 + (((tickAnim - 92) / 16) * (-1.58039-(1.12771)));
            zz = -2.53894 + (((tickAnim - 92) / 16) * (-7.43264-(-2.53894)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = 40.35501 + (((tickAnim - 108) / 26) * (40.35501-(40.35501)));
            yy = -1.58039 + (((tickAnim - 108) / 26) * (-1.58039-(-1.58039)));
            zz = -7.43264 + (((tickAnim - 108) / 26) * (-7.43264-(-7.43264)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 40.35501 + (((tickAnim - 134) / 7) * (23.20737-(40.35501)));
            yy = -1.58039 + (((tickAnim - 134) / 7) * (-0.66553-(-1.58039)));
            zz = -7.43264 + (((tickAnim - 134) / 7) * (2.83009-(-7.43264)));
        }
        else if (tickAnim >= 141 && tickAnim < 152) {
            xx = 23.20737 + (((tickAnim - 141) / 11) * (-12.58648-(23.20737)));
            yy = -0.66553 + (((tickAnim - 141) / 11) * (-0.37436-(-0.66553)));
            zz = 2.83009 + (((tickAnim - 141) / 11) * (1.59192-(2.83009)));
        }
        else if (tickAnim >= 152 && tickAnim < 163) {
            xx = -12.58648 + (((tickAnim - 152) / 11) * (0-(-12.58648)));
            yy = -0.37436 + (((tickAnim - 152) / 11) * (0-(-0.37436)));
            zz = 1.59192 + (((tickAnim - 152) / 11) * (0-(1.59192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-8.60382-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (14.81686-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (3.54272-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -8.60382 + (((tickAnim - 12) / 13) * (8.98593-(-8.60382)));
            yy = 14.81686 + (((tickAnim - 12) / 13) * (14.772-(14.81686)));
            zz = 3.54272 + (((tickAnim - 12) / 13) * (3.02916-(3.54272)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 8.98593 + (((tickAnim - 25) / 15) * (13.49261-(8.98593)));
            yy = 14.772 + (((tickAnim - 25) / 15) * (15.03649-(14.772)));
            zz = 3.02916 + (((tickAnim - 25) / 15) * (4.02712-(3.02916)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 13.49261 + (((tickAnim - 40) / 36) * (13.49261-(13.49261)));
            yy = 15.03649 + (((tickAnim - 40) / 36) * (15.03649-(15.03649)));
            zz = 4.02712 + (((tickAnim - 40) / 36) * (4.02712-(4.02712)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 13.49261 + (((tickAnim - 76) / 14) * (10.25-(13.49261)));
            yy = 15.03649 + (((tickAnim - 76) / 14) * (0-(15.03649)));
            zz = 4.02712 + (((tickAnim - 76) / 14) * (0-(4.02712)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 10.25 + (((tickAnim - 90) / 13) * (0-(10.25)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 1.975 + (((tickAnim - 12) / 13) * (0-(1.975)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (2.6-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            yy = 2.6 + (((tickAnim - 90) / 13) * (-1.85-(2.6)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = -1.85 + (((tickAnim - 103) / 31) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            yy = -1.85 + (((tickAnim - 134) / 15) * (1.555-(-1.85)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            yy = 1.555 + (((tickAnim - 149) / 14) * (0-(1.555)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 28.25 + (((tickAnim - 12) / 13) * (0-(28.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -0.5 + (((tickAnim - 40) / 36) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = -0.5 + (((tickAnim - 76) / 14) * (17-(-0.5)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 17 + (((tickAnim - 90) / 13) * (13.36-(17)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 13.36 + (((tickAnim - 103) / 31) * (13.36-(13.36)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 13.36 + (((tickAnim - 134) / 15) * (24.37-(13.36)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 24.37 + (((tickAnim - 149) / 14) * (0-(24.37)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 12) / 28) * (0-(0)));
            yy = -0.525 + (((tickAnim - 12) / 28) * (-0.2-(-0.525)));
            zz = 0 + (((tickAnim - 12) / 28) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = -0.2 + (((tickAnim - 40) / 36) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            yy = -0.2 + (((tickAnim - 76) / 14) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -11.25 + (((tickAnim - 12) / 13) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 5.25 + (((tickAnim - 40) / 36) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 5.25 + (((tickAnim - 76) / 14) * (-39.25-(5.25)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = -39.25 + (((tickAnim - 90) / 13) * (9-(-39.25)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 9 + (((tickAnim - 103) / 31) * (9-(9)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 9 + (((tickAnim - 134) / 15) * (-38.17-(9)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = -38.17 + (((tickAnim - 149) / 14) * (0-(-38.17)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (-2.25-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            yy = -0.8 + (((tickAnim - 90) / 13) * (0-(-0.8)));
            zz = -2.25 + (((tickAnim - 90) / 13) * (0-(-2.25)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetR.rotationPointX = this.feetR.rotationPointX + (float)(xx);
        this.feetR.rotationPointY = this.feetR.rotationPointY - (float)(yy);
        this.feetR.rotationPointZ = this.feetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 31.25 + (((tickAnim - 12) / 13) * (0-(31.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -7.25 + (((tickAnim - 40) / 36) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = -7.25 + (((tickAnim - 76) / 14) * (78.5-(-7.25)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 78.5 + (((tickAnim - 90) / 13) * (-17.25-(78.5)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = -17.25 + (((tickAnim - 103) / 31) * (-17.25-(-17.25)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = -17.25 + (((tickAnim - 134) / 15) * (31.6-(-17.25)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 31.6 + (((tickAnim - 149) / 14) * (0-(31.6)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.975-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -0.975 + (((tickAnim - 12) / 13) * (0-(-0.975)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (-1.1-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = -1.1 + (((tickAnim - 90) / 13) * (0-(-1.1)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 24) / 16) * (11.542-(6.5)));
            yy = 0 + (((tickAnim - 24) / 16) * (-10.2407-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (-1.75775-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 11.542 + (((tickAnim - 40) / 36) * (11.542-(11.542)));
            yy = -10.2407 + (((tickAnim - 40) / 36) * (-10.2407-(-10.2407)));
            zz = -1.75775 + (((tickAnim - 40) / 36) * (-1.75775-(-1.75775)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 11.542 + (((tickAnim - 76) / 27) * (5.35553-(11.542)));
            yy = -10.2407 + (((tickAnim - 76) / 27) * (-7.38415-(-10.2407)));
            zz = -1.75775 + (((tickAnim - 76) / 27) * (-0.7973-(-1.75775)));
        }
        else if (tickAnim >= 103 && tickAnim < 124) {
            xx = 5.35553 + (((tickAnim - 103) / 21) * (2.75-(5.35553)));
            yy = -7.38415 + (((tickAnim - 103) / 21) * (0-(-7.38415)));
            zz = -0.7973 + (((tickAnim - 103) / 21) * (0-(-0.7973)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 2.75 + (((tickAnim - 124) / 10) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 2.75 + (((tickAnim - 134) / 29) * (0-(2.75)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = -0.5 + (((tickAnim - 24) / 9) * (2.625-(-0.5)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 2.625 + (((tickAnim - 33) / 7) * (-0.5-(2.625)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = -0.5 + (((tickAnim - 40) / 36) * (-0.5-(-0.5)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = -0.5 + (((tickAnim - 76) / 27) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (2.2-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            yy = 2.2 + (((tickAnim - 113) / 11) * (-0.65-(2.2)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = -0.65 + (((tickAnim - 124) / 10) * (-0.65-(-0.65)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = -0.65 + (((tickAnim - 134) / 29) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 12 + (((tickAnim - 33) / 7) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 13.5 + (((tickAnim - 113) / 11) * (3-(13.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 3 + (((tickAnim - 124) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 3 + (((tickAnim - 134) / 29) * (0-(3)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -28.25 + (((tickAnim - 33) / 7) * (0-(-28.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = -34.25 + (((tickAnim - 113) / 11) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (39-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 33) / 7) * (0-(39)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (31.5-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 31.5 + (((tickAnim - 113) / 11) * (0-(31.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.80572-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.21368-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.77598-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 2.80572 + (((tickAnim - 40) / 36) * (2.80572-(2.80572)));
            yy = 8.21368 + (((tickAnim - 40) / 36) * (8.21368-(8.21368)));
            zz = 0.77598 + (((tickAnim - 40) / 36) * (0.77598-(0.77598)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 2.80572 + (((tickAnim - 76) / 29) * (1.44946-(2.80572)));
            yy = 8.21368 + (((tickAnim - 76) / 29) * (2.51919-(8.21368)));
            zz = 0.77598 + (((tickAnim - 76) / 29) * (0.2787-(0.77598)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 1.44946 + (((tickAnim - 105) / 29) * (1.44946-(1.44946)));
            yy = 2.51919 + (((tickAnim - 105) / 29) * (2.51919-(2.51919)));
            zz = 0.2787 + (((tickAnim - 105) / 29) * (0.2787-(0.2787)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 1.44946 + (((tickAnim - 134) / 29) * (0-(1.44946)));
            yy = 2.51919 + (((tickAnim - 134) / 29) * (0-(2.51919)));
            zz = 0.2787 + (((tickAnim - 134) / 29) * (0-(0.2787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 2.75 + (((tickAnim - 40) / 36) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 2.75 + (((tickAnim - 76) / 29) * (-2.76599-(2.75)));
            yy = 0 + (((tickAnim - 76) / 29) * (-16.59933-(0)));
            zz = 0 + (((tickAnim - 76) / 29) * (-1.89411-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -2.76599 + (((tickAnim - 105) / 29) * (-2.76599-(-2.76599)));
            yy = -16.59933 + (((tickAnim - 105) / 29) * (-16.59933-(-16.59933)));
            zz = -1.89411 + (((tickAnim - 105) / 29) * (-1.89411-(-1.89411)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -2.76599 + (((tickAnim - 134) / 29) * (0-(-2.76599)));
            yy = -16.59933 + (((tickAnim - 134) / 29) * (0-(-16.59933)));
            zz = -1.89411 + (((tickAnim - 134) / 29) * (0-(-1.89411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.12186-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.79901-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.21247-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -0.12186 + (((tickAnim - 40) / 36) * (13.62814-(-0.12186)));
            yy = 7.79901 + (((tickAnim - 40) / 36) * (7.79901-(7.79901)));
            zz = 1.21247 + (((tickAnim - 40) / 36) * (1.21247-(1.21247)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 13.62814 + (((tickAnim - 76) / 29) * (2.37136-(13.62814)));
            yy = 7.79901 + (((tickAnim - 76) / 29) * (-3.52808-(7.79901)));
            zz = 1.21247 + (((tickAnim - 76) / 29) * (-5.87371-(1.21247)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 2.37136 + (((tickAnim - 105) / 29) * (-3.12864-(2.37136)));
            yy = -3.52808 + (((tickAnim - 105) / 29) * (-3.52808-(-3.52808)));
            zz = -5.87371 + (((tickAnim - 105) / 29) * (-5.87371-(-5.87371)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -3.12864 + (((tickAnim - 134) / 29) * (0-(-3.12864)));
            yy = -3.52808 + (((tickAnim - 134) / 29) * (0-(-3.52808)));
            zz = -5.87371 + (((tickAnim - 134) / 29) * (0-(-5.87371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12.92968-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.95423-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (3.53311-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -12.92968 + (((tickAnim - 40) / 36) * (-5.17968-(-12.92968)));
            yy = 7.95423 + (((tickAnim - 40) / 36) * (7.95423-(7.95423)));
            zz = 3.53311 + (((tickAnim - 40) / 36) * (3.53311-(3.53311)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = -5.17968 + (((tickAnim - 76) / 29) * (-9.46088-(-5.17968)));
            yy = 7.95423 + (((tickAnim - 76) / 29) * (-16.28172-(7.95423)));
            zz = 3.53311 + (((tickAnim - 76) / 29) * (-2.50807-(3.53311)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -9.46088 + (((tickAnim - 105) / 29) * (-14.71088-(-9.46088)));
            yy = -16.28172 + (((tickAnim - 105) / 29) * (-16.28172-(-16.28172)));
            zz = -2.50807 + (((tickAnim - 105) / 29) * (-2.50807-(-2.50807)));
        }
        else if (tickAnim >= 134 && tickAnim < 146) {
            xx = -14.71088 + (((tickAnim - 134) / 12) * (-2.96122-(-14.71088)));
            yy = -16.28172 + (((tickAnim - 134) / 12) * (-7.98124-(-16.28172)));
            zz = -2.50807 + (((tickAnim - 134) / 12) * (-1.22944-(-2.50807)));
        }
        else if (tickAnim >= 146 && tickAnim < 163) {
            xx = -2.96122 + (((tickAnim - 146) / 17) * (0-(-2.96122)));
            yy = -7.98124 + (((tickAnim - 146) / 17) * (0-(-7.98124)));
            zz = -1.22944 + (((tickAnim - 146) / 17) * (0-(-1.22944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.31555-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.42357-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.54843-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 18.31555 + (((tickAnim - 20) / 20) * (15.13111-(18.31555)));
            yy = 2.42357 + (((tickAnim - 20) / 20) * (4.84714-(2.42357)));
            zz = 1.54843 + (((tickAnim - 20) / 20) * (3.09687-(1.54843)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 15.13111 + (((tickAnim - 40) / 36) * (-1.36889-(15.13111)));
            yy = 4.84714 + (((tickAnim - 40) / 36) * (4.84714-(4.84714)));
            zz = 3.09687 + (((tickAnim - 40) / 36) * (3.09687-(3.09687)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = -1.36889 + (((tickAnim - 76) / 15) * (5.1588-(-1.36889)));
            yy = 4.84714 + (((tickAnim - 76) / 15) * (-5.73172-(4.84714)));
            zz = 3.09687 + (((tickAnim - 76) / 15) * (2.99538-(3.09687)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 5.1588 + (((tickAnim - 91) / 14) * (17.26572-(5.1588)));
            yy = -5.73172 + (((tickAnim - 91) / 14) * (-2.76013-(-5.73172)));
            zz = 2.99538 + (((tickAnim - 91) / 14) * (5.09038-(2.99538)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 17.26572 + (((tickAnim - 105) / 29) * (29.76572-(17.26572)));
            yy = -2.76013 + (((tickAnim - 105) / 29) * (-2.76013-(-2.76013)));
            zz = 5.09038 + (((tickAnim - 105) / 29) * (5.09038-(5.09038)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 29.76572 + (((tickAnim - 134) / 29) * (0-(29.76572)));
            yy = -2.76013 + (((tickAnim - 134) / 29) * (0-(-2.76013)));
            zz = 5.09038 + (((tickAnim - 134) / 29) * (0-(5.09038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-4.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = -4.75 + (((tickAnim - 40) / 36) * (-4.75-(-4.75)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            zz = -4.75 + (((tickAnim - 76) / 58) * (0-(-4.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 134) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = -25.75 + (((tickAnim - 40) / 36) * (-25.75-(-25.75)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = -25.75 + (((tickAnim - 76) / 58) * (0-(-25.75)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (3.75-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 3.75 + (((tickAnim - 40) / 36) * (3.75-(3.75)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            zz = 3.75 + (((tickAnim - 76) / 58) * (0-(3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 11 + (((tickAnim - 40) / 36) * (11-(11)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 11 + (((tickAnim - 76) / 58) * (0-(11)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (20.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 20.5 + (((tickAnim - 40) / 36) * (20.5-(20.5)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 20.5 + (((tickAnim - 76) / 58) * (0-(20.5)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNoise2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 2 + (((tickAnim - 8) / 9) * (3.5-(2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 17) / 8) * (0-(3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2 + (((tickAnim - 8) / 9) * (-3.5-(-2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 17) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 8) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 8) / 11) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.31799-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.89559-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (7.19181-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.31799 + (((tickAnim - 8) / 10) * (-5.42139-(4.31799)));
            yy = -2.89559 + (((tickAnim - 8) / 10) * (-0.89095-(-2.89559)));
            zz = 7.19181 + (((tickAnim - 8) / 10) * (2.21287-(7.19181)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.42139 + (((tickAnim - 18) / 7) * (0-(-5.42139)));
            yy = -0.89095 + (((tickAnim - 18) / 7) * (0-(-0.89095)));
            zz = 2.21287 + (((tickAnim - 18) / 7) * (0-(2.21287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -9.75 + (((tickAnim - 8) / 10) * (-9.75-(-9.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -9.75 + (((tickAnim - 18) / 7) * (0-(-9.75)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.25 + (((tickAnim - 8) / 6) * (7.74-(12.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 7.74 + (((tickAnim - 14) / 5) * (0-(7.74)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw2.rotationPointX = this.jaw2.rotationPointX + (float)(xx);
        this.jaw2.rotationPointY = this.jaw2.rotationPointY - (float)(yy);
        this.jaw2.rotationPointZ = this.jaw2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.52111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.52111 + (((tickAnim - 12) / 13) * (0-(-23.52111)));
            yy = -11.24973 + (((tickAnim - 12) / 13) * (0-(-11.24973)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.225 + (((tickAnim - 12) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.5211 + (((tickAnim - 12) / 13) * (0-(-23.5211)));
            yy = 11.2497 + (((tickAnim - 12) / 13) * (0-(11.2497)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.225 + (((tickAnim - 12) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.5 + (((tickAnim - 13) / 6) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 8) / 10) * (1.15-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1.15 + (((tickAnim - 18) / 7) * (0-(1.15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 8) / 10) * (-3-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 18) / 7) * (0-(-3)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 13) / 12) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 13) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 2.75 + (((tickAnim - 13) / 6) * (4.62-(2.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 4.62 + (((tickAnim - 19) / 6) * (0-(4.62)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 10.75 + (((tickAnim - 13) / 6) * (-4.98-(10.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -4.98 + (((tickAnim - 19) / 6) * (0-(-4.98)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (12.74-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 12.74 + (((tickAnim - 15) / 7) * (0-(12.74)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw2.rotationPointX = this.jaw2.rotationPointX + (float)(xx);
        this.jaw2.rotationPointY = this.jaw2.rotationPointY - (float)(yy);
        this.jaw2.rotationPointZ = this.jaw2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-21.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -21.5211 + (((tickAnim - 12) / 13) * (0-(-21.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmR.rotationPointX = this.lowerarmR.rotationPointX + (float)(xx);
        this.lowerarmR.rotationPointY = this.lowerarmR.rotationPointY - (float)(yy);
        this.lowerarmR.rotationPointZ = this.lowerarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20.77111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -20.77111 + (((tickAnim - 12) / 13) * (0-(-20.77111)));
            yy = 11.24973 + (((tickAnim - 12) / 13) * (0-(11.24973)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (6.1209-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.37403-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-4.25547-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.1209 + (((tickAnim - 33) / 17) * (0-(6.1209)));
            yy = -1.37403 + (((tickAnim - 33) / 17) * (0-(-1.37403)));
            zz = -4.25547 + (((tickAnim - 33) / 17) * (0-(-4.25547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.01464-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-6.40067-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-1.22778-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.01464 + (((tickAnim - 33) / 17) * (0-(2.01464)));
            yy = -6.40067 + (((tickAnim - 33) / 17) * (0-(-6.40067)));
            zz = -1.22778 + (((tickAnim - 33) / 17) * (0-(-1.22778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-21.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-14.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 33) / 17) * (0-(14.25)));
            yy = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (1.57213-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-26.47993-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-3.46312-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 1.57213 + (((tickAnim - 33) / 17) * (0-(1.57213)));
            yy = -26.47993 + (((tickAnim - 33) / 17) * (0-(-26.47993)));
            zz = -3.46312 + (((tickAnim - 33) / 17) * (0-(-3.46312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 32.25 + (((tickAnim - 25) / 25) * (0-(32.25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.075 + (((tickAnim - 38) / 12) * (0-(1.075)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.72-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 2.72 + (((tickAnim - 15) / 10) * (23-(2.72)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 23 + (((tickAnim - 25) / 13) * (6.13-(23)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 6.13 + (((tickAnim - 38) / 12) * (0-(6.13)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -8.5 + (((tickAnim - 15) / 23) * (-26.96-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -26.96 + (((tickAnim - 38) / 12) * (0-(-26.96)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 6.75 + (((tickAnim - 6) / 9) * (18.5-(6.75)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 18.5 + (((tickAnim - 15) / 10) * (38.75-(18.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 38.75 + (((tickAnim - 25) / 13) * (0-(38.75)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (-11.8-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -11.8 + (((tickAnim - 44) / 6) * (0-(-11.8)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-0.775-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = -0.775 + (((tickAnim - 25) / 13) * (0-(-0.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(xx);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(yy);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(zz);


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 8) / 7) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.75-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 3) / 5) * (-1.75-(4)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 8) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.9789-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.49315-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.21895-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.9789 + (((tickAnim - 6) / 4) * (0-(0.9789)));
            yy = 3.49315 + (((tickAnim - 6) / 4) * (0-(3.49315)));
            zz = 0.21895 + (((tickAnim - 6) / 4) * (0-(0.21895)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.76796-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.21693-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.0465-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.76796 + (((tickAnim - 5) / 5) * (0-(5.76796)));
            yy = -7.21693 + (((tickAnim - 5) / 5) * (5.75-(-7.21693)));
            zz = -2.0465 + (((tickAnim - 5) / 5) * (0-(-2.0465)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 5.75 + (((tickAnim - 10) / 5) * (0-(5.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 5) / 5) * (6-(-8)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 10) / 5) * (0-(6)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.25 + (((tickAnim - 5) / 5) * (12.36217-(-9.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (-10.906-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1.44375-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.36217 + (((tickAnim - 10) / 5) * (0-(12.36217)));
            yy = -10.906 + (((tickAnim - 10) / 5) * (0-(-10.906)));
            zz = 1.44375 + (((tickAnim - 10) / 5) * (0-(1.44375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.75 + (((tickAnim - 5) / 5) * (21.5-(20.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 10) / 5) * (0-(21.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.75 + (((tickAnim - 8) / 1) * (0-(16.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));






        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-88.08672-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-20.14672-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.97115-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -88.08672 + (((tickAnim - 6) / 3) * (-50.56493-(-88.08672)));
            yy = -20.14672 + (((tickAnim - 6) / 3) * (1.07602-(-20.14672)));
            zz = -14.97115 + (((tickAnim - 6) / 3) * (-3.84029-(-14.97115)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -50.56493 + (((tickAnim - 9) / 6) * (0-(-50.56493)));
            yy = 1.07602 + (((tickAnim - 9) / 6) * (0-(1.07602)));
            zz = -3.84029 + (((tickAnim - 9) / 6) * (0-(-3.84029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 6) / 3) * (-9.80757-(14.25)));
            yy = -25.75 + (((tickAnim - 6) / 3) * (14.00745-(-25.75)));
            zz = 0 + (((tickAnim - 6) / 3) * (9.89921-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -9.80757 + (((tickAnim - 9) / 6) * (0-(-9.80757)));
            yy = 14.00745 + (((tickAnim - 9) / 6) * (0-(14.00745)));
            zz = 9.89921 + (((tickAnim - 9) / 6) * (0-(9.89921)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-0.575-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -0.575 + (((tickAnim - 6) / 9) * (0-(-0.575)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -20.25 + (((tickAnim - 6) / 3) * (27.25-(-20.25)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 27.25 + (((tickAnim - 9) / 6) * (0-(27.25)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-34-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -34 + (((tickAnim - 6) / 4) * (0-(-34)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclawL, thumbclawL.rotateAngleX + (float) Math.toRadians(xx), thumbclawL.rotateAngleY + (float) Math.toRadians(yy), thumbclawL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.3 + (((tickAnim - 15) / 20) * (-5.3-(-5.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.3 + (((tickAnim - 35) / 15) * (0-(-5.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.79289-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.9646-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.70479-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.79289 + (((tickAnim - 15) / 20) * (-4.79289-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 15) / 20) * (6.9646-(6.9646)));
            zz = -0.70479 + (((tickAnim - 15) / 20) * (-0.70479-(-0.70479)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.79289 + (((tickAnim - 35) / 15) * (0-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 35) / 15) * (0-(6.9646)));
            zz = -0.70479 + (((tickAnim - 35) / 15) * (0-(-0.70479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 15) / 20) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 35) / 15) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.78766-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (4.39175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.98204-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.78766 + (((tickAnim - 15) / 20) * (-4.78766-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 15) / 20) * (4.39175-(4.39175)));
            zz = -0.98204 + (((tickAnim - 15) / 20) * (-0.98204-(-0.98204)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.78766 + (((tickAnim - 35) / 15) * (0-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 35) / 15) * (0-(4.39175)));
            zz = -0.98204 + (((tickAnim - 35) / 15) * (0-(-0.98204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (18.60196-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.54127-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.87141-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 18.60196 + (((tickAnim - 15) / 20) * (18.60196-(18.60196)));
            yy = -1.54127 + (((tickAnim - 15) / 20) * (-1.54127-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 15) / 20) * (4.87141-(4.87141)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 18.60196 + (((tickAnim - 35) / 6) * (-9.49959-(18.60196)));
            yy = -1.54127 + (((tickAnim - 35) / 6) * (-0.67354-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 35) / 6) * (-0.51308-(4.87141)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = -9.49959 + (((tickAnim - 41) / 9) * (0-(-9.49959)));
            yy = -0.67354 + (((tickAnim - 41) / 9) * (0-(-0.67354)));
            zz = -0.51308 + (((tickAnim - 41) / 9) * (0-(-0.51308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 29.75 + (((tickAnim - 15) / 20) * (29.75-(29.75)));
            yy = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 29.75 + (((tickAnim - 35) / 6) * (29.75-(29.75)));
            yy = 7 + (((tickAnim - 35) / 6) * (4.27778-(7)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 29.75 + (((tickAnim - 41) / 4) * (-5.93182-(29.75)));
            yy = 4.27778 + (((tickAnim - 41) / 4) * (2.33333-(4.27778)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5.93182 + (((tickAnim - 45) / 5) * (0-(-5.93182)));
            yy = 2.33333 + (((tickAnim - 45) / 5) * (0-(2.33333)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.86204-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.67994-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.42653-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.86204 + (((tickAnim - 15) / 20) * (-0.86204-(-0.86204)));
            yy = 21.67994 + (((tickAnim - 15) / 20) * (21.67994-(21.67994)));
            zz = 5.42653 + (((tickAnim - 15) / 20) * (5.42653-(5.42653)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.86204 + (((tickAnim - 35) / 15) * (0-(-0.86204)));
            yy = 21.67994 + (((tickAnim - 35) / 15) * (0-(21.67994)));
            zz = 5.42653 + (((tickAnim - 35) / 15) * (0-(5.42653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (3.3-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 3.3 + (((tickAnim - 8) / 7) * (1.5-(3.3)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.5 + (((tickAnim - 15) / 20) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.5 + (((tickAnim - 35) / 8) * (3.175-(1.5)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 3.175 + (((tickAnim - 43) / 7) * (0-(3.175)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.13-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 23.13 + (((tickAnim - 8) / 7) * (20-(23.13)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 20 + (((tickAnim - 15) / 20) * (20-(20)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 35) / 8) * (23.13-(20)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 23.13 + (((tickAnim - 43) / 7) * (0-(23.13)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -22.5 + (((tickAnim - 8) / 7) * (-14-(-22.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -14 + (((tickAnim - 15) / 20) * (-14-(-14)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -14 + (((tickAnim - 35) / 8) * (-25.75-(-14)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 43) / 7) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (10.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 10.75 + (((tickAnim - 8) / 7) * (6.25-(10.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 15) / 20) * (6.25-(6.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 6.25 + (((tickAnim - 35) / 8) * (12.5-(6.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 43) / 7) * (0-(12.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 15) / 20) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.88507-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (8.41393-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.77338-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.88507 + (((tickAnim - 8) / 7) * (-6.63507-(-0.88507)));
            yy = 8.41393 + (((tickAnim - 8) / 7) * (8.41393-(8.41393)));
            zz = -2.77338 + (((tickAnim - 8) / 7) * (-2.77338-(-2.77338)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.63507 + (((tickAnim - 15) / 20) * (-0.8579-(-6.63507)));
            yy = 8.41393 + (((tickAnim - 15) / 20) * (-7.62272-(8.41393)));
            zz = -2.77338 + (((tickAnim - 15) / 20) * (1.12221-(-2.77338)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.8579 + (((tickAnim - 35) / 15) * (0-(-0.8579)));
            yy = -7.62272 + (((tickAnim - 35) / 15) * (0-(-7.62272)));
            zz = 1.12221 + (((tickAnim - 35) / 15) * (0-(1.12221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-5.25-(0)));
            yy = 2 + (((tickAnim - 8) / 7) * (2-(2)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 15) / 20) * (0-(-5.25)));
            yy = 2 + (((tickAnim - 15) / 20) * (-10.75-(2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.55759-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10.58377-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.91059-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.55759 + (((tickAnim - 8) / 7) * (8.80759-(0.55759)));
            yy = 10.58377 + (((tickAnim - 8) / 7) * (10.58377-(10.58377)));
            zz = 2.91059 + (((tickAnim - 8) / 7) * (2.91059-(2.91059)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.80759 + (((tickAnim - 15) / 20) * (1.37353-(8.80759)));
            yy = 10.58377 + (((tickAnim - 15) / 20) * (-13.20385-(10.58377)));
            zz = 2.91059 + (((tickAnim - 15) / 20) * (-5.6324-(2.91059)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.37353 + (((tickAnim - 35) / 15) * (0-(1.37353)));
            yy = -13.20385 + (((tickAnim - 35) / 15) * (0-(-13.20385)));
            zz = -5.6324 + (((tickAnim - 35) / 15) * (0-(-5.6324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.275 + (((tickAnim - 15) / 20) * (2.275-(2.275)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.275 + (((tickAnim - 35) / 15) * (0-(2.275)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 15) / 20) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 35) / 15) * (0-(12.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -12.25 + (((tickAnim - 15) / 20) * (-12.25-(-12.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.25 + (((tickAnim - 35) / 15) * (0-(-12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.25 + (((tickAnim - 15) / 20) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 35) / 15) * (0-(8.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 92;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -14.25 + (((tickAnim - 23) / 37) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = -14.25 + (((tickAnim - 60) / 30) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-5.8-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (10-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = -5.8 + (((tickAnim - 23) / 37) * (-5.8-(-5.8)));
            zz = 10 + (((tickAnim - 23) / 37) * (10-(10)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            yy = -5.8 + (((tickAnim - 60) / 30) * (0-(-5.8)));
            zz = 10 + (((tickAnim - 60) / 30) * (0-(10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 68) {
            xx = -8 + (((tickAnim - 23) / 45) * (-8-(-8)));
            yy = 0 + (((tickAnim - 23) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 45) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 93) {
            xx = -8 + (((tickAnim - 68) / 25) * (0-(-8)));
            yy = 0 + (((tickAnim - 68) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.41484-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (6.56795-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (3.00187-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = -3.41484 + (((tickAnim - 23) / 10) * (3.90688-(-3.41484)));
            yy = 6.56795 + (((tickAnim - 23) / 10) * (8.74677-(6.56795)));
            zz = 3.00187 + (((tickAnim - 23) / 10) * (-0.12821-(3.00187)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 3.90688 + (((tickAnim - 33) / 4) * (-1.93367-(3.90688)));
            yy = 8.74677 + (((tickAnim - 33) / 4) * (10.18938-(8.74677)));
            zz = -0.12821 + (((tickAnim - 33) / 4) * (-0.4874-(-0.12821)));
        }
        else if (tickAnim >= 37 && tickAnim < 44) {
            xx = -1.93367 + (((tickAnim - 37) / 7) * (-1.94666-(-1.93367)));
            yy = 10.18938 + (((tickAnim - 37) / 7) * (12.78608-(10.18938)));
            zz = -0.4874 + (((tickAnim - 37) / 7) * (-1.13394-(-0.4874)));
        }
        else if (tickAnim >= 44 && tickAnim < 60) {
            xx = -1.94666 + (((tickAnim - 44) / 16) * (0-(-1.94666)));
            yy = 12.78608 + (((tickAnim - 44) / 16) * (6.25-(12.78608)));
            zz = -1.13394 + (((tickAnim - 44) / 16) * (0-(-1.13394)));
        }
        else if (tickAnim >= 60 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 60) / 31) * (0-(0)));
            yy = 6.25 + (((tickAnim - 60) / 31) * (0-(6.25)));
            zz = 0 + (((tickAnim - 60) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 15) / 8) * (29.16214-(3)));
            yy = 1.75 + (((tickAnim - 15) / 8) * (11.6434-(1.75)));
            zz = 0 + (((tickAnim - 15) / 8) * (1.59019-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 29.16214 + (((tickAnim - 23) / 10) * (30.88415-(29.16214)));
            yy = 11.6434 + (((tickAnim - 23) / 10) * (14.00423-(11.6434)));
            zz = 1.59019 + (((tickAnim - 23) / 10) * (2.43378-(1.59019)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 30.88415 + (((tickAnim - 33) / 4) * (31.40036-(30.88415)));
            yy = 14.00423 + (((tickAnim - 33) / 4) * (14.83103-(14.00423)));
            zz = 2.43378 + (((tickAnim - 33) / 4) * (2.24122-(2.43378)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 31.40036 + (((tickAnim - 37) / 4) * (25.02972-(31.40036)));
            yy = 14.83103 + (((tickAnim - 37) / 4) * (13.70278-(14.83103)));
            zz = 2.24122 + (((tickAnim - 37) / 4) * (6.19308-(2.24122)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 25.02972 + (((tickAnim - 41) / 3) * (25.82438-(25.02972)));
            yy = 13.70278 + (((tickAnim - 41) / 3) * (14.79056-(13.70278)));
            zz = 6.19308 + (((tickAnim - 41) / 3) * (2.21509-(6.19308)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 25.82438 + (((tickAnim - 44) / 9) * (23.84425-(25.82438)));
            yy = 14.79056 + (((tickAnim - 44) / 9) * (13.13416-(14.79056)));
            zz = 2.21509 + (((tickAnim - 44) / 9) * (1.8862-(2.21509)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 23.84425 + (((tickAnim - 53) / 7) * (23.91214-(23.84425)));
            yy = 13.13416 + (((tickAnim - 53) / 7) * (11.6434-(13.13416)));
            zz = 1.8862 + (((tickAnim - 53) / 7) * (1.59019-(1.8862)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 23.91214 + (((tickAnim - 60) / 7) * (9.04278-(23.91214)));
            yy = 11.6434 + (((tickAnim - 60) / 7) * (9.05598-(11.6434)));
            zz = 1.59019 + (((tickAnim - 60) / 7) * (1.23682-(1.59019)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 9.04278 + (((tickAnim - 67) / 5) * (-2.25516-(9.04278)));
            yy = 9.05598 + (((tickAnim - 67) / 5) * (6.46855-(9.05598)));
            zz = 1.23682 + (((tickAnim - 67) / 5) * (0.88344-(1.23682)));
        }
        else if (tickAnim >= 72 && tickAnim < 91) {
            xx = -2.25516 + (((tickAnim - 72) / 19) * (0-(-2.25516)));
            yy = 6.46855 + (((tickAnim - 72) / 19) * (0-(6.46855)));
            zz = 0.88344 + (((tickAnim - 72) / 19) * (0-(0.88344)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (34.54059-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (1.5994-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0.16693-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 34.54059 + (((tickAnim - 15) / 8) * (19.32499-(34.54059)));
            yy = 1.5994 + (((tickAnim - 15) / 8) * (7.66931-(1.5994)));
            zz = 0.16693 + (((tickAnim - 15) / 8) * (1.11876-(0.16693)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 19.32499 + (((tickAnim - 23) / 10) * (-0.39757-(19.32499)));
            yy = 7.66931 + (((tickAnim - 23) / 10) * (8.90432-(7.66931)));
            zz = 1.11876 + (((tickAnim - 23) / 10) * (0.92369-(1.11876)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = -0.39757 + (((tickAnim - 33) / 4) * (23.42648-(-0.39757)));
            yy = 8.90432 + (((tickAnim - 33) / 4) * (13.39958-(8.90432)));
            zz = 0.92369 + (((tickAnim - 33) / 4) * (2.92886-(0.92369)));
        }
        else if (tickAnim >= 37 && tickAnim < 41) {
            xx = 23.42648 + (((tickAnim - 37) / 4) * (16.91296-(23.42648)));
            yy = 13.39958 + (((tickAnim - 37) / 4) * (14.99138-(13.39958)));
            zz = 2.92886 + (((tickAnim - 37) / 4) * (3.71088-(2.92886)));
        }
        else if (tickAnim >= 41 && tickAnim < 44) {
            xx = 16.91296 + (((tickAnim - 41) / 3) * (11.91773-(16.91296)));
            yy = 14.99138 + (((tickAnim - 41) / 3) * (14.07917-(14.99138)));
            zz = 3.71088 + (((tickAnim - 41) / 3) * (2.21789-(3.71088)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = 11.91773 + (((tickAnim - 44) / 9) * (18.24767-(11.91773)));
            yy = 14.07917 + (((tickAnim - 44) / 9) * (8.96365-(14.07917)));
            zz = 2.21789 + (((tickAnim - 44) / 9) * (1.4688-(2.21789)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 18.24767 + (((tickAnim - 53) / 7) * (18.82499-(18.24767)));
            yy = 8.96365 + (((tickAnim - 53) / 7) * (7.66931-(8.96365)));
            zz = 1.4688 + (((tickAnim - 53) / 7) * (1.11876-(1.4688)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 18.82499 + (((tickAnim - 60) / 7) * (26.53055-(18.82499)));
            yy = 7.66931 + (((tickAnim - 60) / 7) * (5.96502-(7.66931)));
            zz = 1.11876 + (((tickAnim - 60) / 7) * (0.87014-(1.11876)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 26.53055 + (((tickAnim - 67) / 5) * (26.27182-(26.53055)));
            yy = 5.96502 + (((tickAnim - 67) / 5) * (4.26073-(5.96502)));
            zz = 0.87014 + (((tickAnim - 67) / 5) * (0.62153-(0.87014)));
        }
        else if (tickAnim >= 72 && tickAnim < 79) {
            xx = 26.27182 + (((tickAnim - 72) / 7) * (3.76309-(26.27182)));
            yy = 4.26073 + (((tickAnim - 72) / 7) * (2.55644-(4.26073)));
            zz = 0.62153 + (((tickAnim - 72) / 7) * (0.37292-(0.62153)));
        }
        else if (tickAnim >= 79 && tickAnim < 91) {
            xx = 3.76309 + (((tickAnim - 79) / 12) * (0-(3.76309)));
            yy = 2.55644 + (((tickAnim - 79) / 12) * (0-(2.55644)));
            zz = 0.37292 + (((tickAnim - 79) / 12) * (0-(0.37292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 14.5 + (((tickAnim - 23) / 37) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 14.5 + (((tickAnim - 60) / 30) * (0-(14.5)));
            yy = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 0.325 + (((tickAnim - 23) / 37) * (0.325-(0.325)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            yy = 0.325 + (((tickAnim - 60) / 30) * (0-(0.325)));
            zz = 0 + (((tickAnim - 60) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 23) / 37) * (15-(15)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 15 + (((tickAnim - 60) / 30) * (0-(15)));
            yy = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-8.6306-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (10.98945-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-5.50238-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = -8.6306 + (((tickAnim - 19) / 24) * (18.98988-(-8.6306)));
            yy = 10.98945 + (((tickAnim - 19) / 24) * (-3.98072-(10.98945)));
            zz = -5.50238 + (((tickAnim - 19) / 24) * (0.13129-(-5.50238)));
        }
        else if (tickAnim >= 43 && tickAnim < 58) {
            xx = 18.98988 + (((tickAnim - 43) / 15) * (18.98988-(18.98988)));
            yy = -3.98072 + (((tickAnim - 43) / 15) * (-3.98072-(-3.98072)));
            zz = 0.13129 + (((tickAnim - 43) / 15) * (0.13129-(0.13129)));
        }
        else if (tickAnim >= 58 && tickAnim < 78) {
            xx = 18.98988 + (((tickAnim - 58) / 20) * (-0.87364-(18.98988)));
            yy = -3.98072 + (((tickAnim - 58) / 20) * (-10.64494-(-3.98072)));
            zz = 0.13129 + (((tickAnim - 58) / 20) * (0.76302-(0.13129)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -0.87364 + (((tickAnim - 78) / 15) * (0-(-0.87364)));
            yy = -10.64494 + (((tickAnim - 78) / 15) * (0-(-10.64494)));
            zz = 0.76302 + (((tickAnim - 78) / 15) * (0-(0.76302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4.09593-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (17.00514-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-5.94901-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = 4.09593 + (((tickAnim - 19) / 9) * (10.63293-(4.09593)));
            yy = 17.00514 + (((tickAnim - 19) / 9) * (1.87834-(17.00514)));
            zz = -5.94901 + (((tickAnim - 19) / 9) * (4.1208-(-5.94901)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 10.63293 + (((tickAnim - 28) / 15) * (21.50002-(10.63293)));
            yy = 1.87834 + (((tickAnim - 28) / 15) * (-20.40339-(1.87834)));
            zz = 4.1208 + (((tickAnim - 28) / 15) * (-1.59819-(4.1208)));
        }
        else if (tickAnim >= 43 && tickAnim < 58) {
            xx = 21.50002 + (((tickAnim - 43) / 15) * (24.68553-(21.50002)));
            yy = -20.40339 + (((tickAnim - 43) / 15) * (-26.57289-(-20.40339)));
            zz = -1.59819 + (((tickAnim - 43) / 15) * (-2.68929-(-1.59819)));
        }
        else if (tickAnim >= 58 && tickAnim < 68) {
            xx = 24.68553 + (((tickAnim - 58) / 10) * (4.8276-(24.68553)));
            yy = -26.57289 + (((tickAnim - 58) / 10) * (-25.45642-(-26.57289)));
            zz = -2.68929 + (((tickAnim - 58) / 10) * (-1.39044-(-2.68929)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 4.8276 + (((tickAnim - 68) / 10) * (-1.1653-(4.8276)));
            yy = -25.45642 + (((tickAnim - 68) / 10) * (-25.40059-(-25.45642)));
            zz = -1.39044 + (((tickAnim - 68) / 10) * (-1.3255-(-1.39044)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = -1.1653 + (((tickAnim - 78) / 15) * (0-(-1.1653)));
            yy = -25.40059 + (((tickAnim - 78) / 15) * (0-(-25.40059)));
            zz = -1.3255 + (((tickAnim - 78) / 15) * (0-(-1.3255)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-1.41537-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (9.333-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (9.66184-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 28) {
            xx = -1.41537 + (((tickAnim - 19) / 9) * (8.3365-(-1.41537)));
            yy = 9.333 + (((tickAnim - 19) / 9) * (-2.67773-(9.333)));
            zz = 9.66184 + (((tickAnim - 19) / 9) * (0.54091-(9.66184)));
        }
        else if (tickAnim >= 28 && tickAnim < 38) {
            xx = 8.3365 + (((tickAnim - 28) / 10) * (19.33474-(8.3365)));
            yy = -2.67773 + (((tickAnim - 28) / 10) * (-14.62137-(-2.67773)));
            zz = 0.54091 + (((tickAnim - 28) / 10) * (-5.89388-(0.54091)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 19.33474 + (((tickAnim - 38) / 5) * (13.64587-(19.33474)));
            yy = -14.62137 + (((tickAnim - 38) / 5) * (-10.07409-(-14.62137)));
            zz = -5.89388 + (((tickAnim - 38) / 5) * (0.2829-(-5.89388)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 13.64587 + (((tickAnim - 43) / 5) * (14.75369-(13.64587)));
            yy = -10.07409 + (((tickAnim - 43) / 5) * (-9.49433-(-10.07409)));
            zz = 0.2829 + (((tickAnim - 43) / 5) * (6.25776-(0.2829)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 14.75369 + (((tickAnim - 48) / 4) * (16.30214-(14.75369)));
            yy = -9.49433 + (((tickAnim - 48) / 4) * (-7.00777-(-9.49433)));
            zz = 6.25776 + (((tickAnim - 48) / 4) * (3.69665-(6.25776)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 16.30214 + (((tickAnim - 52) / 4) * (14.57491-(16.30214)));
            yy = -7.00777 + (((tickAnim - 52) / 4) * (-4.29259-(-7.00777)));
            zz = 3.69665 + (((tickAnim - 52) / 4) * (0.61594-(3.69665)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 14.57491 + (((tickAnim - 56) / 4) * (16.63299-(14.57491)));
            yy = -4.29259 + (((tickAnim - 56) / 4) * (-3.73189-(-4.29259)));
            zz = 0.61594 + (((tickAnim - 56) / 4) * (-0.21411-(0.61594)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 16.63299 + (((tickAnim - 60) / 8) * (16.36812-(16.63299)));
            yy = -3.73189 + (((tickAnim - 60) / 8) * (-2.77499-(-3.73189)));
            zz = -0.21411 + (((tickAnim - 60) / 8) * (-0.15921-(-0.21411)));
        }
        else if (tickAnim >= 68 && tickAnim < 79) {
            xx = 16.36812 + (((tickAnim - 68) / 11) * (0.62476-(16.36812)));
            yy = -2.77499 + (((tickAnim - 68) / 11) * (-4.885-(-2.77499)));
            zz = -0.15921 + (((tickAnim - 68) / 11) * (-1.76803-(-0.15921)));
        }
        else if (tickAnim >= 79 && tickAnim < 93) {
            xx = 0.62476 + (((tickAnim - 79) / 14) * (0-(0.62476)));
            yy = -4.885 + (((tickAnim - 79) / 14) * (0-(-4.885)));
            zz = -1.76803 + (((tickAnim - 79) / 14) * (0-(-1.76803)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (8.05178-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (-12.22513-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (-5.14902-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 43) {
            xx = 8.05178 + (((tickAnim - 28) / 15) * (7.5-(8.05178)));
            yy = -12.22513 + (((tickAnim - 28) / 15) * (0-(-12.22513)));
            zz = -5.14902 + (((tickAnim - 28) / 15) * (0-(-5.14902)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 7.5 + (((tickAnim - 43) / 5) * (7.27958-(7.5)));
            yy = 0 + (((tickAnim - 43) / 5) * (3.05005-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (-7.39969-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 7.27958 + (((tickAnim - 48) / 4) * (7.40668-(7.27958)));
            yy = 3.05005 + (((tickAnim - 48) / 4) * (2.102-(3.05005)));
            zz = -7.39969 + (((tickAnim - 48) / 4) * (-5.08362-(-7.39969)));
        }
        else if (tickAnim >= 52 && tickAnim < 56) {
            xx = 7.40668 + (((tickAnim - 52) / 4) * (10.75151-(7.40668)));
            yy = 2.102 + (((tickAnim - 52) / 4) * (3.7151-(2.102)));
            zz = -5.08362 + (((tickAnim - 52) / 4) * (-7.6505-(-5.08362)));
        }
        else if (tickAnim >= 56 && tickAnim < 60) {
            xx = 10.75151 + (((tickAnim - 56) / 4) * (7.40668-(10.75151)));
            yy = 3.7151 + (((tickAnim - 56) / 4) * (2.102-(3.7151)));
            zz = -7.6505 + (((tickAnim - 56) / 4) * (-5.08362-(-7.6505)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 7.40668 + (((tickAnim - 60) / 8) * (0-(7.40668)));
            yy = 2.102 + (((tickAnim - 60) / 8) * (0-(2.102)));
            zz = -5.08362 + (((tickAnim - 60) / 8) * (0-(-5.08362)));
        }
        else if (tickAnim >= 68 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 68) / 10) * (0.8795-(0)));
            yy = 0 + (((tickAnim - 68) / 10) * (-10.23472-(0)));
            zz = 0 + (((tickAnim - 68) / 10) * (-4.66214-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 93) {
            xx = 0.8795 + (((tickAnim - 78) / 15) * (0-(0.8795)));
            yy = -10.23472 + (((tickAnim - 78) / 15) * (0-(-10.23472)));
            zz = -4.66214 + (((tickAnim - 78) / 15) * (0-(-4.66214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 43) / 5) * (24.5-(0)));
            yy = 0 + (((tickAnim - 43) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 5) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 24.5 + (((tickAnim - 48) / 5) * (0-(24.5)));
            yy = 0 + (((tickAnim - 48) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 5) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 53) / 5) * (24.5-(0)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 24.5 + (((tickAnim - 58) / 4) * (0-(24.5)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(xx), jaw2.rotateAngleY + (float) Math.toRadians(yy), jaw2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -37.25 + (((tickAnim - 23) / 37) * (-37.25-(-37.25)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = -37.25 + (((tickAnim - 60) / 15) * (0-(-37.25)));
            yy = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else if (tickAnim >= 75 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 75) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 75) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(xx), upperarmR.rotateAngleY + (float) Math.toRadians(yy), upperarmR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = -0.825 + (((tickAnim - 23) / 37) * (-0.825-(-0.825)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 75) {
            xx = 0 + (((tickAnim - 60) / 15) * (0-(0)));
            yy = -0.825 + (((tickAnim - 60) / 15) * (0-(-0.825)));
            zz = 0 + (((tickAnim - 60) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarmR.rotationPointX = this.upperarmR.rotationPointX + (float)(xx);
        this.upperarmR.rotationPointY = this.upperarmR.rotationPointY - (float)(yy);
        this.upperarmR.rotationPointZ = this.upperarmR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 16.75 + (((tickAnim - 23) / 37) * (16.75-(16.75)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 16.75 + (((tickAnim - 60) / 18) * (0-(16.75)));
            yy = 0 + (((tickAnim - 60) / 18) * (-8-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 78) / 12) * (0-(0)));
            yy = -8 + (((tickAnim - 78) / 12) * (0-(-8)));
            zz = 0 + (((tickAnim - 78) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(xx), lowerarmR.rotateAngleY + (float) Math.toRadians(yy), lowerarmR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (72.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 72.75 + (((tickAnim - 23) / 37) * (72.75-(72.75)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            yy = 72.75 + (((tickAnim - 60) / 18) * (-16.5-(72.75)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else if (tickAnim >= 78 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 78) / 13) * (0-(0)));
            yy = -16.5 + (((tickAnim - 78) / 13) * (0-(-16.5)));
            zz = 0 + (((tickAnim - 78) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(xx), handR.rotateAngleY + (float) Math.toRadians(yy), handR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.9-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.525-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0.9 + (((tickAnim - 23) / 37) * (0.9-(0.9)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0.525 + (((tickAnim - 23) / 37) * (0.525-(0.525)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = 0.9 + (((tickAnim - 60) / 18) * (0-(0.9)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0.525 + (((tickAnim - 60) / 18) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.handR.rotationPointX = this.handR.rotationPointX + (float)(xx);
        this.handR.rotationPointY = this.handR.rotationPointY - (float)(yy);
        this.handR.rotationPointZ = this.handR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -29.5 + (((tickAnim - 23) / 37) * (-29.5-(-29.5)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 78) {
            xx = -29.5 + (((tickAnim - 60) / 18) * (0-(-29.5)));
            yy = 0 + (((tickAnim - 60) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclawR, thumbclawR.rotateAngleX + (float) Math.toRadians(xx), thumbclawR.rotateAngleY + (float) Math.toRadians(yy), thumbclawR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-2.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -2.25 + (((tickAnim - 12) / 6) * (11.76472-(-2.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (21.51333-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (7.60941-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 11.76472 + (((tickAnim - 18) / 5) * (5.41987-(11.76472)));
            yy = 21.51333 + (((tickAnim - 18) / 5) * (29.043-(21.51333)));
            zz = 7.60941 + (((tickAnim - 18) / 5) * (10.2727-(7.60941)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 5.41987 + (((tickAnim - 23) / 37) * (5.41987-(5.41987)));
            yy = 29.043 + (((tickAnim - 23) / 37) * (29.043-(29.043)));
            zz = 10.2727 + (((tickAnim - 23) / 37) * (10.2727-(10.2727)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 5.41987 + (((tickAnim - 60) / 12) * (16.98764-(5.41987)));
            yy = 29.043 + (((tickAnim - 60) / 12) * (16.80758-(29.043)));
            zz = 10.2727 + (((tickAnim - 60) / 12) * (5.94495-(10.2727)));
        }
        else if (tickAnim >= 72 && tickAnim < 89) {
            xx = 16.98764 + (((tickAnim - 72) / 17) * (0-(16.98764)));
            yy = 16.80758 + (((tickAnim - 72) / 17) * (0-(16.80758)));
            zz = 5.94495 + (((tickAnim - 72) / 17) * (0-(5.94495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (2.61-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 2.61 + (((tickAnim - 12) / 2) * (3.325-(2.61)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 3.325 + (((tickAnim - 14) / 4) * (3.135-(3.325)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 3.135 + (((tickAnim - 18) / 5) * (2-(3.135)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 2 + (((tickAnim - 23) / 37) * (2-(2)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 2 + (((tickAnim - 60) / 12) * (0-(2)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 9) * (2.57-(0)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 81) / 8) * (0-(0)));
            yy = 2.57 + (((tickAnim - 81) / 8) * (0-(2.57)));
            zz = 0 + (((tickAnim - 81) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 12) / 6) * (25.46205-(-10)));
            yy = 0 + (((tickAnim - 12) / 6) * (2.26174-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (-0.57401-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 25.46205 + (((tickAnim - 18) / 5) * (18.5-(25.46205)));
            yy = 2.26174 + (((tickAnim - 18) / 5) * (0-(2.26174)));
            zz = -0.57401 + (((tickAnim - 18) / 5) * (0-(-0.57401)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 18.5 + (((tickAnim - 23) / 37) * (18.5-(18.5)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 18.5 + (((tickAnim - 60) / 12) * (10.36-(18.5)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 10.36 + (((tickAnim - 72) / 9) * (20.02-(10.36)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 89) {
            xx = 20.02 + (((tickAnim - 81) / 8) * (0-(20.02)));
            yy = 0 + (((tickAnim - 81) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = -0.7 + (((tickAnim - 72) / 9) * (-0.7-(-0.7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 5.25 + (((tickAnim - 12) / 6) * (-20.43-(5.25)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -20.43 + (((tickAnim - 18) / 5) * (-7.75-(-20.43)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -7.75 + (((tickAnim - 23) / 37) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = -7.75 + (((tickAnim - 60) / 12) * (-9.94-(-7.75)));
            yy = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = -9.94 + (((tickAnim - 72) / 9) * (-10.07-(-9.94)));
            yy = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 89) {
            xx = -10.07 + (((tickAnim - 81) / 8) * (0-(-10.07)));
            yy = 0 + (((tickAnim - 81) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            yy = -0.225 + (((tickAnim - 72) / 9) * (0.355-(-0.225)));
            zz = -0.475 + (((tickAnim - 72) / 9) * (-0.555-(-0.475)));
        }
        else if (tickAnim >= 81 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 81) / 8) * (0-(0)));
            yy = 0.355 + (((tickAnim - 81) / 8) * (-0.225-(0.355)));
            zz = -0.555 + (((tickAnim - 81) / 8) * (-0.475-(-0.555)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetR.rotationPointX = this.feetR.rotationPointX + (float)(xx);
        this.feetR.rotationPointY = this.feetR.rotationPointY - (float)(yy);
        this.feetR.rotationPointZ = this.feetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 15.5 + (((tickAnim - 12) / 2) * (19.62-(15.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 19.62 + (((tickAnim - 14) / 4) * (16.75-(19.62)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 16.75 + (((tickAnim - 18) / 5) * (1.75-(16.75)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 1.75 + (((tickAnim - 23) / 37) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 1.75 + (((tickAnim - 60) / 12) * (-6.36624-(1.75)));
            yy = 0 + (((tickAnim - 60) / 12) * (0.42123-(0)));
            zz = 0 + (((tickAnim - 60) / 12) * (-1.69856-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = -6.36624 + (((tickAnim - 72) / 9) * (14.42-(-6.36624)));
            yy = 0.42123 + (((tickAnim - 72) / 9) * (0-(0.42123)));
            zz = -1.69856 + (((tickAnim - 72) / 9) * (0-(-1.69856)));
        }
        else if (tickAnim >= 81 && tickAnim < 87) {
            xx = 14.42 + (((tickAnim - 81) / 6) * (-13.19-(14.42)));
            yy = 0 + (((tickAnim - 81) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 6) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 89) {
            xx = -13.19 + (((tickAnim - 87) / 2) * (0-(-13.19)));
            yy = 0 + (((tickAnim - 87) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.35-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (0-(0)));
            yy = 0.45 + (((tickAnim - 12) / 11) * (0.29-(0.45)));
            zz = -0.35 + (((tickAnim - 12) / 11) * (-0.27-(-0.35)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 0.29 + (((tickAnim - 23) / 37) * (0.29-(0.29)));
            zz = -0.27 + (((tickAnim - 23) / 37) * (-0.27-(-0.27)));
        }
        else if (tickAnim >= 60 && tickAnim < 72) {
            xx = 0 + (((tickAnim - 60) / 12) * (0-(0)));
            yy = 0.29 + (((tickAnim - 60) / 12) * (1.45-(0.29)));
            zz = -0.27 + (((tickAnim - 60) / 12) * (0-(-0.27)));
        }
        else if (tickAnim >= 72 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 72) / 9) * (0-(0)));
            yy = 1.45 + (((tickAnim - 72) / 9) * (0.375-(1.45)));
            zz = 0 + (((tickAnim - 72) / 9) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 81) / 8) * (0-(0)));
            yy = 0.375 + (((tickAnim - 81) / 8) * (0-(0.375)));
            zz = 0 + (((tickAnim - 81) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (9.30662-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-9.68099-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.42424-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 9.30662 + (((tickAnim - 8) / 5) * (22.02996-(9.30662)));
            yy = -9.68099 + (((tickAnim - 8) / 5) * (-26.08721-(-9.68099)));
            zz = -3.42424 + (((tickAnim - 8) / 5) * (-14.504-(-3.42424)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 22.02996 + (((tickAnim - 13) / 10) * (5.41987-(22.02996)));
            yy = -26.08721 + (((tickAnim - 13) / 10) * (-29.04297-(-26.08721)));
            zz = -14.504 + (((tickAnim - 13) / 10) * (-10.27271-(-14.504)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 5.41987 + (((tickAnim - 23) / 37) * (5.41987-(5.41987)));
            yy = -29.04297 + (((tickAnim - 23) / 37) * (-29.04297-(-29.04297)));
            zz = -10.27271 + (((tickAnim - 23) / 37) * (-10.27271-(-10.27271)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 5.41987 + (((tickAnim - 60) / 8) * (-15.37881-(5.41987)));
            yy = -29.04297 + (((tickAnim - 60) / 8) * (-12.7063-(-29.04297)));
            zz = -10.27271 + (((tickAnim - 60) / 8) * (-4.49431-(-10.27271)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -15.37881 + (((tickAnim - 68) / 5) * (0-(-15.37881)));
            yy = -12.7063 + (((tickAnim - 68) / 5) * (0-(-12.7063)));
            zz = -4.49431 + (((tickAnim - 68) / 5) * (0-(-4.49431)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.47-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 2.47 + (((tickAnim - 8) / 5) * (2.95-(2.47)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 2.95 + (((tickAnim - 13) / 10) * (2.95-(2.95)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 2.95 + (((tickAnim - 23) / 37) * (2.95-(2.95)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            yy = 2.95 + (((tickAnim - 60) / 8) * (2.92-(2.95)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            yy = 2.92 + (((tickAnim - 68) / 5) * (3.5-(2.92)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            yy = 3.5 + (((tickAnim - 73) / 17) * (0-(3.5)));
            zz = 0 + (((tickAnim - 73) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (23.92-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 23.92 + (((tickAnim - 8) / 5) * (-0.58577-(23.92)));
            yy = 0 + (((tickAnim - 8) / 5) * (-4.49937-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (2.183-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -0.58577 + (((tickAnim - 13) / 10) * (18.25-(-0.58577)));
            yy = -4.49937 + (((tickAnim - 13) / 10) * (0-(-4.49937)));
            zz = 2.183 + (((tickAnim - 13) / 10) * (0-(2.183)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 18.25 + (((tickAnim - 23) / 37) * (18.25-(18.25)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 18.25 + (((tickAnim - 60) / 8) * (23.13-(18.25)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 23.13 + (((tickAnim - 68) / 5) * (-17.5-(23.13)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = -17.5 + (((tickAnim - 73) / 17) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (1.25-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.1 + (((tickAnim - 13) / 10) * (0-(0.1)));
            zz = 1.25 + (((tickAnim - 13) / 10) * (1.25-(1.25)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 1.25 + (((tickAnim - 23) / 37) * (1.25-(1.25)));
        }
        else if (tickAnim >= 60 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 30) * (0-(0)));
            zz = 1.25 + (((tickAnim - 60) / 30) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.67-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -18.67 + (((tickAnim - 8) / 5) * (3.75-(-18.67)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3.75 + (((tickAnim - 13) / 10) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 3.75 + (((tickAnim - 23) / 37) * (3.75-(3.75)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 3.75 + (((tickAnim - 60) / 8) * (-2.75-(3.75)));
            yy = 0 + (((tickAnim - 60) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = -2.75 + (((tickAnim - 68) / 5) * (3.5-(-2.75)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 3.5 + (((tickAnim - 73) / 17) * (0-(3.5)));
            yy = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));

        this.feetL.rotationPointX = this.feetL.rotationPointX + (float)(0);
        this.feetL.rotationPointY = this.feetL.rotationPointY - (float)(0);
        this.feetL.rotationPointZ = this.feetL.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15.4972-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.97356-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (1.49156-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 15.4972 + (((tickAnim - 8) / 3) * (-16.32223-(15.4972)));
            yy = 0.97356 + (((tickAnim - 8) / 3) * (0.27816-(0.97356)));
            zz = 1.49156 + (((tickAnim - 8) / 3) * (0.42616-(1.49156)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -16.32223 + (((tickAnim - 11) / 2) * (-8.75-(-16.32223)));
            yy = 0.27816 + (((tickAnim - 11) / 2) * (0-(0.27816)));
            zz = 0.42616 + (((tickAnim - 11) / 2) * (0-(0.42616)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = -8.75 + (((tickAnim - 13) / 10) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = -8.75 + (((tickAnim - 23) / 37) * (-8.75-(-8.75)));
            yy = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = -8.75 + (((tickAnim - 60) / 7) * (16.87-(-8.75)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 72) {
            xx = 16.87 + (((tickAnim - 67) / 5) * (4.96-(16.87)));
            yy = 0 + (((tickAnim - 67) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 5) * (0-(0)));
        }
        else if (tickAnim >= 72 && tickAnim < 73) {
            xx = 4.96 + (((tickAnim - 72) / 1) * (22-(4.96)));
            yy = 0 + (((tickAnim - 72) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 72) / 1) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 22 + (((tickAnim - 73) / 17) * (0-(22)));
            yy = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = 0.675 + (((tickAnim - 13) / 10) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 13) / 10) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 0.675 + (((tickAnim - 23) / 37) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            yy = 0.675 + (((tickAnim - 60) / 7) * (0.68-(0.675)));
            zz = 0 + (((tickAnim - 60) / 7) * (0.25-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 67) / 6) * (0-(0)));
            yy = 0.68 + (((tickAnim - 67) / 6) * (0.98-(0.68)));
            zz = 0.25 + (((tickAnim - 67) / 6) * (-0.05-(0.25)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 73) / 17) * (0-(0)));
            yy = 0.98 + (((tickAnim - 73) / 17) * (0-(0.98)));
            zz = -0.05 + (((tickAnim - 73) / 17) * (0-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(xx);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(yy);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 12) / 11) * (-68.79079-(0)));
            yy = 0 + (((tickAnim - 12) / 11) * (-4.39028-(0)));
            zz = 0 + (((tickAnim - 12) / 11) * (-32.01319-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -68.79079 + (((tickAnim - 23) / 5) * (-76.3792-(-68.79079)));
            yy = -4.39028 + (((tickAnim - 23) / 5) * (-11.26905-(-4.39028)));
            zz = -32.01319 + (((tickAnim - 23) / 5) * (-24.38092-(-32.01319)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -76.3792 + (((tickAnim - 28) / 6) * (-68.79079-(-76.3792)));
            yy = -11.26905 + (((tickAnim - 28) / 6) * (-4.39028-(-11.26905)));
            zz = -24.38092 + (((tickAnim - 28) / 6) * (-32.01319-(-24.38092)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = -68.79079 + (((tickAnim - 34) / 10) * (-27.3368-(-68.79079)));
            yy = -4.39028 + (((tickAnim - 34) / 10) * (4.79255-(-4.39028)));
            zz = -32.01319 + (((tickAnim - 34) / 10) * (-25.99623-(-32.01319)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = -27.3368 + (((tickAnim - 44) / 4) * (-13.6684-(-27.3368)));
            yy = 4.79255 + (((tickAnim - 44) / 4) * (2.39627-(4.79255)));
            zz = -25.99623 + (((tickAnim - 44) / 4) * (-12.99812-(-25.99623)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -13.6684 + (((tickAnim - 48) / 5) * (0-(-13.6684)));
            yy = 2.39627 + (((tickAnim - 48) / 5) * (0-(2.39627)));
            zz = -12.99812 + (((tickAnim - 48) / 5) * (0-(-12.99812)));
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
        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(xx), upperarmL.rotateAngleY + (float) Math.toRadians(yy), upperarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 12) / 41) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 41) * (0-(0)));
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
        this.upperarmL.rotationPointX = this.upperarmL.rotationPointX + (float)(xx);
        this.upperarmL.rotationPointY = this.upperarmL.rotationPointY - (float)(yy);
        this.upperarmL.rotationPointZ = this.upperarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (11-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11 + (((tickAnim - 23) / 5) * (31.71733-(11)));
            yy = 0 + (((tickAnim - 23) / 5) * (9.95134-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (13.61443-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 31.71733 + (((tickAnim - 28) / 6) * (11-(31.71733)));
            yy = 9.95134 + (((tickAnim - 28) / 6) * (0-(9.95134)));
            zz = 13.61443 + (((tickAnim - 28) / 6) * (0-(13.61443)));
        }
        else if (tickAnim >= 34 && tickAnim < 44) {
            xx = 11 + (((tickAnim - 34) / 10) * (-12-(11)));
            yy = 0 + (((tickAnim - 34) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 10) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 53) {
            xx = -12 + (((tickAnim - 44) / 9) * (0-(-12)));
            yy = 0 + (((tickAnim - 44) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 9) * (0-(0)));
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
        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(xx), lowerarmL.rotateAngleY + (float) Math.toRadians(yy), lowerarmL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 15) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 38) * (0-(0)));
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
        this.lowerarmL.rotationPointX = this.lowerarmL.rotationPointX + (float)(xx);
        this.lowerarmL.rotationPointY = this.lowerarmL.rotationPointY - (float)(yy);
        this.lowerarmL.rotationPointZ = this.lowerarmL.rotationPointZ + (float)(zz);




        if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 5) * (-38.75-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            yy = -38.75 + (((tickAnim - 28) / 6) * (26.75-(-38.75)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 34) / 7) * (0-(0)));
            yy = 26.75 + (((tickAnim - 34) / 7) * (-38.75-(26.75)));
            zz = 0 + (((tickAnim - 34) / 7) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 41) / 6) * (0-(0)));
            yy = -38.75 + (((tickAnim - 41) / 6) * (0-(-38.75)));
            zz = 0 + (((tickAnim - 41) / 6) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(xx), handL.rotateAngleY + (float) Math.toRadians(yy), handL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 19 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 19) / 9) * (-42-(0)));
            yy = 0 + (((tickAnim - 19) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 9) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = -42 + (((tickAnim - 28) / 6) * (0-(-42)));
            yy = 0 + (((tickAnim - 28) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 6) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 34) / 5) * (-42-(0)));
            yy = 0 + (((tickAnim - 34) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 5) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 45) {
            xx = -42 + (((tickAnim - 39) / 6) * (0-(-42)));
            yy = 0 + (((tickAnim - 39) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclawL, thumbclawL.rotateAngleX + (float) Math.toRadians(xx), thumbclawL.rotateAngleY + (float) Math.toRadians(yy), thumbclawL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.85), basin.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), basin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.8));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2.3), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.4));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*0.62), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.89), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1.45), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-0.35), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.2), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*0.25), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));



        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 37.5 + (((tickAnim - 22) / 6) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 24.59 + (((tickAnim - 28) / 8) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 7.29 + (((tickAnim - 36) / 4) * (0-(7.29)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 22) * (0.45-(1.05)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0.45 + (((tickAnim - 22) / 6) * (0.575-(0.45)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 28) / 8) * (2.02-(0.575)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 2.02 + (((tickAnim - 36) / 4) * (1.05-(2.02)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = -17.5 + (((tickAnim - 0) / 22) * (-20.25-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -20.25 + (((tickAnim - 22) / 6) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 23.3 + (((tickAnim - 28) / 12) * (-17.5-(23.3)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0.55-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 28) / 5) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 7) * (0-(0.8)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 2.5 + (((tickAnim - 0) / 22) * (6.5-(2.5)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 6.5 + (((tickAnim - 22) / 5) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 9.16 + (((tickAnim - 27) / 1) * (9.67-(9.16)));
            yy = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 1) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 9.67 + (((tickAnim - 28) / 7) * (-24.53-(9.67)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -24.53 + (((tickAnim - 35) / 5) * (2.5-(-24.53)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0.55-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 5) * (-0.27-(0.55)));
            zz = 0.225 + (((tickAnim - 30) / 5) * (-0.24-(0.225)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -0.27 + (((tickAnim - 35) / 5) * (0-(-0.27)));
            zz = -0.24 + (((tickAnim - 35) / 5) * (0-(-0.24)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetR.rotationPointX = this.feetR.rotationPointX + (float)(xx);
        this.feetR.rotationPointY = this.feetR.rotationPointY - (float)(yy);
        this.feetR.rotationPointZ = this.feetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 15.75 + (((tickAnim - 0) / 5) * (6.63-(15.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.63 + (((tickAnim - 5) / 5) * (-0.99-(6.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -0.99 + (((tickAnim - 10) / 6) * (-11.87-(-0.99)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -11.87 + (((tickAnim - 16) / 6) * (-23.75-(-11.87)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 22) / 6) * (0.94-(-23.75)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0.94 + (((tickAnim - 28) / 8) * (0.04-(0.94)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 0.04 + (((tickAnim - 36) / 2) * (7.07-(0.04)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 7.07 + (((tickAnim - 38) / 2) * (15.75-(7.07)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 5) * (1.375-(0.7)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 1.375 + (((tickAnim - 5) / 5) * (1.8-(1.375)));
            zz = -0.3 + (((tickAnim - 5) / 5) * (0-(-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 1.8 + (((tickAnim - 10) / 6) * (1.24-(1.8)));
            zz = 0 + (((tickAnim - 10) / 6) * (0.26-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 1.24 + (((tickAnim - 16) / 6) * (-0.125-(1.24)));
            zz = 0.26 + (((tickAnim - 16) / 6) * (0.425-(0.26)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = -0.125 + (((tickAnim - 22) / 18) * (0.7-(-0.125)));
            zz = 0.425 + (((tickAnim - 22) / 18) * (0-(0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-0.5), neck4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), neck4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(head2, head2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.85), head2.rotateAngleY + (float) Math.toRadians(0), head2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), upperarmR.rotateAngleY + (float) Math.toRadians(0), upperarmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), lowerarmR.rotateAngleY + (float) Math.toRadians(0), lowerarmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), handR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), handR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 0) / 8) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 24.59 + (((tickAnim - 8) / 9) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 7.29 + (((tickAnim - 17) / 5) * (-1.5-(7.29)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 22) / 18) * (37.5-(-1.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 8) * (0.575-(0.45)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 9) * (2.02-(0.575)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 2.02 + (((tickAnim - 17) / 5) * (1.05-(2.02)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 1.05 + (((tickAnim - 22) / 18) * (0.45-(1.05)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -20.25 + (((tickAnim - 0) / 9) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 23.3 + (((tickAnim - 9) / 13) * (-17.5-(23.3)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -17.5 + (((tickAnim - 22) / 18) * (-20.25-(-17.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 9) / 5) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 14) / 8) * (0-(0.8)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 6.5 + (((tickAnim - 0) / 9) * (15.41-(6.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 15.41 + (((tickAnim - 9) / 9) * (-24.53-(15.41)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -24.53 + (((tickAnim - 18) / 4) * (7-(-24.53)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 7 + (((tickAnim - 22) / 18) * (6.5-(7)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (-0.25-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = -0.25 + (((tickAnim - 18) / 4) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetL.rotationPointX = this.feetL.rotationPointX + (float)(xx);
        this.feetL.rotationPointY = this.feetL.rotationPointY - (float)(yy);
        this.feetL.rotationPointZ = this.feetL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -23.75 + (((tickAnim - 0) / 9) * (6.44-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 6.44 + (((tickAnim - 9) / 8) * (4.54-(6.44)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 4.54 + (((tickAnim - 17) / 2) * (7.07-(4.54)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 7.07 + (((tickAnim - 19) / 3) * (13-(7.07)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 13 + (((tickAnim - 22) / 3) * (6.56-(13)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 6.56 + (((tickAnim - 25) / 4) * (-1.58-(6.56)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -1.58 + (((tickAnim - 29) / 4) * (-7.34-(-1.58)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -7.34 + (((tickAnim - 33) / 7) * (-23.75-(-7.34)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = -0.025 + (((tickAnim - 0) / 22) * (0.825-(-0.025)));
            zz = 0.325 + (((tickAnim - 0) / 22) * (-0.25-(0.325)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.825 + (((tickAnim - 22) / 3) * (1.55-(0.825)));
            zz = -0.25 + (((tickAnim - 22) / 3) * (0.05-(-0.25)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 1.55 + (((tickAnim - 25) / 4) * (1.75-(1.55)));
            zz = 0.05 + (((tickAnim - 25) / 4) * (-0.225-(0.05)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 1.75 + (((tickAnim - 29) / 4) * (1.625-(1.75)));
            zz = -0.225 + (((tickAnim - 29) / 4) * (0-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 1.625 + (((tickAnim - 33) / 3) * (1.2-(1.625)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 1.2 + (((tickAnim - 36) / 4) * (-0.025-(1.2)));
            zz = 0 + (((tickAnim - 36) / 4) * (0.325-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(xx);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(yy);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), upperarmL.rotateAngleY + (float) Math.toRadians(0), upperarmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), lowerarmL.rotateAngleY + (float) Math.toRadians(0), lowerarmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), handL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), handL.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraLufengosaurus entity = (EntityPrehistoricFloraLufengosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.2), basin.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2.5), basin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.85));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.7), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.4), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.5 + (((tickAnim - 9) / 4) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 24.59 + (((tickAnim - 13) / 3) * (-0.21-(24.59)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.21 + (((tickAnim - 16) / 4) * (0-(-0.21)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegR, upperlegR.rotateAngleX + (float) Math.toRadians(xx), upperlegR.rotateAngleY + (float) Math.toRadians(yy), upperlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.75-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 3) * (2.645-(0.75)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 2.645 + (((tickAnim - 16) / 4) * (0-(2.645)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperlegR.rotationPointX = this.upperlegR.rotationPointX + (float)(xx);
        this.upperlegR.rotationPointY = this.upperlegR.rotationPointY - (float)(yy);
        this.upperlegR.rotationPointZ = this.upperlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -24.5 + (((tickAnim - 0) / 9) * (-20.25-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.25 + (((tickAnim - 9) / 4) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 23.3 + (((tickAnim - 13) / 3) * (19.24-(23.3)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 19.24 + (((tickAnim - 16) / 4) * (-24.5-(19.24)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegR, lowerlegR.rotateAngleX + (float) Math.toRadians(xx), lowerlegR.rotateAngleY + (float) Math.toRadians(yy), lowerlegR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 3) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 16) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegR.rotationPointX = this.lowerlegR.rotationPointX + (float)(xx);
        this.lowerlegR.rotationPointY = this.lowerlegR.rotationPointY - (float)(yy);
        this.lowerlegR.rotationPointZ = this.lowerlegR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -5.25 + (((tickAnim - 0) / 9) * (6.5-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.5 + (((tickAnim - 9) / 4) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.16 + (((tickAnim - 13) / 4) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -24.53 + (((tickAnim - 17) / 3) * (-5.25-(-24.53)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetR, feetR.rotateAngleX + (float) Math.toRadians(xx), feetR.rotateAngleY + (float) Math.toRadians(yy), feetR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 2) * (0.215-(0.3)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.215 + (((tickAnim - 5) / 4) * (0-(0.215)));
            zz = -0.025 + (((tickAnim - 5) / 4) * (0-(-0.025)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0.225-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 14) / 6) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 14) / 6) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetR.rotationPointX = this.feetR.rotationPointX + (float)(xx);
        this.feetR.rotationPointY = this.feetR.rotationPointY - (float)(yy);
        this.feetR.rotationPointZ = this.feetR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.25 + (((tickAnim - 0) / 3) * (9.51-(30.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 9.51 + (((tickAnim - 3) / 2) * (-1.49-(9.51)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -1.49 + (((tickAnim - 5) / 4) * (-21-(-1.49)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -21 + (((tickAnim - 9) / 4) * (5.69-(-21)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5.69 + (((tickAnim - 13) / 4) * (8.29-(5.69)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 8.29 + (((tickAnim - 17) / 1) * (7.07-(8.29)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.07 + (((tickAnim - 18) / 2) * (30.25-(7.07)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesR, toesR.rotateAngleX + (float) Math.toRadians(xx), toesR.rotateAngleY + (float) Math.toRadians(yy), toesR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 0) / 3) * (1.55-(0.875)));
            zz = -0.375 + (((tickAnim - 0) / 3) * (-0.3-(-0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.55 + (((tickAnim - 3) / 2) * (1.825-(1.55)));
            zz = -0.3 + (((tickAnim - 3) / 2) * (0-(-0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.825 + (((tickAnim - 5) / 3) * (1.25-(1.825)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.25 + (((tickAnim - 8) / 1) * (0.425-(1.25)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.525-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0.425 + (((tickAnim - 9) / 11) * (0.875-(0.425)));
            zz = 0.525 + (((tickAnim - 9) / 11) * (-0.375-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesR.rotationPointX = this.toesR.rotationPointX + (float)(xx);
        this.toesR.rotationPointY = this.toesR.rotationPointY - (float)(yy);
        this.toesR.rotationPointZ = this.toesR.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.8), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*3.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1.2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+180))*0.85), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*1.5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*1.2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+560))*0.85), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*1.8));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+560))*1.85), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1.8), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1.2));


        this.setRotateAngle(jaw2, jaw2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+55))*2.8), jaw2.rotateAngleY + (float) Math.toRadians(0), jaw2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarmR, upperarmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), upperarmR.rotateAngleY + (float) Math.toRadians(0), upperarmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerarmR, lowerarmR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*5.8), lowerarmR.rotateAngleY + (float) Math.toRadians(0), lowerarmR.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handR, handR.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), handR.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2.5), handR.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 24.59 + (((tickAnim - 3) / 4) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.29 + (((tickAnim - 7) / 3) * (-1.5-(7.29)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 10) / 10) * (37.5-(-1.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperlegL, upperlegL.rotateAngleX + (float) Math.toRadians(xx), upperlegL.rotateAngleY + (float) Math.toRadians(yy), upperlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 3) / 4) * (2.495-(0.975)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 2.495 + (((tickAnim - 7) / 3) * (0-(2.495)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
        this.upperlegL.rotationPointX = this.upperlegL.rotationPointX + (float)(xx);
        this.upperlegL.rotationPointY = this.upperlegL.rotationPointY - (float)(yy);
        this.upperlegL.rotationPointZ = this.upperlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -20.25 + (((tickAnim - 0) / 4) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 23.3 + (((tickAnim - 4) / 6) * (-27.25-(23.3)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.25 + (((tickAnim - 10) / 10) * (-20.25-(-27.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerlegL, lowerlegL.rotateAngleX + (float) Math.toRadians(xx), lowerlegL.rotateAngleY + (float) Math.toRadians(yy), lowerlegL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 2) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 6) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerlegL.rotationPointX = this.lowerlegL.rotationPointX + (float)(xx);
        this.lowerlegL.rotationPointY = this.lowerlegL.rotationPointY - (float)(yy);
        this.lowerlegL.rotationPointZ = this.lowerlegL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.5 + (((tickAnim - 0) / 4) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.16 + (((tickAnim - 4) / 4) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.53 + (((tickAnim - 8) / 2) * (-1.5-(-24.53)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 10) / 10) * (6.5-(-1.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feetL, feetL.rotateAngleX + (float) Math.toRadians(xx), feetL.rotateAngleY + (float) Math.toRadians(yy), feetL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 4) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 6) / 4) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feetL.rotationPointX = this.feetL.rotationPointX + (float)(xx);
        this.feetL.rotationPointY = this.feetL.rotationPointY - (float)(yy);
        this.feetL.rotationPointZ = this.feetL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -23.75 + (((tickAnim - 0) / 4) * (-2.31-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.31 + (((tickAnim - 4) / 3) * (2.54-(-2.31)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 2.54 + (((tickAnim - 7) / 3) * (29.75-(2.54)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 10) / 3) * (8.81-(29.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 8.81 + (((tickAnim - 13) / 3) * (-2.59-(8.81)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -2.59 + (((tickAnim - 16) / 2) * (-12.79-(-2.59)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12.79 + (((tickAnim - 18) / 2) * (-23.75-(-12.79)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toesL, toesL.rotateAngleX + (float) Math.toRadians(xx), toesL.rotateAngleY + (float) Math.toRadians(yy), toesL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 10) * (1.075-(0.175)));
            zz = 0.575 + (((tickAnim - 0) / 10) * (-0.325-(0.575)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.075 + (((tickAnim - 10) / 3) * (2.35-(1.075)));
            zz = -0.325 + (((tickAnim - 10) / 3) * (0.025-(-0.325)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 2.35 + (((tickAnim - 13) / 3) * (2.1-(2.35)));
            zz = 0.025 + (((tickAnim - 13) / 3) * (0-(0.025)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 2.1 + (((tickAnim - 16) / 2) * (1.425-(2.1)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.425 + (((tickAnim - 18) / 2) * (0.175-(1.425)));
            zz = 0 + (((tickAnim - 18) / 2) * (0.575-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toesL.rotationPointX = this.toesL.rotationPointX + (float)(xx);
        this.toesL.rotationPointY = this.toesL.rotationPointY - (float)(yy);
        this.toesL.rotationPointZ = this.toesL.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperarmL, upperarmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), upperarmL.rotateAngleY + (float) Math.toRadians(0), upperarmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(lowerarmL, lowerarmL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*5.8), lowerarmL.rotateAngleY + (float) Math.toRadians(0), lowerarmL.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(handL, handL.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), handL.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2.5), handL.rotateAngleZ + (float) Math.toRadians(0));


    }
        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLufengosaurus e = (EntityPrehistoricFloraLufengosaurus) entity;
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
