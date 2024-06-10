package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStanocephalosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStanocephalosaurus extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer armL;
    private final AdvancedModelRenderer armL2;
    private final AdvancedModelRenderer armL3;
    private final AdvancedModelRenderer armR;
    private final AdvancedModelRenderer armR2;
    private final AdvancedModelRenderer armR3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;

    private ModelAnimator animator;

    public ModelStanocephalosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 19.4F, 9.75F);
        this.setRotateAngle(body3, -0.0873F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 13, 20, -2.5F, 0.375F, -1.0F, 5, 3, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.95F, -9.25F);
        this.body3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 33, -2.0F, 2.675F, 7.85F, 4, 1, 4, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(2.25F, 1.75F, 1.75F);
        this.body3.addChild(legL);
        this.setRotateAngle(legL, 0.0F, -0.3491F, 0.0873F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 23, -0.5F, 0.0F, -0.5F, 3, 1, 1, 0.2F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(2.75F, 0.4F, 0.0F);
        this.legL.addChild(legL2);
        this.setRotateAngle(legL2, 0.0436F, -1.3963F, 1.2217F);
        this.legL2.cubeList.add(new ModelBox(legL2, 36, 6, 0.0F, -0.01F, -0.49F, 2, 1, 1, 0.1F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.legL2.addChild(legL3);
        this.setRotateAngle(legL3, -0.5672F, 1.2654F, 0.6545F);
        this.legL3.cubeList.add(new ModelBox(legL3, 0, 19, 0.0F, -1.01F, -1.64F, 1, 2, 2, 0.1F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-2.25F, 1.75F, 1.75F);
        this.body3.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.3491F, -0.0873F);
        this.legR.cubeList.add(new ModelBox(legR, 0, 15, -2.5F, 0.0F, -0.5F, 3, 1, 1, 0.2F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-2.75F, 0.4F, 0.0F);
        this.legR.addChild(legR2);
        this.setRotateAngle(legR2, 0.0436F, 1.3963F, -1.2217F);
        this.legR2.cubeList.add(new ModelBox(legR2, 31, 25, -2.0F, -0.01F, -0.49F, 2, 1, 1, 0.1F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.legR2.addChild(legR3);
        this.setRotateAngle(legR3, -0.5672F, -1.2654F, -0.6545F);
        this.legR3.cubeList.add(new ModelBox(legR3, 13, 13, -1.0F, -1.01F, -1.64F, 1, 2, 2, 0.1F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.75F, 3.0F);
        this.body3.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 26, 10, -1.5F, -0.325F, -1.0F, 3, 3, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 18, -1.0F, -0.3245F, -1.0218F, 2, 2, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 27, 38, -0.5F, 0.1755F, -1.0218F, 1, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 19, 27, -3.0F, -0.725F, -3.0F, 6, 3, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.15F, -9.25F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 25, -2.49F, 2.825F, 5.85F, 5, 1, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 1.0F, -1.75F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.0436F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.825F, -5.25F, 7, 4, 5, 0.0F, false));

        this.armL = new AdvancedModelRenderer(this);
        this.armL.setRotationPoint(3.0F, 0.0F, -5.0F);
        this.body.addChild(armL);
        this.setRotateAngle(armL, 0.0F, -0.3491F, 0.3491F);
        this.armL.cubeList.add(new ModelBox(armL, 27, 20, -0.5F, 0.0F, -0.5F, 3, 1, 1, 0.2F, false));

        this.armL2 = new AdvancedModelRenderer(this);
        this.armL2.setRotationPoint(2.75F, 0.4F, 0.0F);
        this.armL.addChild(armL2);
        this.setRotateAngle(armL2, 0.0F, 1.309F, 1.2217F);
        this.armL2.cubeList.add(new ModelBox(armL2, 40, 18, 0.0F, -0.01F, -0.49F, 2, 1, 1, 0.1F, false));

        this.armL3 = new AdvancedModelRenderer(this);
        this.armL3.setRotationPoint(1.75F, 0.5F, -0.3F);
        this.armL2.addChild(armL3);
        this.setRotateAngle(armL3, 0.0F, -1.1868F, 0.0F);
        this.armL3.cubeList.add(new ModelBox(armL3, 26, 33, 0.0F, -1.01F, -1.39F, 1, 2, 2, 0.0F, false));

        this.armR = new AdvancedModelRenderer(this);
        this.armR.setRotationPoint(-3.0F, 0.0F, -5.0F);
        this.body.addChild(armR);
        this.setRotateAngle(armR, 0.0F, 0.3491F, -0.3491F);
        this.armR.cubeList.add(new ModelBox(armR, 0, 25, -2.5F, 0.0F, -0.5F, 3, 1, 1, 0.2F, false));

        this.armR2 = new AdvancedModelRenderer(this);
        this.armR2.setRotationPoint(-2.75F, 0.4F, 0.0F);
        this.armR.addChild(armR2);
        this.setRotateAngle(armR2, 0.0F, -1.309F, -1.2217F);
        this.armR2.cubeList.add(new ModelBox(armR2, 37, 12, -2.0F, -0.01F, -0.49F, 2, 1, 1, 0.1F, false));

        this.armR3 = new AdvancedModelRenderer(this);
        this.armR3.setRotationPoint(-1.75F, 0.5F, -0.3F);
        this.armR2.addChild(armR3);
        this.setRotateAngle(armR3, 0.0F, 1.1868F, 0.0F);
        this.armR3.cubeList.add(new ModelBox(armR3, 13, 29, -1.0F, -1.01F, -1.39F, 1, 2, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -5.25F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 28, 0, -3.0F, -1.8F, -2.0F, 6, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, -2.0F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 34, -2.5F, -0.975F, 0.0F, 5, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -2.75F);
        this.neck.addChild(head);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 37, 6, -0.99F, 0.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 33, 29, -1.99F, 0.01F, -3.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.288F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 10, 0.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1134F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 29, -2.0F, -1.0F, 4.0F, 4, 1, 5, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 6, -1.5F, -1.0F, 2.0F, 3, 1, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 9, -1.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.0F, -8.0F);
        this.lowerjaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.288F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -2.0F, -1.01F, 0.0F, 2, 1, 9, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(upperjaw);
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 0, 35, -1.0F, -1.01F, -8.0F, 2, 1, 5, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 9, 35, -1.5F, -1.01F, -3.0F, 3, 1, 1, 0.0F, false));
        this.upperjaw.cubeList.add(new ModelBox(upperjaw, 34, 38, -2.0F, -1.01F, -2.0F, 4, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3054F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 12, -2.375F, -1.85F, -1.875F, 2, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.upperjaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.3054F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 10, 0.375F, -1.85F, -1.875F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3054F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 19, 0.0F, -0.99F, 0.0F, 2, 1, 9, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0436F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.75F, -1.5F, 4.75F, 1, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 2, -1.75F, -1.5F, 4.75F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 38, -1.49F, -1.0F, 5.0F, 3, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 9, 38, -1.0F, -1.0F, 0.0F, 2, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.0F, -8.0F);
        this.upperjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.3054F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, -2.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body3.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(neck, -0.1F, -0.1F, 0.0F);
        this.setRotateAngle(head, -0.2F, -0.2F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.28F, 0.0F, 0.0F);
        this.body3.offsetZ = -0.065F;
        this.body3.offsetY = -0.065F;
        this.body3.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.neck.rotateAngleX = (float) Math.toRadians(20);
        this.setRotateAngle(head, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(lowerjaw, 0.4F, 0.0F, 0.0F);
        this.neck.offsetY = -0.02F;
        this.neck.offsetX = 0.0F;
        this.neck.offsetZ = 0.1F;
        this.neck.render(0.01F);
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
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        this.body3.offsetZ = -0.5F;
        //this.faceTarget(f3, f4, 5, neck);
        EntityPrehistoricFloraStanocephalosaurus stano = (EntityPrehistoricFloraStanocephalosaurus) e;
        this.faceTarget(f3, f4, 6, head);
        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
        stano.tailBuffer.applyChainSwingBuffer(Tail);

        if (f3 == 0.0F || !stano.getIsMoving()) {
            if (stano.getAnimation() != stano.ATTACK_ANIMATION) {
                this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);
            }

            return;
        }

        if (stano.getIsFast()) { //Running


        } else { //Walking

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStanocephalosaurus ee = (EntityPrehistoricFloraStanocephalosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStanocephalosaurus entity = (EntityPrehistoricFloraStanocephalosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*10), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*0.5);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.97576-(0)));
            yy = 50 + (((tickAnim - 0) / 20) * (-29.93505-(50)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.88581-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 2.97576 + (((tickAnim - 20) / 20) * (0-(2.97576)));
            yy = -29.93505 + (((tickAnim - 20) / 20) * (50-(-29.93505)));
            zz = -3.88581 + (((tickAnim - 20) / 20) * (0-(-3.88581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 10) / 10) * (0.17-(0.25)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 20) / 20) * (0-(0.17)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL.rotationPointX = this.legL.rotationPointX + (float)(xx);
        this.legL.rotationPointY = this.legL.rotationPointY - (float)(yy);
        this.legL.rotationPointZ = this.legL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (79.27486-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (33.74589-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-64.99393-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 79.27486 + (((tickAnim - 20) / 10) * (82.10092-(79.27486)));
            yy = 33.74589 + (((tickAnim - 20) / 10) * (29.25398-(33.74589)));
            zz = -64.99393 + (((tickAnim - 20) / 10) * (-79.16161-(-64.99393)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 82.10092 + (((tickAnim - 30) / 5) * (67.41157-(82.10092)));
            yy = 29.25398 + (((tickAnim - 30) / 5) * (51.55949-(29.25398)));
            zz = -79.16161 + (((tickAnim - 30) / 5) * (-73.41913-(-79.16161)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 67.41157 + (((tickAnim - 35) / 5) * (0-(67.41157)));
            yy = 51.55949 + (((tickAnim - 35) / 5) * (0-(51.55949)));
            zz = -73.41913 + (((tickAnim - 35) / 5) * (0-(-73.41913)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL2.rotationPointX = this.legL2.rotationPointX + (float)(xx);
        this.legL2.rotationPointY = this.legL2.rotationPointY - (float)(yy);
        this.legL2.rotationPointZ = this.legL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -7.5 + (((tickAnim - 0) / 10) * (-16.25-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (6.37624-(0)));
            yy = -16.25 + (((tickAnim - 10) / 5) * (-15.66721-(-16.25)));
            zz = 0 + (((tickAnim - 10) / 5) * (7.72163-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.37624 + (((tickAnim - 15) / 5) * (0-(6.37624)));
            yy = -15.66721 + (((tickAnim - 15) / 5) * (-107.5-(-15.66721)));
            zz = 7.72163 + (((tickAnim - 15) / 5) * (0-(7.72163)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (-43.82317-(0)));
            yy = -107.5 + (((tickAnim - 20) / 10) * (-49.89816-(-107.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (61.93638-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -43.82317 + (((tickAnim - 30) / 5) * (-19.185-(-43.82317)));
            yy = -49.89816 + (((tickAnim - 30) / 5) * (-21.68336-(-49.89816)));
            zz = 61.93638 + (((tickAnim - 30) / 5) * (36.90698-(61.93638)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -19.185 + (((tickAnim - 35) / 3) * (-22.80941-(-19.185)));
            yy = -21.68336 + (((tickAnim - 35) / 3) * (-16.94151-(-21.68336)));
            zz = 36.90698 + (((tickAnim - 35) / 3) * (2.54941-(36.90698)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -22.80941 + (((tickAnim - 38) / 2) * (0-(-22.80941)));
            yy = -16.94151 + (((tickAnim - 38) / 2) * (-7.5-(-16.94151)));
            zz = 2.54941 + (((tickAnim - 38) / 2) * (0-(2.54941)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 20) * (0-(-0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0.21-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0.105-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            yy = 0.21 + (((tickAnim - 35) / 3) * (0.125-(0.21)));
            zz = 0.105 + (((tickAnim - 35) / 3) * (-0.02-(0.105)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 38) / 2) * (0-(0.125)));
            zz = -0.02 + (((tickAnim - 38) / 2) * (-0.25-(-0.02)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legL3.rotationPointX = this.legL3.rotationPointX + (float)(xx);
        this.legL3.rotationPointY = this.legL3.rotationPointY - (float)(yy);
        this.legL3.rotationPointZ = this.legL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 2.97576 + (((tickAnim - 0) / 20) * (0-(2.97576)));
            yy = 29.9351 + (((tickAnim - 0) / 20) * (-50-(29.9351)));
            zz = 3.8858 + (((tickAnim - 0) / 20) * (0-(3.8858)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (2.97576-(0)));
            yy = -50 + (((tickAnim - 20) / 20) * (29.9351-(-50)));
            zz = 0 + (((tickAnim - 20) / 20) * (3.8858-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.17 + (((tickAnim - 0) / 20) * (0-(0.17)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0.25-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 30) / 10) * (0.17-(0.25)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR.rotationPointX = this.legR.rotationPointX + (float)(xx);
        this.legR.rotationPointY = this.legR.rotationPointY - (float)(yy);
        this.legR.rotationPointZ = this.legR.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 79.27486 + (((tickAnim - 0) / 10) * (82.10092-(79.27486)));
            yy = -33.7459 + (((tickAnim - 0) / 10) * (-29.254-(-33.7459)));
            zz = 64.9939 + (((tickAnim - 0) / 10) * (79.1616-(64.9939)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 82.10092 + (((tickAnim - 10) / 5) * (67.41157-(82.10092)));
            yy = -29.254 + (((tickAnim - 10) / 5) * (-51.5595-(-29.254)));
            zz = 79.1616 + (((tickAnim - 10) / 5) * (73.4191-(79.1616)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 67.41157 + (((tickAnim - 15) / 5) * (0-(67.41157)));
            yy = -51.5595 + (((tickAnim - 15) / 5) * (0-(-51.5595)));
            zz = 73.4191 + (((tickAnim - 15) / 5) * (0-(73.4191)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (79.27486-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (-33.7459-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (64.9939-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-43.82317-(0)));
            yy = 107.5 + (((tickAnim - 0) / 10) * (49.8982-(107.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (-61.9364-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -43.82317 + (((tickAnim - 10) / 5) * (-19.185-(-43.82317)));
            yy = 49.8982 + (((tickAnim - 10) / 5) * (21.6834-(49.8982)));
            zz = -61.9364 + (((tickAnim - 10) / 5) * (-36.907-(-61.9364)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -19.185 + (((tickAnim - 15) / 3) * (-22.80941-(-19.185)));
            yy = 21.6834 + (((tickAnim - 15) / 3) * (16.9415-(21.6834)));
            zz = -36.907 + (((tickAnim - 15) / 3) * (-2.5494-(-36.907)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.80941 + (((tickAnim - 18) / 2) * (0-(-22.80941)));
            yy = 16.9415 + (((tickAnim - 18) / 2) * (7.5-(16.9415)));
            zz = -2.5494 + (((tickAnim - 18) / 2) * (0-(-2.5494)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 7.5 + (((tickAnim - 20) / 10) * (16.25-(7.5)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (6.37624-(0)));
            yy = 16.25 + (((tickAnim - 30) / 5) * (15.6672-(16.25)));
            zz = 0 + (((tickAnim - 30) / 5) * (-7.7216-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 6.37624 + (((tickAnim - 35) / 5) * (0-(6.37624)));
            yy = 15.6672 + (((tickAnim - 35) / 5) * (107.5-(15.6672)));
            zz = -7.7216 + (((tickAnim - 35) / 5) * (0-(-7.7216)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.21-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.105-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0.21 + (((tickAnim - 15) / 3) * (0.125-(0.21)));
            zz = -0.105 + (((tickAnim - 15) / 3) * (0.02-(-0.105)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 18) / 2) * (0-(0.125)));
            zz = 0.02 + (((tickAnim - 18) / 2) * (0.25-(0.02)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0.25 + (((tickAnim - 20) / 20) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legR3.rotationPointX = this.legR3.rotationPointX + (float)(xx);
        this.legR3.rotationPointY = this.legR3.rotationPointY - (float)(yy);
        this.legR3.rotationPointZ = this.legR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*-10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+70))*-2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+20))*-5), body2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*-10), body.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (13.24348-(0)));
            yy = -35 + (((tickAnim - 0) / 5) * (-21.94967-(-35)));
            zz = 0 + (((tickAnim - 0) / 5) * (-21.86401-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 13.24348 + (((tickAnim - 5) / 5) * (12.87278-(13.24348)));
            yy = -21.94967 + (((tickAnim - 5) / 5) * (-11.47089-(-21.94967)));
            zz = -21.86401 + (((tickAnim - 5) / 5) * (-23.64108-(-21.86401)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 12.87278 + (((tickAnim - 10) / 10) * (0-(12.87278)));
            yy = -11.47089 + (((tickAnim - 10) / 10) * (7.5-(-11.47089)));
            zz = -23.64108 + (((tickAnim - 10) / 10) * (0-(-23.64108)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 7.5 + (((tickAnim - 20) / 5) * (-17.4-(7.5)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (11.51499-(0)));
            yy = -17.4 + (((tickAnim - 25) / 5) * (-22.00136-(-17.4)));
            zz = 0 + (((tickAnim - 25) / 5) * (-16.93307-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 11.51499 + (((tickAnim - 30) / 10) * (0-(11.51499)));
            yy = -22.00136 + (((tickAnim - 30) / 10) * (-35-(-22.00136)));
            zz = -16.93307 + (((tickAnim - 30) / 10) * (0-(-16.93307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(xx), armL.rotateAngleY + (float) Math.toRadians(yy), armL.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL.rotationPointX = this.armL.rotationPointX + (float)(xx);
        this.armL.rotationPointY = this.armL.rotationPointY - (float)(yy);
        this.armL.rotationPointZ = this.armL.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -26.81303 + (((tickAnim - 0) / 5) * (-30.38042-(-26.81303)));
            yy = -55.90792 + (((tickAnim - 0) / 5) * (-47.80662-(-55.90792)));
            zz = -57.09079 + (((tickAnim - 0) / 5) * (-63.1189-(-57.09079)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -30.38042 + (((tickAnim - 5) / 5) * (-23.9007-(-30.38042)));
            yy = -47.80662 + (((tickAnim - 5) / 5) * (-30.32882-(-47.80662)));
            zz = -63.1189 + (((tickAnim - 5) / 5) * (-48.82461-(-63.1189)));
        }
        else if (tickAnim >= 10 && tickAnim < 17) {
            xx = -23.9007 + (((tickAnim - 10) / 7) * (-42.93535-(-23.9007)));
            yy = -30.32882 + (((tickAnim - 10) / 7) * (-2.24274-(-30.32882)));
            zz = -48.82461 + (((tickAnim - 10) / 7) * (-64.74089-(-48.82461)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -42.93535 + (((tickAnim - 17) / 3) * (-29.20532-(-42.93535)));
            yy = -2.24274 + (((tickAnim - 17) / 3) * (-3.93335-(-2.24274)));
            zz = -64.74089 + (((tickAnim - 17) / 3) * (-47.28906-(-64.74089)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -29.20532 + (((tickAnim - 20) / 5) * (-38.0925-(-29.20532)));
            yy = -3.93335 + (((tickAnim - 20) / 5) * (-10.6989-(-3.93335)));
            zz = -47.28906 + (((tickAnim - 20) / 5) * (-61.16609-(-47.28906)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -38.0925 + (((tickAnim - 25) / 5) * (-25.04985-(-38.0925)));
            yy = -10.6989 + (((tickAnim - 25) / 5) * (-45.43923-(-10.6989)));
            zz = -61.16609 + (((tickAnim - 25) / 5) * (-45.44073-(-61.16609)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -25.04985 + (((tickAnim - 30) / 5) * (-27.84363-(-25.04985)));
            yy = -45.43923 + (((tickAnim - 30) / 5) * (-52.93624-(-45.43923)));
            zz = -45.44073 + (((tickAnim - 30) / 5) * (-56.11731-(-45.44073)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -27.84363 + (((tickAnim - 35) / 5) * (-26.81303-(-27.84363)));
            yy = -52.93624 + (((tickAnim - 35) / 5) * (-55.90792-(-52.93624)));
            zz = -56.11731 + (((tickAnim - 35) / 5) * (-57.09079-(-56.11731)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(xx), armL2.rotateAngleY + (float) Math.toRadians(yy), armL2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0.125 + (((tickAnim - 0) / 40) * (0.125-(0.125)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(xx);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(yy);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -11.87223 + (((tickAnim - 0) / 5) * (-76.43151-(-11.87223)));
            yy = 51.26507 + (((tickAnim - 0) / 5) * (-12.31561-(51.26507)));
            zz = 60.19343 + (((tickAnim - 0) / 5) * (122.68148-(60.19343)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -76.43151 + (((tickAnim - 5) / 5) * (-11.81177-(-76.43151)));
            yy = -12.31561 + (((tickAnim - 5) / 5) * (15.90355-(-12.31561)));
            zz = 122.68148 + (((tickAnim - 5) / 5) * (48.40962-(122.68148)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.81177 + (((tickAnim - 10) / 10) * (0.42313-(-11.81177)));
            yy = 15.90355 + (((tickAnim - 10) / 10) * (4.10859-(15.90355)));
            zz = 48.40962 + (((tickAnim - 10) / 10) * (39.09096-(48.40962)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.42313 + (((tickAnim - 20) / 5) * (-11.76822-(0.42313)));
            yy = 4.10859 + (((tickAnim - 20) / 5) * (18.68172-(4.10859)));
            zz = 39.09096 + (((tickAnim - 20) / 5) * (56.03412-(39.09096)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.76822 + (((tickAnim - 25) / 5) * (-12.43373-(-11.76822)));
            yy = 18.68172 + (((tickAnim - 25) / 5) * (42.63365-(18.68172)));
            zz = 56.03412 + (((tickAnim - 25) / 5) * (59.24392-(56.03412)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -12.43373 + (((tickAnim - 30) / 5) * (-13.62798-(-12.43373)));
            yy = 42.63365 + (((tickAnim - 30) / 5) * (47.80048-(42.63365)));
            zz = 59.24392 + (((tickAnim - 30) / 5) * (63.65397-(59.24392)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -13.62798 + (((tickAnim - 35) / 5) * (-11.87223-(-13.62798)));
            yy = 47.80048 + (((tickAnim - 35) / 5) * (51.26507-(47.80048)));
            zz = 63.65397 + (((tickAnim - 35) / 5) * (60.19343-(63.65397)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(xx), armL3.rotateAngleY + (float) Math.toRadians(yy), armL3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 0) / 20) * (0.23-(0.3)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0.23 + (((tickAnim - 20) / 5) * (0.21-(0.23)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0.21 + (((tickAnim - 25) / 5) * (0.01-(0.21)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 30) / 5) * (0.25-(0.01)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 35) / 5) * (0.3-(0.25)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(xx);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(yy);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -7.5 + (((tickAnim - 0) / 5) * (17.4-(-7.5)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (11.51499-(0)));
            yy = 17.4 + (((tickAnim - 5) / 5) * (22.0014-(17.4)));
            zz = 0 + (((tickAnim - 5) / 5) * (16.9331-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.51499 + (((tickAnim - 10) / 10) * (0-(11.51499)));
            yy = 22.0014 + (((tickAnim - 10) / 10) * (35-(22.0014)));
            zz = 16.9331 + (((tickAnim - 10) / 10) * (0-(16.9331)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (13.24348-(0)));
            yy = 35 + (((tickAnim - 20) / 5) * (21.9497-(35)));
            zz = 0 + (((tickAnim - 20) / 5) * (21.864-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 13.24348 + (((tickAnim - 25) / 5) * (12.87278-(13.24348)));
            yy = 21.9497 + (((tickAnim - 25) / 5) * (11.4709-(21.9497)));
            zz = 21.864 + (((tickAnim - 25) / 5) * (23.6411-(21.864)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.87278 + (((tickAnim - 30) / 10) * (0-(12.87278)));
            yy = 11.4709 + (((tickAnim - 30) / 10) * (-7.5-(11.4709)));
            zz = 23.6411 + (((tickAnim - 30) / 10) * (0-(23.6411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(xx), armR.rotateAngleY + (float) Math.toRadians(yy), armR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -29.20532 + (((tickAnim - 0) / 5) * (-38.0925-(-29.20532)));
            yy = 3.9334 + (((tickAnim - 0) / 5) * (10.6989-(3.9334)));
            zz = 47.2891 + (((tickAnim - 0) / 5) * (61.1661-(47.2891)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -38.0925 + (((tickAnim - 5) / 5) * (-25.04985-(-38.0925)));
            yy = 10.6989 + (((tickAnim - 5) / 5) * (45.4392-(10.6989)));
            zz = 61.1661 + (((tickAnim - 5) / 5) * (45.4407-(61.1661)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -25.04985 + (((tickAnim - 10) / 5) * (-27.84363-(-25.04985)));
            yy = 45.4392 + (((tickAnim - 10) / 5) * (52.9362-(45.4392)));
            zz = 45.4407 + (((tickAnim - 10) / 5) * (56.1173-(45.4407)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -27.84363 + (((tickAnim - 15) / 5) * (-26.81303-(-27.84363)));
            yy = 52.9362 + (((tickAnim - 15) / 5) * (55.9079-(52.9362)));
            zz = 56.1173 + (((tickAnim - 15) / 5) * (57.0908-(56.1173)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -26.81303 + (((tickAnim - 20) / 5) * (-30.38042-(-26.81303)));
            yy = 55.9079 + (((tickAnim - 20) / 5) * (47.8066-(55.9079)));
            zz = 57.0908 + (((tickAnim - 20) / 5) * (63.1189-(57.0908)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -30.38042 + (((tickAnim - 25) / 5) * (-23.9007-(-30.38042)));
            yy = 47.8066 + (((tickAnim - 25) / 5) * (30.3288-(47.8066)));
            zz = 63.1189 + (((tickAnim - 25) / 5) * (48.8246-(63.1189)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -23.9007 + (((tickAnim - 30) / 7) * (-42.93535-(-23.9007)));
            yy = 30.3288 + (((tickAnim - 30) / 7) * (2.2427-(30.3288)));
            zz = 48.8246 + (((tickAnim - 30) / 7) * (64.7409-(48.8246)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -42.93535 + (((tickAnim - 37) / 3) * (-29.20532-(-42.93535)));
            yy = 2.2427 + (((tickAnim - 37) / 3) * (3.9334-(2.2427)));
            zz = 64.7409 + (((tickAnim - 37) / 3) * (47.2891-(64.7409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(xx), armR2.rotateAngleY + (float) Math.toRadians(yy), armR2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.42313 + (((tickAnim - 0) / 5) * (-11.76822-(0.42313)));
            yy = -4.1086 + (((tickAnim - 0) / 5) * (-18.6817-(-4.1086)));
            zz = -39.091 + (((tickAnim - 0) / 5) * (-56.0341-(-39.091)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.76822 + (((tickAnim - 5) / 5) * (-12.43373-(-11.76822)));
            yy = -18.6817 + (((tickAnim - 5) / 5) * (-42.6337-(-18.6817)));
            zz = -56.0341 + (((tickAnim - 5) / 5) * (-59.2439-(-56.0341)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -12.43373 + (((tickAnim - 10) / 5) * (-13.62798-(-12.43373)));
            yy = -42.6337 + (((tickAnim - 10) / 5) * (-47.8005-(-42.6337)));
            zz = -59.2439 + (((tickAnim - 10) / 5) * (-63.654-(-59.2439)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -13.62798 + (((tickAnim - 15) / 5) * (-11.87223-(-13.62798)));
            yy = -47.8005 + (((tickAnim - 15) / 5) * (-51.2651-(-47.8005)));
            zz = -63.654 + (((tickAnim - 15) / 5) * (-60.1934-(-63.654)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -11.87223 + (((tickAnim - 20) / 5) * (-76.43151-(-11.87223)));
            yy = -51.2651 + (((tickAnim - 20) / 5) * (12.3156-(-51.2651)));
            zz = -60.1934 + (((tickAnim - 20) / 5) * (-122.6815-(-60.1934)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -76.43151 + (((tickAnim - 25) / 5) * (-11.81177-(-76.43151)));
            yy = 12.3156 + (((tickAnim - 25) / 5) * (-15.9035-(12.3156)));
            zz = -122.6815 + (((tickAnim - 25) / 5) * (-48.4096-(-122.6815)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -11.81177 + (((tickAnim - 30) / 10) * (0.42313-(-11.81177)));
            yy = -15.9035 + (((tickAnim - 30) / 10) * (-4.1086-(-15.9035)));
            zz = -48.4096 + (((tickAnim - 30) / 10) * (-39.091-(-48.4096)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(xx), armR3.rotateAngleY + (float) Math.toRadians(yy), armR3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.23 + (((tickAnim - 0) / 5) * (0.21-(0.23)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.21 + (((tickAnim - 5) / 5) * (0.01-(0.21)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.01 + (((tickAnim - 10) / 5) * (0.25-(0.01)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 15) / 5) * (0.3-(0.25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0.3 + (((tickAnim - 20) / 20) * (0.23-(0.3)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(xx);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(yy);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2))*1), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+100))*5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2+50))*1), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStanocephalosaurus entity = (EntityPrehistoricFloraStanocephalosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0), body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2));
        this.body3.rotationPointX = this.body3.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2);
        this.body3.rotationPointY = this.body3.rotationPointY - (float)(0);
        this.body3.rotationPointZ = this.body3.rotationPointZ + (float)(0);
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(-22.5764), legL.rotateAngleY + (float) Math.toRadians(-39.9954+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*10), legL.rotateAngleZ + (float) Math.toRadians(25.64659));
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(87.90051), legL2.rotateAngleY + (float) Math.toRadians(44.4566+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*10), legL2.rotateAngleZ + (float) Math.toRadians(-72.61028));
        this.legL2.rotationPointX = this.legL2.rotationPointX + (float)(-0.05);
        this.legL2.rotationPointY = this.legL2.rotationPointY - (float)(-0.075);
        this.legL2.rotationPointZ = this.legL2.rotationPointZ + (float)(-0.5);
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(-59.03861), legL3.rotateAngleY + (float) Math.toRadians(-59.9418), legL3.rotateAngleZ + (float) Math.toRadians(4.4351+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-120))*-10));
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-120))*25), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-20))*10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1));
        this.setRotateAngle(armL, armL.rotateAngleX + (float) Math.toRadians(30.685+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-20), armL.rotateAngleY + (float) Math.toRadians(-13.17068), armL.rotateAngleZ + (float) Math.toRadians(18.00098));
        this.setRotateAngle(armL2, armL2.rotateAngleX + (float) Math.toRadians(-79.3303), armL2.rotateAngleY + (float) Math.toRadians(-56.20175), armL2.rotateAngleZ + (float) Math.toRadians(-57.06027));
        this.armL2.rotationPointX = this.armL2.rotationPointX + (float)(-0.25);
        this.armL2.rotationPointY = this.armL2.rotationPointY - (float)(-0.025);
        this.armL2.rotationPointZ = this.armL2.rotationPointZ + (float)(0.35);
        this.setRotateAngle(armL3, armL3.rotateAngleX + (float) Math.toRadians(102.53535), armL3.rotateAngleY + (float) Math.toRadians(27.67873), armL3.rotateAngleZ + (float) Math.toRadians(-116.3669+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*20));
        this.armL3.rotationPointX = this.armL3.rotationPointX + (float)(0);
        this.armL3.rotationPointY = this.armL3.rotationPointY - (float)(0);
        this.armL3.rotationPointZ = this.armL3.rotationPointZ + (float)(0);
        this.setRotateAngle(armR, armR.rotateAngleX + (float) Math.toRadians(30.685+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*20), armR.rotateAngleY + (float) Math.toRadians(13.1707), armR.rotateAngleZ + (float) Math.toRadians(-20.501));
        this.setRotateAngle(armR2, armR2.rotateAngleX + (float) Math.toRadians(-79.3303), armR2.rotateAngleY + (float) Math.toRadians(56.2018), armR2.rotateAngleZ + (float) Math.toRadians(57.0603));
        this.armR2.rotationPointX = this.armR2.rotationPointX + (float)(0.25);
        this.armR2.rotationPointY = this.armR2.rotationPointY - (float)(-0.025);
        this.armR2.rotationPointZ = this.armR2.rotationPointZ + (float)(0.35);
        this.setRotateAngle(armR3, armR3.rotateAngleX + (float) Math.toRadians(102.53535), armR3.rotateAngleY + (float) Math.toRadians(-27.6787), armR3.rotateAngleZ + (float) Math.toRadians(116.3669+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*20));
        this.armR3.rotationPointX = this.armR3.rotationPointX + (float)(0);
        this.armR3.rotationPointY = this.armR3.rotationPointY - (float)(0);
        this.armR3.rotationPointZ = this.armR3.rotationPointZ + (float)(0);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(upperjaw, upperjaw.rotateAngleX + (float) Math.toRadians(0), upperjaw.rotateAngleY + (float) Math.toRadians(0), upperjaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(-22.5764), legR.rotateAngleY + (float) Math.toRadians(39.9954+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-70))*10), legR.rotateAngleZ + (float) Math.toRadians(-25.6466));
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(87.90051), legR2.rotateAngleY + (float) Math.toRadians(-44.4566+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*10), legR2.rotateAngleZ + (float) Math.toRadians(72.6103));
        this.legR2.rotationPointX = this.legR2.rotationPointX + (float)(-0.05);
        this.legR2.rotationPointY = this.legR2.rotationPointY - (float)(-0.075);
        this.legR2.rotationPointZ = this.legR2.rotationPointZ + (float)(-0.5);
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(-59.0386), legR3.rotateAngleY + (float) Math.toRadians(59.9418), legR3.rotateAngleZ + (float) Math.toRadians(-4.4351+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-120))*-10));
    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStanocephalosaurus e = (EntityPrehistoricFloraStanocephalosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.lowerjaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
