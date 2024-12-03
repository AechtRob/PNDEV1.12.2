package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrobrachis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMicrobrachis extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;

    public ModelMicrobrachis() {
        this.textureWidth = 36;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 24.25F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.5F, -3.25F, -4.25F, 3, 3, 7, 0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-1.5F, -1.5F, -2.0F);
        this.body.addChild(armright);
        this.setRotateAngle(armright, 0.1309F, 0.6545F, -0.6109F);
        this.armright.cubeList.add(new ModelBox(armright, 0, 17, -1.75F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(1.5F, -1.5F, -2.0F);
        this.body.addChild(armleft);
        this.setRotateAngle(armleft, 0.1309F, -0.6545F, 0.6109F);
        this.armleft.cubeList.add(new ModelBox(armleft, 0, 17, -0.25F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.5F, -4.0F);
        this.body.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 14, 3, -0.5F, -0.75F, -4.0F, 1, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 3, -1.5F, -0.75F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2356F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 18, -0.5F, -2.25F, 3.175F, 1, 1, 1, -0.02F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -0.5F, -2.25F, 1.925F, 1, 1, 2, -0.015F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2356F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 18, -0.5F, -2.25F, 3.175F, 1, 1, 1, -0.02F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -0.5F, -2.25F, 1.925F, 1, 1, 2, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.4538F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 22, -0.9F, -2.5F, 1.0F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.4843F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 0, -1.0F, -2.25F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, -0.4538F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 22, -0.1F, -2.5F, 1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.5F, -4.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4843F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 0, 0.0F, -2.25F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 1.5F, 4.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.4276F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 8, -1.0F, -5.35F, -6.325F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, 1.5F, 4.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 8, -1.5F, -3.65F, -6.5F, 2, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 0.5F, 0.15F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1309F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 13, 11, -1.0F, -0.25F, -4.0F, 1, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 24, 0, -2.0F, -0.25F, -2.0F, 3, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 12, -2.0F, -1.0F, -2.0F, 3, 1, 2, -0.02F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2356F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 14, -0.5F, -2.25F, 1.925F, 1, 1, 2, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.4843F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 11, -1.0F, -2.25F, 0.0F, 1, 1, 2, -0.015F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 2.0F, -4.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.4843F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 11, 0.0F, -2.25F, 0.0F, 1, 1, 2, -0.015F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 2.0F, -4.0F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2356F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 13, 14, -0.5F, -2.25F, 1.925F, 1, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.75F, 3.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.5F, -0.75F, 3, 3, 8, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 0, -1.0F, -0.6F, -0.5F, 2, 2, 6, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 13, 11, -1.0F, -1.25F, -0.5F, 2, 1, 6, -0.01F, false));
        this.body3.cubeList.add(new ModelBox(body3, 12, 15, 0.0F, -2.0F, -0.5F, 0, 1, 6, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 5.5F);
        this.body3.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 8, 22, -0.5F, -1.1F, 0.0F, 1, 2, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 0, 0.0F, -2.5F, 0.0F, 0, 4, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 15, 0.0F, -2.5F, 0.0F, 0, 4, 6, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 18, -0.5F, -0.6F, 0.0F, 1, 1, 5, 0.0F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-1.0F, 0.25F, 4.0F);
        this.body3.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.6109F, -0.5672F);
        this.legright.cubeList.add(new ModelBox(legright, 0, 2, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0F, -0.25F, 0.0F);
        this.legright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.5F, 0.25F, -0.5F, 2, 0, 2, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(1.0F, 0.25F, 4.0F);
        this.body3.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, -0.6109F, 0.5672F);
        this.legleft.cubeList.add(new ModelBox(legleft, 0, 2, -0.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0F, -0.25F, 0.0F);
        this.legleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.7854F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.5F, 0.25F, -0.5F, 2, 0, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
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
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};

        EntityPrehistoricFloraMicrobrachis entitySilesaurus = (EntityPrehistoricFloraMicrobrachis) e;

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraMicrobrachis ee = (EntityPrehistoricFloraMicrobrachis) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {

        }
        else {
            //Swimming pose:

            if(ee.getIsFast()){
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrobrachis entity = (EntityPrehistoricFloraMicrobrachis) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+20))*5), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.2);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*5), armright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*5), armleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*5), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*8), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-155))*10), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*25), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-220))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*5), legright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-125))*5), legleft.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMicrobrachis entity = (EntityPrehistoricFloraMicrobrachis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+40))*10), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.4);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(0), armright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-125))*5), armright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(0), armleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-125))*5), armleft.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*9), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*12), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-125))*15), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*25), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-220))*25), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-125))*5), legright.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-125))*5), legleft.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMicrobrachis entity = (EntityPrehistoricFloraMicrobrachis) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13.5 + (((tickAnim - 5) / 5) * (0-(-13.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 25.75 + (((tickAnim - 5) / 3) * (0-(25.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMicrobrachis e = (EntityPrehistoricFloraMicrobrachis) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
