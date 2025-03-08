package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraLethiscus;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelLethiscus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;

    private ModelAnimator animator;

    public ModelLethiscus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -1.5F, 12.5F);
        this.root.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 30, 0, -1.5F, -1.5F, -9.5F, 3, 3, 10, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -9.25F);
        this.body1.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 45, -1.0F, -1.0F, -7.65F, 2, 2, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -7.5F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0436F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 45, -0.5F, -1.0F, -3.75F, 1, 1, 4, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.1F, -1.0F, -1.85F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0873F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 46, 48, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -1.0F, -3.75F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.3054F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 48, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.35F, -1.05F, -2.35F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.1745F, -0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 50, -0.4F, 0.0F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.35F, -1.05F, -2.35F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.1745F, 0.1309F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 50, -0.6F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.1F, -1.0F, -1.85F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.0873F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 48, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 48, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 48, -0.5F, 0.0F, -3.75F, 1, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 51, -1.0F, -0.8F, -0.75F, 2, 1, 1, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, 0.0F, -3.75F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2705F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 50, -1.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.025F, 0.0F, -1.85F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 51, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.0F, -3.75F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.2705F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.025F, 0.0F, -1.85F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.0873F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 51, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -1.5F, 13.0F);
        this.root.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.5F, -0.5F, 3, 3, 12, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 15, -1.5F, -1.5F, -0.5F, 3, 3, 12, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 30, -1.5F, -1.5F, -0.5F, 3, 3, 12, -0.01F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 11.5F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0698F, 0.0F, 0.0F);
        this.body5.cubeList.add(new ModelBox(body5, 30, 13, -1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0436F, 0.0F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 30, 25, -1.0F, -1.0F, -0.5F, 2, 2, 10, -0.01F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 9.5F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0262F, 0.0F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 30, 37, -0.5F, -0.5F, -0.5F, 1, 1, 10, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(root, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(body1, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.05F);
        this.setRotateAngle(body3, 0.0F, 0.4F, 0.05F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(body5, 0.0F, -0.6F, 0.05F);
        this.setRotateAngle(body6, 0.0F, -0.8F, 0.05F);
        this.setRotateAngle(body7, 0.0F, -1.0F, 0.05F);
        this.root.offsetX = -0.006F;
        this.root.offsetY = -0.12F;
        this.root.offsetZ = -0.15F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.5F;
        this.root.offsetX = 1.85F;
        this.root.rotateAngleY = (float)Math.toRadians(245);
        this.root.rotateAngleX = (float)Math.toRadians(28);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.50F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(neck, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(head, 0.0F, -0.2F, 0.05F);
        this.setRotateAngle(body1, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.3F, 0.05F);
        this.setRotateAngle(body3, 0.0F, 0.4F, 0.05F);
        this.setRotateAngle(body4, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(body5, 0.0F, -0.6F, 0.05F);
        this.setRotateAngle(body6, 0.0F, -0.8F, 0.05F);
        this.setRotateAngle(body7, 0.0F, -1.0F, 0.05F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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
        this.root.offsetZ = -0.6F;

        EntityPrehistoricFloraLethiscus Lethiscus = (EntityPrehistoricFloraLethiscus) e;

        this.faceTarget(f3, f4, 16, head);
        AdvancedModelRenderer[] Tail = {this.body2, this.body3, this.body4, this.body5, this.body6, this.body7};
        Lethiscus.tailBuffer.applyChainSwingBuffer(Tail);

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraLethiscus ee = (EntityPrehistoricFloraLethiscus) entitylivingbaseIn;

        //the only animation for this is managed directly by the animation ticker:
        if (ee.getIsMoving()) {
            if(ee.getIsFast()){
                animMoveFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            } else {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
            }
        } else {
            if(ee.getIsFast()){
                animMoveFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            } else {
                animMove(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
            }
        }
        if(ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraLethiscus entity = (EntityPrehistoricFloraLethiscus) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -4.5 + (((tickAnim - 5) / 3) * (-11.5-(-4.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -11.5 + (((tickAnim - 8) / 4) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -17.5 + (((tickAnim - 5) / 3) * (0-(-17.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (36.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 36.75 + (((tickAnim - 5) / 3) * (0-(36.75)));
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
    public void animMove(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraLethiscus entity = (EntityPrehistoricFloraLethiscus) entitylivingbaseIn;
        int animCycle = 80;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-1));
        this.root.rotationPointX = this.root.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+90))*3);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-0.1);
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-1), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*25), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+65))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+100))*30), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+150))*-3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-50))*-25), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*-30), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+25))*-30), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90-35))*-30), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+120))*30), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+65))*30), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(0), body7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+85))*30), body7.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animMoveFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraLethiscus entity = (EntityPrehistoricFloraLethiscus) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), root.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-1));
        this.root.rotationPointX = this.root.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*8);
        this.root.rotationPointY = this.root.rotationPointY - (float)(0);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+10))*-0.5);
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(-1), body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*45), body1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+65))*3));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-1), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*50), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-3));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-1), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-20))*-45), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*-50), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+25))*-50), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-35))*-50), body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body5, body5.rotateAngleX + (float) Math.toRadians(0), body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*50), body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body6, body6.rotateAngleX + (float) Math.toRadians(0), body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+65))*50), body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body7, body7.rotateAngleX + (float) Math.toRadians(0), body7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+85))*50), body7.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
