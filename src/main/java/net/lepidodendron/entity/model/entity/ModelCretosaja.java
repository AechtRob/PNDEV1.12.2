package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCretosaja;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingGlidingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCretosaja extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer belly;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer hindwingright;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer hindwingright2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hindwingleft;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer hindwingleft2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer elytronright;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer elytronleft;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer antennaright;
    private final AdvancedModelRenderer antennaleft;

    private ModelAnimator animator;

    public ModelCretosaja() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 23.35F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 12, 14, -1.0F, -1.0F, -4.0F, 2, 1, 2, 0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 16, 3, -1.0F, -1.35F, -4.0F, 2, 1, 2, 0.02F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 22, -1.25F, -1.35F, -4.0F, 1, 0, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 22, 0.25F, -1.35F, -4.0F, 1, 0, 2, 0.0F, true));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.body.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.3491F, -0.1745F);
        this.legright.cubeList.add(new ModelBox(legright, 12, 8, -3.0F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.body.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, -0.3491F, 0.1745F);
        this.legleft.cubeList.add(new ModelBox(legleft, 12, 8, 0.0F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        this.belly = new AdvancedModelRenderer(this);
        this.belly.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.body.addChild(belly);
        this.setRotateAngle(belly, -0.0436F, 0.0F, 0.0F);
        this.belly.cubeList.add(new ModelBox(belly, 0, 17, -1.0F, -0.25F, 0.0F, 2, 1, 2, 0.0F, false));
        this.belly.cubeList.add(new ModelBox(belly, 22, 20, -1.0F, 0.0F, 5.0F, 2, 1, 1, 0.0F, false));
        this.belly.cubeList.add(new ModelBox(belly, 16, 6, -1.5F, -0.15F, 4.0F, 3, 1, 1, 0.01F, false));
        this.belly.cubeList.add(new ModelBox(belly, 0, 8, -2.0F, -0.25F, 2.0F, 4, 1, 2, 0.0F, false));
        this.belly.cubeList.add(new ModelBox(belly, 8, 17, -1.0F, 0.0F, 0.025F, 2, 1, 2, -0.01F, false));
        this.belly.cubeList.add(new ModelBox(belly, 0, 11, -2.0F, 0.25F, 2.0F, 4, 1, 2, -0.01F, false));
        this.belly.cubeList.add(new ModelBox(belly, 0, 20, -1.5F, 0.15F, 4.0F, 3, 1, 1, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-0.5F, 1.0F, 0.5F);
        this.belly.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.2618F, -0.1309F);
        this.legright2.cubeList.add(new ModelBox(legright2, 0, 0, -4.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, false));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.5F, 1.0F, 0.5F);
        this.belly.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.2618F, 0.1309F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 0, 0, 0.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, true));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-0.8F, 1.0F, 1.75F);
        this.belly.addChild(legright3);
        this.setRotateAngle(legright3, 0.0F, 0.3054F, -0.1745F);
        this.legright3.cubeList.add(new ModelBox(legright3, 0, 4, -4.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, false));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.8F, 1.0F, 1.75F);
        this.belly.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.0F, -0.3054F, 0.1745F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 0, 4, 0.0F, 0.0F, -0.5F, 4, 0, 4, 0.0F, true));

        this.hindwingright = new AdvancedModelRenderer(this);
        this.hindwingright.setRotationPoint(-0.75F, -0.2522F, 0.0F);
        this.belly.addChild(hindwingright);
        this.setRotateAngle(hindwingright, 0.0F, 1.5708F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.0F, 0.0F, 0.5F);
        this.hindwingright.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, -1.5664F, -1.5708F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 11, -1.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, false));

        this.hindwingright2 = new AdvancedModelRenderer(this);
        this.hindwingright2.setRotationPoint(-3.0F, 0.0F, -0.5F);
        this.hindwingright.addChild(hindwingright2);
        this.setRotateAngle(hindwingright2, 0.0F, 1.5708F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, 1.0F);
        this.hindwingright2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, -1.5664F, -1.5708F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 14, -1.0F, 0.01F, -1.0F, 3, 0, 3, 0.0F, false));

        this.hindwingleft = new AdvancedModelRenderer(this);
        this.hindwingleft.setRotationPoint(0.75F, -0.2522F, 0.0F);
        this.belly.addChild(hindwingleft);
        this.setRotateAngle(hindwingleft, 0.0F, -1.5708F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, 0.0F, 0.5F);
        this.hindwingleft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5708F, 1.5664F, 1.5708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 11, -2.0F, 0.0F, -1.0F, 3, 0, 3, 0.0F, true));

        this.hindwingleft2 = new AdvancedModelRenderer(this);
        this.hindwingleft2.setRotationPoint(3.0F, 0.0F, -0.5F);
        this.hindwingleft.addChild(hindwingleft2);
        this.setRotateAngle(hindwingleft2, 0.0F, -1.5708F, 0.0F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.0F, 0.0F, 1.0F);
        this.hindwingleft2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5708F, 1.5664F, 1.5708F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -2.0F, 0.01F, -1.0F, 3, 0, 3, 0.0F, true));

        this.elytronright = new AdvancedModelRenderer(this);
        this.elytronright.setRotationPoint(-1.0F, -1.2F, -2.0F);
        this.body.addChild(elytronright);
        this.setRotateAngle(elytronright, 0.0F, -0.0044F, 0.0F);
        this.elytronright.cubeList.add(new ModelBox(elytronright, 16, 0, -1.0F, -0.1F, 1.2456F, 2, 1, 2, 0.01F, false));
        this.elytronright.cubeList.add(new ModelBox(elytronright, 20, 14, 0.0F, -0.1F, -0.5044F, 1, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.9F, -0.5044F);
        this.elytronright.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.5236F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 20, 0.0F, -1.0F, 0.025F, 1, 1, 2, -0.01F, false));

        this.elytronleft = new AdvancedModelRenderer(this);
        this.elytronleft.setRotationPoint(1.0F, -1.2F, -2.0F);
        this.body.addChild(elytronleft);
        this.setRotateAngle(elytronleft, 0.0F, 0.0044F, 0.0F);
        this.elytronleft.cubeList.add(new ModelBox(elytronleft, 16, 17, -1.0F, -0.1F, 1.2456F, 2, 1, 2, 0.01F, false));
        this.elytronleft.cubeList.add(new ModelBox(elytronleft, 0, 22, -1.0F, -0.1F, -0.5044F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.9F, -0.5044F);
        this.elytronleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.5236F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 22, -1.0F, -1.0F, 0.025F, 1, 1, 2, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.body.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 16, 23, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.475F, 1.0F, -0.25F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.48F, 0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 23, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.475F, 1.0F, -0.25F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.48F, -0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 23, 0.0F, -1.0F, -1.0F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 1.0F, 0.5F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6981F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 22, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.0F, 0.5F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.6981F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 22, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.01F, false));

        this.antennaright = new AdvancedModelRenderer(this);
        this.antennaright.setRotationPoint(-0.5F, 0.25F, -1.0F);
        this.head.addChild(antennaright);
        this.setRotateAngle(antennaright, -0.3491F, 0.2618F, 0.0F);
        this.antennaright.cubeList.add(new ModelBox(antennaright, 8, 20, -1.75F, 0.0F, -1.75F, 2, 0, 2, 0.0F, false));

        this.antennaleft = new AdvancedModelRenderer(this);
        this.antennaleft.setRotationPoint(0.5F, 0.25F, -1.0F);
        this.head.addChild(antennaleft);
        this.setRotateAngle(antennaleft, -0.3491F, -0.2618F, 0.0F);
        this.antennaleft.cubeList.add(new ModelBox(antennaleft, 8, 20, -0.25F, 0.0F, -1.75F, 2, 0, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(body, 1.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.25F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticDisplayCase(float f) {
        //this.body.offsetZ = -0.080F;
        this.body.render(0.01f);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.30F;
        this.body.offsetX = -0.05F;
        this.body.rotateAngleY = (float)Math.toRadians(210);
        this.body.rotateAngleX = (float)Math.toRadians(40);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 3.9F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);

        EntityPrehistoricFloraCretosaja ee = (EntityPrehistoricFloraCretosaja) e;
        AdvancedModelRenderer[] Neck = {this.head};

        if (ee.getAnimation() != ee.LAY_ANIMATION && (!ee.getIsFlying()) && (!ee.getIsClimbing()) && (!ee.getIsFast())) {
            //Just bob the tail and neck a little bit
            this.chainSwing(Neck, 0.1F, 0.04F, 0.5, f2, 0.4F);
            this.chainWave(Neck, 0.2F, -0.02F, 0.5F, f2, 0.4F);
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCretosaja ee = (EntityPrehistoricFloraCretosaja) entitylivingbaseIn;

        if (ee.getIsFlying()) {//if flying
            animFlying(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        } else {//not flying
            if(ee.getIsMoving()) {
                animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }

    }

    public void animFlying(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCretosaja entity = (EntityPrehistoricFloraCretosaja) entitylivingbaseIn;
        int animCycle = 38;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(elytronright, elytronright.rotateAngleX + (float) Math.toRadians(-0.48794), elytronright.rotateAngleY + (float) Math.toRadians(4.4888), elytronright.rotateAngleZ + (float) Math.toRadians(157.46238));


        this.setRotateAngle(elytronleft, elytronleft.rotateAngleX + (float) Math.toRadians(-0.48794), elytronleft.rotateAngleY + (float) Math.toRadians(-4.4888), elytronleft.rotateAngleZ + (float) Math.toRadians(-157.46238));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-37.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187))*20));
        this.body.rotationPointX = this.body.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*187-60))*3);
        this.body.rotationPointY = this.body.rotationPointY - (float)(2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*374+40))*1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(0), legright.rotateAngleY + (float) Math.toRadians(-25), legright.rotateAngleZ + (float) Math.toRadians(60));


        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(0), legleft.rotateAngleY + (float) Math.toRadians(25), legleft.rotateAngleZ + (float) Math.toRadians(-60));


        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(78.10973), legright2.rotateAngleY + (float) Math.toRadians(-30.412), legright2.rotateAngleZ + (float) Math.toRadians(46.44993));


        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(73.2949), legleft2.rotateAngleY + (float) Math.toRadians(29.17537), legleft2.rotateAngleZ + (float) Math.toRadians(-53.27931));


        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+120))*10, legright3.rotateAngleY + (float) Math.toRadians(15), legright3.rotateAngleZ + (float) Math.toRadians((Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*10));


        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*10, legleft3.rotateAngleY + (float) Math.toRadians(-15), legleft3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(374))+100))*10);



        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 11.44294 + (((tickAnim - 0) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 0) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 0) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 40.8813 + (((tickAnim - 1) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 1) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 1) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -16.38541 + (((tickAnim - 2) / 0) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 2) / 0) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 2) / 0) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -56.05047 + (((tickAnim - 2) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 2) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 2) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 11.44294 + (((tickAnim - 3) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 3) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 3) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 40.8813 + (((tickAnim - 4) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 4) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 4) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -16.38541 + (((tickAnim - 5) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 5) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 5) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -56.05047 + (((tickAnim - 6) / 0) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 6) / 0) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 6) / 0) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 11.44294 + (((tickAnim - 6) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 6) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 6) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 40.8813 + (((tickAnim - 7) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 7) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 7) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -16.38541 + (((tickAnim - 8) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 8) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 8) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -56.05047 + (((tickAnim - 9) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 9) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 9) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 11.44294 + (((tickAnim - 10) / 0) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 10) / 0) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 10) / 0) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 40.8813 + (((tickAnim - 10) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 10) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 10) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -16.38541 + (((tickAnim - 11) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 11) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 11) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -56.05047 + (((tickAnim - 12) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 12) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 12) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.44294 + (((tickAnim - 13) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 13) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 13) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 40.8813 + (((tickAnim - 14) / 0) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 14) / 0) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 14) / 0) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -16.38541 + (((tickAnim - 14) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 14) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 14) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -56.05047 + (((tickAnim - 15) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 15) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 15) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 11.44294 + (((tickAnim - 16) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 16) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 16) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 40.8813 + (((tickAnim - 17) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 17) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 17) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -16.38541 + (((tickAnim - 18) / 0) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 18) / 0) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 18) / 0) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -56.05047 + (((tickAnim - 18) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 18) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 18) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 11.44294 + (((tickAnim - 19) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 19) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 19) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 40.8813 + (((tickAnim - 20) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 20) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 20) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -16.38541 + (((tickAnim - 21) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 21) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 21) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -56.05047 + (((tickAnim - 22) / 0) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 22) / 0) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 22) / 0) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 11.44294 + (((tickAnim - 22) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 22) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 22) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 40.8813 + (((tickAnim - 23) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 23) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 23) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -16.38541 + (((tickAnim - 24) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 24) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 24) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -56.05047 + (((tickAnim - 25) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 25) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 25) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 11.44294 + (((tickAnim - 26) / 0) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 26) / 0) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 26) / 0) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 40.8813 + (((tickAnim - 26) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 26) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 26) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -16.38541 + (((tickAnim - 27) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 27) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 27) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -56.05047 + (((tickAnim - 28) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 28) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 28) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 11.44294 + (((tickAnim - 29) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 29) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 29) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 40.8813 + (((tickAnim - 30) / 0) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 30) / 0) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 30) / 0) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -16.38541 + (((tickAnim - 30) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 30) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 30) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -56.05047 + (((tickAnim - 31) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 31) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 31) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 11.44294 + (((tickAnim - 32) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 32) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 32) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 40.8813 + (((tickAnim - 33) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 33) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 33) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -16.38541 + (((tickAnim - 34) / 0) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 34) / 0) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 34) / 0) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -56.05047 + (((tickAnim - 34) / 1) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 34) / 1) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 34) / 1) * (64.57782-(40.09922)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 11.44294 + (((tickAnim - 35) / 1) * (40.8813-(11.44294)));
            yy = -96.22334 + (((tickAnim - 35) / 1) * (-89.14284-(-96.22334)));
            zz = 64.57782 + (((tickAnim - 35) / 1) * (-25.81343-(64.57782)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 40.8813 + (((tickAnim - 36) / 1) * (-16.38541-(40.8813)));
            yy = -89.14284 + (((tickAnim - 36) / 1) * (-105.27415-(-89.14284)));
            zz = -25.81343 + (((tickAnim - 36) / 1) * (-61.30527-(-25.81343)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -16.38541 + (((tickAnim - 37) / 1) * (-56.05047-(-16.38541)));
            yy = -105.27415 + (((tickAnim - 37) / 1) * (-98.04368-(-105.27415)));
            zz = -61.30527 + (((tickAnim - 37) / 1) * (40.09922-(-61.30527)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -56.05047 + (((tickAnim - 38) / 0) * (11.44294-(-56.05047)));
            yy = -98.04368 + (((tickAnim - 38) / 0) * (-96.22334-(-98.04368)));
            zz = 40.09922 + (((tickAnim - 38) / 0) * (64.57782-(40.09922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingright, hindwingright.rotateAngleX + (float) Math.toRadians(xx), hindwingright.rotateAngleY + (float) Math.toRadians(yy), hindwingright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 0) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 0) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 1) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 1) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 2) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 2) / 0) * (-90-(-90)));
            zz = -45 + (((tickAnim - 2) / 0) * (-33.75-(-45)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 2) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 2) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 3) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 3) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 4) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 4) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 5) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 5) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 6) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 6) / 0) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 6) / 0) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 6) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 6) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 7) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 7) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 8) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 8) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 9) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 9) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 10) / 0) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 10) / 0) * (22.5-(22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 10) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 10) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 11) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 11) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 12) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 12) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 13) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 13) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 14) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 14) / 0) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 14) / 0) * (-45-(22.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 14) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 14) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 15) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 15) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 16) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 16) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 17) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 17) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 18) / 0) * (-90-(-90)));
            zz = -45 + (((tickAnim - 18) / 0) * (-33.75-(-45)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 18) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 18) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 19) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 19) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 20) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 20) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 21) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 21) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 22) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 22) / 0) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 22) / 0) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 22) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 22) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 23) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 23) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 24) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 24) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 25) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 25) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 26) / 0) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 26) / 0) * (22.5-(22.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 26) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 26) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 27) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 27) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 28) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 28) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 29) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 29) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 30) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 30) / 0) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 30) / 0) * (-45-(22.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 30) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 30) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 31) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 31) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 32) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 32) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 33) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 33) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 34) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 34) / 0) * (-90-(-90)));
            zz = -45 + (((tickAnim - 34) / 0) * (-33.75-(-45)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 34) / 1) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 34) / 1) * (22.5-(-33.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 35) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 35) / 1) * (22.5-(22.5)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 36) / 1) * (-90-(-90)));
            zz = 22.5 + (((tickAnim - 36) / 1) * (-45-(22.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = -90 + (((tickAnim - 37) / 1) * (-90-(-90)));
            zz = -45 + (((tickAnim - 37) / 1) * (-33.75-(-45)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = -90 + (((tickAnim - 38) / 0) * (-90-(-90)));
            zz = -33.75 + (((tickAnim - 38) / 0) * (22.5-(-33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingright2, hindwingright2.rotateAngleX + (float) Math.toRadians(xx), hindwingright2.rotateAngleY + (float) Math.toRadians(yy), hindwingright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 11.44294 + (((tickAnim - 0) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 0) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 0) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 40.8813 + (((tickAnim - 1) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 1) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 1) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = -16.38541 + (((tickAnim - 2) / 0) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 2) / 0) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 2) / 0) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -56.05047 + (((tickAnim - 2) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 2) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 2) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 11.44294 + (((tickAnim - 3) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 3) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 3) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 40.8813 + (((tickAnim - 4) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 4) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 4) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -16.38541 + (((tickAnim - 5) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 5) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 5) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = -56.05047 + (((tickAnim - 6) / 0) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 6) / 0) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 6) / 0) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 11.44294 + (((tickAnim - 6) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 6) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 6) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 40.8813 + (((tickAnim - 7) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 7) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 7) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -16.38541 + (((tickAnim - 8) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 8) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 8) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -56.05047 + (((tickAnim - 9) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 9) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 9) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 11.44294 + (((tickAnim - 10) / 0) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 10) / 0) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 10) / 0) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 40.8813 + (((tickAnim - 10) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 10) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 10) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -16.38541 + (((tickAnim - 11) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 11) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 11) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -56.05047 + (((tickAnim - 12) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 12) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 12) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 11.44294 + (((tickAnim - 13) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 13) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 13) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 40.8813 + (((tickAnim - 14) / 0) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 14) / 0) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 14) / 0) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = -16.38541 + (((tickAnim - 14) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 14) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 14) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = -56.05047 + (((tickAnim - 15) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 15) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 15) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 11.44294 + (((tickAnim - 16) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 16) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 16) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 40.8813 + (((tickAnim - 17) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 17) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 17) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -16.38541 + (((tickAnim - 18) / 0) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 18) / 0) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 18) / 0) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = -56.05047 + (((tickAnim - 18) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 18) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 18) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 11.44294 + (((tickAnim - 19) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 19) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 19) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 40.8813 + (((tickAnim - 20) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 20) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 20) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -16.38541 + (((tickAnim - 21) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 21) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 21) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = -56.05047 + (((tickAnim - 22) / 0) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 22) / 0) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 22) / 0) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 11.44294 + (((tickAnim - 22) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 22) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 22) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 40.8813 + (((tickAnim - 23) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 23) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 23) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = -16.38541 + (((tickAnim - 24) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 24) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 24) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = -56.05047 + (((tickAnim - 25) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 25) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 25) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 11.44294 + (((tickAnim - 26) / 0) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 26) / 0) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 26) / 0) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 40.8813 + (((tickAnim - 26) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 26) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 26) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = -16.38541 + (((tickAnim - 27) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 27) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 27) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = -56.05047 + (((tickAnim - 28) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 28) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 28) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 11.44294 + (((tickAnim - 29) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 29) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 29) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 40.8813 + (((tickAnim - 30) / 0) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 30) / 0) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 30) / 0) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = -16.38541 + (((tickAnim - 30) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 30) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 30) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = -56.05047 + (((tickAnim - 31) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 31) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 31) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 11.44294 + (((tickAnim - 32) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 32) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 32) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 40.8813 + (((tickAnim - 33) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 33) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 33) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = -16.38541 + (((tickAnim - 34) / 0) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 34) / 0) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 34) / 0) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = -56.05047 + (((tickAnim - 34) / 1) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 34) / 1) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 34) / 1) * (-64.57782-(-40.09922)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 11.44294 + (((tickAnim - 35) / 1) * (40.8813-(11.44294)));
            yy = 96.22334 + (((tickAnim - 35) / 1) * (89.14284-(96.22334)));
            zz = -64.57782 + (((tickAnim - 35) / 1) * (25.81343-(-64.57782)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 40.8813 + (((tickAnim - 36) / 1) * (-16.38541-(40.8813)));
            yy = 89.14284 + (((tickAnim - 36) / 1) * (105.27415-(89.14284)));
            zz = 25.81343 + (((tickAnim - 36) / 1) * (61.30527-(25.81343)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = -16.38541 + (((tickAnim - 37) / 1) * (-56.05047-(-16.38541)));
            yy = 105.27415 + (((tickAnim - 37) / 1) * (98.04368-(105.27415)));
            zz = 61.30527 + (((tickAnim - 37) / 1) * (-40.09922-(61.30527)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = -56.05047 + (((tickAnim - 38) / 0) * (11.44294-(-56.05047)));
            yy = 98.04368 + (((tickAnim - 38) / 0) * (96.22334-(98.04368)));
            zz = -40.09922 + (((tickAnim - 38) / 0) * (-64.57782-(-40.09922)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingleft, hindwingleft.rotateAngleX + (float) Math.toRadians(xx), hindwingleft.rotateAngleY + (float) Math.toRadians(yy), hindwingleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 0) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 0) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 1) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 1) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 2 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 2) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 2) / 0) * (90-(90)));
            zz = 45 + (((tickAnim - 2) / 0) * (33.75-(45)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 2) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 2) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 3) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 3) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 4) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 4) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 5) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 5) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 6 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 6) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 6) / 0) * (90-(90)));
            zz = 33.75 + (((tickAnim - 6) / 0) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 6) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 6) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 7) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 7) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 8) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 8) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 9) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 9) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 10) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 10) / 0) * (90-(90)));
            zz = -22.5 + (((tickAnim - 10) / 0) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 10) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 10) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 11) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 11) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 12) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 12) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 13) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 13) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 14) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 14) / 0) * (90-(90)));
            zz = -22.5 + (((tickAnim - 14) / 0) * (45-(-22.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 14) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 14) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 15) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 15) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 16) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 16) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 17) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 17) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 18) / 0) * (90-(90)));
            zz = 45 + (((tickAnim - 18) / 0) * (33.75-(45)));
        }
        else if (tickAnim >= 18 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 18) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 18) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 18) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 19 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 19) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 19) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 19) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 20) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 20) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 20) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 21) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 21) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 22 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 22) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 22) / 0) * (90-(90)));
            zz = 33.75 + (((tickAnim - 22) / 0) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 22) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 22) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 23) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 23) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 23) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 24 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 24) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 24) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 24) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 25 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 25) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 25) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 25) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 26 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 26) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 26) / 0) * (90-(90)));
            zz = -22.5 + (((tickAnim - 26) / 0) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 26) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 26) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 26) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 27) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 27) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 27) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 28 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 28) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 28) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 28) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 29) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 29) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 30) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 30) / 0) * (90-(90)));
            zz = -22.5 + (((tickAnim - 30) / 0) * (45-(-22.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 30) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 30) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 30) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 31) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 31) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 31) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 32) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 32) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 33) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 33) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 33) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 34) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 34) / 0) * (90-(90)));
            zz = 45 + (((tickAnim - 34) / 0) * (33.75-(45)));
        }
        else if (tickAnim >= 34 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 34) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 34) / 1) * (90-(90)));
            zz = 33.75 + (((tickAnim - 34) / 1) * (-22.5-(33.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 35) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 35) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 35) / 1) * (-22.5-(-22.5)));
        }
        else if (tickAnim >= 36 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 36) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 36) / 1) * (90-(90)));
            zz = -22.5 + (((tickAnim - 36) / 1) * (45-(-22.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 90 + (((tickAnim - 37) / 1) * (90-(90)));
            zz = 45 + (((tickAnim - 37) / 1) * (33.75-(45)));
        }
        else if (tickAnim >= 38 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 38) / 0) * (0-(0)));
            yy = 90 + (((tickAnim - 38) / 0) * (90-(90)));
            zz = 33.75 + (((tickAnim - 38) / 0) * (-22.5-(33.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hindwingleft2, hindwingleft2.rotateAngleX + (float) Math.toRadians(xx), hindwingleft2.rotateAngleY + (float) Math.toRadians(yy), hindwingleft2.rotateAngleZ + (float) Math.toRadians(zz));
       
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCretosaja entity = (EntityPrehistoricFloraCretosaja) entitylivingbaseIn;
        int animCycle = 43;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))+90))*4, body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*(167*3))))*4);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -12.35329 + (((tickAnim - 0) / 4) * (-5.2984-(-12.35329)));
            yy = 27.34791 + (((tickAnim - 0) / 4) * (-7.89102-(27.34791)));
            zz = -5.90934 + (((tickAnim - 0) / 4) * (25.15067-(-5.90934)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -5.2984 + (((tickAnim - 4) / 3) * (21.1718-(-5.2984)));
            yy = -7.89102 + (((tickAnim - 4) / 3) * (-42.48554-(-7.89102)));
            zz = 25.15067 + (((tickAnim - 4) / 3) * (2.16463-(25.15067)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 21.1718 + (((tickAnim - 7) / 4) * (3.58049-(21.1718)));
            yy = -42.48554 + (((tickAnim - 7) / 4) * (-7.87853-(-42.48554)));
            zz = 2.16463 + (((tickAnim - 7) / 4) * (7.35384-(2.16463)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 3.58049 + (((tickAnim - 11) / 2) * (-2.95646-(3.58049)));
            yy = -7.87853 + (((tickAnim - 11) / 2) * (9.89481-(-7.87853)));
            zz = 7.35384 + (((tickAnim - 11) / 2) * (3.5978-(7.35384)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -2.95646 + (((tickAnim - 13) / 1) * (-12.35329-(-2.95646)));
            yy = 9.89481 + (((tickAnim - 13) / 1) * (27.34791-(9.89481)));
            zz = 3.5978 + (((tickAnim - 13) / 1) * (-5.90934-(3.5978)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.35329 + (((tickAnim - 14) / 4) * (-5.2984-(-12.35329)));
            yy = 27.34791 + (((tickAnim - 14) / 4) * (-7.89102-(27.34791)));
            zz = -5.90934 + (((tickAnim - 14) / 4) * (25.15067-(-5.90934)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -5.2984 + (((tickAnim - 18) / 4) * (21.1718-(-5.2984)));
            yy = -7.89102 + (((tickAnim - 18) / 4) * (-42.48554-(-7.89102)));
            zz = 25.15067 + (((tickAnim - 18) / 4) * (2.16463-(25.15067)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 21.1718 + (((tickAnim - 22) / 4) * (3.58049-(21.1718)));
            yy = -42.48554 + (((tickAnim - 22) / 4) * (-7.87853-(-42.48554)));
            zz = 2.16463 + (((tickAnim - 22) / 4) * (7.35384-(2.16463)));
        }
        else if (tickAnim >= 26 && tickAnim < 27) {
            xx = 3.58049 + (((tickAnim - 26) / 1) * (-2.95646-(3.58049)));
            yy = -7.87853 + (((tickAnim - 26) / 1) * (9.89481-(-7.87853)));
            zz = 7.35384 + (((tickAnim - 26) / 1) * (3.5978-(7.35384)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -2.95646 + (((tickAnim - 27) / 2) * (-12.35329-(-2.95646)));
            yy = 9.89481 + (((tickAnim - 27) / 2) * (27.34791-(9.89481)));
            zz = 3.5978 + (((tickAnim - 27) / 2) * (-5.90934-(3.5978)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -12.35329 + (((tickAnim - 29) / 4) * (-5.2984-(-12.35329)));
            yy = 27.34791 + (((tickAnim - 29) / 4) * (-7.89102-(27.34791)));
            zz = -5.90934 + (((tickAnim - 29) / 4) * (25.15067-(-5.90934)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -5.2984 + (((tickAnim - 33) / 3) * (21.1718-(-5.2984)));
            yy = -7.89102 + (((tickAnim - 33) / 3) * (-42.48554-(-7.89102)));
            zz = 25.15067 + (((tickAnim - 33) / 3) * (2.16463-(25.15067)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 21.1718 + (((tickAnim - 36) / 4) * (3.58049-(21.1718)));
            yy = -42.48554 + (((tickAnim - 36) / 4) * (-7.87853-(-42.48554)));
            zz = 2.16463 + (((tickAnim - 36) / 4) * (7.35384-(2.16463)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 3.58049 + (((tickAnim - 40) / 2) * (-2.95646-(3.58049)));
            yy = -7.87853 + (((tickAnim - 40) / 2) * (9.89481-(-7.87853)));
            zz = 7.35384 + (((tickAnim - 40) / 2) * (3.5978-(7.35384)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = -2.95646 + (((tickAnim - 42) / 1) * (-12.35329-(-2.95646)));
            yy = 9.89481 + (((tickAnim - 42) / 1) * (27.34791-(9.89481)));
            zz = 3.5978 + (((tickAnim - 42) / 1) * (-5.90934-(3.5978)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -0.8282 + (((tickAnim - 0) / 4) * (3.04107-(-0.8282)));
            yy = 42.48554 + (((tickAnim - 0) / 4) * (7.73413-(42.48554)));
            zz = -2.16463 + (((tickAnim - 0) / 4) * (-4.8004-(-2.16463)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 3.04107 + (((tickAnim - 4) / 3) * (-4.35329-(3.04107)));
            yy = 7.73413 + (((tickAnim - 4) / 3) * (-27.34791-(7.73413)));
            zz = -4.8004 + (((tickAnim - 4) / 3) * (5.90934-(-4.8004)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -4.35329 + (((tickAnim - 7) / 4) * (-5.2984-(-4.35329)));
            yy = -27.34791 + (((tickAnim - 7) / 4) * (7.89102-(-27.34791)));
            zz = 5.90934 + (((tickAnim - 7) / 4) * (-25.15067-(5.90934)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -5.2984 + (((tickAnim - 11) / 3) * (-0.8282-(-5.2984)));
            yy = 7.89102 + (((tickAnim - 11) / 3) * (42.48554-(7.89102)));
            zz = -25.15067 + (((tickAnim - 11) / 3) * (-2.16463-(-25.15067)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.8282 + (((tickAnim - 14) / 4) * (3.04107-(-0.8282)));
            yy = 42.48554 + (((tickAnim - 14) / 4) * (7.73413-(42.48554)));
            zz = -2.16463 + (((tickAnim - 14) / 4) * (-4.8004-(-2.16463)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 3.04107 + (((tickAnim - 18) / 4) * (-4.35329-(3.04107)));
            yy = 7.73413 + (((tickAnim - 18) / 4) * (-27.34791-(7.73413)));
            zz = -4.8004 + (((tickAnim - 18) / 4) * (5.90934-(-4.8004)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -4.35329 + (((tickAnim - 22) / 4) * (-5.2984-(-4.35329)));
            yy = -27.34791 + (((tickAnim - 22) / 4) * (7.89102-(-27.34791)));
            zz = 5.90934 + (((tickAnim - 22) / 4) * (-25.15067-(5.90934)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -5.2984 + (((tickAnim - 26) / 3) * (-0.8282-(-5.2984)));
            yy = 7.89102 + (((tickAnim - 26) / 3) * (42.48554-(7.89102)));
            zz = -25.15067 + (((tickAnim - 26) / 3) * (-2.16463-(-25.15067)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -0.8282 + (((tickAnim - 29) / 4) * (3.04107-(-0.8282)));
            yy = 42.48554 + (((tickAnim - 29) / 4) * (7.73413-(42.48554)));
            zz = -2.16463 + (((tickAnim - 29) / 4) * (-4.8004-(-2.16463)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 3.04107 + (((tickAnim - 33) / 3) * (-4.35329-(3.04107)));
            yy = 7.73413 + (((tickAnim - 33) / 3) * (-27.34791-(7.73413)));
            zz = -4.8004 + (((tickAnim - 33) / 3) * (5.90934-(-4.8004)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -4.35329 + (((tickAnim - 36) / 4) * (-5.2984-(-4.35329)));
            yy = -27.34791 + (((tickAnim - 36) / 4) * (7.89102-(-27.34791)));
            zz = 5.90934 + (((tickAnim - 36) / 4) * (-25.15067-(5.90934)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -5.2984 + (((tickAnim - 40) / 3) * (-0.8282-(-5.2984)));
            yy = 7.89102 + (((tickAnim - 40) / 3) * (42.48554-(7.89102)));
            zz = -25.15067 + (((tickAnim - 40) / 3) * (-2.16463-(-25.15067)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -13.83441 + (((tickAnim - 0) / 4) * (-6.65088-(-13.83441)));
            yy = -31.12949 + (((tickAnim - 0) / 4) * (-1.99586-(-31.12949)));
            zz = 10.84093 + (((tickAnim - 0) / 4) * (0.51489-(10.84093)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.65088 + (((tickAnim - 4) / 3) * (2-(-6.65088)));
            yy = -1.99586 + (((tickAnim - 4) / 3) * (12.5-(-1.99586)));
            zz = 0.51489 + (((tickAnim - 4) / 3) * (0-(0.51489)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 2 + (((tickAnim - 7) / 4) * (-12.76472-(2)));
            yy = 12.5 + (((tickAnim - 7) / 4) * (-5.94151-(12.5)));
            zz = 0 + (((tickAnim - 7) / 4) * (32.36853-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -12.76472 + (((tickAnim - 11) / 3) * (-13.83441-(-12.76472)));
            yy = -5.94151 + (((tickAnim - 11) / 3) * (-31.12949-(-5.94151)));
            zz = 32.36853 + (((tickAnim - 11) / 3) * (10.84093-(32.36853)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -13.83441 + (((tickAnim - 14) / 4) * (-6.65088-(-13.83441)));
            yy = -31.12949 + (((tickAnim - 14) / 4) * (-1.99586-(-31.12949)));
            zz = 10.84093 + (((tickAnim - 14) / 4) * (0.51489-(10.84093)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.65088 + (((tickAnim - 18) / 4) * (2-(-6.65088)));
            yy = -1.99586 + (((tickAnim - 18) / 4) * (12.5-(-1.99586)));
            zz = 0.51489 + (((tickAnim - 18) / 4) * (0-(0.51489)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 2 + (((tickAnim - 22) / 4) * (-12.76472-(2)));
            yy = 12.5 + (((tickAnim - 22) / 4) * (-5.94151-(12.5)));
            zz = 0 + (((tickAnim - 22) / 4) * (32.36853-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -12.76472 + (((tickAnim - 26) / 3) * (-13.83441-(-12.76472)));
            yy = -5.94151 + (((tickAnim - 26) / 3) * (-31.12949-(-5.94151)));
            zz = 32.36853 + (((tickAnim - 26) / 3) * (10.84093-(32.36853)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -13.83441 + (((tickAnim - 29) / 4) * (-6.65088-(-13.83441)));
            yy = -31.12949 + (((tickAnim - 29) / 4) * (-1.99586-(-31.12949)));
            zz = 10.84093 + (((tickAnim - 29) / 4) * (0.51489-(10.84093)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -6.65088 + (((tickAnim - 33) / 3) * (2-(-6.65088)));
            yy = -1.99586 + (((tickAnim - 33) / 3) * (12.5-(-1.99586)));
            zz = 0.51489 + (((tickAnim - 33) / 3) * (0-(0.51489)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 36) / 4) * (-12.76472-(2)));
            yy = 12.5 + (((tickAnim - 36) / 4) * (-5.94151-(12.5)));
            zz = 0 + (((tickAnim - 36) / 4) * (32.36853-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -12.76472 + (((tickAnim - 40) / 3) * (-13.83441-(-12.76472)));
            yy = -5.94151 + (((tickAnim - 40) / 3) * (-31.12949-(-5.94151)));
            zz = 32.36853 + (((tickAnim - 40) / 3) * (10.84093-(32.36853)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2 + (((tickAnim - 0) / 4) * (-12.76472-(-2)));
            yy = -12.5 + (((tickAnim - 0) / 4) * (5.94151-(-12.5)));
            zz = 0 + (((tickAnim - 0) / 4) * (-32.36853-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -12.76472 + (((tickAnim - 4) / 3) * (-2-(-12.76472)));
            yy = 5.94151 + (((tickAnim - 4) / 3) * (31.25-(5.94151)));
            zz = -32.36853 + (((tickAnim - 4) / 3) * (0-(-32.36853)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -2 + (((tickAnim - 7) / 4) * (-6.65088-(-2)));
            yy = 31.25 + (((tickAnim - 7) / 4) * (1.99586-(31.25)));
            zz = 0 + (((tickAnim - 7) / 4) * (-0.51489-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -6.65088 + (((tickAnim - 11) / 3) * (-2-(-6.65088)));
            yy = 1.99586 + (((tickAnim - 11) / 3) * (-12.5-(1.99586)));
            zz = -0.51489 + (((tickAnim - 11) / 3) * (0-(-0.51489)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 14) / 4) * (-12.76472-(-2)));
            yy = -12.5 + (((tickAnim - 14) / 4) * (5.94151-(-12.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (-32.36853-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -12.76472 + (((tickAnim - 18) / 4) * (-2-(-12.76472)));
            yy = 5.94151 + (((tickAnim - 18) / 4) * (31.25-(5.94151)));
            zz = -32.36853 + (((tickAnim - 18) / 4) * (0-(-32.36853)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -2 + (((tickAnim - 22) / 4) * (-6.65088-(-2)));
            yy = 31.25 + (((tickAnim - 22) / 4) * (1.99586-(31.25)));
            zz = 0 + (((tickAnim - 22) / 4) * (-0.51489-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -6.65088 + (((tickAnim - 26) / 3) * (-2-(-6.65088)));
            yy = 1.99586 + (((tickAnim - 26) / 3) * (-12.5-(1.99586)));
            zz = -0.51489 + (((tickAnim - 26) / 3) * (0-(-0.51489)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -2 + (((tickAnim - 29) / 4) * (-12.76472-(-2)));
            yy = -12.5 + (((tickAnim - 29) / 4) * (5.94151-(-12.5)));
            zz = 0 + (((tickAnim - 29) / 4) * (-32.36853-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -12.76472 + (((tickAnim - 33) / 3) * (-2-(-12.76472)));
            yy = 5.94151 + (((tickAnim - 33) / 3) * (31.25-(5.94151)));
            zz = -32.36853 + (((tickAnim - 33) / 3) * (0-(-32.36853)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 36) / 4) * (-6.65088-(-2)));
            yy = 31.25 + (((tickAnim - 36) / 4) * (1.99586-(31.25)));
            zz = 0 + (((tickAnim - 36) / 4) * (-0.51489-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -6.65088 + (((tickAnim - 40) / 3) * (-2-(-6.65088)));
            yy = 1.99586 + (((tickAnim - 40) / 3) * (-12.5-(1.99586)));
            zz = -0.51489 + (((tickAnim - 40) / 3) * (0-(-0.51489)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -9.4572 + (((tickAnim - 0) / 4) * (-6.71812-(-9.4572)));
            yy = 13.49757 + (((tickAnim - 0) / 4) * (-3.02337-(13.49757)));
            zz = 4.6652 + (((tickAnim - 0) / 4) * (33.51154-(4.6652)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.71812 + (((tickAnim - 4) / 3) * (-16.42289-(-6.71812)));
            yy = -3.02337 + (((tickAnim - 4) / 3) * (-22.14901-(-3.02337)));
            zz = 33.51154 + (((tickAnim - 4) / 3) * (20.495-(33.51154)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -16.42289 + (((tickAnim - 7) / 2) * (-12.78274-(-16.42289)));
            yy = -22.14901 + (((tickAnim - 7) / 2) * (-13.42969-(-22.14901)));
            zz = 20.495 + (((tickAnim - 7) / 2) * (22.90037-(20.495)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -12.78274 + (((tickAnim - 9) / 1) * (-9.52459-(-12.78274)));
            yy = -13.42969 + (((tickAnim - 9) / 1) * (-6.04795-(-13.42969)));
            zz = 22.90037 + (((tickAnim - 9) / 1) * (19.44424-(22.90037)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -9.52459 + (((tickAnim - 10) / 4) * (-9.4572-(-9.52459)));
            yy = -6.04795 + (((tickAnim - 10) / 4) * (13.49757-(-6.04795)));
            zz = 19.44424 + (((tickAnim - 10) / 4) * (4.6652-(19.44424)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -9.4572 + (((tickAnim - 14) / 4) * (-6.71812-(-9.4572)));
            yy = 13.49757 + (((tickAnim - 14) / 4) * (-3.02337-(13.49757)));
            zz = 4.6652 + (((tickAnim - 14) / 4) * (33.51154-(4.6652)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -6.71812 + (((tickAnim - 18) / 4) * (-16.42289-(-6.71812)));
            yy = -3.02337 + (((tickAnim - 18) / 4) * (-22.14901-(-3.02337)));
            zz = 33.51154 + (((tickAnim - 18) / 4) * (20.495-(33.51154)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -16.42289 + (((tickAnim - 22) / 1) * (-12.78274-(-16.42289)));
            yy = -22.14901 + (((tickAnim - 22) / 1) * (-13.42969-(-22.14901)));
            zz = 20.495 + (((tickAnim - 22) / 1) * (22.90037-(20.495)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -12.78274 + (((tickAnim - 23) / 2) * (-9.52459-(-12.78274)));
            yy = -13.42969 + (((tickAnim - 23) / 2) * (-6.04795-(-13.42969)));
            zz = 22.90037 + (((tickAnim - 23) / 2) * (19.44424-(22.90037)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = -9.52459 + (((tickAnim - 25) / 4) * (-9.4572-(-9.52459)));
            yy = -6.04795 + (((tickAnim - 25) / 4) * (13.49757-(-6.04795)));
            zz = 19.44424 + (((tickAnim - 25) / 4) * (4.6652-(19.44424)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = -9.4572 + (((tickAnim - 29) / 4) * (-6.71812-(-9.4572)));
            yy = 13.49757 + (((tickAnim - 29) / 4) * (-3.02337-(13.49757)));
            zz = 4.6652 + (((tickAnim - 29) / 4) * (33.51154-(4.6652)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -6.71812 + (((tickAnim - 33) / 3) * (-16.42289-(-6.71812)));
            yy = -3.02337 + (((tickAnim - 33) / 3) * (-22.14901-(-3.02337)));
            zz = 33.51154 + (((tickAnim - 33) / 3) * (20.495-(33.51154)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -16.42289 + (((tickAnim - 36) / 2) * (-12.78274-(-16.42289)));
            yy = -22.14901 + (((tickAnim - 36) / 2) * (-13.42969-(-22.14901)));
            zz = 20.495 + (((tickAnim - 36) / 2) * (22.90037-(20.495)));
        }
        else if (tickAnim >= 38 && tickAnim < 39) {
            xx = -12.78274 + (((tickAnim - 38) / 1) * (-9.52459-(-12.78274)));
            yy = -13.42969 + (((tickAnim - 38) / 1) * (-6.04795-(-13.42969)));
            zz = 22.90037 + (((tickAnim - 38) / 1) * (19.44424-(22.90037)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -9.52459 + (((tickAnim - 39) / 4) * (-9.4572-(-9.52459)));
            yy = -6.04795 + (((tickAnim - 39) / 4) * (13.49757-(-6.04795)));
            zz = 19.44424 + (((tickAnim - 39) / 4) * (4.6652-(19.44424)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15.86907 + (((tickAnim - 0) / 3) * (-9.91793-(-15.86907)));
            yy = 23.81895 + (((tickAnim - 0) / 3) * (6.38569-(23.81895)));
            zz = -14.70534 + (((tickAnim - 0) / 3) * (-17.4341-(-14.70534)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -9.91793 + (((tickAnim - 3) / 4) * (-3.33533-(-9.91793)));
            yy = 6.38569 + (((tickAnim - 3) / 4) * (-14.61601-(6.38569)));
            zz = -17.4341 + (((tickAnim - 3) / 4) * (-16.33291-(-17.4341)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -3.33533 + (((tickAnim - 7) / 4) * (-6.71812-(-3.33533)));
            yy = -14.61601 + (((tickAnim - 7) / 4) * (3.02337-(-14.61601)));
            zz = -16.33291 + (((tickAnim - 7) / 4) * (-33.51154-(-16.33291)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = -6.71812 + (((tickAnim - 11) / 3) * (-15.86907-(-6.71812)));
            yy = 3.02337 + (((tickAnim - 11) / 3) * (23.81895-(3.02337)));
            zz = -33.51154 + (((tickAnim - 11) / 3) * (-14.70534-(-33.51154)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -15.86907 + (((tickAnim - 14) / 4) * (-9.91793-(-15.86907)));
            yy = 23.81895 + (((tickAnim - 14) / 4) * (6.38569-(23.81895)));
            zz = -14.70534 + (((tickAnim - 14) / 4) * (-17.4341-(-14.70534)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -9.91793 + (((tickAnim - 18) / 4) * (-3.33533-(-9.91793)));
            yy = 6.38569 + (((tickAnim - 18) / 4) * (-14.61601-(6.38569)));
            zz = -17.4341 + (((tickAnim - 18) / 4) * (-16.33291-(-17.4341)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -3.33533 + (((tickAnim - 22) / 4) * (-6.71812-(-3.33533)));
            yy = -14.61601 + (((tickAnim - 22) / 4) * (3.02337-(-14.61601)));
            zz = -16.33291 + (((tickAnim - 22) / 4) * (-33.51154-(-16.33291)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -6.71812 + (((tickAnim - 26) / 3) * (-15.86907-(-6.71812)));
            yy = 3.02337 + (((tickAnim - 26) / 3) * (23.81895-(3.02337)));
            zz = -33.51154 + (((tickAnim - 26) / 3) * (-14.70534-(-33.51154)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = -15.86907 + (((tickAnim - 29) / 3) * (-9.91793-(-15.86907)));
            yy = 23.81895 + (((tickAnim - 29) / 3) * (6.38569-(23.81895)));
            zz = -14.70534 + (((tickAnim - 29) / 3) * (-17.4341-(-14.70534)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -9.91793 + (((tickAnim - 32) / 4) * (-3.33533-(-9.91793)));
            yy = 6.38569 + (((tickAnim - 32) / 4) * (-14.61601-(6.38569)));
            zz = -17.4341 + (((tickAnim - 32) / 4) * (-16.33291-(-17.4341)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -3.33533 + (((tickAnim - 36) / 4) * (-6.71812-(-3.33533)));
            yy = -14.61601 + (((tickAnim - 36) / 4) * (3.02337-(-14.61601)));
            zz = -16.33291 + (((tickAnim - 36) / 4) * (-33.51154-(-16.33291)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -6.71812 + (((tickAnim - 40) / 3) * (-15.86907-(-6.71812)));
            yy = 3.02337 + (((tickAnim - 40) / 3) * (23.81895-(3.02337)));
            zz = -33.51154 + (((tickAnim - 40) / 3) * (-14.70534-(-33.51154)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraLandClimbingGlidingBase e = (EntityPrehistoricFloraLandClimbingGlidingBase) entity;
        animator.update(entity);
        //N/A
    }

}
