package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraChasmataspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class ModelChasmataspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Body6;
    private final AdvancedModelRenderer Body7;
    private final AdvancedModelRenderer Body8;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer carapace;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;

    private ModelAnimator animator;


    public ModelChasmataspis() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 23.05F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 14, -1.0F, -1.0F, -8.0F, 2, 1, 3, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -1.25F, -5.0F);
        this.Body.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, 0.0F, -0.25F, 4, 1, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(2.0F, 1.25F, 0.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.0472F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, -4, 27, -0.05F, -0.5F, -2.2F, 5, 0, 5, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, 1.25F, 0.0F);
        this.Body1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 6, -0.5F, -1.0F, -0.05F, 2, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, 1.25F, 0.0F);
        this.Body1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -1.5F, -1.0F, -0.05F, 2, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.0F, 1.25F, 0.0F);
        this.Body1.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 1.0472F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, -4, 27, -4.95F, -0.5F, -2.2F, 5, 0, 5, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.65F, 4.25F);
        this.Body1.addChild(Body2);
        this.setRotateAngle(Body2, -0.0698F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 18, 12, -1.5F, -0.5F, 0.0F, 3, 1, 1, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 15, 2, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.01F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 17, 5, -2.0F, 0.0F, 1.0F, 4, 0, 1, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 16, 16, -2.0F, 0.0F, 1.0F, 4, 0, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 7, 14, -1.5F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 13, 20, -1.5F, 0.0F, 1.0F, 3, 0, 1, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 16, 17, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.01F, false));

        this.Body6 = new AdvancedModelRenderer(this);
        this.Body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body5.addChild(Body6);
        this.Body6.cubeList.add(new ModelBox(Body6, 7, 20, -1.5F, 0.0F, 1.0F, 3, 0, 1, 0.0F, false));
        this.Body6.cubeList.add(new ModelBox(Body6, 8, 17, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.Body7 = new AdvancedModelRenderer(this);
        this.Body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body6.addChild(Body7);
        this.Body7.cubeList.add(new ModelBox(Body7, 19, 20, -1.0F, -0.5F, 0.0F, 2, 1, 1, 0.01F, false));

        this.Body8 = new AdvancedModelRenderer(this);
        this.Body8.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Body7.addChild(Body8);
        this.Body8.cubeList.add(new ModelBox(Body8, 0, 2, -0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F, false));
        this.Body8.cubeList.add(new ModelBox(Body8, 11, 0, -0.5F, 0.0F, 1.0F, 1, 0, 4, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.75F, 0.0F, -7.75F);
        this.Body.addChild(legR);
        this.setRotateAngle(legR, 0.6109F, -0.8727F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 15, 0, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.75F, 0.0F, -7.75F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.6109F, 0.8727F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 15, 0, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, 0.0F, -7.25F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.48F, -0.3491F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 13, 14, -3.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, 0.0F, -7.25F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.48F, 0.3491F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 13, 14, 0.0F, 0.0F, -1.5F, 3, 0, 2, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, 0.0F, -6.75F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.2618F, 0.1309F, -0.1309F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legR3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.1745F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 12, -3.6F, 0.0F, -1.5F, 4, 0, 2, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, 0.0F, -6.75F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.2618F, -0.1309F, 0.1309F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.legL3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 12, -0.4F, 0.0F, -1.5F, 4, 0, 2, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, 0.0F, -6.0F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, -0.3491F, 0.1745F, -0.1309F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 12, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, 0.0F, -6.0F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, -0.3491F, -0.1745F, 0.1309F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 12, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, 0.0F, -5.25F);
        this.Body.addChild(legR5);
        this.setRotateAngle(legR5, -0.3927F, 0.48F, -0.1309F);
        this.legR5.cubeList.add(new ModelBox(legR5, 7, 9, -4.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, 0.0F, -5.25F);
        this.Body.addChild(legL5);
        this.setRotateAngle(legL5, -0.3927F, -0.48F, 0.1309F);
        this.legL5.cubeList.add(new ModelBox(legL5, 7, 9, 0.0F, 0.0F, -0.5F, 4, 0, 2, 0.0F, true));

        this.carapace = new AdvancedModelRenderer(this);
        this.carapace.setRotationPoint(0.0F, -1.25F, -5.0F);
        this.Body.addChild(carapace);
        this.setRotateAngle(carapace, 0.1309F, 0.0F, 0.0F);
        this.carapace.cubeList.add(new ModelBox(carapace, 9, 6, -3.0F, -0.25F, -2.0F, 6, 1, 2, 0.0F, false));
        this.carapace.cubeList.add(new ModelBox(carapace, 15, 9, -1.5F, -0.25F, -4.0F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.0F, 0.25F, -2.0F);
        this.carapace.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.3491F, 0.2182F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, -0.15F, 0.0F, 1, 0, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, 0.75F, -4.0F);
        this.carapace.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.6545F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -2.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, -1.0F, -1.0F, 1.5F, 1, 1, 1, -0.015F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.5F, 0.75F, -4.0F);
        this.carapace.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6545F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, 0.0F, -1.0F, 1.5F, 1, 1, 1, -0.015F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, 0.0F, -1.0F, 0.0F, 2, 1, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.0F, 0.25F, -2.0F);
        this.carapace.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.3491F, -0.2182F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, -0.15F, 0.0F, 1, 0, 3, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Body.rotateAngleX = (float) Math.toRadians(90);
        this.setRotateAngle(Body1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body7, 0.0F, 0.0F, 0.0F);
        this.Body.offsetY = -0.2F;
        this.Body.offsetX = 0.0F;
        this.Body.offsetZ = -0.28F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(carapace, 0.1F, -0.1F, 0.0F);
        this.setRotateAngle(Body1, -0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body6, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body7, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body8, 0.0F, 0.3F, 0.0F);
        this.Body.offsetY = 0.057F;
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
       // this.body.offsetY = 0.4F;
        //this.Body.offsetY = -0.2F;
        //this.Body.offsetZ = 0.1F;


        AdvancedModelRenderer[] fishBody = {this.Body2, this.Body3, this.Body4, this.Body5, this.Body6, this.Body7, this.Body8};



        //mouthparts:
       // this.walk(cheliceraL, 0.35F, -0.15F, false, 0, -0.1F, f2, 0.6F);
       // this.walk(cheliceraR, 0.35F, 0.15F, false, -1, 0.1F, f2, 0.6F);

        float speed = 0.2F;

        EntityPrehistoricFloraChasmataspis slimon = (EntityPrehistoricFloraChasmataspis) e;


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {//on land
            if(!slimon.getIsMoving()) {
                this.chainWave(fishBody, speed, 0.02F, -0.2F, f2, 0.2F);
            }

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
               // this.Body.offsetY = 0.2F;
                //this.bob(body, -speed * 1.5F, 2F, false, f2, 1);
                this.chainSwing(fishBody, speed, 0.01F, -2, f2, 1);
            }
        }
    }
    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraChasmataspis ee = (EntityPrehistoricFloraChasmataspis) entitylivingbaseIn;
        //Swimming pose:

        if ((ee.getIsMoving())) {
            //Walk pose:
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        } else {

        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraChasmataspis entity = (EntityPrehistoricFloraChasmataspis) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+90))), Body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+60))*0.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5+30))*0.25);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);
        this.setRotateAngle(Body1, Body1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.3), Body1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5))*0.3), Body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))*0.4), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-30))*0.4), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-150))*0.5), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-60))*0.5), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-180))*0.6), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-90))*0.6), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body5, Body5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-210))*0.7), Body5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-120))*0.7), Body5.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body6, Body6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-240))*0.8), Body6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-150))*0.8), Body6.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body7, Body7.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-270))*0.9), Body7.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-180))*0.9), Body7.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body8, Body8.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-300))), Body8.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90/0.5-210))), Body8.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -3.94121 + (((tickAnim - 0) / 5) * (-5.65823-(-3.94121)));
            yy = 19.77878 + (((tickAnim - 0) / 5) * (3.78118-(19.77878)));
            zz = 2.57804 + (((tickAnim - 0) / 5) * (20.97631-(2.57804)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5.65823 + (((tickAnim - 5) / 5) * (4.62823-(-5.65823)));
            yy = 3.78118 + (((tickAnim - 5) / 5) * (-12.23888-(3.78118)));
            zz = 20.97631 + (((tickAnim - 5) / 5) * (-3.86501-(20.97631)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.62823 + (((tickAnim - 10) / 10) * (-3.94121-(4.62823)));
            yy = -12.23888 + (((tickAnim - 10) / 10) * (19.77878-(-12.23888)));
            zz = -3.86501 + (((tickAnim - 10) / 10) * (2.57804-(-3.86501)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -3.94121 + (((tickAnim - 20) / 5) * (-5.65823-(-3.94121)));
            yy = 19.77878 + (((tickAnim - 20) / 5) * (3.78118-(19.77878)));
            zz = 2.57804 + (((tickAnim - 20) / 5) * (20.97631-(2.57804)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -5.65823 + (((tickAnim - 25) / 5) * (4.62823-(-5.65823)));
            yy = 3.78118 + (((tickAnim - 25) / 5) * (-12.23888-(3.78118)));
            zz = 20.97631 + (((tickAnim - 25) / 5) * (-3.86501-(20.97631)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.62823 + (((tickAnim - 30) / 10) * (-3.94121-(4.62823)));
            yy = -12.23888 + (((tickAnim - 30) / 10) * (19.77878-(-12.23888)));
            zz = -3.86501 + (((tickAnim - 30) / 10) * (2.57804-(-3.86501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR, legR.rotateAngleX + (float) Math.toRadians(xx), legR.rotateAngleY + (float) Math.toRadians(yy), legR.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 1.2 + (((tickAnim - 0) / 2) * (4.62823-(1.2)));
            yy = 6.9 + (((tickAnim - 0) / 2) * (12.23888-(6.9)));
            zz = -4.42 + (((tickAnim - 0) / 2) * (3.86501-(-4.42)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 4.62823 + (((tickAnim - 2) / 10) * (-3.94121-(4.62823)));
            yy = 12.23888 + (((tickAnim - 2) / 10) * (-19.77878-(12.23888)));
            zz = 3.86501 + (((tickAnim - 2) / 10) * (-2.57804-(3.86501)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -3.94121 + (((tickAnim - 12) / 5) * (-5.65823-(-3.94121)));
            yy = -19.77878 + (((tickAnim - 12) / 5) * (-3.78118-(-19.77878)));
            zz = -2.57804 + (((tickAnim - 12) / 5) * (-20.97631-(-2.57804)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = -5.65823 + (((tickAnim - 17) / 5) * (4.62823-(-5.65823)));
            yy = -3.78118 + (((tickAnim - 17) / 5) * (12.23888-(-3.78118)));
            zz = -20.97631 + (((tickAnim - 17) / 5) * (3.86501-(-20.97631)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 4.62823 + (((tickAnim - 22) / 10) * (-3.94121-(4.62823)));
            yy = 12.23888 + (((tickAnim - 22) / 10) * (-19.77878-(12.23888)));
            zz = 3.86501 + (((tickAnim - 22) / 10) * (-2.57804-(3.86501)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -3.94121 + (((tickAnim - 32) / 5) * (-5.65823-(-3.94121)));
            yy = -19.77878 + (((tickAnim - 32) / 5) * (-3.78118-(-19.77878)));
            zz = -2.57804 + (((tickAnim - 32) / 5) * (-20.97631-(-2.57804)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -5.65823 + (((tickAnim - 37) / 3) * (1.2-(-5.65823)));
            yy = -3.78118 + (((tickAnim - 37) / 3) * (6.9-(-3.78118)));
            zz = -20.97631 + (((tickAnim - 37) / 3) * (-4.42-(-20.97631)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL, legL.rotateAngleX + (float) Math.toRadians(xx), legL.rotateAngleY + (float) Math.toRadians(yy), legL.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legR2, legR2.rotateAngleX + (float) Math.toRadians(xx), legR2.rotateAngleY + (float) Math.toRadians(yy), legR2.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(legL2, legL2.rotateAngleX + (float) Math.toRadians(xx), legL2.rotateAngleY + (float) Math.toRadians(yy), legL2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1.57 + (((tickAnim - 0) / 2) * (-2.57129-(-1.57)));
            yy = 11.34 + (((tickAnim - 0) / 2) * (16.96639-(11.34)));
            zz = 1.77 + (((tickAnim - 0) / 2) * (2.85264-(1.77)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = -2.57129 + (((tickAnim - 2) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 2) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 2) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 0.37046 + (((tickAnim - 7) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 7) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 7) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 3.4427 + (((tickAnim - 12) / 10) * (-2.57129-(3.4427)));
            yy = -16.79985 + (((tickAnim - 12) / 10) * (16.96639-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 12) / 10) * (2.85264-(-3.64399)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -2.57129 + (((tickAnim - 22) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 22) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 22) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0.37046 + (((tickAnim - 27) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 27) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 27) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 3.4427 + (((tickAnim - 32) / 8) * (-1.57-(3.4427)));
            yy = -16.79985 + (((tickAnim - 32) / 8) * (11.34-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 32) / 8) * (1.77-(-3.64399)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR3, legR3.rotateAngleX + (float) Math.toRadians(xx), legR3.rotateAngleY + (float) Math.toRadians(yy), legR3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1.39 + (((tickAnim - 0) / 3) * (3.4427-(1.39)));
            yy = 8.52 + (((tickAnim - 0) / 3) * (16.79985-(8.52)));
            zz = -13.22 + (((tickAnim - 0) / 3) * (3.64399-(-13.22)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 3.4427 + (((tickAnim - 3) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 3) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 3) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.57129 + (((tickAnim - 13) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 13) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 13) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0.37046 + (((tickAnim - 18) / 5) * (3.4427-(0.37046)));
            yy = 4.37439 + (((tickAnim - 18) / 5) * (16.79985-(4.37439)));
            zz = -21.65911 + (((tickAnim - 18) / 5) * (3.64399-(-21.65911)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 3.4427 + (((tickAnim - 23) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 23) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 23) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -2.57129 + (((tickAnim - 33) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 33) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 33) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.37046 + (((tickAnim - 38) / 2) * (1.39-(0.37046)));
            yy = 4.37439 + (((tickAnim - 38) / 2) * (8.52-(4.37439)));
            zz = -21.65911 + (((tickAnim - 38) / 2) * (-13.22-(-21.65911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL3, legL3.rotateAngleX + (float) Math.toRadians(xx), legL3.rotateAngleY + (float) Math.toRadians(yy), legL3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.18624 + (((tickAnim - 0) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 0) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 0) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 4.63788 + (((tickAnim - 5) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 5) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 5) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.86371 + (((tickAnim - 15) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 15) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 15) / 5) * (21.50803-(0.73038)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.18624 + (((tickAnim - 20) / 5) * (4.63788-(0.18624)));
            yy = -4.39691 + (((tickAnim - 20) / 5) * (-16.57347-(-4.39691)));
            zz = 21.50803 + (((tickAnim - 20) / 5) * (-2.07666-(21.50803)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 4.63788 + (((tickAnim - 25) / 10) * (-4.86371-(4.63788)));
            yy = -16.57347 + (((tickAnim - 25) / 10) * (16.67917-(-16.57347)));
            zz = -2.07666 + (((tickAnim - 25) / 10) * (0.73038-(-2.07666)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -4.86371 + (((tickAnim - 35) / 5) * (0.18624-(-4.86371)));
            yy = 16.67917 + (((tickAnim - 35) / 5) * (-4.39691-(16.67917)));
            zz = 0.73038 + (((tickAnim - 35) / 5) * (21.50803-(0.73038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR4, legR4.rotateAngleX + (float) Math.toRadians(xx), legR4.rotateAngleY + (float) Math.toRadians(yy), legR4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.47 + (((tickAnim - 0) / 7) * (-4.86371-(1.47)));
            yy = 5.49 + (((tickAnim - 0) / 7) * (-16.67917-(5.49)));
            zz = 1.14 + (((tickAnim - 0) / 7) * (-0.73038-(1.14)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = -4.86371 + (((tickAnim - 7) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 7) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 7) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0.18624 + (((tickAnim - 12) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 12) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 12) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 4.63788 + (((tickAnim - 17) / 10) * (-4.86371-(4.63788)));
            yy = 16.57347 + (((tickAnim - 17) / 10) * (-16.67917-(16.57347)));
            zz = 2.07666 + (((tickAnim - 17) / 10) * (-0.73038-(2.07666)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = -4.86371 + (((tickAnim - 27) / 5) * (0.18624-(-4.86371)));
            yy = -16.67917 + (((tickAnim - 27) / 5) * (4.39691-(-16.67917)));
            zz = -0.73038 + (((tickAnim - 27) / 5) * (-21.50803-(-0.73038)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 0.18624 + (((tickAnim - 32) / 5) * (4.63788-(0.18624)));
            yy = 4.39691 + (((tickAnim - 32) / 5) * (16.57347-(4.39691)));
            zz = -21.50803 + (((tickAnim - 32) / 5) * (2.07666-(-21.50803)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 4.63788 + (((tickAnim - 37) / 3) * (1.47-(4.63788)));
            yy = 16.57347 + (((tickAnim - 37) / 3) * (5.49-(16.57347)));
            zz = 2.07666 + (((tickAnim - 37) / 3) * (1.14-(2.07666)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL4, legL4.rotateAngleX + (float) Math.toRadians(xx), legL4.rotateAngleY + (float) Math.toRadians(yy), legL4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.57129 + (((tickAnim - 0) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 0) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 0) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0.37046 + (((tickAnim - 5) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 5) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 5) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.4427 + (((tickAnim - 10) / 10) * (-2.57129-(3.4427)));
            yy = -16.79985 + (((tickAnim - 10) / 10) * (16.96639-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 10) / 10) * (2.85264-(-3.64399)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -2.57129 + (((tickAnim - 20) / 5) * (0.37046-(-2.57129)));
            yy = 16.96639 + (((tickAnim - 20) / 5) * (-4.37439-(16.96639)));
            zz = 2.85264 + (((tickAnim - 20) / 5) * (21.65911-(2.85264)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0.37046 + (((tickAnim - 25) / 5) * (3.4427-(0.37046)));
            yy = -4.37439 + (((tickAnim - 25) / 5) * (-16.79985-(-4.37439)));
            zz = 21.65911 + (((tickAnim - 25) / 5) * (-3.64399-(21.65911)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 3.4427 + (((tickAnim - 30) / 8) * (-1.57-(3.4427)));
            yy = -16.79985 + (((tickAnim - 30) / 8) * (11.34-(-16.79985)));
            zz = -3.64399 + (((tickAnim - 30) / 8) * (1.77-(-3.64399)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -1.57 + (((tickAnim - 38) / 2) * (-2.57129-(-1.57)));
            yy = 11.34 + (((tickAnim - 38) / 2) * (16.96639-(11.34)));
            zz = 1.77 + (((tickAnim - 38) / 2) * (2.85264-(1.77)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legR5, legR5.rotateAngleX + (float) Math.toRadians(xx), legR5.rotateAngleY + (float) Math.toRadians(yy), legR5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 2.42 + (((tickAnim - 0) / 2) * (3.4427-(2.42)));
            yy = 12.66 + (((tickAnim - 0) / 2) * (16.79985-(12.66)));
            zz = -4.79 + (((tickAnim - 0) / 2) * (3.64399-(-4.79)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 3.4427 + (((tickAnim - 2) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 2) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 2) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -2.57129 + (((tickAnim - 12) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 12) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 12) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0.37046 + (((tickAnim - 17) / 5) * (3.4427-(0.37046)));
            yy = 4.37439 + (((tickAnim - 17) / 5) * (16.79985-(4.37439)));
            zz = -21.65911 + (((tickAnim - 17) / 5) * (3.64399-(-21.65911)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 3.4427 + (((tickAnim - 22) / 10) * (-2.57129-(3.4427)));
            yy = 16.79985 + (((tickAnim - 22) / 10) * (-16.96639-(16.79985)));
            zz = 3.64399 + (((tickAnim - 22) / 10) * (-2.85264-(3.64399)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = -2.57129 + (((tickAnim - 32) / 5) * (0.37046-(-2.57129)));
            yy = -16.96639 + (((tickAnim - 32) / 5) * (4.37439-(-16.96639)));
            zz = -2.85264 + (((tickAnim - 32) / 5) * (-21.65911-(-2.85264)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0.37046 + (((tickAnim - 37) / 3) * (2.42-(0.37046)));
            yy = 4.37439 + (((tickAnim - 37) / 3) * (12.66-(4.37439)));
            zz = -21.65911 + (((tickAnim - 37) / 3) * (-4.79-(-21.65911)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legL5, legL5.rotateAngleX + (float) Math.toRadians(xx), legL5.rotateAngleY + (float) Math.toRadians(yy), legL5.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraChasmataspis e = (EntityPrehistoricFloraChasmataspis) entity;

    }
}
