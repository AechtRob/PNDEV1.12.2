package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHylonomus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHylonomus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer armright1w;
    private final AdvancedModelRenderer armright1;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft1w;
    private final AdvancedModelRenderer armleft1;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legright1;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft1;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;


    private ModelAnimator animator;

    public ModelHylonomus() {
        this.textureWidth = 36;
        this.textureHeight = 36;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 22.0F, 5.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.85F, 1.4F);
        this.hip.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -2.0F, -1.0F, -1.0F, 3, 1, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.5F, 1.4F);
        this.hip.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 19, -2.0F, -2.0F, -1.0F, 3, 2, 3, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, 0.5F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 4, 4, -2.0F, -1.525F, -3.75F, 4, 3, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.025F, -2.75F);
        this.body.addChild(body2);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.5F, -1.0F);
        this.body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 3.1416F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 30, -3.0F, -3.0F, -1.0F, 4, 3, 3, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -2.25F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 5, 5, -2.0F, -1.5F, -2.75F, 4, 3, 3, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.025F, -2.75F);
        this.body3.addChild(chest);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.65F, -1.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0829F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 12, -2.0F, -3.0F, -1.0F, 3, 3, 3, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.25F, -2.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 24, -1.0F, -1.1F, -2.25F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0873F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 6, 25, -0.5F, -0.5F, -4.0F, 1, 1, 4, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, -1.025F, -2.1F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.55F, 0.5F, -4.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.2182F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 14, 24, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.825F, -1.0F, -2.45F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.2182F, -0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.825F, -1.0F, -2.45F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 11, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -0.5F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 14, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.55F, 0.5F, -4.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.2182F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 24, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 20, -0.5F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.55F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.2007F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 20, -1.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.55F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2007F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 20, 0.0F, -1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.armright1w = new AdvancedModelRenderer(this);
        this.armright1w.setRotationPoint(-1.5F, 1.0F, -1.0F);
        this.chest.addChild(armright1w);


        this.armright1 = new AdvancedModelRenderer(this);
        this.armright1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armright1w.addChild(armright1);
        this.setRotateAngle(armright1, -0.0436F, -1.0036F, 0.0F);
        this.armright1.cubeList.add(new ModelBox(armright1, 0, 11, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.01F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.armright1.addChild(armright2);
        this.setRotateAngle(armright2, 0.134F, 1.0288F, 0.2561F);
        this.armright2.cubeList.add(new ModelBox(armright2, 12, 25, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(0.0F, 1.55F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.1553F, 0.0283F, -0.0842F);
        this.armright3.cubeList.add(new ModelBox(armright3, 7, 11, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.armleft1w = new AdvancedModelRenderer(this);
        this.armleft1w.setRotationPoint(1.5F, 1.0F, -1.0F);
        this.chest.addChild(armleft1w);


        this.armleft1 = new AdvancedModelRenderer(this);
        this.armleft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.armleft1w.addChild(armleft1);
        this.setRotateAngle(armleft1, -0.0436F, 1.0036F, 0.0F);
        this.armleft1.cubeList.add(new ModelBox(armleft1, 0, 11, -0.5F, -0.5F, -0.5F, 1, 1, 2, 0.01F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(0.0F, 0.0F, 1.25F);
        this.armleft1.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.134F, -1.0288F, -0.2561F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 12, 25, -0.5F, -0.25F, -0.5F, 1, 2, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(0.0F, 1.55F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.1553F, -0.0283F, 0.0842F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 7, 11, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -0.6F, 3.4F);
        this.hip.addChild(tail1);
        this.setRotateAngle(tail1, -0.3927F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 6, -0.75F, -0.25F, -0.5F, 1, 1, 5, 0.0F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 6, -0.25F, -0.25F, -0.5F, 1, 1, 5, 0.0F, true));
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 0, -0.75F, -0.75F, -0.5F, 1, 1, 5, -0.01F, false));
        this.tail1.cubeList.add(new ModelBox(tail1, 19, 0, -0.25F, -0.75F, -0.5F, 1, 1, 5, -0.01F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.3054F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 10, 11, -0.5F, -0.5F, -0.5F, 1, 1, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 6.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 11, -0.5F, -0.5F, -0.5F, 1, 1, 8, -0.01F, false));

        this.legright1 = new AdvancedModelRenderer(this);
        this.legright1.setRotationPoint(-1.25F, 0.0F, 2.25F);
        this.hip.addChild(legright1);
        this.setRotateAngle(legright1, 0.0349F, 1.0036F, 0.0F);
        this.legright1.cubeList.add(new ModelBox(legright1, 0, 4, -0.75F, -0.5F, -2.1F, 1, 1, 3, 0.01F, false));
        this.legright1.cubeList.add(new ModelBox(legright1, 0, 0, -0.25F, -0.5F, -2.1F, 1, 1, 3, 0.0F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.legright1.addChild(legright2);
        this.setRotateAngle(legright2, -0.192F, -0.3491F, 0.0F);
        this.legright2.cubeList.add(new ModelBox(legright2, 20, 24, -0.75F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 16, 5, -0.35F, 0.0F, -0.5F, 1, 2, 1, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.1745F, 0.0F, 0.0175F);
        this.legright3.cubeList.add(new ModelBox(legright3, 12, 0, -2.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, false));

        this.legleft1 = new AdvancedModelRenderer(this);
        this.legleft1.setRotationPoint(1.25F, 0.0F, 2.25F);
        this.hip.addChild(legleft1);
        this.setRotateAngle(legleft1, 0.0349F, -1.0036F, 0.0F);
        this.legleft1.cubeList.add(new ModelBox(legleft1, 0, 4, -0.25F, -0.5F, -2.1F, 1, 1, 3, 0.01F, true));
        this.legleft1.cubeList.add(new ModelBox(legleft1, 0, 0, -0.75F, -0.5F, -2.1F, 1, 1, 3, 0.0F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.legleft1.addChild(legleft2);
        this.setRotateAngle(legleft2, -0.192F, 0.3491F, 0.0F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 20, 24, -0.25F, 0.0F, -0.5F, 1, 2, 1, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 16, 5, -0.65F, 0.0F, -0.5F, 1, 2, 1, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(0.0F, 2.0F, -0.5F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.1745F, 0.0F, -0.0175F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 12, 0, -2.0F, 0.0F, -3.5F, 4, 0, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticFloor(float f) {

        this.hip.offsetY = 0.17F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {

        this.hip.offsetY = 0.17F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -1.6F;
        this.hip.offsetX = -0.0F;
        this.hip.rotateAngleY = (float)Math.toRadians(210);
        this.hip.rotateAngleX = (float)Math.toRadians(18);
        this.hip.rotateAngleZ = (float)Math.toRadians(-8);
        this.hip.scaleChildren = true;
        float scaler = 2.63F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraHylonomus entitySilesaurus = (EntityPrehistoricFloraHylonomus) e;


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
        EntityPrehistoricFloraHylonomus ee = (EntityPrehistoricFloraHylonomus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHylonomus entity = (EntityPrehistoricFloraHylonomus) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*9), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*3));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-58))*0.1);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.15);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*-9), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.125);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*8), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-4), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 81.27922 + (((tickAnim - 0) / 5) * (104.34842-(81.27922)));
            yy = -46.29033 + (((tickAnim - 0) / 5) * (-54.19459-(-46.29033)));
            zz = 72.4956 + (((tickAnim - 0) / 5) * (103.79406-(72.4956)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 104.34842 + (((tickAnim - 5) / 5) * (107.14364-(104.34842)));
            yy = -54.19459 + (((tickAnim - 5) / 5) * (-43.4839-(-54.19459)));
            zz = 103.79406 + (((tickAnim - 5) / 5) * (159.17755-(103.79406)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 107.14364 + (((tickAnim - 10) / 3) * (112.0996-(107.14364)));
            yy = -43.4839 + (((tickAnim - 10) / 3) * (-26.9638-(-43.4839)));
            zz = 159.17755 + (((tickAnim - 10) / 3) * (153.6217-(159.17755)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 112.0996 + (((tickAnim - 13) / 12) * (81.27922-(112.0996)));
            yy = -26.9638 + (((tickAnim - 13) / 12) * (-46.29033-(-26.9638)));
            zz = 153.6217 + (((tickAnim - 13) / 12) * (72.4956-(153.6217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 82.25 + (((tickAnim - 0) / 5) * (124.26849-(82.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.85321-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.38316-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 124.26849 + (((tickAnim - 5) / 8) * (36.78698-(124.26849)));
            yy = 0.85321 + (((tickAnim - 5) / 8) * (1.70642-(0.85321)));
            zz = -1.38316 + (((tickAnim - 5) / 8) * (-2.76633-(-1.38316)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 36.78698 + (((tickAnim - 13) / 5) * (19.42175-(36.78698)));
            yy = 1.70642 + (((tickAnim - 13) / 5) * (-4.38811-(1.70642)));
            zz = -2.76633 + (((tickAnim - 13) / 5) * (-47.29061-(-2.76633)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 19.42175 + (((tickAnim - 18) / 7) * (82.25-(19.42175)));
            yy = -4.38811 + (((tickAnim - 18) / 7) * (0-(-4.38811)));
            zz = -47.29061 + (((tickAnim - 18) / 7) * (0-(-47.29061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+100))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+120))*10), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 4.75 + (((tickAnim - 0) / 11) * (140.76878-(4.75)));
            yy = -25 + (((tickAnim - 0) / 11) * (-18.0429-(-25)));
            zz = 0 + (((tickAnim - 0) / 11) * (135.6563-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 140.76878 + (((tickAnim - 11) / 6) * (91.225-(140.76878)));
            yy = -18.0429 + (((tickAnim - 11) / 6) * (-21.84033-(-18.0429)));
            zz = 135.6563 + (((tickAnim - 11) / 6) * (114.39446-(135.6563)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 91.225 + (((tickAnim - 17) / 8) * (4.75-(91.225)));
            yy = -21.84033 + (((tickAnim - 17) / 8) * (-25-(-21.84033)));
            zz = 114.39446 + (((tickAnim - 17) / 8) * (0-(114.39446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(xx), legright1.rotateAngleY + (float) Math.toRadians(yy), legright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -24.25 + (((tickAnim - 0) / 11) * (-2.69259-(-24.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (7.8605-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (28.5315-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = -2.69259 + (((tickAnim - 11) / 6) * (-47.35534-(-2.69259)));
            yy = 7.8605 + (((tickAnim - 11) / 6) * (3.69906-(7.8605)));
            zz = 28.5315 + (((tickAnim - 11) / 6) * (13.42659-(28.5315)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -47.35534 + (((tickAnim - 17) / 8) * (-24.25-(-47.35534)));
            yy = 3.69906 + (((tickAnim - 17) / 8) * (0-(3.69906)));
            zz = 13.42659 + (((tickAnim - 17) / 8) * (0-(13.42659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.75 + (((tickAnim - 0) / 5) * (-23.65791-(16.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.40552-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-51.49094-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -23.65791 + (((tickAnim - 5) / 6) * (39.5-(-23.65791)));
            yy = -7.40552 + (((tickAnim - 5) / 6) * (0-(-7.40552)));
            zz = -51.49094 + (((tickAnim - 5) / 6) * (0-(-51.49094)));
        }
        else if (tickAnim >= 11 && tickAnim < 17) {
            xx = 39.5 + (((tickAnim - 11) / 6) * (78.96-(39.5)));
            yy = 0 + (((tickAnim - 11) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 6) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 78.96 + (((tickAnim - 17) / 5) * (-5.5339-(78.96)));
            yy = 0 + (((tickAnim - 17) / 5) * (1.98591-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (-33.45167-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -5.5339 + (((tickAnim - 22) / 3) * (16.75-(-5.5339)));
            yy = 1.98591 + (((tickAnim - 22) / 3) * (0-(1.98591)));
            zz = -33.45167 + (((tickAnim - 22) / 3) * (0-(-33.45167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.32-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.32 + (((tickAnim - 1) / 1) * (0.585-(0.32)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.585 + (((tickAnim - 2) / 1) * (0.775-(0.585)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 0.775 + (((tickAnim - 3) / 0) * (0.655-(0.775)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.655 + (((tickAnim - 3) / 1) * (0.575-(0.655)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 4) / 1) * (0.3-(0.575)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 5) / 18) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 18) * (0.33-(0.3)));
            zz = 0 + (((tickAnim - 5) / 18) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0.33 + (((tickAnim - 23) / 2) * (0-(0.33)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
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
            xx = 140.76878 + (((tickAnim - 0) / 5) * (82.38435-(140.76878)));
            yy = 18.04294 + (((tickAnim - 0) / 5) * (20.35451-(18.04294)));
            zz = -135.65626 + (((tickAnim - 0) / 5) * (-97.72114-(-135.65626)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 82.38435 + (((tickAnim - 5) / 6) * (4.75-(82.38435)));
            yy = 20.35451 + (((tickAnim - 5) / 6) * (25-(20.35451)));
            zz = -97.72114 + (((tickAnim - 5) / 6) * (0-(-97.72114)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = 4.75 + (((tickAnim - 11) / 14) * (140.76878-(4.75)));
            yy = 25 + (((tickAnim - 11) / 14) * (18.04294-(25)));
            zz = 0 + (((tickAnim - 11) / 14) * (-135.65626-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.69259 + (((tickAnim - 0) / 5) * (-51.14217-(-2.69259)));
            yy = -7.86045 + (((tickAnim - 0) / 5) * (-4.23255-(-7.86045)));
            zz = -28.53148 + (((tickAnim - 0) / 5) * (-15.3631-(-28.53148)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -51.14217 + (((tickAnim - 5) / 3) * (-53.29892-(-51.14217)));
            yy = -4.23255 + (((tickAnim - 5) / 3) * (-3.21547-(-4.23255)));
            zz = -15.3631 + (((tickAnim - 5) / 3) * (-11.67136-(-15.3631)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -53.29892 + (((tickAnim - 8) / 3) * (-24.25-(-53.29892)));
            yy = -3.21547 + (((tickAnim - 8) / 3) * (0-(-3.21547)));
            zz = -11.67136 + (((tickAnim - 8) / 3) * (0-(-11.67136)));
        }
        else if (tickAnim >= 11 && tickAnim < 25) {
            xx = -24.25 + (((tickAnim - 11) / 14) * (-2.69259-(-24.25)));
            yy = 0 + (((tickAnim - 11) / 14) * (-7.86045-(0)));
            zz = 0 + (((tickAnim - 11) / 14) * (-28.53148-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 39.5 + (((tickAnim - 0) / 5) * (75-(39.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 75 + (((tickAnim - 5) / 3) * (19.8053-(75)));
            yy = 0 + (((tickAnim - 5) / 3) * (-25.12108-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (28.1998-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 19.8053 + (((tickAnim - 8) / 2) * (17.9395-(19.8053)));
            yy = -25.12108 + (((tickAnim - 8) / 2) * (-6.64853-(-25.12108)));
            zz = 28.1998 + (((tickAnim - 8) / 2) * (6.24754-(28.1998)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 17.9395 + (((tickAnim - 10) / 1) * (16.72248-(17.9395)));
            yy = -6.64853 + (((tickAnim - 10) / 1) * (1.30124-(-6.64853)));
            zz = 6.24754 + (((tickAnim - 10) / 1) * (-2.42287-(6.24754)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 16.72248 + (((tickAnim - 11) / 3) * (-9.75805-(16.72248)));
            yy = 1.30124 + (((tickAnim - 11) / 3) * (-0.1677-(1.30124)));
            zz = -2.42287 + (((tickAnim - 11) / 3) * (24.99745-(-2.42287)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -9.75805 + (((tickAnim - 14) / 4) * (6.62594-(-9.75805)));
            yy = -0.1677 + (((tickAnim - 14) / 4) * (-20.88166-(-0.1677)));
            zz = 24.99745 + (((tickAnim - 14) / 4) * (10.68597-(24.99745)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 6.62594 + (((tickAnim - 18) / 7) * (39.5-(6.62594)));
            yy = -20.88166 + (((tickAnim - 18) / 7) * (0-(-20.88166)));
            zz = 10.68597 + (((tickAnim - 18) / 7) * (0-(10.68597)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.425-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 1) * (0.55-(0.425)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0.02-(0)));
            yy = 0.55 + (((tickAnim - 14) / 1) * (0.88-(0.55)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0.02 + (((tickAnim - 15) / 3) * (0.1-(0.02)));
            yy = 0.88 + (((tickAnim - 15) / 3) * (0.675-(0.88)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0.1 + (((tickAnim - 18) / 7) * (0-(0.1)));
            yy = 0.675 + (((tickAnim - 18) / 7) * (0-(0.675)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 3.20645 + (((tickAnim - 0) / 5) * (38.125-(3.20645)));
            yy = 35.45492 + (((tickAnim - 0) / 5) * (-14.625-(35.45492)));
            zz = -0.28465 + (((tickAnim - 0) / 5) * (0-(-0.28465)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 38.125 + (((tickAnim - 5) / 8) * (23.01514-(38.125)));
            yy = -14.625 + (((tickAnim - 5) / 8) * (-60.44541-(-14.625)));
            zz = 0 + (((tickAnim - 5) / 8) * (-26.02739-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 23.01514 + (((tickAnim - 13) / 12) * (3.20645-(23.01514)));
            yy = -60.44541 + (((tickAnim - 13) / 12) * (35.45492-(-60.44541)));
            zz = -26.02739 + (((tickAnim - 13) / 12) * (-0.28465-(-26.02739)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1w, armright1w.rotateAngleX + (float) Math.toRadians(xx), armright1w.rotateAngleY + (float) Math.toRadians(yy), armright1w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.57513 + (((tickAnim - 0) / 6) * (11.20811-(12.57513)));
            yy = 60.67239 + (((tickAnim - 0) / 6) * (18.27547-(60.67239)));
            zz = 23.51147 + (((tickAnim - 0) / 6) * (4.60512-(23.51147)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 11.20811 + (((tickAnim - 6) / 7) * (14.75-(11.20811)));
            yy = 18.27547 + (((tickAnim - 6) / 7) * (-33.75-(18.27547)));
            zz = 4.60512 + (((tickAnim - 6) / 7) * (0-(4.60512)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 14.75 + (((tickAnim - 13) / 5) * (28.38333-(14.75)));
            yy = -33.75 + (((tickAnim - 13) / 5) * (12.38333-(-33.75)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 28.38333 + (((tickAnim - 18) / 7) * (12.57513-(28.38333)));
            yy = 12.38333 + (((tickAnim - 18) / 7) * (60.67239-(12.38333)));
            zz = 0 + (((tickAnim - 18) / 7) * (23.51147-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1w, armleft1w.rotateAngleX + (float) Math.toRadians(xx), armleft1w.rotateAngleY + (float) Math.toRadians(yy), armleft1w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 112.0996 + (((tickAnim - 0) / 13) * (81.27922-(112.0996)));
            yy = 26.96384 + (((tickAnim - 0) / 13) * (46.2903-(26.96384)));
            zz = -153.62166 + (((tickAnim - 0) / 13) * (-72.4956-(-153.62166)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 81.27922 + (((tickAnim - 13) / 5) * (88.34214-(81.27922)));
            yy = 46.2903 + (((tickAnim - 13) / 5) * (48.94826-(46.2903)));
            zz = -72.4956 + (((tickAnim - 13) / 5) * (-95.77756-(-72.4956)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 88.34214 + (((tickAnim - 18) / 2) * (91.06968-(88.34214)));
            yy = 48.94826 + (((tickAnim - 18) / 2) * (59.13969-(48.94826)));
            zz = -95.77756 + (((tickAnim - 18) / 2) * (-120.56995-(-95.77756)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 91.06968 + (((tickAnim - 20) / 3) * (95.53731-(91.06968)));
            yy = 59.13969 + (((tickAnim - 20) / 3) * (44.64841-(59.13969)));
            zz = -120.56995 + (((tickAnim - 20) / 3) * (-149.70434-(-120.56995)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 95.53731 + (((tickAnim - 23) / 2) * (112.0996-(95.53731)));
            yy = 44.64841 + (((tickAnim - 23) / 2) * (26.96384-(44.64841)));
            zz = -149.70434 + (((tickAnim - 23) / 2) * (-153.62166-(-149.70434)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 36.78698 + (((tickAnim - 0) / 13) * (82.25-(36.78698)));
            yy = 1.70642 + (((tickAnim - 0) / 13) * (0-(1.70642)));
            zz = -2.76633 + (((tickAnim - 0) / 13) * (0-(-2.76633)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 82.25 + (((tickAnim - 13) / 5) * (121.25305-(82.25)));
            yy = 0 + (((tickAnim - 13) / 5) * (0.91009-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (-1.47537-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 121.25305 + (((tickAnim - 18) / 2) * (111.3477-(121.25305)));
            yy = 0.91009 + (((tickAnim - 18) / 2) * (1.17553-(0.91009)));
            zz = -1.47537 + (((tickAnim - 18) / 2) * (-1.90569-(-1.47537)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 111.3477 + (((tickAnim - 20) / 3) * (52.06734-(111.3477)));
            yy = 1.17553 + (((tickAnim - 20) / 3) * (1.44098-(1.17553)));
            zz = -1.90569 + (((tickAnim - 20) / 3) * (-2.33601-(-1.90569)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 52.06734 + (((tickAnim - 23) / 2) * (36.78698-(52.06734)));
            yy = 1.44098 + (((tickAnim - 23) / 2) * (1.70642-(1.44098)));
            zz = -2.33601 + (((tickAnim - 23) / 2) * (-2.76633-(-2.33601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*-4), neck.rotateAngleZ + (float) Math.toRadians(0));
        
    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHylonomus entity = (EntityPrehistoricFloraHylonomus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*20), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-50))*3));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*1);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5-58))*0.3);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/0.5))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-100))*-20), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*20), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0.15);


        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*18), body3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*-18), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-20))), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 81.27922 + (((tickAnim - 0) / 2) * (104.34842-(81.27922)));
            yy = -46.29033 + (((tickAnim - 0) / 2) * (-54.19459-(-46.29033)));
            zz = 72.4956 + (((tickAnim - 0) / 2) * (103.79406-(72.4956)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 104.34842 + (((tickAnim - 2) / 2) * (107.14364-(104.34842)));
            yy = -54.19459 + (((tickAnim - 2) / 2) * (-43.4839-(-54.19459)));
            zz = 103.79406 + (((tickAnim - 2) / 2) * (159.17755-(103.79406)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 107.14364 + (((tickAnim - 4) / 1) * (112.0996-(107.14364)));
            yy = -43.4839 + (((tickAnim - 4) / 1) * (-26.9638-(-43.4839)));
            zz = 159.17755 + (((tickAnim - 4) / 1) * (153.6217-(159.17755)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 112.0996 + (((tickAnim - 5) / 5) * (81.27922-(112.0996)));
            yy = -26.9638 + (((tickAnim - 5) / 5) * (-46.29033-(-26.9638)));
            zz = 153.6217 + (((tickAnim - 5) / 5) * (72.4956-(153.6217)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 82.25 + (((tickAnim - 0) / 2) * (124.26849-(82.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.85321-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-1.38316-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 124.26849 + (((tickAnim - 2) / 1) * (42.66033-(124.26849)));
            yy = 0.85321 + (((tickAnim - 2) / 1) * (32.76724-(0.85321)));
            zz = -1.38316 + (((tickAnim - 2) / 1) * (-25.33966-(-1.38316)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 42.66033 + (((tickAnim - 3) / 1) * (35.1024-(42.66033)));
            yy = 32.76724 + (((tickAnim - 3) / 1) * (19.13163-(32.76724)));
            zz = -25.33966 + (((tickAnim - 3) / 1) * (-14.58895-(-25.33966)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 35.1024 + (((tickAnim - 4) / 1) * (36.78698-(35.1024)));
            yy = 19.13163 + (((tickAnim - 4) / 1) * (1.70642-(19.13163)));
            zz = -14.58895 + (((tickAnim - 4) / 1) * (-2.76633-(-14.58895)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 36.78698 + (((tickAnim - 5) / 5) * (82.25-(36.78698)));
            yy = 1.70642 + (((tickAnim - 5) / 5) * (0-(1.70642)));
            zz = -2.76633 + (((tickAnim - 5) / 5) * (0-(-2.76633)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-20), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*20), tail3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.25 + (((tickAnim - 0) / 4) * (140.76878-(0.25)));
            yy = -25 + (((tickAnim - 0) / 4) * (-18.0429-(-25)));
            zz = 0 + (((tickAnim - 0) / 4) * (135.6563-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 140.76878 + (((tickAnim - 4) / 3) * (91.225-(140.76878)));
            yy = -18.0429 + (((tickAnim - 4) / 3) * (-21.84033-(-18.0429)));
            zz = 135.6563 + (((tickAnim - 4) / 3) * (114.39446-(135.6563)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 91.225 + (((tickAnim - 7) / 3) * (0.25-(91.225)));
            yy = -21.84033 + (((tickAnim - 7) / 3) * (-25-(-21.84033)));
            zz = 114.39446 + (((tickAnim - 7) / 3) * (0-(114.39446)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright1, legright1.rotateAngleX + (float) Math.toRadians(xx), legright1.rotateAngleY + (float) Math.toRadians(yy), legright1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -24.25 + (((tickAnim - 0) / 4) * (-2.69259-(-24.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (7.8605-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (28.5315-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -2.69259 + (((tickAnim - 4) / 3) * (-47.35534-(-2.69259)));
            yy = 7.8605 + (((tickAnim - 4) / 3) * (3.69906-(7.8605)));
            zz = 28.5315 + (((tickAnim - 4) / 3) * (13.42659-(28.5315)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -47.35534 + (((tickAnim - 7) / 3) * (-24.25-(-47.35534)));
            yy = 3.69906 + (((tickAnim - 7) / 3) * (0-(3.69906)));
            zz = 13.42659 + (((tickAnim - 7) / 3) * (0-(13.42659)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 16.75 + (((tickAnim - 0) / 2) * (-23.65791-(16.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (-7.40552-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-51.49094-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -23.65791 + (((tickAnim - 2) / 2) * (39.5-(-23.65791)));
            yy = -7.40552 + (((tickAnim - 2) / 2) * (0-(-7.40552)));
            zz = -51.49094 + (((tickAnim - 2) / 2) * (0-(-51.49094)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 39.5 + (((tickAnim - 4) / 3) * (78.96-(39.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 78.96 + (((tickAnim - 7) / 1) * (-5.5339-(78.96)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.98591-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-33.45167-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5.5339 + (((tickAnim - 8) / 2) * (16.75-(-5.5339)));
            yy = 1.98591 + (((tickAnim - 8) / 2) * (0-(1.98591)));
            zz = -33.45167 + (((tickAnim - 8) / 2) * (0-(-33.45167)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 1) / 1) * (0.575-(0.65)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 2) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 7) * (0.33-(0.575)));
            zz = 0 + (((tickAnim - 2) / 7) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 9) / 1) * (0-(0.33)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 138.10375 + (((tickAnim - 0) / 2) * (82.38435-(138.10375)));
            yy = 29.23086 + (((tickAnim - 0) / 2) * (20.35451-(29.23086)));
            zz = -136.70283 + (((tickAnim - 0) / 2) * (-97.72114-(-136.70283)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 82.38435 + (((tickAnim - 2) / 2) * (-0.75-(82.38435)));
            yy = 20.35451 + (((tickAnim - 2) / 2) * (25-(20.35451)));
            zz = -97.72114 + (((tickAnim - 2) / 2) * (0-(-97.72114)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -0.75 + (((tickAnim - 4) / 6) * (138.10375-(-0.75)));
            yy = 25 + (((tickAnim - 4) / 6) * (29.23086-(25)));
            zz = 0 + (((tickAnim - 4) / 6) * (-136.70283-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft1, legleft1.rotateAngleX + (float) Math.toRadians(xx), legleft1.rotateAngleY + (float) Math.toRadians(yy), legleft1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -2.69259 + (((tickAnim - 0) / 2) * (-51.14217-(-2.69259)));
            yy = -7.86045 + (((tickAnim - 0) / 2) * (-4.23255-(-7.86045)));
            zz = -28.53148 + (((tickAnim - 0) / 2) * (-15.3631-(-28.53148)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -51.14217 + (((tickAnim - 2) / 1) * (-53.29892-(-51.14217)));
            yy = -4.23255 + (((tickAnim - 2) / 1) * (-3.21547-(-4.23255)));
            zz = -15.3631 + (((tickAnim - 2) / 1) * (-11.67136-(-15.3631)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -53.29892 + (((tickAnim - 3) / 1) * (-24.25-(-53.29892)));
            yy = -3.21547 + (((tickAnim - 3) / 1) * (0-(-3.21547)));
            zz = -11.67136 + (((tickAnim - 3) / 1) * (0-(-11.67136)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -24.25 + (((tickAnim - 4) / 6) * (-2.69259-(-24.25)));
            yy = 0 + (((tickAnim - 4) / 6) * (-7.86045-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (-28.53148-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 39.5 + (((tickAnim - 0) / 2) * (75-(39.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 75 + (((tickAnim - 2) / 1) * (19.8053-(75)));
            yy = 0 + (((tickAnim - 2) / 1) * (-25.12108-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (28.1998-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 19.8053 + (((tickAnim - 3) / 1) * (16.72248-(19.8053)));
            yy = -25.12108 + (((tickAnim - 3) / 1) * (1.30124-(-25.12108)));
            zz = 28.1998 + (((tickAnim - 3) / 1) * (-2.42287-(28.1998)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 16.72248 + (((tickAnim - 4) / 2) * (-9.75805-(16.72248)));
            yy = 1.30124 + (((tickAnim - 4) / 2) * (-0.1677-(1.30124)));
            zz = -2.42287 + (((tickAnim - 4) / 2) * (24.99745-(-2.42287)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -9.75805 + (((tickAnim - 6) / 1) * (6.62594-(-9.75805)));
            yy = -0.1677 + (((tickAnim - 6) / 1) * (-20.88166-(-0.1677)));
            zz = 24.99745 + (((tickAnim - 6) / 1) * (10.68597-(24.99745)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 6.62594 + (((tickAnim - 7) / 3) * (39.5-(6.62594)));
            yy = -20.88166 + (((tickAnim - 7) / 3) * (0-(-20.88166)));
            zz = 10.68597 + (((tickAnim - 7) / 3) * (0-(10.68597)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0.425-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 1) * (0.55-(0.425)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0.1-(0)));
            yy = 0.55 + (((tickAnim - 6) / 1) * (0.675-(0.55)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.1 + (((tickAnim - 7) / 3) * (0-(0.1)));
            yy = 0.675 + (((tickAnim - 7) / 3) * (0-(0.675)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 112.0996 + (((tickAnim - 0) / 5) * (81.27922-(112.0996)));
            yy = 26.96384 + (((tickAnim - 0) / 5) * (46.2903-(26.96384)));
            zz = -153.62166 + (((tickAnim - 0) / 5) * (-72.4956-(-153.62166)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 81.27922 + (((tickAnim - 5) / 2) * (88.34214-(81.27922)));
            yy = 46.2903 + (((tickAnim - 5) / 2) * (48.94826-(46.2903)));
            zz = -72.4956 + (((tickAnim - 5) / 2) * (-95.77756-(-72.4956)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 88.34214 + (((tickAnim - 7) / 1) * (91.06968-(88.34214)));
            yy = 48.94826 + (((tickAnim - 7) / 1) * (59.13969-(48.94826)));
            zz = -95.77756 + (((tickAnim - 7) / 1) * (-120.56995-(-95.77756)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 91.06968 + (((tickAnim - 8) / 1) * (95.53731-(91.06968)));
            yy = 59.13969 + (((tickAnim - 8) / 1) * (44.64841-(59.13969)));
            zz = -120.56995 + (((tickAnim - 8) / 1) * (-149.70434-(-120.56995)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 95.53731 + (((tickAnim - 9) / 1) * (112.0996-(95.53731)));
            yy = 44.64841 + (((tickAnim - 9) / 1) * (26.96384-(44.64841)));
            zz = -149.70434 + (((tickAnim - 9) / 1) * (-153.62166-(-149.70434)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 36.78698 + (((tickAnim - 0) / 1) * (25.54402-(36.78698)));
            yy = 1.70642 + (((tickAnim - 0) / 1) * (-10.24497-(1.70642)));
            zz = -2.76633 + (((tickAnim - 0) / 1) * (12.48135-(-2.76633)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 25.54402 + (((tickAnim - 1) / 4) * (82.25-(25.54402)));
            yy = -10.24497 + (((tickAnim - 1) / 4) * (0-(-10.24497)));
            zz = 12.48135 + (((tickAnim - 1) / 4) * (0-(12.48135)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 82.25 + (((tickAnim - 5) / 2) * (121.25305-(82.25)));
            yy = 0 + (((tickAnim - 5) / 2) * (0.91009-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-1.47537-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 121.25305 + (((tickAnim - 7) / 1) * (111.3477-(121.25305)));
            yy = 0.91009 + (((tickAnim - 7) / 1) * (1.17553-(0.91009)));
            zz = -1.47537 + (((tickAnim - 7) / 1) * (-1.90569-(-1.47537)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 111.3477 + (((tickAnim - 8) / 1) * (52.06734-(111.3477)));
            yy = 1.17553 + (((tickAnim - 8) / 1) * (1.44098-(1.17553)));
            zz = -1.90569 + (((tickAnim - 8) / 1) * (-2.33601-(-1.90569)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 52.06734 + (((tickAnim - 9) / 1) * (36.78698-(52.06734)));
            yy = 1.44098 + (((tickAnim - 9) / 1) * (1.70642-(1.44098)));
            zz = -2.33601 + (((tickAnim - 9) / 1) * (-2.76633-(-2.33601)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 6.19346 + (((tickAnim - 0) / 2) * (38.125-(6.19346)));
            yy = 25.16554 + (((tickAnim - 0) / 2) * (-14.625-(25.16554)));
            zz = 4.27678 + (((tickAnim - 0) / 2) * (0-(4.27678)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 38.125 + (((tickAnim - 2) / 3) * (56.97192-(38.125)));
            yy = -14.625 + (((tickAnim - 2) / 3) * (-79.88175-(-14.625)));
            zz = 0 + (((tickAnim - 2) / 3) * (-59.89256-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 56.97192 + (((tickAnim - 5) / 3) * (21.81873-(56.97192)));
            yy = -79.88175 + (((tickAnim - 5) / 3) * (-35.4141-(-79.88175)));
            zz = -59.89256 + (((tickAnim - 5) / 3) * (-9.22553-(-59.89256)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 21.81873 + (((tickAnim - 8) / 2) * (6.19346-(21.81873)));
            yy = -35.4141 + (((tickAnim - 8) / 2) * (25.16554-(-35.4141)));
            zz = -9.22553 + (((tickAnim - 8) / 2) * (4.27678-(-9.22553)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright1w, armright1w.rotateAngleX + (float) Math.toRadians(xx), armright1w.rotateAngleY + (float) Math.toRadians(yy), armright1w.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 47.26799 + (((tickAnim - 0) / 3) * (31.17412-(47.26799)));
            yy = 81.20063 + (((tickAnim - 0) / 3) * (25.04761-(81.20063)));
            zz = 55.58495 + (((tickAnim - 0) / 3) * (11.80856-(55.58495)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 31.17412 + (((tickAnim - 3) / 2) * (25.14907-(31.17412)));
            yy = 25.04761 + (((tickAnim - 3) / 2) * (-48.95375-(25.04761)));
            zz = 11.80856 + (((tickAnim - 3) / 2) * (-3.54612-(11.80856)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 25.14907 + (((tickAnim - 5) / 2) * (28.38333-(25.14907)));
            yy = -48.95375 + (((tickAnim - 5) / 2) * (12.38333-(-48.95375)));
            zz = -3.54612 + (((tickAnim - 5) / 2) * (0-(-3.54612)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 28.38333 + (((tickAnim - 7) / 3) * (47.26799-(28.38333)));
            yy = 12.38333 + (((tickAnim - 7) / 3) * (81.20063-(12.38333)));
            zz = 0 + (((tickAnim - 7) / 3) * (55.58495-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft1w, armleft1w.rotateAngleX + (float) Math.toRadians(xx), armleft1w.rotateAngleY + (float) Math.toRadians(yy), armleft1w.rotateAngleZ + (float) Math.toRadians(zz));
        

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHylonomus entity = (EntityPrehistoricFloraHylonomus) entitylivingbaseIn;
        int animCycle = 7;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.75-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -11.5 + (((tickAnim - 3) / 5) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -3.75 + (((tickAnim - 3) / 5) * (0-(-3.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (27.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.25 + (((tickAnim - 3) / 2) * (0-(27.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHylonomus entity = (EntityPrehistoricFloraHylonomus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
     if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 4) / 4) * (-11-(11.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -11 + (((tickAnim - 8) / 3) * (-7.25-(-11)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -7.25 + (((tickAnim - 11) / 2) * (-11.85-(-7.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -11.85 + (((tickAnim - 13) / 2) * (0-(-11.85)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 27.5 + (((tickAnim - 4) / 3) * (0-(27.5)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (33.25-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 33.25 + (((tickAnim - 11) / 2) * (0-(33.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHylonomus e = (EntityPrehistoricFloraHylonomus) entity;
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
