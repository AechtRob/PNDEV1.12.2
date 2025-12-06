package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraValdotriton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelValdotriton extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;

    private ModelAnimator animator;

    public ModelValdotriton() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 23.3F, 4.5F);
        this.hips.cubeList.add(new ModelBox(hips, 12, 13, -1.0F, -1.0F, -2.0F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 17, -1.0F, -1.0F, -2.0F, 2, 1, 3, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.55F, 1.0F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1745F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 7, -0.5F, 0.0F, -0.25F, 1, 1, 5, 0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 7, -0.5F, -0.5F, -0.1F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 13, -0.5F, -0.5F, 0.0F, 1, 1, 5, -0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, -0.6F, -0.1F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, 0.1745F, -0.6545F, -0.48F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 23, -1.275F, -0.5F, -0.5F, 2, 1, 1, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-1.25F, -0.5F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, 0.0F, -1.0908F);
        this.legright2.cubeList.add(new ModelBox(legright2, 24, 7, -1.025F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 24, 9, -1.275F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-1.225F, 0.25F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.0873F, 0.0F, 1.4399F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.375F, 0.0F, 0.0F);
        this.legright3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 21, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, -0.6F, -0.1F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, 0.1745F, 0.6545F, 0.48F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 23, -0.725F, -0.5F, -0.5F, 2, 1, 1, 0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(1.25F, -0.5F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0F, 1.0908F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 24, 7, 0.025F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 24, 9, 0.275F, 0.0F, -0.5F, 1, 1, 1, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(1.225F, 0.25F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0873F, 0.0F, -1.4399F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.375F, 0.0F, 0.0F);
        this.legleft3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.6981F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 21, -1.0F, 0.0F, -1.0F, 2, 0, 2, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.5F, -2.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -0.425F, -4.475F, 2, 2, 5, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 14, 0, -1.0F, 0.5F, -2.75F, 2, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.65F, -0.75F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -1.0F, -1.0F, -2.0F, 2, 1, 3, -0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.0F, 0.9F, -2.15F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.0873F, 0.6109F, -0.1745F);
        this.armright.cubeList.add(new ModelBox(armright, 22, 19, -1.1F, -0.6F, -0.5F, 2, 1, 1, 0.01F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-0.95F, 0.0F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.1745F, -0.0873F, -1.0908F);
        this.armright2.cubeList.add(new ModelBox(armright2, 6, 23, -0.625F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.armright2.cubeList.add(new ModelBox(armright2, 24, 2, -1.3F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-1.2F, -0.25F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, -0.1745F, -1.1345F, 1.3963F);
        this.armright3.cubeList.add(new ModelBox(armright3, 16, 25, -1.025F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.0F, 0.9F, -2.15F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0873F, -0.6109F, 0.1745F);
        this.armleft.cubeList.add(new ModelBox(armleft, 22, 19, -0.9F, -0.6F, -0.5F, 2, 1, 1, 0.01F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.95F, 0.0F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.1745F, 0.0873F, 1.0908F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 6, 23, -0.375F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.armleft2.cubeList.add(new ModelBox(armleft2, 24, 2, 0.3F, -0.5F, -0.5F, 1, 1, 1, -0.01F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(1.2F, -0.25F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, -0.1745F, 1.1345F, -1.3963F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 16, 25, 0.025F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.65F, -2.5F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.1309F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 18, 23, -1.0F, -0.15F, -1.1F, 2, 1, 1, 0.01F, false));
        this.neck.cubeList.add(new ModelBox(neck, 24, 0, -1.0F, -0.75F, -1.1F, 2, 1, 1, -0.02F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.65F, -0.15F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 25, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.02F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 0.65F, -0.15F);
        this.neck.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3491F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 25, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.02F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 24, 11, -0.5F, -0.5F, -2.75F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 4, -1.0F, -0.525F, -1.74F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, -0.825F, -1.775F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 13, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.02F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 13, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.175F, 0.5F, -2.975F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 23, -1.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 0.5F, -2.75F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 4, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.175F, 0.5F, -2.975F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1309F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 23, 0.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, -2.75F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.48F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 22, 4, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.5F, -2.725F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3491F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 4, 25, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.35F, 0.35F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 21, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.4451F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 22, 16, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.075F, 0.5F, -3.3F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1309F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 25, -1.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.075F, 0.5F, -3.3F);
        this.jaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.1309F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 25, 0.0F, -1.0F, 2.0F, 1, 1, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.4451F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 16, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.02F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(0.0F, -0.7F, -1.45F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, -0.0873F, -0.3927F, 0.2182F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 8, 25, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.0F, -0.7F, -1.45F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, -0.0873F, 0.3927F, -0.2182F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 8, 25, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -1.5F;
        this.hips.offsetX = 0F;
        this.hips.offsetZ = 2.5F;
        this.hips.rotateAngleY = (float)Math.toRadians(235);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 4.2F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hips, 0.2F, 3.8F, -0.1F);
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.hips.rotateAngleX = (float) Math.toRadians(90);
        this.hips.offsetY = -0.2F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.105F;
        this.hips.render(0.01F);
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

        EntityPrehistoricFloraValdotriton entityValdotriton = (EntityPrehistoricFloraValdotriton) e;


        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        entityValdotriton.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityValdotriton.getAnimation() == entityValdotriton.LAY_ANIMATION) {

        }
        else {
            if (!entityValdotriton.isReallyInWater()) {

                if (f3 == 0.0F || !entityValdotriton.getIsMoving()) {
                    if (entityValdotriton.getAnimation() != entityValdotriton.ATTACK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.1F * 0.1F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.05F, 0.12F, f2, 1F);


                    return;
                }

                if (entityValdotriton.getIsFast()) { //Running


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

        EntityPrehistoricFloraValdotriton ee = (EntityPrehistoricFloraValdotriton) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

            }
        } else {
            //Swimming pose:
            //moving in water
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        if (ee.getAnimation() == ee.ROAR_ANIMATION) {
            animCroak(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdotriton entity = (EntityPrehistoricFloraValdotriton) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 4) / 6) * (0-(-8)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -12.75 + (((tickAnim - 4) / 6) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-0.225-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = -0.225 + (((tickAnim - 4) / 6) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (41.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 41.75 + (((tickAnim - 4) / 2) * (0-(41.75)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animCroak(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraValdotriton entity = (EntityPrehistoricFloraValdotriton) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 5) / 5) * (-18.25-(-8.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -18.25 + (((tickAnim - 10) / 3) * (-8.75-(-18.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -8.75 + (((tickAnim - 13) / 5) * (-18.25-(-8.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.25 + (((tickAnim - 18) / 2) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.75 + (((tickAnim - 5) / 5) * (11.75-(-5.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 10) / 3) * (-5.75-(11.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5.75 + (((tickAnim - 13) / 5) * (11.75-(-5.75)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 11.75 + (((tickAnim - 18) / 2) * (0-(11.75)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 5) / 5) * (0-(30)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (30-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 30 + (((tickAnim - 13) / 5) * (0-(30)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraValdotriton entity = (EntityPrehistoricFloraValdotriton) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-15), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*10));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-10), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-25), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-35), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(65.60242), legright.rotateAngleY + (float) Math.toRadians(84.78518), legright.rotateAngleZ + (float) Math.toRadians(11.92186));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(0), legright3.rotateAngleY + (float) Math.toRadians(0), legright3.rotateAngleZ + (float) Math.toRadians(-63));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(65.60242), legleft.rotateAngleY + (float) Math.toRadians(-84.78518), legleft.rotateAngleZ + (float) Math.toRadians(-11.92186));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(0), legleft3.rotateAngleY + (float) Math.toRadians(0), legleft3.rotateAngleZ + (float) Math.toRadians(63));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*15), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*15), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(70.78521), armright.rotateAngleY + (float) Math.toRadians(18.58716), armright.rotateAngleZ + (float) Math.toRadians(-5.60074));
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(0), armright2.rotateAngleY + (float) Math.toRadians(0), armright2.rotateAngleZ + (float) Math.toRadians(31.25));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(5.3368), armright3.rotateAngleY + (float) Math.toRadians(64.19401), armright3.rotateAngleZ + (float) Math.toRadians(-100.87623));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(70.78521), armleft.rotateAngleY + (float) Math.toRadians(-18.58716), armleft.rotateAngleZ + (float) Math.toRadians(5.60074));
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(0), armleft2.rotateAngleY + (float) Math.toRadians(0), armleft2.rotateAngleZ + (float) Math.toRadians(-31.25));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(5.3368), armleft3.rotateAngleY + (float) Math.toRadians(-64.19401), armleft3.rotateAngleZ + (float) Math.toRadians(100.87623));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*-15), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-300))*15), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraValdotriton entity = (EntityPrehistoricFloraValdotriton) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*6), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.3);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (29.53799-(0)));
            yy = -17.25 + (((tickAnim - 0) / 10) * (79.93876-(-17.25)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.66417-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 29.53799 + (((tickAnim - 10) / 5) * (7.04894-(29.53799)));
            yy = 79.93876 + (((tickAnim - 10) / 5) * (18.28062-(79.93876)));
            zz = -1.66417 + (((tickAnim - 10) / 5) * (33.11337-(-1.66417)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.04894 + (((tickAnim - 15) / 5) * (0-(7.04894)));
            yy = 18.28062 + (((tickAnim - 15) / 5) * (-17.25-(18.28062)));
            zz = 33.11337 + (((tickAnim - 15) / 5) * (0-(33.11337)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.25-(0)));
            zz = 19.75 + (((tickAnim - 0) / 10) * (0-(19.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (3.2944-(0)));
            yy = 18.25 + (((tickAnim - 10) / 5) * (8.51426-(18.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (31.1203-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 3.2944 + (((tickAnim - 15) / 5) * (0-(3.2944)));
            yy = 8.51426 + (((tickAnim - 15) / 5) * (0-(8.51426)));
            zz = 31.1203 + (((tickAnim - 15) / 5) * (19.75-(31.1203)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-16.53797-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-33.4924-(0)));
            zz = -31.5 + (((tickAnim - 0) / 3) * (-15.72787-(-31.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -16.53797 + (((tickAnim - 3) / 2) * (-55.83842-(-16.53797)));
            yy = -33.4924 + (((tickAnim - 3) / 2) * (-54.96738-(-33.4924)));
            zz = -15.72787 + (((tickAnim - 3) / 2) * (44.43173-(-15.72787)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -55.83842 + (((tickAnim - 5) / 5) * (0-(-55.83842)));
            yy = -54.96738 + (((tickAnim - 5) / 5) * (0-(-54.96738)));
            zz = 44.43173 + (((tickAnim - 5) / 5) * (-59.25-(44.43173)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (20.62826-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (17.22694-(0)));
            zz = -59.25 + (((tickAnim - 10) / 5) * (-88.22697-(-59.25)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 20.62826 + (((tickAnim - 15) / 3) * (-4.48057-(20.62826)));
            yy = 17.22694 + (((tickAnim - 15) / 3) * (5.14625-(17.22694)));
            zz = -88.22697 + (((tickAnim - 15) / 3) * (-47.76462-(-88.22697)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -4.48057 + (((tickAnim - 18) / 2) * (0-(-4.48057)));
            yy = 5.14625 + (((tickAnim - 18) / 2) * (0-(5.14625)));
            zz = -47.76462 + (((tickAnim - 18) / 2) * (-31.5-(-47.76462)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.255-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.09-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.255 + (((tickAnim - 3) / 2) * (0.15-(0.255)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -0.09 + (((tickAnim - 3) / 2) * (-0.175-(-0.09)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.15 + (((tickAnim - 5) / 5) * (0-(0.15)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.175 + (((tickAnim - 5) / 5) * (0-(-0.175)));
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
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.53799 + (((tickAnim - 0) / 5) * (10.35118-(29.53799)));
            yy = -79.93876 + (((tickAnim - 0) / 5) * (-20.94619-(-79.93876)));
            zz = 1.66417 + (((tickAnim - 0) / 5) * (-31.66864-(1.66417)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 10.35118 + (((tickAnim - 5) / 6) * (0-(10.35118)));
            yy = -20.94619 + (((tickAnim - 5) / 6) * (17.25-(-20.94619)));
            zz = -31.66864 + (((tickAnim - 5) / 6) * (0-(-31.66864)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (29.53799-(0)));
            yy = 17.25 + (((tickAnim - 11) / 9) * (-79.93876-(17.25)));
            zz = 0 + (((tickAnim - 11) / 9) * (1.66417-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.35323-(0)));
            yy = -18.25 + (((tickAnim - 0) / 5) * (-8.25287-(-18.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (-42.25187-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5.35323 + (((tickAnim - 5) / 3) * (3.28634-(5.35323)));
            yy = -8.25287 + (((tickAnim - 5) / 3) * (-2.64092-(-8.25287)));
            zz = -42.25187 + (((tickAnim - 5) / 3) * (-47.64859-(-42.25187)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.28634 + (((tickAnim - 8) / 3) * (0-(3.28634)));
            yy = -2.64092 + (((tickAnim - 8) / 3) * (0-(-2.64092)));
            zz = -47.64859 + (((tickAnim - 8) / 3) * (-19.75-(-47.64859)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (-18.25-(0)));
            zz = -19.75 + (((tickAnim - 11) / 9) * (0-(-19.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.92792-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-19.65657-(0)));
            zz = 59.25 + (((tickAnim - 0) / 5) * (111.59888-(59.25)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -7.92792 + (((tickAnim - 5) / 6) * (6.67655-(-7.92792)));
            yy = -19.65657 + (((tickAnim - 5) / 6) * (1.32095-(-19.65657)));
            zz = 111.59888 + (((tickAnim - 5) / 6) * (25.13507-(111.59888)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 6.67655 + (((tickAnim - 11) / 4) * (-32.73121-(6.67655)));
            yy = 1.32095 + (((tickAnim - 11) / 4) * (24.73906-(1.32095)));
            zz = 25.13507 + (((tickAnim - 11) / 4) * (-12.40748-(25.13507)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -32.73121 + (((tickAnim - 15) / 5) * (0-(-32.73121)));
            yy = 24.73906 + (((tickAnim - 15) / 5) * (0-(24.73906)));
            zz = -12.40748 + (((tickAnim - 15) / 5) * (59.25-(-12.40748)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 5) / 6) * (0-(-0.25)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-0.075-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (-0.08-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.075 + (((tickAnim - 15) / 5) * (0-(-0.075)));
            yy = -0.08 + (((tickAnim - 15) / 5) * (0-(-0.08)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*6), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*6), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*2));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (3.89198-(0)));
            yy = 26.25 + (((tickAnim - 0) / 5) * (-24.2544-(26.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (16.8787-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 3.89198 + (((tickAnim - 5) / 4) * (0.51738-(3.89198)));
            yy = -24.2544 + (((tickAnim - 5) / 4) * (-62.40834-(-24.2544)));
            zz = 16.8787 + (((tickAnim - 5) / 4) * (-1.12217-(16.8787)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0.51738 + (((tickAnim - 9) / 11) * (0-(0.51738)));
            yy = -62.40834 + (((tickAnim - 9) / 11) * (26.25-(-62.40834)));
            zz = -1.12217 + (((tickAnim - 9) / 11) * (0-(-1.12217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 37.5 + (((tickAnim - 0) / 5) * (50.55-(37.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 50.55 + (((tickAnim - 5) / 4) * (0-(50.55)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (37.5-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 81.82234 + (((tickAnim - 0) / 5) * (85.94488-(81.82234)));
            yy = 82.33329 + (((tickAnim - 0) / 5) * (70.50437-(82.33329)));
            zz = -76.49209 + (((tickAnim - 0) / 5) * (-106.43014-(-76.49209)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 85.94488 + (((tickAnim - 5) / 4) * (0-(85.94488)));
            yy = 70.50437 + (((tickAnim - 5) / 4) * (0-(70.50437)));
            zz = -106.43014 + (((tickAnim - 5) / 4) * (0-(-106.43014)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (81.82234-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (82.33329-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (-76.49209-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0.51738 + (((tickAnim - 0) / 10) * (0-(0.51738)));
            yy = 62.40834 + (((tickAnim - 0) / 10) * (-26.25-(62.40834)));
            zz = 1.12217 + (((tickAnim - 0) / 10) * (0-(1.12217)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (7.44595-(0)));
            yy = -26.25 + (((tickAnim - 10) / 5) * (22.31919-(-26.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (-27.0445-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 7.44595 + (((tickAnim - 15) / 5) * (0.51738-(7.44595)));
            yy = 22.31919 + (((tickAnim - 15) / 5) * (62.40834-(22.31919)));
            zz = -27.0445 + (((tickAnim - 15) / 5) * (1.12217-(-27.0445)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-37.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -37.5 + (((tickAnim - 10) / 5) * (-36-(-37.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -36 + (((tickAnim - 15) / 5) * (0-(-36)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.81627-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (8.43865-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (38.36518-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.81627 + (((tickAnim - 5) / 5) * (81.82234-(12.81627)));
            yy = 8.43865 + (((tickAnim - 5) / 5) * (-82.33329-(8.43865)));
            zz = 38.36518 + (((tickAnim - 5) / 5) * (76.49209-(38.36518)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 81.82234 + (((tickAnim - 10) / 5) * (55.39568-(81.82234)));
            yy = -82.33329 + (((tickAnim - 10) / 5) * (-80.41949-(-82.33329)));
            zz = 76.49209 + (((tickAnim - 10) / 5) * (110.14778-(76.49209)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 55.39568 + (((tickAnim - 15) / 5) * (0-(55.39568)));
            yy = -80.41949 + (((tickAnim - 15) / 5) * (0-(-80.41949)));
            zz = 110.14778 + (((tickAnim - 15) / 5) * (0-(110.14778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*6), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+220))*6), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraValdotriton e = (EntityPrehistoricFloraValdotriton) entity;
        animator.update(entity);

    }
}
